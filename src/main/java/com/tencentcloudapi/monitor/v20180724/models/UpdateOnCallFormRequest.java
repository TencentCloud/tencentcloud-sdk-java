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

public class UpdateOnCallFormRequest extends AbstractModel {

    /**
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>值班表id</p>
    */
    @SerializedName("OnCallFormID")
    @Expose
    private String OnCallFormID;

    /**
    * <p>值班表名称</p>
    */
    @SerializedName("OnCallFormName")
    @Expose
    private String OnCallFormName;

    /**
    * <p>值班人员id组</p>
    */
    @SerializedName("StaffInfos")
    @Expose
    private StaffInfo [] StaffInfos;

    /**
    * <p>轮转类型</p>
    */
    @SerializedName("RotationType")
    @Expose
    private String RotationType;

    /**
    * <p>换班时间</p>
    */
    @SerializedName("ShiftTime")
    @Expose
    private String ShiftTime;

    /**
    * <p>有效期开始时间，单位s</p>
    */
    @SerializedName("EffectiveStartTime")
    @Expose
    private Long EffectiveStartTime;

    /**
    * <p>有效期结束时间，单位s</p>
    */
    @SerializedName("EffectiveEndTime")
    @Expose
    private Long EffectiveEndTime;

    /**
    * <p>时区(-12 - 12)</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private Float TimeZone;

    /**
    * <p>值班表描述</p>
    */
    @SerializedName("OnCallFormDesc")
    @Expose
    private String OnCallFormDesc;

    /**
    * <p>轮班信息</p>
    */
    @SerializedName("CoverStaffInfos")
    @Expose
    private CoverStaffInfo [] CoverStaffInfos;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>值班表id</p> 
     * @return OnCallFormID <p>值班表id</p>
     */
    public String getOnCallFormID() {
        return this.OnCallFormID;
    }

    /**
     * Set <p>值班表id</p>
     * @param OnCallFormID <p>值班表id</p>
     */
    public void setOnCallFormID(String OnCallFormID) {
        this.OnCallFormID = OnCallFormID;
    }

    /**
     * Get <p>值班表名称</p> 
     * @return OnCallFormName <p>值班表名称</p>
     */
    public String getOnCallFormName() {
        return this.OnCallFormName;
    }

    /**
     * Set <p>值班表名称</p>
     * @param OnCallFormName <p>值班表名称</p>
     */
    public void setOnCallFormName(String OnCallFormName) {
        this.OnCallFormName = OnCallFormName;
    }

    /**
     * Get <p>值班人员id组</p> 
     * @return StaffInfos <p>值班人员id组</p>
     */
    public StaffInfo [] getStaffInfos() {
        return this.StaffInfos;
    }

    /**
     * Set <p>值班人员id组</p>
     * @param StaffInfos <p>值班人员id组</p>
     */
    public void setStaffInfos(StaffInfo [] StaffInfos) {
        this.StaffInfos = StaffInfos;
    }

    /**
     * Get <p>轮转类型</p> 
     * @return RotationType <p>轮转类型</p>
     */
    public String getRotationType() {
        return this.RotationType;
    }

    /**
     * Set <p>轮转类型</p>
     * @param RotationType <p>轮转类型</p>
     */
    public void setRotationType(String RotationType) {
        this.RotationType = RotationType;
    }

    /**
     * Get <p>换班时间</p> 
     * @return ShiftTime <p>换班时间</p>
     */
    public String getShiftTime() {
        return this.ShiftTime;
    }

    /**
     * Set <p>换班时间</p>
     * @param ShiftTime <p>换班时间</p>
     */
    public void setShiftTime(String ShiftTime) {
        this.ShiftTime = ShiftTime;
    }

    /**
     * Get <p>有效期开始时间，单位s</p> 
     * @return EffectiveStartTime <p>有效期开始时间，单位s</p>
     */
    public Long getEffectiveStartTime() {
        return this.EffectiveStartTime;
    }

    /**
     * Set <p>有效期开始时间，单位s</p>
     * @param EffectiveStartTime <p>有效期开始时间，单位s</p>
     */
    public void setEffectiveStartTime(Long EffectiveStartTime) {
        this.EffectiveStartTime = EffectiveStartTime;
    }

    /**
     * Get <p>有效期结束时间，单位s</p> 
     * @return EffectiveEndTime <p>有效期结束时间，单位s</p>
     */
    public Long getEffectiveEndTime() {
        return this.EffectiveEndTime;
    }

    /**
     * Set <p>有效期结束时间，单位s</p>
     * @param EffectiveEndTime <p>有效期结束时间，单位s</p>
     */
    public void setEffectiveEndTime(Long EffectiveEndTime) {
        this.EffectiveEndTime = EffectiveEndTime;
    }

    /**
     * Get <p>时区(-12 - 12)</p> 
     * @return TimeZone <p>时区(-12 - 12)</p>
     */
    public Float getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>时区(-12 - 12)</p>
     * @param TimeZone <p>时区(-12 - 12)</p>
     */
    public void setTimeZone(Float TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>值班表描述</p> 
     * @return OnCallFormDesc <p>值班表描述</p>
     */
    public String getOnCallFormDesc() {
        return this.OnCallFormDesc;
    }

    /**
     * Set <p>值班表描述</p>
     * @param OnCallFormDesc <p>值班表描述</p>
     */
    public void setOnCallFormDesc(String OnCallFormDesc) {
        this.OnCallFormDesc = OnCallFormDesc;
    }

    /**
     * Get <p>轮班信息</p> 
     * @return CoverStaffInfos <p>轮班信息</p>
     */
    public CoverStaffInfo [] getCoverStaffInfos() {
        return this.CoverStaffInfos;
    }

    /**
     * Set <p>轮班信息</p>
     * @param CoverStaffInfos <p>轮班信息</p>
     */
    public void setCoverStaffInfos(CoverStaffInfo [] CoverStaffInfos) {
        this.CoverStaffInfos = CoverStaffInfos;
    }

    public UpdateOnCallFormRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOnCallFormRequest(UpdateOnCallFormRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.OnCallFormID != null) {
            this.OnCallFormID = new String(source.OnCallFormID);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "OnCallFormID", this.OnCallFormID);
        this.setParamSimple(map, prefix + "OnCallFormName", this.OnCallFormName);
        this.setParamArrayObj(map, prefix + "StaffInfos.", this.StaffInfos);
        this.setParamSimple(map, prefix + "RotationType", this.RotationType);
        this.setParamSimple(map, prefix + "ShiftTime", this.ShiftTime);
        this.setParamSimple(map, prefix + "EffectiveStartTime", this.EffectiveStartTime);
        this.setParamSimple(map, prefix + "EffectiveEndTime", this.EffectiveEndTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "OnCallFormDesc", this.OnCallFormDesc);
        this.setParamArrayObj(map, prefix + "CoverStaffInfos.", this.CoverStaffInfos);

    }
}

