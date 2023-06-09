package com.djc.entity;

import com.djc.entity.Vo.AccessoriesVo;

import java.io.Serializable;

/**
 * 配件表
 * (Accessories)实体类
 *
 * @author djc
 * @since 2023-04-16 14:02:16
 */
public class Accessories implements Serializable {
    private static final long serialVersionUID = -17644555662943579L;
    /**
     * 配件id
     */
    private Integer accessoriesId;
    /**
     * 存货编码
     */
    private String stockId;
    /**
     * 存货代码
     */
    private String stockCode;
    /**
     * 配件名字
     */
    private String accessoriesName;
    /**
     * 计量单位
     */
    private String unit;
    /**
     * 规格型号
     */
    private String model;
    /**
     * 配件所属设备id
     */
    private Integer machineTypeId;
    /**
     * 重要性
     */
    private Integer importance;
    /**
     * 负责人id
     */
    private Integer employeeId;
    /**
     * 配件类型（excl表名）
     */
    private String type;
    /**
     * 重要性描述
     */
    private String importanceDescription;


    public Integer getAccessoriesId() {
        return accessoriesId;
    }

    public void setAccessoriesId(Integer accessoriesId) {
        this.accessoriesId = accessoriesId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getAccessoriesName() {
        return accessoriesName;
    }

    public void setAccessoriesName(String accessoriesName) {
        this.accessoriesName = accessoriesName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(Integer machineTypeId) {
        this.machineTypeId = machineTypeId;
    }

    public Integer getImportance() {
        return importance;
    }

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImportanceDescription() {
        return importanceDescription;
    }

    public void setImportanceDescription(String importanceDescription) {
        this.importanceDescription = importanceDescription;
    }

    /**
     * 生成对应的AccessoriesVo
     * @return 新的AccessoriesVo
     */
    public AccessoriesVo toAccessoriesVo() {
        AccessoriesVo accessoriesVo = new AccessoriesVo();
        accessoriesVo.setAccessoriesId(this.accessoriesId);
        accessoriesVo.setAccessoriesName(this.accessoriesName);
        accessoriesVo.setEmployeeId(this.employeeId);
        accessoriesVo.setImportance(this.importance);
        accessoriesVo.setImportanceDescription(this.importanceDescription);
        accessoriesVo.setMachineTypeId(this.machineTypeId);
        accessoriesVo.setModel(this.model);
        accessoriesVo.setStockCode(this.stockCode);
        accessoriesVo.setStockId(this.stockId);
        accessoriesVo.setType(this.type);
        accessoriesVo.setUnit(this.unit);
        return accessoriesVo;
    }

}

