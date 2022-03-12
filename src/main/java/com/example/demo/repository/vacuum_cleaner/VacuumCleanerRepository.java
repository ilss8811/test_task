package com.example.demo.repository.vacuum_cleaner;

import com.example.demo.model.television.Television;
import com.example.demo.model.vacuum_cleaner.VacuumCleaner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface VacuumCleanerRepository extends JpaRepository<VacuumCleaner, Integer> {
    @Query(value = "SELECT * FROM vacuum_cleaners WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:mods <= 0 or mods = :mods) "
            + "AND (:volume <= 0 or volume = :volume) "
            + "AND (stock = :stock)"
            , nativeQuery = true)
    List<VacuumCleaner> findAll(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("mods") Integer mods,
            @Param("volume") Integer volume,
            @Param("type_id") Integer typeId
    );

    @Query(value = "SELECT * FROM vacuum_cleaners WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:mods <= 0 or mods = :mods) "
            + "AND (:volume <= 0 or volume = :volume) "
            + "AND (stock = :stock) ORDER BY name, price"
            , nativeQuery = true)
    List<VacuumCleaner> findAllOrderByNameAndPrice(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("mods") Integer mods,
            @Param("volume") Integer volume,
            @Param("type_id") Integer typeId
    );

    @Query(value = "SELECT * FROM vacuum_cleaners WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:mods <= 0 or mods = :mods) "
            + "AND (:volume <= 0 or volume = :volume) "
            + "AND (stock = :stock) ORDER BY name"
            , nativeQuery = true)
    List<VacuumCleaner> findAllOrderByName(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("mods") Integer mods,
            @Param("volume") Integer volume,
            @Param("type_id") Integer typeId
    );

    @Query(value = "SELECT * FROM vacuum_cleaners WHERE type = :type_id "
            + "AND (:name is null or name ILIKE '%' || :name || '%') "
            + "AND (:serial_number is null or serial_number ILIKE '%' || :serial_number || '%') "
            + "AND (:color is null or color ILIKE '%' || :color || '%') "
            + "AND (:width <= 0.0 or width = :width) "
            + "AND (:length <= 0.0 or length = :length) "
            + "AND (:height <= 0.0 or height = :height) "
            + "AND ((:price_from <= 0.0 AND :price_to <= 0.0) or price BETWEEN :price_from AND :price_to) "
            + "AND (:mods <= 0 or mods = :mods) "
            + "AND (:volume <= 0 or volume = :volume) "
            + "AND (stock = :stock) ORDER BY price"
            , nativeQuery = true)
    List<VacuumCleaner> findAllOrderByPrice(
            @Param("name") String name,
            @Param("serial_number") String serialNumber,
            @Param("color") String color,
            @Param("width") Float width,
            @Param("length") Float length,
            @Param("height") Float height,
            @Param("price_from") BigDecimal price_from,
            @Param("price_to") BigDecimal price_to,
            @Param("stock") Boolean stock,
            @Param("mods") Integer mods,
            @Param("volume") Integer volume,
            @Param("type_id") Integer typeId
    );
}