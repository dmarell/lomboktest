/*
 * Created by Daniel Marell 15-07-01 16:00
 */
package se.caglabs.lomboktest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Assignment {
    @NonNull
    private String orderId;
    @NonNull
    private String orderSlogan;
    @NonNull
    private String customerId;
    @NonNull
    private LocalDate startDate;
    private LocalDate endDate;
    @NonNull
    private List<String> consultantIds;

    public static Assignment demoCreate() {
        // Mandatory attributes
        Assignment result = new Assignment("123", "Assignment x", "k001", LocalDate.parse("2015-01-01"),
                Collections.singletonList("42"));

        // Optional attributes
        result.setEndDate(LocalDate.parse("2016-01-01"));

        return result;
    }
}
