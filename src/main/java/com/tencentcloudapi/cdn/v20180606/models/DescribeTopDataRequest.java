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

public class DescribeTopDataRequest extends AbstractModel {

    /**
    * <p>查询起始日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为起始日期<br>返回大于等于起始日期当天 00:00:00 点产生的数据，如 StartTime为2018-09-04，返回数据的起始时间为2018-09-04 00:00:00<br>仅支持 90 天内数据查询</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为结束日期<br>返回小于等于结束日期当天 23:59:59 产生的数据，如EndTime为2018-09-05，返回数据的结束时间为2018-09-05 23:59:59<br>EndTime 需要大于等于 StartTime</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>排序对象，支持以下几种形式：<br>ip、ua_device、ua_browser、ua_os、referer</p>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * <p>排序使用的指标名称：<br>flux：Metric 为 host 时指代访问流量<br>request：Metric 为 host 时指代访问请求数</p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * <p>指定查询域名列表，最多可一次性查询 30 个加速域名明细</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主</p>
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
    * <p>是否详细显示每个域名的的具体数值</p>
    */
    @SerializedName("Detail")
    @Expose
    private Boolean Detail;

    /**
    * <p>指定服务地域查询，不填充表示查询中国境内 CDN 数据<br>mainland：指定查询中国境内 CDN 数据<br>overseas：指定查询中国境外 CDN 数据</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>指定查询的产品数据，目前仅可使用cdn</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>查询起始日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为起始日期<br>返回大于等于起始日期当天 00:00:00 点产生的数据，如 StartTime为2018-09-04，返回数据的起始时间为2018-09-04 00:00:00<br>仅支持 90 天内数据查询</p> 
     * @return StartTime <p>查询起始日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为起始日期<br>返回大于等于起始日期当天 00:00:00 点产生的数据，如 StartTime为2018-09-04，返回数据的起始时间为2018-09-04 00:00:00<br>仅支持 90 天内数据查询</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为起始日期<br>返回大于等于起始日期当天 00:00:00 点产生的数据，如 StartTime为2018-09-04，返回数据的起始时间为2018-09-04 00:00:00<br>仅支持 90 天内数据查询</p>
     * @param StartTime <p>查询起始日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为起始日期<br>返回大于等于起始日期当天 00:00:00 点产生的数据，如 StartTime为2018-09-04，返回数据的起始时间为2018-09-04 00:00:00<br>仅支持 90 天内数据查询</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为结束日期<br>返回小于等于结束日期当天 23:59:59 产生的数据，如EndTime为2018-09-05，返回数据的结束时间为2018-09-05 23:59:59<br>EndTime 需要大于等于 StartTime</p> 
     * @return EndTime <p>查询结束日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为结束日期<br>返回小于等于结束日期当天 23:59:59 产生的数据，如EndTime为2018-09-05，返回数据的结束时间为2018-09-05 23:59:59<br>EndTime 需要大于等于 StartTime</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为结束日期<br>返回小于等于结束日期当天 23:59:59 产生的数据，如EndTime为2018-09-05，返回数据的结束时间为2018-09-05 23:59:59<br>EndTime 需要大于等于 StartTime</p>
     * @param EndTime <p>查询结束日期：yyyy-MM-dd<br>仅支持按天粒度的数据查询，取入参中的天信息作为结束日期<br>返回小于等于结束日期当天 23:59:59 产生的数据，如EndTime为2018-09-05，返回数据的结束时间为2018-09-05 23:59:59<br>EndTime 需要大于等于 StartTime</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>排序对象，支持以下几种形式：<br>ip、ua_device、ua_browser、ua_os、referer</p> 
     * @return Metric <p>排序对象，支持以下几种形式：<br>ip、ua_device、ua_browser、ua_os、referer</p>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set <p>排序对象，支持以下几种形式：<br>ip、ua_device、ua_browser、ua_os、referer</p>
     * @param Metric <p>排序对象，支持以下几种形式：<br>ip、ua_device、ua_browser、ua_os、referer</p>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get <p>排序使用的指标名称：<br>flux：Metric 为 host 时指代访问流量<br>request：Metric 为 host 时指代访问请求数</p> 
     * @return Filter <p>排序使用的指标名称：<br>flux：Metric 为 host 时指代访问流量<br>request：Metric 为 host 时指代访问请求数</p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>排序使用的指标名称：<br>flux：Metric 为 host 时指代访问流量<br>request：Metric 为 host 时指代访问请求数</p>
     * @param Filter <p>排序使用的指标名称：<br>flux：Metric 为 host 时指代访问流量<br>request：Metric 为 host 时指代访问请求数</p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>指定查询域名列表，最多可一次性查询 30 个加速域名明细</p> 
     * @return Domains <p>指定查询域名列表，最多可一次性查询 30 个加速域名明细</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>指定查询域名列表，最多可一次性查询 30 个加速域名明细</p>
     * @param Domains <p>指定查询域名列表，最多可一次性查询 30 个加速域名明细</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主</p> 
     * @return Project <p>未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主</p>
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set <p>未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主</p>
     * @param Project <p>未填充域名情况下，指定项目查询，若填充了具体域名信息，以域名为主</p>
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Get <p>是否详细显示每个域名的的具体数值</p> 
     * @return Detail <p>是否详细显示每个域名的的具体数值</p>
     */
    public Boolean getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>是否详细显示每个域名的的具体数值</p>
     * @param Detail <p>是否详细显示每个域名的的具体数值</p>
     */
    public void setDetail(Boolean Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>指定服务地域查询，不填充表示查询中国境内 CDN 数据<br>mainland：指定查询中国境内 CDN 数据<br>overseas：指定查询中国境外 CDN 数据</p> 
     * @return Area <p>指定服务地域查询，不填充表示查询中国境内 CDN 数据<br>mainland：指定查询中国境内 CDN 数据<br>overseas：指定查询中国境外 CDN 数据</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>指定服务地域查询，不填充表示查询中国境内 CDN 数据<br>mainland：指定查询中国境内 CDN 数据<br>overseas：指定查询中国境外 CDN 数据</p>
     * @param Area <p>指定服务地域查询，不填充表示查询中国境内 CDN 数据<br>mainland：指定查询中国境内 CDN 数据<br>overseas：指定查询中国境外 CDN 数据</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>指定查询的产品数据，目前仅可使用cdn</p> 
     * @return Product <p>指定查询的产品数据，目前仅可使用cdn</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>指定查询的产品数据，目前仅可使用cdn</p>
     * @param Product <p>指定查询的产品数据，目前仅可使用cdn</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeTopDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopDataRequest(DescribeTopDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new Long(source.Project);
        }
        if (source.Detail != null) {
            this.Detail = new Boolean(source.Detail);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
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
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

