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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCondition extends AbstractModel {

    /**
    * <p>筛选条件的key。</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>查询条件操作符，操作类型有：</p><li>equals: 等于；</li><li>notEquals: 不等于；</li><li>include: 包含；</li><li>notInclude: 不包含; </li><li>startWith: 开始的值是value；</li><li>notStartWith: 不以value的值开始；</li><li>endWith: 结尾是value值；</li><li>notEndWith: 不以value的值结尾。</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>筛选条件的值。</p>
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get <p>筛选条件的key。</p> 
     * @return Key <p>筛选条件的key。</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>筛选条件的key。</p>
     * @param Key <p>筛选条件的key。</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>查询条件操作符，操作类型有：</p><li>equals: 等于；</li><li>notEquals: 不等于；</li><li>include: 包含；</li><li>notInclude: 不包含; </li><li>startWith: 开始的值是value；</li><li>notStartWith: 不以value的值开始；</li><li>endWith: 结尾是value值；</li><li>notEndWith: 不以value的值结尾。</li> 
     * @return Operator <p>查询条件操作符，操作类型有：</p><li>equals: 等于；</li><li>notEquals: 不等于；</li><li>include: 包含；</li><li>notInclude: 不包含; </li><li>startWith: 开始的值是value；</li><li>notStartWith: 不以value的值开始；</li><li>endWith: 结尾是value值；</li><li>notEndWith: 不以value的值结尾。</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>查询条件操作符，操作类型有：</p><li>equals: 等于；</li><li>notEquals: 不等于；</li><li>include: 包含；</li><li>notInclude: 不包含; </li><li>startWith: 开始的值是value；</li><li>notStartWith: 不以value的值开始；</li><li>endWith: 结尾是value值；</li><li>notEndWith: 不以value的值结尾。</li>
     * @param Operator <p>查询条件操作符，操作类型有：</p><li>equals: 等于；</li><li>notEquals: 不等于；</li><li>include: 包含；</li><li>notInclude: 不包含; </li><li>startWith: 开始的值是value；</li><li>notStartWith: 不以value的值开始；</li><li>endWith: 结尾是value值；</li><li>notEndWith: 不以value的值结尾。</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>筛选条件的值。</p> 
     * @return Value <p>筛选条件的值。</p>
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set <p>筛选条件的值。</p>
     * @param Value <p>筛选条件的值。</p>
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public QueryCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCondition(QueryCondition source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

