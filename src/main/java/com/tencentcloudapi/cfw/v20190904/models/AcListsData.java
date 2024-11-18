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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AcListsData extends AbstractModel {

    /**
    * 规则id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 访问源
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 访问目的
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 策略
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 命中次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 执行顺序
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 告警规则id
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * 规则开关状态 1打开 0关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则源类型
    */
    @SerializedName("SrcType")
    @Expose
    private Long SrcType;

    /**
    * 规则目的类型
    */
    @SerializedName("DstType")
    @Expose
    private Long DstType;

    /**
    * 规则唯一ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 规则有效性
1 有效
0 无效
    */
    @SerializedName("Invalid")
    @Expose
    private Long Invalid;

    /**
    * 是否地域规则
    */
    @SerializedName("IsRegion")
    @Expose
    private Long IsRegion;

    /**
    * 云厂商代码
    */
    @SerializedName("CloudCode")
    @Expose
    private String CloudCode;

    /**
    * 自动化助手信息
    */
    @SerializedName("AutoTask")
    @Expose
    private String AutoTask;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 地域码信息
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 国家代码
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * 城市代码
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * 国家名称
    */
    @SerializedName("RegName1")
    @Expose
    private String RegName1;

    /**
    * 城市名称
    */
    @SerializedName("RegName2")
    @Expose
    private String RegName2;

    /**
     * Get 规则id 
     * @return Id 规则id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则id
     * @param Id 规则id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 访问源 
     * @return SourceIp 访问源
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 访问源
     * @param SourceIp 访问源
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 访问目的 
     * @return TargetIp 访问目的
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set 访问目的
     * @param TargetIp 访问目的
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 策略 
     * @return Strategy 策略
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 策略
     * @param Strategy 策略
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 描述 
     * @return Detail 描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
     * @param Detail 描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 命中次数 
     * @return Count 命中次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 命中次数
     * @param Count 命中次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 执行顺序 
     * @return OrderIndex 执行顺序
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 执行顺序
     * @param OrderIndex 执行顺序
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 告警规则id 
     * @return LogId 告警规则id
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set 告警规则id
     * @param LogId 告警规则id
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 规则开关状态 1打开 0关闭 
     * @return Status 规则开关状态 1打开 0关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关状态 1打开 0关闭
     * @param Status 规则开关状态 1打开 0关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则源类型 
     * @return SrcType 规则源类型
     */
    public Long getSrcType() {
        return this.SrcType;
    }

    /**
     * Set 规则源类型
     * @param SrcType 规则源类型
     */
    public void setSrcType(Long SrcType) {
        this.SrcType = SrcType;
    }

    /**
     * Get 规则目的类型 
     * @return DstType 规则目的类型
     */
    public Long getDstType() {
        return this.DstType;
    }

    /**
     * Set 规则目的类型
     * @param DstType 规则目的类型
     */
    public void setDstType(Long DstType) {
        this.DstType = DstType;
    }

    /**
     * Get 规则唯一ID 
     * @return Uuid 规则唯一ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 规则唯一ID
     * @param Uuid 规则唯一ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 规则有效性
1 有效
0 无效 
     * @return Invalid 规则有效性
1 有效
0 无效
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set 规则有效性
1 有效
0 无效
     * @param Invalid 规则有效性
1 有效
0 无效
     */
    public void setInvalid(Long Invalid) {
        this.Invalid = Invalid;
    }

    /**
     * Get 是否地域规则 
     * @return IsRegion 是否地域规则
     */
    public Long getIsRegion() {
        return this.IsRegion;
    }

    /**
     * Set 是否地域规则
     * @param IsRegion 是否地域规则
     */
    public void setIsRegion(Long IsRegion) {
        this.IsRegion = IsRegion;
    }

    /**
     * Get 云厂商代码 
     * @return CloudCode 云厂商代码
     */
    public String getCloudCode() {
        return this.CloudCode;
    }

    /**
     * Set 云厂商代码
     * @param CloudCode 云厂商代码
     */
    public void setCloudCode(String CloudCode) {
        this.CloudCode = CloudCode;
    }

    /**
     * Get 自动化助手信息 
     * @return AutoTask 自动化助手信息
     */
    public String getAutoTask() {
        return this.AutoTask;
    }

    /**
     * Set 自动化助手信息
     * @param AutoTask 自动化助手信息
     */
    public void setAutoTask(String AutoTask) {
        this.AutoTask = AutoTask;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 地域码信息 
     * @return RegionCode 地域码信息
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地域码信息
     * @param RegionCode 地域码信息
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 国家代码 
     * @return Country 国家代码
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set 国家代码
     * @param Country 国家代码
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get 城市代码 
     * @return City 城市代码
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set 城市代码
     * @param City 城市代码
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get 国家名称 
     * @return RegName1 国家名称
     */
    public String getRegName1() {
        return this.RegName1;
    }

    /**
     * Set 国家名称
     * @param RegName1 国家名称
     */
    public void setRegName1(String RegName1) {
        this.RegName1 = RegName1;
    }

    /**
     * Get 城市名称 
     * @return RegName2 城市名称
     */
    public String getRegName2() {
        return this.RegName2;
    }

    /**
     * Set 城市名称
     * @param RegName2 城市名称
     */
    public void setRegName2(String RegName2) {
        this.RegName2 = RegName2;
    }

    public AcListsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcListsData(AcListsData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SrcType != null) {
            this.SrcType = new Long(source.SrcType);
        }
        if (source.DstType != null) {
            this.DstType = new Long(source.DstType);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Invalid != null) {
            this.Invalid = new Long(source.Invalid);
        }
        if (source.IsRegion != null) {
            this.IsRegion = new Long(source.IsRegion);
        }
        if (source.CloudCode != null) {
            this.CloudCode = new String(source.CloudCode);
        }
        if (source.AutoTask != null) {
            this.AutoTask = new String(source.AutoTask);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.Country != null) {
            this.Country = new Long(source.Country);
        }
        if (source.City != null) {
            this.City = new Long(source.City);
        }
        if (source.RegName1 != null) {
            this.RegName1 = new String(source.RegName1);
        }
        if (source.RegName2 != null) {
            this.RegName2 = new String(source.RegName2);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SrcType", this.SrcType);
        this.setParamSimple(map, prefix + "DstType", this.DstType);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Invalid", this.Invalid);
        this.setParamSimple(map, prefix + "IsRegion", this.IsRegion);
        this.setParamSimple(map, prefix + "CloudCode", this.CloudCode);
        this.setParamSimple(map, prefix + "AutoTask", this.AutoTask);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "RegName1", this.RegName1);
        this.setParamSimple(map, prefix + "RegName2", this.RegName2);

    }
}

