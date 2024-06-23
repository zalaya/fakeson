package xyz.zalaya.ports.out;

import xyz.zalaya.models.Product;
import xyz.zalaya.ports.Port;

import java.util.List;

public interface FindAllProductPort extends Port<Void, List<Product>> {

}
