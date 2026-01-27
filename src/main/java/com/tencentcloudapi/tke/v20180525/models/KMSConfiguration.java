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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KMSConfiguration extends AbstractModel {

    /**
    * 自定义密钥,当不指定KeyId时，采用默认生成密钥（TKE-KMS）
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 默认生成密钥或自定义密钥地域信息
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
     * Get 自定义密钥,当不指定KeyId时，采用默认生成密钥（TKE-KMS） 
     * @return KeyId 自定义密钥,当不指定KeyId时，采用默认生成密钥（TKE-KMS）
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 自定义密钥,当不指定KeyId时，采用默认生成密钥（TKE-KMS）
     * @param KeyId 自定义密钥,当不指定KeyId时，采用默认生成密钥（TKE-KMS）
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 默认生成密钥或自定义密钥地域信息 
     * @return KmsRegion 默认生成密钥或自定义密钥地域信息
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set 默认生成密钥或自定义密钥地域信息
     * @param KmsRegion 默认生成密钥或自定义密钥地域信息
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    public KMSConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KMSConfiguration(KMSConfiguration source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);

    }
}

