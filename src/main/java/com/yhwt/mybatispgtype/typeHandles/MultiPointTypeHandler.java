package com.yhwt.mybatispgtype.typeHandles;

import org.apache.ibatis.type.MappedTypes;
import org.postgis.MultiPoint;

/**  
 * @Title: MultiPointTypeHandler.java
 * @Package com.example.demo.typeHandles
 * @Description: PostGIS MultiPoint 类型处理器
 * @author ZhengMaoDe   
 * @date 2019年3月21日 下午6:20:23 
 */
@MappedTypes(MultiPoint.class)
public class MultiPointTypeHandler extends AbstractGeometryTypeHandler<MultiPoint>{
}
