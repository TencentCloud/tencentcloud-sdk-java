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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublicEncryptKeyData extends AbstractModel {

    /**
    * <p>返回公钥，base64编码后返回，使用需要base64解码</p>
    */
    @SerializedName("PublicEncryptKey")
    @Expose
    private String PublicEncryptKey;

    /**
     * Get <p>返回公钥，base64编码后返回，使用需要base64解码</p> 
     * @return PublicEncryptKey <p>返回公钥，base64编码后返回，使用需要base64解码</p>
     */
    public String getPublicEncryptKey() {
        return this.PublicEncryptKey;
    }

    /**
     * Set <p>返回公钥，base64编码后返回，使用需要base64解码</p>
     * @param PublicEncryptKey <p>返回公钥，base64编码后返回，使用需要base64解码</p>
     */
    public void setPublicEncryptKey(String PublicEncryptKey) {
        this.PublicEncryptKey = PublicEncryptKey;
    }

    public DescribePublicEncryptKeyData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePublicEncryptKeyData(DescribePublicEncryptKeyData source) {
        if (source.PublicEncryptKey != null) {
            this.PublicEncryptKey = new String(source.PublicEncryptKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicEncryptKey", this.PublicEncryptKey);

    }
}

