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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagRoleRequest extends AbstractModel {

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private RoleTags [] Tags;

    /**
    * 角色名，与角色ID至少输入一个
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 角色ID，与角色名至少输入一个
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public RoleTags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(RoleTags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 角色名，与角色ID至少输入一个 
     * @return RoleName 角色名，与角色ID至少输入一个
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名，与角色ID至少输入一个
     * @param RoleName 角色名，与角色ID至少输入一个
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 角色ID，与角色名至少输入一个 
     * @return RoleId 角色ID，与角色名至少输入一个
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色ID，与角色名至少输入一个
     * @param RoleId 角色ID，与角色名至少输入一个
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    public TagRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagRoleRequest(TagRoleRequest source) {
        if (source.Tags != null) {
            this.Tags = new RoleTags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RoleTags(source.Tags[i]);
            }
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);

    }
}

