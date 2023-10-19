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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanTaskComplianceInfo extends AbstractModel {

    /**
    * 合规组ID
    */
    @SerializedName("ComplianceGroupId")
    @Expose
    private Long ComplianceGroupId;

    /**
    * 合规组名称
    */
    @SerializedName("ComplianceGroupName")
    @Expose
    private String ComplianceGroupName;

    /**
     * Get 合规组ID 
     * @return ComplianceGroupId 合规组ID
     */
    public Long getComplianceGroupId() {
        return this.ComplianceGroupId;
    }

    /**
     * Set 合规组ID
     * @param ComplianceGroupId 合规组ID
     */
    public void setComplianceGroupId(Long ComplianceGroupId) {
        this.ComplianceGroupId = ComplianceGroupId;
    }

    /**
     * Get 合规组名称 
     * @return ComplianceGroupName 合规组名称
     */
    public String getComplianceGroupName() {
        return this.ComplianceGroupName;
    }

    /**
     * Set 合规组名称
     * @param ComplianceGroupName 合规组名称
     */
    public void setComplianceGroupName(String ComplianceGroupName) {
        this.ComplianceGroupName = ComplianceGroupName;
    }

    public ScanTaskComplianceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskComplianceInfo(ScanTaskComplianceInfo source) {
        if (source.ComplianceGroupId != null) {
            this.ComplianceGroupId = new Long(source.ComplianceGroupId);
        }
        if (source.ComplianceGroupName != null) {
            this.ComplianceGroupName = new String(source.ComplianceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceGroupId", this.ComplianceGroupId);
        this.setParamSimple(map, prefix + "ComplianceGroupName", this.ComplianceGroupName);

    }
}

