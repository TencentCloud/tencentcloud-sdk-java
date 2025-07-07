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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVMatchMusicsRequest extends AbstractModel {

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 用户标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 匹配规则列表。
    */
    @SerializedName("Rules")
    @Expose
    private KTVMatchRule [] Rules;

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 用户标识。 
     * @return UserId 用户标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户标识。
     * @param UserId 用户标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 匹配规则列表。 
     * @return Rules 匹配规则列表。
     */
    public KTVMatchRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 匹配规则列表。
     * @param Rules 匹配规则列表。
     */
    public void setRules(KTVMatchRule [] Rules) {
        this.Rules = Rules;
    }

    public DescribeKTVMatchMusicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVMatchMusicsRequest(DescribeKTVMatchMusicsRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Rules != null) {
            this.Rules = new KTVMatchRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new KTVMatchRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

