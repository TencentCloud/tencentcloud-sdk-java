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

public class ModifyProtectionSetting extends AbstractModel {

    /**
    * 资产唯一ID
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * 总开关 0关闭 1开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 漏洞防护开关 0: 关闭 1:开启
    */
    @SerializedName("VulDefEnable")
    @Expose
    private Long VulDefEnable;

    /**
    * 漏洞防护模式 0: 标准 1: 重保
    */
    @SerializedName("VulDefMode")
    @Expose
    private Long VulDefMode;

    /**
    * 漏洞防护动作 0: 仅检测 1: 检测+防御
    */
    @SerializedName("VulDefAction")
    @Expose
    private Long VulDefAction;

    /**
    * 内存马防御开关 0: 关闭 1:开启
    */
    @SerializedName("MemShellDefEnable")
    @Expose
    private Long MemShellDefEnable;

    /**
    * 性能限制开关 0: 关闭 1:开启
    */
    @SerializedName("PerformanceLimit")
    @Expose
    private Long PerformanceLimit;

    /**
    * CPU阈值 取值1-99
    */
    @SerializedName("PerformanceLimitCpu")
    @Expose
    private Long PerformanceLimitCpu;

    /**
    * 内存阈值 取值1-99
    */
    @SerializedName("PerformanceLimitMem")
    @Expose
    private Long PerformanceLimitMem;

    /**
    * 内存剩余阈值
    */
    @SerializedName("PerformanceLimitMemAmount")
    @Expose
    private Long PerformanceLimitMemAmount;

    /**
    * 更多防护, 0: 不注入会重启的进程 1: 注入会重启的进程
    */
    @SerializedName("SafeInject")
    @Expose
    private Long SafeInject;

    /**
     * Get 资产唯一ID 
     * @return QUUID 资产唯一ID
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set 资产唯一ID
     * @param QUUID 资产唯一ID
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get 总开关 0关闭 1开启 
     * @return Enable 总开关 0关闭 1开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 总开关 0关闭 1开启
     * @param Enable 总开关 0关闭 1开启
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 漏洞防护开关 0: 关闭 1:开启 
     * @return VulDefEnable 漏洞防护开关 0: 关闭 1:开启
     */
    public Long getVulDefEnable() {
        return this.VulDefEnable;
    }

    /**
     * Set 漏洞防护开关 0: 关闭 1:开启
     * @param VulDefEnable 漏洞防护开关 0: 关闭 1:开启
     */
    public void setVulDefEnable(Long VulDefEnable) {
        this.VulDefEnable = VulDefEnable;
    }

    /**
     * Get 漏洞防护模式 0: 标准 1: 重保 
     * @return VulDefMode 漏洞防护模式 0: 标准 1: 重保
     */
    public Long getVulDefMode() {
        return this.VulDefMode;
    }

    /**
     * Set 漏洞防护模式 0: 标准 1: 重保
     * @param VulDefMode 漏洞防护模式 0: 标准 1: 重保
     */
    public void setVulDefMode(Long VulDefMode) {
        this.VulDefMode = VulDefMode;
    }

    /**
     * Get 漏洞防护动作 0: 仅检测 1: 检测+防御 
     * @return VulDefAction 漏洞防护动作 0: 仅检测 1: 检测+防御
     */
    public Long getVulDefAction() {
        return this.VulDefAction;
    }

    /**
     * Set 漏洞防护动作 0: 仅检测 1: 检测+防御
     * @param VulDefAction 漏洞防护动作 0: 仅检测 1: 检测+防御
     */
    public void setVulDefAction(Long VulDefAction) {
        this.VulDefAction = VulDefAction;
    }

    /**
     * Get 内存马防御开关 0: 关闭 1:开启 
     * @return MemShellDefEnable 内存马防御开关 0: 关闭 1:开启
     */
    public Long getMemShellDefEnable() {
        return this.MemShellDefEnable;
    }

    /**
     * Set 内存马防御开关 0: 关闭 1:开启
     * @param MemShellDefEnable 内存马防御开关 0: 关闭 1:开启
     */
    public void setMemShellDefEnable(Long MemShellDefEnable) {
        this.MemShellDefEnable = MemShellDefEnable;
    }

    /**
     * Get 性能限制开关 0: 关闭 1:开启 
     * @return PerformanceLimit 性能限制开关 0: 关闭 1:开启
     */
    public Long getPerformanceLimit() {
        return this.PerformanceLimit;
    }

    /**
     * Set 性能限制开关 0: 关闭 1:开启
     * @param PerformanceLimit 性能限制开关 0: 关闭 1:开启
     */
    public void setPerformanceLimit(Long PerformanceLimit) {
        this.PerformanceLimit = PerformanceLimit;
    }

    /**
     * Get CPU阈值 取值1-99 
     * @return PerformanceLimitCpu CPU阈值 取值1-99
     */
    public Long getPerformanceLimitCpu() {
        return this.PerformanceLimitCpu;
    }

    /**
     * Set CPU阈值 取值1-99
     * @param PerformanceLimitCpu CPU阈值 取值1-99
     */
    public void setPerformanceLimitCpu(Long PerformanceLimitCpu) {
        this.PerformanceLimitCpu = PerformanceLimitCpu;
    }

    /**
     * Get 内存阈值 取值1-99 
     * @return PerformanceLimitMem 内存阈值 取值1-99
     */
    public Long getPerformanceLimitMem() {
        return this.PerformanceLimitMem;
    }

    /**
     * Set 内存阈值 取值1-99
     * @param PerformanceLimitMem 内存阈值 取值1-99
     */
    public void setPerformanceLimitMem(Long PerformanceLimitMem) {
        this.PerformanceLimitMem = PerformanceLimitMem;
    }

    /**
     * Get 内存剩余阈值 
     * @return PerformanceLimitMemAmount 内存剩余阈值
     */
    public Long getPerformanceLimitMemAmount() {
        return this.PerformanceLimitMemAmount;
    }

    /**
     * Set 内存剩余阈值
     * @param PerformanceLimitMemAmount 内存剩余阈值
     */
    public void setPerformanceLimitMemAmount(Long PerformanceLimitMemAmount) {
        this.PerformanceLimitMemAmount = PerformanceLimitMemAmount;
    }

    /**
     * Get 更多防护, 0: 不注入会重启的进程 1: 注入会重启的进程 
     * @return SafeInject 更多防护, 0: 不注入会重启的进程 1: 注入会重启的进程
     */
    public Long getSafeInject() {
        return this.SafeInject;
    }

    /**
     * Set 更多防护, 0: 不注入会重启的进程 1: 注入会重启的进程
     * @param SafeInject 更多防护, 0: 不注入会重启的进程 1: 注入会重启的进程
     */
    public void setSafeInject(Long SafeInject) {
        this.SafeInject = SafeInject;
    }

    public ModifyProtectionSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProtectionSetting(ModifyProtectionSetting source) {
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VulDefEnable != null) {
            this.VulDefEnable = new Long(source.VulDefEnable);
        }
        if (source.VulDefMode != null) {
            this.VulDefMode = new Long(source.VulDefMode);
        }
        if (source.VulDefAction != null) {
            this.VulDefAction = new Long(source.VulDefAction);
        }
        if (source.MemShellDefEnable != null) {
            this.MemShellDefEnable = new Long(source.MemShellDefEnable);
        }
        if (source.PerformanceLimit != null) {
            this.PerformanceLimit = new Long(source.PerformanceLimit);
        }
        if (source.PerformanceLimitCpu != null) {
            this.PerformanceLimitCpu = new Long(source.PerformanceLimitCpu);
        }
        if (source.PerformanceLimitMem != null) {
            this.PerformanceLimitMem = new Long(source.PerformanceLimitMem);
        }
        if (source.PerformanceLimitMemAmount != null) {
            this.PerformanceLimitMemAmount = new Long(source.PerformanceLimitMemAmount);
        }
        if (source.SafeInject != null) {
            this.SafeInject = new Long(source.SafeInject);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VulDefEnable", this.VulDefEnable);
        this.setParamSimple(map, prefix + "VulDefMode", this.VulDefMode);
        this.setParamSimple(map, prefix + "VulDefAction", this.VulDefAction);
        this.setParamSimple(map, prefix + "MemShellDefEnable", this.MemShellDefEnable);
        this.setParamSimple(map, prefix + "PerformanceLimit", this.PerformanceLimit);
        this.setParamSimple(map, prefix + "PerformanceLimitCpu", this.PerformanceLimitCpu);
        this.setParamSimple(map, prefix + "PerformanceLimitMem", this.PerformanceLimitMem);
        this.setParamSimple(map, prefix + "PerformanceLimitMemAmount", this.PerformanceLimitMemAmount);
        this.setParamSimple(map, prefix + "SafeInject", this.SafeInject);

    }
}

