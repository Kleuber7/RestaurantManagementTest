package com.fiap.restaurant_management.aplication.gateway;

import com.fiap.restaurant_management.domain.entities.Restaurant;

import java.util.List;

public interface IRestaurantRepository {

    Restaurant createRestaurant(Restaurant restaurant);

    Boolean existByRestaurantCode(Long restaurantCode);

    Restaurant getRestaurantById(Long restaurantCode);

    Restaurant findRestaurantByName(String name);

    Restaurant findRestaurantByCep(String cep);

    List<Restaurant> findRestaurantByCuisineType(String cuisineType);

}
