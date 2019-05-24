package com.yhwt.mybatispgtype.typeHandles;

import org.apache.ibatis.type.MappedTypes;
import org.postgis.LineString;

/**  
 * @Title: LineStringTypeHandler.java
 * @Package com.example.demo.typeHandles
 * @Description: PostGIS LineString 类型处理器
 * @author ZhengMaoDe   
 * @date 2019年3月21日 下午6:18:59 
 */
@MappedTypes(LineString.class)
public class LineStringTypeHandler extends AbstractGeometryTypeHandler<LineString>{
}
