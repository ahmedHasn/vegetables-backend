@GenericGenerator(
        name = "optimized-sequence",
        strategy = "enhanced-sequence",
        parameters = {
                @Parameter(name="prefer_sequence_per_entity", value="true"),
                @Parameter(name="optimizer", value="hilo"),
                @Parameter(name="increment_size", value="1")})
package com.backend.model;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
