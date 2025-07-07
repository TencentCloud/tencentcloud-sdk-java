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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateOrganizationRequest extends AbstractModel {

    /**
    * 组织ID（从查询组织接口DescribeOrganization中获取）
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 组织名称，支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过64位，且组织名称不能重复
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 组织ID（从查询组织接口DescribeOrganization中获取） 
     * @return OrganizationId 组织ID（从查询组织接口DescribeOrganization中获取）
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 组织ID（从查询组织接口DescribeOrganization中获取）
     * @param OrganizationId 组织ID（从查询组织接口DescribeOrganization中获取）
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 组织名称，支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过64位，且组织名称不能重复 
     * @return Name 组织名称，支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过64位，且组织名称不能重复
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组织名称，支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过64位，且组织名称不能重复
     * @param Name 组织名称，支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过64位，且组织名称不能重复
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public UpdateOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrganizationRequest(UpdateOrganizationRequest source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

