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
    * <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>（过滤条件）按照topicName过滤，支持模糊查询</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>偏移量，不填默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，不填则默认 20，取值要大于0</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Acl预设策略名称</p>
    */
    @SerializedName("AclRuleName")
    @Expose
    private String AclRuleName;

    /**
    * <p>根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。</p><p>该参数为空时，默认按CreateTime倒序排序</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>0-顺序、1-倒序，默认值为0。</p>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>目前支持 ReplicaNum （副本数）筛选</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p> 
     * @return InstanceId <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     * @param InstanceId <p>ckafka集群实例Id，可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>（过滤条件）按照topicName过滤，支持模糊查询</p> 
     * @return SearchWord <p>（过滤条件）按照topicName过滤，支持模糊查询</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>（过滤条件）按照topicName过滤，支持模糊查询</p>
     * @param SearchWord <p>（过滤条件）按照topicName过滤，支持模糊查询</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>偏移量，不填默认为0</p> 
     * @return Offset <p>偏移量，不填默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，不填默认为0</p>
     * @param Offset <p>偏移量，不填默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，不填则默认 20，取值要大于0</p> 
     * @return Limit <p>返回数量，不填则默认 20，取值要大于0</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，不填则默认 20，取值要大于0</p>
     * @param Limit <p>返回数量，不填则默认 20，取值要大于0</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Acl预设策略名称</p> 
     * @return AclRuleName <p>Acl预设策略名称</p>
     */
    public String getAclRuleName() {
        return this.AclRuleName;
    }

    /**
     * Set <p>Acl预设策略名称</p>
     * @param AclRuleName <p>Acl预设策略名称</p>
     */
    public void setAclRuleName(String AclRuleName) {
        this.AclRuleName = AclRuleName;
    }

    /**
     * Get <p>根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。</p><p>该参数为空时，默认按CreateTime倒序排序</p> 
     * @return OrderBy <p>根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。</p><p>该参数为空时，默认按CreateTime倒序排序</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。</p><p>该参数为空时，默认按CreateTime倒序排序</p>
     * @param OrderBy <p>根据特定的属性排序(目前支持PartitionNum/CreateTime)，默认值为CreateTime。</p><p>该参数为空时，默认按CreateTime倒序排序</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>0-顺序、1-倒序，默认值为0。</p> 
     * @return OrderType <p>0-顺序、1-倒序，默认值为0。</p>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>0-顺序、1-倒序，默认值为0。</p>
     * @param OrderType <p>0-顺序、1-倒序，默认值为0。</p>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>目前支持 ReplicaNum （副本数）筛选</p> 
     * @return Filters <p>目前支持 ReplicaNum （副本数）筛选</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>目前支持 ReplicaNum （副本数）筛选</p>
     * @param Filters <p>目前支持 ReplicaNum （副本数）筛选</p>
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

