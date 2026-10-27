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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSandboxInstanceRequest extends AbstractModel {

    /**
    * <p>沙箱实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 手动设置实例还需运行多久，如 5m、300s、1h。未传入时保持原设置；传入后从本次设置开始重新计时。仅正在运行、且未设置为永久运行的实例可修改。修改时不会缩短已获得的自动续期时间。
    */
    @SerializedName("Timeout")
    @Expose
    private String Timeout;

    /**
    * 实例元数据。
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataVar [] Metadata;

    /**
     * Get <p>沙箱实例ID</p> 
     * @return InstanceId <p>沙箱实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>沙箱实例ID</p>
     * @param InstanceId <p>沙箱实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 手动设置实例还需运行多久，如 5m、300s、1h。未传入时保持原设置；传入后从本次设置开始重新计时。仅正在运行、且未设置为永久运行的实例可修改。修改时不会缩短已获得的自动续期时间。 
     * @return Timeout 手动设置实例还需运行多久，如 5m、300s、1h。未传入时保持原设置；传入后从本次设置开始重新计时。仅正在运行、且未设置为永久运行的实例可修改。修改时不会缩短已获得的自动续期时间。
     */
    public String getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 手动设置实例还需运行多久，如 5m、300s、1h。未传入时保持原设置；传入后从本次设置开始重新计时。仅正在运行、且未设置为永久运行的实例可修改。修改时不会缩短已获得的自动续期时间。
     * @param Timeout 手动设置实例还需运行多久，如 5m、300s、1h。未传入时保持原设置；传入后从本次设置开始重新计时。仅正在运行、且未设置为永久运行的实例可修改。修改时不会缩短已获得的自动续期时间。
     */
    public void setTimeout(String Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 实例元数据。 
     * @return Metadata 实例元数据。
     */
    public MetadataVar [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 实例元数据。
     * @param Metadata 实例元数据。
     */
    public void setMetadata(MetadataVar [] Metadata) {
        this.Metadata = Metadata;
    }

    public UpdateSandboxInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSandboxInstanceRequest(UpdateSandboxInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Timeout != null) {
            this.Timeout = new String(source.Timeout);
        }
        if (source.Metadata != null) {
            this.Metadata = new MetadataVar[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new MetadataVar(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

