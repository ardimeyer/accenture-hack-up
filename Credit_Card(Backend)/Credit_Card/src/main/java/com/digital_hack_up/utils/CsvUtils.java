package com.digital_hack_up.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.digital_hack_up.bean.CreditCard;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CsvUtils {
    public static <T> List<T> read(Class<T> clazz, InputStream stream) throws IOException {
    	CsvMapper mapper = new CsvMapper();
    	CsvSchema schema = mapper.schemaFor(clazz).withHeader().withColumnReordering(true);
        ObjectReader reader = mapper.readerFor(clazz).with(schema);
        return reader.<T>readValues(stream).readAll();
    }
    
    
    public static  List<CreditCard> readVal(Class<CreditCard> clazz, InputStream stream) throws IOException {
    	CsvMapper mapper = new CsvMapper();
    	CsvSchema schema = mapper.typedSchemaFor(clazz).withHeader().withColumnReordering(true);
    	ObjectReader reader = mapper.readerFor(clazz).with(schema);
    	 List<Object> ob=reader.readValues(stream).readAll();
        return (List<CreditCard>)(Object)ob;
    }
}