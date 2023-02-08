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

public class DescribeRabbitMQNodeListRequest extends AbstractModel{

    /**
    * rabbitmq集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 模糊搜索节点名字
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 过滤参数的名字和数值
现在只有一个nodeStatus
running/down
数组类型，兼容后续添加过滤参数

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 按指定元素排序，现在只有2个
cpuUsage/diskUsage
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * 升序/降序
ascend/descend
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get rabbitmq集群ID 
     * @return InstanceId rabbitmq集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set rabbitmq集群ID
     * @param InstanceId rabbitmq集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get 一页限制 
     * @return Limit 一页限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页限制
     * @param Limit 一页限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 模糊搜索节点名字 
     * @return NodeName 模糊搜索节点名字
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 模糊搜索节点名字
     * @param NodeName 模糊搜索节点名字
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 过滤参数的名字和数值
现在只有一个nodeStatus
running/down
数组类型，兼容后续添加过滤参数
 
     * @return Filters 过滤参数的名字和数值
现在只有一个nodeStatus
running/down
数组类型，兼容后续添加过滤参数

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数的名字和数值
现在只有一个nodeStatus
running/down
数组类型，兼容后续添加过滤参数

     * @param Filters 过滤参数的名字和数值
现在只有一个nodeStatus
running/down
数组类型，兼容后续添加过滤参数

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 按指定元素排序，现在只有2个
cpuUsage/diskUsage 
     * @return SortElement 按指定元素排序，现在只有2个
cpuUsage/diskUsage
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set 按指定元素排序，现在只有2个
cpuUsage/diskUsage
     * @param SortElement 按指定元素排序，现在只有2个
cpuUsage/diskUsage
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get 升序/降序
ascend/descend 
     * @return SortOrder 升序/降序
ascend/descend
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 升序/降序
ascend/descend
     * @param SortOrder 升序/降序
ascend/descend
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeRabbitMQNodeListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQNodeListRequest(DescribeRabbitMQNodeListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortElement != null) {
            this.SortElement = new String(source.SortElement);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortElement", this.SortElement);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

