/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportKeyPairRequest extends AbstractModel{

    /**
    * 密钥对名称，可由数字，字母和下划线组成，长度不超过 25 个字符。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 密钥对的公钥内容， OpenSSH RSA 格式。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
     * Get 密钥对名称，可由数字，字母和下划线组成，长度不超过 25 个字符。 
     * @return KeyName 密钥对名称，可由数字，字母和下划线组成，长度不超过 25 个字符。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 密钥对名称，可由数字，字母和下划线组成，长度不超过 25 个字符。
     * @param KeyName 密钥对名称，可由数字，字母和下划线组成，长度不超过 25 个字符。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 密钥对的公钥内容， OpenSSH RSA 格式。 
     * @return PublicKey 密钥对的公钥内容， OpenSSH RSA 格式。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 密钥对的公钥内容， OpenSSH RSA 格式。
     * @param PublicKey 密钥对的公钥内容， OpenSSH RSA 格式。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    public ImportKeyPairRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportKeyPairRequest(ImportKeyPairRequest source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);

    }
}

