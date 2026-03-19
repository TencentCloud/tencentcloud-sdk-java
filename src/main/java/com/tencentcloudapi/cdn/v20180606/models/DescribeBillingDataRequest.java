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

public class DescribeBillingDataRequest extends AbstractModel {

    /**
    * <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定起始时间为 2018-09-04 10:40:00 按小时粒度查询，返回的第一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定结束时间为  2018-09-04 10:40:00 按小时粒度查询时，返回的最后一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>时间粒度，支持模式如下：<br>min：1 分钟粒度，查询区间需要小于等于 24 小时<br>5min：5 分钟粒度，查询区间需要小于等于 31 天(计费数据粒度)<br>hour：1 小时粒度，查询区间需要小于等于 31 天内<br>day：天粒度，查询区间需要大于 31 天</p><p>Area 字段为 overseas 时暂不支持1分钟粒度数据查询</p>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>指定域名查询计费数据</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>指定项目 ID 查询，<a href="https://console.cloud.tencent.com/project">前往查看项目 ID</a><br>若 Domain 参数填充了具体域名信息，则返回该域名的计费数据，而非指定项目计费数据</p>
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
    * <p>指定加速区域查询计费数据：<br>mainland：中国境内<br>overseas：中国境外<br>不填充时，默认为 mainland</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Area 为 overseas 时，指定国家/地区查询<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84">省份编码映射</a><br>不填充时，查询所有国家/地区</p>
    */
    @SerializedName("District")
    @Expose
    private Long District;

    /**
    * <p>计费统计类型<br>flux：计费流量<br>bandwidth：计费带宽<br>https：https请求数<br>默认为 bandwidth</p>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * <p>指定查询的产品数据，可选为cdn或者ecdn，默认为cdn</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>指定查询时间的时区，默认UTC+08:00</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定起始时间为 2018-09-04 10:40:00 按小时粒度查询，返回的第一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p> 
     * @return StartTime <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定起始时间为 2018-09-04 10:40:00 按小时粒度查询，返回的第一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定起始时间为 2018-09-04 10:40:00 按小时粒度查询，返回的第一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p>
     * @param StartTime <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定起始时间为 2018-09-04 10:40:00 按小时粒度查询，返回的第一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定结束时间为  2018-09-04 10:40:00 按小时粒度查询时，返回的最后一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p> 
     * @return EndTime <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定结束时间为  2018-09-04 10:40:00 按小时粒度查询时，返回的最后一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定结束时间为  2018-09-04 10:40:00 按小时粒度查询时，返回的最后一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p>
     * @param EndTime <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>根据指定时间粒度参数不同，会进行向前取整，如指定结束时间为  2018-09-04 10:40:00 按小时粒度查询时，返回的最后一个数据对应时间点为 2018-09-04 10:00:00<br>起始时间与结束时间间隔小于等于 90 天</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>时间粒度，支持模式如下：<br>min：1 分钟粒度，查询区间需要小于等于 24 小时<br>5min：5 分钟粒度，查询区间需要小于等于 31 天(计费数据粒度)<br>hour：1 小时粒度，查询区间需要小于等于 31 天内<br>day：天粒度，查询区间需要大于 31 天</p><p>Area 字段为 overseas 时暂不支持1分钟粒度数据查询</p> 
     * @return Interval <p>时间粒度，支持模式如下：<br>min：1 分钟粒度，查询区间需要小于等于 24 小时<br>5min：5 分钟粒度，查询区间需要小于等于 31 天(计费数据粒度)<br>hour：1 小时粒度，查询区间需要小于等于 31 天内<br>day：天粒度，查询区间需要大于 31 天</p><p>Area 字段为 overseas 时暂不支持1分钟粒度数据查询</p>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>时间粒度，支持模式如下：<br>min：1 分钟粒度，查询区间需要小于等于 24 小时<br>5min：5 分钟粒度，查询区间需要小于等于 31 天(计费数据粒度)<br>hour：1 小时粒度，查询区间需要小于等于 31 天内<br>day：天粒度，查询区间需要大于 31 天</p><p>Area 字段为 overseas 时暂不支持1分钟粒度数据查询</p>
     * @param Interval <p>时间粒度，支持模式如下：<br>min：1 分钟粒度，查询区间需要小于等于 24 小时<br>5min：5 分钟粒度，查询区间需要小于等于 31 天(计费数据粒度)<br>hour：1 小时粒度，查询区间需要小于等于 31 天内<br>day：天粒度，查询区间需要大于 31 天</p><p>Area 字段为 overseas 时暂不支持1分钟粒度数据查询</p>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>指定域名查询计费数据</p> 
     * @return Domain <p>指定域名查询计费数据</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>指定域名查询计费数据</p>
     * @param Domain <p>指定域名查询计费数据</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>指定项目 ID 查询，<a href="https://console.cloud.tencent.com/project">前往查看项目 ID</a><br>若 Domain 参数填充了具体域名信息，则返回该域名的计费数据，而非指定项目计费数据</p> 
     * @return Project <p>指定项目 ID 查询，<a href="https://console.cloud.tencent.com/project">前往查看项目 ID</a><br>若 Domain 参数填充了具体域名信息，则返回该域名的计费数据，而非指定项目计费数据</p>
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set <p>指定项目 ID 查询，<a href="https://console.cloud.tencent.com/project">前往查看项目 ID</a><br>若 Domain 参数填充了具体域名信息，则返回该域名的计费数据，而非指定项目计费数据</p>
     * @param Project <p>指定项目 ID 查询，<a href="https://console.cloud.tencent.com/project">前往查看项目 ID</a><br>若 Domain 参数填充了具体域名信息，则返回该域名的计费数据，而非指定项目计费数据</p>
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Get <p>指定加速区域查询计费数据：<br>mainland：中国境内<br>overseas：中国境外<br>不填充时，默认为 mainland</p> 
     * @return Area <p>指定加速区域查询计费数据：<br>mainland：中国境内<br>overseas：中国境外<br>不填充时，默认为 mainland</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>指定加速区域查询计费数据：<br>mainland：中国境内<br>overseas：中国境外<br>不填充时，默认为 mainland</p>
     * @param Area <p>指定加速区域查询计费数据：<br>mainland：中国境内<br>overseas：中国境外<br>不填充时，默认为 mainland</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Area 为 overseas 时，指定国家/地区查询<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84">省份编码映射</a><br>不填充时，查询所有国家/地区</p> 
     * @return District <p>Area 为 overseas 时，指定国家/地区查询<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84">省份编码映射</a><br>不填充时，查询所有国家/地区</p>
     */
    public Long getDistrict() {
        return this.District;
    }

    /**
     * Set <p>Area 为 overseas 时，指定国家/地区查询<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84">省份编码映射</a><br>不填充时，查询所有国家/地区</p>
     * @param District <p>Area 为 overseas 时，指定国家/地区查询<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E7.9C.81.E4.BB.BD.E6.98.A0.E5.B0.84">省份编码映射</a><br>不填充时，查询所有国家/地区</p>
     */
    public void setDistrict(Long District) {
        this.District = District;
    }

    /**
     * Get <p>计费统计类型<br>flux：计费流量<br>bandwidth：计费带宽<br>https：https请求数<br>默认为 bandwidth</p> 
     * @return Metric <p>计费统计类型<br>flux：计费流量<br>bandwidth：计费带宽<br>https：https请求数<br>默认为 bandwidth</p>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set <p>计费统计类型<br>flux：计费流量<br>bandwidth：计费带宽<br>https：https请求数<br>默认为 bandwidth</p>
     * @param Metric <p>计费统计类型<br>flux：计费流量<br>bandwidth：计费带宽<br>https：https请求数<br>默认为 bandwidth</p>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get <p>指定查询的产品数据，可选为cdn或者ecdn，默认为cdn</p> 
     * @return Product <p>指定查询的产品数据，可选为cdn或者ecdn，默认为cdn</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>指定查询的产品数据，可选为cdn或者ecdn，默认为cdn</p>
     * @param Product <p>指定查询的产品数据，可选为cdn或者ecdn，默认为cdn</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>指定查询时间的时区，默认UTC+08:00</p> 
     * @return TimeZone <p>指定查询时间的时区，默认UTC+08:00</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>指定查询时间的时区，默认UTC+08:00</p>
     * @param TimeZone <p>指定查询时间的时区，默认UTC+08:00</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public DescribeBillingDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingDataRequest(DescribeBillingDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Project != null) {
            this.Project = new Long(source.Project);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.District != null) {
            this.District = new Long(source.District);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

