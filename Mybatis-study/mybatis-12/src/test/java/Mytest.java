import com.rjxy.mapper.ClassMapper;
import com.rjxy.pojo.Classes;
import com.rjxy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void getAllClass(){
        SqlSession session = MybatisUtils.createSession();
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        List<Classes> allClass = mapper.getAllClass();
        for (Classes aClass : allClass) {
            System.out.println(aClass);
        }
        session.close();
    }
}
