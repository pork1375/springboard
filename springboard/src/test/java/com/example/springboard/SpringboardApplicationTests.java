package com.example.springboard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@SpringBootTest
class SpringboardApplicationTests {

    @Test
    void contextLoads() {

        /**
         * if 또는 switch문을 이용한다.
         * 사용자로부터 키를 입력받는다. 입력받은 키가
         *    1) 150 이상이면, 놀이기구 이용 가능
         *    2) 150 미만이면,
         * 부모와 함께 왔는지 한 번 더 묻는다.
         * 함께 왔다면 1번을 입력받고, 혼자 왔다면 0번 입력받는다.
         * 1번 입력: 좋은 시간 보내렴~
         *      0번 입력: 어른 모시고 다시 오렴~
         */

        /**
         * if 또는 switch문을 이용한다.
         * 영문 대문자를 입력받아 'A'이면 "훌륭합니다.",
         * 'B'이면 "좋습니다.", 'C'이면 "보통입니다.",
         * 'D'이면 "노력하세요.",
         * 그이외문자는 "잘못입력하셨습니다."라고 출력하는 프로그램
         * */

        /**
         * if 또는 switch문을 이용한다. random함수를 사용하면 좋고 변수로 만들어도 됨
         * int user = 1;
         * int computer = 1;
         * String result = "비겼습니다";
         * 가위(1), 바위(2), 보(3)을 입력받고 컴퓨터는 random으로 발생하여 가위바위보 게임을 진행합니다.
         * 입력예) 가위(1), 바위(2), 보(3) 중 하나를 입력하세요. : 1
         * 출력예) 당신은 1입니다.
         *             컴은 1입니다.
         *             비겼습니다.
         * 입력예) 가위(1), 바위(2), 보(3) 중 하나를 입력하세요. : 1
         * 출력예) 당신은 3입니다.
         *             컴은 2입니다.
         *             당신이 이겼습니다.
         **/

        int user = 3;
        int computer = 2;
//        int computer = new Random().nextInt(3)+1;
        String result = "";

        /**
         * 1 == 1 : 비김
         * 1 == 2 : 컴퓨터 이김
         * 1 == 3 : 사용자 이김
         *
         * 2 == 1 : 사용자 이김
         * 2 == 2 : 비김
         * 2 == 3 : 컴퓨터 이김
         *
         * 3 == 1 : 컴퓨터 이김
         * 3 == 2 : 사용자 이김
         * 3 == 3 : 비김
         * */

        if (user == computer) {
            result = "비김";
        } else {
            if (user == 1 && computer == 2) {
                result = "컴퓨터 이김";
            } else if (user == 1 && computer == 3) {
                result = "사용자 이김";
            } else if (user == 2 && computer == 1) {
                result = "사용자 이김";
            } else if (user == 2 && computer == 3) {
                result = "컴퓨터 이김";
            } else if (user == 3 && computer == 1) {
                result = "컴퓨터 이김";
            } else if (user == 3 && computer == 2) {
                result = "사용자 이김";
            }
        }



        System.out.println("user == > " + user);
        System.out.println("conputer == > " + computer);
        System.out.println(result);
    }

    // ---------
    /**
     * - 반복문 문제 for 사용
     * https://www.acmicpc.net/problem/2739
     * */

    /**
     * - 반복문 문제 for 사용
     * https://www.acmicpc.net/problem/9316
     **/

    /**
     * - 조건문 반복문 (for문과 while문 2개를 만들자)
     * 1 ~ 100 까지의 정수 중 짝수 / 홀수를 출력하는 프로그램 구현
     * 짝수의 합을 구해라
     * */

    /**
     * - 반복문 문제 
     * https://www.acmicpc.net/problem/2742
     * */

    /**
     * - 반복문 문제
     * https://www.acmicpc.net/problem/8393
     * */

    /**
     * - 조건문 문제
     * https://www.acmicpc.net/problem/4101
     * */

    /**
     * - 반복문 문제(심화)
     * https://www.acmicpc.net/problem/1546
     * */

    /**
     * - 반복문 문제(심화)
     * https://www.acmicpc.net/problem/11022
     * */
    @Test
    void adsf() {
        /**
         * 문제 : 최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램 작성
         입력 예) 11 25 3 9 15 6 8 7 12 0
         출력 예) 25 9 6 7
         * */

        int[] arr = {11,25, 3, 9, 15, 6, 8, 7, 12, 0};

        for (int i = 0; i < arr.length; i++) {

        }

    }
}
