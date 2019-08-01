package cn.itsource.aibuy.service.impl;

import cn.itsource.aibuy.domain.ProductType;
import cn.itsource.aibuy.mapper.ProductTypeMapper;
import cn.itsource.aibuy.service.IProductTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author breeze
 * @since 2019-07-31
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

}
