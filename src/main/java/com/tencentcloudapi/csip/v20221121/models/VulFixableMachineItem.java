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

public class VulFixableMachineItem extends AbstractModel {

    /**
    * <p>漏洞ID列表，按 SupportAutoFix 维度分组：SupportAutoFix=1 时为可修复的漏洞ID，SupportAutoFix=0 时为不可修复的漏洞ID</p>
    */
    @SerializedName("VulIds")
    @Expose
    private Long [] VulIds;

    /**
    * <p>主机实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主机名称</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>主机IP</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>公网IP</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>操作系统类型<br>枚举值：<br>linux：Linux操作系统<br>windows：Windows操作系统</p>
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * <p>操作系统名称</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>主机在线状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线</p>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * <p>主机运行状态</p><p>枚举值：</p><ul><li>RUNNING： 运行中</li><li>STOPPED： 已停止</li><li>EXPIRED： 待回收</li></ul>
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * <p>是否支持自动修复<br>枚举值：<br>0：不支持<br>1：支持</p>
    */
    @SerializedName("SupportAutoFix")
    @Expose
    private Long SupportAutoFix;

    /**
    * <p>当前修复状态<br>枚举值：<br>0：未修复<br>1：修复中<br>2：修复失败<br>3：修复成功<br>4：修复超时</p>
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

    /**
    * <p>不可修复原因，SupportAutoFix为0时返回</p>
    */
    @SerializedName("NotFixableReason")
    @Expose
    private String NotFixableReason;

    /**
    * <p>不可修复原因码，SupportAutoFix为0时返回<br>枚举值：<br>BASIC_VERSION：基础版主机不支持一键修复<br>HOST_STOPPED：主机已关机<br>CLIENT_OFFLINE：主机防护客户端已离线<br>PATCH_UNAVAILABLE：官方已停止发布该系统版本的安全补丁<br>SOURCE_COMPILED：源码编译安装，不支持一键修复</p>
    */
    @SerializedName("NotFixableReasonCode")
    @Expose
    private String NotFixableReasonCode;

    /**
    * <p>不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回</p>
    */
    @SerializedName("NotFixableAction")
    @Expose
    private VulFixableMachineAction NotFixableAction;

    /**
    * <p>修复命令列表，SupportAutoFix为1时返回</p>
    */
    @SerializedName("FixCommands")
    @Expose
    private String [] FixCommands;

    /**
    * <p>关联组件列表</p>
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * <p>资产标签列表</p>
    */
    @SerializedName("TagItems")
    @Expose
    private MiniTagItem [] TagItems;

    /**
    * <p>所属账号AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>付费版本信息<br>枚举值：<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版</p>
    */
    @SerializedName("PayVersion")
    @Expose
    private String PayVersion;

    /**
     * Get <p>漏洞ID列表，按 SupportAutoFix 维度分组：SupportAutoFix=1 时为可修复的漏洞ID，SupportAutoFix=0 时为不可修复的漏洞ID</p> 
     * @return VulIds <p>漏洞ID列表，按 SupportAutoFix 维度分组：SupportAutoFix=1 时为可修复的漏洞ID，SupportAutoFix=0 时为不可修复的漏洞ID</p>
     */
    public Long [] getVulIds() {
        return this.VulIds;
    }

    /**
     * Set <p>漏洞ID列表，按 SupportAutoFix 维度分组：SupportAutoFix=1 时为可修复的漏洞ID，SupportAutoFix=0 时为不可修复的漏洞ID</p>
     * @param VulIds <p>漏洞ID列表，按 SupportAutoFix 维度分组：SupportAutoFix=1 时为可修复的漏洞ID，SupportAutoFix=0 时为不可修复的漏洞ID</p>
     */
    public void setVulIds(Long [] VulIds) {
        this.VulIds = VulIds;
    }

    /**
     * Get <p>主机实例ID</p> 
     * @return InstanceId <p>主机实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>主机实例ID</p>
     * @param InstanceId <p>主机实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主机名称</p> 
     * @return MachineName <p>主机名称</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>主机名称</p>
     * @param MachineName <p>主机名称</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>主机IP</p> 
     * @return MachineIp <p>主机IP</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>主机IP</p>
     * @param MachineIp <p>主机IP</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>公网IP</p> 
     * @return PublicIp <p>公网IP</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网IP</p>
     * @param PublicIp <p>公网IP</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>操作系统类型<br>枚举值：<br>linux：Linux操作系统<br>windows：Windows操作系统</p> 
     * @return OsType <p>操作系统类型<br>枚举值：<br>linux：Linux操作系统<br>windows：Windows操作系统</p>
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>操作系统类型<br>枚举值：<br>linux：Linux操作系统<br>windows：Windows操作系统</p>
     * @param OsType <p>操作系统类型<br>枚举值：<br>linux：Linux操作系统<br>windows：Windows操作系统</p>
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get <p>操作系统名称</p> 
     * @return OsName <p>操作系统名称</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>操作系统名称</p>
     * @param OsName <p>操作系统名称</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>主机在线状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线</p> 
     * @return MachineStatus <p>主机在线状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线</p>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set <p>主机在线状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线</p>
     * @param MachineStatus <p>主机在线状态<br>枚举值：<br>ONLINE：在线<br>OFFLINE：离线</p>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get <p>主机运行状态</p><p>枚举值：</p><ul><li>RUNNING： 运行中</li><li>STOPPED： 已停止</li><li>EXPIRED： 待回收</li></ul> 
     * @return HostStatus <p>主机运行状态</p><p>枚举值：</p><ul><li>RUNNING： 运行中</li><li>STOPPED： 已停止</li><li>EXPIRED： 待回收</li></ul>
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set <p>主机运行状态</p><p>枚举值：</p><ul><li>RUNNING： 运行中</li><li>STOPPED： 已停止</li><li>EXPIRED： 待回收</li></ul>
     * @param HostStatus <p>主机运行状态</p><p>枚举值：</p><ul><li>RUNNING： 运行中</li><li>STOPPED： 已停止</li><li>EXPIRED： 待回收</li></ul>
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
    }

    /**
     * Get <p>是否支持自动修复<br>枚举值：<br>0：不支持<br>1：支持</p> 
     * @return SupportAutoFix <p>是否支持自动修复<br>枚举值：<br>0：不支持<br>1：支持</p>
     */
    public Long getSupportAutoFix() {
        return this.SupportAutoFix;
    }

    /**
     * Set <p>是否支持自动修复<br>枚举值：<br>0：不支持<br>1：支持</p>
     * @param SupportAutoFix <p>是否支持自动修复<br>枚举值：<br>0：不支持<br>1：支持</p>
     */
    public void setSupportAutoFix(Long SupportAutoFix) {
        this.SupportAutoFix = SupportAutoFix;
    }

    /**
     * Get <p>当前修复状态<br>枚举值：<br>0：未修复<br>1：修复中<br>2：修复失败<br>3：修复成功<br>4：修复超时</p> 
     * @return FixStatus <p>当前修复状态<br>枚举值：<br>0：未修复<br>1：修复中<br>2：修复失败<br>3：修复成功<br>4：修复超时</p>
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set <p>当前修复状态<br>枚举值：<br>0：未修复<br>1：修复中<br>2：修复失败<br>3：修复成功<br>4：修复超时</p>
     * @param FixStatus <p>当前修复状态<br>枚举值：<br>0：未修复<br>1：修复中<br>2：修复失败<br>3：修复成功<br>4：修复超时</p>
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return LatestFixTime <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param LatestFixTime <p>最近一次修复时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
    }

    /**
     * Get <p>不可修复原因，SupportAutoFix为0时返回</p> 
     * @return NotFixableReason <p>不可修复原因，SupportAutoFix为0时返回</p>
     */
    public String getNotFixableReason() {
        return this.NotFixableReason;
    }

    /**
     * Set <p>不可修复原因，SupportAutoFix为0时返回</p>
     * @param NotFixableReason <p>不可修复原因，SupportAutoFix为0时返回</p>
     */
    public void setNotFixableReason(String NotFixableReason) {
        this.NotFixableReason = NotFixableReason;
    }

    /**
     * Get <p>不可修复原因码，SupportAutoFix为0时返回<br>枚举值：<br>BASIC_VERSION：基础版主机不支持一键修复<br>HOST_STOPPED：主机已关机<br>CLIENT_OFFLINE：主机防护客户端已离线<br>PATCH_UNAVAILABLE：官方已停止发布该系统版本的安全补丁<br>SOURCE_COMPILED：源码编译安装，不支持一键修复</p> 
     * @return NotFixableReasonCode <p>不可修复原因码，SupportAutoFix为0时返回<br>枚举值：<br>BASIC_VERSION：基础版主机不支持一键修复<br>HOST_STOPPED：主机已关机<br>CLIENT_OFFLINE：主机防护客户端已离线<br>PATCH_UNAVAILABLE：官方已停止发布该系统版本的安全补丁<br>SOURCE_COMPILED：源码编译安装，不支持一键修复</p>
     */
    public String getNotFixableReasonCode() {
        return this.NotFixableReasonCode;
    }

    /**
     * Set <p>不可修复原因码，SupportAutoFix为0时返回<br>枚举值：<br>BASIC_VERSION：基础版主机不支持一键修复<br>HOST_STOPPED：主机已关机<br>CLIENT_OFFLINE：主机防护客户端已离线<br>PATCH_UNAVAILABLE：官方已停止发布该系统版本的安全补丁<br>SOURCE_COMPILED：源码编译安装，不支持一键修复</p>
     * @param NotFixableReasonCode <p>不可修复原因码，SupportAutoFix为0时返回<br>枚举值：<br>BASIC_VERSION：基础版主机不支持一键修复<br>HOST_STOPPED：主机已关机<br>CLIENT_OFFLINE：主机防护客户端已离线<br>PATCH_UNAVAILABLE：官方已停止发布该系统版本的安全补丁<br>SOURCE_COMPILED：源码编译安装，不支持一键修复</p>
     */
    public void setNotFixableReasonCode(String NotFixableReasonCode) {
        this.NotFixableReasonCode = NotFixableReasonCode;
    }

    /**
     * Get <p>不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回</p> 
     * @return NotFixableAction <p>不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回</p>
     */
    public VulFixableMachineAction getNotFixableAction() {
        return this.NotFixableAction;
    }

    /**
     * Set <p>不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回</p>
     * @param NotFixableAction <p>不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回</p>
     */
    public void setNotFixableAction(VulFixableMachineAction NotFixableAction) {
        this.NotFixableAction = NotFixableAction;
    }

    /**
     * Get <p>修复命令列表，SupportAutoFix为1时返回</p> 
     * @return FixCommands <p>修复命令列表，SupportAutoFix为1时返回</p>
     */
    public String [] getFixCommands() {
        return this.FixCommands;
    }

    /**
     * Set <p>修复命令列表，SupportAutoFix为1时返回</p>
     * @param FixCommands <p>修复命令列表，SupportAutoFix为1时返回</p>
     */
    public void setFixCommands(String [] FixCommands) {
        this.FixCommands = FixCommands;
    }

    /**
     * Get <p>关联组件列表</p> 
     * @return Components <p>关联组件列表</p>
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>关联组件列表</p>
     * @param Components <p>关联组件列表</p>
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>资产标签列表</p> 
     * @return TagItems <p>资产标签列表</p>
     */
    public MiniTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>资产标签列表</p>
     * @param TagItems <p>资产标签列表</p>
     */
    public void setTagItems(MiniTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get <p>所属账号AppId</p> 
     * @return AppId <p>所属账号AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>所属账号AppId</p>
     * @param AppId <p>所属账号AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>付费版本信息<br>枚举值：<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版</p> 
     * @return PayVersion <p>付费版本信息<br>枚举值：<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版</p>
     */
    public String getPayVersion() {
        return this.PayVersion;
    }

    /**
     * Set <p>付费版本信息<br>枚举值：<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版</p>
     * @param PayVersion <p>付费版本信息<br>枚举值：<br>BASIC：基础版<br>PRO：专业版<br>ULTIMATE：旗舰版</p>
     */
    public void setPayVersion(String PayVersion) {
        this.PayVersion = PayVersion;
    }

    public VulFixableMachineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixableMachineItem(VulFixableMachineItem source) {
        if (source.VulIds != null) {
            this.VulIds = new Long[source.VulIds.length];
            for (int i = 0; i < source.VulIds.length; i++) {
                this.VulIds[i] = new Long(source.VulIds[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.HostStatus != null) {
            this.HostStatus = new String(source.HostStatus);
        }
        if (source.SupportAutoFix != null) {
            this.SupportAutoFix = new Long(source.SupportAutoFix);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.LatestFixTime != null) {
            this.LatestFixTime = new String(source.LatestFixTime);
        }
        if (source.NotFixableReason != null) {
            this.NotFixableReason = new String(source.NotFixableReason);
        }
        if (source.NotFixableReasonCode != null) {
            this.NotFixableReasonCode = new String(source.NotFixableReasonCode);
        }
        if (source.NotFixableAction != null) {
            this.NotFixableAction = new VulFixableMachineAction(source.NotFixableAction);
        }
        if (source.FixCommands != null) {
            this.FixCommands = new String[source.FixCommands.length];
            for (int i = 0; i < source.FixCommands.length; i++) {
                this.FixCommands[i] = new String(source.FixCommands[i]);
            }
        }
        if (source.Components != null) {
            this.Components = new String[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new String(source.Components[i]);
            }
        }
        if (source.TagItems != null) {
            this.TagItems = new MiniTagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new MiniTagItem(source.TagItems[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PayVersion != null) {
            this.PayVersion = new String(source.PayVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamSimple(map, prefix + "SupportAutoFix", this.SupportAutoFix);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "LatestFixTime", this.LatestFixTime);
        this.setParamSimple(map, prefix + "NotFixableReason", this.NotFixableReason);
        this.setParamSimple(map, prefix + "NotFixableReasonCode", this.NotFixableReasonCode);
        this.setParamObj(map, prefix + "NotFixableAction.", this.NotFixableAction);
        this.setParamArraySimple(map, prefix + "FixCommands.", this.FixCommands);
        this.setParamArraySimple(map, prefix + "Components.", this.Components);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PayVersion", this.PayVersion);

    }
}

