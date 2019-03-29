package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Browser {
    private WebDriver webDriver;
    private String browser;
    private String baseUrl;
    final public  String PATH_DOWNLOAD = "/home/user/IdeaProjects/eldoradoBdd/src/test/resources/downloads";
    final public  String PATH_WEBDRIVER="./src/test/resources/webdrivers";
}

