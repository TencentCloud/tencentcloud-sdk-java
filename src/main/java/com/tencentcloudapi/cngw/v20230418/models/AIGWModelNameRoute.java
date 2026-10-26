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

public class AIGWModelNameRoute extends AbstractModel {

    /**
    * <p>模型名称和别名列表；对象存在即启用</p>
    */
    @SerializedName("ModelNames")
    @Expose
    private String [] ModelNames;

    /**
     * Get <p>模型名称和别名列表；对象存在即启用</p> 
     * @return ModelNames <p>模型名称和别名列表；对象存在即启用</p>
     */
    public String [] getModelNames() {
        return this.ModelNames;
    }

    /**
     * Set <p>模型名称和别名列表；对象存在即启用</p>
     * @param ModelNames <p>模型名称和别名列表；对象存在即启用</p>
     */
    public void setModelNames(String [] ModelNames) {
        this.ModelNames = ModelNames;
    }

    public AIGWModelNameRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWModelNameRoute(AIGWModelNameRoute source) {
        if (source.ModelNames != null) {
            this.ModelNames = new String[source.ModelNames.length];
            for (int i = 0; i < source.ModelNames.length; i++) {
                this.ModelNames[i] = new String(source.ModelNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ModelNames.", this.ModelNames);

    }
}

