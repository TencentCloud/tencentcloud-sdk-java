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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineClusterAsset extends AbstractModel {

    /**
    * <p>集群 ID。</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>集群名称。</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群类型。</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>集群节点总数。</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>集群在线节点数。</p>
    */
    @SerializedName("OnlineNodeCount")
    @Expose
    private Long OnlineNodeCount;

    /**
    * <p>集群所属租户 Appid。</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>集群子资产名称（Pod名/Node名/Container名/Namespace名；CLUSTER 类型时为集群名）。</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
     * Get <p>集群 ID。</p> 
     * @return ClusterID <p>集群 ID。</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>集群 ID。</p>
     * @param ClusterID <p>集群 ID。</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>集群名称。</p> 
     * @return ClusterName <p>集群名称。</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称。</p>
     * @param ClusterName <p>集群名称。</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群类型。</p> 
     * @return ClusterType <p>集群类型。</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型。</p>
     * @param ClusterType <p>集群类型。</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集群节点总数。</p> 
     * @return NodeCount <p>集群节点总数。</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>集群节点总数。</p>
     * @param NodeCount <p>集群节点总数。</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>集群在线节点数。</p> 
     * @return OnlineNodeCount <p>集群在线节点数。</p>
     */
    public Long getOnlineNodeCount() {
        return this.OnlineNodeCount;
    }

    /**
     * Set <p>集群在线节点数。</p>
     * @param OnlineNodeCount <p>集群在线节点数。</p>
     */
    public void setOnlineNodeCount(Long OnlineNodeCount) {
        this.OnlineNodeCount = OnlineNodeCount;
    }

    /**
     * Get <p>集群所属租户 Appid。</p> 
     * @return Appid <p>集群所属租户 Appid。</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>集群所属租户 Appid。</p>
     * @param Appid <p>集群所属租户 Appid。</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>集群子资产名称（Pod名/Node名/Container名/Namespace名；CLUSTER 类型时为集群名）。</p> 
     * @return AssetName <p>集群子资产名称（Pod名/Node名/Container名/Namespace名；CLUSTER 类型时为集群名）。</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>集群子资产名称（Pod名/Node名/Container名/Namespace名；CLUSTER 类型时为集群名）。</p>
     * @param AssetName <p>集群子资产名称（Pod名/Node名/Container名/Namespace名；CLUSTER 类型时为集群名）。</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    public BaselineClusterAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineClusterAsset(BaselineClusterAsset source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.OnlineNodeCount != null) {
            this.OnlineNodeCount = new Long(source.OnlineNodeCount);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "OnlineNodeCount", this.OnlineNodeCount);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);

    }
}

