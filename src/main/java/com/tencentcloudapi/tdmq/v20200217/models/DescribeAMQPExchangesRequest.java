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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAMQPExchangesRequest extends AbstractModel{

    /**
    * 查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询限制数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Vhost ID
    */
    @SerializedName("VHostId")
    @Expose
    private String VHostId;

    /**
    * 按路由类型过滤查询结果，可选择Direct, Fanout, Topic
    */
    @SerializedName("FilterType")
    @Expose
    private String [] FilterType;

    /**
    * 按exchange名称搜索，支持模糊查询
    */
    @SerializedName("FilterName")
    @Expose
    private String FilterName;

    /**
    * 过滤查询内部或者外部exchange
    */
    @SerializedName("FilterInternal")
    @Expose
    private Boolean FilterInternal;

    /**
     * Get 查询偏移量 
     * @return Offset 查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量
     * @param Offset 查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询限制数 
     * @return Limit 查询限制数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询限制数
     * @param Limit 查询限制数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Vhost ID 
     * @return VHostId Vhost ID
     */
    public String getVHostId() {
        return this.VHostId;
    }

    /**
     * Set Vhost ID
     * @param VHostId Vhost ID
     */
    public void setVHostId(String VHostId) {
        this.VHostId = VHostId;
    }

    /**
     * Get 按路由类型过滤查询结果，可选择Direct, Fanout, Topic 
     * @return FilterType 按路由类型过滤查询结果，可选择Direct, Fanout, Topic
     */
    public String [] getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 按路由类型过滤查询结果，可选择Direct, Fanout, Topic
     * @param FilterType 按路由类型过滤查询结果，可选择Direct, Fanout, Topic
     */
    public void setFilterType(String [] FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get 按exchange名称搜索，支持模糊查询 
     * @return FilterName 按exchange名称搜索，支持模糊查询
     */
    public String getFilterName() {
        return this.FilterName;
    }

    /**
     * Set 按exchange名称搜索，支持模糊查询
     * @param FilterName 按exchange名称搜索，支持模糊查询
     */
    public void setFilterName(String FilterName) {
        this.FilterName = FilterName;
    }

    /**
     * Get 过滤查询内部或者外部exchange 
     * @return FilterInternal 过滤查询内部或者外部exchange
     */
    public Boolean getFilterInternal() {
        return this.FilterInternal;
    }

    /**
     * Set 过滤查询内部或者外部exchange
     * @param FilterInternal 过滤查询内部或者外部exchange
     */
    public void setFilterInternal(Boolean FilterInternal) {
        this.FilterInternal = FilterInternal;
    }

    public DescribeAMQPExchangesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAMQPExchangesRequest(DescribeAMQPExchangesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VHostId != null) {
            this.VHostId = new String(source.VHostId);
        }
        if (source.FilterType != null) {
            this.FilterType = new String[source.FilterType.length];
            for (int i = 0; i < source.FilterType.length; i++) {
                this.FilterType[i] = new String(source.FilterType[i]);
            }
        }
        if (source.FilterName != null) {
            this.FilterName = new String(source.FilterName);
        }
        if (source.FilterInternal != null) {
            this.FilterInternal = new Boolean(source.FilterInternal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VHostId", this.VHostId);
        this.setParamArraySimple(map, prefix + "FilterType.", this.FilterType);
        this.setParamSimple(map, prefix + "FilterName", this.FilterName);
        this.setParamSimple(map, prefix + "FilterInternal", this.FilterInternal);

    }
}

