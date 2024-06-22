package xyz.zalaya.models.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductStock {
    IN_STOCK(1),
    OUT_OF_STOCK(2),
    DISCONTINUED(3);

    private final Integer id;
}
