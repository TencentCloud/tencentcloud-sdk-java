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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAggregateCompliancePackStatusRequest extends AbstractModel {

    /**
    * 合规包ID
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * ACTIVE：启用
UN_ACTIVE ：停用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 账号组ID
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
     * Get 合规包ID 
     * @return CompliancePackId 合规包ID
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set 合规包ID
     * @param CompliancePackId 合规包ID
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get ACTIVE：启用
UN_ACTIVE ：停用 
     * @return Status ACTIVE：启用
UN_ACTIVE ：停用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set ACTIVE：启用
UN_ACTIVE ：停用
     * @param Status ACTIVE：启用
UN_ACTIVE ：停用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 账号组ID 
     * @return AccountGroupId 账号组ID
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID
     * @param AccountGroupId 账号组ID
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    public UpdateAggregateCompliancePackStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAggregateCompliancePackStatusRequest(UpdateAggregateCompliancePackStatusRequest source) {
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);

    }
}

