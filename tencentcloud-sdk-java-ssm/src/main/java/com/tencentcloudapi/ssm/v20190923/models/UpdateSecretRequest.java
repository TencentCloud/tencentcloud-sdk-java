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

public class UpdateSecretRequest extends AbstractModel{

    /**
    * 指定需要更新凭据内容的名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 指定需要更新凭据内容的版本号。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 新的凭据内容为二进制的场景使用该字段，并使用base64进行编码。SecretBinary 和 SecretString 只能一个不为空。
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * 新的凭据内容为文本的场景使用该字段，不需要base64编码。SecretBinary 和 SecretString 只能一个不为空。
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
     * Get 指定需要更新凭据内容的名称。 
     * @return SecretName 指定需要更新凭据内容的名称。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 指定需要更新凭据内容的名称。
     * @param SecretName 指定需要更新凭据内容的名称。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 指定需要更新凭据内容的版本号。 
     * @return VersionId 指定需要更新凭据内容的版本号。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 指定需要更新凭据内容的版本号。
     * @param VersionId 指定需要更新凭据内容的版本号。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 新的凭据内容为二进制的场景使用该字段，并使用base64进行编码。SecretBinary 和 SecretString 只能一个不为空。 
     * @return SecretBinary 新的凭据内容为二进制的场景使用该字段，并使用base64进行编码。SecretBinary 和 SecretString 只能一个不为空。
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set 新的凭据内容为二进制的场景使用该字段，并使用base64进行编码。SecretBinary 和 SecretString 只能一个不为空。
     * @param SecretBinary 新的凭据内容为二进制的场景使用该字段，并使用base64进行编码。SecretBinary 和 SecretString 只能一个不为空。
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get 新的凭据内容为文本的场景使用该字段，不需要base64编码。SecretBinary 和 SecretString 只能一个不为空。 
     * @return SecretString 新的凭据内容为文本的场景使用该字段，不需要base64编码。SecretBinary 和 SecretString 只能一个不为空。
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set 新的凭据内容为文本的场景使用该字段，不需要base64编码。SecretBinary 和 SecretString 只能一个不为空。
     * @param SecretString 新的凭据内容为文本的场景使用该字段，不需要base64编码。SecretBinary 和 SecretString 只能一个不为空。
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

