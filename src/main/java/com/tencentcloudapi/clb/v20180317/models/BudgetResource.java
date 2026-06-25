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

public class BudgetResource extends AbstractModel {

    /**
    * <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示要关联的实例；当Type为Key时表示Key所属实例。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li><li>UserGroup：用户组（Type 为 UserGroup 时需传 UserGroupId）</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Key ID。</p><p>字段本身选填；当Type为Key时必填，当Type为ModelRouter时不传。</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>用户组ID</p>
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
     * Get <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示要关联的实例；当Type为Key时表示Key所属实例。</p> 
     * @return ModelRouterId <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示要关联的实例；当Type为Key时表示Key所属实例。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示要关联的实例；当Type为Key时表示Key所属实例。</p>
     * @param ModelRouterId <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示要关联的实例；当Type为Key时表示Key所属实例。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li><li>UserGroup：用户组（Type 为 UserGroup 时需传 UserGroupId）</li></ul> 
     * @return Type <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li><li>UserGroup：用户组（Type 为 UserGroup 时需传 UserGroupId）</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li><li>UserGroup：用户组（Type 为 UserGroup 时需传 UserGroupId）</li></ul>
     * @param Type <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li><li>UserGroup：用户组（Type 为 UserGroup 时需传 UserGroupId）</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Key ID。</p><p>字段本身选填；当Type为Key时必填，当Type为ModelRouter时不传。</p> 
     * @return KeyId <p>Key ID。</p><p>字段本身选填；当Type为Key时必填，当Type为ModelRouter时不传。</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>Key ID。</p><p>字段本身选填；当Type为Key时必填，当Type为ModelRouter时不传。</p>
     * @param KeyId <p>Key ID。</p><p>字段本身选填；当Type为Key时必填，当Type为ModelRouter时不传。</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>用户组ID</p> 
     * @return UserGroupId <p>用户组ID</p>
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set <p>用户组ID</p>
     * @param UserGroupId <p>用户组ID</p>
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    public BudgetResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetResource(BudgetResource source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);

    }
}

