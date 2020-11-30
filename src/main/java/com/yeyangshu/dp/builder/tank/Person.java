package com.yeyangshu.dp.builder.tank;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/30 23:35
 */
public class Person {
    /** id */
    private int id;
    /** 姓名 */
    private String name;
    /** 年龄 */
    private int age;
    /** 体重 */
    private double weight;
    /** 分数 */
    private int score;
    /** 家庭住址 */
    private Location location;

    /**
     * 构造函数
     */
    public Person() {
    }

    public static class PersonBuilder {
        Person person = new Person();

        /**
         * 构造基本信息
         *
         * @param id
         * @param name
         * @param age
         * @return
         */
        public PersonBuilder basicInfo(int id, String name, int age) {
            person.id = id;
            person.name = name;
            person.age = age;
            return this;
        }

        /**
         * 构建体重
         *
         * @param weight
         * @return
         */
        public PersonBuilder weight(double weight) {
            person.weight = weight;
            return this;
        }

        /**
         * 构建学习成绩
         *
         * @param score
         * @return
         */
        public PersonBuilder score(int score) {
            person.score = score;
            return this;
        }

        /**
         * 构建家庭住址
         *
         * @param street
         * @param roomNo
         * @return
         */
        public PersonBuilder location(String street, String roomNo) {
            person.location = new Location(street, roomNo);
            return this;
        }

        /**
         * 返回构建的 Person 对象
         * @return
         */
        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", score=" + score +
                ", location=" + location +
                '}';
    }
}


