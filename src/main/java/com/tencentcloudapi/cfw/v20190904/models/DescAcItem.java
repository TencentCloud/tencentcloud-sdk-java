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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescAcItem extends AbstractModel{

    /**
    * 访问源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 访问目的
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetContent")
    @Expose
    private String TargetContent;

    /**
    * 协议
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
    private String Port;

    /**
    * 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 规则对应的唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private Long Uuid;

    /**
    * 规则有效性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Invalid")
    @Expose
    private Long Invalid;

    /**
    * 0为正常规则,1为地域规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRegion")
    @Expose
    private Long IsRegion;

    /**
    * 国家id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountryCode")
    @Expose
    private Long CountryCode;

    /**
    * 城市id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityCode")
    @Expose
    private Long CityCode;

    /**
    * 国家名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountryName")
    @Expose
    private String CountryName;

    /**
    * 省名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * 云厂商code
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudCode")
    @Expose
    private String CloudCode;

    /**
    * 0为正常规则,1为云厂商规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCloud")
    @Expose
    private Long IsCloud;

    /**
    * 规则状态，true表示启用，false表示禁用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 规则方向：1，入向；0，出向
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 内部使用的uuid，一般情况下不会使用到该字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternalUuid")
    @Expose
    private Long InternalUuid;

    /**
    * 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 关联任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BetaList")
    @Expose
    private BetaInfoByACL [] BetaList;

    /**
    * 生效范围：serial，串行；side，旁路；all，全局
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 互联网边界防火墙使用的内部规则id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetBorderUuid")
    @Expose
    private String InternetBorderUuid;

    /**
     * Get 访问源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceContent 访问源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 访问源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceContent 访问源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 访问目的
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetContent 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetContent() {
        return this.TargetContent;
    }

    /**
     * Set 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetContent 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetContent(String TargetContent) {
        this.TargetContent = TargetContent;
    }

    /**
     * Get 协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议
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
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleAction 访问控制策略中设置的流量通过云防火墙的方式。取值： accept：放行 drop：拒绝 log：观察
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 访问源类型：入向规则时类型可以为 ip,net,template,location；出向规则时可以为 ip,net,template,instance,group,tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetType 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetType 访问目的类型：入向规则时类型可以为ip,net,template,instance,group,tag；出向规则时可以为 ip,net,domain,template,location
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 规则对应的唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid 规则对应的唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUuid() {
        return this.Uuid;
    }

    /**
     * Set 规则对应的唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid 规则对应的唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(Long Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 规则有效性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Invalid 规则有效性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInvalid() {
        return this.Invalid;
    }

    /**
     * Set 规则有效性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Invalid 规则有效性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvalid(Long Invalid) {
        this.Invalid = Invalid;
    }

    /**
     * Get 0为正常规则,1为地域规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRegion 0为正常规则,1为地域规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRegion() {
        return this.IsRegion;
    }

    /**
     * Set 0为正常规则,1为地域规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRegion 0为正常规则,1为地域规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRegion(Long IsRegion) {
        this.IsRegion = IsRegion;
    }

    /**
     * Get 国家id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountryCode 国家id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 国家id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountryCode 国家id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountryCode(Long CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 城市id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityCode 城市id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCityCode() {
        return this.CityCode;
    }

    /**
     * Set 城市id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityCode 城市id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityCode(Long CityCode) {
        this.CityCode = CityCode;
    }

    /**
     * Get 国家名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountryName 国家名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountryName() {
        return this.CountryName;
    }

    /**
     * Set 国家名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountryName 国家名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    /**
     * Get 省名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityName 省名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set 省名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityName 省名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get 云厂商code
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudCode 云厂商code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloudCode() {
        return this.CloudCode;
    }

    /**
     * Set 云厂商code
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudCode 云厂商code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudCode(String CloudCode) {
        this.CloudCode = CloudCode;
    }

    /**
     * Get 0为正常规则,1为云厂商规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCloud 0为正常规则,1为云厂商规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set 0为正常规则,1为云厂商规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCloud 0为正常规则,1为云厂商规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCloud(Long IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get 规则状态，true表示启用，false表示禁用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 规则状态，true表示启用，false表示禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 规则状态，true表示启用，false表示禁用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 规则状态，true表示启用，false表示禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 规则方向：1，入向；0，出向
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Direction 规则方向：1，入向；0，出向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 规则方向：1，入向；0，出向
注意：此字段可能返回 null，表示取不到有效值。
     * @param Direction 规则方向：1，入向；0，出向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 内部使用的uuid，一般情况下不会使用到该字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternalUuid 内部使用的uuid，一般情况下不会使用到该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInternalUuid() {
        return this.InternalUuid;
    }

    /**
     * Set 内部使用的uuid，一般情况下不会使用到该字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternalUuid 内部使用的uuid，一般情况下不会使用到该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternalUuid(Long InternalUuid) {
        this.InternalUuid = InternalUuid;
    }

    /**
     * Get 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 规则状态，查询规则命中详情时该字段有效，0：新增，1: 已删除, 2: 编辑删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 关联任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BetaList 关联任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BetaInfoByACL [] getBetaList() {
        return this.BetaList;
    }

    /**
     * Set 关联任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param BetaList 关联任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBetaList(BetaInfoByACL [] BetaList) {
        this.BetaList = BetaList;
    }

    /**
     * Get 生效范围：serial，串行；side，旁路；all，全局
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope 生效范围：serial，串行；side，旁路；all，全局
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 生效范围：serial，串行；side，旁路；all，全局
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope 生效范围：serial，串行；side，旁路；all，全局
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 互联网边界防火墙使用的内部规则id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetBorderUuid 互联网边界防火墙使用的内部规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInternetBorderUuid() {
        return this.InternetBorderUuid;
    }

    /**
     * Set 互联网边界防火墙使用的内部规则id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetBorderUuid 互联网边界防火墙使用的内部规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetBorderUuid(String InternetBorderUuid) {
        this.InternetBorderUuid = InternetBorderUuid;
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
        if (source.InternetBorderUuid != null) {
            this.InternetBorderUuid = new String(source.InternetBorderUuid);
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
        this.setParamSimple(map, prefix + "InternetBorderUuid", this.InternetBorderUuid);

    }
}

