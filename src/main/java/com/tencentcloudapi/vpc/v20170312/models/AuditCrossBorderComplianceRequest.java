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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditCrossBorderComplianceRequest extends AbstractModel{

    /**
    * 服务商, 可选值：`UNICOM`。
    */
    @SerializedName("ServiceProvider")
    @Expose
    private String ServiceProvider;

    /**
    * 表单唯一`ID`。
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * 通过：`APPROVED `，拒绝：`DENY`。
    */
    @SerializedName("AuditBehavior")
    @Expose
    private String AuditBehavior;

    /**
     * Get 服务商, 可选值：`UNICOM`。 
     * @return ServiceProvider 服务商, 可选值：`UNICOM`。
     */
    public String getServiceProvider() {
        return this.ServiceProvider;
    }

    /**
     * Set 服务商, 可选值：`UNICOM`。
     * @param ServiceProvider 服务商, 可选值：`UNICOM`。
     */
    public void setServiceProvider(String ServiceProvider) {
        this.ServiceProvider = ServiceProvider;
    }

    /**
     * Get 表单唯一`ID`。 
     * @return ComplianceId 表单唯一`ID`。
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 表单唯一`ID`。
     * @param ComplianceId 表单唯一`ID`。
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get 通过：`APPROVED `，拒绝：`DENY`。 
     * @return AuditBehavior 通过：`APPROVED `，拒绝：`DENY`。
     */
    public String getAuditBehavior() {
        return this.AuditBehavior;
    }

    /**
     * Set 通过：`APPROVED `，拒绝：`DENY`。
     * @param AuditBehavior 通过：`APPROVED `，拒绝：`DENY`。
     */
    public void setAuditBehavior(String AuditBehavior) {
        this.AuditBehavior = AuditBehavior;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProvider", this.ServiceProvider);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "AuditBehavior", this.AuditBehavior);

    }
}

