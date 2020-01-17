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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WeeklyReportVul extends AbstractModel{

    /**
    * 主机内网IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 漏洞名称。
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞类型。
<li> WEB : Web漏洞</li>
<li> SYSTEM :系统组件漏洞</li>
<li> BASELINE : 安全基线</li>
    */
    @SerializedName("VulType")
    @Expose
    private String VulType;

    /**
    * 漏洞描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 漏洞状态。
<li> UN_OPERATED : 待处理</li>
<li> SCANING : 扫描中</li>
<li> FIXED : 已修复</li>
    */
    @SerializedName("VulStatus")
    @Expose
    private String VulStatus;

    /**
    * 最后扫描时间。
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
     * Get 主机内网IP。 
     * @return MachineIp 主机内网IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机内网IP。
     * @param MachineIp 主机内网IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 漏洞名称。 
     * @return VulName 漏洞名称。
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称。
     * @param VulName 漏洞名称。
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 漏洞类型。
<li> WEB : Web漏洞</li>
<li> SYSTEM :系统组件漏洞</li>
<li> BASELINE : 安全基线</li> 
     * @return VulType 漏洞类型。
<li> WEB : Web漏洞</li>
<li> SYSTEM :系统组件漏洞</li>
<li> BASELINE : 安全基线</li>
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * Set 漏洞类型。
<li> WEB : Web漏洞</li>
<li> SYSTEM :系统组件漏洞</li>
<li> BASELINE : 安全基线</li>
     * @param VulType 漏洞类型。
<li> WEB : Web漏洞</li>
<li> SYSTEM :系统组件漏洞</li>
<li> BASELINE : 安全基线</li>
     */
    public void setVulType(String VulType) {
        this.VulType = VulType;
    }

    /**
     * Get 漏洞描述。 
     * @return Description 漏洞描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 漏洞描述。
     * @param Description 漏洞描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 漏洞状态。
<li> UN_OPERATED : 待处理</li>
<li> SCANING : 扫描中</li>
<li> FIXED : 已修复</li> 
     * @return VulStatus 漏洞状态。
<li> UN_OPERATED : 待处理</li>
<li> SCANING : 扫描中</li>
<li> FIXED : 已修复</li>
     */
    public String getVulStatus() {
        return this.VulStatus;
    }

    /**
     * Set 漏洞状态。
<li> UN_OPERATED : 待处理</li>
<li> SCANING : 扫描中</li>
<li> FIXED : 已修复</li>
     * @param VulStatus 漏洞状态。
<li> UN_OPERATED : 待处理</li>
<li> SCANING : 扫描中</li>
<li> FIXED : 已修复</li>
     */
    public void setVulStatus(String VulStatus) {
        this.VulStatus = VulStatus;
    }

    /**
     * Get 最后扫描时间。 
     * @return LastScanTime 最后扫描时间。
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最后扫描时间。
     * @param LastScanTime 最后扫描时间。
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VulStatus", this.VulStatus);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);

    }
}

