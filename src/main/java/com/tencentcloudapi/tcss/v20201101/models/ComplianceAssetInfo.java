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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceAssetInfo extends AbstractModel {

    /**
    * <p>客户资产的ID。</p>
    */
    @SerializedName("CustomerAssetId")
    @Expose
    private Long CustomerAssetId;

    /**
    * <p>资产类别。</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>资产的名称。</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>当资产为镜像时，这个字段为镜像Tag。</p>
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * <p>资产所在的主机IP。</p>
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * <p>资产所属的节点的名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>检测状态</p><p>CHECK_INIT, 待检测</p><p>CHECK_RUNNING, 检测中</p><p>CHECK_FINISHED, 检测完成</p><p>CHECK_FAILED, 检测失败</p>
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * <p>此类资产通过的检测项的数目。</p>
    */
    @SerializedName("PassedPolicyItemCount")
    @Expose
    private Long PassedPolicyItemCount;

    /**
    * <p>此类资产未通过的检测的数目。</p>
    */
    @SerializedName("FailedPolicyItemCount")
    @Expose
    private Long FailedPolicyItemCount;

    /**
    * <p>上次检测的时间。</p>
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * <p>检测结果：<br>RESULT_FAILED: 未通过。<br>RESULT_PASSED: 通过。</p>
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * <p>主机节点的实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>镜像仓库信息</p>
    */
    @SerializedName("ImageRegistryInfo")
    @Expose
    private ImageRegistryInfo ImageRegistryInfo;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>资产唯一ID</p><p>默认值：-</p>
    */
    @SerializedName("AssetUniqueID")
    @Expose
    private String AssetUniqueID;

    /**
     * Get <p>客户资产的ID。</p> 
     * @return CustomerAssetId <p>客户资产的ID。</p>
     */
    public Long getCustomerAssetId() {
        return this.CustomerAssetId;
    }

    /**
     * Set <p>客户资产的ID。</p>
     * @param CustomerAssetId <p>客户资产的ID。</p>
     */
    public void setCustomerAssetId(Long CustomerAssetId) {
        this.CustomerAssetId = CustomerAssetId;
    }

    /**
     * Get <p>资产类别。</p> 
     * @return AssetType <p>资产类别。</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类别。</p>
     * @param AssetType <p>资产类别。</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>资产的名称。</p> 
     * @return AssetName <p>资产的名称。</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>资产的名称。</p>
     * @param AssetName <p>资产的名称。</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>当资产为镜像时，这个字段为镜像Tag。</p> 
     * @return ImageTag <p>当资产为镜像时，这个字段为镜像Tag。</p>
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set <p>当资产为镜像时，这个字段为镜像Tag。</p>
     * @param ImageTag <p>当资产为镜像时，这个字段为镜像Tag。</p>
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get <p>资产所在的主机IP。</p> 
     * @return HostIP <p>资产所在的主机IP。</p>
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set <p>资产所在的主机IP。</p>
     * @param HostIP <p>资产所在的主机IP。</p>
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get <p>资产所属的节点的名称</p> 
     * @return NodeName <p>资产所属的节点的名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>资产所属的节点的名称</p>
     * @param NodeName <p>资产所属的节点的名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>检测状态</p><p>CHECK_INIT, 待检测</p><p>CHECK_RUNNING, 检测中</p><p>CHECK_FINISHED, 检测完成</p><p>CHECK_FAILED, 检测失败</p> 
     * @return CheckStatus <p>检测状态</p><p>CHECK_INIT, 待检测</p><p>CHECK_RUNNING, 检测中</p><p>CHECK_FINISHED, 检测完成</p><p>CHECK_FAILED, 检测失败</p>
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set <p>检测状态</p><p>CHECK_INIT, 待检测</p><p>CHECK_RUNNING, 检测中</p><p>CHECK_FINISHED, 检测完成</p><p>CHECK_FAILED, 检测失败</p>
     * @param CheckStatus <p>检测状态</p><p>CHECK_INIT, 待检测</p><p>CHECK_RUNNING, 检测中</p><p>CHECK_FINISHED, 检测完成</p><p>CHECK_FAILED, 检测失败</p>
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get <p>此类资产通过的检测项的数目。</p> 
     * @return PassedPolicyItemCount <p>此类资产通过的检测项的数目。</p>
     */
    public Long getPassedPolicyItemCount() {
        return this.PassedPolicyItemCount;
    }

    /**
     * Set <p>此类资产通过的检测项的数目。</p>
     * @param PassedPolicyItemCount <p>此类资产通过的检测项的数目。</p>
     */
    public void setPassedPolicyItemCount(Long PassedPolicyItemCount) {
        this.PassedPolicyItemCount = PassedPolicyItemCount;
    }

    /**
     * Get <p>此类资产未通过的检测的数目。</p> 
     * @return FailedPolicyItemCount <p>此类资产未通过的检测的数目。</p>
     */
    public Long getFailedPolicyItemCount() {
        return this.FailedPolicyItemCount;
    }

    /**
     * Set <p>此类资产未通过的检测的数目。</p>
     * @param FailedPolicyItemCount <p>此类资产未通过的检测的数目。</p>
     */
    public void setFailedPolicyItemCount(Long FailedPolicyItemCount) {
        this.FailedPolicyItemCount = FailedPolicyItemCount;
    }

    /**
     * Get <p>上次检测的时间。</p> 
     * @return LastCheckTime <p>上次检测的时间。</p>
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set <p>上次检测的时间。</p>
     * @param LastCheckTime <p>上次检测的时间。</p>
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get <p>检测结果：<br>RESULT_FAILED: 未通过。<br>RESULT_PASSED: 通过。</p> 
     * @return CheckResult <p>检测结果：<br>RESULT_FAILED: 未通过。<br>RESULT_PASSED: 通过。</p>
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set <p>检测结果：<br>RESULT_FAILED: 未通过。<br>RESULT_PASSED: 通过。</p>
     * @param CheckResult <p>检测结果：<br>RESULT_FAILED: 未通过。<br>RESULT_PASSED: 通过。</p>
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get <p>主机节点的实例id</p> 
     * @return InstanceId <p>主机节点的实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>主机节点的实例id</p>
     * @param InstanceId <p>主机节点的实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>镜像仓库信息</p> 
     * @return ImageRegistryInfo <p>镜像仓库信息</p>
     */
    public ImageRegistryInfo getImageRegistryInfo() {
        return this.ImageRegistryInfo;
    }

    /**
     * Set <p>镜像仓库信息</p>
     * @param ImageRegistryInfo <p>镜像仓库信息</p>
     */
    public void setImageRegistryInfo(ImageRegistryInfo ImageRegistryInfo) {
        this.ImageRegistryInfo = ImageRegistryInfo;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterID <p>集群id</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterID <p>集群id</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>资产唯一ID</p><p>默认值：-</p> 
     * @return AssetUniqueID <p>资产唯一ID</p><p>默认值：-</p>
     */
    public String getAssetUniqueID() {
        return this.AssetUniqueID;
    }

    /**
     * Set <p>资产唯一ID</p><p>默认值：-</p>
     * @param AssetUniqueID <p>资产唯一ID</p><p>默认值：-</p>
     */
    public void setAssetUniqueID(String AssetUniqueID) {
        this.AssetUniqueID = AssetUniqueID;
    }

    public ComplianceAssetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAssetInfo(ComplianceAssetInfo source) {
        if (source.CustomerAssetId != null) {
            this.CustomerAssetId = new Long(source.CustomerAssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.PassedPolicyItemCount != null) {
            this.PassedPolicyItemCount = new Long(source.PassedPolicyItemCount);
        }
        if (source.FailedPolicyItemCount != null) {
            this.FailedPolicyItemCount = new Long(source.FailedPolicyItemCount);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new String(source.CheckResult);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ImageRegistryInfo != null) {
            this.ImageRegistryInfo = new ImageRegistryInfo(source.ImageRegistryInfo);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AssetUniqueID != null) {
            this.AssetUniqueID = new String(source.AssetUniqueID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetId", this.CustomerAssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "PassedPolicyItemCount", this.PassedPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedPolicyItemCount", this.FailedPolicyItemCount);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "ImageRegistryInfo.", this.ImageRegistryInfo);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AssetUniqueID", this.AssetUniqueID);

    }
}

