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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivityDetail extends AbstractModel{

    /**
    * 活动id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * 活动名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityName")
    @Expose
    private String ActivityName;

    /**
    * 活动状态，10:未开始状态、20:已开始（进行中）状态、30:已结束状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityState")
    @Expose
    private Long ActivityState;

    /**
    * 活动类型，100:留资活动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityType")
    @Expose
    private Long ActivityType;

    /**
    * 活动开始时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 活动结束时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 活动主图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainPhoto")
    @Expose
    private String MainPhoto;

    /**
    * 协议编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivacyAgreementId")
    @Expose
    private String PrivacyAgreementId;

    /**
    * 活动更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 活动数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityDataList")
    @Expose
    private String ActivityDataList;

    /**
     * Get 活动id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityId 活动id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityId 活动id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 活动名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityName 活动名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityName() {
        return this.ActivityName;
    }

    /**
     * Set 活动名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityName 活动名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityName(String ActivityName) {
        this.ActivityName = ActivityName;
    }

    /**
     * Get 活动状态，10:未开始状态、20:已开始（进行中）状态、30:已结束状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityState 活动状态，10:未开始状态、20:已开始（进行中）状态、30:已结束状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActivityState() {
        return this.ActivityState;
    }

    /**
     * Set 活动状态，10:未开始状态、20:已开始（进行中）状态、30:已结束状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityState 活动状态，10:未开始状态、20:已开始（进行中）状态、30:已结束状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityState(Long ActivityState) {
        this.ActivityState = ActivityState;
    }

    /**
     * Get 活动类型，100:留资活动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityType 活动类型，100:留资活动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set 活动类型，100:留资活动
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityType 活动类型，100:留资活动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityType(Long ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get 活动开始时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 活动开始时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 活动开始时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 活动开始时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 活动结束时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 活动结束时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 活动结束时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 活动结束时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 活动主图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainPhoto 活动主图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainPhoto() {
        return this.MainPhoto;
    }

    /**
     * Set 活动主图
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainPhoto 活动主图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainPhoto(String MainPhoto) {
        this.MainPhoto = MainPhoto;
    }

    /**
     * Get 协议编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivacyAgreementId 协议编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivacyAgreementId() {
        return this.PrivacyAgreementId;
    }

    /**
     * Set 协议编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivacyAgreementId 协议编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivacyAgreementId(String PrivacyAgreementId) {
        this.PrivacyAgreementId = PrivacyAgreementId;
    }

    /**
     * Get 活动更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 活动更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 活动更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 活动更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 活动数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityDataList 活动数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityDataList() {
        return this.ActivityDataList;
    }

    /**
     * Set 活动数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityDataList 活动数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityDataList(String ActivityDataList) {
        this.ActivityDataList = ActivityDataList;
    }

    public ActivityDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityDetail(ActivityDetail source) {
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.ActivityName != null) {
            this.ActivityName = new String(source.ActivityName);
        }
        if (source.ActivityState != null) {
            this.ActivityState = new Long(source.ActivityState);
        }
        if (source.ActivityType != null) {
            this.ActivityType = new Long(source.ActivityType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MainPhoto != null) {
            this.MainPhoto = new String(source.MainPhoto);
        }
        if (source.PrivacyAgreementId != null) {
            this.PrivacyAgreementId = new String(source.PrivacyAgreementId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.ActivityDataList != null) {
            this.ActivityDataList = new String(source.ActivityDataList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ActivityName", this.ActivityName);
        this.setParamSimple(map, prefix + "ActivityState", this.ActivityState);
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MainPhoto", this.MainPhoto);
        this.setParamSimple(map, prefix + "PrivacyAgreementId", this.PrivacyAgreementId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ActivityDataList", this.ActivityDataList);

    }
}

