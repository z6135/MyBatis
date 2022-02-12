package mapper;

import pojo.Classes;

import java.util.List;


public interface ClassesMapper {
    Classes getClassesByid(int id);
    List<Classes> getClassAll();
}
