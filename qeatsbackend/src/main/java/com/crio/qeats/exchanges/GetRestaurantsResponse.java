/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.exchanges;

import com.crio.qeats.dto.Restaurant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
//@AllArgsConstructor
public class GetRestaurantsResponse {
    List<Restaurant> restaurants;

    public GetRestaurantsResponse() {}

    public GetRestaurantsResponse(List<Restaurant> restaurants2) {
        this.restaurants=restaurants2;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}

// }
