package com.example.restaurant.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemoryDbEntity {
    /*
    * int -> Integer : database에 0이 들어갈 수 있기 때문이다.
    * 바꿀 때는 지정 후 refactor -> type migration으로 변경한다.
    * */
    protected Integer index; // int -> Integer : database에 0이 들어갈 수 있기 때문이다.
}
