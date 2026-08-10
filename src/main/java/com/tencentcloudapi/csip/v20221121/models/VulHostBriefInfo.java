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

public class VulHostBriefInfo extends AbstractModel {

    /**
    * <p>云主机实例 ID<br>参数格式：形如 ins-xxxxxxxx</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>主机名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>公网 IP 地址</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>内网 IP 地址</p>
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * <p>防护版本<br>枚举值：<br>NONE：无防护<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版<br>PRO_LH：轻量版</p>
    */
    @SerializedName("DefendVersion")
    @Expose
    private String DefendVersion;

    /**
    * <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>所属账号信息</p>
    */
    @SerializedName("Account")
    @Expose
    private AccountBriefInfo Account;

    /**
    * <p>云主机实例状态<br>枚举值：<br>RUNNING：运行中<br>STOPPED：已停止<br>UNKNOWN：未知</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>修复状态枚举值</p><p>枚举值：</p><ul><li>PENDING： 待修复</li><li>SCANNING： 扫描中</li><li>FIXED： 已修复</li><li>IGNORED： 已忽略</li><li>FIXING： 修复中</li><li>FIX_FAILED： 修复失败</li><li>NEED_REBOOT： 修复待重启</li></ul>
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * <p>VPR 评级信息（含评级结果与各维度详情）</p>
    */
    @SerializedName("VPRRating")
    @Expose
    private VPRRatingInfo VPRRating;

    /**
    * <p>CWP Agent 状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线<br>UNINSTALLED：未安装</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>资产标签列表（CSIP 内部资产标签）</p>
    */
    @SerializedName("TagItem")
    @Expose
    private MiniTagItem [] TagItem;

    /**
    * <p>云上标签列表（云资产侧 Tag）</p>
    */
    @SerializedName("CloudTag")
    @Expose
    private Tag [] CloudTag;

    /**
     * Get <p>云主机实例 ID<br>参数格式：形如 ins-xxxxxxxx</p> 
     * @return InstanceID <p>云主机实例 ID<br>参数格式：形如 ins-xxxxxxxx</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>云主机实例 ID<br>参数格式：形如 ins-xxxxxxxx</p>
     * @param InstanceID <p>云主机实例 ID<br>参数格式：形如 ins-xxxxxxxx</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>主机名称</p> 
     * @return Name <p>主机名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>主机名称</p>
     * @param Name <p>主机名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>公网 IP 地址</p> 
     * @return PublicIP <p>公网 IP 地址</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>公网 IP 地址</p>
     * @param PublicIP <p>公网 IP 地址</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>内网 IP 地址</p> 
     * @return PrivateIP <p>内网 IP 地址</p>
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set <p>内网 IP 地址</p>
     * @param PrivateIP <p>内网 IP 地址</p>
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get <p>防护版本<br>枚举值：<br>NONE：无防护<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版<br>PRO_LH：轻量版</p> 
     * @return DefendVersion <p>防护版本<br>枚举值：<br>NONE：无防护<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版<br>PRO_LH：轻量版</p>
     */
    public String getDefendVersion() {
        return this.DefendVersion;
    }

    /**
     * Set <p>防护版本<br>枚举值：<br>NONE：无防护<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版<br>PRO_LH：轻量版</p>
     * @param DefendVersion <p>防护版本<br>枚举值：<br>NONE：无防护<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版<br>PRO_LH：轻量版</p>
     */
    public void setDefendVersion(String DefendVersion) {
        this.DefendVersion = DefendVersion;
    }

    /**
     * Get <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p> 
     * @return DefendStatus <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p>
     * @param DefendStatus <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>所属账号信息</p> 
     * @return Account <p>所属账号信息</p>
     */
    public AccountBriefInfo getAccount() {
        return this.Account;
    }

    /**
     * Set <p>所属账号信息</p>
     * @param Account <p>所属账号信息</p>
     */
    public void setAccount(AccountBriefInfo Account) {
        this.Account = Account;
    }

    /**
     * Get <p>云主机实例状态<br>枚举值：<br>RUNNING：运行中<br>STOPPED：已停止<br>UNKNOWN：未知</p> 
     * @return InstanceStatus <p>云主机实例状态<br>枚举值：<br>RUNNING：运行中<br>STOPPED：已停止<br>UNKNOWN：未知</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>云主机实例状态<br>枚举值：<br>RUNNING：运行中<br>STOPPED：已停止<br>UNKNOWN：未知</p>
     * @param InstanceStatus <p>云主机实例状态<br>枚举值：<br>RUNNING：运行中<br>STOPPED：已停止<br>UNKNOWN：未知</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>修复状态枚举值</p><p>枚举值：</p><ul><li>PENDING： 待修复</li><li>SCANNING： 扫描中</li><li>FIXED： 已修复</li><li>IGNORED： 已忽略</li><li>FIXING： 修复中</li><li>FIX_FAILED： 修复失败</li><li>NEED_REBOOT： 修复待重启</li></ul> 
     * @return RiskStatus <p>修复状态枚举值</p><p>枚举值：</p><ul><li>PENDING： 待修复</li><li>SCANNING： 扫描中</li><li>FIXED： 已修复</li><li>IGNORED： 已忽略</li><li>FIXING： 修复中</li><li>FIX_FAILED： 修复失败</li><li>NEED_REBOOT： 修复待重启</li></ul>
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set <p>修复状态枚举值</p><p>枚举值：</p><ul><li>PENDING： 待修复</li><li>SCANNING： 扫描中</li><li>FIXED： 已修复</li><li>IGNORED： 已忽略</li><li>FIXING： 修复中</li><li>FIX_FAILED： 修复失败</li><li>NEED_REBOOT： 修复待重启</li></ul>
     * @param RiskStatus <p>修复状态枚举值</p><p>枚举值：</p><ul><li>PENDING： 待修复</li><li>SCANNING： 扫描中</li><li>FIXED： 已修复</li><li>IGNORED： 已忽略</li><li>FIXING： 修复中</li><li>FIX_FAILED： 修复失败</li><li>NEED_REBOOT： 修复待重启</li></ul>
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get <p>VPR 评级信息（含评级结果与各维度详情）</p> 
     * @return VPRRating <p>VPR 评级信息（含评级结果与各维度详情）</p>
     */
    public VPRRatingInfo getVPRRating() {
        return this.VPRRating;
    }

    /**
     * Set <p>VPR 评级信息（含评级结果与各维度详情）</p>
     * @param VPRRating <p>VPR 评级信息（含评级结果与各维度详情）</p>
     */
    public void setVPRRating(VPRRatingInfo VPRRating) {
        this.VPRRating = VPRRating;
    }

    /**
     * Get <p>CWP Agent 状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线<br>UNINSTALLED：未安装</p> 
     * @return AgentStatus <p>CWP Agent 状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线<br>UNINSTALLED：未安装</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>CWP Agent 状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线<br>UNINSTALLED：未安装</p>
     * @param AgentStatus <p>CWP Agent 状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线<br>UNINSTALLED：未安装</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>资产标签列表（CSIP 内部资产标签）</p> 
     * @return TagItem <p>资产标签列表（CSIP 内部资产标签）</p>
     */
    public MiniTagItem [] getTagItem() {
        return this.TagItem;
    }

    /**
     * Set <p>资产标签列表（CSIP 内部资产标签）</p>
     * @param TagItem <p>资产标签列表（CSIP 内部资产标签）</p>
     */
    public void setTagItem(MiniTagItem [] TagItem) {
        this.TagItem = TagItem;
    }

    /**
     * Get <p>云上标签列表（云资产侧 Tag）</p> 
     * @return CloudTag <p>云上标签列表（云资产侧 Tag）</p>
     */
    public Tag [] getCloudTag() {
        return this.CloudTag;
    }

    /**
     * Set <p>云上标签列表（云资产侧 Tag）</p>
     * @param CloudTag <p>云上标签列表（云资产侧 Tag）</p>
     */
    public void setCloudTag(Tag [] CloudTag) {
        this.CloudTag = CloudTag;
    }

    public VulHostBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulHostBriefInfo(VulHostBriefInfo source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.DefendVersion != null) {
            this.DefendVersion = new String(source.DefendVersion);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.Account != null) {
            this.Account = new AccountBriefInfo(source.Account);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.VPRRating != null) {
            this.VPRRating = new VPRRatingInfo(source.VPRRating);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "DefendVersion", this.DefendVersion);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamObj(map, prefix + "VPRRating.", this.VPRRating);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamArrayObj(map, prefix + "TagItem.", this.TagItem);
        this.setParamArrayObj(map, prefix + "CloudTag.", this.CloudTag);

    }
}

