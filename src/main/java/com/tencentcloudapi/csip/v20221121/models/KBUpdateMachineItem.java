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

public class KBUpdateMachineItem extends AbstractModel {

    /**
    * KB补丁ID
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

    /**
    * 主机实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 主机IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 操作系统名称
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 主机在线状态
枚举值：
ONLINE：在线
OFFLINE：离线
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * 主机运行状态
枚举值：
RUNNING：运行中
STOPPED：已停止
EXPIRED：待回收
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * 是否支持自动更新补丁
枚举值：
0：不支持
1：支持
    */
    @SerializedName("SupportAutoFix")
    @Expose
    private Long SupportAutoFix;

    /**
    * 当前修复状态
枚举值：
0：未修复
1：修复中
2：修复失败
3：修复成功
4：修复超时
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

    /**
    * 不可修复原因，SupportAutoFix为0时返回
    */
    @SerializedName("NotFixableReason")
    @Expose
    private String NotFixableReason;

    /**
    * 不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回
    */
    @SerializedName("NotFixableAction")
    @Expose
    private VulFixableMachineAction NotFixableAction;

    /**
    * 资产标签列表
    */
    @SerializedName("TagItems")
    @Expose
    private MiniTagItem [] TagItems;

    /**
    * 所属账号AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 付费版本信息
枚举值：
BASIC：基础版
PRO：专业版
ULTIMATE：旗舰版
PRO_LH：轻量版
    */
    @SerializedName("PayVersion")
    @Expose
    private String PayVersion;

    /**
     * Get KB补丁ID 
     * @return KBId KB补丁ID
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set KB补丁ID
     * @param KBId KB补丁ID
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
    }

    /**
     * Get 主机实例ID 
     * @return InstanceId 主机实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主机实例ID
     * @param InstanceId 主机实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主机名称 
     * @return MachineName 主机名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称
     * @param MachineName 主机名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 主机IP 
     * @return MachineIp 主机IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机IP
     * @param MachineIp 主机IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 公网IP 
     * @return PublicIp 公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
     * @param PublicIp 公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 操作系统名称 
     * @return OsName 操作系统名称
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 操作系统名称
     * @param OsName 操作系统名称
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 主机在线状态
枚举值：
ONLINE：在线
OFFLINE：离线 
     * @return MachineStatus 主机在线状态
枚举值：
ONLINE：在线
OFFLINE：离线
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 主机在线状态
枚举值：
ONLINE：在线
OFFLINE：离线
     * @param MachineStatus 主机在线状态
枚举值：
ONLINE：在线
OFFLINE：离线
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get 主机运行状态
枚举值：
RUNNING：运行中
STOPPED：已停止
EXPIRED：待回收 
     * @return HostStatus 主机运行状态
枚举值：
RUNNING：运行中
STOPPED：已停止
EXPIRED：待回收
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set 主机运行状态
枚举值：
RUNNING：运行中
STOPPED：已停止
EXPIRED：待回收
     * @param HostStatus 主机运行状态
枚举值：
RUNNING：运行中
STOPPED：已停止
EXPIRED：待回收
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
    }

    /**
     * Get 是否支持自动更新补丁
枚举值：
0：不支持
1：支持 
     * @return SupportAutoFix 是否支持自动更新补丁
枚举值：
0：不支持
1：支持
     */
    public Long getSupportAutoFix() {
        return this.SupportAutoFix;
    }

    /**
     * Set 是否支持自动更新补丁
枚举值：
0：不支持
1：支持
     * @param SupportAutoFix 是否支持自动更新补丁
枚举值：
0：不支持
1：支持
     */
    public void setSupportAutoFix(Long SupportAutoFix) {
        this.SupportAutoFix = SupportAutoFix;
    }

    /**
     * Get 当前修复状态
枚举值：
0：未修复
1：修复中
2：修复失败
3：修复成功
4：修复超时 
     * @return FixStatus 当前修复状态
枚举值：
0：未修复
1：修复中
2：修复失败
3：修复成功
4：修复超时
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set 当前修复状态
枚举值：
0：未修复
1：修复中
2：修复失败
3：修复成功
4：修复超时
     * @param FixStatus 当前修复状态
枚举值：
0：未修复
1：修复中
2：修复失败
3：修复成功
4：修复超时
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return LatestFixTime 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param LatestFixTime 最近一次修复时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
    }

    /**
     * Get 不可修复原因，SupportAutoFix为0时返回 
     * @return NotFixableReason 不可修复原因，SupportAutoFix为0时返回
     */
    public String getNotFixableReason() {
        return this.NotFixableReason;
    }

    /**
     * Set 不可修复原因，SupportAutoFix为0时返回
     * @param NotFixableReason 不可修复原因，SupportAutoFix为0时返回
     */
    public void setNotFixableReason(String NotFixableReason) {
        this.NotFixableReason = NotFixableReason;
    }

    /**
     * Get 不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回 
     * @return NotFixableAction 不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回
     */
    public VulFixableMachineAction getNotFixableAction() {
        return this.NotFixableAction;
    }

    /**
     * Set 不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回
     * @param NotFixableAction 不可修复原因关联动作，SupportAutoFix为0且存在可引导动作时返回
     */
    public void setNotFixableAction(VulFixableMachineAction NotFixableAction) {
        this.NotFixableAction = NotFixableAction;
    }

    /**
     * Get 资产标签列表 
     * @return TagItems 资产标签列表
     */
    public MiniTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set 资产标签列表
     * @param TagItems 资产标签列表
     */
    public void setTagItems(MiniTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get 所属账号AppId 
     * @return AppId 所属账号AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 所属账号AppId
     * @param AppId 所属账号AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 付费版本信息
枚举值：
BASIC：基础版
PRO：专业版
ULTIMATE：旗舰版
PRO_LH：轻量版 
     * @return PayVersion 付费版本信息
枚举值：
BASIC：基础版
PRO：专业版
ULTIMATE：旗舰版
PRO_LH：轻量版
     */
    public String getPayVersion() {
        return this.PayVersion;
    }

    /**
     * Set 付费版本信息
枚举值：
BASIC：基础版
PRO：专业版
ULTIMATE：旗舰版
PRO_LH：轻量版
     * @param PayVersion 付费版本信息
枚举值：
BASIC：基础版
PRO：专业版
ULTIMATE：旗舰版
PRO_LH：轻量版
     */
    public void setPayVersion(String PayVersion) {
        this.PayVersion = PayVersion;
    }

    public KBUpdateMachineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBUpdateMachineItem(KBUpdateMachineItem source) {
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
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
        if (source.NotFixableAction != null) {
            this.NotFixableAction = new VulFixableMachineAction(source.NotFixableAction);
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
        this.setParamSimple(map, prefix + "KBId", this.KBId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamSimple(map, prefix + "SupportAutoFix", this.SupportAutoFix);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "LatestFixTime", this.LatestFixTime);
        this.setParamSimple(map, prefix + "NotFixableReason", this.NotFixableReason);
        this.setParamObj(map, prefix + "NotFixableAction.", this.NotFixableAction);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PayVersion", this.PayVersion);

    }
}

