package ru.borisov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {



    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // приводится к этому классу (второй параметр)

        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); // приводится к этому классу (второй параметр)

        System.out.println(firstmusicPlayer.getVolume());

        firstmusicPlayer.setVolume(24);
        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());


        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());



//        MusicPlayer musicPlayer1 = new MusicPlayer(); // что происходит
//
//        musicPlayer1.setMusic(new RockMusic());


        context.close();
    }

}
