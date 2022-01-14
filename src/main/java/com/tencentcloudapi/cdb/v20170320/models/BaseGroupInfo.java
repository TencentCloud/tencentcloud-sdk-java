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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseGroupInfo extends AbstractModel{

    /**
    * 代理组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 代理节点数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 状态：发货中（init）运行中（online）下线中（offline）销毁中（destroy）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 是否开启读写分离
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenRW")
    @Expose
    private Boolean OpenRW;

    /**
    * 当前代理版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * 支持升级版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportUpgradeProxyVersion")
    @Expose
    private String SupportUpgradeProxyVersion;

    /**
     * Get 代理组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyGroupId 代理组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 代理组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyGroupId 代理组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 代理节点数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeCount 代理节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 代理节点数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeCount 代理节点数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 状态：发货中（init）运行中（online）下线中（offline）销毁中（destroy）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态：发货中（init）运行中（online）下线中（offline）销毁中（destroy）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：发货中（init）运行中（online）下线中（offline）销毁中（destroy）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态：发货中（init）运行中（online）下线中（offline）销毁中（destroy）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 是否开启读写分离
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenRW 是否开启读写分离
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOpenRW() {
        return this.OpenRW;
    }

    /**
     * Set 是否开启读写分离
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenRW 是否开启读写分离
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenRW(Boolean OpenRW) {
        this.OpenRW = OpenRW;
    }

    /**
     * Get 当前代理版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentProxyVersion 当前代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set 当前代理版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentProxyVersion 当前代理版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get 支持升级版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportUpgradeProxyVersion 支持升级版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSupportUpgradeProxyVersion() {
        return this.SupportUpgradeProxyVersion;
    }

    /**
     * Set 支持升级版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportUpgradeProxyVersion 支持升级版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportUpgradeProxyVersion(String SupportUpgradeProxyVersion) {
        this.SupportUpgradeProxyVersion = SupportUpgradeProxyVersion;
    }

    public BaseGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseGroupInfo(BaseGroupInfo source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.OpenRW != null) {
            this.OpenRW = new Boolean(source.OpenRW);
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.SupportUpgradeProxyVersion != null) {
            this.SupportUpgradeProxyVersion = new String(source.SupportUpgradeProxyVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "OpenRW", this.OpenRW);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "SupportUpgradeProxyVersion", this.SupportUpgradeProxyVersion);

    }
}

