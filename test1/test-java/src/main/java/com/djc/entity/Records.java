package com.djc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * 维修(维修)记录表
 * (Records)实体类
 *
 * @author djc
 * @since 2023-04-19 21:57:06
 */
public class Records implements Serializable {
    private static final long serialVersionUID = 177245142815487268L;
    /**
     * 记录id
     */
    private Integer recordsId;
    /**
     * 机器id
     */
    private Integer machineId;
    /**
     * 机器名
     */
    private String machineName;
    /**
     * 机器型号id
     */
    private Integer machineTypeId;
    /**
     * 提交人id
     */
    private Integer employeeId;
    /**
     * 参与维修员工
     */
    private String repaireEmployeesName;
    /**
     * 故障问题描述
     */
    private String faultDescription;
    /**
     * 维修方案描述
     */
    private String methodDescription;
    /**
     * 维修日期
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private Date maintenanceTime;
    /**
     * 紧急程度
     */
    private String urgencyLevel;
    /**
     * 记录类型(0维修，1维护)
     */
    private Integer recordType;
    /**
     * 开始时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    /**
     * 结束时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    /**
     * 判断是否通过审核（0通过，1不通过）
     */
    private Integer recordsState;


    public Integer getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(Integer recordsId) {
        this.recordsId = recordsId;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public Integer getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(Integer machineTypeId) {
        this.machineTypeId = machineTypeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getRepaireEmployeesName() {
        return repaireEmployeesName;
    }

    public void setRepaireEmployeesName(String repaireEmployeesName) {
        this.repaireEmployeesName = repaireEmployeesName;
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
    }

    public String getMethodDescription() {
        return methodDescription;
    }

    public void setMethodDescription(String methodDescription) {
        this.methodDescription = methodDescription;
    }

    public Date getMaintenanceTime() {
        return maintenanceTime;
    }

    public void setMaintenanceTime(Date maintenanceTime) {
        this.maintenanceTime = maintenanceTime;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getRecordsState() {
        return recordsState;
    }

    public void setRecordsState(Integer recordsState) {
        this.recordsState = recordsState;
    }

}

