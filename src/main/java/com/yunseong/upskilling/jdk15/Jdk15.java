package com.yunseong.upskilling.jdk15;

import java.lang.invoke.MethodHandles;

public class Jdk15 {
        
        /**
         * 1. Sealed Classes ( 프리뷰 )
         * <p>
         * Shape클래스는 Circle과 Square클래스만 상속받을 수 있다.
         */
        abstract sealed class Shape permits Circle, Square {
        }
        
        final class Circle extends Shape {
        }
        
        final class Square extends Shape {
        }
        
        /**
         * 2. Hidden Class
         * <p>
         * ClassLoader를 통해 로드되지 않는 클래스를 런타임 시점에 동적으로 생성할 수 있다.
         */
        public void case2() {
                try {
                        var lookup = MethodHandles.lookup();
                        var hiddenClass = lookup.defineHiddenClass(new byte[]{}, true, MethodHandles.Lookup.ClassOption.NESTMATE);
                } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                }
        }
        
        /**
         * 3. Text Blocks ( 표준 )
          */
        public void case3() {
                String textBlock = """
                                   Hello, World!
                                   This is a text block.
                                   """;
                System.out.println(textBlock);
        }
}
