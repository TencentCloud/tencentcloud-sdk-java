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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTopBotDataRequest extends AbstractModel {

    /**
    * 获取Top量，取值范围[1-10]
    */
    @SerializedName("TopCount")
    @Expose
    private Long TopCount;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * session表示查询BOT会话的Top信息
ip表示查询BOT客户端IP的Top信息

不填代表获取会话信息
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 域名，仅当Metric=ip时有效，不填写表示使用Domains参数
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名，仅当Metric=ip，并且Domain为空时有效，不填写表示获取AppID信息
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get 获取Top量，取值范围[1-10] 
     * @return TopCount 获取Top量，取值范围[1-10]
     */
    public Long getTopCount() {
        return this.TopCount;
    }

    /**
     * Set 获取Top量，取值范围[1-10]
     * @param TopCount 获取Top量，取值范围[1-10]
     */
    public void setTopCount(Long TopCount) {
        this.TopCount = TopCount;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get session表示查询BOT会话的Top信息
ip表示查询BOT客户端IP的Top信息

不填代表获取会话信息 
     * @return Metric session表示查询BOT会话的Top信息
ip表示查询BOT客户端IP的Top信息

不填代表获取会话信息
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set session表示查询BOT会话的Top信息
ip表示查询BOT客户端IP的Top信息

不填代表获取会话信息
     * @param Metric session表示查询BOT会话的Top信息
ip表示查询BOT客户端IP的Top信息

不填代表获取会话信息
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 域名，仅当Metric=ip时有效，不填写表示使用Domains参数 
     * @return Domain 域名，仅当Metric=ip时有效，不填写表示使用Domains参数
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名，仅当Metric=ip时有效，不填写表示使用Domains参数
     * @param Domain 域名，仅当Metric=ip时有效，不填写表示使用Domains参数
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名，仅当Metric=ip，并且Domain为空时有效，不填写表示获取AppID信息 
     * @return Domains 域名，仅当Metric=ip，并且Domain为空时有效，不填写表示获取AppID信息
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名，仅当Metric=ip，并且Domain为空时有效，不填写表示获取AppID信息
     * @param Domains 域名，仅当Metric=ip，并且Domain为空时有效，不填写表示获取AppID信息
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public ListTopBotDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTopBotDataRequest(ListTopBotDataRequest source) {
        if (source.TopCount != null) {
            this.TopCount = new Long(source.TopCount);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopCount", this.TopCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

