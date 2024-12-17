package com.alura.literatura.Service;

public interface IDataConvertion {
    <T> T convertData(String json, Class<T> clase);
}
