/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
//@AllArgsConstructor
public class GetRestaurantsRequest {

    public GetRestaurantsRequest() {}

    public GetRestaurantsRequest(Double latitude, Double longitude) {
        this.latitude=latitude;
        this.longitude=longitude;
    }

    @NonNull
    @Min(value=-90)
    @Max(value=90)
    private Double latitude;

    @NonNull
    @Min(value=-180)
    @Max(value=180)
    private Double longitude;

    private String searchFor;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getSearchFor() {
        return searchFor;
    }

    public void setSearchFor(String searchFor) {
        this.searchFor = searchFor;
    }

}

