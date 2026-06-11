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

public class CreateOnCallFormRequest extends AbstractModel {

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 值班表名称
    */
    @SerializedName("OnCallFormName")
    @Expose
    private String OnCallFormName;

    /**
    * 值班人员id组
    */
    @SerializedName("StaffInfos")
    @Expose
    private StaffInfo [] StaffInfos;

    /**
    * 轮转类型
    */
    @SerializedName("RotationType")
    @Expose
    private String RotationType;

    /**
    * 换班时间
    */
    @SerializedName("ShiftTime")
    @Expose
    private String ShiftTime;

    /**
    * 有效期开始时间，单位s
    */
    @SerializedName("EffectiveStartTime")
    @Expose
    private Long EffectiveStartTime;

    /**
    * 有效期结束时间，单位s
    */
    @SerializedName("EffectiveEndTime")
    @Expose
    private Long EffectiveEndTime;

    /**
    * 时区(-12 - 12)
    */
    @SerializedName("TimeZone")
    @Expose
    private Float TimeZone;

    /**
    * 值班表描述
    */
    @SerializedName("OnCallFormDesc")
    @Expose
    private String OnCallFormDesc;

    /**
    * 轮班信息
    */
    @SerializedName("CoverStaffInfos")
    @Expose
    private CoverStaffInfo [] CoverStaffInfos;

    /**
    * 模板绑定的标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 值班表名称 
     * @return OnCallFormName 值班表名称
     */
    public String getOnCallFormName() {
        return this.OnCallFormName;
    }

    /**
     * Set 值班表名称
     * @param OnCallFormName 值班表名称
     */
    public void setOnCallFormName(String OnCallFormName) {
        this.OnCallFormName = OnCallFormName;
    }

    /**
     * Get 值班人员id组 
     * @return StaffInfos 值班人员id组
     */
    public StaffInfo [] getStaffInfos() {
        return this.StaffInfos;
    }

    /**
     * Set 值班人员id组
     * @param StaffInfos 值班人员id组
     */
    public void setStaffInfos(StaffInfo [] StaffInfos) {
        this.StaffInfos = StaffInfos;
    }

    /**
     * Get 轮转类型 
     * @return RotationType 轮转类型
     */
    public String getRotationType() {
        return this.RotationType;
    }

    /**
     * Set 轮转类型
     * @param RotationType 轮转类型
     */
    public void setRotationType(String RotationType) {
        this.RotationType = RotationType;
    }

    /**
     * Get 换班时间 
     * @return ShiftTime 换班时间
     */
    public String getShiftTime() {
        return this.ShiftTime;
    }

    /**
     * Set 换班时间
     * @param ShiftTime 换班时间
     */
    public void setShiftTime(String ShiftTime) {
        this.ShiftTime = ShiftTime;
    }

    /**
     * Get 有效期开始时间，单位s 
     * @return EffectiveStartTime 有效期开始时间，单位s
     */
    public Long getEffectiveStartTime() {
        return this.EffectiveStartTime;
    }

    /**
     * Set 有效期开始时间，单位s
     * @param EffectiveStartTime 有效期开始时间，单位s
     */
    public void setEffectiveStartTime(Long EffectiveStartTime) {
        this.EffectiveStartTime = EffectiveStartTime;
    }

    /**
     * Get 有效期结束时间，单位s 
     * @return EffectiveEndTime 有效期结束时间，单位s
     */
    public Long getEffectiveEndTime() {
        return this.EffectiveEndTime;
    }

    /**
     * Set 有效期结束时间，单位s
     * @param EffectiveEndTime 有效期结束时间，单位s
     */
    public void setEffectiveEndTime(Long EffectiveEndTime) {
        this.EffectiveEndTime = EffectiveEndTime;
    }

    /**
     * Get 时区(-12 - 12) 
     * @return TimeZone 时区(-12 - 12)
     */
    public Float getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区(-12 - 12)
     * @param TimeZone 时区(-12 - 12)
     */
    public void setTimeZone(Float TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 值班表描述 
     * @return OnCallFormDesc 值班表描述
     */
    public String getOnCallFormDesc() {
        return this.OnCallFormDesc;
    }

    /**
     * Set 值班表描述
     * @param OnCallFormDesc 值班表描述
     */
    public void setOnCallFormDesc(String OnCallFormDesc) {
        this.OnCallFormDesc = OnCallFormDesc;
    }

    /**
     * Get 轮班信息 
     * @return CoverStaffInfos 轮班信息
     */
    public CoverStaffInfo [] getCoverStaffInfos() {
        return this.CoverStaffInfos;
    }

    /**
     * Set 轮班信息
     * @param CoverStaffInfos 轮班信息
     */
    public void setCoverStaffInfos(CoverStaffInfo [] CoverStaffInfos) {
        this.CoverStaffInfos = CoverStaffInfos;
    }

    /**
     * Get 模板绑定的标签 
     * @return Tags 模板绑定的标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 模板绑定的标签
     * @param Tags 模板绑定的标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateOnCallFormRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOnCallFormRequest(CreateOnCallFormRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.OnCallFormName != null) {
            this.OnCallFormName = new String(source.OnCallFormName);
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
        if (source.OnCallFormDesc != null) {
            this.OnCallFormDesc = new String(source.OnCallFormDesc);
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
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "OnCallFormName", this.OnCallFormName);
        this.setParamArrayObj(map, prefix + "StaffInfos.", this.StaffInfos);
        this.setParamSimple(map, prefix + "RotationType", this.RotationType);
        this.setParamSimple(map, prefix + "ShiftTime", this.ShiftTime);
        this.setParamSimple(map, prefix + "EffectiveStartTime", this.EffectiveStartTime);
        this.setParamSimple(map, prefix + "EffectiveEndTime", this.EffectiveEndTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "OnCallFormDesc", this.OnCallFormDesc);
        this.setParamArrayObj(map, prefix + "CoverStaffInfos.", this.CoverStaffInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

