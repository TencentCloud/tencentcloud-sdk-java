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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SMTParam extends AbstractModel{

    /**
    * 数据处理KEY
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 操作，DATE系统预设-时间戳，CUSTOMIZE自定义，MAPPING映射，JSONPATH
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 数据类型，ORIGINAL原始，STRING，INT64，FLOAT64，BOOLEAN，MAP，ARRAY
    */
    @SerializedName("SchemeType")
    @Expose
    private String SchemeType;

    /**
    * 数据处理VALUE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * VALUE处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueOperate")
    @Expose
    private ValueParam ValueOperate;

    /**
    * 原始VALUE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalValue")
    @Expose
    private String OriginalValue;

    /**
    * VALUE处理链
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueOperates")
    @Expose
    private ValueParam [] ValueOperates;

    /**
     * Get 数据处理KEY 
     * @return Key 数据处理KEY
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 数据处理KEY
     * @param Key 数据处理KEY
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 操作，DATE系统预设-时间戳，CUSTOMIZE自定义，MAPPING映射，JSONPATH 
     * @return Operate 操作，DATE系统预设-时间戳，CUSTOMIZE自定义，MAPPING映射，JSONPATH
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 操作，DATE系统预设-时间戳，CUSTOMIZE自定义，MAPPING映射，JSONPATH
     * @param Operate 操作，DATE系统预设-时间戳，CUSTOMIZE自定义，MAPPING映射，JSONPATH
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 数据类型，ORIGINAL原始，STRING，INT64，FLOAT64，BOOLEAN，MAP，ARRAY 
     * @return SchemeType 数据类型，ORIGINAL原始，STRING，INT64，FLOAT64，BOOLEAN，MAP，ARRAY
     */
    public String getSchemeType() {
        return this.SchemeType;
    }

    /**
     * Set 数据类型，ORIGINAL原始，STRING，INT64，FLOAT64，BOOLEAN，MAP，ARRAY
     * @param SchemeType 数据类型，ORIGINAL原始，STRING，INT64，FLOAT64，BOOLEAN，MAP，ARRAY
     */
    public void setSchemeType(String SchemeType) {
        this.SchemeType = SchemeType;
    }

    /**
     * Get 数据处理VALUE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 数据处理VALUE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 数据处理VALUE
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 数据处理VALUE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get VALUE处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueOperate VALUE处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ValueParam getValueOperate() {
        return this.ValueOperate;
    }

    /**
     * Set VALUE处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueOperate VALUE处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueOperate(ValueParam ValueOperate) {
        this.ValueOperate = ValueOperate;
    }

    /**
     * Get 原始VALUE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalValue 原始VALUE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalValue() {
        return this.OriginalValue;
    }

    /**
     * Set 原始VALUE
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalValue 原始VALUE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalValue(String OriginalValue) {
        this.OriginalValue = OriginalValue;
    }

    /**
     * Get VALUE处理链
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueOperates VALUE处理链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ValueParam [] getValueOperates() {
        return this.ValueOperates;
    }

    /**
     * Set VALUE处理链
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueOperates VALUE处理链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueOperates(ValueParam [] ValueOperates) {
        this.ValueOperates = ValueOperates;
    }

    public SMTParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SMTParam(SMTParam source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.SchemeType != null) {
            this.SchemeType = new String(source.SchemeType);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueOperate != null) {
            this.ValueOperate = new ValueParam(source.ValueOperate);
        }
        if (source.OriginalValue != null) {
            this.OriginalValue = new String(source.OriginalValue);
        }
        if (source.ValueOperates != null) {
            this.ValueOperates = new ValueParam[source.ValueOperates.length];
            for (int i = 0; i < source.ValueOperates.length; i++) {
                this.ValueOperates[i] = new ValueParam(source.ValueOperates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "SchemeType", this.SchemeType);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamObj(map, prefix + "ValueOperate.", this.ValueOperate);
        this.setParamSimple(map, prefix + "OriginalValue", this.OriginalValue);
        this.setParamArrayObj(map, prefix + "ValueOperates.", this.ValueOperates);

    }
}

