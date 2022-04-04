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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BruteAttackInfo extends AbstractModel{

    /**
    * 唯一Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 云镜客户端唯一标识UUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 来源ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * SUCCESS：破解成功；FAILED：破解失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 国家id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * 城市id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * 省份id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private Long Province;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 阻断状态：1-阻断成功；非1-阻断失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BanStatus")
    @Expose
    private Long BanStatus;

    /**
    * 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的帐号事件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 发生次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 机器UUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 是否为专业版（true/false）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * 被攻击的服务的用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0：待处理，1：忽略，5：已处理，6：加入白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataStatus")
    @Expose
    private Long DataStatus;

    /**
     * Get 唯一Id 
     * @return Id 唯一Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一Id
     * @param Id 唯一Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 云镜客户端唯一标识UUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid 云镜客户端唯一标识UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜客户端唯一标识UUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid 云镜客户端唯一标识UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineIp 主机ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineIp 主机ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 来源ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcIp 来源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 来源ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcIp 来源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get SUCCESS：破解成功；FAILED：破解失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status SUCCESS：破解成功；FAILED：破解失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set SUCCESS：破解成功；FAILED：破解失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status SUCCESS：破解成功；FAILED：破解失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 国家id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Country 国家id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set 国家id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Country 国家id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get 城市id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 城市id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set 城市id
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 城市id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get 省份id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 省份id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProvince() {
        return this.Province;
    }

    /**
     * Set 省份id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 省份id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(Long Province) {
        this.Province = Province;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 阻断状态：1-阻断成功；非1-阻断失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BanStatus 阻断状态：1-阻断成功；非1-阻断失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set 阻断状态：1-阻断成功；非1-阻断失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param BanStatus 阻断状态：1-阻断成功；非1-阻断失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBanStatus(Long BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的帐号事件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventType 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的帐号事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的帐号事件
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventType 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的帐号事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 发生次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 发生次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 发生次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 发生次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 机器UUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quuid 机器UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器UUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quuid 机器UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 是否为专业版（true/false）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsProVersion 是否为专业版（true/false）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set 是否为专业版（true/false）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsProVersion 是否为专业版（true/false）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get 被攻击的服务的用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 被攻击的服务的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 被攻击的服务的用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 被攻击的服务的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 最近攻击时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 0：待处理，1：忽略，5：已处理，6：加入白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataStatus 0：待处理，1：忽略，5：已处理，6：加入白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataStatus() {
        return this.DataStatus;
    }

    /**
     * Set 0：待处理，1：忽略，5：已处理，6：加入白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataStatus 0：待处理，1：忽略，5：已处理，6：加入白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataStatus(Long DataStatus) {
        this.DataStatus = DataStatus;
    }

    public BruteAttackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BruteAttackInfo(BruteAttackInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Country != null) {
            this.Country = new Long(source.Country);
        }
        if (source.City != null) {
            this.City = new Long(source.City);
        }
        if (source.Province != null) {
            this.Province = new Long(source.Province);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BanStatus != null) {
            this.BanStatus = new Long(source.BanStatus);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Boolean(source.IsProVersion);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DataStatus != null) {
            this.DataStatus = new Long(source.DataStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DataStatus", this.DataStatus);

    }
}

