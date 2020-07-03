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

public class DescribeVulInfoResponse extends AbstractModel{

    /**
    * 漏洞种类ID。
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 漏洞名称。
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞等级。
    */
    @SerializedName("VulLevel")
    @Expose
    private String VulLevel;

    /**
    * 漏洞类型。
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
    * 修复方案。
    */
    @SerializedName("RepairPlan")
    @Expose
    private String RepairPlan;

    /**
    * 漏洞CVE。
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * 参考链接。
    */
    @SerializedName("Reference")
    @Expose
    private String Reference;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 漏洞等级。 
     * @return VulLevel 漏洞等级。
     */
    public String getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set 漏洞等级。
     * @param VulLevel 漏洞等级。
     */
    public void setVulLevel(String VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get 漏洞类型。 
     * @return VulType 漏洞类型。
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * Set 漏洞类型。
     * @param VulType 漏洞类型。
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
     * Get 修复方案。 
     * @return RepairPlan 修复方案。
     */
    public String getRepairPlan() {
        return this.RepairPlan;
    }

    /**
     * Set 修复方案。
     * @param RepairPlan 修复方案。
     */
    public void setRepairPlan(String RepairPlan) {
        this.RepairPlan = RepairPlan;
    }

    /**
     * Get 漏洞CVE。 
     * @return CveId 漏洞CVE。
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set 漏洞CVE。
     * @param CveId 漏洞CVE。
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get 参考链接。 
     * @return Reference 参考链接。
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * Set 参考链接。
     * @param Reference 参考链接。
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RepairPlan", this.RepairPlan);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "Reference", this.Reference);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

