package com.djc.entity;

import com.djc.entity.Vo.AccessoriesOfMachineTypeVo;

import java.io.Serializable;

/**
 * 机器类型(按种类）
 * (MachineType)实体类
 *
 * @author djc
 * @since 2023-04-16 14:02:09
 */
public class MachineType implements Serializable {
    private static final long serialVersionUID = -54806795069343151L;
    /**
     * 设备种类id
     */
    private Integer machineTypeId;
    /**
     * 设备种类
     */
    private String machineTypeName;
    /**
     * 设备详情
     */
    private String machineTypeInformation;
    /**
     * 设备型号
     */
    private String machineModel;
    /**
     * 制造商
     */
    private String machineManufacturer;
    /**
     * 定向位置
     */
    private String orientationPosition;
    /**
     * 电压
     */
    private String machineVoltage;
    /**
     * 功率
     */
    private String machinePower;
    /**
     * 备注
     */
    private String remark;


    public Integer getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(Integer machineTypeId) {
        this.machineTypeId = machineTypeId;
    }

    public String getMachineTypeName() {
        return machineTypeName;
    }

    public void setMachineTypeName(String machineTypeName) {
        this.machineTypeName = machineTypeName;
    }

    public String getMachineTypeInformation() {
        return machineTypeInformation;
    }

    public void setMachineTypeInformation(String machineTypeInformation) {
        this.machineTypeInformation = machineTypeInformation;
    }

    public String getMachineModel() {
        return machineModel;
    }

    public void setMachineModel(String machineModel) {
        this.machineModel = machineModel;
    }

    public String getMachineManufacturer() {
        return machineManufacturer;
    }

    public void setMachineManufacturer(String machineManufacturer) {
        this.machineManufacturer = machineManufacturer;
    }

    public String getOrientationPosition() {
        return orientationPosition;
    }

    public void setOrientationPosition(String orientationPosition) {
        this.orientationPosition = orientationPosition;
    }

    public String getMachineVoltage() {
        return machineVoltage;
    }

    public void setMachineVoltage(String machineVoltage) {
        this.machineVoltage = machineVoltage;
    }

    public String getMachinePower() {
        return machinePower;
    }

    public void setMachinePower(String machinePower) {
        this.machinePower = machinePower;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public AccessoriesOfMachineTypeVo convertToAccessoriesOfMachineTypeVo(MachineType machineType) {
        AccessoriesOfMachineTypeVo accessoriesOfMachineTypeVo = new AccessoriesOfMachineTypeVo();
        accessoriesOfMachineTypeVo.setMachineTypeId(machineType.getMachineTypeId());
        accessoriesOfMachineTypeVo.setMachineTypeName(machineType.getMachineTypeName());
        accessoriesOfMachineTypeVo.setMachineTypeInformation(machineType.getMachineTypeInformation());
        accessoriesOfMachineTypeVo.setMachineModel(machineType.getMachineModel());
        accessoriesOfMachineTypeVo.setMachineManufacturer(machineType.getMachineManufacturer());
        accessoriesOfMachineTypeVo.setOrientationPosition(machineType.getOrientationPosition());
        accessoriesOfMachineTypeVo.setMachineVoltage(machineType.getMachineVoltage());
        accessoriesOfMachineTypeVo.setMachinePower(machineType.getMachinePower());
        accessoriesOfMachineTypeVo.setRemark(machineType.getRemark());
        return accessoriesOfMachineTypeVo;
    }
}

