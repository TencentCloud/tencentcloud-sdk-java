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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEvent extends AbstractModel{

    /**
    * Md5值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldIdMd5")
    @Expose
    private String OldIdMd5;

    /**
    * 事件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 事件类型一级分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventType1")
    @Expose
    private Long EventType1;

    /**
    * 事件类型二级分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventType2")
    @Expose
    private Long EventType2;

    /**
    * 事件等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 处理状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 源ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 目的ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 目的端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dstport")
    @Expose
    private Long Dstport;

    /**
    * 资产ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetIp")
    @Expose
    private String AssetIp;

    /**
    * 资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 安全事件唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaEventUniqid")
    @Expose
    private String SsaEventUniqid;

    /**
    * 资产id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 事件来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 索引中的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 受影响资产是否已下线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAssetDeleted")
    @Expose
    private String IsAssetDeleted;

    /**
    * 源ip所属地
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaSrcCountry")
    @Expose
    private String SsaSrcCountry;

    /**
    * 目的ip所属地
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaDstCountry")
    @Expose
    private String SsaDstCountry;

    /**
    * 木马类型的描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaDescription")
    @Expose
    private String SsaDescription;

    /**
    * 供给链类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaAttackChain")
    @Expose
    private String SsaAttackChain;

    /**
    * 受影响组件
    */
    @SerializedName("RuleComponents")
    @Expose
    private String RuleComponents;

    /**
    * 资产ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetIpAll")
    @Expose
    private String [] AssetIpAll;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * cvm类型资产的公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * cvm类型资产的内网ip
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * 事件响应状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoarResponseStatus")
    @Expose
    private Long SoarResponseStatus;

    /**
    * 事件最近响应时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoarResponseTime")
    @Expose
    private Long SoarResponseTime;

    /**
    * 事件建议处理状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoarSuggestStatus")
    @Expose
    private Long SoarSuggestStatus;

    /**
    * 事件剧本类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoarPlaybookType")
    @Expose
    private String SoarPlaybookType;

    /**
    * 剧本任务Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoarRunId")
    @Expose
    private String SoarRunId;

    /**
    * 事件Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SsaEventId")
    @Expose
    private String SsaEventId;

    /**
    * 是否新接入的云防事件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNewCfwEvent")
    @Expose
    private Boolean IsNewCfwEvent;

    /**
    * 出入站方向
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get Md5值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldIdMd5 Md5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldIdMd5() {
        return this.OldIdMd5;
    }

    /**
     * Set Md5值
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldIdMd5 Md5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldIdMd5(String OldIdMd5) {
        this.OldIdMd5 = OldIdMd5;
    }

    /**
     * Get 事件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventName 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventName 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 事件类型一级分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventType1 事件类型一级分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventType1() {
        return this.EventType1;
    }

    /**
     * Set 事件类型一级分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventType1 事件类型一级分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventType1(Long EventType1) {
        this.EventType1 = EventType1;
    }

    /**
     * Get 事件类型二级分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventType2 事件类型二级分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventType2() {
        return this.EventType2;
    }

    /**
     * Set 事件类型二级分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventType2 事件类型二级分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventType2(Long EventType2) {
        this.EventType2 = EventType2;
    }

    /**
     * Get 事件等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 事件等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 事件等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 事件等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 处理状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 处理状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 处理状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 源ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcIp 源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 源ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcIp 源ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 目的ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstIp 目的ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目的ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstIp 目的ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 事件发生时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 目的端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dstport 目的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDstport() {
        return this.Dstport;
    }

    /**
     * Set 目的端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dstport 目的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstport(Long Dstport) {
        this.Dstport = Dstport;
    }

    /**
     * Get 资产ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetIp 资产ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetIp() {
        return this.AssetIp;
    }

    /**
     * Set 资产ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetIp 资产ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetIp(String AssetIp) {
        this.AssetIp = AssetIp;
    }

    /**
     * Get 资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 安全事件唯一标识符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaEventUniqid 安全事件唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaEventUniqid() {
        return this.SsaEventUniqid;
    }

    /**
     * Set 安全事件唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaEventUniqid 安全事件唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaEventUniqid(String SsaEventUniqid) {
        this.SsaEventUniqid = SsaEventUniqid;
    }

    /**
     * Get 资产id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 事件来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 事件来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 事件来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 事件来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 索引中的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 索引中的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 索引中的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 索引中的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 受影响资产是否已下线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAssetDeleted 受影响资产是否已下线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsAssetDeleted() {
        return this.IsAssetDeleted;
    }

    /**
     * Set 受影响资产是否已下线
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAssetDeleted 受影响资产是否已下线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAssetDeleted(String IsAssetDeleted) {
        this.IsAssetDeleted = IsAssetDeleted;
    }

    /**
     * Get 源ip所属地
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaSrcCountry 源ip所属地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaSrcCountry() {
        return this.SsaSrcCountry;
    }

    /**
     * Set 源ip所属地
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaSrcCountry 源ip所属地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaSrcCountry(String SsaSrcCountry) {
        this.SsaSrcCountry = SsaSrcCountry;
    }

    /**
     * Get 目的ip所属地
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaDstCountry 目的ip所属地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaDstCountry() {
        return this.SsaDstCountry;
    }

    /**
     * Set 目的ip所属地
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaDstCountry 目的ip所属地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaDstCountry(String SsaDstCountry) {
        this.SsaDstCountry = SsaDstCountry;
    }

    /**
     * Get 木马类型的描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaDescription 木马类型的描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaDescription() {
        return this.SsaDescription;
    }

    /**
     * Set 木马类型的描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaDescription 木马类型的描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaDescription(String SsaDescription) {
        this.SsaDescription = SsaDescription;
    }

    /**
     * Get 供给链类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaAttackChain 供给链类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaAttackChain() {
        return this.SsaAttackChain;
    }

    /**
     * Set 供给链类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaAttackChain 供给链类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaAttackChain(String SsaAttackChain) {
        this.SsaAttackChain = SsaAttackChain;
    }

    /**
     * Get 受影响组件 
     * @return RuleComponents 受影响组件
     */
    public String getRuleComponents() {
        return this.RuleComponents;
    }

    /**
     * Set 受影响组件
     * @param RuleComponents 受影响组件
     */
    public void setRuleComponents(String RuleComponents) {
        this.RuleComponents = RuleComponents;
    }

    /**
     * Get 资产ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetIpAll 资产ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAssetIpAll() {
        return this.AssetIpAll;
    }

    /**
     * Set 资产ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetIpAll 资产ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetIpAll(String [] AssetIpAll) {
        this.AssetIpAll = AssetIpAll;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get cvm类型资产的公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpAddresses cvm类型资产的公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set cvm类型资产的公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpAddresses cvm类型资产的公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get cvm类型资产的内网ip 
     * @return PrivateIpAddresses cvm类型资产的内网ip
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set cvm类型资产的内网ip
     * @param PrivateIpAddresses cvm类型资产的内网ip
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get 事件响应状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoarResponseStatus 事件响应状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSoarResponseStatus() {
        return this.SoarResponseStatus;
    }

    /**
     * Set 事件响应状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoarResponseStatus 事件响应状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoarResponseStatus(Long SoarResponseStatus) {
        this.SoarResponseStatus = SoarResponseStatus;
    }

    /**
     * Get 事件最近响应时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoarResponseTime 事件最近响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSoarResponseTime() {
        return this.SoarResponseTime;
    }

    /**
     * Set 事件最近响应时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoarResponseTime 事件最近响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoarResponseTime(Long SoarResponseTime) {
        this.SoarResponseTime = SoarResponseTime;
    }

    /**
     * Get 事件建议处理状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoarSuggestStatus 事件建议处理状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSoarSuggestStatus() {
        return this.SoarSuggestStatus;
    }

    /**
     * Set 事件建议处理状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoarSuggestStatus 事件建议处理状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoarSuggestStatus(Long SoarSuggestStatus) {
        this.SoarSuggestStatus = SoarSuggestStatus;
    }

    /**
     * Get 事件剧本类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoarPlaybookType 事件剧本类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSoarPlaybookType() {
        return this.SoarPlaybookType;
    }

    /**
     * Set 事件剧本类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoarPlaybookType 事件剧本类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoarPlaybookType(String SoarPlaybookType) {
        this.SoarPlaybookType = SoarPlaybookType;
    }

    /**
     * Get 剧本任务Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoarRunId 剧本任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSoarRunId() {
        return this.SoarRunId;
    }

    /**
     * Set 剧本任务Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoarRunId 剧本任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoarRunId(String SoarRunId) {
        this.SoarRunId = SoarRunId;
    }

    /**
     * Get 事件Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SsaEventId 事件Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSsaEventId() {
        return this.SsaEventId;
    }

    /**
     * Set 事件Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SsaEventId 事件Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSsaEventId(String SsaEventId) {
        this.SsaEventId = SsaEventId;
    }

    /**
     * Get 是否新接入的云防事件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNewCfwEvent 是否新接入的云防事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNewCfwEvent() {
        return this.IsNewCfwEvent;
    }

    /**
     * Set 是否新接入的云防事件
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNewCfwEvent 是否新接入的云防事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNewCfwEvent(Boolean IsNewCfwEvent) {
        this.IsNewCfwEvent = IsNewCfwEvent;
    }

    /**
     * Get 出入站方向
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Direction 出入站方向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 出入站方向
注意：此字段可能返回 null，表示取不到有效值。
     * @param Direction 出入站方向
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public DataEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEvent(DataEvent source) {
        if (source.OldIdMd5 != null) {
            this.OldIdMd5 = new String(source.OldIdMd5);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventType1 != null) {
            this.EventType1 = new Long(source.EventType1);
        }
        if (source.EventType2 != null) {
            this.EventType2 = new Long(source.EventType2);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Dstport != null) {
            this.Dstport = new Long(source.Dstport);
        }
        if (source.AssetIp != null) {
            this.AssetIp = new String(source.AssetIp);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.SsaEventUniqid != null) {
            this.SsaEventUniqid = new String(source.SsaEventUniqid);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.IsAssetDeleted != null) {
            this.IsAssetDeleted = new String(source.IsAssetDeleted);
        }
        if (source.SsaSrcCountry != null) {
            this.SsaSrcCountry = new String(source.SsaSrcCountry);
        }
        if (source.SsaDstCountry != null) {
            this.SsaDstCountry = new String(source.SsaDstCountry);
        }
        if (source.SsaDescription != null) {
            this.SsaDescription = new String(source.SsaDescription);
        }
        if (source.SsaAttackChain != null) {
            this.SsaAttackChain = new String(source.SsaAttackChain);
        }
        if (source.RuleComponents != null) {
            this.RuleComponents = new String(source.RuleComponents);
        }
        if (source.AssetIpAll != null) {
            this.AssetIpAll = new String[source.AssetIpAll.length];
            for (int i = 0; i < source.AssetIpAll.length; i++) {
                this.AssetIpAll[i] = new String(source.AssetIpAll[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.SoarResponseStatus != null) {
            this.SoarResponseStatus = new Long(source.SoarResponseStatus);
        }
        if (source.SoarResponseTime != null) {
            this.SoarResponseTime = new Long(source.SoarResponseTime);
        }
        if (source.SoarSuggestStatus != null) {
            this.SoarSuggestStatus = new Long(source.SoarSuggestStatus);
        }
        if (source.SoarPlaybookType != null) {
            this.SoarPlaybookType = new String(source.SoarPlaybookType);
        }
        if (source.SoarRunId != null) {
            this.SoarRunId = new String(source.SoarRunId);
        }
        if (source.SsaEventId != null) {
            this.SsaEventId = new String(source.SsaEventId);
        }
        if (source.IsNewCfwEvent != null) {
            this.IsNewCfwEvent = new Boolean(source.IsNewCfwEvent);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldIdMd5", this.OldIdMd5);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventType1", this.EventType1);
        this.setParamSimple(map, prefix + "EventType2", this.EventType2);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Dstport", this.Dstport);
        this.setParamSimple(map, prefix + "AssetIp", this.AssetIp);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "SsaEventUniqid", this.SsaEventUniqid);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IsAssetDeleted", this.IsAssetDeleted);
        this.setParamSimple(map, prefix + "SsaSrcCountry", this.SsaSrcCountry);
        this.setParamSimple(map, prefix + "SsaDstCountry", this.SsaDstCountry);
        this.setParamSimple(map, prefix + "SsaDescription", this.SsaDescription);
        this.setParamSimple(map, prefix + "SsaAttackChain", this.SsaAttackChain);
        this.setParamSimple(map, prefix + "RuleComponents", this.RuleComponents);
        this.setParamArraySimple(map, prefix + "AssetIpAll.", this.AssetIpAll);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "SoarResponseStatus", this.SoarResponseStatus);
        this.setParamSimple(map, prefix + "SoarResponseTime", this.SoarResponseTime);
        this.setParamSimple(map, prefix + "SoarSuggestStatus", this.SoarSuggestStatus);
        this.setParamSimple(map, prefix + "SoarPlaybookType", this.SoarPlaybookType);
        this.setParamSimple(map, prefix + "SoarRunId", this.SoarRunId);
        this.setParamSimple(map, prefix + "SsaEventId", this.SsaEventId);
        this.setParamSimple(map, prefix + "IsNewCfwEvent", this.IsNewCfwEvent);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

