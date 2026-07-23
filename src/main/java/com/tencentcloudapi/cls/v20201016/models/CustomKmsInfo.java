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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomKmsInfo extends AbstractModel {

    /**
    * <p>KMS支持的地域，详见 腾讯云-密钥管理系统 官方文档</p><p>参数格式：ap-guangzhou</p>
    */
    @SerializedName("KmsRegion")
    @Expose
    private String KmsRegion;

    /**
    * <p>KMS秘钥ID</p>
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
     * Get <p>KMS支持的地域，详见 腾讯云-密钥管理系统 官方文档</p><p>参数格式：ap-guangzhou</p> 
     * @return KmsRegion <p>KMS支持的地域，详见 腾讯云-密钥管理系统 官方文档</p><p>参数格式：ap-guangzhou</p>
     */
    public String getKmsRegion() {
        return this.KmsRegion;
    }

    /**
     * Set <p>KMS支持的地域，详见 腾讯云-密钥管理系统 官方文档</p><p>参数格式：ap-guangzhou</p>
     * @param KmsRegion <p>KMS支持的地域，详见 腾讯云-密钥管理系统 官方文档</p><p>参数格式：ap-guangzhou</p>
     */
    public void setKmsRegion(String KmsRegion) {
        this.KmsRegion = KmsRegion;
    }

    /**
     * Get <p>KMS秘钥ID</p> 
     * @return KmsKeyId <p>KMS秘钥ID</p>
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set <p>KMS秘钥ID</p>
     * @param KmsKeyId <p>KMS秘钥ID</p>
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    public CustomKmsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomKmsInfo(CustomKmsInfo source) {
        if (source.KmsRegion != null) {
            this.KmsRegion = new String(source.KmsRegion);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KmsRegion", this.KmsRegion);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);

    }
}

