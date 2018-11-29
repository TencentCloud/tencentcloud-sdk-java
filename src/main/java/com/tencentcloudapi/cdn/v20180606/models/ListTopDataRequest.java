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

public class ListTopDataRequest  extends AbstractModel{

    /**
    * 查询起始日期，如：2018-09-09 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束日期，如：2018-09-10 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 排序对象，支持以下几种形式：
Url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request（白名单功能）
Path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request
District：省份排序，支持的 Filter 为 flux、request
Isp：运营商排序，支持的 Filter 为 flux、request
Host：域名访问数据排序，支持的 Filter 为：flux, request, bandwidth, fluxHitRate, 2XX, 3XX, 4XX, 5XX，具体状态码统计
originHost：域名回源数据排序，支持的 Filter 为 flux， request，bandwidth，origin_2XX，origin_3XX，oringin_4XX，origin_5XX，具体回源状态码统计
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 排序使用的指标名称：
flux：Metric 为 host 时指代访问流量，originHost 时指代回源流量
bandwidth：Metric 为 host 时指代访问带宽，originHost 时指代回源带宽
request：Metric 为 host 时指代访问请求数，originHost 时指代回源请求数
fluxHitRate：平均流量命中率
2XX：访问 2XX 状态码
3XX：访问 3XX 状态码
4XX：访问 4XX 状态码
5XX：访问 5XX 状态码
origin_2XX：回源 2XX 状态码
origin_3XX：回源 3XX 状态码
origin_4XX：回源 4XX 状态码
origin_5XX：回源 5XX 状态码
statusCode：指定访问状态码统计，在 Code 参数中填充指定状态码
OriginStatusCode：指定回源状态码统计，在 Code 参数中填充指定状态码
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 指定查询域名列表，最多可一次性查询 30 个加速域名明细
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
    */
    @SerializedName("Project")
    @Expose
    private Integer Project;

    /**
    * 多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 Url、Path、District、Isp，Filter 为 flux、reqeust 时，可设置为 true，返回每一个 Domain 的排序数据
    */
    @SerializedName("Detail")
    @Expose
    private Boolean Detail;

    /**
    * Filter 为 statusCode、OriginStatusCode 时，填充指定状态码查询排序结果
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * 获取查询起始日期，如：2018-09-09 00:00:00
     * @return StartTime 查询起始日期，如：2018-09-09 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置查询起始日期，如：2018-09-09 00:00:00
     * @param StartTime 查询起始日期，如：2018-09-09 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取查询结束日期，如：2018-09-10 00:00:00
     * @return EndTime 查询结束日期，如：2018-09-10 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置查询结束日期，如：2018-09-10 00:00:00
     * @param EndTime 查询结束日期，如：2018-09-10 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取排序对象，支持以下几种形式：
Url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request（白名单功能）
Path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request
District：省份排序，支持的 Filter 为 flux、request
Isp：运营商排序，支持的 Filter 为 flux、request
Host：域名访问数据排序，支持的 Filter 为：flux, request, bandwidth, fluxHitRate, 2XX, 3XX, 4XX, 5XX，具体状态码统计
originHost：域名回源数据排序，支持的 Filter 为 flux， request，bandwidth，origin_2XX，origin_3XX，oringin_4XX，origin_5XX，具体回源状态码统计
     * @return Metric 排序对象，支持以下几种形式：
Url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request（白名单功能）
Path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request
District：省份排序，支持的 Filter 为 flux、request
Isp：运营商排序，支持的 Filter 为 flux、request
Host：域名访问数据排序，支持的 Filter 为：flux, request, bandwidth, fluxHitRate, 2XX, 3XX, 4XX, 5XX，具体状态码统计
originHost：域名回源数据排序，支持的 Filter 为 flux， request，bandwidth，origin_2XX，origin_3XX，oringin_4XX，origin_5XX，具体回源状态码统计
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * 设置排序对象，支持以下几种形式：
Url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request（白名单功能）
Path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request
District：省份排序，支持的 Filter 为 flux、request
Isp：运营商排序，支持的 Filter 为 flux、request
Host：域名访问数据排序，支持的 Filter 为：flux, request, bandwidth, fluxHitRate, 2XX, 3XX, 4XX, 5XX，具体状态码统计
originHost：域名回源数据排序，支持的 Filter 为 flux， request，bandwidth，origin_2XX，origin_3XX，oringin_4XX，origin_5XX，具体回源状态码统计
     * @param Metric 排序对象，支持以下几种形式：
Url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request（白名单功能）
Path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request
District：省份排序，支持的 Filter 为 flux、request
Isp：运营商排序，支持的 Filter 为 flux、request
Host：域名访问数据排序，支持的 Filter 为：flux, request, bandwidth, fluxHitRate, 2XX, 3XX, 4XX, 5XX，具体状态码统计
originHost：域名回源数据排序，支持的 Filter 为 flux， request，bandwidth，origin_2XX，origin_3XX，oringin_4XX，origin_5XX，具体回源状态码统计
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * 获取排序使用的指标名称：
flux：Metric 为 host 时指代访问流量，originHost 时指代回源流量
bandwidth：Metric 为 host 时指代访问带宽，originHost 时指代回源带宽
request：Metric 为 host 时指代访问请求数，originHost 时指代回源请求数
fluxHitRate：平均流量命中率
2XX：访问 2XX 状态码
3XX：访问 3XX 状态码
4XX：访问 4XX 状态码
5XX：访问 5XX 状态码
origin_2XX：回源 2XX 状态码
origin_3XX：回源 3XX 状态码
origin_4XX：回源 4XX 状态码
origin_5XX：回源 5XX 状态码
statusCode：指定访问状态码统计，在 Code 参数中填充指定状态码
OriginStatusCode：指定回源状态码统计，在 Code 参数中填充指定状态码
     * @return Filter 排序使用的指标名称：
flux：Metric 为 host 时指代访问流量，originHost 时指代回源流量
bandwidth：Metric 为 host 时指代访问带宽，originHost 时指代回源带宽
request：Metric 为 host 时指代访问请求数，originHost 时指代回源请求数
fluxHitRate：平均流量命中率
2XX：访问 2XX 状态码
3XX：访问 3XX 状态码
4XX：访问 4XX 状态码
5XX：访问 5XX 状态码
origin_2XX：回源 2XX 状态码
origin_3XX：回源 3XX 状态码
origin_4XX：回源 4XX 状态码
origin_5XX：回源 5XX 状态码
statusCode：指定访问状态码统计，在 Code 参数中填充指定状态码
OriginStatusCode：指定回源状态码统计，在 Code 参数中填充指定状态码
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * 设置排序使用的指标名称：
flux：Metric 为 host 时指代访问流量，originHost 时指代回源流量
bandwidth：Metric 为 host 时指代访问带宽，originHost 时指代回源带宽
request：Metric 为 host 时指代访问请求数，originHost 时指代回源请求数
fluxHitRate：平均流量命中率
2XX：访问 2XX 状态码
3XX：访问 3XX 状态码
4XX：访问 4XX 状态码
5XX：访问 5XX 状态码
origin_2XX：回源 2XX 状态码
origin_3XX：回源 3XX 状态码
origin_4XX：回源 4XX 状态码
origin_5XX：回源 5XX 状态码
statusCode：指定访问状态码统计，在 Code 参数中填充指定状态码
OriginStatusCode：指定回源状态码统计，在 Code 参数中填充指定状态码
     * @param Filter 排序使用的指标名称：
flux：Metric 为 host 时指代访问流量，originHost 时指代回源流量
bandwidth：Metric 为 host 时指代访问带宽，originHost 时指代回源带宽
request：Metric 为 host 时指代访问请求数，originHost 时指代回源请求数
fluxHitRate：平均流量命中率
2XX：访问 2XX 状态码
3XX：访问 3XX 状态码
4XX：访问 4XX 状态码
5XX：访问 5XX 状态码
origin_2XX：回源 2XX 状态码
origin_3XX：回源 3XX 状态码
origin_4XX：回源 4XX 状态码
origin_5XX：回源 5XX 状态码
statusCode：指定访问状态码统计，在 Code 参数中填充指定状态码
OriginStatusCode：指定回源状态码统计，在 Code 参数中填充指定状态码
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * 获取指定查询域名列表，最多可一次性查询 30 个加速域名明细
     * @return Domains 指定查询域名列表，最多可一次性查询 30 个加速域名明细
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * 设置指定查询域名列表，最多可一次性查询 30 个加速域名明细
     * @param Domains 指定查询域名列表，最多可一次性查询 30 个加速域名明细
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * 获取指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     * @return Project 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     */
    public Integer getProject() {
        return this.Project;
    }

    /**
     * 设置指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     * @param Project 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     */
    public void setProject(Integer Project) {
        this.Project = Project;
    }

    /**
     * 获取多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 Url、Path、District、Isp，Filter 为 flux、reqeust 时，可设置为 true，返回每一个 Domain 的排序数据
     * @return Detail 多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 Url、Path、District、Isp，Filter 为 flux、reqeust 时，可设置为 true，返回每一个 Domain 的排序数据
     */
    public Boolean getDetail() {
        return this.Detail;
    }

    /**
     * 设置多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 Url、Path、District、Isp，Filter 为 flux、reqeust 时，可设置为 true，返回每一个 Domain 的排序数据
     * @param Detail 多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 Url、Path、District、Isp，Filter 为 flux、reqeust 时，可设置为 true，返回每一个 Domain 的排序数据
     */
    public void setDetail(Boolean Detail) {
        this.Detail = Detail;
    }

    /**
     * 获取Filter 为 statusCode、OriginStatusCode 时，填充指定状态码查询排序结果
     * @return Code Filter 为 statusCode、OriginStatusCode 时，填充指定状态码查询排序结果
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * 设置Filter 为 statusCode、OriginStatusCode 时，填充指定状态码查询排序结果
     * @param Code Filter 为 statusCode、OriginStatusCode 时，填充指定状态码查询排序结果
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

