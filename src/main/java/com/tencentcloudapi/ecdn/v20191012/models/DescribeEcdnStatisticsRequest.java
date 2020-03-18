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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEcdnStatisticsRequest extends AbstractModel{

    /**
    * 查询起始时间，如：2019-12-13 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，如：2019-12-13 23:59:59
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 指定查询指标，支持的类型有：
flux：流量，单位为 byte
bandwidth：带宽，单位为 bps
request：请求数，单位为 次
delay：响应时间，单位为ms
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个
static_request ： 静态请求数，单位为 次
static_flux：静态流量，单位为 byte
static_bandwidth ： 静态带宽，单位为 bps
dynamic_request：动态请求数，单位为 次
dynamic_flux：动态流量，单位为 byte
dynamic_bandwidth：动态带宽，单位为 bps
    */
    @SerializedName("Metrics")
    @Expose
    private String [] Metrics;

    /**
    * 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 90 天	 60，120，240，1440
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 指定查询域名列表

最多可一次性查询30个加速域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
    */
    @SerializedName("Projects")
    @Expose
    private Long [] Projects;

    /**
     * Get 查询起始时间，如：2019-12-13 00:00:00 
     * @return StartTime 查询起始时间，如：2019-12-13 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间，如：2019-12-13 00:00:00
     * @param StartTime 查询起始时间，如：2019-12-13 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，如：2019-12-13 23:59:59 
     * @return EndTime 查询结束时间，如：2019-12-13 23:59:59
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，如：2019-12-13 23:59:59
     * @param EndTime 查询结束时间，如：2019-12-13 23:59:59
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指定查询指标，支持的类型有：
flux：流量，单位为 byte
bandwidth：带宽，单位为 bps
request：请求数，单位为 次
delay：响应时间，单位为ms
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个
static_request ： 静态请求数，单位为 次
static_flux：静态流量，单位为 byte
static_bandwidth ： 静态带宽，单位为 bps
dynamic_request：动态请求数，单位为 次
dynamic_flux：动态流量，单位为 byte
dynamic_bandwidth：动态带宽，单位为 bps 
     * @return Metrics 指定查询指标，支持的类型有：
flux：流量，单位为 byte
bandwidth：带宽，单位为 bps
request：请求数，单位为 次
delay：响应时间，单位为ms
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个
static_request ： 静态请求数，单位为 次
static_flux：静态流量，单位为 byte
static_bandwidth ： 静态带宽，单位为 bps
dynamic_request：动态请求数，单位为 次
dynamic_flux：动态流量，单位为 byte
dynamic_bandwidth：动态带宽，单位为 bps
     */
    public String [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指定查询指标，支持的类型有：
flux：流量，单位为 byte
bandwidth：带宽，单位为 bps
request：请求数，单位为 次
delay：响应时间，单位为ms
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个
static_request ： 静态请求数，单位为 次
static_flux：静态流量，单位为 byte
static_bandwidth ： 静态带宽，单位为 bps
dynamic_request：动态请求数，单位为 次
dynamic_flux：动态流量，单位为 byte
dynamic_bandwidth：动态带宽，单位为 bps
     * @param Metrics 指定查询指标，支持的类型有：
flux：流量，单位为 byte
bandwidth：带宽，单位为 bps
request：请求数，单位为 次
delay：响应时间，单位为ms
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个
static_request ： 静态请求数，单位为 次
static_flux：静态流量，单位为 byte
static_bandwidth ： 静态带宽，单位为 bps
dynamic_request：动态请求数，单位为 次
dynamic_flux：动态流量，单位为 byte
dynamic_bandwidth：动态带宽，单位为 bps
     */
    public void setMetrics(String [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 90 天	 60，120，240，1440 
     * @return Interval 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 90 天	 60，120，240，1440
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 90 天	 60，120，240，1440
     * @param Interval 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 90 天	 60，120，240，1440
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 指定查询域名列表

最多可一次性查询30个加速域名。 
     * @return Domains 指定查询域名列表

最多可一次性查询30个加速域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 指定查询域名列表

最多可一次性查询30个加速域名。
     * @param Domains 指定查询域名列表

最多可一次性查询30个加速域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主 
     * @return Projects 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     */
    public Long [] getProjects() {
        return this.Projects;
    }

    /**
     * Set 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     * @param Projects 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     */
    public void setProjects(Long [] Projects) {
        this.Projects = Projects;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "Projects.", this.Projects);

    }
}

