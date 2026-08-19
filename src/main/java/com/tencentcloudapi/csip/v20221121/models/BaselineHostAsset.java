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

public class BaselineHostAsset extends AbstractModel {

    /**
    * <p>云主机实例 ID，格式形如 ins-instanceid。</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>CWP（云镜）侧主机唯一标识 QUUID。</p>
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * <p>主机 Agent 上报的 UUID。</p>
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * <p>主机公网 IP。</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>主机内网 IP。</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>CWP Agent 状态。取值：</p><ul><li>ONLINE：在线</li><li>OFFLINE：离线</li><li>UNINSTALLED：未安装</li></ul>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>云主机实例运行状态。取值：</p><ul><li>RUNNING：运行中</li><li>STOPPED：已停止</li><li>UNKNOWN：未知</li></ul>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>主机名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>主机所属租户 Appid。</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>CSIP 内部资产标签列表。</p>
    */
    @SerializedName("TagItem")
    @Expose
    private MiniTagItem [] TagItem;

    /**
    * <p>云上原生资产标签（Tag）列表。</p>
    */
    @SerializedName("CloudTag")
    @Expose
    private Tag [] CloudTag;

    /**
    * <p>主机所在地域信息。</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>主机操作系统信息（含发行版与版本号）。</p>
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * <p>主机防护版本。取值：NONE（未防护）、BASIC（基础版）、PRO（专业版）、ULTIMATE（旗舰版）、PRO_LH（轻量版）。</p>
    */
    @SerializedName("ProtectVersion")
    @Expose
    private String ProtectVersion;

    /**
     * Get <p>云主机实例 ID，格式形如 ins-instanceid。</p> 
     * @return InstanceID <p>云主机实例 ID，格式形如 ins-instanceid。</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>云主机实例 ID，格式形如 ins-instanceid。</p>
     * @param InstanceID <p>云主机实例 ID，格式形如 ins-instanceid。</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>CWP（云镜）侧主机唯一标识 QUUID。</p> 
     * @return QUUID <p>CWP（云镜）侧主机唯一标识 QUUID。</p>
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set <p>CWP（云镜）侧主机唯一标识 QUUID。</p>
     * @param QUUID <p>CWP（云镜）侧主机唯一标识 QUUID。</p>
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get <p>主机 Agent 上报的 UUID。</p> 
     * @return UUID <p>主机 Agent 上报的 UUID。</p>
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set <p>主机 Agent 上报的 UUID。</p>
     * @param UUID <p>主机 Agent 上报的 UUID。</p>
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get <p>主机公网 IP。</p> 
     * @return PublicIP <p>主机公网 IP。</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>主机公网 IP。</p>
     * @param PublicIP <p>主机公网 IP。</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>主机内网 IP。</p> 
     * @return PrivateIP <p>主机内网 IP。</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>主机内网 IP。</p>
     * @param PrivateIP <p>主机内网 IP。</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>CWP Agent 状态。取值：</p><ul><li>ONLINE：在线</li><li>OFFLINE：离线</li><li>UNINSTALLED：未安装</li></ul> 
     * @return AgentStatus <p>CWP Agent 状态。取值：</p><ul><li>ONLINE：在线</li><li>OFFLINE：离线</li><li>UNINSTALLED：未安装</li></ul>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>CWP Agent 状态。取值：</p><ul><li>ONLINE：在线</li><li>OFFLINE：离线</li><li>UNINSTALLED：未安装</li></ul>
     * @param AgentStatus <p>CWP Agent 状态。取值：</p><ul><li>ONLINE：在线</li><li>OFFLINE：离线</li><li>UNINSTALLED：未安装</li></ul>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>云主机实例运行状态。取值：</p><ul><li>RUNNING：运行中</li><li>STOPPED：已停止</li><li>UNKNOWN：未知</li></ul> 
     * @return InstanceStatus <p>云主机实例运行状态。取值：</p><ul><li>RUNNING：运行中</li><li>STOPPED：已停止</li><li>UNKNOWN：未知</li></ul>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>云主机实例运行状态。取值：</p><ul><li>RUNNING：运行中</li><li>STOPPED：已停止</li><li>UNKNOWN：未知</li></ul>
     * @param InstanceStatus <p>云主机实例运行状态。取值：</p><ul><li>RUNNING：运行中</li><li>STOPPED：已停止</li><li>UNKNOWN：未知</li></ul>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>主机名称。</p> 
     * @return Name <p>主机名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>主机名称。</p>
     * @param Name <p>主机名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>主机所属租户 Appid。</p> 
     * @return Appid <p>主机所属租户 Appid。</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>主机所属租户 Appid。</p>
     * @param Appid <p>主机所属租户 Appid。</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>CSIP 内部资产标签列表。</p> 
     * @return TagItem <p>CSIP 内部资产标签列表。</p>
     */
    public MiniTagItem [] getTagItem() {
        return this.TagItem;
    }

    /**
     * Set <p>CSIP 内部资产标签列表。</p>
     * @param TagItem <p>CSIP 内部资产标签列表。</p>
     */
    public void setTagItem(MiniTagItem [] TagItem) {
        this.TagItem = TagItem;
    }

    /**
     * Get <p>云上原生资产标签（Tag）列表。</p> 
     * @return CloudTag <p>云上原生资产标签（Tag）列表。</p>
     */
    public Tag [] getCloudTag() {
        return this.CloudTag;
    }

    /**
     * Set <p>云上原生资产标签（Tag）列表。</p>
     * @param CloudTag <p>云上原生资产标签（Tag）列表。</p>
     */
    public void setCloudTag(Tag [] CloudTag) {
        this.CloudTag = CloudTag;
    }

    /**
     * Get <p>主机所在地域信息。</p> 
     * @return RegionInfo <p>主机所在地域信息。</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>主机所在地域信息。</p>
     * @param RegionInfo <p>主机所在地域信息。</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>主机操作系统信息（含发行版与版本号）。</p> 
     * @return OsInfo <p>主机操作系统信息（含发行版与版本号）。</p>
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set <p>主机操作系统信息（含发行版与版本号）。</p>
     * @param OsInfo <p>主机操作系统信息（含发行版与版本号）。</p>
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get <p>主机防护版本。取值：NONE（未防护）、BASIC（基础版）、PRO（专业版）、ULTIMATE（旗舰版）、PRO_LH（轻量版）。</p> 
     * @return ProtectVersion <p>主机防护版本。取值：NONE（未防护）、BASIC（基础版）、PRO（专业版）、ULTIMATE（旗舰版）、PRO_LH（轻量版）。</p>
     */
    public String getProtectVersion() {
        return this.ProtectVersion;
    }

    /**
     * Set <p>主机防护版本。取值：NONE（未防护）、BASIC（基础版）、PRO（专业版）、ULTIMATE（旗舰版）、PRO_LH（轻量版）。</p>
     * @param ProtectVersion <p>主机防护版本。取值：NONE（未防护）、BASIC（基础版）、PRO（专业版）、ULTIMATE（旗舰版）、PRO_LH（轻量版）。</p>
     */
    public void setProtectVersion(String ProtectVersion) {
        this.ProtectVersion = ProtectVersion;
    }

    public BaselineHostAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineHostAsset(BaselineHostAsset source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.TagItem != null) {
            this.TagItem = new MiniTagItem[source.TagItem.length];
            for (int i = 0; i < source.TagItem.length; i++) {
                this.TagItem[i] = new MiniTagItem(source.TagItem[i]);
            }
        }
        if (source.CloudTag != null) {
            this.CloudTag = new Tag[source.CloudTag.length];
            for (int i = 0; i < source.CloudTag.length; i++) {
                this.CloudTag[i] = new Tag(source.CloudTag[i]);
            }
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.ProtectVersion != null) {
            this.ProtectVersion = new String(source.ProtectVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamArrayObj(map, prefix + "TagItem.", this.TagItem);
        this.setParamArrayObj(map, prefix + "CloudTag.", this.CloudTag);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "ProtectVersion", this.ProtectVersion);

    }
}

