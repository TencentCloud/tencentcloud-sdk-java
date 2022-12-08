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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterParamLogsRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 实例ID列表，用来记录具体操作哪些实例
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 排序字段，定义在回返结果的基于哪个字段进行排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 定义具体的排序规则，限定为desc,asc,DESC,ASC其中之一
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 返回数量，默认为 20，取值范围为(0,100]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 记录偏移量，默认值为0，取值范围为[0,INF)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get 实例ID列表，用来记录具体操作哪些实例 
     * @return InstanceIds 实例ID列表，用来记录具体操作哪些实例
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例ID列表，用来记录具体操作哪些实例
     * @param InstanceIds 实例ID列表，用来记录具体操作哪些实例
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 排序字段，定义在回返结果的基于哪个字段进行排序 
     * @return OrderBy 排序字段，定义在回返结果的基于哪个字段进行排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，定义在回返结果的基于哪个字段进行排序
     * @param OrderBy 排序字段，定义在回返结果的基于哪个字段进行排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 定义具体的排序规则，限定为desc,asc,DESC,ASC其中之一 
     * @return OrderByType 定义具体的排序规则，限定为desc,asc,DESC,ASC其中之一
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 定义具体的排序规则，限定为desc,asc,DESC,ASC其中之一
     * @param OrderByType 定义具体的排序规则，限定为desc,asc,DESC,ASC其中之一
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 返回数量，默认为 20，取值范围为(0,100] 
     * @return Limit 返回数量，默认为 20，取值范围为(0,100]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，取值范围为(0,100]
     * @param Limit 返回数量，默认为 20，取值范围为(0,100]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 记录偏移量，默认值为0，取值范围为[0,INF) 
     * @return Offset 记录偏移量，默认值为0，取值范围为[0,INF)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录偏移量，默认值为0，取值范围为[0,INF)
     * @param Offset 记录偏移量，默认值为0，取值范围为[0,INF)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeClusterParamLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterParamLogsRequest(DescribeClusterParamLogsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

