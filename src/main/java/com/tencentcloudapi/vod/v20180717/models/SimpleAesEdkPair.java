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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimpleAesEdkPair extends AbstractModel{

    /**
    * 加密后的数据密钥。
    */
    @SerializedName("Edk")
    @Expose
    private String Edk;

    /**
    * 数据密钥。返回的数据密钥 DK 为 Base64 编码字符串。
    */
    @SerializedName("Dk")
    @Expose
    private String Dk;

    /**
     * Get 加密后的数据密钥。 
     * @return Edk 加密后的数据密钥。
     */
    public String getEdk() {
        return this.Edk;
    }

    /**
     * Set 加密后的数据密钥。
     * @param Edk 加密后的数据密钥。
     */
    public void setEdk(String Edk) {
        this.Edk = Edk;
    }

    /**
     * Get 数据密钥。返回的数据密钥 DK 为 Base64 编码字符串。 
     * @return Dk 数据密钥。返回的数据密钥 DK 为 Base64 编码字符串。
     */
    public String getDk() {
        return this.Dk;
    }

    /**
     * Set 数据密钥。返回的数据密钥 DK 为 Base64 编码字符串。
     * @param Dk 数据密钥。返回的数据密钥 DK 为 Base64 编码字符串。
     */
    public void setDk(String Dk) {
        this.Dk = Dk;
    }

    public SimpleAesEdkPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleAesEdkPair(SimpleAesEdkPair source) {
        if (source.Edk != null) {
            this.Edk = new String(source.Edk);
        }
        if (source.Dk != null) {
            this.Dk = new String(source.Dk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Edk", this.Edk);
        this.setParamSimple(map, prefix + "Dk", this.Dk);

    }
}

