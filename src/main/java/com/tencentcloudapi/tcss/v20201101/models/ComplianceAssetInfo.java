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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceAssetInfo extends AbstractModel{

    /**
    * 客户资产的ID。
    */
    @SerializedName("CustomerAssetId")
    @Expose
    private Long CustomerAssetId;

    /**
    * 资产类别。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 资产的名称。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 当资产为镜像时，这个字段为镜像Tag。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 资产所在的主机IP。
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 资产所属的节点的名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 检测状态

CHECK_INIT, 待检测

CHECK_RUNNING, 检测中

CHECK_FINISHED, 检测完成

CHECK_FAILED, 检测失败
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * 此类资产通过的检测项的数目。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassedPolicyItemCount")
    @Expose
    private Long PassedPolicyItemCount;

    /**
    * 此类资产未通过的检测的数目。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedPolicyItemCount")
    @Expose
    private Long FailedPolicyItemCount;

    /**
    * 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * 检测结果：
RESULT_FAILED: 未通过。
RESULT_PASSED: 通过。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
     * Get 客户资产的ID。 
     * @return CustomerAssetId 客户资产的ID。
     */
    public Long getCustomerAssetId() {
        return this.CustomerAssetId;
    }

    /**
     * Set 客户资产的ID。
     * @param CustomerAssetId 客户资产的ID。
     */
    public void setCustomerAssetId(Long CustomerAssetId) {
        this.CustomerAssetId = CustomerAssetId;
    }

    /**
     * Get 资产类别。 
     * @return AssetType 资产类别。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类别。
     * @param AssetType 资产类别。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 资产的名称。 
     * @return AssetName 资产的名称。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产的名称。
     * @param AssetName 资产的名称。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 当资产为镜像时，这个字段为镜像Tag。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageTag 当资产为镜像时，这个字段为镜像Tag。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 当资产为镜像时，这个字段为镜像Tag。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageTag 当资产为镜像时，这个字段为镜像Tag。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 资产所在的主机IP。 
     * @return HostIP 资产所在的主机IP。
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 资产所在的主机IP。
     * @param HostIP 资产所在的主机IP。
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 资产所属的节点的名称 
     * @return NodeName 资产所属的节点的名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 资产所属的节点的名称
     * @param NodeName 资产所属的节点的名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 检测状态

CHECK_INIT, 待检测

CHECK_RUNNING, 检测中

CHECK_FINISHED, 检测完成

CHECK_FAILED, 检测失败 
     * @return CheckStatus 检测状态

CHECK_INIT, 待检测

CHECK_RUNNING, 检测中

CHECK_FINISHED, 检测完成

CHECK_FAILED, 检测失败
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 检测状态

CHECK_INIT, 待检测

CHECK_RUNNING, 检测中

CHECK_FINISHED, 检测完成

CHECK_FAILED, 检测失败
     * @param CheckStatus 检测状态

CHECK_INIT, 待检测

CHECK_RUNNING, 检测中

CHECK_FINISHED, 检测完成

CHECK_FAILED, 检测失败
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 此类资产通过的检测项的数目。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassedPolicyItemCount 此类资产通过的检测项的数目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPassedPolicyItemCount() {
        return this.PassedPolicyItemCount;
    }

    /**
     * Set 此类资产通过的检测项的数目。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassedPolicyItemCount 此类资产通过的检测项的数目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassedPolicyItemCount(Long PassedPolicyItemCount) {
        this.PassedPolicyItemCount = PassedPolicyItemCount;
    }

    /**
     * Get 此类资产未通过的检测的数目。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedPolicyItemCount 此类资产未通过的检测的数目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedPolicyItemCount() {
        return this.FailedPolicyItemCount;
    }

    /**
     * Set 此类资产未通过的检测的数目。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedPolicyItemCount 此类资产未通过的检测的数目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedPolicyItemCount(Long FailedPolicyItemCount) {
        this.FailedPolicyItemCount = FailedPolicyItemCount;
    }

    /**
     * Get 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastCheckTime 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastCheckTime 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get 检测结果：
RESULT_FAILED: 未通过。
RESULT_PASSED: 通过。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckResult 检测结果：
RESULT_FAILED: 未通过。
RESULT_PASSED: 通过。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set 检测结果：
RESULT_FAILED: 未通过。
RESULT_PASSED: 通过。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckResult 检测结果：
RESULT_FAILED: 未通过。
RESULT_PASSED: 通过。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
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

    }
}

