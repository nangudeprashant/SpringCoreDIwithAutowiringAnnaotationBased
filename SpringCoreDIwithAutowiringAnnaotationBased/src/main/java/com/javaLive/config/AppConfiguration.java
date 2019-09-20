package com.javaLive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.javaLive.byType.Room;

@Configuration
@ComponentScan(basePackages = {
        "com.javaLive.constructorBased",
        "com.javaLive.byType"
    })
public class AppConfiguration {
	public AppConfiguration()
    {        
    }    
    @Bean(name="allotedTo2")
    public com.javaLive.byType.Student getStudent2()
    {
        com.javaLive.byType.Student student = new com.javaLive.byType.Student();
        student.setName("Student B");
        return student;
    }    
    @Bean( name="room2")
    public Room room2()
    {
    	com.javaLive.byType.Room room = new com.javaLive.byType.Room();
        room.setRoomNumber("R-102");
        return room;
    }
    @Bean(name="allotedTo3")
    public com.javaLive.constructorBased.Student getStudent3()
    {
        com.javaLive.constructorBased.Student student = new com.javaLive.constructorBased.Student();
        student.setName("Student C");
        return student;
    }    
    @Bean( name="room3")
    public com.javaLive.constructorBased.Room room3()
    {
    	com.javaLive.constructorBased.Room room = new com.javaLive.constructorBased.Room(getStudent3());
        room.setRoomNumber("R-103");
        return room;
    }
}
