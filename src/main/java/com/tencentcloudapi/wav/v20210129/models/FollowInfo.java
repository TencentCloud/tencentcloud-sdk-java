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

public class FollowInfo extends AbstractModel{

    /**
    * 线索id
    */
    @SerializedName("ClueId")
    @Expose
    private Long ClueId;

    /**
    * 客户档案id
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 客户姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 客户的手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 是否逾期
    */
    @SerializedName("IsOverdue")
    @Expose
    private Long IsOverdue;

    /**
    * 逾期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverdueTime")
    @Expose
    private Long OverdueTime;

    /**
    * 发生事件
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 发生事件名称
    */
    @SerializedName("EventTypeName")
    @Expose
    private String EventTypeName;

    /**
    * 跟进方式
    */
    @SerializedName("FollowWayType")
    @Expose
    private String FollowWayType;

    /**
    * 跟进方式名称
    */
    @SerializedName("FollowWayName")
    @Expose
    private String FollowWayName;

    /**
    * 本次跟进时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowTime")
    @Expose
    private Long FollowTime;

    /**
    * 下次跟进时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextFollowTime")
    @Expose
    private Long NextFollowTime;

    /**
    * 跟进记录
    */
    @SerializedName("FollowRecord")
    @Expose
    private String FollowRecord;

    /**
     * Get 线索id 
     * @return ClueId 线索id
     */
    public Long getClueId() {
        return this.ClueId;
    }

    /**
     * Set 线索id
     * @param ClueId 线索id
     */
    public void setClueId(Long ClueId) {
        this.ClueId = ClueId;
    }

    /**
     * Get 客户档案id 
     * @return CustomerId 客户档案id
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 客户档案id
     * @param CustomerId 客户档案id
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 客户姓名 
     * @return UserName 客户姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 客户姓名
     * @param UserName 客户姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 客户的手机号 
     * @return Phone 客户的手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 客户的手机号
     * @param Phone 客户的手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 是否逾期 
     * @return IsOverdue 是否逾期
     */
    public Long getIsOverdue() {
        return this.IsOverdue;
    }

    /**
     * Set 是否逾期
     * @param IsOverdue 是否逾期
     */
    public void setIsOverdue(Long IsOverdue) {
        this.IsOverdue = IsOverdue;
    }

    /**
     * Get 逾期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverdueTime 逾期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOverdueTime() {
        return this.OverdueTime;
    }

    /**
     * Set 逾期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverdueTime 逾期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverdueTime(Long OverdueTime) {
        this.OverdueTime = OverdueTime;
    }

    /**
     * Get 发生事件 
     * @return EventType 发生事件
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 发生事件
     * @param EventType 发生事件
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 发生事件名称 
     * @return EventTypeName 发生事件名称
     */
    public String getEventTypeName() {
        return this.EventTypeName;
    }

    /**
     * Set 发生事件名称
     * @param EventTypeName 发生事件名称
     */
    public void setEventTypeName(String EventTypeName) {
        this.EventTypeName = EventTypeName;
    }

    /**
     * Get 跟进方式 
     * @return FollowWayType 跟进方式
     */
    public String getFollowWayType() {
        return this.FollowWayType;
    }

    /**
     * Set 跟进方式
     * @param FollowWayType 跟进方式
     */
    public void setFollowWayType(String FollowWayType) {
        this.FollowWayType = FollowWayType;
    }

    /**
     * Get 跟进方式名称 
     * @return FollowWayName 跟进方式名称
     */
    public String getFollowWayName() {
        return this.FollowWayName;
    }

    /**
     * Set 跟进方式名称
     * @param FollowWayName 跟进方式名称
     */
    public void setFollowWayName(String FollowWayName) {
        this.FollowWayName = FollowWayName;
    }

    /**
     * Get 本次跟进时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowTime 本次跟进时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFollowTime() {
        return this.FollowTime;
    }

    /**
     * Set 本次跟进时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowTime 本次跟进时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowTime(Long FollowTime) {
        this.FollowTime = FollowTime;
    }

    /**
     * Get 下次跟进时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextFollowTime 下次跟进时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNextFollowTime() {
        return this.NextFollowTime;
    }

    /**
     * Set 下次跟进时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextFollowTime 下次跟进时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextFollowTime(Long NextFollowTime) {
        this.NextFollowTime = NextFollowTime;
    }

    /**
     * Get 跟进记录 
     * @return FollowRecord 跟进记录
     */
    public String getFollowRecord() {
        return this.FollowRecord;
    }

    /**
     * Set 跟进记录
     * @param FollowRecord 跟进记录
     */
    public void setFollowRecord(String FollowRecord) {
        this.FollowRecord = FollowRecord;
    }

    public FollowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FollowInfo(FollowInfo source) {
        if (source.ClueId != null) {
            this.ClueId = new Long(source.ClueId);
        }
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.IsOverdue != null) {
            this.IsOverdue = new Long(source.IsOverdue);
        }
        if (source.OverdueTime != null) {
            this.OverdueTime = new Long(source.OverdueTime);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.EventTypeName != null) {
            this.EventTypeName = new String(source.EventTypeName);
        }
        if (source.FollowWayType != null) {
            this.FollowWayType = new String(source.FollowWayType);
        }
        if (source.FollowWayName != null) {
            this.FollowWayName = new String(source.FollowWayName);
        }
        if (source.FollowTime != null) {
            this.FollowTime = new Long(source.FollowTime);
        }
        if (source.NextFollowTime != null) {
            this.NextFollowTime = new Long(source.NextFollowTime);
        }
        if (source.FollowRecord != null) {
            this.FollowRecord = new String(source.FollowRecord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClueId", this.ClueId);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "IsOverdue", this.IsOverdue);
        this.setParamSimple(map, prefix + "OverdueTime", this.OverdueTime);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventTypeName", this.EventTypeName);
        this.setParamSimple(map, prefix + "FollowWayType", this.FollowWayType);
        this.setParamSimple(map, prefix + "FollowWayName", this.FollowWayName);
        this.setParamSimple(map, prefix + "FollowTime", this.FollowTime);
        this.setParamSimple(map, prefix + "NextFollowTime", this.NextFollowTime);
        this.setParamSimple(map, prefix + "FollowRecord", this.FollowRecord);

    }
}

