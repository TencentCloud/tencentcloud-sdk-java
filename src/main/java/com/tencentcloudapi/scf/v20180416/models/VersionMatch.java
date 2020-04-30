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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionMatch extends AbstractModel{

    /**
    * 函数版本名称
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 匹配规则的key，调用时通过传key来匹配规则路由到指定版本
header方式：
key填写"invoke.headers.User"，并在 invoke 调用函数时传参 RoutingKey：{"User":"value"}规则匹配调用
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 匹配方式。取值范围：
range：范围匹配
exact：字符串精确匹配
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * range 匹配规则要求：
需要为开区间或闭区间描述 (a,b) [a,b]，其中 a、b 均为整数
exact 匹配规则要求：
字符串精确匹配
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
     * Get 函数版本名称 
     * @return Version 函数版本名称
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 函数版本名称
     * @param Version 函数版本名称
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 匹配规则的key，调用时通过传key来匹配规则路由到指定版本
header方式：
key填写"invoke.headers.User"，并在 invoke 调用函数时传参 RoutingKey：{"User":"value"}规则匹配调用 
     * @return Key 匹配规则的key，调用时通过传key来匹配规则路由到指定版本
header方式：
key填写"invoke.headers.User"，并在 invoke 调用函数时传参 RoutingKey：{"User":"value"}规则匹配调用
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 匹配规则的key，调用时通过传key来匹配规则路由到指定版本
header方式：
key填写"invoke.headers.User"，并在 invoke 调用函数时传参 RoutingKey：{"User":"value"}规则匹配调用
     * @param Key 匹配规则的key，调用时通过传key来匹配规则路由到指定版本
header方式：
key填写"invoke.headers.User"，并在 invoke 调用函数时传参 RoutingKey：{"User":"value"}规则匹配调用
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 匹配方式。取值范围：
range：范围匹配
exact：字符串精确匹配 
     * @return Method 匹配方式。取值范围：
range：范围匹配
exact：字符串精确匹配
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 匹配方式。取值范围：
range：范围匹配
exact：字符串精确匹配
     * @param Method 匹配方式。取值范围：
range：范围匹配
exact：字符串精确匹配
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get range 匹配规则要求：
需要为开区间或闭区间描述 (a,b) [a,b]，其中 a、b 均为整数
exact 匹配规则要求：
字符串精确匹配 
     * @return Expression range 匹配规则要求：
需要为开区间或闭区间描述 (a,b) [a,b]，其中 a、b 均为整数
exact 匹配规则要求：
字符串精确匹配
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set range 匹配规则要求：
需要为开区间或闭区间描述 (a,b) [a,b]，其中 a、b 均为整数
exact 匹配规则要求：
字符串精确匹配
     * @param Expression range 匹配规则要求：
需要为开区间或闭区间描述 (a,b) [a,b]，其中 a、b 均为整数
exact 匹配规则要求：
字符串精确匹配
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Expression", this.Expression);

    }
}

