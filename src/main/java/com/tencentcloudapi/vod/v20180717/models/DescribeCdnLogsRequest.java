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

public class DescribeCdnLogsRequest extends AbstractModel {

    /**
    * <p>域名。</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>获取日志起始时间点，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间需大于起始时间；使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>分页拉取的最大返回结果数。默认值：100；最大值：1000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页拉取的起始偏移量。默认值：0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>域名。</p> 
     * @return DomainName <p>域名。</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>域名。</p>
     * @param DomainName <p>域名。</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>获取日志起始时间点，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p> 
     * @return StartTime <p>获取日志起始时间点，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>获取日志起始时间点，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     * @param StartTime <p>获取日志起始时间点，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间需大于起始时间；使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p> 
     * @return EndTime <p>结束时间需大于起始时间；使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间需大于起始时间；使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     * @param EndTime <p>结束时间需大于起始时间；使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p><p>参数格式：YYYY-MM-DDThh:mm:ssZ</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>分页拉取的最大返回结果数。默认值：100；最大值：1000。</p> 
     * @return Limit <p>分页拉取的最大返回结果数。默认值：100；最大值：1000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页拉取的最大返回结果数。默认值：100；最大值：1000。</p>
     * @param Limit <p>分页拉取的最大返回结果数。默认值：100；最大值：1000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页拉取的起始偏移量。默认值：0。</p> 
     * @return Offset <p>分页拉取的起始偏移量。默认值：0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页拉取的起始偏移量。默认值：0。</p>
     * @param Offset <p>分页拉取的起始偏移量。默认值：0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCdnLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCdnLogsRequest(DescribeCdnLogsRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

