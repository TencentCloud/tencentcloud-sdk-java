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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWFallbackServiceItem extends AbstractModel {

    /**
    * <p>模型服务 Id</p>
    */
    @SerializedName("ModelServiceId")
    @Expose
    private String ModelServiceId;

    /**
    * <p>模型服务名</p>
    */
    @SerializedName("ModelServiceName")
    @Expose
    private String ModelServiceName;

    /**
     * Get <p>模型服务 Id</p> 
     * @return ModelServiceId <p>模型服务 Id</p>
     */
    public String getModelServiceId() {
        return this.ModelServiceId;
    }

    /**
     * Set <p>模型服务 Id</p>
     * @param ModelServiceId <p>模型服务 Id</p>
     */
    public void setModelServiceId(String ModelServiceId) {
        this.ModelServiceId = ModelServiceId;
    }

    /**
     * Get <p>模型服务名</p> 
     * @return ModelServiceName <p>模型服务名</p>
     */
    public String getModelServiceName() {
        return this.ModelServiceName;
    }

    /**
     * Set <p>模型服务名</p>
     * @param ModelServiceName <p>模型服务名</p>
     */
    public void setModelServiceName(String ModelServiceName) {
        this.ModelServiceName = ModelServiceName;
    }

    public AIGWFallbackServiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWFallbackServiceItem(AIGWFallbackServiceItem source) {
        if (source.ModelServiceId != null) {
            this.ModelServiceId = new String(source.ModelServiceId);
        }
        if (source.ModelServiceName != null) {
            this.ModelServiceName = new String(source.ModelServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelServiceId", this.ModelServiceId);
        this.setParamSimple(map, prefix + "ModelServiceName", this.ModelServiceName);

    }
}

