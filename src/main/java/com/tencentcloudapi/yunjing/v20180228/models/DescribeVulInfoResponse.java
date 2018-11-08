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

public class DescribeVulInfoResponse  extends AbstractModel{

    /**
    * 漏洞种类ID。
    */
    @SerializedName("VulId")
    @Expose
    private Integer VulId;

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
     * 获取漏洞种类ID。
     * @return VulId 漏洞种类ID。
     */
    public Integer getVulId() {
        return this.VulId;
    }

    /**
     * 设置漏洞种类ID。
     * @param VulId 漏洞种类ID。
     */
    public void setVulId(Integer VulId) {
        this.VulId = VulId;
    }

    /**
     * 获取漏洞名称。
     * @return VulName 漏洞名称。
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * 设置漏洞名称。
     * @param VulName 漏洞名称。
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * 获取漏洞等级。
     * @return VulLevel 漏洞等级。
     */
    public String getVulLevel() {
        return this.VulLevel;
    }

    /**
     * 设置漏洞等级。
     * @param VulLevel 漏洞等级。
     */
    public void setVulLevel(String VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * 获取漏洞类型。
     * @return VulType 漏洞类型。
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * 设置漏洞类型。
     * @param VulType 漏洞类型。
     */
    public void setVulType(String VulType) {
        this.VulType = VulType;
    }

    /**
     * 获取漏洞描述。
     * @return Description 漏洞描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置漏洞描述。
     * @param Description 漏洞描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取修复方案。
     * @return RepairPlan 修复方案。
     */
    public String getRepairPlan() {
        return this.RepairPlan;
    }

    /**
     * 设置修复方案。
     * @param RepairPlan 修复方案。
     */
    public void setRepairPlan(String RepairPlan) {
        this.RepairPlan = RepairPlan;
    }

    /**
     * 获取漏洞CVE。
     * @return CveId 漏洞CVE。
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * 设置漏洞CVE。
     * @param CveId 漏洞CVE。
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * 获取参考链接。
     * @return Reference 参考链接。
     */
    public String getReference() {
        return this.Reference;
    }

    /**
     * 设置参考链接。
     * @param Reference 参考链接。
     */
    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
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

