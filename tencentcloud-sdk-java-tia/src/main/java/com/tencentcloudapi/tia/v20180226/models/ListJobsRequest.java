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
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListJobsRequest extends AbstractModel{

    /**
    * 运行任务的集群
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 分页参数，返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 运行任务的集群 
     * @return Cluster 运行任务的集群
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 运行任务的集群
     * @param Cluster 运行任务的集群
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 分页参数，返回数量 
     * @return Limit 分页参数，返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，返回数量
     * @param Limit 分页参数，返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，起始位置 
     * @return Offset 分页参数，起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，起始位置
     * @param Offset 分页参数，起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

