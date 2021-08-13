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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceGroupRequest extends AbstractModel{

    /**
    * 组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 上级组id
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
     * Get 组id 
     * @return GroupId 组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 组id
     * @param GroupId 组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 组名称 
     * @return GroupName 组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 组名称
     * @param GroupName 组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 上级组id 
     * @return ParentId 上级组id
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 上级组id
     * @param ParentId 上级组id
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    public ModifyResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceGroupRequest(ModifyResourceGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

