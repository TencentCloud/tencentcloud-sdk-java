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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCDNUsageDataRequest extends AbstractModel {

    /**
    * 起始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日期，需大于开始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * CDN 统计数据类型，有效值：
<li>Flux：流量，单位为 byte。</li>
<li>Bandwidth：带宽，单位为 bps。</li>
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 用量数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>60：小时粒度，返回指定查询时间内1小时粒度的数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。</li>
默认值为1440，返回天粒度的数据。
    */
    @SerializedName("DataInterval")
    @Expose
    private Long DataInterval;

    /**
    * 域名列表。一次最多查询20个域名的用量数据。可以指定多个域名，查询这些域名叠加的用量数据。默认返回所有域名叠加的用量数据。
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
     * Get 起始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return StartTime 起始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param StartTime 起始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日期，需大于开始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return EndTime 结束日期，需大于开始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日期，需大于开始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param EndTime 结束日期，需大于开始日期，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get CDN 统计数据类型，有效值：
<li>Flux：流量，单位为 byte。</li>
<li>Bandwidth：带宽，单位为 bps。</li> 
     * @return DataType CDN 统计数据类型，有效值：
<li>Flux：流量，单位为 byte。</li>
<li>Bandwidth：带宽，单位为 bps。</li>
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set CDN 统计数据类型，有效值：
<li>Flux：流量，单位为 byte。</li>
<li>Bandwidth：带宽，单位为 bps。</li>
     * @param DataType CDN 统计数据类型，有效值：
<li>Flux：流量，单位为 byte。</li>
<li>Bandwidth：带宽，单位为 bps。</li>
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 用量数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>60：小时粒度，返回指定查询时间内1小时粒度的数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。</li>
默认值为1440，返回天粒度的数据。 
     * @return DataInterval 用量数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>60：小时粒度，返回指定查询时间内1小时粒度的数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。</li>
默认值为1440，返回天粒度的数据。
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set 用量数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>60：小时粒度，返回指定查询时间内1小时粒度的数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。</li>
默认值为1440，返回天粒度的数据。
     * @param DataInterval 用量数据的时间粒度，单位：分钟，取值有：
<li>5：5 分钟粒度，返回指定查询时间内5分钟粒度的明细数据。</li>
<li>60：小时粒度，返回指定查询时间内1小时粒度的数据。</li>
<li>1440：天粒度，返回指定查询时间内1天粒度的数据。</li>
默认值为1440，返回天粒度的数据。
     */
    public void setDataInterval(Long DataInterval) {
        this.DataInterval = DataInterval;
    }

    /**
     * Get 域名列表。一次最多查询20个域名的用量数据。可以指定多个域名，查询这些域名叠加的用量数据。默认返回所有域名叠加的用量数据。 
     * @return DomainNames 域名列表。一次最多查询20个域名的用量数据。可以指定多个域名，查询这些域名叠加的用量数据。默认返回所有域名叠加的用量数据。
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 域名列表。一次最多查询20个域名的用量数据。可以指定多个域名，查询这些域名叠加的用量数据。默认返回所有域名叠加的用量数据。
     * @param DomainNames 域名列表。一次最多查询20个域名的用量数据。可以指定多个域名，查询这些域名叠加的用量数据。默认返回所有域名叠加的用量数据。
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    public DescribeCDNUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCDNUsageDataRequest(DescribeCDNUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.DataInterval != null) {
            this.DataInterval = new Long(source.DataInterval);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "DataInterval", this.DataInterval);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);

    }
}

