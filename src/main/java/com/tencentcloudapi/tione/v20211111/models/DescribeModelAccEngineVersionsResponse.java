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

public class DescribeModelAccEngineVersionsResponse extends AbstractModel{

    /**
    * 模型加速版本列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelAccEngineVersions")
    @Expose
    private ModelAccEngineVersion [] ModelAccEngineVersions;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模型加速版本列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelAccEngineVersions 模型加速版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelAccEngineVersion [] getModelAccEngineVersions() {
        return this.ModelAccEngineVersions;
    }

    /**
     * Set 模型加速版本列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelAccEngineVersions 模型加速版本列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelAccEngineVersions(ModelAccEngineVersion [] ModelAccEngineVersions) {
        this.ModelAccEngineVersions = ModelAccEngineVersions;
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

    public DescribeModelAccEngineVersionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelAccEngineVersionsResponse(DescribeModelAccEngineVersionsResponse source) {
        if (source.ModelAccEngineVersions != null) {
            this.ModelAccEngineVersions = new ModelAccEngineVersion[source.ModelAccEngineVersions.length];
            for (int i = 0; i < source.ModelAccEngineVersions.length; i++) {
                this.ModelAccEngineVersions[i] = new ModelAccEngineVersion(source.ModelAccEngineVersions[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ModelAccEngineVersions.", this.ModelAccEngineVersions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

