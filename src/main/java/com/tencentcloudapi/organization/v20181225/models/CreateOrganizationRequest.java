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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationRequest extends AbstractModel {

    /**
    * 组织类型（目前固定为1）
    */
    @SerializedName("OrgType")
    @Expose
    private Long OrgType;

    /**
     * Get 组织类型（目前固定为1） 
     * @return OrgType 组织类型（目前固定为1）
     */
    public Long getOrgType() {
        return this.OrgType;
    }

    /**
     * Set 组织类型（目前固定为1）
     * @param OrgType 组织类型（目前固定为1）
     */
    public void setOrgType(Long OrgType) {
        this.OrgType = OrgType;
    }

    public CreateOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationRequest(CreateOrganizationRequest source) {
        if (source.OrgType != null) {
            this.OrgType = new Long(source.OrgType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgType", this.OrgType);

    }
}

