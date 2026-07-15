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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWRouteModelServiceConfig extends AbstractModel {

    /**
    * <p>模型服务名字</p>
    */
    @SerializedName("ModelServiceName")
    @Expose
    private String ModelServiceName;

    /**
     * Get <p>模型服务名字</p> 
     * @return ModelServiceName <p>模型服务名字</p>
     */
    public String getModelServiceName() {
        return this.ModelServiceName;
    }

    /**
     * Set <p>模型服务名字</p>
     * @param ModelServiceName <p>模型服务名字</p>
     */
    public void setModelServiceName(String ModelServiceName) {
        this.ModelServiceName = ModelServiceName;
    }

    public AIGWRouteModelServiceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWRouteModelServiceConfig(AIGWRouteModelServiceConfig source) {
        if (source.ModelServiceName != null) {
            this.ModelServiceName = new String(source.ModelServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelServiceName", this.ModelServiceName);

    }
}

