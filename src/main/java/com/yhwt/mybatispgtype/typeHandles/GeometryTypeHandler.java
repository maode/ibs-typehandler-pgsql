package com.yhwt.mybatispgtype.typeHandles;

import org.apache.ibatis.type.MappedTypes;
import org.postgis.Geometry;

/**  
 * @Title: PointTypeHandler.java
 * @Package com.example.demo.typeHandles
 * @Description: PostGIS Geometry 类型处理器
 * @author ZhengMaoDe   
 * @date 2019年3月21日 下午6:21:30 
 */
@MappedTypes(Geometry.class)
public class GeometryTypeHandler extends AbstractGeometryTypeHandler<Geometry> {
}
