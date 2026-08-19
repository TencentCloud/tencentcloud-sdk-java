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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSecretValueRequest extends AbstractModel {

    /**
    * 指定凭据的名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 指定对应凭据的版本号。
对于云产品凭据如Mysql凭据，通过指定凭据名称和历史版本号来获取历史轮转凭据的明文信息，如果要获取当前正在使用的凭据版本的明文，需要将版本号指定为：SSM_Current。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 
    */
    @SerializedName("EncryptionPublicKey")
    @Expose
    private String EncryptionPublicKey;

    /**
    * 
    */
    @SerializedName("EncryptionAlgorithm")
    @Expose
    private String EncryptionAlgorithm;

    /**
     * Get 指定凭据的名称。 
     * @return SecretName 指定凭据的名称。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 指定凭据的名称。
     * @param SecretName 指定凭据的名称。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 指定对应凭据的版本号。
对于云产品凭据如Mysql凭据，通过指定凭据名称和历史版本号来获取历史轮转凭据的明文信息，如果要获取当前正在使用的凭据版本的明文，需要将版本号指定为：SSM_Current。 
     * @return VersionId 指定对应凭据的版本号。
对于云产品凭据如Mysql凭据，通过指定凭据名称和历史版本号来获取历史轮转凭据的明文信息，如果要获取当前正在使用的凭据版本的明文，需要将版本号指定为：SSM_Current。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 指定对应凭据的版本号。
对于云产品凭据如Mysql凭据，通过指定凭据名称和历史版本号来获取历史轮转凭据的明文信息，如果要获取当前正在使用的凭据版本的明文，需要将版本号指定为：SSM_Current。
     * @param VersionId 指定对应凭据的版本号。
对于云产品凭据如Mysql凭据，通过指定凭据名称和历史版本号来获取历史轮转凭据的明文信息，如果要获取当前正在使用的凭据版本的明文，需要将版本号指定为：SSM_Current。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get  
     * @return EncryptionPublicKey 
     */
    public String getEncryptionPublicKey() {
        return this.EncryptionPublicKey;
    }

    /**
     * Set 
     * @param EncryptionPublicKey 
     */
    public void setEncryptionPublicKey(String EncryptionPublicKey) {
        this.EncryptionPublicKey = EncryptionPublicKey;
    }

    /**
     * Get  
     * @return EncryptionAlgorithm 
     */
    public String getEncryptionAlgorithm() {
        return this.EncryptionAlgorithm;
    }

    /**
     * Set 
     * @param EncryptionAlgorithm 
     */
    public void setEncryptionAlgorithm(String EncryptionAlgorithm) {
        this.EncryptionAlgorithm = EncryptionAlgorithm;
    }

    public GetSecretValueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSecretValueRequest(GetSecretValueRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.EncryptionPublicKey != null) {
            this.EncryptionPublicKey = new String(source.EncryptionPublicKey);
        }
        if (source.EncryptionAlgorithm != null) {
            this.EncryptionAlgorithm = new String(source.EncryptionAlgorithm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "EncryptionPublicKey", this.EncryptionPublicKey);
        this.setParamSimple(map, prefix + "EncryptionAlgorithm", this.EncryptionAlgorithm);

    }
}

