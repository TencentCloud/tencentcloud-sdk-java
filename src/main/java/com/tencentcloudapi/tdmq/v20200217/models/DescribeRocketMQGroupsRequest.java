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

public class DescribeRocketMQGroupsRequest extends AbstractModel{

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
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 主题名称，输入此参数可查询该主题下所有的订阅组
    */
    @SerializedName("FilterTopic")
    @Expose
    private String FilterTopic;

    /**
    * 按消费组名称查询消费组，支持模糊查询
    */
    @SerializedName("FilterGroup")
    @Expose
    private String FilterGroup;

    /**
    * 按照指定字段排序，可选值为tps，accumulative
    */
    @SerializedName("SortedBy")
    @Expose
    private String SortedBy;

    /**
    * 按升序或降序排列，可选值为asc，desc
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * 订阅组名称，指定此参数后将只返回该订阅组信息
    */
    @SerializedName("FilterOneGroup")
    @Expose
    private String FilterOneGroup;

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
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制条数 
     * @return Limit 限制条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数
     * @param Limit 限制条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 主题名称，输入此参数可查询该主题下所有的订阅组 
     * @return FilterTopic 主题名称，输入此参数可查询该主题下所有的订阅组
     */
    public String getFilterTopic() {
        return this.FilterTopic;
    }

    /**
     * Set 主题名称，输入此参数可查询该主题下所有的订阅组
     * @param FilterTopic 主题名称，输入此参数可查询该主题下所有的订阅组
     */
    public void setFilterTopic(String FilterTopic) {
        this.FilterTopic = FilterTopic;
    }

    /**
     * Get 按消费组名称查询消费组，支持模糊查询 
     * @return FilterGroup 按消费组名称查询消费组，支持模糊查询
     */
    public String getFilterGroup() {
        return this.FilterGroup;
    }

    /**
     * Set 按消费组名称查询消费组，支持模糊查询
     * @param FilterGroup 按消费组名称查询消费组，支持模糊查询
     */
    public void setFilterGroup(String FilterGroup) {
        this.FilterGroup = FilterGroup;
    }

    /**
     * Get 按照指定字段排序，可选值为tps，accumulative 
     * @return SortedBy 按照指定字段排序，可选值为tps，accumulative
     */
    public String getSortedBy() {
        return this.SortedBy;
    }

    /**
     * Set 按照指定字段排序，可选值为tps，accumulative
     * @param SortedBy 按照指定字段排序，可选值为tps，accumulative
     */
    public void setSortedBy(String SortedBy) {
        this.SortedBy = SortedBy;
    }

    /**
     * Get 按升序或降序排列，可选值为asc，desc 
     * @return SortOrder 按升序或降序排列，可选值为asc，desc
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 按升序或降序排列，可选值为asc，desc
     * @param SortOrder 按升序或降序排列，可选值为asc，desc
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get 订阅组名称，指定此参数后将只返回该订阅组信息 
     * @return FilterOneGroup 订阅组名称，指定此参数后将只返回该订阅组信息
     */
    public String getFilterOneGroup() {
        return this.FilterOneGroup;
    }

    /**
     * Set 订阅组名称，指定此参数后将只返回该订阅组信息
     * @param FilterOneGroup 订阅组名称，指定此参数后将只返回该订阅组信息
     */
    public void setFilterOneGroup(String FilterOneGroup) {
        this.FilterOneGroup = FilterOneGroup;
    }

    public DescribeRocketMQGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQGroupsRequest(DescribeRocketMQGroupsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterTopic != null) {
            this.FilterTopic = new String(source.FilterTopic);
        }
        if (source.FilterGroup != null) {
            this.FilterGroup = new String(source.FilterGroup);
        }
        if (source.SortedBy != null) {
            this.SortedBy = new String(source.SortedBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.FilterOneGroup != null) {
            this.FilterOneGroup = new String(source.FilterOneGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterTopic", this.FilterTopic);
        this.setParamSimple(map, prefix + "FilterGroup", this.FilterGroup);
        this.setParamSimple(map, prefix + "SortedBy", this.SortedBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "FilterOneGroup", this.FilterOneGroup);

    }
}

