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

public class ComplianceAffectedAsset extends AbstractModel{

    /**
    * 为客户分配的唯一的资产项的ID。
    */
    @SerializedName("CustomerAssetId")
    @Expose
    private Long CustomerAssetId;

    /**
    * 资产项的名称。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 资产项的类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

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
    * 节点名称。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 上次检测的时间，格式为”YYYY-MM-DD HH:m::SS“。

如果没有检测过，此处为”0000-00-00 00:00:00“。
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * 检测结果。取值为：

RESULT_FAILED: 未通过

RESULT_PASSED: 通过
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * 主机IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 镜像的tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
     * Get 为客户分配的唯一的资产项的ID。 
     * @return CustomerAssetId 为客户分配的唯一的资产项的ID。
     */
    public Long getCustomerAssetId() {
        return this.CustomerAssetId;
    }

    /**
     * Set 为客户分配的唯一的资产项的ID。
     * @param CustomerAssetId 为客户分配的唯一的资产项的ID。
     */
    public void setCustomerAssetId(Long CustomerAssetId) {
        this.CustomerAssetId = CustomerAssetId;
    }

    /**
     * Get 资产项的名称。 
     * @return AssetName 资产项的名称。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产项的名称。
     * @param AssetName 资产项的名称。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 资产项的类型 
     * @return AssetType 资产项的类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产项的类型
     * @param AssetType 资产项的类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
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
     * Get 节点名称。 
     * @return NodeName 节点名称。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称。
     * @param NodeName 节点名称。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 上次检测的时间，格式为”YYYY-MM-DD HH:m::SS“。

如果没有检测过，此处为”0000-00-00 00:00:00“。 
     * @return LastCheckTime 上次检测的时间，格式为”YYYY-MM-DD HH:m::SS“。

如果没有检测过，此处为”0000-00-00 00:00:00“。
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 上次检测的时间，格式为”YYYY-MM-DD HH:m::SS“。

如果没有检测过，此处为”0000-00-00 00:00:00“。
     * @param LastCheckTime 上次检测的时间，格式为”YYYY-MM-DD HH:m::SS“。

如果没有检测过，此处为”0000-00-00 00:00:00“。
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get 检测结果。取值为：

RESULT_FAILED: 未通过

RESULT_PASSED: 通过 
     * @return CheckResult 检测结果。取值为：

RESULT_FAILED: 未通过

RESULT_PASSED: 通过
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set 检测结果。取值为：

RESULT_FAILED: 未通过

RESULT_PASSED: 通过
     * @param CheckResult 检测结果。取值为：

RESULT_FAILED: 未通过

RESULT_PASSED: 通过
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get 主机IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIP 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIP 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 镜像的tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageTag 镜像的tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 镜像的tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageTag 镜像的tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    public ComplianceAffectedAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAffectedAsset(ComplianceAffectedAsset source) {
        if (source.CustomerAssetId != null) {
            this.CustomerAssetId = new Long(source.CustomerAssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new String(source.CheckResult);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetId", this.CustomerAssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);

    }
}

