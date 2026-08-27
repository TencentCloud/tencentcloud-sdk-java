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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DispenseFilter extends AbstractModel {

    /**
    * 维度名称
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 维度值列表
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 表示式
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
     * Get 维度名称 
     * @return Key 维度名称
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 维度名称
     * @param Key 维度名称
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 维度值列表 
     * @return Values 维度值列表
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 维度值列表
     * @param Values 维度值列表
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 表示式 
     * @return Expression 表示式
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set 表示式
     * @param Expression 表示式
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    public DispenseFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DispenseFilter(DispenseFilter source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Expression != null) {
            this.Expression = new String(source.Expression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Expression", this.Expression);

    }
}

