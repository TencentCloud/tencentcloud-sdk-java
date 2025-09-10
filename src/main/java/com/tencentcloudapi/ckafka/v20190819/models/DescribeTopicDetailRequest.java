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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopicDetailRequest extends AbstractModel {

    /**
    * ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * （过滤条件）按照topicName过滤，支持模糊查询
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 偏移量，不填默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，不填则默认 20，取值要大于0
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Acl预设策略名称
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
    * 根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 0-顺序、1-倒序，默认值为0。
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 目前支持 ReplicaNum （副本数）筛选
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取 
     * @return InstanceId ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     * @param InstanceId ckafka集群实例Id，可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get （过滤条件）按照topicName过滤，支持模糊查询 
     * @return SearchWord （过滤条件）按照topicName过滤，支持模糊查询
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set （过滤条件）按照topicName过滤，支持模糊查询
     * @param SearchWord （过滤条件）按照topicName过滤，支持模糊查询
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 偏移量，不填默认为0 
     * @return Offset 偏移量，不填默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，不填默认为0
     * @param Offset 偏移量，不填默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，不填则默认 20，取值要大于0 
     * @return Limit 返回数量，不填则默认 20，取值要大于0
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，不填则默认 20，取值要大于0
     * @param Limit 返回数量，不填则默认 20，取值要大于0
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Acl预设策略名称 
     * @return AclRuleName Acl预设策略名称
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set Acl预设策略名称
     * @param AclRuleName Acl预设策略名称
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    /**
     * Get 根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。 
     * @return OrderBy 根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。
     * @param OrderBy 根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 0-顺序、1-倒序，默认值为0。 
     * @return OrderType 0-顺序、1-倒序，默认值为0。
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 0-顺序、1-倒序，默认值为0。
     * @param OrderType 0-顺序、1-倒序，默认值为0。
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 目前支持 ReplicaNum （副本数）筛选 
     * @return Filters 目前支持 ReplicaNum （副本数）筛选
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 目前支持 ReplicaNum （副本数）筛选
     * @param Filters 目前支持 ReplicaNum （副本数）筛选
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTopicDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicDetailRequest(DescribeTopicDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AclRuleName != null) {
            this.AclRuleName = new String(source.AclRuleName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "AclRuleName", this.AclRuleName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

