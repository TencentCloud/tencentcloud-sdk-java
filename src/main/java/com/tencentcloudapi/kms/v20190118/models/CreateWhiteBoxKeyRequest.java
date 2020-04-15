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

public class CreateWhiteBoxKeyRequest extends AbstractModel{

    /**
    * 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。Alias不可重复。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 创建密钥所有的算法类型，支持的取值：AES_256,SM4
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * 密钥的描述，最大1024字节
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。Alias不可重复。 
     * @return Alias 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。Alias不可重复。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。Alias不可重复。
     * @param Alias 作为密钥更容易辨识，更容易被人看懂的别名， 不可为空，1-60个字母数字 - _ 的组合，首字符必须为字母或者数字。Alias不可重复。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 创建密钥所有的算法类型，支持的取值：AES_256,SM4 
     * @return Algorithm 创建密钥所有的算法类型，支持的取值：AES_256,SM4
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 创建密钥所有的算法类型，支持的取值：AES_256,SM4
     * @param Algorithm 创建密钥所有的算法类型，支持的取值：AES_256,SM4
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get 密钥的描述，最大1024字节 
     * @return Description 密钥的描述，最大1024字节
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 密钥的描述，最大1024字节
     * @param Description 密钥的描述，最大1024字节
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

