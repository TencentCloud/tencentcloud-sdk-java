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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BloodPressureBlock extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 归一化值
    */
    @SerializedName("Norm")
    @Expose
    private String Norm;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 对外输出值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 舒张压
    */
    @SerializedName("NormDiastolic")
    @Expose
    private String NormDiastolic;

    /**
    * 收缩压
    */
    @SerializedName("NormSystolic")
    @Expose
    private String NormSystolic;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 原文 
     * @return Src 原文
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
     * @param Src 原文
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 归一化值 
     * @return Norm 归一化值
     */
    public String getNorm() {
        return this.Norm;
    }

    /**
     * Set 归一化值
     * @param Norm 归一化值
     */
    public void setNorm(String Norm) {
        this.Norm = Norm;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 对外输出值 
     * @return Value 对外输出值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 对外输出值
     * @param Value 对外输出值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 舒张压 
     * @return NormDiastolic 舒张压
     */
    public String getNormDiastolic() {
        return this.NormDiastolic;
    }

    /**
     * Set 舒张压
     * @param NormDiastolic 舒张压
     */
    public void setNormDiastolic(String NormDiastolic) {
        this.NormDiastolic = NormDiastolic;
    }

    /**
     * Get 收缩压 
     * @return NormSystolic 收缩压
     */
    public String getNormSystolic() {
        return this.NormSystolic;
    }

    /**
     * Set 收缩压
     * @param NormSystolic 收缩压
     */
    public void setNormSystolic(String NormSystolic) {
        this.NormSystolic = NormSystolic;
    }

    public BloodPressureBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BloodPressureBlock(BloodPressureBlock source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Norm != null) {
            this.Norm = new String(source.Norm);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.NormDiastolic != null) {
            this.NormDiastolic = new String(source.NormDiastolic);
        }
        if (source.NormSystolic != null) {
            this.NormSystolic = new String(source.NormSystolic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Norm", this.Norm);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "NormDiastolic", this.NormDiastolic);
        this.setParamSimple(map, prefix + "NormSystolic", this.NormSystolic);

    }
}

