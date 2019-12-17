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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCRule extends AbstractModel{

    /**
    * 规则的key, 可以为host、cgi、ua、referer
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * 规则的条件，可以为include、not_include、equal
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 规则的值，长度小于31字节
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 规则的key, 可以为host、cgi、ua、referer 
     * @return Skey 规则的key, 可以为host、cgi、ua、referer
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 规则的key, 可以为host、cgi、ua、referer
     * @param Skey 规则的key, 可以为host、cgi、ua、referer
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get 规则的条件，可以为include、not_include、equal 
     * @return Operator 规则的条件，可以为include、not_include、equal
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 规则的条件，可以为include、not_include、equal
     * @param Operator 规则的条件，可以为include、not_include、equal
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 规则的值，长度小于31字节 
     * @return Value 规则的值，长度小于31字节
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 规则的值，长度小于31字节
     * @param Value 规则的值，长度小于31字节
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

