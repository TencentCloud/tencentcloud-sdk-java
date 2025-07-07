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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClustersRequest extends AbstractModel {

    /**
    * 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
dedicated-cluster-id: 按照专属集群ID筛选，类型为string
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
dedicated-cluster-id: 按照专属集群ID筛选，类型为string 
     * @return Filters 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
dedicated-cluster-id: 按照专属集群ID筛选，类型为string
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
dedicated-cluster-id: 按照专属集群ID筛选，类型为string
     * @param Filters 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
dedicated-cluster-id: 按照专属集群ID筛选，类型为string
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDedicatedClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClustersRequest(DescribeDedicatedClustersRequest source) {
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

