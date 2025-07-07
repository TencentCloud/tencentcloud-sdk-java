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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuitOrganizationRequest extends AbstractModel {

    /**
    * 企业组织ID
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
     * Get 企业组织ID 
     * @return OrgId 企业组织ID
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 企业组织ID
     * @param OrgId 企业组织ID
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    public QuitOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuitOrganizationRequest(QuitOrganizationRequest source) {
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);

    }
}

