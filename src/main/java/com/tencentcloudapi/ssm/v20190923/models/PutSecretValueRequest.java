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

public class PutSecretValueRequest extends AbstractModel {

    /**
    * <p>指定需要增加版本的凭据名称。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>指定新增凭据版本的版本号。可选，未指定时由系统生成 UUID v4，并通过响应 VersionId 返回。</p><p>参数格式：最长64字节，使用字母、数字或 - _ . 的组合，并以字母或数字开头。</p><p>省略 VersionId 的每次调用都会生成新版本。需要识别同一版本或处理重试时，由调用方生成并复用 VersionId；已有版本号返回 ResourceInUse.VersionIdExists。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>二进制凭据信息，使用base64编码。<br>SecretBinary 和 SecretString 必须且只能设置一个。</p>
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * <p>文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。</p>
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
    * <p>为新增版本设置版本标签，仅支持 Stage_Current，大小写敏感。本接口仅支持自定义凭据。</p><p>入参限制：SecretString 和 SecretBinary 必须且只能指定一个非空值。</p>
    */
    @SerializedName("VersionStage")
    @Expose
    private String VersionStage;

    /**
     * Get <p>指定需要增加版本的凭据名称。</p> 
     * @return SecretName <p>指定需要增加版本的凭据名称。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>指定需要增加版本的凭据名称。</p>
     * @param SecretName <p>指定需要增加版本的凭据名称。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>指定新增凭据版本的版本号。可选，未指定时由系统生成 UUID v4，并通过响应 VersionId 返回。</p><p>参数格式：最长64字节，使用字母、数字或 - _ . 的组合，并以字母或数字开头。</p><p>省略 VersionId 的每次调用都会生成新版本。需要识别同一版本或处理重试时，由调用方生成并复用 VersionId；已有版本号返回 ResourceInUse.VersionIdExists。</p> 
     * @return VersionId <p>指定新增凭据版本的版本号。可选，未指定时由系统生成 UUID v4，并通过响应 VersionId 返回。</p><p>参数格式：最长64字节，使用字母、数字或 - _ . 的组合，并以字母或数字开头。</p><p>省略 VersionId 的每次调用都会生成新版本。需要识别同一版本或处理重试时，由调用方生成并复用 VersionId；已有版本号返回 ResourceInUse.VersionIdExists。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>指定新增凭据版本的版本号。可选，未指定时由系统生成 UUID v4，并通过响应 VersionId 返回。</p><p>参数格式：最长64字节，使用字母、数字或 - _ . 的组合，并以字母或数字开头。</p><p>省略 VersionId 的每次调用都会生成新版本。需要识别同一版本或处理重试时，由调用方生成并复用 VersionId；已有版本号返回 ResourceInUse.VersionIdExists。</p>
     * @param VersionId <p>指定新增凭据版本的版本号。可选，未指定时由系统生成 UUID v4，并通过响应 VersionId 返回。</p><p>参数格式：最长64字节，使用字母、数字或 - _ . 的组合，并以字母或数字开头。</p><p>省略 VersionId 的每次调用都会生成新版本。需要识别同一版本或处理重试时，由调用方生成并复用 VersionId；已有版本号返回 ResourceInUse.VersionIdExists。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>二进制凭据信息，使用base64编码。<br>SecretBinary 和 SecretString 必须且只能设置一个。</p> 
     * @return SecretBinary <p>二进制凭据信息，使用base64编码。<br>SecretBinary 和 SecretString 必须且只能设置一个。</p>
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set <p>二进制凭据信息，使用base64编码。<br>SecretBinary 和 SecretString 必须且只能设置一个。</p>
     * @param SecretBinary <p>二进制凭据信息，使用base64编码。<br>SecretBinary 和 SecretString 必须且只能设置一个。</p>
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get <p>文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。</p> 
     * @return SecretString <p>文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。</p>
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set <p>文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。</p>
     * @param SecretString <p>文本类型凭据信息明文（不需要进行base64编码），SecretBinary 和 SecretString 必须且只能设置一个。</p>
     */
    public void setSecretString(String SecretString) {
        this.SecretString = SecretString;
    }

    /**
     * Get <p>为新增版本设置版本标签，仅支持 Stage_Current，大小写敏感。本接口仅支持自定义凭据。</p><p>入参限制：SecretString 和 SecretBinary 必须且只能指定一个非空值。</p> 
     * @return VersionStage <p>为新增版本设置版本标签，仅支持 Stage_Current，大小写敏感。本接口仅支持自定义凭据。</p><p>入参限制：SecretString 和 SecretBinary 必须且只能指定一个非空值。</p>
     */
    public String getVersionStage() {
        return this.VersionStage;
    }

    /**
     * Set <p>为新增版本设置版本标签，仅支持 Stage_Current，大小写敏感。本接口仅支持自定义凭据。</p><p>入参限制：SecretString 和 SecretBinary 必须且只能指定一个非空值。</p>
     * @param VersionStage <p>为新增版本设置版本标签，仅支持 Stage_Current，大小写敏感。本接口仅支持自定义凭据。</p><p>入参限制：SecretString 和 SecretBinary 必须且只能指定一个非空值。</p>
     */
    public void setVersionStage(String VersionStage) {
        this.VersionStage = VersionStage;
    }

    public PutSecretValueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutSecretValueRequest(PutSecretValueRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.SecretBinary != null) {
            this.SecretBinary = new String(source.SecretBinary);
        }
        if (source.SecretString != null) {
            this.SecretString = new String(source.SecretString);
        }
        if (source.VersionStage != null) {
            this.VersionStage = new String(source.VersionStage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "SecretBinary", this.SecretBinary);
        this.setParamSimple(map, prefix + "SecretString", this.SecretString);
        this.setParamSimple(map, prefix + "VersionStage", this.VersionStage);

    }
}

