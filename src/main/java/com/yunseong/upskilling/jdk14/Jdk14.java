package com.yunseong.upskilling.jdk14;

public class Jdk14 {
        
        public record Person(String name, int age) {
        }
        
        /**
         * 1. Switch문 간소화 ( 표준 )
         */
        public void case1() {
                int type = 3;
                String result = switch (type) {
                        case 1 -> "Type 1";
                        case 2 -> "Type 2";
                        case 3 -> "Type 3";
                        default -> "Unknown";
                };
                System.out.println(result);
        }
        
        /**
         * 2. 텍스트 블록 사용 ( 프리뷰 )
         */
        public void case2() {
                String textBlock = """
                                Hello, World!
                                This is a text block.
                        """;
        }
        
        /**
         * 3. Record 클래스 ( 프리뷰 )
         */
        public void case3() {
                Person person = new Person("Yunseong", 27);
        }
        
        /**
         * 4. instanceof 패턴 매칭 ( 프리뷰 )
         */
        public void case4() {
                Object object = new Person("Yunseong", 27);
                if (object instanceof Person person) {
                        System.out.println(person.name);
                }
        }
}
