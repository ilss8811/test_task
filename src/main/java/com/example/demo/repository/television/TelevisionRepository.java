package com.example.demo.repository.television;

import com.example.demo.model.television.Television;
import com.example.demo.payload.request.television.TelevisionSearchRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

public interface TelevisionRepository extends JpaRepository<Television, Integer> {
    @Query(value = "SELECT * FROM televisions WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:category is null or category ILIKE '%' || :category || '%') "
            + "AND (:technology is null or technology ILIKE '%' || :technology || '%') "
            + "AND (stock = :stock)"
            , nativeQuery = true)
    List<Television> findAll(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("category") String category,
            @Param("technology") String technology,
            @Param("type_id") Integer typeId
    );

    @Query(value = "SELECT * FROM televisions WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:category is null or category ILIKE '%' || :category || '%') "
            + "AND (:technology is null or technology ILIKE '%' || :technology || '%') "
            + "AND (stock = :stock) ORDER BY name, price"
            , nativeQuery = true)
    List<Television> findAllOrderByNameAndPrice(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("category") String category,
            @Param("technology") String technology,
            @Param("type_id") Integer typeId
    );

    @Query(value = "SELECT * FROM televisions WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:category is null or category ILIKE '%' || :category || '%') "
            + "AND (:technology is null or technology ILIKE '%' || :technology || '%') "
            + "AND (stock = :stock) ORDER BY name"
            , nativeQuery = true)
    List<Television> findAllOrderByName(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("category") String category,
            @Param("technology") String technology,
            @Param("type_id") Integer typeId
    );

    @Query(value = "SELECT * FROM televisions WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:category is null or category ILIKE '%' || :category || '%') "
            + "AND (:technology is null or technology ILIKE '%' || :technology || '%') "
            + "AND (stock = :stock) ORDER BY price"
            , nativeQuery = true)
    List<Television> findAllOrderByPrice(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("category") String category,
            @Param("technology") String technology,
            @Param("type_id") Integer typeId
    );
}
