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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiSecExtractRule extends AbstractModel {

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * api名称
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * 请求方法列表
    */
    @SerializedName("Methods")
    @Expose
    private String [] Methods;

    /**
    * 开关状态，0是关，1是开
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 正则匹配内容
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * 10更新时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get api名称 
     * @return ApiName api名称
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set api名称
     * @param ApiName api名称
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 请求方法列表 
     * @return Methods 请求方法列表
     */
    public String [] getMethods() {
        return this.Methods;
    }

    /**
     * Set 请求方法列表
     * @param Methods 请求方法列表
     */
    public void setMethods(String [] Methods) {
        this.Methods = Methods;
    }

    /**
     * Get 开关状态，0是关，1是开 
     * @return Status 开关状态，0是关，1是开
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态，0是关，1是开
     * @param Status 开关状态，0是关，1是开
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 正则匹配内容 
     * @return Regex 正则匹配内容
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 正则匹配内容
     * @param Regex 正则匹配内容
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get 10更新时间戳 
     * @return UpdateTime 10更新时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 10更新时间戳
     * @param UpdateTime 10更新时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ApiSecExtractRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecExtractRule(ApiSecExtractRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.Methods != null) {
            this.Methods = new String[source.Methods.length];
            for (int i = 0; i < source.Methods.length; i++) {
                this.Methods[i] = new String(source.Methods[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamArraySimple(map, prefix + "Methods.", this.Methods);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

