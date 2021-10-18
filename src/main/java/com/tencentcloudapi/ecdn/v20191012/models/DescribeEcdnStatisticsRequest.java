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
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个
    */
    @SerializedName("Metrics")
    @Expose
    private String [] Metrics;

    /**
    * 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 31 天	 60，120，240，1440
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
    * 统计区域:
mainland: 境内
oversea: 境外
global: 全部
默认 global
    */
    @SerializedName("Area")
    @Expose
    private String Area;

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
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个 
     * @return Metrics 指定查询指标，支持的类型有：
flux：流量，单位为 byte
bandwidth：带宽，单位为 bps
request：请求数，单位为 次
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个
     */
    public String [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指定查询指标，支持的类型有：
flux：流量，单位为 byte
bandwidth：带宽，单位为 bps
request：请求数，单位为 次
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个
     * @param Metrics 指定查询指标，支持的类型有：
flux：流量，单位为 byte
bandwidth：带宽，单位为 bps
request：请求数，单位为 次
2xx：返回 2xx 状态码汇总或者 2 开头状态码数据，单位为 个
3xx：返回 3xx 状态码汇总或者 3 开头状态码数据，单位为 个
4xx：返回 4xx 状态码汇总或者 4 开头状态码数据，单位为 个
5xx：返回 5xx 状态码汇总或者 5 开头状态码数据，单位为 个
     */
    public void setMetrics(String [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 31 天	 60，120，240，1440 
     * @return Interval 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 31 天	 60，120，240，1440
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 31 天	 60，120，240，1440
     * @param Interval 时间粒度，支持以下几种模式：
1 天	 1，5，15，30，60，120，240，1440 
2 ~ 3 天	15，30，60，120，240，1440
4 ~ 7 天	30，60，120，240，1440
8 ~ 31 天	 60，120，240，1440
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
     * Get 统计区域:
mainland: 境内
oversea: 境外
global: 全部
默认 global 
     * @return Area 统计区域:
mainland: 境内
oversea: 境外
global: 全部
默认 global
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 统计区域:
mainland: 境内
oversea: 境外
global: 全部
默认 global
     * @param Area 统计区域:
mainland: 境内
oversea: 境外
global: 全部
默认 global
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeEcdnStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEcdnStatisticsRequest(DescribeEcdnStatisticsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Metrics != null) {
            this.Metrics = new String[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new String(source.Metrics[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Projects != null) {
            this.Projects = new Long[source.Projects.length];
            for (int i = 0; i < source.Projects.length; i++) {
                this.Projects[i] = new Long(source.Projects[i]);
            }
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
        this.setParamArraySimple(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "Projects.", this.Projects);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

