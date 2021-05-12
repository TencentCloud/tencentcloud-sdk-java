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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDailyMostPlayedStatRequest extends AbstractModel{

    /**
    * 查询日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。该参数仅日期部分有效。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 域名。查询该域名播放 Top100 的媒体文件的统计数据。默认查询所有域名的播放统计数据。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Top 数据的统计指标，取值有：
<li>Traffic：播放流量，按播放流量统计 Top100 的数据。</li>
<li>PlayTimes：播放次数，按播放次数统计播放 Top100 的数据。</li>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 查询日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。该参数仅日期部分有效。 
     * @return Date 查询日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。该参数仅日期部分有效。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 查询日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。该参数仅日期部分有效。
     * @param Date 查询日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。该参数仅日期部分有效。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 域名。查询该域名播放 Top100 的媒体文件的统计数据。默认查询所有域名的播放统计数据。 
     * @return DomainName 域名。查询该域名播放 Top100 的媒体文件的统计数据。默认查询所有域名的播放统计数据。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名。查询该域名播放 Top100 的媒体文件的统计数据。默认查询所有域名的播放统计数据。
     * @param DomainName 域名。查询该域名播放 Top100 的媒体文件的统计数据。默认查询所有域名的播放统计数据。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Top 数据的统计指标，取值有：
<li>Traffic：播放流量，按播放流量统计 Top100 的数据。</li>
<li>PlayTimes：播放次数，按播放次数统计播放 Top100 的数据。</li> 
     * @return Metric Top 数据的统计指标，取值有：
<li>Traffic：播放流量，按播放流量统计 Top100 的数据。</li>
<li>PlayTimes：播放次数，按播放次数统计播放 Top100 的数据。</li>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Top 数据的统计指标，取值有：
<li>Traffic：播放流量，按播放流量统计 Top100 的数据。</li>
<li>PlayTimes：播放次数，按播放次数统计播放 Top100 的数据。</li>
     * @param Metric Top 数据的统计指标，取值有：
<li>Traffic：播放流量，按播放流量统计 Top100 的数据。</li>
<li>PlayTimes：播放次数，按播放次数统计播放 Top100 的数据。</li>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeDailyMostPlayedStatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDailyMostPlayedStatRequest(DescribeDailyMostPlayedStatRequest source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

