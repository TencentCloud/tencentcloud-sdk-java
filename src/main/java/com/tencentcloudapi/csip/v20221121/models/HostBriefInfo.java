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

public class HostBriefInfo extends AbstractModel {

    /**
    * 云主机实例 ID
参数格式：形如 ins-instance
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 主机 QUUID（CWP 内部唯一标识）
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * 主机 UUID
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 公网 IP 地址
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 内网 IP 地址
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * CWP Agent 状态
枚举值：
ONLINE：在线
OFFLINE：离线
UNINSTALLED：未安装
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * 云主机实例状态
枚举值：
RUNNING：运行中
STOPPED：已停止
UNKNOWN：未知
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 主机名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 所属账号信息
    */
    @SerializedName("Account")
    @Expose
    private AccountBriefInfo Account;

    /**
    * 资产标签列表（CSIP 内部资产标签）
    */
    @SerializedName("TagItem")
    @Expose
    private MiniTagItem [] TagItem;

    /**
    * 云上标签列表（云资产侧 Tag）
    */
    @SerializedName("CloudTag")
    @Expose
    private Tag [] CloudTag;

    /**
     * Get 云主机实例 ID
参数格式：形如 ins-instance 
     * @return InstanceID 云主机实例 ID
参数格式：形如 ins-instance
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 云主机实例 ID
参数格式：形如 ins-instance
     * @param InstanceID 云主机实例 ID
参数格式：形如 ins-instance
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 主机 QUUID（CWP 内部唯一标识） 
     * @return QUUID 主机 QUUID（CWP 内部唯一标识）
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set 主机 QUUID（CWP 内部唯一标识）
     * @param QUUID 主机 QUUID（CWP 内部唯一标识）
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get 主机 UUID 
     * @return UUID 主机 UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 主机 UUID
     * @param UUID 主机 UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 公网 IP 地址 
     * @return PublicIP 公网 IP 地址
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 公网 IP 地址
     * @param PublicIP 公网 IP 地址
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get 内网 IP 地址 
     * @return PrivateIP 内网 IP 地址
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set 内网 IP 地址
     * @param PrivateIP 内网 IP 地址
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get CWP Agent 状态
枚举值：
ONLINE：在线
OFFLINE：离线
UNINSTALLED：未安装 
     * @return AgentStatus CWP Agent 状态
枚举值：
ONLINE：在线
OFFLINE：离线
UNINSTALLED：未安装
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set CWP Agent 状态
枚举值：
ONLINE：在线
OFFLINE：离线
UNINSTALLED：未安装
     * @param AgentStatus CWP Agent 状态
枚举值：
ONLINE：在线
OFFLINE：离线
UNINSTALLED：未安装
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get 云主机实例状态
枚举值：
RUNNING：运行中
STOPPED：已停止
UNKNOWN：未知 
     * @return InstanceStatus 云主机实例状态
枚举值：
RUNNING：运行中
STOPPED：已停止
UNKNOWN：未知
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 云主机实例状态
枚举值：
RUNNING：运行中
STOPPED：已停止
UNKNOWN：未知
     * @param InstanceStatus 云主机实例状态
枚举值：
RUNNING：运行中
STOPPED：已停止
UNKNOWN：未知
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 主机名称 
     * @return Name 主机名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 主机名称
     * @param Name 主机名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 所属账号信息 
     * @return Account 所属账号信息
     */
    public AccountBriefInfo getAccount() {
        return this.Account;
    }

    /**
     * Set 所属账号信息
     * @param Account 所属账号信息
     */
    public void setAccount(AccountBriefInfo Account) {
        this.Account = Account;
    }

    /**
     * Get 资产标签列表（CSIP 内部资产标签） 
     * @return TagItem 资产标签列表（CSIP 内部资产标签）
     */
    public MiniTagItem [] getTagItem() {
        return this.TagItem;
    }

    /**
     * Set 资产标签列表（CSIP 内部资产标签）
     * @param TagItem 资产标签列表（CSIP 内部资产标签）
     */
    public void setTagItem(MiniTagItem [] TagItem) {
        this.TagItem = TagItem;
    }

    /**
     * Get 云上标签列表（云资产侧 Tag） 
     * @return CloudTag 云上标签列表（云资产侧 Tag）
     */
    public Tag [] getCloudTag() {
        return this.CloudTag;
    }

    /**
     * Set 云上标签列表（云资产侧 Tag）
     * @param CloudTag 云上标签列表（云资产侧 Tag）
     */
    public void setCloudTag(Tag [] CloudTag) {
        this.CloudTag = CloudTag;
    }

    public HostBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostBriefInfo(HostBriefInfo source) {
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
        if (source.Account != null) {
            this.Account = new AccountBriefInfo(source.Account);
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
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamArrayObj(map, prefix + "TagItem.", this.TagItem);
        this.setParamArrayObj(map, prefix + "CloudTag.", this.CloudTag);

    }
}

