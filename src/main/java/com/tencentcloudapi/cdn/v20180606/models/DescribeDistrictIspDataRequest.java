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

public class DescribeDistrictIspDataRequest extends AbstractModel {

    /**
    * <p>域名列表，最多支持20个域名</p>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>支持近 60 天内的数据查询，每次查询时间区间为 3 小时</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>结束时间与起始时间区间最大为 3 小时</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>指定查询指标，支持:<br>bandwidth：带宽，单位为 bps<br>flux：流量，单位为 byte<br>request：请求数，单位为 次<br>statusCode：状态码，返回 0、2xx、3xx、4xx、5xx 汇总数据，单位为 次<br>2xx：返回 2xx 状态码汇总及各 2 开头状态码数据，单位为 次<br>3xx：返回 3xx 状态码汇总及各 3 开头状态码数据，单位为 次<br>4xx：返回 4xx 状态码汇总及各 4 开头状态码数据，单位为 次<br>5xx：返回 5xx 状态码汇总及各 5 开头状态码数据，单位为 次<br>支持指定具体状态码查询，若未产生过，则返回为空</p>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * <p>指定省份查询，不填充表示查询所有省份（注：指定条件查询只支持映射表范围）<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">省份编码映射</a></p>
    */
    @SerializedName("Districts")
    @Expose
    private Long [] Districts;

    /**
    * <p>指定运营商查询，不填充表示查询所有运营商（注：指定条件查询只支持映射表范围）<br>运营商编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">运营商编码映射</a></p>
    */
    @SerializedName("Isps")
    @Expose
    private Long [] Isps;

    /**
    * <p>指定协议查询，不填充表示查询所有协议<br>all：所有协议<br>http：指定查询 HTTP 对应指标<br>https：指定查询 HTTPS 对应指标</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>指定IP协议查询，不填充表示查询所有协议<br>all：所有协议<br>ipv4：指定查询 ipv4 对应指标<br>ipv6：指定查询 ipv6 对应指标<br>指定IP协议查询时，不可同时指定省份、运营商查询</p>
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * <p>时间粒度，支持以下几种模式（默认5min）：<br>min：1 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过10分钟，可返回 1 分钟粒度明细数据<br>5min：5 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过3 小时，可返回 5 分钟粒度明细数据</p>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
     * Get <p>域名列表，最多支持20个域名</p> 
     * @return Domains <p>域名列表，最多支持20个域名</p>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set <p>域名列表，最多支持20个域名</p>
     * @param Domains <p>域名列表，最多支持20个域名</p>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>支持近 60 天内的数据查询，每次查询时间区间为 3 小时</p> 
     * @return StartTime <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>支持近 60 天内的数据查询，每次查询时间区间为 3 小时</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>支持近 60 天内的数据查询，每次查询时间区间为 3 小时</p>
     * @param StartTime <p>查询起始时间，如：2018-09-04 10:40:00，返回结果大于等于指定时间<br>支持近 60 天内的数据查询，每次查询时间区间为 3 小时</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>结束时间与起始时间区间最大为 3 小时</p> 
     * @return EndTime <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>结束时间与起始时间区间最大为 3 小时</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>结束时间与起始时间区间最大为 3 小时</p>
     * @param EndTime <p>查询结束时间，如：2018-09-04 10:40:00，返回结果小于等于指定时间<br>结束时间与起始时间区间最大为 3 小时</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>指定查询指标，支持:<br>bandwidth：带宽，单位为 bps<br>flux：流量，单位为 byte<br>request：请求数，单位为 次<br>statusCode：状态码，返回 0、2xx、3xx、4xx、5xx 汇总数据，单位为 次<br>2xx：返回 2xx 状态码汇总及各 2 开头状态码数据，单位为 次<br>3xx：返回 3xx 状态码汇总及各 3 开头状态码数据，单位为 次<br>4xx：返回 4xx 状态码汇总及各 4 开头状态码数据，单位为 次<br>5xx：返回 5xx 状态码汇总及各 5 开头状态码数据，单位为 次<br>支持指定具体状态码查询，若未产生过，则返回为空</p> 
     * @return Metric <p>指定查询指标，支持:<br>bandwidth：带宽，单位为 bps<br>flux：流量，单位为 byte<br>request：请求数，单位为 次<br>statusCode：状态码，返回 0、2xx、3xx、4xx、5xx 汇总数据，单位为 次<br>2xx：返回 2xx 状态码汇总及各 2 开头状态码数据，单位为 次<br>3xx：返回 3xx 状态码汇总及各 3 开头状态码数据，单位为 次<br>4xx：返回 4xx 状态码汇总及各 4 开头状态码数据，单位为 次<br>5xx：返回 5xx 状态码汇总及各 5 开头状态码数据，单位为 次<br>支持指定具体状态码查询，若未产生过，则返回为空</p>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set <p>指定查询指标，支持:<br>bandwidth：带宽，单位为 bps<br>flux：流量，单位为 byte<br>request：请求数，单位为 次<br>statusCode：状态码，返回 0、2xx、3xx、4xx、5xx 汇总数据，单位为 次<br>2xx：返回 2xx 状态码汇总及各 2 开头状态码数据，单位为 次<br>3xx：返回 3xx 状态码汇总及各 3 开头状态码数据，单位为 次<br>4xx：返回 4xx 状态码汇总及各 4 开头状态码数据，单位为 次<br>5xx：返回 5xx 状态码汇总及各 5 开头状态码数据，单位为 次<br>支持指定具体状态码查询，若未产生过，则返回为空</p>
     * @param Metric <p>指定查询指标，支持:<br>bandwidth：带宽，单位为 bps<br>flux：流量，单位为 byte<br>request：请求数，单位为 次<br>statusCode：状态码，返回 0、2xx、3xx、4xx、5xx 汇总数据，单位为 次<br>2xx：返回 2xx 状态码汇总及各 2 开头状态码数据，单位为 次<br>3xx：返回 3xx 状态码汇总及各 3 开头状态码数据，单位为 次<br>4xx：返回 4xx 状态码汇总及各 4 开头状态码数据，单位为 次<br>5xx：返回 5xx 状态码汇总及各 5 开头状态码数据，单位为 次<br>支持指定具体状态码查询，若未产生过，则返回为空</p>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get <p>指定省份查询，不填充表示查询所有省份（注：指定条件查询只支持映射表范围）<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">省份编码映射</a></p> 
     * @return Districts <p>指定省份查询，不填充表示查询所有省份（注：指定条件查询只支持映射表范围）<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">省份编码映射</a></p>
     */
    public Long [] getDistricts() {
        return this.Districts;
    }

    /**
     * Set <p>指定省份查询，不填充表示查询所有省份（注：指定条件查询只支持映射表范围）<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">省份编码映射</a></p>
     * @param Districts <p>指定省份查询，不填充表示查询所有省份（注：指定条件查询只支持映射表范围）<br>省份、国家/地区编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">省份编码映射</a></p>
     */
    public void setDistricts(Long [] Districts) {
        this.Districts = Districts;
    }

    /**
     * Get <p>指定运营商查询，不填充表示查询所有运营商（注：指定条件查询只支持映射表范围）<br>运营商编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">运营商编码映射</a></p> 
     * @return Isps <p>指定运营商查询，不填充表示查询所有运营商（注：指定条件查询只支持映射表范围）<br>运营商编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">运营商编码映射</a></p>
     */
    public Long [] getIsps() {
        return this.Isps;
    }

    /**
     * Set <p>指定运营商查询，不填充表示查询所有运营商（注：指定条件查询只支持映射表范围）<br>运营商编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">运营商编码映射</a></p>
     * @param Isps <p>指定运营商查询，不填充表示查询所有运营商（注：指定条件查询只支持映射表范围）<br>运营商编码可以查看 <a href="https://cloud.tencent.com/document/product/228/6316#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">运营商编码映射</a></p>
     */
    public void setIsps(Long [] Isps) {
        this.Isps = Isps;
    }

    /**
     * Get <p>指定协议查询，不填充表示查询所有协议<br>all：所有协议<br>http：指定查询 HTTP 对应指标<br>https：指定查询 HTTPS 对应指标</p> 
     * @return Protocol <p>指定协议查询，不填充表示查询所有协议<br>all：所有协议<br>http：指定查询 HTTP 对应指标<br>https：指定查询 HTTPS 对应指标</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>指定协议查询，不填充表示查询所有协议<br>all：所有协议<br>http：指定查询 HTTP 对应指标<br>https：指定查询 HTTPS 对应指标</p>
     * @param Protocol <p>指定协议查询，不填充表示查询所有协议<br>all：所有协议<br>http：指定查询 HTTP 对应指标<br>https：指定查询 HTTPS 对应指标</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>指定IP协议查询，不填充表示查询所有协议<br>all：所有协议<br>ipv4：指定查询 ipv4 对应指标<br>ipv6：指定查询 ipv6 对应指标<br>指定IP协议查询时，不可同时指定省份、运营商查询</p> 
     * @return IpProtocol <p>指定IP协议查询，不填充表示查询所有协议<br>all：所有协议<br>ipv4：指定查询 ipv4 对应指标<br>ipv6：指定查询 ipv6 对应指标<br>指定IP协议查询时，不可同时指定省份、运营商查询</p>
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set <p>指定IP协议查询，不填充表示查询所有协议<br>all：所有协议<br>ipv4：指定查询 ipv4 对应指标<br>ipv6：指定查询 ipv6 对应指标<br>指定IP协议查询时，不可同时指定省份、运营商查询</p>
     * @param IpProtocol <p>指定IP协议查询，不填充表示查询所有协议<br>all：所有协议<br>ipv4：指定查询 ipv4 对应指标<br>ipv6：指定查询 ipv6 对应指标<br>指定IP协议查询时，不可同时指定省份、运营商查询</p>
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get <p>时间粒度，支持以下几种模式（默认5min）：<br>min：1 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过10分钟，可返回 1 分钟粒度明细数据<br>5min：5 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过3 小时，可返回 5 分钟粒度明细数据</p> 
     * @return Interval <p>时间粒度，支持以下几种模式（默认5min）：<br>min：1 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过10分钟，可返回 1 分钟粒度明细数据<br>5min：5 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过3 小时，可返回 5 分钟粒度明细数据</p>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>时间粒度，支持以下几种模式（默认5min）：<br>min：1 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过10分钟，可返回 1 分钟粒度明细数据<br>5min：5 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过3 小时，可返回 5 分钟粒度明细数据</p>
     * @param Interval <p>时间粒度，支持以下几种模式（默认5min）：<br>min：1 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过10分钟，可返回 1 分钟粒度明细数据<br>5min：5 分钟粒度，支持近 60 天内的数据查询，每次查询时间区间不超过3 小时，可返回 5 分钟粒度明细数据</p>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public DescribeDistrictIspDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDistrictIspDataRequest(DescribeDistrictIspDataRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
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
        if (source.Districts != null) {
            this.Districts = new Long[source.Districts.length];
            for (int i = 0; i < source.Districts.length; i++) {
                this.Districts[i] = new Long(source.Districts[i]);
            }
        }
        if (source.Isps != null) {
            this.Isps = new Long[source.Isps.length];
            for (int i = 0; i < source.Isps.length; i++) {
                this.Isps[i] = new Long(source.Isps[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArraySimple(map, prefix + "Districts.", this.Districts);
        this.setParamArraySimple(map, prefix + "Isps.", this.Isps);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

