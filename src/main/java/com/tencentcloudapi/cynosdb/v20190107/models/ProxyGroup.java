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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroup extends AbstractModel{

    /**
    * 数据库代理组ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 数据库代理组节点个数
    */
    @SerializedName("ProxyNodeCount")
    @Expose
    private Long ProxyNodeCount;

    /**
    * 数据库代理组状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 当前代理版本
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 读写节点开通数据库代理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
     * Get 数据库代理组ID 
     * @return ProxyGroupId 数据库代理组ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 数据库代理组ID
     * @param ProxyGroupId 数据库代理组ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 数据库代理组节点个数 
     * @return ProxyNodeCount 数据库代理组节点个数
     */
    public Long getProxyNodeCount() {
        return this.ProxyNodeCount;
    }

    /**
     * Set 数据库代理组节点个数
     * @param ProxyNodeCount 数据库代理组节点个数
     */
    public void setProxyNodeCount(Long ProxyNodeCount) {
        this.ProxyNodeCount = ProxyNodeCount;
    }

    /**
     * Get 数据库代理组状态 
     * @return Status 数据库代理组状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 数据库代理组状态
     * @param Status 数据库代理组状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 当前代理版本 
     * @return CurrentProxyVersion 当前代理版本
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set 当前代理版本
     * @param CurrentProxyVersion 当前代理版本
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 用户AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 读写节点开通数据库代理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenRw 读写节点开通数据库代理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set 读写节点开通数据库代理
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenRw 读写节点开通数据库代理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    public ProxyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroup(ProxyGroup source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyNodeCount != null) {
            this.ProxyNodeCount = new Long(source.ProxyNodeCount);
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
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OpenRw != null) {
            this.OpenRw = new String(source.OpenRw);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyNodeCount", this.ProxyNodeCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OpenRw", this.OpenRw);

    }
}

