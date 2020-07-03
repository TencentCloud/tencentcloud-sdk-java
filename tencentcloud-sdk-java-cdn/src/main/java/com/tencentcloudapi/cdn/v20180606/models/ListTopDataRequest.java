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

public class ListTopDataRequest extends AbstractModel{

    /**
    * 查询起始日期，如：2018-09-09
仅支持按天粒度的数据查询，取入参中的天信息作为起始日期
返回大于等于起始日期当天 00:00:00 点产生的数据
仅支持 90 天内数据查询
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束日期，如：2018-09-10
仅支持按天粒度的数据查询，取入参中的天信息作为结束日期
返回小于等于结束日期当天 23:59:59 产生的数据
EndTime 需要大于等于 StartTime
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 排序对象，支持以下几种形式：
url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request
path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request（白名单功能）
district：省份、国家/地区排序，支持的 Filter 为 flux、request
isp：运营商排序，支持的 Filter 为 flux、request
host：域名访问数据排序，支持的 Filter 为：flux、request、bandwidth、fluxHitRate、2XX、3XX、4XX、5XX、statusCode
originHost：域名回源数据排序，支持的 Filter 为 flux、request、bandwidth、origin_2XX、origin_3XX、origin_4XX、origin_5XX、OriginStatusCode
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
    private Long Project;

    /**
    * 多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 url、path、district、isp，Filter 为 flux、request 时，可设置为 true，返回每一个 Domain 的排序数据
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
    * 指定服务地域查询，不填充表示查询中国境内 CDN 数据
mainland：指定查询中国境内 CDN 数据
overseas：指定查询中国境外 CDN 数据，支持的 Metric 为 url、district、host、originHost，当 Metric 为 originHost 时仅支持 flux、request、bandwidth Filter
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 查询中国境外CDN数据，且仅当 Metric 为 district 或 host 时，可指定地区类型查询，不填充表示查询服务地区数据（仅在 Area 为 overseas，且 Metric 是 district 或 host 时可用）
server：指定查询服务地区（腾讯云 CDN 节点服务器所在地区）数据
client：指定查询客户端地区（用户请求终端所在地区）数据，当 Metric 为 host 时仅支持 flux、request、bandwidth Filter
    */
    @SerializedName("AreaType")
    @Expose
    private String AreaType;

    /**
     * Get 查询起始日期，如：2018-09-09
仅支持按天粒度的数据查询，取入参中的天信息作为起始日期
返回大于等于起始日期当天 00:00:00 点产生的数据
仅支持 90 天内数据查询 
     * @return StartTime 查询起始日期，如：2018-09-09
仅支持按天粒度的数据查询，取入参中的天信息作为起始日期
返回大于等于起始日期当天 00:00:00 点产生的数据
仅支持 90 天内数据查询
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始日期，如：2018-09-09
仅支持按天粒度的数据查询，取入参中的天信息作为起始日期
返回大于等于起始日期当天 00:00:00 点产生的数据
仅支持 90 天内数据查询
     * @param StartTime 查询起始日期，如：2018-09-09
仅支持按天粒度的数据查询，取入参中的天信息作为起始日期
返回大于等于起始日期当天 00:00:00 点产生的数据
仅支持 90 天内数据查询
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束日期，如：2018-09-10
仅支持按天粒度的数据查询，取入参中的天信息作为结束日期
返回小于等于结束日期当天 23:59:59 产生的数据
EndTime 需要大于等于 StartTime 
     * @return EndTime 查询结束日期，如：2018-09-10
仅支持按天粒度的数据查询，取入参中的天信息作为结束日期
返回小于等于结束日期当天 23:59:59 产生的数据
EndTime 需要大于等于 StartTime
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束日期，如：2018-09-10
仅支持按天粒度的数据查询，取入参中的天信息作为结束日期
返回小于等于结束日期当天 23:59:59 产生的数据
EndTime 需要大于等于 StartTime
     * @param EndTime 查询结束日期，如：2018-09-10
仅支持按天粒度的数据查询，取入参中的天信息作为结束日期
返回小于等于结束日期当天 23:59:59 产生的数据
EndTime 需要大于等于 StartTime
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 排序对象，支持以下几种形式：
url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request
path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request（白名单功能）
district：省份、国家/地区排序，支持的 Filter 为 flux、request
isp：运营商排序，支持的 Filter 为 flux、request
host：域名访问数据排序，支持的 Filter 为：flux、request、bandwidth、fluxHitRate、2XX、3XX、4XX、5XX、statusCode
originHost：域名回源数据排序，支持的 Filter 为 flux、request、bandwidth、origin_2XX、origin_3XX、origin_4XX、origin_5XX、OriginStatusCode 
     * @return Metric 排序对象，支持以下几种形式：
url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request
path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request（白名单功能）
district：省份、国家/地区排序，支持的 Filter 为 flux、request
isp：运营商排序，支持的 Filter 为 flux、request
host：域名访问数据排序，支持的 Filter 为：flux、request、bandwidth、fluxHitRate、2XX、3XX、4XX、5XX、statusCode
originHost：域名回源数据排序，支持的 Filter 为 flux、request、bandwidth、origin_2XX、origin_3XX、origin_4XX、origin_5XX、OriginStatusCode
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 排序对象，支持以下几种形式：
url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request
path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request（白名单功能）
district：省份、国家/地区排序，支持的 Filter 为 flux、request
isp：运营商排序，支持的 Filter 为 flux、request
host：域名访问数据排序，支持的 Filter 为：flux、request、bandwidth、fluxHitRate、2XX、3XX、4XX、5XX、statusCode
originHost：域名回源数据排序，支持的 Filter 为 flux、request、bandwidth、origin_2XX、origin_3XX、origin_4XX、origin_5XX、OriginStatusCode
     * @param Metric 排序对象，支持以下几种形式：
url：访问 URL 排序，带参数统计，支持的 Filter 为 flux、request
path：访问 URL 排序，不带参数统计，支持的 Filter 为 flux、request（白名单功能）
district：省份、国家/地区排序，支持的 Filter 为 flux、request
isp：运营商排序，支持的 Filter 为 flux、request
host：域名访问数据排序，支持的 Filter 为：flux、request、bandwidth、fluxHitRate、2XX、3XX、4XX、5XX、statusCode
originHost：域名回源数据排序，支持的 Filter 为 flux、request、bandwidth、origin_2XX、origin_3XX、origin_4XX、origin_5XX、OriginStatusCode
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 排序使用的指标名称：
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
     * Set 排序使用的指标名称：
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
     * Get 指定查询域名列表，最多可一次性查询 30 个加速域名明细 
     * @return Domains 指定查询域名列表，最多可一次性查询 30 个加速域名明细
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 指定查询域名列表，最多可一次性查询 30 个加速域名明细
     * @param Domains 指定查询域名列表，最多可一次性查询 30 个加速域名明细
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主 
     * @return Project 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     * @param Project 指定要查询的项目 ID，[前往查看项目 ID](https://console.cloud.tencent.com/project)
未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Get 多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 url、path、district、isp，Filter 为 flux、request 时，可设置为 true，返回每一个 Domain 的排序数据 
     * @return Detail 多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 url、path、district、isp，Filter 为 flux、request 时，可设置为 true，返回每一个 Domain 的排序数据
     */
    public Boolean getDetail() {
        return this.Detail;
    }

    /**
     * Set 多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 url、path、district、isp，Filter 为 flux、request 时，可设置为 true，返回每一个 Domain 的排序数据
     * @param Detail 多域名查询时，默认（false)返回所有域名汇总排序结果
Metric 为 url、path、district、isp，Filter 为 flux、request 时，可设置为 true，返回每一个 Domain 的排序数据
     */
    public void setDetail(Boolean Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Filter 为 statusCode、OriginStatusCode 时，填充指定状态码查询排序结果 
     * @return Code Filter 为 statusCode、OriginStatusCode 时，填充指定状态码查询排序结果
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Filter 为 statusCode、OriginStatusCode 时，填充指定状态码查询排序结果
     * @param Code Filter 为 statusCode、OriginStatusCode 时，填充指定状态码查询排序结果
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 指定服务地域查询，不填充表示查询中国境内 CDN 数据
mainland：指定查询中国境内 CDN 数据
overseas：指定查询中国境外 CDN 数据，支持的 Metric 为 url、district、host、originHost，当 Metric 为 originHost 时仅支持 flux、request、bandwidth Filter 
     * @return Area 指定服务地域查询，不填充表示查询中国境内 CDN 数据
mainland：指定查询中国境内 CDN 数据
overseas：指定查询中国境外 CDN 数据，支持的 Metric 为 url、district、host、originHost，当 Metric 为 originHost 时仅支持 flux、request、bandwidth Filter
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 指定服务地域查询，不填充表示查询中国境内 CDN 数据
mainland：指定查询中国境内 CDN 数据
overseas：指定查询中国境外 CDN 数据，支持的 Metric 为 url、district、host、originHost，当 Metric 为 originHost 时仅支持 flux、request、bandwidth Filter
     * @param Area 指定服务地域查询，不填充表示查询中国境内 CDN 数据
mainland：指定查询中国境内 CDN 数据
overseas：指定查询中国境外 CDN 数据，支持的 Metric 为 url、district、host、originHost，当 Metric 为 originHost 时仅支持 flux、request、bandwidth Filter
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 查询中国境外CDN数据，且仅当 Metric 为 district 或 host 时，可指定地区类型查询，不填充表示查询服务地区数据（仅在 Area 为 overseas，且 Metric 是 district 或 host 时可用）
server：指定查询服务地区（腾讯云 CDN 节点服务器所在地区）数据
client：指定查询客户端地区（用户请求终端所在地区）数据，当 Metric 为 host 时仅支持 flux、request、bandwidth Filter 
     * @return AreaType 查询中国境外CDN数据，且仅当 Metric 为 district 或 host 时，可指定地区类型查询，不填充表示查询服务地区数据（仅在 Area 为 overseas，且 Metric 是 district 或 host 时可用）
server：指定查询服务地区（腾讯云 CDN 节点服务器所在地区）数据
client：指定查询客户端地区（用户请求终端所在地区）数据，当 Metric 为 host 时仅支持 flux、request、bandwidth Filter
     */
    public String getAreaType() {
        return this.AreaType;
    }

    /**
     * Set 查询中国境外CDN数据，且仅当 Metric 为 district 或 host 时，可指定地区类型查询，不填充表示查询服务地区数据（仅在 Area 为 overseas，且 Metric 是 district 或 host 时可用）
server：指定查询服务地区（腾讯云 CDN 节点服务器所在地区）数据
client：指定查询客户端地区（用户请求终端所在地区）数据，当 Metric 为 host 时仅支持 flux、request、bandwidth Filter
     * @param AreaType 查询中国境外CDN数据，且仅当 Metric 为 district 或 host 时，可指定地区类型查询，不填充表示查询服务地区数据（仅在 Area 为 overseas，且 Metric 是 district 或 host 时可用）
server：指定查询服务地区（腾讯云 CDN 节点服务器所在地区）数据
client：指定查询客户端地区（用户请求终端所在地区）数据，当 Metric 为 host 时仅支持 flux、request、bandwidth Filter
     */
    public void setAreaType(String AreaType) {
        this.AreaType = AreaType;
    }

    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "AreaType", this.AreaType);

    }
}

