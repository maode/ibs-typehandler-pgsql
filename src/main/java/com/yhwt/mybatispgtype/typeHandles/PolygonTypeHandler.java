package com.yhwt.mybatispgtype.typeHandles;

import org.apache.ibatis.type.MappedTypes;
import org.postgis.Polygon;

/**  
 * @Title: PolygonTypeHandler.java
 * @Package com.example.demo.typeHandles
 * @Description: PostGIS Polygon 类型处理器
 * @author ZhengMaoDe   
 * @date 2019年3月21日 下午6:21:44 
 */
@MappedTypes(Polygon.class)
public class PolygonTypeHandler extends AbstractGeometryTypeHandler<Polygon> {
}
