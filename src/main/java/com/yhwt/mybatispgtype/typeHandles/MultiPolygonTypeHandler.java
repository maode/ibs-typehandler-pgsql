package com.yhwt.mybatispgtype.typeHandles;

import org.apache.ibatis.type.MappedTypes;
import org.postgis.MultiPolygon;


/**  
 * @Title: MultiPolygonTypeHandler.java
 * @Package com.example.demo.typeHandles
 * @Description: PostGIS MultiPolygon 类型处理器
 * @author ZhengMaoDe   
 * @date 2019年3月21日 下午6:12:48 
 */
@MappedTypes(MultiPolygon.class)
public class MultiPolygonTypeHandler extends AbstractGeometryTypeHandler<MultiPolygon> {

}
