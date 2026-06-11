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

public class OneOnCallForm extends AbstractModel {

    /**
    * 值班id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnCallFormID")
    @Expose
    private String OnCallFormID;

    /**
    * 值班名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnCallFormName")
    @Expose
    private String OnCallFormName;

    /**
    * 值班描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnCallFormDesc")
    @Expose
    private String OnCallFormDesc;

    /**
    * 值班人员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StaffInfos")
    @Expose
    private StaffInfo [] StaffInfos;

    /**
    * 轮班类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RotationType")
    @Expose
    private String RotationType;

    /**
    * 换班时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShiftTime")
    @Expose
    private String ShiftTime;

    /**
    * 值班有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EffectiveStartTime")
    @Expose
    private Long EffectiveStartTime;

    /**
    * 值班有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EffectiveEndTime")
    @Expose
    private Long EffectiveEndTime;

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZone")
    @Expose
    private Float TimeZone;

    /**
    * 替班信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverStaffInfos")
    @Expose
    private CoverStaffInfo [] CoverStaffInfos;

    /**
    * 模板绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 值班id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnCallFormID 值班id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOnCallFormID() {
        return this.OnCallFormID;
    }

    /**
     * Set 值班id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnCallFormID 值班id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnCallFormID(String OnCallFormID) {
        this.OnCallFormID = OnCallFormID;
    }

    /**
     * Get 值班名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnCallFormName 值班名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOnCallFormName() {
        return this.OnCallFormName;
    }

    /**
     * Set 值班名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnCallFormName 值班名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnCallFormName(String OnCallFormName) {
        this.OnCallFormName = OnCallFormName;
    }

    /**
     * Get 值班描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnCallFormDesc 值班描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOnCallFormDesc() {
        return this.OnCallFormDesc;
    }

    /**
     * Set 值班描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnCallFormDesc 值班描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnCallFormDesc(String OnCallFormDesc) {
        this.OnCallFormDesc = OnCallFormDesc;
    }

    /**
     * Get 值班人员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StaffInfos 值班人员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StaffInfo [] getStaffInfos() {
        return this.StaffInfos;
    }

    /**
     * Set 值班人员
注意：此字段可能返回 null，表示取不到有效值。
     * @param StaffInfos 值班人员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStaffInfos(StaffInfo [] StaffInfos) {
        this.StaffInfos = StaffInfos;
    }

    /**
     * Get 轮班类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RotationType 轮班类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRotationType() {
        return this.RotationType;
    }

    /**
     * Set 轮班类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RotationType 轮班类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotationType(String RotationType) {
        this.RotationType = RotationType;
    }

    /**
     * Get 换班时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShiftTime 换班时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShiftTime() {
        return this.ShiftTime;
    }

    /**
     * Set 换班时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShiftTime 换班时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShiftTime(String ShiftTime) {
        this.ShiftTime = ShiftTime;
    }

    /**
     * Get 值班有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EffectiveStartTime 值班有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEffectiveStartTime() {
        return this.EffectiveStartTime;
    }

    /**
     * Set 值班有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EffectiveStartTime 值班有效期开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffectiveStartTime(Long EffectiveStartTime) {
        this.EffectiveStartTime = EffectiveStartTime;
    }

    /**
     * Get 值班有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EffectiveEndTime 值班有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEffectiveEndTime() {
        return this.EffectiveEndTime;
    }

    /**
     * Set 值班有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EffectiveEndTime 值班有效期结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffectiveEndTime(Long EffectiveEndTime) {
        this.EffectiveEndTime = EffectiveEndTime;
    }

    /**
     * Get 时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeZone(Float TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 替班信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverStaffInfos 替班信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CoverStaffInfo [] getCoverStaffInfos() {
        return this.CoverStaffInfos;
    }

    /**
     * Set 替班信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverStaffInfos 替班信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverStaffInfos(CoverStaffInfo [] CoverStaffInfos) {
        this.CoverStaffInfos = CoverStaffInfos;
    }

    /**
     * Get 模板绑定的标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 模板绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 模板绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 模板绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public OneOnCallForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OneOnCallForm(OneOnCallForm source) {
        if (source.OnCallFormID != null) {
            this.OnCallFormID = new String(source.OnCallFormID);
        }
        if (source.OnCallFormName != null) {
            this.OnCallFormName = new String(source.OnCallFormName);
        }
        if (source.OnCallFormDesc != null) {
            this.OnCallFormDesc = new String(source.OnCallFormDesc);
        }
        if (source.StaffInfos != null) {
            this.StaffInfos = new StaffInfo[source.StaffInfos.length];
            for (int i = 0; i < source.StaffInfos.length; i++) {
                this.StaffInfos[i] = new StaffInfo(source.StaffInfos[i]);
            }
        }
        if (source.RotationType != null) {
            this.RotationType = new String(source.RotationType);
        }
        if (source.ShiftTime != null) {
            this.ShiftTime = new String(source.ShiftTime);
        }
        if (source.EffectiveStartTime != null) {
            this.EffectiveStartTime = new Long(source.EffectiveStartTime);
        }
        if (source.EffectiveEndTime != null) {
            this.EffectiveEndTime = new Long(source.EffectiveEndTime);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new Float(source.TimeZone);
        }
        if (source.CoverStaffInfos != null) {
            this.CoverStaffInfos = new CoverStaffInfo[source.CoverStaffInfos.length];
            for (int i = 0; i < source.CoverStaffInfos.length; i++) {
                this.CoverStaffInfos[i] = new CoverStaffInfo(source.CoverStaffInfos[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OnCallFormID", this.OnCallFormID);
        this.setParamSimple(map, prefix + "OnCallFormName", this.OnCallFormName);
        this.setParamSimple(map, prefix + "OnCallFormDesc", this.OnCallFormDesc);
        this.setParamArrayObj(map, prefix + "StaffInfos.", this.StaffInfos);
        this.setParamSimple(map, prefix + "RotationType", this.RotationType);
        this.setParamSimple(map, prefix + "ShiftTime", this.ShiftTime);
        this.setParamSimple(map, prefix + "EffectiveStartTime", this.EffectiveStartTime);
        this.setParamSimple(map, prefix + "EffectiveEndTime", this.EffectiveEndTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArrayObj(map, prefix + "CoverStaffInfos.", this.CoverStaffInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

