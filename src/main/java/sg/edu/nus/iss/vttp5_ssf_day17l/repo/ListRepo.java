package sg.edu.nus.iss.vttp5_ssf_day17l.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.vttp5_ssf_day17l.constant.Constants;

@Repository
public class ListRepo {
    
    @Autowired
    @Qualifier(Constants.template01)
    private RedisTemplate<String, String> template;

    public long leftPush(String key, String value){
        return template.opsForList().leftPush(key, value);
    }

    public long rightPush(String key, String value){
        return template.opsForList().rightPush(key, value);
    }

    public List<String> leftPop(String key) {
        return template.opsForList().leftPop(key, 1);
    }
    
    public List<String> rightPop(String key){
        return template.opsForList().rightPop(key, 1);
    }

    public String get(String key, Integer index){
        return template.opsForList().index(key, index).toString();
    }

    public long size(String key) {
        return template.opsForList().size(key);
    }

    public List<String> getList(String key) {
        List<String> list = template.opsForList().range(key, 0, -1);
        System.out.println("repo level" + list.size() + "\n\n\n\n\n\n\n\n");
        return list;
    }

    // // public Boolean deleteItem(String key, Person valueToDelete) {
    //     Boolean isDeleted = false;

    //     List<String> retrievedList = template.opsForList().range(key, 0, -1);

    //     String [] splitData = valueToDelete.toString().split(",");

    //     Optional<String> tempString = retrievedList.stream().filter(p -> p.toString().contains(splitData[2])).findFirst();

    //     int iFound = -1;
    //     if (tempString.isPresent()) {
    //         for(int i = 0;  i < retrievedList.size(); i++) {
    //             if (retrievedList.get(i).contains(splitData[2])) {
    //                 iFound = i;
    //                 break;
    //             }
    //         }
    //     }

    //     String data = template.opsForList().index(Util.keyPerson, iFound);

    //     System.out.println("valueToDelete: " + valueToDelete.toString());
    //     System.out.println("tempString: " + tempString);
    //     System.out.println("tempString: " + tempString.toString());


    //     if (iFound >= 0) {
    //         template.opsForList().remove(key, 1, data);
    //         isDeleted = true;
    //     }

    //     return isDeleted;
    // }



}
