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

public class ArrivalInfo extends AbstractModel{

    /**
    * 线索id
    */
    @SerializedName("ClueId")
    @Expose
    private Long ClueId;

    /**
    * 客户id
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
    * 是否首次到店，0否，1是
    */
    @SerializedName("FirstArrival")
    @Expose
    private Long FirstArrival;

    /**
    * 到店时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArrivalTime")
    @Expose
    private Long ArrivalTime;

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
     * Get 客户id 
     * @return CustomerId 客户id
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 客户id
     * @param CustomerId 客户id
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
     * Get 是否首次到店，0否，1是 
     * @return FirstArrival 是否首次到店，0否，1是
     */
    public Long getFirstArrival() {
        return this.FirstArrival;
    }

    /**
     * Set 是否首次到店，0否，1是
     * @param FirstArrival 是否首次到店，0否，1是
     */
    public void setFirstArrival(Long FirstArrival) {
        this.FirstArrival = FirstArrival;
    }

    /**
     * Get 到店时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArrivalTime 到店时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getArrivalTime() {
        return this.ArrivalTime;
    }

    /**
     * Set 到店时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArrivalTime 到店时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArrivalTime(Long ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
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

    public ArrivalInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArrivalInfo(ArrivalInfo source) {
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
        if (source.FirstArrival != null) {
            this.FirstArrival = new Long(source.FirstArrival);
        }
        if (source.ArrivalTime != null) {
            this.ArrivalTime = new Long(source.ArrivalTime);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.EventTypeName != null) {
            this.EventTypeName = new String(source.EventTypeName);
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
        this.setParamSimple(map, prefix + "FirstArrival", this.FirstArrival);
        this.setParamSimple(map, prefix + "ArrivalTime", this.ArrivalTime);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventTypeName", this.EventTypeName);
        this.setParamSimple(map, prefix + "FollowRecord", this.FollowRecord);

    }
}

