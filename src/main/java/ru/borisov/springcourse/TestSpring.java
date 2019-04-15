package ru.borisov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {



    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer2", MusicPlayer.class); // приводится к этому классу (второй параметр)

        musicPlayer.playMusic(); // внедряются зависимости через xml файл

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());



//        MusicPlayer musicPlayer1 = new MusicPlayer(); // что происходит
//
//        musicPlayer1.setMusic(new RockMusic());


        context.close();
    }

}
