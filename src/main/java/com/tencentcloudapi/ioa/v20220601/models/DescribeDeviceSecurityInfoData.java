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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceSecurityInfoData extends AbstractModel {

    /**
    * <p>防火墙状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：已开启</li></ul>
    */
    @SerializedName("FirewallStatus")
    @Expose
    private Long FirewallStatus;

    /**
    * <p>实时防护状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：部分开启</li><li>2：已开启</li><li>-1：未知</li></ul>
    */
    @SerializedName("RealTimeProtectionStatus")
    @Expose
    private Long RealTimeProtectionStatus;

    /**
    * <p>系统修复引擎版本</p>
    */
    @SerializedName("SysRepVersion")
    @Expose
    private String SysRepVersion;

    /**
    * <p>病毒库版本</p>
    */
    @SerializedName("VirusVer")
    @Expose
    private String VirusVer;

    /**
    * <p>漏洞库版本</p>
    */
    @SerializedName("VulVersion")
    @Expose
    private String VulVersion;

    /**
     * Get <p>防火墙状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：已开启</li></ul> 
     * @return FirewallStatus <p>防火墙状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：已开启</li></ul>
     */
    public Long getFirewallStatus() {
        return this.FirewallStatus;
    }

    /**
     * Set <p>防火墙状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：已开启</li></ul>
     * @param FirewallStatus <p>防火墙状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：已开启</li></ul>
     */
    public void setFirewallStatus(Long FirewallStatus) {
        this.FirewallStatus = FirewallStatus;
    }

    /**
     * Get <p>实时防护状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：部分开启</li><li>2：已开启</li><li>-1：未知</li></ul> 
     * @return RealTimeProtectionStatus <p>实时防护状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：部分开启</li><li>2：已开启</li><li>-1：未知</li></ul>
     */
    public Long getRealTimeProtectionStatus() {
        return this.RealTimeProtectionStatus;
    }

    /**
     * Set <p>实时防护状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：部分开启</li><li>2：已开启</li><li>-1：未知</li></ul>
     * @param RealTimeProtectionStatus <p>实时防护状态</p><p>枚举值：</p><ul><li>0：未开启</li><li>1：部分开启</li><li>2：已开启</li><li>-1：未知</li></ul>
     */
    public void setRealTimeProtectionStatus(Long RealTimeProtectionStatus) {
        this.RealTimeProtectionStatus = RealTimeProtectionStatus;
    }

    /**
     * Get <p>系统修复引擎版本</p> 
     * @return SysRepVersion <p>系统修复引擎版本</p>
     */
    public String getSysRepVersion() {
        return this.SysRepVersion;
    }

    /**
     * Set <p>系统修复引擎版本</p>
     * @param SysRepVersion <p>系统修复引擎版本</p>
     */
    public void setSysRepVersion(String SysRepVersion) {
        this.SysRepVersion = SysRepVersion;
    }

    /**
     * Get <p>病毒库版本</p> 
     * @return VirusVer <p>病毒库版本</p>
     */
    public String getVirusVer() {
        return this.VirusVer;
    }

    /**
     * Set <p>病毒库版本</p>
     * @param VirusVer <p>病毒库版本</p>
     */
    public void setVirusVer(String VirusVer) {
        this.VirusVer = VirusVer;
    }

    /**
     * Get <p>漏洞库版本</p> 
     * @return VulVersion <p>漏洞库版本</p>
     */
    public String getVulVersion() {
        return this.VulVersion;
    }

    /**
     * Set <p>漏洞库版本</p>
     * @param VulVersion <p>漏洞库版本</p>
     */
    public void setVulVersion(String VulVersion) {
        this.VulVersion = VulVersion;
    }

    public DescribeDeviceSecurityInfoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceSecurityInfoData(DescribeDeviceSecurityInfoData source) {
        if (source.FirewallStatus != null) {
            this.FirewallStatus = new Long(source.FirewallStatus);
        }
        if (source.RealTimeProtectionStatus != null) {
            this.RealTimeProtectionStatus = new Long(source.RealTimeProtectionStatus);
        }
        if (source.SysRepVersion != null) {
            this.SysRepVersion = new String(source.SysRepVersion);
        }
        if (source.VirusVer != null) {
            this.VirusVer = new String(source.VirusVer);
        }
        if (source.VulVersion != null) {
            this.VulVersion = new String(source.VulVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirewallStatus", this.FirewallStatus);
        this.setParamSimple(map, prefix + "RealTimeProtectionStatus", this.RealTimeProtectionStatus);
        this.setParamSimple(map, prefix + "SysRepVersion", this.SysRepVersion);
        this.setParamSimple(map, prefix + "VirusVer", this.VirusVer);
        this.setParamSimple(map, prefix + "VulVersion", this.VulVersion);

    }
}

