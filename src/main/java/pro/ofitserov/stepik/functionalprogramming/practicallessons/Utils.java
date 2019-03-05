package pro.ofitserov.stepik.functionalprogramming.practicallessons;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static ObjectMapper mapper = new ObjectMapper();

    private Utils() {
    }

    public static <T> List<T> getListFromJSON(String resourceName, Class tClass) throws IOException {
        List<T> list;
        TypeFactory t = TypeFactory.defaultInstance();
        list = mapper.readValue(new File(resourceName), t.constructCollectionType(ArrayList.class, tClass));
        return list;
    }
}
