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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoleUserGrantRequest extends AbstractModel {

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>角色ID列表</p>
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * <p>用户UIN列表</p>
    */
    @SerializedName("SubUins")
    @Expose
    private String [] SubUins;

    /**
    * <p>授权方式</p>
    */
    @SerializedName("Grant")
    @Expose
    private String Grant;

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>角色ID列表</p> 
     * @return RoleIds <p>角色ID列表</p>
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set <p>角色ID列表</p>
     * @param RoleIds <p>角色ID列表</p>
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get <p>用户UIN列表</p> 
     * @return SubUins <p>用户UIN列表</p>
     */
    public String [] getSubUins() {
        return this.SubUins;
    }

    /**
     * Set <p>用户UIN列表</p>
     * @param SubUins <p>用户UIN列表</p>
     */
    public void setSubUins(String [] SubUins) {
        this.SubUins = SubUins;
    }

    /**
     * Get <p>授权方式</p> 
     * @return Grant <p>授权方式</p>
     */
    public String getGrant() {
        return this.Grant;
    }

    /**
     * Set <p>授权方式</p>
     * @param Grant <p>授权方式</p>
     */
    public void setGrant(String Grant) {
        this.Grant = Grant;
    }

    public ModifyRoleUserGrantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoleUserGrantRequest(ModifyRoleUserGrantRequest source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
        }
        if (source.SubUins != null) {
            this.SubUins = new String[source.SubUins.length];
            for (int i = 0; i < source.SubUins.length; i++) {
                this.SubUins[i] = new String(source.SubUins[i]);
            }
        }
        if (source.Grant != null) {
            this.Grant = new String(source.Grant);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamArraySimple(map, prefix + "SubUins.", this.SubUins);
        this.setParamSimple(map, prefix + "Grant", this.Grant);

    }
}

