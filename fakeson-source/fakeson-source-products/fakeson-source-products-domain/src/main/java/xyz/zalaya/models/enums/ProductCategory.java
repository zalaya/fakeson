package xyz.zalaya.models.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductCategory {
    ELECTRONICS(1),
    CLOTHING(2),
    FOOD(3),
    BOOKS(4);

    private final Integer id;
}
