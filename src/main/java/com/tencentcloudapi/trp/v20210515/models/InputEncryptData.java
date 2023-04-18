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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputEncryptData extends AbstractModel{

    /**
    * 加密方式，0：AES加密；

    */
    @SerializedName("EncryptMethod")
    @Expose
    private Long EncryptMethod;

    /**
    * 加密算法中的块处理模式，1：CBC模式； 目前只支持CBC模式
    */
    @SerializedName("EncryptMode")
    @Expose
    private Long EncryptMode;

    /**
    * 填充模式，0：ZeroPadding；1：PKCS5Padding；2：
PKCS7Padding。
    */
    @SerializedName("PaddingType")
    @Expose
    private Long PaddingType;

    /**
    * 加密数据，将AuthorizedData结构体数组（数组最大长度不超过20）序列化成JSON字符串，对得到的字符串加密并填充到该字段。
    */
    @SerializedName("EncryptData")
    @Expose
    private String EncryptData;

    /**
    * 用户是否授权，本接口取值：1，已授权。

    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
     * Get 加密方式，0：AES加密；
 
     * @return EncryptMethod 加密方式，0：AES加密；

     */
    public Long getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set 加密方式，0：AES加密；

     * @param EncryptMethod 加密方式，0：AES加密；

     */
    public void setEncryptMethod(Long EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    /**
     * Get 加密算法中的块处理模式，1：CBC模式； 目前只支持CBC模式 
     * @return EncryptMode 加密算法中的块处理模式，1：CBC模式； 目前只支持CBC模式
     */
    public Long getEncryptMode() {
        return this.EncryptMode;
    }

    /**
     * Set 加密算法中的块处理模式，1：CBC模式； 目前只支持CBC模式
     * @param EncryptMode 加密算法中的块处理模式，1：CBC模式； 目前只支持CBC模式
     */
    public void setEncryptMode(Long EncryptMode) {
        this.EncryptMode = EncryptMode;
    }

    /**
     * Get 填充模式，0：ZeroPadding；1：PKCS5Padding；2：
PKCS7Padding。 
     * @return PaddingType 填充模式，0：ZeroPadding；1：PKCS5Padding；2：
PKCS7Padding。
     */
    public Long getPaddingType() {
        return this.PaddingType;
    }

    /**
     * Set 填充模式，0：ZeroPadding；1：PKCS5Padding；2：
PKCS7Padding。
     * @param PaddingType 填充模式，0：ZeroPadding；1：PKCS5Padding；2：
PKCS7Padding。
     */
    public void setPaddingType(Long PaddingType) {
        this.PaddingType = PaddingType;
    }

    /**
     * Get 加密数据，将AuthorizedData结构体数组（数组最大长度不超过20）序列化成JSON字符串，对得到的字符串加密并填充到该字段。 
     * @return EncryptData 加密数据，将AuthorizedData结构体数组（数组最大长度不超过20）序列化成JSON字符串，对得到的字符串加密并填充到该字段。
     */
    public String getEncryptData() {
        return this.EncryptData;
    }

    /**
     * Set 加密数据，将AuthorizedData结构体数组（数组最大长度不超过20）序列化成JSON字符串，对得到的字符串加密并填充到该字段。
     * @param EncryptData 加密数据，将AuthorizedData结构体数组（数组最大长度不超过20）序列化成JSON字符串，对得到的字符串加密并填充到该字段。
     */
    public void setEncryptData(String EncryptData) {
        this.EncryptData = EncryptData;
    }

    /**
     * Get 用户是否授权，本接口取值：1，已授权。
 
     * @return IsAuthorized 用户是否授权，本接口取值：1，已授权。

     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set 用户是否授权，本接口取值：1，已授权。

     * @param IsAuthorized 用户是否授权，本接口取值：1，已授权。

     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    public InputEncryptData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputEncryptData(InputEncryptData source) {
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new Long(source.EncryptMethod);
        }
        if (source.EncryptMode != null) {
            this.EncryptMode = new Long(source.EncryptMode);
        }
        if (source.PaddingType != null) {
            this.PaddingType = new Long(source.PaddingType);
        }
        if (source.EncryptData != null) {
            this.EncryptData = new String(source.EncryptData);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);
        this.setParamSimple(map, prefix + "EncryptMode", this.EncryptMode);
        this.setParamSimple(map, prefix + "PaddingType", this.PaddingType);
        this.setParamSimple(map, prefix + "EncryptData", this.EncryptData);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);

    }
}

