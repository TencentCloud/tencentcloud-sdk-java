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

public class ActivityJoinDetail extends AbstractModel{

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
    * 销售姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
    * 销售电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SalesPhone")
    @Expose
    private String SalesPhone;

    /**
    * 参与id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinId")
    @Expose
    private Long JoinId;

    /**
    * 活码id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveCodeId")
    @Expose
    private Long LiveCodeId;

    /**
    * 用户电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserPhone")
    @Expose
    private String UserPhone;

    /**
    * 用户姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 活动数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityData")
    @Expose
    private String ActivityData;

    /**
    * 线索id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeadId")
    @Expose
    private Long LeadId;

    /**
    * 参与时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinTime")
    @Expose
    private Long JoinTime;

    /**
    * 线索是否是重复创建， 0 ：新建、 1：合并、 2：重复， 默认为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duplicate")
    @Expose
    private Long Duplicate;

    /**
    * 重复线索id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DuplicateLeadId")
    @Expose
    private Long DuplicateLeadId;

    /**
    * 是否为参与多次活动， 1：参与一次、2、参与多次，默认为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinState")
    @Expose
    private Long JoinState;

    /**
    * 创建时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

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
     * Get 销售姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SalesName 销售姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 销售姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SalesName 销售姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Get 销售电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SalesPhone 销售电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSalesPhone() {
        return this.SalesPhone;
    }

    /**
     * Set 销售电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param SalesPhone 销售电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSalesPhone(String SalesPhone) {
        this.SalesPhone = SalesPhone;
    }

    /**
     * Get 参与id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinId 参与id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJoinId() {
        return this.JoinId;
    }

    /**
     * Set 参与id
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinId 参与id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinId(Long JoinId) {
        this.JoinId = JoinId;
    }

    /**
     * Get 活码id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveCodeId 活码id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLiveCodeId() {
        return this.LiveCodeId;
    }

    /**
     * Set 活码id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveCodeId 活码id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveCodeId(Long LiveCodeId) {
        this.LiveCodeId = LiveCodeId;
    }

    /**
     * Get 用户电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserPhone 用户电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserPhone() {
        return this.UserPhone;
    }

    /**
     * Set 用户电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserPhone 用户电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserPhone(String UserPhone) {
        this.UserPhone = UserPhone;
    }

    /**
     * Get 用户姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 活动数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivityData 活动数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityData() {
        return this.ActivityData;
    }

    /**
     * Set 活动数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityData 活动数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityData(String ActivityData) {
        this.ActivityData = ActivityData;
    }

    /**
     * Get 线索id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeadId 线索id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLeadId() {
        return this.LeadId;
    }

    /**
     * Set 线索id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeadId 线索id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeadId(Long LeadId) {
        this.LeadId = LeadId;
    }

    /**
     * Get 参与时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinTime 参与时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set 参与时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinTime 参与时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinTime(Long JoinTime) {
        this.JoinTime = JoinTime;
    }

    /**
     * Get 线索是否是重复创建， 0 ：新建、 1：合并、 2：重复， 默认为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duplicate 线索是否是重复创建， 0 ：新建、 1：合并、 2：重复， 默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuplicate() {
        return this.Duplicate;
    }

    /**
     * Set 线索是否是重复创建， 0 ：新建、 1：合并、 2：重复， 默认为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duplicate 线索是否是重复创建， 0 ：新建、 1：合并、 2：重复， 默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuplicate(Long Duplicate) {
        this.Duplicate = Duplicate;
    }

    /**
     * Get 重复线索id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DuplicateLeadId 重复线索id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuplicateLeadId() {
        return this.DuplicateLeadId;
    }

    /**
     * Set 重复线索id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DuplicateLeadId 重复线索id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuplicateLeadId(Long DuplicateLeadId) {
        this.DuplicateLeadId = DuplicateLeadId;
    }

    /**
     * Get 是否为参与多次活动， 1：参与一次、2、参与多次，默认为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinState 是否为参与多次活动， 1：参与一次、2、参与多次，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJoinState() {
        return this.JoinState;
    }

    /**
     * Set 是否为参与多次活动， 1：参与一次、2、参与多次，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinState 是否为参与多次活动， 1：参与一次、2、参与多次，默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinState(Long JoinState) {
        this.JoinState = JoinState;
    }

    /**
     * Get 创建时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ActivityJoinDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityJoinDetail(ActivityJoinDetail source) {
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.ActivityName != null) {
            this.ActivityName = new String(source.ActivityName);
        }
        if (source.SalesName != null) {
            this.SalesName = new String(source.SalesName);
        }
        if (source.SalesPhone != null) {
            this.SalesPhone = new String(source.SalesPhone);
        }
        if (source.JoinId != null) {
            this.JoinId = new Long(source.JoinId);
        }
        if (source.LiveCodeId != null) {
            this.LiveCodeId = new Long(source.LiveCodeId);
        }
        if (source.UserPhone != null) {
            this.UserPhone = new String(source.UserPhone);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ActivityData != null) {
            this.ActivityData = new String(source.ActivityData);
        }
        if (source.LeadId != null) {
            this.LeadId = new Long(source.LeadId);
        }
        if (source.JoinTime != null) {
            this.JoinTime = new Long(source.JoinTime);
        }
        if (source.Duplicate != null) {
            this.Duplicate = new Long(source.Duplicate);
        }
        if (source.DuplicateLeadId != null) {
            this.DuplicateLeadId = new Long(source.DuplicateLeadId);
        }
        if (source.JoinState != null) {
            this.JoinState = new Long(source.JoinState);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ActivityName", this.ActivityName);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);
        this.setParamSimple(map, prefix + "SalesPhone", this.SalesPhone);
        this.setParamSimple(map, prefix + "JoinId", this.JoinId);
        this.setParamSimple(map, prefix + "LiveCodeId", this.LiveCodeId);
        this.setParamSimple(map, prefix + "UserPhone", this.UserPhone);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ActivityData", this.ActivityData);
        this.setParamSimple(map, prefix + "LeadId", this.LeadId);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);
        this.setParamSimple(map, prefix + "Duplicate", this.Duplicate);
        this.setParamSimple(map, prefix + "DuplicateLeadId", this.DuplicateLeadId);
        this.setParamSimple(map, prefix + "JoinState", this.JoinState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

