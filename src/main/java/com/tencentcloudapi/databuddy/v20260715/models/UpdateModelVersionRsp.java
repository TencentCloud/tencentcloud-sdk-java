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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateModelVersionRsp extends AbstractModel {

    /**
    * 更新后的模型版本信息
    */
    @SerializedName("ModelVersion")
    @Expose
    private ModelVersionInfo ModelVersion;

    /**
     * Get 更新后的模型版本信息 
     * @return ModelVersion 更新后的模型版本信息
     */
    public ModelVersionInfo getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 更新后的模型版本信息
     * @param ModelVersion 更新后的模型版本信息
     */
    public void setModelVersion(ModelVersionInfo ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    public UpdateModelVersionRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateModelVersionRsp(UpdateModelVersionRsp source) {
        if (source.ModelVersion != null) {
            this.ModelVersion = new ModelVersionInfo(source.ModelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ModelVersion.", this.ModelVersion);

    }
}

