package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String login;
    private String password;
    private Set<String> skills;

    public void addSkill(String skill){
        if(skills==null){
            this.skills=new HashSet<>();
        }
        this.skills.add(skill);
    }
}
