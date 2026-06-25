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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyKeysUserGroupRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>目标归属用户组ID。传真实用户组ID表示批量入组或跨组移动（Key 已属其它组则改为目标组）；传 ugrp-ungrouped 表示批量移出到未分组。</p>
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * <p>待变更归属的 Key ID 列表，单次1-100个。</p>
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
     * Get <p>模型路由实例ID。</p> 
     * @return ModelRouterId <p>模型路由实例ID。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID。</p>
     * @param ModelRouterId <p>模型路由实例ID。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>目标归属用户组ID。传真实用户组ID表示批量入组或跨组移动（Key 已属其它组则改为目标组）；传 ugrp-ungrouped 表示批量移出到未分组。</p> 
     * @return UserGroupId <p>目标归属用户组ID。传真实用户组ID表示批量入组或跨组移动（Key 已属其它组则改为目标组）；传 ugrp-ungrouped 表示批量移出到未分组。</p>
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set <p>目标归属用户组ID。传真实用户组ID表示批量入组或跨组移动（Key 已属其它组则改为目标组）；传 ugrp-ungrouped 表示批量移出到未分组。</p>
     * @param UserGroupId <p>目标归属用户组ID。传真实用户组ID表示批量入组或跨组移动（Key 已属其它组则改为目标组）；传 ugrp-ungrouped 表示批量移出到未分组。</p>
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get <p>待变更归属的 Key ID 列表，单次1-100个。</p> 
     * @return KeyIds <p>待变更归属的 Key ID 列表，单次1-100个。</p>
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set <p>待变更归属的 Key ID 列表，单次1-100个。</p>
     * @param KeyIds <p>待变更归属的 Key ID 列表，单次1-100个。</p>
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    public ModifyKeysUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKeysUserGroupRequest(ModifyKeysUserGroupRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);

    }
}

