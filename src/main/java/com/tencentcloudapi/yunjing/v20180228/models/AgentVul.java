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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentVul extends AbstractModel {

    /**
    * 漏洞ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机IP。
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
    * 漏洞危害等级。
<li>HIGH：高危</li>
<li>MIDDLE：中危</li>
<li>LOW：低危</li>
<li>NOTICE：提示</li>
    */
    @SerializedName("VulLevel")
    @Expose
    private String VulLevel;

    /**
    * 最后扫描时间。
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 漏洞描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 漏洞种类ID。
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞状态。
<li>UN_OPERATED : 待处理</li>
<li>FIXED : 已修复</li>
    */
    @SerializedName("VulStatus")
    @Expose
    private String VulStatus;

    /**
     * Get 漏洞ID。 
     * @return Id 漏洞ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 漏洞ID。
     * @param Id 漏洞ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机IP。 
     * @return MachineIp 主机IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机IP。
     * @param MachineIp 主机IP。
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
     * Get 漏洞危害等级。
<li>HIGH：高危</li>
<li>MIDDLE：中危</li>
<li>LOW：低危</li>
<li>NOTICE：提示</li> 
     * @return VulLevel 漏洞危害等级。
<li>HIGH：高危</li>
<li>MIDDLE：中危</li>
<li>LOW：低危</li>
<li>NOTICE：提示</li>
     */
    public String getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set 漏洞危害等级。
<li>HIGH：高危</li>
<li>MIDDLE：中危</li>
<li>LOW：低危</li>
<li>NOTICE：提示</li>
     * @param VulLevel 漏洞危害等级。
<li>HIGH：高危</li>
<li>MIDDLE：中危</li>
<li>LOW：低危</li>
<li>NOTICE：提示</li>
     */
    public void setVulLevel(String VulLevel) {
        this.VulLevel = VulLevel;
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
     * Get 漏洞种类ID。 
     * @return VulId 漏洞种类ID。
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞种类ID。
     * @param VulId 漏洞种类ID。
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 漏洞状态。
<li>UN_OPERATED : 待处理</li>
<li>FIXED : 已修复</li> 
     * @return VulStatus 漏洞状态。
<li>UN_OPERATED : 待处理</li>
<li>FIXED : 已修复</li>
     */
    public String getVulStatus() {
        return this.VulStatus;
    }

    /**
     * Set 漏洞状态。
<li>UN_OPERATED : 待处理</li>
<li>FIXED : 已修复</li>
     * @param VulStatus 漏洞状态。
<li>UN_OPERATED : 待处理</li>
<li>FIXED : 已修复</li>
     */
    public void setVulStatus(String VulStatus) {
        this.VulStatus = VulStatus;
    }

    public AgentVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentVul(AgentVul source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulLevel != null) {
            this.VulLevel = new String(source.VulLevel);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulStatus != null) {
            this.VulStatus = new String(source.VulStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulStatus", this.VulStatus);

    }
}

