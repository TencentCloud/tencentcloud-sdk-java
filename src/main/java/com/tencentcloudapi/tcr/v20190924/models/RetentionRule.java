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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionRule extends AbstractModel{

    /**
    * 支持的策略，可选值为latestPushedK（保留最新推送多少个版本）nDaysSinceLastPush（保留近天内推送）
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 规则设置下的对应值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 支持的策略，可选值为latestPushedK（保留最新推送多少个版本）nDaysSinceLastPush（保留近天内推送） 
     * @return Key 支持的策略，可选值为latestPushedK（保留最新推送多少个版本）nDaysSinceLastPush（保留近天内推送）
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 支持的策略，可选值为latestPushedK（保留最新推送多少个版本）nDaysSinceLastPush（保留近天内推送）
     * @param Key 支持的策略，可选值为latestPushedK（保留最新推送多少个版本）nDaysSinceLastPush（保留近天内推送）
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 规则设置下的对应值 
     * @return Value 规则设置下的对应值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 规则设置下的对应值
     * @param Value 规则设置下的对应值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public RetentionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionRule(RetentionRule source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

