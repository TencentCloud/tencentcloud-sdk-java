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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Dict extends AbstractModel {

    /**
    * 给药频次编码
    */
    @SerializedName("FreqCode")
    @Expose
    private String FreqCode;

    /**
    * 给药频次名称
    */
    @SerializedName("FreqName")
    @Expose
    private String FreqName;

    /**
    * 是否禁用 0-启用 1-禁用
    */
    @SerializedName("Disable")
    @Expose
    private Long Disable;

    /**
    * 给药途径编码
    */
    @SerializedName("UsageCode")
    @Expose
    private String UsageCode;

    /**
    * 给药途径名称
    */
    @SerializedName("UsageName")
    @Expose
    private String UsageName;

    /**
    * 科室ID
    */
    @SerializedName("DeptId")
    @Expose
    private String DeptId;

    /**
    * 科室名称
    */
    @SerializedName("DeptName")
    @Expose
    private String DeptName;

    /**
    * 科室区域类型 0:门诊  1:住院  2:门诊+住院
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 门诊开关
    */
    @SerializedName("OutpatientOn")
    @Expose
    private Boolean OutpatientOn;

    /**
    * 住院
    */
    @SerializedName("InHospitalOn")
    @Expose
    private Boolean InHospitalOn;

    /**
    * 诊断编码
    */
    @SerializedName("DiagCode")
    @Expose
    private String DiagCode;

    /**
    * 诊断名称
    */
    @SerializedName("DiagName")
    @Expose
    private String DiagName;

    /**
    * ICD代码
    */
    @SerializedName("IcdCode")
    @Expose
    private String IcdCode;

    /**
     * Get 给药频次编码 
     * @return FreqCode 给药频次编码
     */
    public String getFreqCode() {
        return this.FreqCode;
    }

    /**
     * Set 给药频次编码
     * @param FreqCode 给药频次编码
     */
    public void setFreqCode(String FreqCode) {
        this.FreqCode = FreqCode;
    }

    /**
     * Get 给药频次名称 
     * @return FreqName 给药频次名称
     */
    public String getFreqName() {
        return this.FreqName;
    }

    /**
     * Set 给药频次名称
     * @param FreqName 给药频次名称
     */
    public void setFreqName(String FreqName) {
        this.FreqName = FreqName;
    }

    /**
     * Get 是否禁用 0-启用 1-禁用 
     * @return Disable 是否禁用 0-启用 1-禁用
     */
    public Long getDisable() {
        return this.Disable;
    }

    /**
     * Set 是否禁用 0-启用 1-禁用
     * @param Disable 是否禁用 0-启用 1-禁用
     */
    public void setDisable(Long Disable) {
        this.Disable = Disable;
    }

    /**
     * Get 给药途径编码 
     * @return UsageCode 给药途径编码
     */
    public String getUsageCode() {
        return this.UsageCode;
    }

    /**
     * Set 给药途径编码
     * @param UsageCode 给药途径编码
     */
    public void setUsageCode(String UsageCode) {
        this.UsageCode = UsageCode;
    }

    /**
     * Get 给药途径名称 
     * @return UsageName 给药途径名称
     */
    public String getUsageName() {
        return this.UsageName;
    }

    /**
     * Set 给药途径名称
     * @param UsageName 给药途径名称
     */
    public void setUsageName(String UsageName) {
        this.UsageName = UsageName;
    }

    /**
     * Get 科室ID 
     * @return DeptId 科室ID
     */
    public String getDeptId() {
        return this.DeptId;
    }

    /**
     * Set 科室ID
     * @param DeptId 科室ID
     */
    public void setDeptId(String DeptId) {
        this.DeptId = DeptId;
    }

    /**
     * Get 科室名称 
     * @return DeptName 科室名称
     */
    public String getDeptName() {
        return this.DeptName;
    }

    /**
     * Set 科室名称
     * @param DeptName 科室名称
     */
    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    /**
     * Get 科室区域类型 0:门诊  1:住院  2:门诊+住院 
     * @return Scope 科室区域类型 0:门诊  1:住院  2:门诊+住院
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 科室区域类型 0:门诊  1:住院  2:门诊+住院
     * @param Scope 科室区域类型 0:门诊  1:住院  2:门诊+住院
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 门诊开关 
     * @return OutpatientOn 门诊开关
     */
    public Boolean getOutpatientOn() {
        return this.OutpatientOn;
    }

    /**
     * Set 门诊开关
     * @param OutpatientOn 门诊开关
     */
    public void setOutpatientOn(Boolean OutpatientOn) {
        this.OutpatientOn = OutpatientOn;
    }

    /**
     * Get 住院 
     * @return InHospitalOn 住院
     */
    public Boolean getInHospitalOn() {
        return this.InHospitalOn;
    }

    /**
     * Set 住院
     * @param InHospitalOn 住院
     */
    public void setInHospitalOn(Boolean InHospitalOn) {
        this.InHospitalOn = InHospitalOn;
    }

    /**
     * Get 诊断编码 
     * @return DiagCode 诊断编码
     */
    public String getDiagCode() {
        return this.DiagCode;
    }

    /**
     * Set 诊断编码
     * @param DiagCode 诊断编码
     */
    public void setDiagCode(String DiagCode) {
        this.DiagCode = DiagCode;
    }

    /**
     * Get 诊断名称 
     * @return DiagName 诊断名称
     */
    public String getDiagName() {
        return this.DiagName;
    }

    /**
     * Set 诊断名称
     * @param DiagName 诊断名称
     */
    public void setDiagName(String DiagName) {
        this.DiagName = DiagName;
    }

    /**
     * Get ICD代码 
     * @return IcdCode ICD代码
     */
    public String getIcdCode() {
        return this.IcdCode;
    }

    /**
     * Set ICD代码
     * @param IcdCode ICD代码
     */
    public void setIcdCode(String IcdCode) {
        this.IcdCode = IcdCode;
    }

    public Dict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Dict(Dict source) {
        if (source.FreqCode != null) {
            this.FreqCode = new String(source.FreqCode);
        }
        if (source.FreqName != null) {
            this.FreqName = new String(source.FreqName);
        }
        if (source.Disable != null) {
            this.Disable = new Long(source.Disable);
        }
        if (source.UsageCode != null) {
            this.UsageCode = new String(source.UsageCode);
        }
        if (source.UsageName != null) {
            this.UsageName = new String(source.UsageName);
        }
        if (source.DeptId != null) {
            this.DeptId = new String(source.DeptId);
        }
        if (source.DeptName != null) {
            this.DeptName = new String(source.DeptName);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.OutpatientOn != null) {
            this.OutpatientOn = new Boolean(source.OutpatientOn);
        }
        if (source.InHospitalOn != null) {
            this.InHospitalOn = new Boolean(source.InHospitalOn);
        }
        if (source.DiagCode != null) {
            this.DiagCode = new String(source.DiagCode);
        }
        if (source.DiagName != null) {
            this.DiagName = new String(source.DiagName);
        }
        if (source.IcdCode != null) {
            this.IcdCode = new String(source.IcdCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FreqCode", this.FreqCode);
        this.setParamSimple(map, prefix + "FreqName", this.FreqName);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamSimple(map, prefix + "UsageCode", this.UsageCode);
        this.setParamSimple(map, prefix + "UsageName", this.UsageName);
        this.setParamSimple(map, prefix + "DeptId", this.DeptId);
        this.setParamSimple(map, prefix + "DeptName", this.DeptName);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "OutpatientOn", this.OutpatientOn);
        this.setParamSimple(map, prefix + "InHospitalOn", this.InHospitalOn);
        this.setParamSimple(map, prefix + "DiagCode", this.DiagCode);
        this.setParamSimple(map, prefix + "DiagName", this.DiagName);
        this.setParamSimple(map, prefix + "IcdCode", this.IcdCode);

    }
}

