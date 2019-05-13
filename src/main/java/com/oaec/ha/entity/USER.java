package com.oaec.ha.entity;


import javax.persistence.*;

@Entity
@Table(name="t_user")  //表格名称注解
public class USER {

    //主键注解
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成策略
    private  int id;

    @Column(name="username",length = 32, unique = true, nullable = false)
   private  String username;

    private String sex;//性别

    @Column(name="age", length = 3)
    private String age;//年龄

    @Column(name="password", length = 36)
     private  String password;

    public int  getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }



    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "USER{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
