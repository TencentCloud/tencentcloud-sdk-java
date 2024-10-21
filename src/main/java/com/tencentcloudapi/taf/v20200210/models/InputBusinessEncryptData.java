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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputBusinessEncryptData extends AbstractModel {

    /**
    * 加密方式；0：AES;1:DES
    */
    @SerializedName("EncryptMethod")
    @Expose
    private Long EncryptMethod;

    /**
    * 业务数据加密字符串
    */
    @SerializedName("EncryptData")
    @Expose
    private String EncryptData;

    /**
    * 加密模式；0：ECB,1:CBC;2:CTR;3:CFB;4:OFB
    */
    @SerializedName("EncryptMode")
    @Expose
    private Long EncryptMode;

    /**
    * 填充模式;0:ZERO ;1:PKCS5;3:PKCS7
    */
    @SerializedName("PaddingType")
    @Expose
    private Long PaddingType;

    /**
     * Get 加密方式；0：AES;1:DES 
     * @return EncryptMethod 加密方式；0：AES;1:DES
     */
    public Long getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set 加密方式；0：AES;1:DES
     * @param EncryptMethod 加密方式；0：AES;1:DES
     */
    public void setEncryptMethod(Long EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    /**
     * Get 业务数据加密字符串 
     * @return EncryptData 业务数据加密字符串
     */
    public String getEncryptData() {
        return this.EncryptData;
    }

    /**
     * Set 业务数据加密字符串
     * @param EncryptData 业务数据加密字符串
     */
    public void setEncryptData(String EncryptData) {
        this.EncryptData = EncryptData;
    }

    /**
     * Get 加密模式；0：ECB,1:CBC;2:CTR;3:CFB;4:OFB 
     * @return EncryptMode 加密模式；0：ECB,1:CBC;2:CTR;3:CFB;4:OFB
     */
    public Long getEncryptMode() {
        return this.EncryptMode;
    }

    /**
     * Set 加密模式；0：ECB,1:CBC;2:CTR;3:CFB;4:OFB
     * @param EncryptMode 加密模式；0：ECB,1:CBC;2:CTR;3:CFB;4:OFB
     */
    public void setEncryptMode(Long EncryptMode) {
        this.EncryptMode = EncryptMode;
    }

    /**
     * Get 填充模式;0:ZERO ;1:PKCS5;3:PKCS7 
     * @return PaddingType 填充模式;0:ZERO ;1:PKCS5;3:PKCS7
     */
    public Long getPaddingType() {
        return this.PaddingType;
    }

    /**
     * Set 填充模式;0:ZERO ;1:PKCS5;3:PKCS7
     * @param PaddingType 填充模式;0:ZERO ;1:PKCS5;3:PKCS7
     */
    public void setPaddingType(Long PaddingType) {
        this.PaddingType = PaddingType;
    }

    public InputBusinessEncryptData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputBusinessEncryptData(InputBusinessEncryptData source) {
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new Long(source.EncryptMethod);
        }
        if (source.EncryptData != null) {
            this.EncryptData = new String(source.EncryptData);
        }
        if (source.EncryptMode != null) {
            this.EncryptMode = new Long(source.EncryptMode);
        }
        if (source.PaddingType != null) {
            this.PaddingType = new Long(source.PaddingType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);
        this.setParamSimple(map, prefix + "EncryptData", this.EncryptData);
        this.setParamSimple(map, prefix + "EncryptMode", this.EncryptMode);
        this.setParamSimple(map, prefix + "PaddingType", this.PaddingType);

    }
}

