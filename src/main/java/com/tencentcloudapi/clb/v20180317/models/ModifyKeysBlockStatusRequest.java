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

public class ModifyKeysBlockStatusRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>是否停止使用</p>
    */
    @SerializedName("Blocked")
    @Expose
    private Boolean Blocked;

    /**
    * <p>需要修改的Key的ID列表</p>
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
     * Get <p>模型路由实例ID</p> 
     * @return ModelRouterId <p>模型路由实例ID</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID</p>
     * @param ModelRouterId <p>模型路由实例ID</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>是否停止使用</p> 
     * @return Blocked <p>是否停止使用</p>
     */
    public Boolean getBlocked() {
        return this.Blocked;
    }

    /**
     * Set <p>是否停止使用</p>
     * @param Blocked <p>是否停止使用</p>
     */
    public void setBlocked(Boolean Blocked) {
        this.Blocked = Blocked;
    }

    /**
     * Get <p>需要修改的Key的ID列表</p> 
     * @return KeyIds <p>需要修改的Key的ID列表</p>
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set <p>需要修改的Key的ID列表</p>
     * @param KeyIds <p>需要修改的Key的ID列表</p>
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    public ModifyKeysBlockStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKeysBlockStatusRequest(ModifyKeysBlockStatusRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.Blocked != null) {
            this.Blocked = new Boolean(source.Blocked);
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
        this.setParamSimple(map, prefix + "Blocked", this.Blocked);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);

    }
}

