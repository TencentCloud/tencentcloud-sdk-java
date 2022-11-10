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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOptimizedModelResponse extends AbstractModel{

    /**
    * 模型ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型版本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelVersionId")
    @Expose
    private String ModelVersionId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模型ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId 模型ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId 模型ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 模型版本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelVersionId 模型版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelVersionId() {
        return this.ModelVersionId;
    }

    /**
     * Set 模型版本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelVersionId 模型版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelVersionId(String ModelVersionId) {
        this.ModelVersionId = ModelVersionId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateOptimizedModelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOptimizedModelResponse(CreateOptimizedModelResponse source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelVersionId != null) {
            this.ModelVersionId = new String(source.ModelVersionId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelVersionId", this.ModelVersionId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

