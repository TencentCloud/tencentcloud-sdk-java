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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOrganizationRequest extends AbstractModel{

    /**
    * 组织名称（仅支持中文、英文、数字、_、-的组合，长度不超过16个字符，且组织名称不能重复）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 组织父节点 ID（从查询组织接口DescribeOrganization中获取，填0代表根组织）
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
     * Get 组织名称（仅支持中文、英文、数字、_、-的组合，长度不超过16个字符，且组织名称不能重复） 
     * @return Name 组织名称（仅支持中文、英文、数字、_、-的组合，长度不超过16个字符，且组织名称不能重复）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组织名称（仅支持中文、英文、数字、_、-的组合，长度不超过16个字符，且组织名称不能重复）
     * @param Name 组织名称（仅支持中文、英文、数字、_、-的组合，长度不超过16个字符，且组织名称不能重复）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 组织父节点 ID（从查询组织接口DescribeOrganization中获取，填0代表根组织） 
     * @return ParentId 组织父节点 ID（从查询组织接口DescribeOrganization中获取，填0代表根组织）
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 组织父节点 ID（从查询组织接口DescribeOrganization中获取，填0代表根组织）
     * @param ParentId 组织父节点 ID（从查询组织接口DescribeOrganization中获取，填0代表根组织）
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    public AddOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOrganizationRequest(AddOrganizationRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

