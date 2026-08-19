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

public class CreateEDRManualScanRequest extends AbstractModel {

    /**
    * <p>资产选择方式：all-全部资产/tag-按标签选择(仅主机)/direct-直接选择</p>
    */
    @SerializedName("AssetSelectionType")
    @Expose
    private String AssetSelectionType;

    /**
    * <p>检测模式：full-全盘检测/quick-快速检测/include-仅检测指定路径/exclude-排除指定路径</p>
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>直接选择的主机列表（AssetSelectionType=direct或all时使用）</p>
    */
    @SerializedName("InstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] InstanceIDsWithAppId;

    /**
    * <p>剔除的主机列表（AssetSelectionType=all时使用）</p>
    */
    @SerializedName("ExcludeInstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId;

    /**
    * <p>主机对应的标签ID</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * <p>直接选择的集群列表</p>
    */
    @SerializedName("ClusterIDsWithAppId")
    @Expose
    private ClusterWithAppIdItem [] ClusterIDsWithAppId;

    /**
    * <p>剔除的集群列表（AssetSelectionType=all时使用）</p>
    */
    @SerializedName("ExcludeClusterIDsWithAppId")
    @Expose
    private ClusterWithAppIdItem [] ExcludeClusterIDsWithAppId;

    /**
    * <p>自选路径列表（ScanType=include或exclude时必填，最多100条）</p>
    */
    @SerializedName("CustomPaths")
    @Expose
    private String [] CustomPaths;

    /**
    * <p>超时时间（秒），上限7200</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>是否开启深度检测：0-否/1-是</p>
    */
    @SerializedName("EnableMemShellScan")
    @Expose
    private Long EnableMemShellScan;

    /**
     * Get <p>资产选择方式：all-全部资产/tag-按标签选择(仅主机)/direct-直接选择</p> 
     * @return AssetSelectionType <p>资产选择方式：all-全部资产/tag-按标签选择(仅主机)/direct-直接选择</p>
     */
    public String getAssetSelectionType() {
        return this.AssetSelectionType;
    }

    /**
     * Set <p>资产选择方式：all-全部资产/tag-按标签选择(仅主机)/direct-直接选择</p>
     * @param AssetSelectionType <p>资产选择方式：all-全部资产/tag-按标签选择(仅主机)/direct-直接选择</p>
     */
    public void setAssetSelectionType(String AssetSelectionType) {
        this.AssetSelectionType = AssetSelectionType;
    }

    /**
     * Get <p>检测模式：full-全盘检测/quick-快速检测/include-仅检测指定路径/exclude-排除指定路径</p> 
     * @return ScanType <p>检测模式：full-全盘检测/quick-快速检测/include-仅检测指定路径/exclude-排除指定路径</p>
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set <p>检测模式：full-全盘检测/quick-快速检测/include-仅检测指定路径/exclude-排除指定路径</p>
     * @param ScanType <p>检测模式：full-全盘检测/quick-快速检测/include-仅检测指定路径/exclude-排除指定路径</p>
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>直接选择的主机列表（AssetSelectionType=direct或all时使用）</p> 
     * @return InstanceIDsWithAppId <p>直接选择的主机列表（AssetSelectionType=direct或all时使用）</p>
     */
    public InstanceIDWithAppIdItem [] getInstanceIDsWithAppId() {
        return this.InstanceIDsWithAppId;
    }

    /**
     * Set <p>直接选择的主机列表（AssetSelectionType=direct或all时使用）</p>
     * @param InstanceIDsWithAppId <p>直接选择的主机列表（AssetSelectionType=direct或all时使用）</p>
     */
    public void setInstanceIDsWithAppId(InstanceIDWithAppIdItem [] InstanceIDsWithAppId) {
        this.InstanceIDsWithAppId = InstanceIDsWithAppId;
    }

    /**
     * Get <p>剔除的主机列表（AssetSelectionType=all时使用）</p> 
     * @return ExcludeInstanceIDsWithAppId <p>剔除的主机列表（AssetSelectionType=all时使用）</p>
     */
    public InstanceIDWithAppIdItem [] getExcludeInstanceIDsWithAppId() {
        return this.ExcludeInstanceIDsWithAppId;
    }

    /**
     * Set <p>剔除的主机列表（AssetSelectionType=all时使用）</p>
     * @param ExcludeInstanceIDsWithAppId <p>剔除的主机列表（AssetSelectionType=all时使用）</p>
     */
    public void setExcludeInstanceIDsWithAppId(InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId) {
        this.ExcludeInstanceIDsWithAppId = ExcludeInstanceIDsWithAppId;
    }

    /**
     * Get <p>主机对应的标签ID</p> 
     * @return TagIds <p>主机对应的标签ID</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>主机对应的标签ID</p>
     * @param TagIds <p>主机对应的标签ID</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>直接选择的集群列表</p> 
     * @return ClusterIDsWithAppId <p>直接选择的集群列表</p>
     */
    public ClusterWithAppIdItem [] getClusterIDsWithAppId() {
        return this.ClusterIDsWithAppId;
    }

    /**
     * Set <p>直接选择的集群列表</p>
     * @param ClusterIDsWithAppId <p>直接选择的集群列表</p>
     */
    public void setClusterIDsWithAppId(ClusterWithAppIdItem [] ClusterIDsWithAppId) {
        this.ClusterIDsWithAppId = ClusterIDsWithAppId;
    }

    /**
     * Get <p>剔除的集群列表（AssetSelectionType=all时使用）</p> 
     * @return ExcludeClusterIDsWithAppId <p>剔除的集群列表（AssetSelectionType=all时使用）</p>
     */
    public ClusterWithAppIdItem [] getExcludeClusterIDsWithAppId() {
        return this.ExcludeClusterIDsWithAppId;
    }

    /**
     * Set <p>剔除的集群列表（AssetSelectionType=all时使用）</p>
     * @param ExcludeClusterIDsWithAppId <p>剔除的集群列表（AssetSelectionType=all时使用）</p>
     */
    public void setExcludeClusterIDsWithAppId(ClusterWithAppIdItem [] ExcludeClusterIDsWithAppId) {
        this.ExcludeClusterIDsWithAppId = ExcludeClusterIDsWithAppId;
    }

    /**
     * Get <p>自选路径列表（ScanType=include或exclude时必填，最多100条）</p> 
     * @return CustomPaths <p>自选路径列表（ScanType=include或exclude时必填，最多100条）</p>
     */
    public String [] getCustomPaths() {
        return this.CustomPaths;
    }

    /**
     * Set <p>自选路径列表（ScanType=include或exclude时必填，最多100条）</p>
     * @param CustomPaths <p>自选路径列表（ScanType=include或exclude时必填，最多100条）</p>
     */
    public void setCustomPaths(String [] CustomPaths) {
        this.CustomPaths = CustomPaths;
    }

    /**
     * Get <p>超时时间（秒），上限7200</p> 
     * @return Timeout <p>超时时间（秒），上限7200</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间（秒），上限7200</p>
     * @param Timeout <p>超时时间（秒），上限7200</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>是否开启深度检测：0-否/1-是</p> 
     * @return EnableMemShellScan <p>是否开启深度检测：0-否/1-是</p>
     */
    public Long getEnableMemShellScan() {
        return this.EnableMemShellScan;
    }

    /**
     * Set <p>是否开启深度检测：0-否/1-是</p>
     * @param EnableMemShellScan <p>是否开启深度检测：0-否/1-是</p>
     */
    public void setEnableMemShellScan(Long EnableMemShellScan) {
        this.EnableMemShellScan = EnableMemShellScan;
    }

    public CreateEDRManualScanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEDRManualScanRequest(CreateEDRManualScanRequest source) {
        if (source.AssetSelectionType != null) {
            this.AssetSelectionType = new String(source.AssetSelectionType);
        }
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InstanceIDsWithAppId != null) {
            this.InstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.InstanceIDsWithAppId.length];
            for (int i = 0; i < source.InstanceIDsWithAppId.length; i++) {
                this.InstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.InstanceIDsWithAppId[i]);
            }
        }
        if (source.ExcludeInstanceIDsWithAppId != null) {
            this.ExcludeInstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.ExcludeInstanceIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeInstanceIDsWithAppId.length; i++) {
                this.ExcludeInstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.ExcludeInstanceIDsWithAppId[i]);
            }
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
        if (source.ClusterIDsWithAppId != null) {
            this.ClusterIDsWithAppId = new ClusterWithAppIdItem[source.ClusterIDsWithAppId.length];
            for (int i = 0; i < source.ClusterIDsWithAppId.length; i++) {
                this.ClusterIDsWithAppId[i] = new ClusterWithAppIdItem(source.ClusterIDsWithAppId[i]);
            }
        }
        if (source.ExcludeClusterIDsWithAppId != null) {
            this.ExcludeClusterIDsWithAppId = new ClusterWithAppIdItem[source.ExcludeClusterIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeClusterIDsWithAppId.length; i++) {
                this.ExcludeClusterIDsWithAppId[i] = new ClusterWithAppIdItem(source.ExcludeClusterIDsWithAppId[i]);
            }
        }
        if (source.CustomPaths != null) {
            this.CustomPaths = new String[source.CustomPaths.length];
            for (int i = 0; i < source.CustomPaths.length; i++) {
                this.CustomPaths[i] = new String(source.CustomPaths[i]);
            }
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.EnableMemShellScan != null) {
            this.EnableMemShellScan = new Long(source.EnableMemShellScan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetSelectionType", this.AssetSelectionType);
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArrayObj(map, prefix + "ClusterIDsWithAppId.", this.ClusterIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeClusterIDsWithAppId.", this.ExcludeClusterIDsWithAppId);
        this.setParamArraySimple(map, prefix + "CustomPaths.", this.CustomPaths);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "EnableMemShellScan", this.EnableMemShellScan);

    }
}

