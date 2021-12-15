import okhttp3.*;

import java.io.IOException;

/**  Задания:
 1.С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге на период времени,
 пересекающийся со следующим занятием (например, выборка погода на следующие 5 дней - подойдет)

 2.Подобрать источник самостоятельно.
 Можно использовать api accuweather, порядок следующий: зарегистрироваться,
 зарегистрировать тестовое приложение для получения api ключа, найдите нужный endpoint и изучите документацию.
 Бесплатный тарифный план предполагает получение погоды не более чем на 5 дней вперед
 (этого достаточно для выполнения д/з).
 */


public class Weather {

    public static final String HOST = "dataservice.accuweather.com";
    public static final String FORECAST_URL = "forecasts";
    public static final String DAILY_URL = "daily";
    public static final String FIVE_DAYS_URL = "5day";
    public static final String API_VERSION = "V1";
    public static final String CITY_ID = "295212";
    public static final String API_KEY = "bISdX4VlvYXioMxSlivywiajXe3qLTms";
    public static final String LANGUAGE = "ru-ru";
    public static final String METRIC = "true";

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(FORECAST_URL)
                .addPathSegment(API_VERSION)
                .addPathSegment(DAILY_URL)
                .addPathSegment(FIVE_DAYS_URL)
                .addPathSegment(CITY_ID)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", LANGUAGE)
                .addQueryParameter("metric", METRIC)
                .build();


        System.out.println(url.toString());

        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);
    }
}