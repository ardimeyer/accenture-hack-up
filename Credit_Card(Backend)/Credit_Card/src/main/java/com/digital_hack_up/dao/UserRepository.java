package com.digital_hack_up.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.digital_hack_up.bean.CreditCard;


public interface UserRepository extends CrudRepository<CreditCard, Integer> {
    //void saveAll(List<CreditcCard> credit);
}