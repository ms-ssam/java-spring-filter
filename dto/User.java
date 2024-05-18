package com.example.filter.dto;

import lombok.*;

// gradle의 dependencies에 annotationProcessor로 롬복 들어가있어야 함
//@Getter
//@Setter  // 멤버 변수들의 getter와 setter 만들어줌
@Data  // getter, setter, equals, hashCode, toString 다 만들어줌
@NoArgsConstructor  // 기본 생성자 만들어줌
@AllArgsConstructor  // 모든 argument 받는 생성자 만들어줌
public class User {
    private String name;
    private int age;


}
