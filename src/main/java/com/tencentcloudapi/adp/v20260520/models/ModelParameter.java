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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelParameter extends AbstractModel {

    /**
    * <p>默认值</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>可选值列表</p>
    */
    @SerializedName("EnumValueList")
    @Expose
    private String [] EnumValueList;

    /**
    * <p>最大值（仅数值类型有效）</p>
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * <p>最小值（仅数值类型有效）</p>
    */
    @SerializedName("MinValue")
    @Expose
    private Float MinValue;

    /**
    * <p>超参名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>超参类型。1-浮点数, 2-整数, 3-字符串</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>默认值</p> 
     * @return DefaultValue <p>默认值</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>默认值</p>
     * @param DefaultValue <p>默认值</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>可选值列表</p> 
     * @return EnumValueList <p>可选值列表</p>
     */
    public String [] getEnumValueList() {
        return this.EnumValueList;
    }

    /**
     * Set <p>可选值列表</p>
     * @param EnumValueList <p>可选值列表</p>
     */
    public void setEnumValueList(String [] EnumValueList) {
        this.EnumValueList = EnumValueList;
    }

    /**
     * Get <p>最大值（仅数值类型有效）</p> 
     * @return MaxValue <p>最大值（仅数值类型有效）</p>
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set <p>最大值（仅数值类型有效）</p>
     * @param MaxValue <p>最大值（仅数值类型有效）</p>
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get <p>最小值（仅数值类型有效）</p> 
     * @return MinValue <p>最小值（仅数值类型有效）</p>
     */
    public Float getMinValue() {
        return this.MinValue;
    }

    /**
     * Set <p>最小值（仅数值类型有效）</p>
     * @param MinValue <p>最小值（仅数值类型有效）</p>
     */
    public void setMinValue(Float MinValue) {
        this.MinValue = MinValue;
    }

    /**
     * Get <p>超参名称</p> 
     * @return Name <p>超参名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>超参名称</p>
     * @param Name <p>超参名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>超参类型。1-浮点数, 2-整数, 3-字符串</p> 
     * @return Type <p>超参类型。1-浮点数, 2-整数, 3-字符串</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>超参类型。1-浮点数, 2-整数, 3-字符串</p>
     * @param Type <p>超参类型。1-浮点数, 2-整数, 3-字符串</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ModelParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelParameter(ModelParameter source) {
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.EnumValueList != null) {
            this.EnumValueList = new String[source.EnumValueList.length];
            for (int i = 0; i < source.EnumValueList.length; i++) {
                this.EnumValueList[i] = new String(source.EnumValueList[i]);
            }
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Float(source.MaxValue);
        }
        if (source.MinValue != null) {
            this.MinValue = new Float(source.MinValue);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamArraySimple(map, prefix + "EnumValueList.", this.EnumValueList);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "MinValue", this.MinValue);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

