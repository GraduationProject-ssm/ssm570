package com.entity.model;

import com.entity.ZazhixinxiCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 杂志收藏
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZazhixinxiCollectionModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 杂志信息
     */
    private Integer zazhixinxiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 类型
     */
    private Integer zazhixinxiCollectionTypes;


    /**
     * 收藏时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：杂志信息
	 */
    public Integer getZazhixinxiId() {
        return zazhixinxiId;
    }


    /**
	 * 设置：杂志信息
	 */
    public void setZazhixinxiId(Integer zazhixinxiId) {
        this.zazhixinxiId = zazhixinxiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：类型
	 */
    public Integer getZazhixinxiCollectionTypes() {
        return zazhixinxiCollectionTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setZazhixinxiCollectionTypes(Integer zazhixinxiCollectionTypes) {
        this.zazhixinxiCollectionTypes = zazhixinxiCollectionTypes;
    }
    /**
	 * 获取：收藏时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：收藏时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }