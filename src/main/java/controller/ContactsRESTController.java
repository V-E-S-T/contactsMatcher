package controller;

import model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ContactsService;

import java.util.List;

@RestController
public class ContactsRESTController {

    @Autowired
    private ContactsService contactsService;

    //https://www.baeldung.com/rest-api-search-language-spring-data-querydsl
    //https://spring.io/blog/2011/04/26/advanced-spring-data-jpa-specifications-and-querydsl/
    //https://jira.spring.io/browse/DATAREST-838
    //https://habr.com/post/351890/
    //https://developer.github.com/v3/guides/traversing-with-pagination/
    //https://docs.spring.io/spring-data/jpa/docs/1.10.2.RELEASE/reference/html/#core.web.type-safe
    //http://www.querydsl.com/static/querydsl/latest/reference/html/ch02.html#jpa_integration
    //http://programmerz.ru/questions/41031/exception-using-spring-data-jpa-and-querydsl-via-rest-controller-question.html
    //https://stackoverflow.com/questions/33915650/regular-expression-matching-in-querydsl
    //http://qaru.site/questions/2152598/use-regular-expressions-in-jpa-criteriabuilder

    @GetMapping("/hello/contacts")
    public List<Contact> getMatchesContacts(@RequestParam("nameFilter") String nameFilter){

//        List progLangs = Arrays.asList("apl", "basic", "c", "c++", "c#", "cobol", "java", "javascript", "perl", "python", "scala");
//        Pattern p = Pattern.compile("^c");
//        progLangs.stream().filter(p.asPredicate()).forEach(System.out::println);

        //http://qaru.site/questions/118370/how-to-manage-a-large-dataset-using-spring-mysql-and-rowcallbackhandler
        //https://javarush.ru/groups/posts/186-reguljarnihe-vihrazhenija-v-java-chastjh-3


        return null;
    }


}
