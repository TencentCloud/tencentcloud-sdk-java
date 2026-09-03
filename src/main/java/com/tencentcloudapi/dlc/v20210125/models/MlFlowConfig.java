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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MlFlowConfig extends AbstractModel {

    /**
    * <p>MlFlow 追踪模式：local=MlFlow Sidecar / remote=已有 MlFlow Server / none=不启用</p>
    */
    @SerializedName("MlFlowMode")
    @Expose
    private String MlFlowMode;

    /**
    * <p>已有MlFlow Server 的 ID（仅 mlFlowMode=remote 时填写，前端下拉选择后传入）</p>
    */
    @SerializedName("MlFlowServerId")
    @Expose
    private String MlFlowServerId;

    /**
    * <p>MlFlow Sidecar 持久化存储的 COS 路径（仅 mlFlowMode=local 时填写）</p>
    */
    @SerializedName("MlFlowCosPath")
    @Expose
    private String MlFlowCosPath;

    /**
     * Get <p>MlFlow 追踪模式：local=MlFlow Sidecar / remote=已有 MlFlow Server / none=不启用</p> 
     * @return MlFlowMode <p>MlFlow 追踪模式：local=MlFlow Sidecar / remote=已有 MlFlow Server / none=不启用</p>
     */
    public String getMlFlowMode() {
        return this.MlFlowMode;
    }

    /**
     * Set <p>MlFlow 追踪模式：local=MlFlow Sidecar / remote=已有 MlFlow Server / none=不启用</p>
     * @param MlFlowMode <p>MlFlow 追踪模式：local=MlFlow Sidecar / remote=已有 MlFlow Server / none=不启用</p>
     */
    public void setMlFlowMode(String MlFlowMode) {
        this.MlFlowMode = MlFlowMode;
    }

    /**
     * Get <p>已有MlFlow Server 的 ID（仅 mlFlowMode=remote 时填写，前端下拉选择后传入）</p> 
     * @return MlFlowServerId <p>已有MlFlow Server 的 ID（仅 mlFlowMode=remote 时填写，前端下拉选择后传入）</p>
     */
    public String getMlFlowServerId() {
        return this.MlFlowServerId;
    }

    /**
     * Set <p>已有MlFlow Server 的 ID（仅 mlFlowMode=remote 时填写，前端下拉选择后传入）</p>
     * @param MlFlowServerId <p>已有MlFlow Server 的 ID（仅 mlFlowMode=remote 时填写，前端下拉选择后传入）</p>
     */
    public void setMlFlowServerId(String MlFlowServerId) {
        this.MlFlowServerId = MlFlowServerId;
    }

    /**
     * Get <p>MlFlow Sidecar 持久化存储的 COS 路径（仅 mlFlowMode=local 时填写）</p> 
     * @return MlFlowCosPath <p>MlFlow Sidecar 持久化存储的 COS 路径（仅 mlFlowMode=local 时填写）</p>
     */
    public String getMlFlowCosPath() {
        return this.MlFlowCosPath;
    }

    /**
     * Set <p>MlFlow Sidecar 持久化存储的 COS 路径（仅 mlFlowMode=local 时填写）</p>
     * @param MlFlowCosPath <p>MlFlow Sidecar 持久化存储的 COS 路径（仅 mlFlowMode=local 时填写）</p>
     */
    public void setMlFlowCosPath(String MlFlowCosPath) {
        this.MlFlowCosPath = MlFlowCosPath;
    }

    public MlFlowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MlFlowConfig(MlFlowConfig source) {
        if (source.MlFlowMode != null) {
            this.MlFlowMode = new String(source.MlFlowMode);
        }
        if (source.MlFlowServerId != null) {
            this.MlFlowServerId = new String(source.MlFlowServerId);
        }
        if (source.MlFlowCosPath != null) {
            this.MlFlowCosPath = new String(source.MlFlowCosPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MlFlowMode", this.MlFlowMode);
        this.setParamSimple(map, prefix + "MlFlowServerId", this.MlFlowServerId);
        this.setParamSimple(map, prefix + "MlFlowCosPath", this.MlFlowCosPath);

    }
}

