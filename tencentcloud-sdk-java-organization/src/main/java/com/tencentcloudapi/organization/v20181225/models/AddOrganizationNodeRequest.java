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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOrganizationNodeRequest extends AbstractModel{

    /**
    * 父组织单元ID
    */
    @SerializedName("ParentNodeId")
    @Expose
    private Long ParentNodeId;

    /**
    * 组织单元名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 父组织单元ID 
     * @return ParentNodeId 父组织单元ID
     */
    public Long getParentNodeId() {
        return this.ParentNodeId;
    }

    /**
     * Set 父组织单元ID
     * @param ParentNodeId 父组织单元ID
     */
    public void setParentNodeId(Long ParentNodeId) {
        this.ParentNodeId = ParentNodeId;
    }

    /**
     * Get 组织单元名字 
     * @return Name 组织单元名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组织单元名字
     * @param Name 组织单元名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentNodeId", this.ParentNodeId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

