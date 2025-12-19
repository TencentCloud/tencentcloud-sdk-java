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
package com.tencentcloudapi.evt.v20250217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRoleUserRequest extends AbstractModel {

    /**
    * <p>自定义角色体系的ID</p>
    */
    @SerializedName("RoleSystemId")
    @Expose
    private Long RoleSystemId;

    /**
    * <p>需要删除的自定义用户ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>自定义角色体系的ID</p> 
     * @return RoleSystemId <p>自定义角色体系的ID</p>
     */
    public Long getRoleSystemId() {
        return this.RoleSystemId;
    }

    /**
     * Set <p>自定义角色体系的ID</p>
     * @param RoleSystemId <p>自定义角色体系的ID</p>
     */
    public void setRoleSystemId(Long RoleSystemId) {
        this.RoleSystemId = RoleSystemId;
    }

    /**
     * Get <p>需要删除的自定义用户ID</p> 
     * @return UserId <p>需要删除的自定义用户ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>需要删除的自定义用户ID</p>
     * @param UserId <p>需要删除的自定义用户ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DeleteRoleUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoleUserRequest(DeleteRoleUserRequest source) {
        if (source.RoleSystemId != null) {
            this.RoleSystemId = new Long(source.RoleSystemId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleSystemId", this.RoleSystemId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

