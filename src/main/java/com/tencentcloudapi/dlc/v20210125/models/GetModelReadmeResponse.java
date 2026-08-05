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

public class GetModelReadmeResponse extends AbstractModel {

    /**
    * <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParameterSize")
    @Expose
    private String ParameterSize;

    /**
    * <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuiltIn")
    @Expose
    private Boolean BuiltIn;

    /**
    * <p>README 内容（Markdown 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Readme")
    @Expose
    private String Readme;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Provider <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Provider <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelType <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelType <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParameterSize <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameterSize() {
        return this.ParameterSize;
    }

    /**
     * Set <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParameterSize <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameterSize(String ParameterSize) {
        this.ParameterSize = ParameterSize;
    }

    /**
     * Get <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuiltIn <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBuiltIn() {
        return this.BuiltIn;
    }

    /**
     * Set <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuiltIn <p>是否是内置模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuiltIn(Boolean BuiltIn) {
        this.BuiltIn = BuiltIn;
    }

    /**
     * Get <p>README 内容（Markdown 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Readme <p>README 内容（Markdown 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReadme() {
        return this.Readme;
    }

    /**
     * Set <p>README 内容（Markdown 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Readme <p>README 内容（Markdown 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadme(String Readme) {
        this.Readme = Readme;
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

    public GetModelReadmeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetModelReadmeResponse(GetModelReadmeResponse source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.ParameterSize != null) {
            this.ParameterSize = new String(source.ParameterSize);
        }
        if (source.BuiltIn != null) {
            this.BuiltIn = new Boolean(source.BuiltIn);
        }
        if (source.Readme != null) {
            this.Readme = new String(source.Readme);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "ParameterSize", this.ParameterSize);
        this.setParamSimple(map, prefix + "BuiltIn", this.BuiltIn);
        this.setParamSimple(map, prefix + "Readme", this.Readme);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

