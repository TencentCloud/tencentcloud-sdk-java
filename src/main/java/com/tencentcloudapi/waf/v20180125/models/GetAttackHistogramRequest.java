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

public class GetAttackHistogramRequest extends AbstractModel {

    /**
    * <p>查询的域名，所有域名使用all</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>查询起始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Lucene语法</p>
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
     * Get <p>查询的域名，所有域名使用all</p> 
     * @return Domain <p>查询的域名，所有域名使用all</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>查询的域名，所有域名使用all</p>
     * @param Domain <p>查询的域名，所有域名使用all</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>查询起始时间</p> 
     * @return StartTime <p>查询起始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始时间</p>
     * @param StartTime <p>查询起始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间</p> 
     * @return EndTime <p>查询结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间</p>
     * @param EndTime <p>查询结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Lucene语法</p> 
     * @return QueryString <p>Lucene语法</p>
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set <p>Lucene语法</p>
     * @param QueryString <p>Lucene语法</p>
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    public GetAttackHistogramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAttackHistogramRequest(GetAttackHistogramRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);

    }
}

