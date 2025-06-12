package com.campusmov.platform.analyticsservice.analytics.domain.model.aggregates;

import com.campusmov.platform.analyticsservice.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class StudentRatingMetric extends AuditableAbstractAggregateRoot<StudentRatingMetric> {

    @NotBlank
    private String userId;

    @NotBlank
    private Integer totalRatings;

    @NotBlank
    private Integer totalReviewsCount;

    @NotBlank
    private Double averageRating;

    public StudentRatingMetric() {
    }

}
