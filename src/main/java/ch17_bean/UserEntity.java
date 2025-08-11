package ch17_bean;

import lombok.Getter;
import lombok.Setter;
/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |    -> 컬럼명 / Header
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+
 */
// @Entity  -> springboot 설치시에 사용됩니다.
@Getter
@Setter
public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;
}