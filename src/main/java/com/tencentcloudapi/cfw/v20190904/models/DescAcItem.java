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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescAcItem extends AbstractModel {

    /**
    * 访问源
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问目的
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

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
    * 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location,dnsparse
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 规则对应的唯一id
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * 规则有效性
    */
    @SerializedName("Invalid")
    @Expose
    private Long Invalid;

    /**
    * 0为正常规则,1为地域规则
    */
    @SerializedName("IsRegion")
    @Expose
    private Long IsRegion;

    /**
    * 国家id
    */
    @SerializedName("CountryCode")
    @Expose
    private Long CountryCode;

    /**
    * 城市id
    */
    @SerializedName("CityCode")
    @Expose
    private Long CityCode;

    /**
    * 国家名称
    */
    @SerializedName("CountryName")
    @Expose
    private String CountryName;

    /**
    * 省名称
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * 云厂商code
    */
    @SerializedName("CloudCode")
    @Expose
    private String CloudCode;

    /**
    * 0为正常规则,1为云厂商规则
    */
    @SerializedName("IsCloud")
    @Expose
    private Long IsCloud;

    /**
    * 规则状态，true表示启用，false表示禁用
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 规则方向：1，入向；0，出向
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 内部使用的uuid，一般情况下不会使用到该字段
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 关联任务详情
    */
    @SerializedName("BetaList")
    @Expose
    private BetaInfoByACL [] BetaList;

    /**
    * （1）互联网边界防火墙，生效范围：serial，串行；side，旁路；all，全局；
（2）NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 生效范围描述
    */
    @SerializedName("ScopeDesc")
    @Expose
    private String ScopeDesc;

    /**
    * 互联网边界防火墙使用的内部规则id
    */
    @SerializedName("InternetBorderUuid")
    @Expose
    private String InternetBorderUuid;

    /**
    * 协议端口组名称
    */
    @SerializedName("ParamTemplateName")
    @Expose
    private String ParamTemplateName;

    /**
    * 协议端口组ID
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * 访问源名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 访问目的名称
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 规则最近命中时间
    */
    @SerializedName("LastHitTime")
    @Expose
    private String LastHitTime;

    /**
    * 地区简称
    */
    @SerializedName("CountryKey")
    @Expose
    private String CountryKey;

    /**
    * 省份、城市简称
    */
    @SerializedName("CityKey")
    @Expose
    private String CityKey;

    /**
    * 规则创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则最近更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 访问源 
     * @return SourceContent 访问源
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源
     * @param SourceContent 访问源
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问目的 
     * @return TargetContent 访问目的
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set 访问目的
     * @param TargetContent 访问目的
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
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
     * Get 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察 
     * @return RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
     * @param RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag 
     * @return SourceType 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
     * @param SourceType 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location,dnsparse 
     * @return TargetType 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location,dnsparse
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location,dnsparse
     * @param TargetType 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location,dnsparse
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 规则对应的唯一id 
     * @return Uuid 规则对应的唯一id
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set 规则对应的唯一id
     * @param Uuid 规则对应的唯一id
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 规则有效性 
     * @return Invalid 规则有效性
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set 规则有效性
     * @param Invalid 规则有效性
     */
    public void setInvalid(Long Invalid) {
        this.Invalid = Invalid;
    }

    /**
     * Get 0为正常规则,1为地域规则 
     * @return IsRegion 0为正常规则,1为地域规则
     */
    public Long getIsRegion() {
        return this.IsRegion;
    }

    /**
     * Set 0为正常规则,1为地域规则
     * @param IsRegion 0为正常规则,1为地域规则
     */
    public void setIsRegion(Long IsRegion) {
        this.IsRegion = IsRegion;
    }

    /**
     * Get 国家id 
     * @return CountryCode 国家id
     */
    public Long getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 国家id
     * @param CountryCode 国家id
     */
    public void setCountryCode(Long CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 城市id 
     * @return CityCode 城市id
     */
    public Long getCityCode() {
        return this.CityCode;
    }

    /**
     * Set 城市id
     * @param CityCode 城市id
     */
    public void setCityCode(Long CityCode) {
        this.CityCode = CityCode;
    }

    /**
     * Get 国家名称 
     * @return CountryName 国家名称
     */
    public String getCountryName() {
        return this.CountryName;
    }

    /**
     * Set 国家名称
     * @param CountryName 国家名称
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    /**
     * Get 省名称 
     * @return CityName 省名称
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set 省名称
     * @param CityName 省名称
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get 云厂商code 
     * @return CloudCode 云厂商code
     */
    public String getCloudCode() {
        return this.CloudCode;
    }

    /**
     * Set 云厂商code
     * @param CloudCode 云厂商code
     */
    public void setCloudCode(String CloudCode) {
        this.CloudCode = CloudCode;
    }

    /**
     * Get 0为正常规则,1为云厂商规则 
     * @return IsCloud 0为正常规则,1为云厂商规则
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set 0为正常规则,1为云厂商规则
     * @param IsCloud 0为正常规则,1为云厂商规则
     */
    public void setIsCloud(Long IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get 规则状态，true表示启用，false表示禁用 
     * @return Enable 规则状态，true表示启用，false表示禁用
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 规则状态，true表示启用，false表示禁用
     * @param Enable 规则状态，true表示启用，false表示禁用
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 规则方向：1，入向；0，出向 
     * @return Direction 规则方向：1，入向；0，出向
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：1，入向；0，出向
     * @param Direction 规则方向：1，入向；0，出向
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
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
     * Get 内部使用的uuid，一般情况下不会使用到该字段 
     * @return InternalUuid 内部使用的uuid，一般情况下不会使用到该字段
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set 内部使用的uuid，一般情况下不会使用到该字段
     * @param InternalUuid 内部使用的uuid，一般情况下不会使用到该字段
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除 
     * @return Status 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除
     * @param Status 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 关联任务详情 
     * @return BetaList 关联任务详情
     */
    public BetaInfoByACL [] getBetaList() {
        return this.BetaList;
    }

    /**
     * Set 关联任务详情
     * @param BetaList 关联任务详情
     */
    public void setBetaList(BetaInfoByACL [] BetaList) {
        this.BetaList = BetaList;
    }

    /**
     * Get （1）互联网边界防火墙，生效范围：serial，串行；side，旁路；all，全局；
（2）NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度 
     * @return Scope （1）互联网边界防火墙，生效范围：serial，串行；side，旁路；all，全局；
（2）NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set （1）互联网边界防火墙，生效范围：serial，串行；side，旁路；all，全局；
（2）NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度
     * @param Scope （1）互联网边界防火墙，生效范围：serial，串行；side，旁路；all，全局；
（2）NAT边界防火墙：ALL，全局生效；ap-guangzhou，生效的地域；cfwnat-xxx，生效基于实例维度
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 生效范围描述 
     * @return ScopeDesc 生效范围描述
     */
    public String getScopeDesc() {
        return this.ScopeDesc;
    }

    /**
     * Set 生效范围描述
     * @param ScopeDesc 生效范围描述
     */
    public void setScopeDesc(String ScopeDesc) {
        this.ScopeDesc = ScopeDesc;
    }

    /**
     * Get 互联网边界防火墙使用的内部规则id 
     * @return InternetBorderUuid 互联网边界防火墙使用的内部规则id
     */
    public String getInternetBorderUuid() {
        return this.InternetBorderUuid;
    }

    /**
     * Set 互联网边界防火墙使用的内部规则id
     * @param InternetBorderUuid 互联网边界防火墙使用的内部规则id
     */
    public void setInternetBorderUuid(String InternetBorderUuid) {
        this.InternetBorderUuid = InternetBorderUuid;
    }

    /**
     * Get 协议端口组名称 
     * @return ParamTemplateName 协议端口组名称
     */
    public String getParamTemplateName() {
        return this.ParamTemplateName;
    }

    /**
     * Set 协议端口组名称
     * @param ParamTemplateName 协议端口组名称
     */
    public void setParamTemplateName(String ParamTemplateName) {
        this.ParamTemplateName = ParamTemplateName;
    }

    /**
     * Get 协议端口组ID 
     * @return ParamTemplateId 协议端口组ID
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 协议端口组ID
     * @param ParamTemplateId 协议端口组ID
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get 访问源名称 
     * @return SourceName 访问源名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 访问源名称
     * @param SourceName 访问源名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 访问目的名称 
     * @return TargetName 访问目的名称
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 访问目的名称
     * @param TargetName 访问目的名称
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 规则最近命中时间 
     * @return LastHitTime 规则最近命中时间
     */
    public String getLastHitTime() {
        return this.LastHitTime;
    }

    /**
     * Set 规则最近命中时间
     * @param LastHitTime 规则最近命中时间
     */
    public void setLastHitTime(String LastHitTime) {
        this.LastHitTime = LastHitTime;
    }

    /**
     * Get 地区简称 
     * @return CountryKey 地区简称
     */
    public String getCountryKey() {
        return this.CountryKey;
    }

    /**
     * Set 地区简称
     * @param CountryKey 地区简称
     */
    public void setCountryKey(String CountryKey) {
        this.CountryKey = CountryKey;
    }

    /**
     * Get 省份、城市简称 
     * @return CityKey 省份、城市简称
     */
    public String getCityKey() {
        return this.CityKey;
    }

    /**
     * Set 省份、城市简称
     * @param CityKey 省份、城市简称
     */
    public void setCityKey(String CityKey) {
        this.CityKey = CityKey;
    }

    /**
     * Get 规则创建时间 
     * @return CreateTime 规则创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 规则创建时间
     * @param CreateTime 规则创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 规则最近更新时间 
     * @return UpdateTime 规则最近更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 规则最近更新时间
     * @param UpdateTime 规则最近更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DescAcItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescAcItem(DescAcItem source) {
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.TargetContent != null) {
            this.TargetContent = new String(source.TargetContent);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.Uuid != null) {
            this.Uuid = new Long(source.Uuid);
        }
        if (source.Invalid != null) {
            this.Invalid = new Long(source.Invalid);
        }
        if (source.IsRegion != null) {
            this.IsRegion = new Long(source.IsRegion);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new Long(source.CountryCode);
        }
        if (source.CityCode != null) {
            this.CityCode = new Long(source.CityCode);
        }
        if (source.CountryName != null) {
            this.CountryName = new String(source.CountryName);
        }
        if (source.CityName != null) {
            this.CityName = new String(source.CityName);
        }
        if (source.CloudCode != null) {
            this.CloudCode = new String(source.CloudCode);
        }
        if (source.IsCloud != null) {
            this.IsCloud = new Long(source.IsCloud);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InternalUuid != null) {
            this.InternalUuid = new Long(source.InternalUuid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BetaList != null) {
            this.BetaList = new BetaInfoByACL[source.BetaList.length];
            for (int i = 0; i < source.BetaList.length; i++) {
                this.BetaList[i] = new BetaInfoByACL(source.BetaList[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.ScopeDesc != null) {
            this.ScopeDesc = new String(source.ScopeDesc);
        }
        if (source.InternetBorderUuid != null) {
            this.InternetBorderUuid = new String(source.InternetBorderUuid);
        }
        if (source.ParamTemplateName != null) {
            this.ParamTemplateName = new String(source.ParamTemplateName);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.LastHitTime != null) {
            this.LastHitTime = new String(source.LastHitTime);
        }
        if (source.CountryKey != null) {
            this.CountryKey = new String(source.CountryKey);
        }
        if (source.CityKey != null) {
            this.CityKey = new String(source.CityKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamSimple(map, prefix + "TargetContent", this.TargetContent);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Invalid", this.Invalid);
        this.setParamSimple(map, prefix + "IsRegion", this.IsRegion);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "CityCode", this.CityCode);
        this.setParamSimple(map, prefix + "CountryName", this.CountryName);
        this.setParamSimple(map, prefix + "CityName", this.CityName);
        this.setParamSimple(map, prefix + "CloudCode", this.CloudCode);
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InternalUuid", this.InternalUuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "BetaList.", this.BetaList);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ScopeDesc", this.ScopeDesc);
        this.setParamSimple(map, prefix + "InternetBorderUuid", this.InternetBorderUuid);
        this.setParamSimple(map, prefix + "ParamTemplateName", this.ParamTemplateName);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "LastHitTime", this.LastHitTime);
        this.setParamSimple(map, prefix + "CountryKey", this.CountryKey);
        this.setParamSimple(map, prefix + "CityKey", this.CityKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

