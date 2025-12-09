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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQConsumerConnectionsRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 消费组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量）
    */
    @SerializedName("SortedBy")
    @Expose
    private String SortedBy;

    /**
    * 查询结果排序规则，ASC为升序，DESC为降序
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

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
     * Get 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default 
     * @return NamespaceId 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default
     * @param NamespaceId 消费组所在的命名空间，4.x 通用集群命名空间固定为: tdmq_default
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 消费组ID 
     * @return GroupId 消费组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 消费组ID
     * @param GroupId 消费组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
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
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量） 
     * @return SortedBy 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量）
     */
    public String getSortedBy() {
        return this.SortedBy;
    }

    /**
     * Set 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量）
     * @param SortedBy 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量）
     */
    public void setSortedBy(String SortedBy) {
        this.SortedBy = SortedBy;
    }

    /**
     * Get 查询结果排序规则，ASC为升序，DESC为降序 
     * @return SortOrder 查询结果排序规则，ASC为升序，DESC为降序
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 查询结果排序规则，ASC为升序，DESC为降序
     * @param SortOrder 查询结果排序规则，ASC为升序，DESC为降序
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeRocketMQConsumerConnectionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQConsumerConnectionsRequest(DescribeRocketMQConsumerConnectionsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortedBy != null) {
            this.SortedBy = new String(source.SortedBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortedBy", this.SortedBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

