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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCPrecisionPlyRecord extends AbstractModel{

    /**
    * 配置项类型，当前仅支持value
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * 配置字段，可取值cgi， ua， cookie， referer， accept,  srcip
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 配置取值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 配置项值比对方式，可取值equal ，not_equal， include
    */
    @SerializedName("ValueOperator")
    @Expose
    private String ValueOperator;

    /**
     * Get 配置项类型，当前仅支持value 
     * @return FieldType 配置项类型，当前仅支持value
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set 配置项类型，当前仅支持value
     * @param FieldType 配置项类型，当前仅支持value
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get 配置字段，可取值cgi， ua， cookie， referer， accept,  srcip 
     * @return FieldName 配置字段，可取值cgi， ua， cookie， referer， accept,  srcip
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 配置字段，可取值cgi， ua， cookie， referer， accept,  srcip
     * @param FieldName 配置字段，可取值cgi， ua， cookie， referer， accept,  srcip
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get 配置取值 
     * @return Value 配置取值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 配置取值
     * @param Value 配置取值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 配置项值比对方式，可取值equal ，not_equal， include 
     * @return ValueOperator 配置项值比对方式，可取值equal ，not_equal， include
     */
    public String getValueOperator() {
        return this.ValueOperator;
    }

    /**
     * Set 配置项值比对方式，可取值equal ，not_equal， include
     * @param ValueOperator 配置项值比对方式，可取值equal ，not_equal， include
     */
    public void setValueOperator(String ValueOperator) {
        this.ValueOperator = ValueOperator;
    }

    public CCPrecisionPlyRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCPrecisionPlyRecord(CCPrecisionPlyRecord source) {
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueOperator != null) {
            this.ValueOperator = new String(source.ValueOperator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueOperator", this.ValueOperator);

    }
}

