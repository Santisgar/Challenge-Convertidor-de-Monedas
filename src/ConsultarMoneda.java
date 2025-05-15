import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public String buscaMoneda (String monedaBase, String monedaObjetivo, double cantidad){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5218c5b28a23cd05b9b2466b/pair/" +
                monedaBase + "/" + monedaObjetivo + "/" + cantidad);
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            var json = response.body();
            JsonElement jsonElement = JsonParser.parseString(json);
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            return jsonObject.get("conversion_result").getAsString();
        } catch (NumberFormatException | IOException | InterruptedException e) {
            System.out.println("Ocurrió un error: ");
            throw new RuntimeException("Ocurrió un error");
        }
    }

}
