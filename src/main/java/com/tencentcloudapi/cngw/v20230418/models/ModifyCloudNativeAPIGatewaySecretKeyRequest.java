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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudNativeAPIGatewaySecretKeyRequest extends AbstractModel {

    /**
    * 实例 ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 密钥名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 密钥id
    */
    @SerializedName("SecretKeyId")
    @Expose
    private String SecretKeyId;

    /**
    * 描述,200字以内
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 实例 ID 
     * @return GatewayId 实例 ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 实例 ID
     * @param GatewayId 实例 ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 密钥名字 
     * @return Name 密钥名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 密钥名字
     * @param Name 密钥名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 密钥id 
     * @return SecretKeyId 密钥id
     */
    public String getSecretKeyId() {
        return this.SecretKeyId;
    }

    /**
     * Set 密钥id
     * @param SecretKeyId 密钥id
     */
    public void setSecretKeyId(String SecretKeyId) {
        this.SecretKeyId = SecretKeyId;
    }

    /**
     * Get 描述,200字以内 
     * @return Description 描述,200字以内
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述,200字以内
     * @param Description 描述,200字以内
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyCloudNativeAPIGatewaySecretKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewaySecretKeyRequest(ModifyCloudNativeAPIGatewaySecretKeyRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SecretKeyId != null) {
            this.SecretKeyId = new String(source.SecretKeyId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SecretKeyId", this.SecretKeyId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

