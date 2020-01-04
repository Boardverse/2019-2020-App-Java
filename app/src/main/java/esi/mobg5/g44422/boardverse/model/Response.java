package esi.mobg5.g44422.boardverse.model;

import androidx.annotation.Nullable;

import java.util.List;

public class Response<T> {

    @Nullable
    private T data;

    @Nullable
    private List<Error> errors;

    @Nullable
    public T getData() {
        return data;
    }

    @Nullable
    public List<Error> getErrors() {
        return errors;
    }

}
