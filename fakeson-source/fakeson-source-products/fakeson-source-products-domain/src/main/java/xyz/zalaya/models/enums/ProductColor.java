package xyz.zalaya.models.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductColor {
    RED(1),
    BLUE(2),
    GREEN(3),
    YELLOW(4),
    BLACK(5),
    WHITE(6),
    ORANGE(7),
    PURPLE(8),
    PINK(9),
    BROWN(10);

    private final Integer id;
}
