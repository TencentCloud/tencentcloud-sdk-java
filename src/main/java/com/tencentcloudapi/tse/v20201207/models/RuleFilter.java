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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleFilter extends AbstractModel {

    /**
    * 限流条件的Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 限流条件的Values
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 操作符
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * header或query对应的name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 限流条件的Key 
     * @return Key 限流条件的Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 限流条件的Key
     * @param Key 限流条件的Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 限流条件的Values 
     * @return Values 限流条件的Values
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 限流条件的Values
     * @param Values 限流条件的Values
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 操作符 
     * @return Operator 操作符
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作符
     * @param Operator 操作符
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get header或query对应的name 
     * @return Name header或query对应的name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set header或query对应的name
     * @param Name header或query对应的name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public RuleFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleFilter(RuleFilter source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

