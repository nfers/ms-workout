package io.github.nfers.ms_workout.domain.model

import java.time.Duration;

import lombok.Getter;

@Data
public record VideoTutorial() {

    String url;
    String thumbnailUrl;
    Duration duration;
}
