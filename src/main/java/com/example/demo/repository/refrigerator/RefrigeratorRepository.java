package com.example.demo.repository.refrigerator;

import com.example.demo.model.refrigerator.Refrigerator;
import com.example.demo.model.television.Television;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface RefrigeratorRepository extends JpaRepository<Refrigerator, Integer> {
    @Query(value = "SELECT * FROM refrigerators WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:doors <= 0 or doors = :doors) "
            + "AND (:compressor is null or compressor ILIKE '%' || :compressor || '%') "
            + "AND (stock = :stock)"
            , nativeQuery = true)
    List<Refrigerator> findAll(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("doors") Integer doors,
            @Param("compressor") String compressor,
            @Param("type_id") Integer typeId
    );

    @Query(value = "SELECT * FROM refrigerators WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:doors <= 0 or doors = :doors) "
            + "AND (:compressor is null or compressor ILIKE '%' || :compressor || '%') "
            + "AND (stock = :stock) ORDER BY name, price"
            , nativeQuery = true)
    List<Refrigerator> findAllOrderByNameAndPrice(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("doors") Integer doors,
            @Param("compressor") String compressor,
            @Param("type_id") Integer typeId
    );

    @Query(value = "SELECT * FROM refrigerators WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:doors <= 0 or doors = :doors) "
            + "AND (:compressor is null or compressor ILIKE '%' || :compressor || '%') "
            + "AND (stock = :stock) ORDER BY name"
            , nativeQuery = true)
    List<Refrigerator> findAllOrderByName(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("doors") Integer doors,
            @Param("compressor") String compressor,
            @Param("type_id") Integer typeId
    );

    @Query(value = "SELECT * FROM refrigerators WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:doors <= 0 or doors = :doors) "
            + "AND (:compressor is null or compressor ILIKE '%' || :compressor || '%') "
            + "AND (stock = :stock) ORDER BY price"
            , nativeQuery = true)
    List<Refrigerator> findAllOrderByPrice(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("doors") Integer doors,
            @Param("compressor") String compressor,
            @Param("type_id") Integer typeId
    );
}
