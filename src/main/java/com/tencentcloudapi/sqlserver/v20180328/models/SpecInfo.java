/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecInfo  extends AbstractModel{

    /**
    * 实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例
    */
    @SerializedName("SpecId")
    @Expose
    private Integer SpecId;

    /**
    * 机型ID
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 机型中文名称
    */
    @SerializedName("MachineTypeName")
    @Expose
    private String MachineTypeName;

    /**
    * 数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Version字段对应的版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 内存大小，单位GB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * CPU核数
    */
    @SerializedName("CPU")
    @Expose
    private Integer CPU;

    /**
    * 此规格下最小的磁盘大小，单位GB
    */
    @SerializedName("MinStorage")
    @Expose
    private Integer MinStorage;

    /**
    * 此规格下最大的磁盘大小，单位GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Integer MaxStorage;

    /**
    * 此规格对应的QPS大小
    */
    @SerializedName("QPS")
    @Expose
    private Integer QPS;

    /**
    * 此规格的中文描述信息
    */
    @SerializedName("SuitInfo")
    @Expose
    private String SuitInfo;

    /**
    * 此规格对应的包年包月Pid
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
    * 此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostPid")
    @Expose
    private Integer [] PostPid;

    /**
    * 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
    */
    @SerializedName("PayModeStatus")
    @Expose
    private String PayModeStatus;

    /**
     * 获取实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例
     * @return SpecId 实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例
     */
    public Integer getSpecId() {
        return this.SpecId;
    }

    /**
     * 设置实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例
     * @param SpecId 实例规格ID，利用DescribeZones返回的SpecId，结合DescribeProductConfig返回的可售卖规格信息，可获悉某个可用区下可购买什么规格的实例
     */
    public void setSpecId(Integer SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * 获取机型ID
     * @return MachineType 机型ID
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * 设置机型ID
     * @param MachineType 机型ID
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * 获取机型中文名称
     * @return MachineTypeName 机型中文名称
     */
    public String getMachineTypeName() {
        return this.MachineTypeName;
    }

    /**
     * 设置机型中文名称
     * @param MachineTypeName 机型中文名称
     */
    public void setMachineTypeName(String MachineTypeName) {
        this.MachineTypeName = MachineTypeName;
    }

    /**
     * 获取数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     * @return Version 数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * 设置数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     * @param Version 数据库版本信息。取值为2008R2（表示SQL Server 2008 R2），2012SP3（表示SQL Server 2012），2016SP1（表示SQL Server 2016 SP1）
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * 获取Version字段对应的版本名称
     * @return VersionName Version字段对应的版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * 设置Version字段对应的版本名称
     * @param VersionName Version字段对应的版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * 获取内存大小，单位GB
     * @return Memory 内存大小，单位GB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存大小，单位GB
     * @param Memory 内存大小，单位GB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取CPU核数
     * @return CPU CPU核数
     */
    public Integer getCPU() {
        return this.CPU;
    }

    /**
     * 设置CPU核数
     * @param CPU CPU核数
     */
    public void setCPU(Integer CPU) {
        this.CPU = CPU;
    }

    /**
     * 获取此规格下最小的磁盘大小，单位GB
     * @return MinStorage 此规格下最小的磁盘大小，单位GB
     */
    public Integer getMinStorage() {
        return this.MinStorage;
    }

    /**
     * 设置此规格下最小的磁盘大小，单位GB
     * @param MinStorage 此规格下最小的磁盘大小，单位GB
     */
    public void setMinStorage(Integer MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * 获取此规格下最大的磁盘大小，单位GB
     * @return MaxStorage 此规格下最大的磁盘大小，单位GB
     */
    public Integer getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * 设置此规格下最大的磁盘大小，单位GB
     * @param MaxStorage 此规格下最大的磁盘大小，单位GB
     */
    public void setMaxStorage(Integer MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * 获取此规格对应的QPS大小
     * @return QPS 此规格对应的QPS大小
     */
    public Integer getQPS() {
        return this.QPS;
    }

    /**
     * 设置此规格对应的QPS大小
     * @param QPS 此规格对应的QPS大小
     */
    public void setQPS(Integer QPS) {
        this.QPS = QPS;
    }

    /**
     * 获取此规格的中文描述信息
     * @return SuitInfo 此规格的中文描述信息
     */
    public String getSuitInfo() {
        return this.SuitInfo;
    }

    /**
     * 设置此规格的中文描述信息
     * @param SuitInfo 此规格的中文描述信息
     */
    public void setSuitInfo(String SuitInfo) {
        this.SuitInfo = SuitInfo;
    }

    /**
     * 获取此规格对应的包年包月Pid
     * @return Pid 此规格对应的包年包月Pid
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置此规格对应的包年包月Pid
     * @param Pid 此规格对应的包年包月Pid
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 获取此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。
     * @return PostPid 此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer [] getPostPid() {
        return this.PostPid;
    }

    /**
     * 设置此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostPid 此规格对应的按量计费Pid列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostPid(Integer [] PostPid) {
        this.PostPid = PostPid;
    }

    /**
     * 获取此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     * @return PayModeStatus 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     */
    public String getPayModeStatus() {
        return this.PayModeStatus;
    }

    /**
     * 设置此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     * @param PayModeStatus 此规格下支持的付费模式，POST-仅支持按量计费 PRE-仅支持包年包月 ALL-支持所有
     */
    public void setPayModeStatus(String PayModeStatus) {
        this.PayModeStatus = PayModeStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineTypeName", this.MachineTypeName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "QPS", this.QPS);
        this.setParamSimple(map, prefix + "SuitInfo", this.SuitInfo);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamArraySimple(map, prefix + "PostPid.", this.PostPid);
        this.setParamSimple(map, prefix + "PayModeStatus", this.PayModeStatus);

    }
}

