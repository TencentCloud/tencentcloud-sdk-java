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

public class HostVulOverview extends AbstractModel {

    /**
    * <p>需立即修复漏洞数（VPR 评级为 URGENT 的漏洞数量）</p>
    */
    @SerializedName("UrgentRepairCount")
    @Expose
    private Long UrgentRepairCount;

    /**
    * <p>已开启漏洞防御的主机数</p>
    */
    @SerializedName("DefendHostCount")
    @Expose
    private Long DefendHostCount;

    /**
    * <p>主机总数</p>
    */
    @SerializedName("TotalHostCount")
    @Expose
    private Long TotalHostCount;

    /**
    * <p>已修复漏洞总次数</p>
    */
    @SerializedName("FixedVulCount")
    @Expose
    private Long FixedVulCount;

    /**
    * <p>Linux 软件漏洞数</p>
    */
    @SerializedName("LinuxVulCount")
    @Expose
    private Long LinuxVulCount;

    /**
    * <p>Windows 系统补丁数</p>
    */
    @SerializedName("WindowVulCount")
    @Expose
    private Long WindowVulCount;

    /**
    * <p>Web-CMS 漏洞数</p>
    */
    @SerializedName("WebCMSVulCount")
    @Expose
    private Long WebCMSVulCount;

    /**
    * <p>应用漏洞数</p>
    */
    @SerializedName("AppVulCount")
    @Expose
    private Long AppVulCount;

    /**
    * <p>应急漏洞数</p>
    */
    @SerializedName("EmergencyCount")
    @Expose
    private Long EmergencyCount;

    /**
    * <p>漏洞知识库总数</p>
    */
    @SerializedName("VulItemCount")
    @Expose
    private Long VulItemCount;

    /**
    * <p>最近扫描时间</p><p>参数格式：YYYY-MM-DDTHH:mm:ssZ</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>是否开启周期扫描</p><p>枚举值：</p><ul><li>1： 开启</li><li>0： 未开启</li></ul>
    */
    @SerializedName("EnableTimingScan")
    @Expose
    private Long EnableTimingScan;

    /**
    * <p>严重修复数</p>
    */
    @SerializedName("CriticalRepairCount")
    @Expose
    private Long CriticalRepairCount;

    /**
    * <p>严重修复Linux漏洞数</p>
    */
    @SerializedName("CriticalRepairLinuxVulCount")
    @Expose
    private Long CriticalRepairLinuxVulCount;

    /**
    * <p>严重修复应用漏洞数</p>
    */
    @SerializedName("CriticalRepairAppVulCount")
    @Expose
    private Long CriticalRepairAppVulCount;

    /**
    * <p>严重修复Web-CMS漏洞数</p>
    */
    @SerializedName("CriticalRepairWebCMSVulCount")
    @Expose
    private Long CriticalRepairWebCMSVulCount;

    /**
    * <p>严重修复紧急漏洞数</p>
    */
    @SerializedName("CriticalRepairEmergencyCount")
    @Expose
    private Long CriticalRepairEmergencyCount;

    /**
     * Get <p>需立即修复漏洞数（VPR 评级为 URGENT 的漏洞数量）</p> 
     * @return UrgentRepairCount <p>需立即修复漏洞数（VPR 评级为 URGENT 的漏洞数量）</p>
     */
    public Long getUrgentRepairCount() {
        return this.UrgentRepairCount;
    }

    /**
     * Set <p>需立即修复漏洞数（VPR 评级为 URGENT 的漏洞数量）</p>
     * @param UrgentRepairCount <p>需立即修复漏洞数（VPR 评级为 URGENT 的漏洞数量）</p>
     */
    public void setUrgentRepairCount(Long UrgentRepairCount) {
        this.UrgentRepairCount = UrgentRepairCount;
    }

    /**
     * Get <p>已开启漏洞防御的主机数</p> 
     * @return DefendHostCount <p>已开启漏洞防御的主机数</p>
     */
    public Long getDefendHostCount() {
        return this.DefendHostCount;
    }

    /**
     * Set <p>已开启漏洞防御的主机数</p>
     * @param DefendHostCount <p>已开启漏洞防御的主机数</p>
     */
    public void setDefendHostCount(Long DefendHostCount) {
        this.DefendHostCount = DefendHostCount;
    }

    /**
     * Get <p>主机总数</p> 
     * @return TotalHostCount <p>主机总数</p>
     */
    public Long getTotalHostCount() {
        return this.TotalHostCount;
    }

    /**
     * Set <p>主机总数</p>
     * @param TotalHostCount <p>主机总数</p>
     */
    public void setTotalHostCount(Long TotalHostCount) {
        this.TotalHostCount = TotalHostCount;
    }

    /**
     * Get <p>已修复漏洞总次数</p> 
     * @return FixedVulCount <p>已修复漏洞总次数</p>
     */
    public Long getFixedVulCount() {
        return this.FixedVulCount;
    }

    /**
     * Set <p>已修复漏洞总次数</p>
     * @param FixedVulCount <p>已修复漏洞总次数</p>
     */
    public void setFixedVulCount(Long FixedVulCount) {
        this.FixedVulCount = FixedVulCount;
    }

    /**
     * Get <p>Linux 软件漏洞数</p> 
     * @return LinuxVulCount <p>Linux 软件漏洞数</p>
     */
    public Long getLinuxVulCount() {
        return this.LinuxVulCount;
    }

    /**
     * Set <p>Linux 软件漏洞数</p>
     * @param LinuxVulCount <p>Linux 软件漏洞数</p>
     */
    public void setLinuxVulCount(Long LinuxVulCount) {
        this.LinuxVulCount = LinuxVulCount;
    }

    /**
     * Get <p>Windows 系统补丁数</p> 
     * @return WindowVulCount <p>Windows 系统补丁数</p>
     */
    public Long getWindowVulCount() {
        return this.WindowVulCount;
    }

    /**
     * Set <p>Windows 系统补丁数</p>
     * @param WindowVulCount <p>Windows 系统补丁数</p>
     */
    public void setWindowVulCount(Long WindowVulCount) {
        this.WindowVulCount = WindowVulCount;
    }

    /**
     * Get <p>Web-CMS 漏洞数</p> 
     * @return WebCMSVulCount <p>Web-CMS 漏洞数</p>
     */
    public Long getWebCMSVulCount() {
        return this.WebCMSVulCount;
    }

    /**
     * Set <p>Web-CMS 漏洞数</p>
     * @param WebCMSVulCount <p>Web-CMS 漏洞数</p>
     */
    public void setWebCMSVulCount(Long WebCMSVulCount) {
        this.WebCMSVulCount = WebCMSVulCount;
    }

    /**
     * Get <p>应用漏洞数</p> 
     * @return AppVulCount <p>应用漏洞数</p>
     */
    public Long getAppVulCount() {
        return this.AppVulCount;
    }

    /**
     * Set <p>应用漏洞数</p>
     * @param AppVulCount <p>应用漏洞数</p>
     */
    public void setAppVulCount(Long AppVulCount) {
        this.AppVulCount = AppVulCount;
    }

    /**
     * Get <p>应急漏洞数</p> 
     * @return EmergencyCount <p>应急漏洞数</p>
     */
    public Long getEmergencyCount() {
        return this.EmergencyCount;
    }

    /**
     * Set <p>应急漏洞数</p>
     * @param EmergencyCount <p>应急漏洞数</p>
     */
    public void setEmergencyCount(Long EmergencyCount) {
        this.EmergencyCount = EmergencyCount;
    }

    /**
     * Get <p>漏洞知识库总数</p> 
     * @return VulItemCount <p>漏洞知识库总数</p>
     */
    public Long getVulItemCount() {
        return this.VulItemCount;
    }

    /**
     * Set <p>漏洞知识库总数</p>
     * @param VulItemCount <p>漏洞知识库总数</p>
     */
    public void setVulItemCount(Long VulItemCount) {
        this.VulItemCount = VulItemCount;
    }

    /**
     * Get <p>最近扫描时间</p><p>参数格式：YYYY-MM-DDTHH:mm:ssZ</p> 
     * @return LatestScanTime <p>最近扫描时间</p><p>参数格式：YYYY-MM-DDTHH:mm:ssZ</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>最近扫描时间</p><p>参数格式：YYYY-MM-DDTHH:mm:ssZ</p>
     * @param LatestScanTime <p>最近扫描时间</p><p>参数格式：YYYY-MM-DDTHH:mm:ssZ</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>是否开启周期扫描</p><p>枚举值：</p><ul><li>1： 开启</li><li>0： 未开启</li></ul> 
     * @return EnableTimingScan <p>是否开启周期扫描</p><p>枚举值：</p><ul><li>1： 开启</li><li>0： 未开启</li></ul>
     */
    public Long getEnableTimingScan() {
        return this.EnableTimingScan;
    }

    /**
     * Set <p>是否开启周期扫描</p><p>枚举值：</p><ul><li>1： 开启</li><li>0： 未开启</li></ul>
     * @param EnableTimingScan <p>是否开启周期扫描</p><p>枚举值：</p><ul><li>1： 开启</li><li>0： 未开启</li></ul>
     */
    public void setEnableTimingScan(Long EnableTimingScan) {
        this.EnableTimingScan = EnableTimingScan;
    }

    /**
     * Get <p>严重修复数</p> 
     * @return CriticalRepairCount <p>严重修复数</p>
     */
    public Long getCriticalRepairCount() {
        return this.CriticalRepairCount;
    }

    /**
     * Set <p>严重修复数</p>
     * @param CriticalRepairCount <p>严重修复数</p>
     */
    public void setCriticalRepairCount(Long CriticalRepairCount) {
        this.CriticalRepairCount = CriticalRepairCount;
    }

    /**
     * Get <p>严重修复Linux漏洞数</p> 
     * @return CriticalRepairLinuxVulCount <p>严重修复Linux漏洞数</p>
     */
    public Long getCriticalRepairLinuxVulCount() {
        return this.CriticalRepairLinuxVulCount;
    }

    /**
     * Set <p>严重修复Linux漏洞数</p>
     * @param CriticalRepairLinuxVulCount <p>严重修复Linux漏洞数</p>
     */
    public void setCriticalRepairLinuxVulCount(Long CriticalRepairLinuxVulCount) {
        this.CriticalRepairLinuxVulCount = CriticalRepairLinuxVulCount;
    }

    /**
     * Get <p>严重修复应用漏洞数</p> 
     * @return CriticalRepairAppVulCount <p>严重修复应用漏洞数</p>
     */
    public Long getCriticalRepairAppVulCount() {
        return this.CriticalRepairAppVulCount;
    }

    /**
     * Set <p>严重修复应用漏洞数</p>
     * @param CriticalRepairAppVulCount <p>严重修复应用漏洞数</p>
     */
    public void setCriticalRepairAppVulCount(Long CriticalRepairAppVulCount) {
        this.CriticalRepairAppVulCount = CriticalRepairAppVulCount;
    }

    /**
     * Get <p>严重修复Web-CMS漏洞数</p> 
     * @return CriticalRepairWebCMSVulCount <p>严重修复Web-CMS漏洞数</p>
     */
    public Long getCriticalRepairWebCMSVulCount() {
        return this.CriticalRepairWebCMSVulCount;
    }

    /**
     * Set <p>严重修复Web-CMS漏洞数</p>
     * @param CriticalRepairWebCMSVulCount <p>严重修复Web-CMS漏洞数</p>
     */
    public void setCriticalRepairWebCMSVulCount(Long CriticalRepairWebCMSVulCount) {
        this.CriticalRepairWebCMSVulCount = CriticalRepairWebCMSVulCount;
    }

    /**
     * Get <p>严重修复紧急漏洞数</p> 
     * @return CriticalRepairEmergencyCount <p>严重修复紧急漏洞数</p>
     */
    public Long getCriticalRepairEmergencyCount() {
        return this.CriticalRepairEmergencyCount;
    }

    /**
     * Set <p>严重修复紧急漏洞数</p>
     * @param CriticalRepairEmergencyCount <p>严重修复紧急漏洞数</p>
     */
    public void setCriticalRepairEmergencyCount(Long CriticalRepairEmergencyCount) {
        this.CriticalRepairEmergencyCount = CriticalRepairEmergencyCount;
    }

    public HostVulOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulOverview(HostVulOverview source) {
        if (source.UrgentRepairCount != null) {
            this.UrgentRepairCount = new Long(source.UrgentRepairCount);
        }
        if (source.DefendHostCount != null) {
            this.DefendHostCount = new Long(source.DefendHostCount);
        }
        if (source.TotalHostCount != null) {
            this.TotalHostCount = new Long(source.TotalHostCount);
        }
        if (source.FixedVulCount != null) {
            this.FixedVulCount = new Long(source.FixedVulCount);
        }
        if (source.LinuxVulCount != null) {
            this.LinuxVulCount = new Long(source.LinuxVulCount);
        }
        if (source.WindowVulCount != null) {
            this.WindowVulCount = new Long(source.WindowVulCount);
        }
        if (source.WebCMSVulCount != null) {
            this.WebCMSVulCount = new Long(source.WebCMSVulCount);
        }
        if (source.AppVulCount != null) {
            this.AppVulCount = new Long(source.AppVulCount);
        }
        if (source.EmergencyCount != null) {
            this.EmergencyCount = new Long(source.EmergencyCount);
        }
        if (source.VulItemCount != null) {
            this.VulItemCount = new Long(source.VulItemCount);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.EnableTimingScan != null) {
            this.EnableTimingScan = new Long(source.EnableTimingScan);
        }
        if (source.CriticalRepairCount != null) {
            this.CriticalRepairCount = new Long(source.CriticalRepairCount);
        }
        if (source.CriticalRepairLinuxVulCount != null) {
            this.CriticalRepairLinuxVulCount = new Long(source.CriticalRepairLinuxVulCount);
        }
        if (source.CriticalRepairAppVulCount != null) {
            this.CriticalRepairAppVulCount = new Long(source.CriticalRepairAppVulCount);
        }
        if (source.CriticalRepairWebCMSVulCount != null) {
            this.CriticalRepairWebCMSVulCount = new Long(source.CriticalRepairWebCMSVulCount);
        }
        if (source.CriticalRepairEmergencyCount != null) {
            this.CriticalRepairEmergencyCount = new Long(source.CriticalRepairEmergencyCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UrgentRepairCount", this.UrgentRepairCount);
        this.setParamSimple(map, prefix + "DefendHostCount", this.DefendHostCount);
        this.setParamSimple(map, prefix + "TotalHostCount", this.TotalHostCount);
        this.setParamSimple(map, prefix + "FixedVulCount", this.FixedVulCount);
        this.setParamSimple(map, prefix + "LinuxVulCount", this.LinuxVulCount);
        this.setParamSimple(map, prefix + "WindowVulCount", this.WindowVulCount);
        this.setParamSimple(map, prefix + "WebCMSVulCount", this.WebCMSVulCount);
        this.setParamSimple(map, prefix + "AppVulCount", this.AppVulCount);
        this.setParamSimple(map, prefix + "EmergencyCount", this.EmergencyCount);
        this.setParamSimple(map, prefix + "VulItemCount", this.VulItemCount);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "EnableTimingScan", this.EnableTimingScan);
        this.setParamSimple(map, prefix + "CriticalRepairCount", this.CriticalRepairCount);
        this.setParamSimple(map, prefix + "CriticalRepairLinuxVulCount", this.CriticalRepairLinuxVulCount);
        this.setParamSimple(map, prefix + "CriticalRepairAppVulCount", this.CriticalRepairAppVulCount);
        this.setParamSimple(map, prefix + "CriticalRepairWebCMSVulCount", this.CriticalRepairWebCMSVulCount);
        this.setParamSimple(map, prefix + "CriticalRepairEmergencyCount", this.CriticalRepairEmergencyCount);

    }
}

