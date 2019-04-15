package ru.borisov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // приводится к этому классу (второй параметр)
        //MusicPlayer musicPlayer = new MusicPlayer(testBean); // IOC внедрили зависимость
        musicPlayer.playMusic(); // внедряются зависимости через xml файл


        context.close();
    }

}
