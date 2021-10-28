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

public class DescribeRocketMQTopicsRequest extends AbstractModel{

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
    * 命名空间
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Transaction
    */
    @SerializedName("FilterType")
    @Expose
    private String [] FilterType;

    /**
    * 按主题名称搜索，支持模糊查询
    */
    @SerializedName("FilterName")
    @Expose
    private String FilterName;

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
     * Get 命名空间 
     * @return NamespaceId 命名空间
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间
     * @param NamespaceId 命名空间
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Transaction 
     * @return FilterType 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Transaction
     */
    public String [] getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Transaction
     * @param FilterType 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Transaction
     */
    public void setFilterType(String [] FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get 按主题名称搜索，支持模糊查询 
     * @return FilterName 按主题名称搜索，支持模糊查询
     */
    public String getFilterName() {
        return this.FilterName;
    }

    /**
     * Set 按主题名称搜索，支持模糊查询
     * @param FilterName 按主题名称搜索，支持模糊查询
     */
    public void setFilterName(String FilterName) {
        this.FilterName = FilterName;
    }

    public DescribeRocketMQTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQTopicsRequest(DescribeRocketMQTopicsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamArraySimple(map, prefix + "FilterType.", this.FilterType);
        this.setParamSimple(map, prefix + "FilterName", this.FilterName);

    }
}

