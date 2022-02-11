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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterNodePoolsRequest extends AbstractModel{

    /**
    * ClusterId（集群id）
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * ·  NodePoolsName
    按照【节点池名】进行过滤。
    类型：String
    必选：否

·  NodePoolsId
    按照【节点池id】进行过滤。
    类型：String
    必选：否

·  tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get ClusterId（集群id） 
     * @return ClusterId ClusterId（集群id）
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ClusterId（集群id）
     * @param ClusterId ClusterId（集群id）
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get ·  NodePoolsName
    按照【节点池名】进行过滤。
    类型：String
    必选：否

·  NodePoolsId
    按照【节点池id】进行过滤。
    类型：String
    必选：否

·  tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否 
     * @return Filters ·  NodePoolsName
    按照【节点池名】进行过滤。
    类型：String
    必选：否

·  NodePoolsId
    按照【节点池id】进行过滤。
    类型：String
    必选：否

·  tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set ·  NodePoolsName
    按照【节点池名】进行过滤。
    类型：String
    必选：否

·  NodePoolsId
    按照【节点池id】进行过滤。
    类型：String
    必选：否

·  tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否
     * @param Filters ·  NodePoolsName
    按照【节点池名】进行过滤。
    类型：String
    必选：否

·  NodePoolsId
    按照【节点池id】进行过滤。
    类型：String
    必选：否

·  tags
    按照【标签键值对】进行过滤。
    类型：String
    必选：否

·  tag:tag-key
    按照【标签键值对】进行过滤。
    类型：String
    必选：否
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeClusterNodePoolsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterNodePoolsRequest(DescribeClusterNodePoolsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

