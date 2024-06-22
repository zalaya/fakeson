package xyz.zalaya.models.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductBrand {
    ASUS(1),
    APPLE(2),
    SAMSUNG(3),
    LG(4),
    SONY(5);

    private final Integer id;
}
