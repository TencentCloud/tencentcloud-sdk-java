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

public class DescribeClustersRequest extends AbstractModel{

    /**
    * 集群ID列表(为空时，
表示获取账号下所有集群)
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大输出条数，默认20，最大为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件,当前只支持按照单个条件ClusterName进行过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 集群ID列表(为空时，
表示获取账号下所有集群) 
     * @return ClusterIds 集群ID列表(为空时，
表示获取账号下所有集群)
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 集群ID列表(为空时，
表示获取账号下所有集群)
     * @param ClusterIds 集群ID列表(为空时，
表示获取账号下所有集群)
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 偏移量,默认0 
     * @return Offset 偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大输出条数，默认20，最大为100 
     * @return Limit 最大输出条数，默认20，最大为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大输出条数，默认20，最大为100
     * @param Limit 最大输出条数，默认20，最大为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件,当前只支持按照单个条件ClusterName进行过滤 
     * @return Filters 过滤条件,当前只支持按照单个条件ClusterName进行过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件,当前只支持按照单个条件ClusterName进行过滤
     * @param Filters 过滤条件,当前只支持按照单个条件ClusterName进行过滤
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

