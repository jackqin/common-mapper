package com.colorcc.common.mapper;

public interface Mapper<T> {
	public T selectOne(long id);

	public void updateOne(T t);

	public void deleteOne(long id);

	public void insertOne(T t);
}
