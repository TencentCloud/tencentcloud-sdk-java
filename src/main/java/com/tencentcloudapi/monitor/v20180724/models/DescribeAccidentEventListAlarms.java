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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccidentEventListAlarms extends AbstractModel {

    /**
    * 事件分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessTypeDesc")
    @Expose
    private String BusinessTypeDesc;

    /**
    * 事件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccidentTypeDesc")
    @Expose
    private String AccidentTypeDesc;

    /**
    * 事件分类的ID，1表示服务问题，2表示其他订阅
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessID")
    @Expose
    private Long BusinessID;

    /**
    * 事件状态的ID，0表示已恢复，1表示未恢复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventStatus")
    @Expose
    private Long EventStatus;

    /**
    * 影响的对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectResource")
    @Expose
    private String AffectResource;

    /**
    * 事件的地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 事件发生的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OccurTime")
    @Expose
    private String OccurTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 事件分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessTypeDesc 事件分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessTypeDesc() {
        return this.BusinessTypeDesc;
    }

    /**
     * Set 事件分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessTypeDesc 事件分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessTypeDesc(String BusinessTypeDesc) {
        this.BusinessTypeDesc = BusinessTypeDesc;
    }

    /**
     * Get 事件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccidentTypeDesc 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccidentTypeDesc() {
        return this.AccidentTypeDesc;
    }

    /**
     * Set 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccidentTypeDesc 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccidentTypeDesc(String AccidentTypeDesc) {
        this.AccidentTypeDesc = AccidentTypeDesc;
    }

    /**
     * Get 事件分类的ID，1表示服务问题，2表示其他订阅
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessID 事件分类的ID，1表示服务问题，2表示其他订阅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBusinessID() {
        return this.BusinessID;
    }

    /**
     * Set 事件分类的ID，1表示服务问题，2表示其他订阅
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessID 事件分类的ID，1表示服务问题，2表示其他订阅
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessID(Long BusinessID) {
        this.BusinessID = BusinessID;
    }

    /**
     * Get 事件状态的ID，0表示已恢复，1表示未恢复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventStatus 事件状态的ID，0表示已恢复，1表示未恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set 事件状态的ID，0表示已恢复，1表示未恢复
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventStatus 事件状态的ID，0表示已恢复，1表示未恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventStatus(Long EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get 影响的对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectResource 影响的对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAffectResource() {
        return this.AffectResource;
    }

    /**
     * Set 影响的对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectResource 影响的对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectResource(String AffectResource) {
        this.AffectResource = AffectResource;
    }

    /**
     * Get 事件的地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 事件的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 事件的地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 事件的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 事件发生的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OccurTime 事件发生的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOccurTime() {
        return this.OccurTime;
    }

    /**
     * Set 事件发生的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OccurTime 事件发生的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOccurTime(String OccurTime) {
        this.OccurTime = OccurTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DescribeAccidentEventListAlarms() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccidentEventListAlarms(DescribeAccidentEventListAlarms source) {
        if (source.BusinessTypeDesc != null) {
            this.BusinessTypeDesc = new String(source.BusinessTypeDesc);
        }
        if (source.AccidentTypeDesc != null) {
            this.AccidentTypeDesc = new String(source.AccidentTypeDesc);
        }
        if (source.BusinessID != null) {
            this.BusinessID = new Long(source.BusinessID);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new Long(source.EventStatus);
        }
        if (source.AffectResource != null) {
            this.AffectResource = new String(source.AffectResource);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.OccurTime != null) {
            this.OccurTime = new String(source.OccurTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessTypeDesc", this.BusinessTypeDesc);
        this.setParamSimple(map, prefix + "AccidentTypeDesc", this.AccidentTypeDesc);
        this.setParamSimple(map, prefix + "BusinessID", this.BusinessID);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "AffectResource", this.AffectResource);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "OccurTime", this.OccurTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

