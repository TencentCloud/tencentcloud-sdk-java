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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterGroupClustersRequest extends AbstractModel {

    /**
    * <p>计算组 ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>返回样例 ClusterId 的最大数量（默认 5）</p>
    */
    @SerializedName("SampleLimit")
    @Expose
    private Long SampleLimit;

    /**
    * <p>Cluster 状态列表</p><p>枚举值：</p><ul><li>running： 运行中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
     * Get <p>计算组 ID</p> 
     * @return Id <p>计算组 ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>计算组 ID</p>
     * @param Id <p>计算组 ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>返回样例 ClusterId 的最大数量（默认 5）</p> 
     * @return SampleLimit <p>返回样例 ClusterId 的最大数量（默认 5）</p>
     */
    public Long getSampleLimit() {
        return this.SampleLimit;
    }

    /**
     * Set <p>返回样例 ClusterId 的最大数量（默认 5）</p>
     * @param SampleLimit <p>返回样例 ClusterId 的最大数量（默认 5）</p>
     */
    public void setSampleLimit(Long SampleLimit) {
        this.SampleLimit = SampleLimit;
    }

    /**
     * Get <p>Cluster 状态列表</p><p>枚举值：</p><ul><li>running： 运行中</li></ul> 
     * @return Status <p>Cluster 状态列表</p><p>枚举值：</p><ul><li>running： 运行中</li></ul>
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Cluster 状态列表</p><p>枚举值：</p><ul><li>running： 运行中</li></ul>
     * @param Status <p>Cluster 状态列表</p><p>枚举值：</p><ul><li>running： 运行中</li></ul>
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    public DescribeClusterGroupClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterGroupClustersRequest(DescribeClusterGroupClustersRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.SampleLimit != null) {
            this.SampleLimit = new Long(source.SampleLimit);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SampleLimit", this.SampleLimit);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

