package com.digital_hack_up.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.digital_hack_up.bean.CreDitCardIndexBean;

public interface ElasticSearchRepositery extends ElasticsearchRepository<CreDitCardIndexBean, Integer>{

}
