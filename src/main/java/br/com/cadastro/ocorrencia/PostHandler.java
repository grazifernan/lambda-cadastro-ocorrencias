package br.com.cadastro.ocorrencia;

import br.com.cadastro.ocorrencia.domain.Canal;
import br.com.cadastro.ocorrencia.domain.Cliente;
import br.com.cadastro.ocorrencia.domain.Ocorrencia;
import br.com.cadastro.ocorrencia.dto.OcorrenciaDTONovo;
import br.com.cadastro.ocorrencia.repository.ClienteRepository;
import br.com.cadastro.ocorrencia.repository.OcorrenciaRepository;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.management.Notification;
import java.io.IOException;

@CrossOrigin
@Component
public class PostHandler implements RequestHandler<Object, Object> {

    @Autowired
    private OcorrenciaRepository ocorrenciaRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    //private Cliente cliente;

    //private Canal canal;

    //private Ocorrencia ocorrencia;

    private Object input;

    private Context context;

    @Override
    public Object handleRequest(Object input, Context context) {
        final String[] args = new String[0];
        try (ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(OcorrenciaApplication.class, args)) {
            PostHandler app = configurableApplicationContext.getBean(PostHandler.class);
            context.getLogger().log("Passou aqui 1");
            app.input = input;
            app.context = context;
            context.getLogger().log("Passou aqui 2");
            app.run(args);
            return "Cadastro Realizado com sucesso";
        } catch (Exception ex) {
            context.getLogger().log("Error " + ex.getMessage());
            return "Error happened while creating the notification";
        }
    }

    private void run(String... strings) throws IOException {

        context.getLogger().log("Passou aqui 3");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, true);

        Gson gson = new Gson();
        final String inputJson = gson.toJson(input);

        context.getLogger().log("Passou aqui 4");
        context.getLogger().log(inputJson);

        OcorrenciaDTONovo ocorrenciaDTONovo = objectMapper.readValue(inputJson, OcorrenciaDTONovo.class);

        context.getLogger().log("Passou aqui 5");
        context.getLogger().log("codigo cliente: " + ocorrenciaDTONovo.getIdCognito());

        Cliente cliente = new Cliente();
        cliente = clienteRepository.findByidCognito(ocorrenciaDTONovo.getIdCognito());
        //cliente.setIdCognito(ocorrenciaDTONovo.getIdCognito());

        context.getLogger().log("Nome encontrado: " + cliente.getNomeCliente());

        context.getLogger().log("Passou aqui 6");

        Canal canal = new Canal();
        canal.setCodCanal(ocorrenciaDTONovo.getCodCanal());

        context.getLogger().log("Passou aqui 7");

        Ocorrencia ocorrencia = new Ocorrencia();

        context.getLogger().log("Passou aqui 8");

        ocorrencia.setCliente(cliente);
        ocorrencia.setCanal(canal);
        ocorrencia.setTitulo(ocorrenciaDTONovo.getTitulo());
        ocorrencia.setImagem(ocorrenciaDTONovo.getImagem());
        ocorrencia.setTipoOcorrencia(ocorrenciaDTONovo.getTipoOcorrencia());
        ocorrencia.setSituacao(ocorrenciaDTONovo.getSituacao());
        ocorrencia.setDescricao(ocorrenciaDTONovo.getDescricao());
        ocorrencia.setDataOcorrencia(ocorrenciaDTONovo.getDataOcorrencia());

        context.getLogger().log("Passou aqui 9");

        ocorrenciaRepository.save(ocorrencia);

        context.getLogger().log("Passou aqui 10");


    }


}
