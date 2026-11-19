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

public class UpdateSecretRequest extends AbstractModel {

    /**
    * <p>指定需要更新凭据内容的名称。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>指定需要更新内容或设置版本标签的已有版本号，必填。</p><p>指定 VersionStage 时，将该标签迁移到此版本。目标版本不存在返回 ResourceNotFound；凭据处于 PendingCreate 或 CreateFailed 状态时返回 FailedOperation。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>新的二进制凭据内容，须使用 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p>
    */
    @SerializedName("SecretBinary")
    @Expose
    private String SecretBinary;

    /**
    * <p>新的文本凭据内容，无需 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p>
    */
    @SerializedName("SecretString")
    @Expose
    private String SecretString;

    /**
    * <p>将 Stage_Current 标签设置或迁移到 VersionId 指定的已有版本，大小写敏感。</p><p>入参限制：支持自定义、云产品及 Redis/MongoDB 凭据；VersionId 必填。</p><p>自定义凭据可仅设置标签，也可同时更新内容；SecretString 和 SecretBinary 不能同时非空。云产品及 Redis/MongoDB 仅支持标签操作，两项内容均须省略。标签绑定版本号，原轮转流程保持不变；绑定历史版本不保证账密仍有效。</p>
    */
    @SerializedName("VersionStage")
    @Expose
    private String VersionStage;

    /**
     * Get <p>指定需要更新凭据内容的名称。</p> 
     * @return SecretName <p>指定需要更新凭据内容的名称。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>指定需要更新凭据内容的名称。</p>
     * @param SecretName <p>指定需要更新凭据内容的名称。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>指定需要更新内容或设置版本标签的已有版本号，必填。</p><p>指定 VersionStage 时，将该标签迁移到此版本。目标版本不存在返回 ResourceNotFound；凭据处于 PendingCreate 或 CreateFailed 状态时返回 FailedOperation。</p> 
     * @return VersionId <p>指定需要更新内容或设置版本标签的已有版本号，必填。</p><p>指定 VersionStage 时，将该标签迁移到此版本。目标版本不存在返回 ResourceNotFound；凭据处于 PendingCreate 或 CreateFailed 状态时返回 FailedOperation。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>指定需要更新内容或设置版本标签的已有版本号，必填。</p><p>指定 VersionStage 时，将该标签迁移到此版本。目标版本不存在返回 ResourceNotFound；凭据处于 PendingCreate 或 CreateFailed 状态时返回 FailedOperation。</p>
     * @param VersionId <p>指定需要更新内容或设置版本标签的已有版本号，必填。</p><p>指定 VersionStage 时，将该标签迁移到此版本。目标版本不存在返回 ResourceNotFound；凭据处于 PendingCreate 或 CreateFailed 状态时返回 FailedOperation。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>新的二进制凭据内容，须使用 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p> 
     * @return SecretBinary <p>新的二进制凭据内容，须使用 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p>
     */
    public String getSecretBinary() {
        return this.SecretBinary;
    }

    /**
     * Set <p>新的二进制凭据内容，须使用 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p>
     * @param SecretBinary <p>新的二进制凭据内容，须使用 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p>
     */
    public void setSecretBinary(String SecretBinary) {
        this.SecretBinary = SecretBinary;
    }

    /**
     * Get <p>新的文本凭据内容，无需 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p> 
     * @return SecretString <p>新的文本凭据内容，无需 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p>
     */
    public String getSecretString() {
        return this.SecretString;
    }

    /**
     * Set <p>新的文本凭据内容，无需 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p>
     * @param SecretString <p>新的文本凭据内容，无需 Base64 编码，仅自定义凭据支持通过本接口更新内容。</p><p>入参限制：未指定 VersionStage 时，SecretString 和 SecretBinary 必须且只能一个非空；指定 VersionStage 时可均不传以仅迁移标签，但不能同时非空。云产品及 Redis/MongoDB 凭据须省略两项内容。</p>
     */
    public void setSecretString(String SecretString) {
        this.SecretString = SecretString;
    }

    /**
     * Get <p>将 Stage_Current 标签设置或迁移到 VersionId 指定的已有版本，大小写敏感。</p><p>入参限制：支持自定义、云产品及 Redis/MongoDB 凭据；VersionId 必填。</p><p>自定义凭据可仅设置标签，也可同时更新内容；SecretString 和 SecretBinary 不能同时非空。云产品及 Redis/MongoDB 仅支持标签操作，两项内容均须省略。标签绑定版本号，原轮转流程保持不变；绑定历史版本不保证账密仍有效。</p> 
     * @return VersionStage <p>将 Stage_Current 标签设置或迁移到 VersionId 指定的已有版本，大小写敏感。</p><p>入参限制：支持自定义、云产品及 Redis/MongoDB 凭据；VersionId 必填。</p><p>自定义凭据可仅设置标签，也可同时更新内容；SecretString 和 SecretBinary 不能同时非空。云产品及 Redis/MongoDB 仅支持标签操作，两项内容均须省略。标签绑定版本号，原轮转流程保持不变；绑定历史版本不保证账密仍有效。</p>
     */
    public String getVersionStage() {
        return this.VersionStage;
    }

    /**
     * Set <p>将 Stage_Current 标签设置或迁移到 VersionId 指定的已有版本，大小写敏感。</p><p>入参限制：支持自定义、云产品及 Redis/MongoDB 凭据；VersionId 必填。</p><p>自定义凭据可仅设置标签，也可同时更新内容；SecretString 和 SecretBinary 不能同时非空。云产品及 Redis/MongoDB 仅支持标签操作，两项内容均须省略。标签绑定版本号，原轮转流程保持不变；绑定历史版本不保证账密仍有效。</p>
     * @param VersionStage <p>将 Stage_Current 标签设置或迁移到 VersionId 指定的已有版本，大小写敏感。</p><p>入参限制：支持自定义、云产品及 Redis/MongoDB 凭据；VersionId 必填。</p><p>自定义凭据可仅设置标签，也可同时更新内容；SecretString 和 SecretBinary 不能同时非空。云产品及 Redis/MongoDB 仅支持标签操作，两项内容均须省略。标签绑定版本号，原轮转流程保持不变；绑定历史版本不保证账密仍有效。</p>
     */
    public void setVersionStage(String VersionStage) {
        this.VersionStage = VersionStage;
    }

    public UpdateSecretRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSecretRequest(UpdateSecretRequest source) {
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

