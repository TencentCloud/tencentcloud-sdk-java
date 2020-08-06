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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCN extends AbstractModel{

    /**
    * 云联网唯一ID
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网名称
    */
    @SerializedName("CcnName")
    @Expose
    private String CcnName;

    /**
    * 云联网描述信息
    */
    @SerializedName("CcnDescription")
    @Expose
    private String CcnDescription;

    /**
    * 关联实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 限速类型，INTER_REGION_LIMIT为地域间限速；OUTER_REGION_LIMIT为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BandwidthLimitType")
    @Expose
    private String BandwidthLimitType;

    /**
    * 标签键值对。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 是否支持云联网路由优先级的功能。False：不支持，True：支持。
    */
    @SerializedName("RoutePriorityFlag")
    @Expose
    private Boolean RoutePriorityFlag;

    /**
     * Get 云联网唯一ID 
     * @return CcnId 云联网唯一ID
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网唯一ID
     * @param CcnId 云联网唯一ID
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云联网名称 
     * @return CcnName 云联网名称
     */
    public String getCcnName() {
        return this.CcnName;
    }

    /**
     * Set 云联网名称
     * @param CcnName 云联网名称
     */
    public void setCcnName(String CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * Get 云联网描述信息 
     * @return CcnDescription 云联网描述信息
     */
    public String getCcnDescription() {
        return this.CcnDescription;
    }

    /**
     * Set 云联网描述信息
     * @param CcnDescription 云联网描述信息
     */
    public void setCcnDescription(String CcnDescription) {
        this.CcnDescription = CcnDescription;
    }

    /**
     * Get 关联实例数量 
     * @return InstanceCount 关联实例数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 关联实例数量
     * @param InstanceCount 关联实例数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
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
     * Get 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。 
     * @return State 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。
     * @param State 实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。 
     * @return QosLevel 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。
     * @param QosLevel 实例服务质量，’PT’：白金，'AU'：金，'AG'：银。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargeType 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargeType 付费类型，PREPAID为预付费，POSTPAID为后付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 限速类型，INTER_REGION_LIMIT为地域间限速；OUTER_REGION_LIMIT为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BandwidthLimitType 限速类型，INTER_REGION_LIMIT为地域间限速；OUTER_REGION_LIMIT为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBandwidthLimitType() {
        return this.BandwidthLimitType;
    }

    /**
     * Set 限速类型，INTER_REGION_LIMIT为地域间限速；OUTER_REGION_LIMIT为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BandwidthLimitType 限速类型，INTER_REGION_LIMIT为地域间限速；OUTER_REGION_LIMIT为地域出口限速。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidthLimitType(String BandwidthLimitType) {
        this.BandwidthLimitType = BandwidthLimitType;
    }

    /**
     * Get 标签键值对。 
     * @return TagSet 标签键值对。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。
     * @param TagSet 标签键值对。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 是否支持云联网路由优先级的功能。False：不支持，True：支持。 
     * @return RoutePriorityFlag 是否支持云联网路由优先级的功能。False：不支持，True：支持。
     */
    public Boolean getRoutePriorityFlag() {
        return this.RoutePriorityFlag;
    }

    /**
     * Set 是否支持云联网路由优先级的功能。False：不支持，True：支持。
     * @param RoutePriorityFlag 是否支持云联网路由优先级的功能。False：不支持，True：支持。
     */
    public void setRoutePriorityFlag(Boolean RoutePriorityFlag) {
        this.RoutePriorityFlag = RoutePriorityFlag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnName", this.CcnName);
        this.setParamSimple(map, prefix + "CcnDescription", this.CcnDescription);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "BandwidthLimitType", this.BandwidthLimitType);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "RoutePriorityFlag", this.RoutePriorityFlag);

    }
}

