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
package com.tencentcloudapi.cloudapp.v20220530.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaleParam extends AbstractModel {

    /**
    * 售卖参数标识
    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * 售卖参数的展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamKeyName")
    @Expose
    private String ParamKeyName;

    /**
    * 售卖参数值，当ParamType=Quant时，该值有可能为Null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamValue")
    @Expose
    private String ParamValue;

    /**
    * 售卖参数值的展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamValueName")
    @Expose
    private String ParamValueName;

    /**
    * 售卖参数的类型，目前支持枚举类Enum/数量类Quant
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
     * Get 售卖参数标识 
     * @return ParamKey 售卖参数标识
     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set 售卖参数标识
     * @param ParamKey 售卖参数标识
     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get 售卖参数的展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamKeyName 售卖参数的展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamKeyName() {
        return this.ParamKeyName;
    }

    /**
     * Set 售卖参数的展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamKeyName 售卖参数的展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamKeyName(String ParamKeyName) {
        this.ParamKeyName = ParamKeyName;
    }

    /**
     * Get 售卖参数值，当ParamType=Quant时，该值有可能为Null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamValue 售卖参数值，当ParamType=Quant时，该值有可能为Null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamValue() {
        return this.ParamValue;
    }

    /**
     * Set 售卖参数值，当ParamType=Quant时，该值有可能为Null
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamValue 售卖参数值，当ParamType=Quant时，该值有可能为Null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamValue(String ParamValue) {
        this.ParamValue = ParamValue;
    }

    /**
     * Get 售卖参数值的展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamValueName 售卖参数值的展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamValueName() {
        return this.ParamValueName;
    }

    /**
     * Set 售卖参数值的展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamValueName 售卖参数值的展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamValueName(String ParamValueName) {
        this.ParamValueName = ParamValueName;
    }

    /**
     * Get 售卖参数的类型，目前支持枚举类Enum/数量类Quant
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamType 售卖参数的类型，目前支持枚举类Enum/数量类Quant
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set 售卖参数的类型，目前支持枚举类Enum/数量类Quant
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamType 售卖参数的类型，目前支持枚举类Enum/数量类Quant
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    public SaleParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaleParam(SaleParam source) {
        if (source.ParamKey != null) {
            this.ParamKey = new String(source.ParamKey);
        }
        if (source.ParamKeyName != null) {
            this.ParamKeyName = new String(source.ParamKeyName);
        }
        if (source.ParamValue != null) {
            this.ParamValue = new String(source.ParamValue);
        }
        if (source.ParamValueName != null) {
            this.ParamValueName = new String(source.ParamValueName);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamKey", this.ParamKey);
        this.setParamSimple(map, prefix + "ParamKeyName", this.ParamKeyName);
        this.setParamSimple(map, prefix + "ParamValue", this.ParamValue);
        this.setParamSimple(map, prefix + "ParamValueName", this.ParamValueName);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);

    }
}

