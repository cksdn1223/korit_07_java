package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data   // getter / setter / required constructor / to string / equalsandhashcode
public class ResponseData<T> {
    private String message;
    private T data;
}
