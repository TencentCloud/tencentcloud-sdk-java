/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BruteAttackInfo extends AbstractModel {

    /**
    * 唯一Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机安全客户端唯一标识UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机ip
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 来源ip
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * SUCCESS：破解成功；FAILED：破解失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 国家id
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * 城市id
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * 省份id
    */
    @SerializedName("Province")
    @Expose
    private Long Province;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 0 -不阻断(客户端版本不支持)
1 -已阻断
2 -阻断失败(程序异常)
3 -不阻断(内网不阻断)
4 -可用区不支持阻断
10-阻断中
81-不阻断(未开启阻断)
82-不阻断(非专业版)
83-不阻断(已加白名单)
86-不阻断(系统白名单)
87-不阻断(客户端离线)
88-不阻断(来源Ip归属相同客户)
89-不阻断(ipv6不支持阻断)
    */
    @SerializedName("BanStatus")
    @Expose
    private Long BanStatus;

    /**
    * 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的账号事件
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 发生次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 机器UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 是否为专业版（true/false）
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * 被攻击的服务的用户名
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 最近攻击时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0：待处理，1：忽略，5：已处理，6：加入白名单
    */
    @SerializedName("DataStatus")
    @Expose
    private Long DataStatus;

    /**
    * 附加信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 地理位置中文名
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 威胁等级：0低危，1中危，2高危
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 事件来源：0--阻断规则，1--威胁情报
    */
    @SerializedName("DataFrom")
    @Expose
    private Long DataFrom;

    /**
    * 破解状态说明
    */
    @SerializedName("AttackStatusDesc")
    @Expose
    private String AttackStatusDesc;

    /**
    * 阻断过期时间（仅阻断中事件有效）
    */
    @SerializedName("BanExpiredTime")
    @Expose
    private String BanExpiredTime;

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
     * Get 主机安全客户端唯一标识UUID 
     * @return Uuid 主机安全客户端唯一标识UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全客户端唯一标识UUID
     * @param Uuid 主机安全客户端唯一标识UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机ip 
     * @return MachineIp 主机ip
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机ip
     * @param MachineIp 主机ip
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机名 
     * @return MachineName 主机名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名
     * @param MachineName 主机名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 来源ip 
     * @return SrcIp 来源ip
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 来源ip
     * @param SrcIp 来源ip
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get SUCCESS：破解成功；FAILED：破解失败 
     * @return Status SUCCESS：破解成功；FAILED：破解失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set SUCCESS：破解成功；FAILED：破解失败
     * @param Status SUCCESS：破解成功；FAILED：破解失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 国家id 
     * @return Country 国家id
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set 国家id
     * @param Country 国家id
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get 城市id 
     * @return City 城市id
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set 城市id
     * @param City 城市id
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get 省份id 
     * @return Province 省份id
     */
    public Long getProvince() {
        return this.Province;
    }

    /**
     * Set 省份id
     * @param Province 省份id
     */
    public void setProvince(Long Province) {
        this.Province = Province;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 0 -不阻断(客户端版本不支持)
1 -已阻断
2 -阻断失败(程序异常)
3 -不阻断(内网不阻断)
4 -可用区不支持阻断
10-阻断中
81-不阻断(未开启阻断)
82-不阻断(非专业版)
83-不阻断(已加白名单)
86-不阻断(系统白名单)
87-不阻断(客户端离线)
88-不阻断(来源Ip归属相同客户)
89-不阻断(ipv6不支持阻断) 
     * @return BanStatus 0 -不阻断(客户端版本不支持)
1 -已阻断
2 -阻断失败(程序异常)
3 -不阻断(内网不阻断)
4 -可用区不支持阻断
10-阻断中
81-不阻断(未开启阻断)
82-不阻断(非专业版)
83-不阻断(已加白名单)
86-不阻断(系统白名单)
87-不阻断(客户端离线)
88-不阻断(来源Ip归属相同客户)
89-不阻断(ipv6不支持阻断)
     */
    public Long getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set 0 -不阻断(客户端版本不支持)
1 -已阻断
2 -阻断失败(程序异常)
3 -不阻断(内网不阻断)
4 -可用区不支持阻断
10-阻断中
81-不阻断(未开启阻断)
82-不阻断(非专业版)
83-不阻断(已加白名单)
86-不阻断(系统白名单)
87-不阻断(客户端离线)
88-不阻断(来源Ip归属相同客户)
89-不阻断(ipv6不支持阻断)
     * @param BanStatus 0 -不阻断(客户端版本不支持)
1 -已阻断
2 -阻断失败(程序异常)
3 -不阻断(内网不阻断)
4 -可用区不支持阻断
10-阻断中
81-不阻断(未开启阻断)
82-不阻断(非专业版)
83-不阻断(已加白名单)
86-不阻断(系统白名单)
87-不阻断(客户端离线)
88-不阻断(来源Ip归属相同客户)
89-不阻断(ipv6不支持阻断)
     */
    public void setBanStatus(Long BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的账号事件 
     * @return EventType 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的账号事件
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的账号事件
     * @param EventType 事件类型：200-暴力破解事件，300-暴力破解成功事件（页面展示），400-暴力破解不存在的账号事件
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 发生次数 
     * @return Count 发生次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 发生次数
     * @param Count 发生次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 机器UUID 
     * @return Quuid 机器UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器UUID
     * @param Quuid 机器UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 是否为专业版（true/false） 
     * @return IsProVersion 是否为专业版（true/false）
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set 是否为专业版（true/false）
     * @param IsProVersion 是否为专业版（true/false）
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get 被攻击的服务的用户名 
     * @return Protocol 被攻击的服务的用户名
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 被攻击的服务的用户名
     * @param Protocol 被攻击的服务的用户名
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 最近攻击时间 
     * @return ModifyTime 最近攻击时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近攻击时间
     * @param ModifyTime 最近攻击时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 0：待处理，1：忽略，5：已处理，6：加入白名单 
     * @return DataStatus 0：待处理，1：忽略，5：已处理，6：加入白名单
     */
    public Long getDataStatus() {
        return this.DataStatus;
    }

    /**
     * Set 0：待处理，1：忽略，5：已处理，6：加入白名单
     * @param DataStatus 0：待处理，1：忽略，5：已处理，6：加入白名单
     */
    public void setDataStatus(Long DataStatus) {
        this.DataStatus = DataStatus;
    }

    /**
     * Get 附加信息 
     * @return MachineExtraInfo 附加信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 附加信息
     * @param MachineExtraInfo 附加信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get 地理位置中文名 
     * @return Location 地理位置中文名
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 地理位置中文名
     * @param Location 地理位置中文名
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 威胁等级：0低危，1中危，2高危 
     * @return RiskLevel 威胁等级：0低危，1中危，2高危
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 威胁等级：0低危，1中危，2高危
     * @param RiskLevel 威胁等级：0低危，1中危，2高危
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 事件来源：0--阻断规则，1--威胁情报 
     * @return DataFrom 事件来源：0--阻断规则，1--威胁情报
     */
    public Long getDataFrom() {
        return this.DataFrom;
    }

    /**
     * Set 事件来源：0--阻断规则，1--威胁情报
     * @param DataFrom 事件来源：0--阻断规则，1--威胁情报
     */
    public void setDataFrom(Long DataFrom) {
        this.DataFrom = DataFrom;
    }

    /**
     * Get 破解状态说明 
     * @return AttackStatusDesc 破解状态说明
     */
    public String getAttackStatusDesc() {
        return this.AttackStatusDesc;
    }

    /**
     * Set 破解状态说明
     * @param AttackStatusDesc 破解状态说明
     */
    public void setAttackStatusDesc(String AttackStatusDesc) {
        this.AttackStatusDesc = AttackStatusDesc;
    }

    /**
     * Get 阻断过期时间（仅阻断中事件有效） 
     * @return BanExpiredTime 阻断过期时间（仅阻断中事件有效）
     */
    public String getBanExpiredTime() {
        return this.BanExpiredTime;
    }

    /**
     * Set 阻断过期时间（仅阻断中事件有效）
     * @param BanExpiredTime 阻断过期时间（仅阻断中事件有效）
     */
    public void setBanExpiredTime(String BanExpiredTime) {
        this.BanExpiredTime = BanExpiredTime;
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
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.DataFrom != null) {
            this.DataFrom = new Long(source.DataFrom);
        }
        if (source.AttackStatusDesc != null) {
            this.AttackStatusDesc = new String(source.AttackStatusDesc);
        }
        if (source.BanExpiredTime != null) {
            this.BanExpiredTime = new String(source.BanExpiredTime);
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
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "DataFrom", this.DataFrom);
        this.setParamSimple(map, prefix + "AttackStatusDesc", this.AttackStatusDesc);
        this.setParamSimple(map, prefix + "BanExpiredTime", this.BanExpiredTime);

    }
}

