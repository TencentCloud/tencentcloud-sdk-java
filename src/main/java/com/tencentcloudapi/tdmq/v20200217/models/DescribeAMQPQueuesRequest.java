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

public class DescribeAMQPQueuesRequest extends AbstractModel{

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
    * Vhost名称
    */
    @SerializedName("VHostId")
    @Expose
    private String VHostId;

    /**
    * 按队列名称搜索，支持模糊查询
    */
    @SerializedName("NameKeyword")
    @Expose
    private String NameKeyword;

    /**
    * 查询结果排序规则，ASC为升序，DESC为降序
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量）、Tps
    */
    @SerializedName("SortedBy")
    @Expose
    private String SortedBy;

    /**
    * 队列名称，指定此参数后将只返回该队列信息
    */
    @SerializedName("FilterOneQueue")
    @Expose
    private String FilterOneQueue;

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
     * Get Vhost名称 
     * @return VHostId Vhost名称
     */
    public String getVHostId() {
        return this.VHostId;
    }

    /**
     * Set Vhost名称
     * @param VHostId Vhost名称
     */
    public void setVHostId(String VHostId) {
        this.VHostId = VHostId;
    }

    /**
     * Get 按队列名称搜索，支持模糊查询 
     * @return NameKeyword 按队列名称搜索，支持模糊查询
     */
    public String getNameKeyword() {
        return this.NameKeyword;
    }

    /**
     * Set 按队列名称搜索，支持模糊查询
     * @param NameKeyword 按队列名称搜索，支持模糊查询
     */
    public void setNameKeyword(String NameKeyword) {
        this.NameKeyword = NameKeyword;
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

    /**
     * Get 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量）、Tps 
     * @return SortedBy 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量）、Tps
     */
    public String getSortedBy() {
        return this.SortedBy;
    }

    /**
     * Set 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量）、Tps
     * @param SortedBy 对查询结果排序，此为排序字段，目前支持Accumulative（消息堆积量）、Tps
     */
    public void setSortedBy(String SortedBy) {
        this.SortedBy = SortedBy;
    }

    /**
     * Get 队列名称，指定此参数后将只返回该队列信息 
     * @return FilterOneQueue 队列名称，指定此参数后将只返回该队列信息
     */
    public String getFilterOneQueue() {
        return this.FilterOneQueue;
    }

    /**
     * Set 队列名称，指定此参数后将只返回该队列信息
     * @param FilterOneQueue 队列名称，指定此参数后将只返回该队列信息
     */
    public void setFilterOneQueue(String FilterOneQueue) {
        this.FilterOneQueue = FilterOneQueue;
    }

    public DescribeAMQPQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAMQPQueuesRequest(DescribeAMQPQueuesRequest source) {
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
        if (source.NameKeyword != null) {
            this.NameKeyword = new String(source.NameKeyword);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.SortedBy != null) {
            this.SortedBy = new String(source.SortedBy);
        }
        if (source.FilterOneQueue != null) {
            this.FilterOneQueue = new String(source.FilterOneQueue);
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
        this.setParamSimple(map, prefix + "NameKeyword", this.NameKeyword);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "SortedBy", this.SortedBy);
        this.setParamSimple(map, prefix + "FilterOneQueue", this.FilterOneQueue);

    }
}

