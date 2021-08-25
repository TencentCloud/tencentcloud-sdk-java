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

public class ListTopCcDataRequest extends AbstractModel{

    /**
    * 查询Top数据的开始时间，格式为：2020-01-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，不传此参数，表示查当天数据
时间跨度要小于等于7天
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 域名，不传此参数，表示查询账号级别数据
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 统计指标：
ip_url : Top IP+URL 默认值
ua :  Top UA
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * cdn表示CDN数据，默认值
ecdn表示ECDN数据
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 域名列表，不传此参数，表示查询账号级别数据
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
为空表示查询所有执行动作数据
    */
    @SerializedName("ActionName")
    @Expose
    private String ActionName;

    /**
    * 地域：mainland或overseas，表示国内或海外，不填写默认表示国内
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 查询Top数据的开始时间，格式为：2020-01-01 00:00:00 
     * @return StartTime 查询Top数据的开始时间，格式为：2020-01-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询Top数据的开始时间，格式为：2020-01-01 00:00:00
     * @param StartTime 查询Top数据的开始时间，格式为：2020-01-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，不传此参数，表示查当天数据
时间跨度要小于等于7天 
     * @return EndTime 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，不传此参数，表示查当天数据
时间跨度要小于等于7天
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，不传此参数，表示查当天数据
时间跨度要小于等于7天
     * @param EndTime 查询Top数据的结束时间，格式为：2020-01-01 23:59:59
支持 90 天内数据查询，不传此参数，表示查当天数据
时间跨度要小于等于7天
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 域名，不传此参数，表示查询账号级别数据 
     * @return Domain 域名，不传此参数，表示查询账号级别数据
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名，不传此参数，表示查询账号级别数据
     * @param Domain 域名，不传此参数，表示查询账号级别数据
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 统计指标：
ip_url : Top IP+URL 默认值
ua :  Top UA 
     * @return Metric 统计指标：
ip_url : Top IP+URL 默认值
ua :  Top UA
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 统计指标：
ip_url : Top IP+URL 默认值
ua :  Top UA
     * @param Metric 统计指标：
ip_url : Top IP+URL 默认值
ua :  Top UA
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get cdn表示CDN数据，默认值
ecdn表示ECDN数据 
     * @return Source cdn表示CDN数据，默认值
ecdn表示ECDN数据
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set cdn表示CDN数据，默认值
ecdn表示ECDN数据
     * @param Source cdn表示CDN数据，默认值
ecdn表示ECDN数据
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 域名列表，不传此参数，表示查询账号级别数据 
     * @return Domains 域名列表，不传此参数，表示查询账号级别数据
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名列表，不传此参数，表示查询账号级别数据
     * @param Domains 域名列表，不传此参数，表示查询账号级别数据
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
为空表示查询所有执行动作数据 
     * @return ActionName 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
为空表示查询所有执行动作数据
     */
    public String getActionName() {
        return this.ActionName;
    }

    /**
     * Set 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
为空表示查询所有执行动作数据
     * @param ActionName 执行动作，取值为：intercept/redirect/observe
分别表示：拦截/重定向/观察
为空表示查询所有执行动作数据
     */
    public void setActionName(String ActionName) {
        this.ActionName = ActionName;
    }

    /**
     * Get 地域：mainland或overseas，表示国内或海外，不填写默认表示国内 
     * @return Area 地域：mainland或overseas，表示国内或海外，不填写默认表示国内
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域：mainland或overseas，表示国内或海外，不填写默认表示国内
     * @param Area 地域：mainland或overseas，表示国内或海外，不填写默认表示国内
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public ListTopCcDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTopCcDataRequest(ListTopCcDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.ActionName != null) {
            this.ActionName = new String(source.ActionName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "ActionName", this.ActionName);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

