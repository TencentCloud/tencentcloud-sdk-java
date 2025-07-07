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

public class DischargeConditionBlock extends AbstractModel {

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
    * 对外输出值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 归一化值
    */
    @SerializedName("Norm")
    @Expose
    private String Norm;

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

    public DischargeConditionBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DischargeConditionBlock(DischargeConditionBlock source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Norm != null) {
            this.Norm = new String(source.Norm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Norm", this.Norm);

    }
}

