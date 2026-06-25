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

public class ModifyKeyAttributesRequest extends AbstractModel {

    /**
    * <p>模型路由实例ID</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>API Key的ID</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>Key的名称</p>
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * <p>限速配置</p>
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfigForKey RateLimitConfig;

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
     * Get <p>API Key的ID</p> 
     * @return KeyId <p>API Key的ID</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>API Key的ID</p>
     * @param KeyId <p>API Key的ID</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>Key的名称</p> 
     * @return KeyName <p>Key的名称</p>
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set <p>Key的名称</p>
     * @param KeyName <p>Key的名称</p>
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get <p>限速配置</p> 
     * @return RateLimitConfig <p>限速配置</p>
     */
    public RateLimitConfigForKey getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set <p>限速配置</p>
     * @param RateLimitConfig <p>限速配置</p>
     */
    public void setRateLimitConfig(RateLimitConfigForKey RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    public ModifyKeyAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKeyAttributesRequest(ModifyKeyAttributesRequest source) {
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfigForKey(source.RateLimitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);

    }
}

