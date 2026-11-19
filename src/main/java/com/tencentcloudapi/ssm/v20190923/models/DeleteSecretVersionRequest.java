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

public class DeleteSecretVersionRequest extends AbstractModel {

    /**
    * <p>指定凭据名称。</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>指定该名称下需要删除的凭据的版本号。</p><p>仅支持删除自定义凭据版本。目标版本持有 Stage_Current 标签时返回 FailedOperation，须先通过 UpdateSecret 将标签迁移到其他已有版本。存在并发写入或轮转等操作、未取得共享写锁时返回 OperationDenied。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get <p>指定凭据名称。</p> 
     * @return SecretName <p>指定凭据名称。</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>指定凭据名称。</p>
     * @param SecretName <p>指定凭据名称。</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>指定该名称下需要删除的凭据的版本号。</p><p>仅支持删除自定义凭据版本。目标版本持有 Stage_Current 标签时返回 FailedOperation，须先通过 UpdateSecret 将标签迁移到其他已有版本。存在并发写入或轮转等操作、未取得共享写锁时返回 OperationDenied。</p> 
     * @return VersionId <p>指定该名称下需要删除的凭据的版本号。</p><p>仅支持删除自定义凭据版本。目标版本持有 Stage_Current 标签时返回 FailedOperation，须先通过 UpdateSecret 将标签迁移到其他已有版本。存在并发写入或轮转等操作、未取得共享写锁时返回 OperationDenied。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>指定该名称下需要删除的凭据的版本号。</p><p>仅支持删除自定义凭据版本。目标版本持有 Stage_Current 标签时返回 FailedOperation，须先通过 UpdateSecret 将标签迁移到其他已有版本。存在并发写入或轮转等操作、未取得共享写锁时返回 OperationDenied。</p>
     * @param VersionId <p>指定该名称下需要删除的凭据的版本号。</p><p>仅支持删除自定义凭据版本。目标版本持有 Stage_Current 标签时返回 FailedOperation，须先通过 UpdateSecret 将标签迁移到其他已有版本。存在并发写入或轮转等操作、未取得共享写锁时返回 OperationDenied。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public DeleteSecretVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecretVersionRequest(DeleteSecretVersionRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

