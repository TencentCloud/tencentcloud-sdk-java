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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleDetail extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 删除时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeletedAt")
    @Expose
    private String DeletedAt;

    /**
    * 规则类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 是否激活
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsActive")
    @Expose
    private Boolean IsActive;

    /**
    * 触发动作：1 邮件 2 API请求 5 停卡 6 地图标识为盲点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notice")
    @Expose
    private Long Notice;

    /**
    * 邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 回调API地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 用量类：用量阈值,单位MB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataThreshold")
    @Expose
    private Long DataThreshold;

    /**
    * 行政区类型：1. 省份 2. 城市 3. 区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("District")
    @Expose
    private Long District;

    /**
    * 移动距离阈值，单位KM
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Distance")
    @Expose
    private Long Distance;

    /**
    * 信号强度阈值(-dbm）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignalStrength")
    @Expose
    private Long SignalStrength;

    /**
    * 盲点阈值天数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LostDay")
    @Expose
    private Long LostDay;

    /**
    * 标签ID集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagIDs")
    @Expose
    private Long [] TagIDs;

    /**
    * 资费信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SalePlan")
    @Expose
    private String SalePlan;

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则ID 
     * @return ID 规则ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 规则ID
     * @param ID 规则ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 删除时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeletedAt 删除时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeletedAt() {
        return this.DeletedAt;
    }

    /**
     * Set 删除时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeletedAt 删除时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeletedAt(String DeletedAt) {
        this.DeletedAt = DeletedAt;
    }

    /**
     * Get 规则类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 规则类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 规则类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 规则类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 是否激活
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsActive 是否激活
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsActive() {
        return this.IsActive;
    }

    /**
     * Set 是否激活
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsActive 是否激活
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * Get 触发动作：1 邮件 2 API请求 5 停卡 6 地图标识为盲点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Notice 触发动作：1 邮件 2 API请求 5 停卡 6 地图标识为盲点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotice() {
        return this.Notice;
    }

    /**
     * Set 触发动作：1 邮件 2 API请求 5 停卡 6 地图标识为盲点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Notice 触发动作：1 邮件 2 API请求 5 停卡 6 地图标识为盲点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotice(Long Notice) {
        this.Notice = Notice;
    }

    /**
     * Get 邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 回调API地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 回调API地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 回调API地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 回调API地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 用量类：用量阈值,单位MB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataThreshold 用量类：用量阈值,单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataThreshold() {
        return this.DataThreshold;
    }

    /**
     * Set 用量类：用量阈值,单位MB
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataThreshold 用量类：用量阈值,单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataThreshold(Long DataThreshold) {
        this.DataThreshold = DataThreshold;
    }

    /**
     * Get 行政区类型：1. 省份 2. 城市 3. 区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return District 行政区类型：1. 省份 2. 城市 3. 区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDistrict() {
        return this.District;
    }

    /**
     * Set 行政区类型：1. 省份 2. 城市 3. 区
注意：此字段可能返回 null，表示取不到有效值。
     * @param District 行政区类型：1. 省份 2. 城市 3. 区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistrict(Long District) {
        this.District = District;
    }

    /**
     * Get 移动距离阈值，单位KM
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Distance 移动距离阈值，单位KM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDistance() {
        return this.Distance;
    }

    /**
     * Set 移动距离阈值，单位KM
注意：此字段可能返回 null，表示取不到有效值。
     * @param Distance 移动距离阈值，单位KM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistance(Long Distance) {
        this.Distance = Distance;
    }

    /**
     * Get 信号强度阈值(-dbm）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignalStrength 信号强度阈值(-dbm）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSignalStrength() {
        return this.SignalStrength;
    }

    /**
     * Set 信号强度阈值(-dbm）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignalStrength 信号强度阈值(-dbm）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignalStrength(Long SignalStrength) {
        this.SignalStrength = SignalStrength;
    }

    /**
     * Get 盲点阈值天数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LostDay 盲点阈值天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLostDay() {
        return this.LostDay;
    }

    /**
     * Set 盲点阈值天数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LostDay 盲点阈值天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLostDay(Long LostDay) {
        this.LostDay = LostDay;
    }

    /**
     * Get 标签ID集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagIDs 标签ID集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set 标签ID集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagIDs 标签ID集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagIDs(Long [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get 资费信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SalePlan 资费信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSalePlan() {
        return this.SalePlan;
    }

    /**
     * Set 资费信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SalePlan 资费信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSalePlan(String SalePlan) {
        this.SalePlan = SalePlan;
    }

    public RuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleDetail(RuleDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.DeletedAt != null) {
            this.DeletedAt = new String(source.DeletedAt);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.IsActive != null) {
            this.IsActive = new Boolean(source.IsActive);
        }
        if (source.Notice != null) {
            this.Notice = new Long(source.Notice);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.DataThreshold != null) {
            this.DataThreshold = new Long(source.DataThreshold);
        }
        if (source.District != null) {
            this.District = new Long(source.District);
        }
        if (source.Distance != null) {
            this.Distance = new Long(source.Distance);
        }
        if (source.SignalStrength != null) {
            this.SignalStrength = new Long(source.SignalStrength);
        }
        if (source.LostDay != null) {
            this.LostDay = new Long(source.LostDay);
        }
        if (source.TagIDs != null) {
            this.TagIDs = new Long[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new Long(source.TagIDs[i]);
            }
        }
        if (source.SalePlan != null) {
            this.SalePlan = new String(source.SalePlan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "DeletedAt", this.DeletedAt);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsActive", this.IsActive);
        this.setParamSimple(map, prefix + "Notice", this.Notice);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "DataThreshold", this.DataThreshold);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Distance", this.Distance);
        this.setParamSimple(map, prefix + "SignalStrength", this.SignalStrength);
        this.setParamSimple(map, prefix + "LostDay", this.LostDay);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "SalePlan", this.SalePlan);

    }
}

