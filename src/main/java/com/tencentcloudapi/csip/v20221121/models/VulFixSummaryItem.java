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

public class VulFixSummaryItem extends AbstractModel {

    /**
    * <p>漏洞ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * <p>漏洞名称</p>
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * <p>CVE编号</p>
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * <p>受影响主机数</p>
    */
    @SerializedName("AffectedCount")
    @Expose
    private Long AffectedCount;

    /**
    * <p>修复后是否需要重启系统</p>
    */
    @SerializedName("NeedReboot")
    @Expose
    private Boolean NeedReboot;

    /**
    * <p>是否支持一键修复true-支持 false-不支持</p>
    */
    @SerializedName("FixSwitch")
    @Expose
    private Boolean FixSwitch;

    /**
     * Get <p>漏洞ID</p> 
     * @return VulId <p>漏洞ID</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>漏洞ID</p>
     * @param VulId <p>漏洞ID</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>漏洞名称</p> 
     * @return VulName <p>漏洞名称</p>
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>漏洞名称</p>
     * @param VulName <p>漏洞名称</p>
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>CVE编号</p> 
     * @return CveId <p>CVE编号</p>
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set <p>CVE编号</p>
     * @param CveId <p>CVE编号</p>
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get <p>受影响主机数</p> 
     * @return AffectedCount <p>受影响主机数</p>
     */
    public Long getAffectedCount() {
        return this.AffectedCount;
    }

    /**
     * Set <p>受影响主机数</p>
     * @param AffectedCount <p>受影响主机数</p>
     */
    public void setAffectedCount(Long AffectedCount) {
        this.AffectedCount = AffectedCount;
    }

    /**
     * Get <p>修复后是否需要重启系统</p> 
     * @return NeedReboot <p>修复后是否需要重启系统</p>
     */
    public Boolean getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set <p>修复后是否需要重启系统</p>
     * @param NeedReboot <p>修复后是否需要重启系统</p>
     */
    public void setNeedReboot(Boolean NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get <p>是否支持一键修复true-支持 false-不支持</p> 
     * @return FixSwitch <p>是否支持一键修复true-支持 false-不支持</p>
     */
    public Boolean getFixSwitch() {
        return this.FixSwitch;
    }

    /**
     * Set <p>是否支持一键修复true-支持 false-不支持</p>
     * @param FixSwitch <p>是否支持一键修复true-支持 false-不支持</p>
     */
    public void setFixSwitch(Boolean FixSwitch) {
        this.FixSwitch = FixSwitch;
    }

    public VulFixSummaryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixSummaryItem(VulFixSummaryItem source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.AffectedCount != null) {
            this.AffectedCount = new Long(source.AffectedCount);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Boolean(source.NeedReboot);
        }
        if (source.FixSwitch != null) {
            this.FixSwitch = new Boolean(source.FixSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "AffectedCount", this.AffectedCount);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "FixSwitch", this.FixSwitch);

    }
}

