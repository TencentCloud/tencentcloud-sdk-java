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

public class BaselineItemRiskRecord extends AbstractModel {

    /**
    * <p>风险记录主键 ID。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>命中风险的主机资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostInfo")
    @Expose
    private BaselineHostAsset HostInfo;

    /**
    * <p>集群资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterInfo")
    @Expose
    private BaselineClusterAsset ClusterInfo;

    /**
    * <p>命中资产的资产类型。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：集群</li><li>POD：Pod</li><li>CONTAINER：容器</li><li>IMAGE：镜像</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>风险检测结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li><li>IGNORED：已忽略</li></ul>
    */
    @SerializedName("ResultStatus")
    @Expose
    private String ResultStatus;

    /**
    * <p>最近检查时间。</p>
    */
    @SerializedName("LatestCheckTime")
    @Expose
    private String LatestCheckTime;

    /**
    * <p>基线检测项 ID。</p>
    */
    @SerializedName("ItemID")
    @Expose
    private Long ItemID;

    /**
    * <p>风险事件 ID，用于唯一标识该风险记录。</p>
    */
    @SerializedName("RiskID")
    @Expose
    private String RiskID;

    /**
    * <p>本次扫描的全局 JobID。</p>
    */
    @SerializedName("JobID")
    @Expose
    private String JobID;

    /**
     * Get <p>风险记录主键 ID。</p> 
     * @return ID <p>风险记录主键 ID。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>风险记录主键 ID。</p>
     * @param ID <p>风险记录主键 ID。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>命中风险的主机资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostInfo <p>命中风险的主机资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineHostAsset getHostInfo() {
        return this.HostInfo;
    }

    /**
     * Set <p>命中风险的主机资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostInfo <p>命中风险的主机资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostInfo(BaselineHostAsset HostInfo) {
        this.HostInfo = HostInfo;
    }

    /**
     * Get <p>集群资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterInfo <p>集群资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineClusterAsset getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set <p>集群资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterInfo <p>集群资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterInfo(BaselineClusterAsset ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get <p>命中资产的资产类型。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：集群</li><li>POD：Pod</li><li>CONTAINER：容器</li><li>IMAGE：镜像</li></ul> 
     * @return AssetType <p>命中资产的资产类型。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：集群</li><li>POD：Pod</li><li>CONTAINER：容器</li><li>IMAGE：镜像</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>命中资产的资产类型。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：集群</li><li>POD：Pod</li><li>CONTAINER：容器</li><li>IMAGE：镜像</li></ul>
     * @param AssetType <p>命中资产的资产类型。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：集群</li><li>POD：Pod</li><li>CONTAINER：容器</li><li>IMAGE：镜像</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>风险检测结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li><li>IGNORED：已忽略</li></ul> 
     * @return ResultStatus <p>风险检测结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li><li>IGNORED：已忽略</li></ul>
     */
    public String getResultStatus() {
        return this.ResultStatus;
    }

    /**
     * Set <p>风险检测结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li><li>IGNORED：已忽略</li></ul>
     * @param ResultStatus <p>风险检测结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li><li>IGNORED：已忽略</li></ul>
     */
    public void setResultStatus(String ResultStatus) {
        this.ResultStatus = ResultStatus;
    }

    /**
     * Get <p>最近检查时间。</p> 
     * @return LatestCheckTime <p>最近检查时间。</p>
     */
    public String getLatestCheckTime() {
        return this.LatestCheckTime;
    }

    /**
     * Set <p>最近检查时间。</p>
     * @param LatestCheckTime <p>最近检查时间。</p>
     */
    public void setLatestCheckTime(String LatestCheckTime) {
        this.LatestCheckTime = LatestCheckTime;
    }

    /**
     * Get <p>基线检测项 ID。</p> 
     * @return ItemID <p>基线检测项 ID。</p>
     */
    public Long getItemID() {
        return this.ItemID;
    }

    /**
     * Set <p>基线检测项 ID。</p>
     * @param ItemID <p>基线检测项 ID。</p>
     */
    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * Get <p>风险事件 ID，用于唯一标识该风险记录。</p> 
     * @return RiskID <p>风险事件 ID，用于唯一标识该风险记录。</p>
     */
    public String getRiskID() {
        return this.RiskID;
    }

    /**
     * Set <p>风险事件 ID，用于唯一标识该风险记录。</p>
     * @param RiskID <p>风险事件 ID，用于唯一标识该风险记录。</p>
     */
    public void setRiskID(String RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get <p>本次扫描的全局 JobID。</p> 
     * @return JobID <p>本次扫描的全局 JobID。</p>
     */
    public String getJobID() {
        return this.JobID;
    }

    /**
     * Set <p>本次扫描的全局 JobID。</p>
     * @param JobID <p>本次扫描的全局 JobID。</p>
     */
    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    public BaselineItemRiskRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItemRiskRecord(BaselineItemRiskRecord source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.HostInfo != null) {
            this.HostInfo = new BaselineHostAsset(source.HostInfo);
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new BaselineClusterAsset(source.ClusterInfo);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ResultStatus != null) {
            this.ResultStatus = new String(source.ResultStatus);
        }
        if (source.LatestCheckTime != null) {
            this.LatestCheckTime = new String(source.LatestCheckTime);
        }
        if (source.ItemID != null) {
            this.ItemID = new Long(source.ItemID);
        }
        if (source.RiskID != null) {
            this.RiskID = new String(source.RiskID);
        }
        if (source.JobID != null) {
            this.JobID = new String(source.JobID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamObj(map, prefix + "HostInfo.", this.HostInfo);
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ResultStatus", this.ResultStatus);
        this.setParamSimple(map, prefix + "LatestCheckTime", this.LatestCheckTime);
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamSimple(map, prefix + "JobID", this.JobID);

    }
}

