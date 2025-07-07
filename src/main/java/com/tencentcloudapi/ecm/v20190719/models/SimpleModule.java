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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimpleModule extends AbstractModel {

    /**
    * 模块ID
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 模块名称
    */
    @SerializedName("ModuleName")
    @Expose
    private String ModuleName;

    /**
     * Get 模块ID 
     * @return ModuleId 模块ID
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块ID
     * @param ModuleId 模块ID
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 模块名称 
     * @return ModuleName 模块名称
     */
    public String getModuleName() {
        return this.ModuleName;
    }

    /**
     * Set 模块名称
     * @param ModuleName 模块名称
     */
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    public SimpleModule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleModule(SimpleModule source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.ModuleName != null) {
            this.ModuleName = new String(source.ModuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "ModuleName", this.ModuleName);

    }
}

