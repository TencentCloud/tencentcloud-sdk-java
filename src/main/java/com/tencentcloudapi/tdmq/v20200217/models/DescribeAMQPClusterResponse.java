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

public class DescribeAMQPClusterResponse extends AbstractModel{

    /**
    * 集群信息
    */
    @SerializedName("ClusterInfo")
    @Expose
    private AMQPClusterInfo ClusterInfo;

    /**
    * 集群配置
    */
    @SerializedName("ClusterConfig")
    @Expose
    private AMQPClusterConfig ClusterConfig;

    /**
    * 集群最近使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterStats")
    @Expose
    private AMQPClusterRecentStats ClusterStats;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群信息 
     * @return ClusterInfo 集群信息
     */
    public AMQPClusterInfo getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set 集群信息
     * @param ClusterInfo 集群信息
     */
    public void setClusterInfo(AMQPClusterInfo ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get 集群配置 
     * @return ClusterConfig 集群配置
     */
    public AMQPClusterConfig getClusterConfig() {
        return this.ClusterConfig;
    }

    /**
     * Set 集群配置
     * @param ClusterConfig 集群配置
     */
    public void setClusterConfig(AMQPClusterConfig ClusterConfig) {
        this.ClusterConfig = ClusterConfig;
    }

    /**
     * Get 集群最近使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterStats 集群最近使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AMQPClusterRecentStats getClusterStats() {
        return this.ClusterStats;
    }

    /**
     * Set 集群最近使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterStats 集群最近使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterStats(AMQPClusterRecentStats ClusterStats) {
        this.ClusterStats = ClusterStats;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAMQPClusterResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAMQPClusterResponse(DescribeAMQPClusterResponse source) {
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new AMQPClusterInfo(source.ClusterInfo);
        }
        if (source.ClusterConfig != null) {
            this.ClusterConfig = new AMQPClusterConfig(source.ClusterConfig);
        }
        if (source.ClusterStats != null) {
            this.ClusterStats = new AMQPClusterRecentStats(source.ClusterStats);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamObj(map, prefix + "ClusterConfig.", this.ClusterConfig);
        this.setParamObj(map, prefix + "ClusterStats.", this.ClusterStats);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

