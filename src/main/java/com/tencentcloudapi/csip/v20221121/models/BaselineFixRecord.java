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

public class BaselineFixRecord extends AbstractModel {

    /**
    * <p>修复记录主键 ID。</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>租户 AppID。</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>被修复的检测项基础信息。</p>
    */
    @SerializedName("ItemInfo")
    @Expose
    private BaselineItem ItemInfo;

    /**
    * <p>本次修复涉及的主机资产信息，无数据时为 null。</p>
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
    * <p>资产类型：HOST（主机）、CLUSTER（容器集群）。</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>修复完成时间。</p>
    */
    @SerializedName("FixTime")
    @Expose
    private String FixTime;

    /**
    * <p>该风险首次被发现的时间。</p>
    */
    @SerializedName("DiscoveryTime")
    @Expose
    private String DiscoveryTime;

    /**
     * Get <p>修复记录主键 ID。</p> 
     * @return ID <p>修复记录主键 ID。</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>修复记录主键 ID。</p>
     * @param ID <p>修复记录主键 ID。</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>租户 AppID。</p> 
     * @return AppID <p>租户 AppID。</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>租户 AppID。</p>
     * @param AppID <p>租户 AppID。</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>被修复的检测项基础信息。</p> 
     * @return ItemInfo <p>被修复的检测项基础信息。</p>
     */
    public BaselineItem getItemInfo() {
        return this.ItemInfo;
    }

    /**
     * Set <p>被修复的检测项基础信息。</p>
     * @param ItemInfo <p>被修复的检测项基础信息。</p>
     */
    public void setItemInfo(BaselineItem ItemInfo) {
        this.ItemInfo = ItemInfo;
    }

    /**
     * Get <p>本次修复涉及的主机资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostInfo <p>本次修复涉及的主机资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineHostAsset getHostInfo() {
        return this.HostInfo;
    }

    /**
     * Set <p>本次修复涉及的主机资产信息，无数据时为 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostInfo <p>本次修复涉及的主机资产信息，无数据时为 null。</p>
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
     * Get <p>资产类型：HOST（主机）、CLUSTER（容器集群）。</p> 
     * @return AssetType <p>资产类型：HOST（主机）、CLUSTER（容器集群）。</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型：HOST（主机）、CLUSTER（容器集群）。</p>
     * @param AssetType <p>资产类型：HOST（主机）、CLUSTER（容器集群）。</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>修复完成时间。</p> 
     * @return FixTime <p>修复完成时间。</p>
     */
    public String getFixTime() {
        return this.FixTime;
    }

    /**
     * Set <p>修复完成时间。</p>
     * @param FixTime <p>修复完成时间。</p>
     */
    public void setFixTime(String FixTime) {
        this.FixTime = FixTime;
    }

    /**
     * Get <p>该风险首次被发现的时间。</p> 
     * @return DiscoveryTime <p>该风险首次被发现的时间。</p>
     */
    public String getDiscoveryTime() {
        return this.DiscoveryTime;
    }

    /**
     * Set <p>该风险首次被发现的时间。</p>
     * @param DiscoveryTime <p>该风险首次被发现的时间。</p>
     */
    public void setDiscoveryTime(String DiscoveryTime) {
        this.DiscoveryTime = DiscoveryTime;
    }

    public BaselineFixRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineFixRecord(BaselineFixRecord source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ItemInfo != null) {
            this.ItemInfo = new BaselineItem(source.ItemInfo);
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
        if (source.FixTime != null) {
            this.FixTime = new String(source.FixTime);
        }
        if (source.DiscoveryTime != null) {
            this.DiscoveryTime = new String(source.DiscoveryTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamObj(map, prefix + "ItemInfo.", this.ItemInfo);
        this.setParamObj(map, prefix + "HostInfo.", this.HostInfo);
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "FixTime", this.FixTime);
        this.setParamSimple(map, prefix + "DiscoveryTime", this.DiscoveryTime);

    }
}

