package cn.itsource.aibuy.service.impl;

import cn.itsource.aibuy.domain.Brand;
import cn.itsource.aibuy.mapper.BrandMapper;
import cn.itsource.aibuy.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author breeze
 * @since 2019-07-31
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
