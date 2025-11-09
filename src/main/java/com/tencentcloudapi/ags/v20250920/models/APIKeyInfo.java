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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class APIKeyInfo extends AbstractModel {

    /**
    * API密钥名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * API密钥ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 密钥状态。可以为API_KEY_STATUS_ACTIVE，或API_KEY_STATUS_INACTIVE
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 隐藏部分字符的API密钥，方便用户辨认
    */
    @SerializedName("MaskedKey")
    @Expose
    private String MaskedKey;

    /**
    * API密钥创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get API密钥名称 
     * @return Name API密钥名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API密钥名称
     * @param Name API密钥名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get API密钥ID 
     * @return KeyId API密钥ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set API密钥ID
     * @param KeyId API密钥ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 密钥状态。可以为API_KEY_STATUS_ACTIVE，或API_KEY_STATUS_INACTIVE 
     * @return Status 密钥状态。可以为API_KEY_STATUS_ACTIVE，或API_KEY_STATUS_INACTIVE
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 密钥状态。可以为API_KEY_STATUS_ACTIVE，或API_KEY_STATUS_INACTIVE
     * @param Status 密钥状态。可以为API_KEY_STATUS_ACTIVE，或API_KEY_STATUS_INACTIVE
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 隐藏部分字符的API密钥，方便用户辨认 
     * @return MaskedKey 隐藏部分字符的API密钥，方便用户辨认
     */
    public String getMaskedKey() {
        return this.MaskedKey;
    }

    /**
     * Set 隐藏部分字符的API密钥，方便用户辨认
     * @param MaskedKey 隐藏部分字符的API密钥，方便用户辨认
     */
    public void setMaskedKey(String MaskedKey) {
        this.MaskedKey = MaskedKey;
    }

    /**
     * Get API密钥创建时间 
     * @return CreatedAt API密钥创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set API密钥创建时间
     * @param CreatedAt API密钥创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public APIKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIKeyInfo(APIKeyInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MaskedKey != null) {
            this.MaskedKey = new String(source.MaskedKey);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MaskedKey", this.MaskedKey);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

