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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchAttribute extends AbstractModel{

    /**
    * 属性名 长度 128 [a-zA-Z0-9-\.]*
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 属性类型: 0 数值; 1 string; 默认 0
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 数字属性值 默认 0.0
    */
    @SerializedName("NumberValue")
    @Expose
    private Float NumberValue;

    /**
    * 字符串属性值 长度 128 默认 ""
    */
    @SerializedName("StringValue")
    @Expose
    private String StringValue;

    /**
    * list 属性值
    */
    @SerializedName("ListValue")
    @Expose
    private String [] ListValue;

    /**
    * 字典属性值
    */
    @SerializedName("MapValue")
    @Expose
    private AttributeMap [] MapValue;

    /**
     * Get 属性名 长度 128 [a-zA-Z0-9-\.]* 
     * @return Name 属性名 长度 128 [a-zA-Z0-9-\.]*
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 属性名 长度 128 [a-zA-Z0-9-\.]*
     * @param Name 属性名 长度 128 [a-zA-Z0-9-\.]*
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 属性类型: 0 数值; 1 string; 默认 0 
     * @return Type 属性类型: 0 数值; 1 string; 默认 0
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 属性类型: 0 数值; 1 string; 默认 0
     * @param Type 属性类型: 0 数值; 1 string; 默认 0
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 数字属性值 默认 0.0 
     * @return NumberValue 数字属性值 默认 0.0
     */
    public Float getNumberValue() {
        return this.NumberValue;
    }

    /**
     * Set 数字属性值 默认 0.0
     * @param NumberValue 数字属性值 默认 0.0
     */
    public void setNumberValue(Float NumberValue) {
        this.NumberValue = NumberValue;
    }

    /**
     * Get 字符串属性值 长度 128 默认 "" 
     * @return StringValue 字符串属性值 长度 128 默认 ""
     */
    public String getStringValue() {
        return this.StringValue;
    }

    /**
     * Set 字符串属性值 长度 128 默认 ""
     * @param StringValue 字符串属性值 长度 128 默认 ""
     */
    public void setStringValue(String StringValue) {
        this.StringValue = StringValue;
    }

    /**
     * Get list 属性值 
     * @return ListValue list 属性值
     */
    public String [] getListValue() {
        return this.ListValue;
    }

    /**
     * Set list 属性值
     * @param ListValue list 属性值
     */
    public void setListValue(String [] ListValue) {
        this.ListValue = ListValue;
    }

    /**
     * Get 字典属性值 
     * @return MapValue 字典属性值
     */
    public AttributeMap [] getMapValue() {
        return this.MapValue;
    }

    /**
     * Set 字典属性值
     * @param MapValue 字典属性值
     */
    public void setMapValue(AttributeMap [] MapValue) {
        this.MapValue = MapValue;
    }

    public MatchAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MatchAttribute(MatchAttribute source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.NumberValue != null) {
            this.NumberValue = new Float(source.NumberValue);
        }
        if (source.StringValue != null) {
            this.StringValue = new String(source.StringValue);
        }
        if (source.ListValue != null) {
            this.ListValue = new String[source.ListValue.length];
            for (int i = 0; i < source.ListValue.length; i++) {
                this.ListValue[i] = new String(source.ListValue[i]);
            }
        }
        if (source.MapValue != null) {
            this.MapValue = new AttributeMap[source.MapValue.length];
            for (int i = 0; i < source.MapValue.length; i++) {
                this.MapValue[i] = new AttributeMap(source.MapValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NumberValue", this.NumberValue);
        this.setParamSimple(map, prefix + "StringValue", this.StringValue);
        this.setParamArraySimple(map, prefix + "ListValue.", this.ListValue);
        this.setParamArrayObj(map, prefix + "MapValue.", this.MapValue);

    }
}

