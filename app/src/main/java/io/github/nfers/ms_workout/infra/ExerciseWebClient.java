package io.github.nfers.ms_workout.infra;

public class ExerciseWebClient {


    @Bean
    WebClient exerciseCatalogClient() {
        return WebClient.builder()
            .baseUrl("https://api.exercisedb.com/v1")
            .defaultHeader("API-Key", env.getProperty("EXERCISE_API_KEY"))
            .build();
    }
}
