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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filters extends AbstractModel {

    /**
    * 是否反转
    */
    @SerializedName("IsReversed")
    @Expose
    private Boolean IsReversed;

    /**
    * 键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运算符
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 是否反转 
     * @return IsReversed 是否反转
     */
    public Boolean getIsReversed() {
        return this.IsReversed;
    }

    /**
     * Set 是否反转
     * @param IsReversed 是否反转
     */
    public void setIsReversed(Boolean IsReversed) {
        this.IsReversed = IsReversed;
    }

    /**
     * Get 键 
     * @return Key 键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 键
     * @param Key 键
     */
    public void setKey(String Key) {
        this.Key = Key;
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
     * Get 运算符 
     * @return Operator 运算符
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 运算符
     * @param Operator 运算符
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 值 
     * @return Values 值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 值
     * @param Values 值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Filters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filters(Filters source) {
        if (source.IsReversed != null) {
            this.IsReversed = new Boolean(source.IsReversed);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsReversed", this.IsReversed);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

