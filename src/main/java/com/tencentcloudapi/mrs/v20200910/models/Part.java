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

public class Part extends AbstractModel {

    /**
    * 原文位置
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
    * 部位
    */
    @SerializedName("NormPart")
    @Expose
    private NormPart NormPart;

    /**
    * 原文
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 值
    */
    @SerializedName("ValueBrief")
    @Expose
    private String ValueBrief;

    /**
     * Get 原文位置 
     * @return Index 原文位置
     */
    public Long [] getIndex() {
        return this.Index;
    }

    /**
     * Set 原文位置
     * @param Index 原文位置
     */
    public void setIndex(Long [] Index) {
        this.Index = Index;
    }

    /**
     * Get 部位 
     * @return NormPart 部位
     */
    public NormPart getNormPart() {
        return this.NormPart;
    }

    /**
     * Set 部位
     * @param NormPart 部位
     */
    public void setNormPart(NormPart NormPart) {
        this.NormPart = NormPart;
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
     * Get 值 
     * @return Value 值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 值
     * @param Value 值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

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
     * Get 值 
     * @return ValueBrief 值
     */
    public String getValueBrief() {
        return this.ValueBrief;
    }

    /**
     * Set 值
     * @param ValueBrief 值
     */
    public void setValueBrief(String ValueBrief) {
        this.ValueBrief = ValueBrief;
    }

    public Part() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Part(Part source) {
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.NormPart != null) {
            this.NormPart = new NormPart(source.NormPart);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ValueBrief != null) {
            this.ValueBrief = new String(source.ValueBrief);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Index.", this.Index);
        this.setParamObj(map, prefix + "NormPart.", this.NormPart);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ValueBrief", this.ValueBrief);

    }
}

