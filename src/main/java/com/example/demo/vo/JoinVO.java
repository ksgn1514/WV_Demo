package com.example.demo.vo;

import lombok.Data;

@Data // 아래 네개 한방에. 아래처럼 다 명시해주는게 권장사항이긴함.
// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
public class JoinVO {
    private String id;
    private String pw;
    private String name;
    private String email;
    private String phone;
}
