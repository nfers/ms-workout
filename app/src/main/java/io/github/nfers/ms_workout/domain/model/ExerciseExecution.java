package io.github.nfers.ms_workout.domain.model

import java.time.Duration;
import java.util.List;

import lombok.Data;

@Data
public class ExerciseExecution {

    private String id;
    private ExerciseId exerciseId;
    private MuscleGroup primaryMuscle;
    private List<MuscleGroup> secondaryMuscles;
    private SetsAndReps setsAndReps;
    private VideoTutorial video;
    private String customInstructions;
    private String name;
    private String description;
    private String videoUrl;
    private String thumbnailUrl;
    private Duration duration;
    private int repetitions;
    private int sets;
    private int restTime;
    private int difficultyLevel;

    private int weight;
    private int durationInSeconds;
    
    private int restTimeInSeconds;
    private int repetitionsPerSet;  
    private int setsPerExercise;}
