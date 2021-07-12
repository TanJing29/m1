package com.trkj.medical_care_after.service;

import com.trkj.medical_care_after.dao.SupplierDao;
import com.trkj.medical_care_after.util.BeanCopyUtil;
import com.trkj.medical_care_after.vo.SupplierVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author 刘玲
 * @Date 2021-07-11 16:16
 * @Version 1.0
 */
@Service
@Slf4j
public class SupplierServiceImpl implements SupplierService {
    @Resource
    private SupplierDao supplierDao;

    @Override
    public List<SupplierVo> selSupplier() {
        return supplierDao.selSupplier();
    }

    @Override
    public List<SupplierVo> selmhSupplier(String suppliername) {
        return supplierDao.selmhSupplier(suppliername);
    }

    @Override
    public SupplierVo addSupplier(SupplierVo supplierVo) {
        supplierDao.insertSelective(supplierVo);
        return supplierVo;

    }


    @Override
    public SupplierVo updSupplier(SupplierVo supplierVo) {
        SupplierVo sup=new SupplierVo();
        sup.setUpdatetime(new Date());
        BeanCopyUtil.copyProperties(supplierVo,sup);//赋值
        supplierDao.updateByPrimaryKeySelective(supplierVo);
        return supplierVo;
    }

    @Override
    public int delSupplier(Integer suppId) {
        SupplierVo supplierVo1=new SupplierVo();
        supplierVo1.setSuppId(suppId);
        supplierVo1.setDeletetime(new Date());
        supplierVo1.setTimeliness(1);//时效性修改为1
        return supplierDao.updateByPrimaryKeySelective(supplierVo1);
    }
}
