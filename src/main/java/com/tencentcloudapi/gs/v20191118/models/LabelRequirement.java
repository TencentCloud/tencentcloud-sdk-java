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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelRequirement extends AbstractModel {

    /**
    * 标签键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 运算符类型。
IN：要求对象的标签键 Key 对应的标签值需满足 Values 中的一个
NOT_IN：要求对象的标签键 Key 对应的标签值不满足 Values 中的任何一个
EXISTS：要求对象标签存在标签键 Key
NOT_EXISTS: 要求对象标签不存在标签键 Key
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 标签值列表
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 标签键 
     * @return Key 标签键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 标签键
     * @param Key 标签键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 运算符类型。
IN：要求对象的标签键 Key 对应的标签值需满足 Values 中的一个
NOT_IN：要求对象的标签键 Key 对应的标签值不满足 Values 中的任何一个
EXISTS：要求对象标签存在标签键 Key
NOT_EXISTS: 要求对象标签不存在标签键 Key 
     * @return Operator 运算符类型。
IN：要求对象的标签键 Key 对应的标签值需满足 Values 中的一个
NOT_IN：要求对象的标签键 Key 对应的标签值不满足 Values 中的任何一个
EXISTS：要求对象标签存在标签键 Key
NOT_EXISTS: 要求对象标签不存在标签键 Key
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 运算符类型。
IN：要求对象的标签键 Key 对应的标签值需满足 Values 中的一个
NOT_IN：要求对象的标签键 Key 对应的标签值不满足 Values 中的任何一个
EXISTS：要求对象标签存在标签键 Key
NOT_EXISTS: 要求对象标签不存在标签键 Key
     * @param Operator 运算符类型。
IN：要求对象的标签键 Key 对应的标签值需满足 Values 中的一个
NOT_IN：要求对象的标签键 Key 对应的标签值不满足 Values 中的任何一个
EXISTS：要求对象标签存在标签键 Key
NOT_EXISTS: 要求对象标签不存在标签键 Key
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 标签值列表 
     * @return Values 标签值列表
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 标签值列表
     * @param Values 标签值列表
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public LabelRequirement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelRequirement(LabelRequirement source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
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
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

