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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageManifestsResponse extends AbstractModel {

    /**
    * 镜像的Manifest信息
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * 镜像的配置信息
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 镜像的Labels信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private KeyValueString [] Labels;

    /**
    * 镜像大小，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像的Manifest信息 
     * @return Manifest 镜像的Manifest信息
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set 镜像的Manifest信息
     * @param Manifest 镜像的Manifest信息
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get 镜像的配置信息 
     * @return Config 镜像的配置信息
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 镜像的配置信息
     * @param Config 镜像的配置信息
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 镜像的Labels信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 镜像的Labels信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueString [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 镜像的Labels信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 镜像的Labels信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(KeyValueString [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 镜像大小，单位：byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 镜像大小，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 镜像大小，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 镜像大小，单位：byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImageManifestsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageManifestsResponse(DescribeImageManifestsResponse source) {
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Labels != null) {
            this.Labels = new KeyValueString[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new KeyValueString(source.Labels[i]);
            }
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

