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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiAggregateTopNRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 需要的Top数，默认5， 最大值100
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

    /**
    * 开始时间
    */
    @SerializedName("StartTs")
    @Expose
    private Long StartTs;

    /**
    * 结束时间
    */
    @SerializedName("EndTs")
    @Expose
    private Long EndTs;

    /**
    * 需要查询TOP的维度名
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private BotDataFilter [] Filters;

    /**
    * 是否查询全域名的三个特殊图标
    */
    @SerializedName("GlobalFlag")
    @Expose
    private Boolean GlobalFlag;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 需要的Top数，默认5， 最大值100 
     * @return TopN 需要的Top数，默认5， 最大值100
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set 需要的Top数，默认5， 最大值100
     * @param TopN 需要的Top数，默认5， 最大值100
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    /**
     * Get 开始时间 
     * @return StartTs 开始时间
     */
    public Long getStartTs() {
        return this.StartTs;
    }

    /**
     * Set 开始时间
     * @param StartTs 开始时间
     */
    public void setStartTs(Long StartTs) {
        this.StartTs = StartTs;
    }

    /**
     * Get 结束时间 
     * @return EndTs 结束时间
     */
    public Long getEndTs() {
        return this.EndTs;
    }

    /**
     * Set 结束时间
     * @param EndTs 结束时间
     */
    public void setEndTs(Long EndTs) {
        this.EndTs = EndTs;
    }

    /**
     * Get 需要查询TOP的维度名 
     * @return Dimension 需要查询TOP的维度名
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 需要查询TOP的维度名
     * @param Dimension 需要查询TOP的维度名
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public BotDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(BotDataFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否查询全域名的三个特殊图标 
     * @return GlobalFlag 是否查询全域名的三个特殊图标
     */
    public Boolean getGlobalFlag() {
        return this.GlobalFlag;
    }

    /**
     * Set 是否查询全域名的三个特殊图标
     * @param GlobalFlag 是否查询全域名的三个特殊图标
     */
    public void setGlobalFlag(Boolean GlobalFlag) {
        this.GlobalFlag = GlobalFlag;
    }

    public DescribeApiAggregateTopNRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiAggregateTopNRequest(DescribeApiAggregateTopNRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
        }
        if (source.StartTs != null) {
            this.StartTs = new Long(source.StartTs);
        }
        if (source.EndTs != null) {
            this.EndTs = new Long(source.EndTs);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.Filters != null) {
            this.Filters = new BotDataFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new BotDataFilter(source.Filters[i]);
            }
        }
        if (source.GlobalFlag != null) {
            this.GlobalFlag = new Boolean(source.GlobalFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "TopN", this.TopN);
        this.setParamSimple(map, prefix + "StartTs", this.StartTs);
        this.setParamSimple(map, prefix + "EndTs", this.EndTs);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "GlobalFlag", this.GlobalFlag);

    }
}

