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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleList extends AbstractModel{

    /**
    * 规则Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 规则列表的id
    */
    @SerializedName("Rules")
    @Expose
    private Long [] Rules;

    /**
    * 请求url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 请求的方法
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * 时间戳
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 开关状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 规则Id 
     * @return Id 规则Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则Id
     * @param Id 规则Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 规则列表的id 
     * @return Rules 规则列表的id
     */
    public Long [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则列表的id
     * @param Rules 规则列表的id
     */
    public void setRules(Long [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 请求url 
     * @return Url 请求url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 请求url
     * @param Url 请求url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 请求的方法 
     * @return Function 请求的方法
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set 请求的方法
     * @param Function 请求的方法
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get 时间戳 
     * @return Time 时间戳
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间戳
     * @param Time 时间戳
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 开关状态 
     * @return Status 开关状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态
     * @param Status 开关状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public RuleList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleList(RuleList source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Rules != null) {
            this.Rules = new Long[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new Long(source.Rules[i]);
            }
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

