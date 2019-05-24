package com.yhwt.mybatispgtype.typeHandles;

import org.apache.ibatis.type.MappedTypes;
import org.postgis.Point;

/**  
 * @Title: PointTypeHandler.java
 * @Package com.example.demo.typeHandles
 * @Description: PostGIS Point 类型处理器
 * @author ZhengMaoDe   
 * @date 2019年3月21日 下午6:21:30 
 */
@MappedTypes(Point.class)
public class PointTypeHandler extends AbstractGeometryTypeHandler<Point> {
}
