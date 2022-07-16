package com.dojoohwan.springbootdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dojoohwan.springbootdb.model.MinallBrand;
import com.dojoohwan.springbootdb.model.MinallCate;
import com.dojoohwan.springbootdb.model.MinmaxCate;
import com.dojoohwan.springbootdb.model.Product;
import com.dojoohwan.springbootdb.service.ProductService;
import com.google.gson.Gson;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Product> getSelectList() {
        List<Product> list = productService.selectList();
        return list;
    }

    // 1. 모든 카테고리의 상품 구매할 때 최저가 조회 API
    @RequestMapping(value = "/product/allcateMin", method = RequestMethod.GET)
    public String getMinallCate() {
        Gson gson = new Gson();
        MinallCate minall = new MinallCate();
        List<Product> list = productService.getMinallCate();
        int sum = list.stream().mapToInt(l -> l.getPrice()).sum();

        minall.setProductList(list);
        minall.setSum(sum);
        return gson.toJson(minall);
    }

    // 2. 한 브랜드에서 모든 카테고리 상품 구매할 경우 최저가 및 브랜드 조회 API
    @RequestMapping(value = "/product/brandByMin", method = RequestMethod.GET)
    public MinallBrand getBrandallmin() {
        return productService.getMinallBrand();
    }

    // 3. 각 카테고리 이름으로 최소, 최대 가격 조회 API
    @RequestMapping(value = "/product/cateByMinmax/{cate}", method = RequestMethod.GET)
    public MinmaxCate getCateMinMax(@PathVariable("cate") String cate) throws Exception {
        if (cate.equals("TOP") ||
                cate.equals("OUTER") ||
                cate.equals("PANTS") ||
                cate.equals("SNEAKERS") ||
                cate.equals("BAG") ||
                cate.equals("CAP") ||
                cate.equals("SOCKS") ||
                cate.equals("ACC")) {
            return productService.getCateMinMax(cate);
        } else {
            throw new Exception("check category");
        }
    }

    // 선택
    // 가격 추가/업데이트/삭제
    @PostMapping("/product/new")
    public List<Product> insertProduct(@RequestBody Product product) {
        productService.insertProduct(product);
        return productService.selectList();
    }

    @PutMapping("/product/update")
    public Product updateProduct(@RequestBody Product product) {
        productService.updateProdct(product);
        return productService.selectProduct(product);
    }

    @DeleteMapping("/product")
    public List<Product> deleteProduct(@RequestBody Product product) {
        productService.deleteProdcut(product);
       return productService.selectList();
    }

}
