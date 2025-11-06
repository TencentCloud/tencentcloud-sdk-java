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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenClusterTransparentEncryptRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 秘钥类型(cloud,custom)
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * 秘钥Id
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 秘钥地域
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
    * 是否开启全局加密
    */
    @SerializedName("IsOpenGlobalEncryption")
    @Expose
    private Boolean IsOpenGlobalEncryption;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 秘钥类型(cloud,custom) 
     * @return KeyType 秘钥类型(cloud,custom)
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 秘钥类型(cloud,custom)
     * @param KeyType 秘钥类型(cloud,custom)
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get 秘钥Id 
     * @return KeyId 秘钥Id
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 秘钥Id
     * @param KeyId 秘钥Id
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 秘钥地域 
     * @return KeyRegion 秘钥地域
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set 秘钥地域
     * @param KeyRegion 秘钥地域
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    /**
     * Get 是否开启全局加密 
     * @return IsOpenGlobalEncryption 是否开启全局加密
     */
    public Boolean getIsOpenGlobalEncryption() {
        return this.IsOpenGlobalEncryption;
    }

    /**
     * Set 是否开启全局加密
     * @param IsOpenGlobalEncryption 是否开启全局加密
     */
    public void setIsOpenGlobalEncryption(Boolean IsOpenGlobalEncryption) {
        this.IsOpenGlobalEncryption = IsOpenGlobalEncryption;
    }

    public OpenClusterTransparentEncryptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenClusterTransparentEncryptRequest(OpenClusterTransparentEncryptRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
        if (source.IsOpenGlobalEncryption != null) {
            this.IsOpenGlobalEncryption = new Boolean(source.IsOpenGlobalEncryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);
        this.setParamSimple(map, prefix + "IsOpenGlobalEncryption", this.IsOpenGlobalEncryption);

    }
}

