package mapper;

import pojo.Class;

import java.util.List;

public interface ClassMapper {
    Class getAllClass(int id);
    List<Class> selectAll();
}
