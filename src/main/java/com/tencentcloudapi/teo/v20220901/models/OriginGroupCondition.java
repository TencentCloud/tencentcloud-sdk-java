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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupCondition extends AbstractModel{

    /**
    * 匹配类型，取值有：
<li>url：当前站点下匹配URL路径的请求，例如：/example 或 /example/foo.jpg。支持*表示通配符，支持?表示匹配一个字符。
</li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 运算符，取值有：
<li>equal：等于。</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 对应匹配类型的取值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 匹配类型，取值有：
<li>url：当前站点下匹配URL路径的请求，例如：/example 或 /example/foo.jpg。支持*表示通配符，支持?表示匹配一个字符。
</li> 
     * @return Target 匹配类型，取值有：
<li>url：当前站点下匹配URL路径的请求，例如：/example 或 /example/foo.jpg。支持*表示通配符，支持?表示匹配一个字符。
</li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 匹配类型，取值有：
<li>url：当前站点下匹配URL路径的请求，例如：/example 或 /example/foo.jpg。支持*表示通配符，支持?表示匹配一个字符。
</li>
     * @param Target 匹配类型，取值有：
<li>url：当前站点下匹配URL路径的请求，例如：/example 或 /example/foo.jpg。支持*表示通配符，支持?表示匹配一个字符。
</li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 运算符，取值有：
<li>equal：等于。</li> 
     * @return Operator 运算符，取值有：
<li>equal：等于。</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 运算符，取值有：
<li>equal：等于。</li>
     * @param Operator 运算符，取值有：
<li>equal：等于。</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 对应匹配类型的取值。 
     * @return Values 对应匹配类型的取值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 对应匹配类型的取值。
     * @param Values 对应匹配类型的取值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public OriginGroupCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupCondition(OriginGroupCondition source) {
        if (source.Target != null) {
            this.Target = new String(source.Target);
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
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

