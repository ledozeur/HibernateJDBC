package ru.netology;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcRepository {

    /*private final String schema = read("/data.sql");*/
    /*private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;*/

    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String name) {
        return entityManager.createNativeQuery("SELECT product_name FROM netology.ORDERS JOIN netology.CUSTOMERS ON ORDERS.customer_id = CUSTOMERS.id WHERE customers.name = :name").setParameter("name", name).getResultList();
    }



   /* public JdbcRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public  String getProductName(String name){
        Map<String, String> namedParameters = Collections.singletonMap("name", name);
    return namedParameterJdbcTemplate.queryForObject(schema, namedParameters, String.class);

    }
    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/


}
