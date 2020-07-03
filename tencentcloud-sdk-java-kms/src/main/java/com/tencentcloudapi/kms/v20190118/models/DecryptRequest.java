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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DecryptRequest extends AbstractModel{

    /**
    * 待解密的密文数据
    */
    @SerializedName("CiphertextBlob")
    @Expose
    private String CiphertextBlob;

    /**
    * key/value对的json字符串，如果Encrypt指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024字符
    */
    @SerializedName("EncryptionContext")
    @Expose
    private String EncryptionContext;

    /**
     * Get 待解密的密文数据 
     * @return CiphertextBlob 待解密的密文数据
     */
    public String getCiphertextBlob() {
        return this.CiphertextBlob;
    }

    /**
     * Set 待解密的密文数据
     * @param CiphertextBlob 待解密的密文数据
     */
    public void setCiphertextBlob(String CiphertextBlob) {
        this.CiphertextBlob = CiphertextBlob;
    }

    /**
     * Get key/value对的json字符串，如果Encrypt指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024字符 
     * @return EncryptionContext key/value对的json字符串，如果Encrypt指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024字符
     */
    public String getEncryptionContext() {
        return this.EncryptionContext;
    }

    /**
     * Set key/value对的json字符串，如果Encrypt指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024字符
     * @param EncryptionContext key/value对的json字符串，如果Encrypt指定了该参数，则在调用Decrypt API时需要提供同样的参数，最大支持1024字符
     */
    public void setEncryptionContext(String EncryptionContext) {
        this.EncryptionContext = EncryptionContext;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CiphertextBlob", this.CiphertextBlob);
        this.setParamSimple(map, prefix + "EncryptionContext", this.EncryptionContext);

    }
}

