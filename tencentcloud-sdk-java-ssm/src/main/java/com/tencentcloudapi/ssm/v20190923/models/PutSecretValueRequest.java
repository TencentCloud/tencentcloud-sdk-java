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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutSecretValueRequest extends AbstractModel{

    /**
    * 指定需要增加版本的凭据名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 指定新增加的版本号，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 二进制凭据信息，使用base64编码。SecretBinary 和 SecretString 必须且只能设置一个。
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * 文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
     * Get 指定需要增加版本的凭据名称。 
     * @return SecretName 指定需要增加版本的凭据名称。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 指定需要增加版本的凭据名称。
     * @param SecretName 指定需要增加版本的凭据名称。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 指定新增加的版本号，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。 
     * @return VersionId 指定新增加的版本号，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 指定新增加的版本号，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。
     * @param VersionId 指定新增加的版本号，最长64 字节，使用字母、数字或者 - _ . 的组合并且以字母或数字开头。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 二进制凭据信息，使用base64编码。SecretBinary 和 SecretString 必须且只能设置一个。 
     * @return SecretBinary 二进制凭据信息，使用base64编码。SecretBinary 和 SecretString 必须且只能设置一个。
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set 二进制凭据信息，使用base64编码。SecretBinary 和 SecretString 必须且只能设置一个。
     * @param SecretBinary 二进制凭据信息，使用base64编码。SecretBinary 和 SecretString 必须且只能设置一个。
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get 文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。 
     * @return SecretString 文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set 文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。
     * @param SecretString 文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。
     */
    public void setSecretString(String SecretString) {
        this.SecretString = SecretString;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "SecretBinary", this.SecretBinary);
        this.setParamSimple(map, prefix + "SecretString", this.SecretString);

    }
}

