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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnAclRule extends AbstractModel{

    /**
    * 匹配关键字
    */
    @SerializedName("MatchKey")
    @Expose
    private String MatchKey;

    /**
    * 逻辑操作符，取值如下
    */
    @SerializedName("LogiOperator")
    @Expose
    private String LogiOperator;

    /**
    * 匹配值。
    */
    @SerializedName("MatchValue")
    @Expose
    private String MatchValue;

    /**
     * Get 匹配关键字 
     * @return MatchKey 匹配关键字
     */
    public String getMatchKey() {
        return this.MatchKey;
    }

    /**
     * Set 匹配关键字
     * @param MatchKey 匹配关键字
     */
    public void setMatchKey(String MatchKey) {
        this.MatchKey = MatchKey;
    }

    /**
     * Get 逻辑操作符，取值如下 
     * @return LogiOperator 逻辑操作符，取值如下
     */
    public String getLogiOperator() {
        return this.LogiOperator;
    }

    /**
     * Set 逻辑操作符，取值如下
     * @param LogiOperator 逻辑操作符，取值如下
     */
    public void setLogiOperator(String LogiOperator) {
        this.LogiOperator = LogiOperator;
    }

    /**
     * Get 匹配值。 
     * @return MatchValue 匹配值。
     */
    public String getMatchValue() {
        return this.MatchValue;
    }

    /**
     * Set 匹配值。
     * @param MatchValue 匹配值。
     */
    public void setMatchValue(String MatchValue) {
        this.MatchValue = MatchValue;
    }

    public ScdnAclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnAclRule(ScdnAclRule source) {
        if (source.MatchKey != null) {
            this.MatchKey = new String(source.MatchKey);
        }
        if (source.LogiOperator != null) {
            this.LogiOperator = new String(source.LogiOperator);
        }
        if (source.MatchValue != null) {
            this.MatchValue = new String(source.MatchValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchKey", this.MatchKey);
        this.setParamSimple(map, prefix + "LogiOperator", this.LogiOperator);
        this.setParamSimple(map, prefix + "MatchValue", this.MatchValue);

    }
}

