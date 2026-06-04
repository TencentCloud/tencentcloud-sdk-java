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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVariableRequest extends AbstractModel {

    /**
    * app_id
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * variable_id
    */
    @SerializedName("VariableId")
    @Expose
    private String VariableId;

    /**
    * module_type。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
    */
    @SerializedName("ModuleType")
    @Expose
    private Long ModuleType;

    /**
     * Get app_id 
     * @return AppId app_id
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set app_id
     * @param AppId app_id
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get variable_id 
     * @return VariableId variable_id
     */
    public String getVariableId() {
        return this.VariableId;
    }

    /**
     * Set variable_id
     * @param VariableId variable_id
     */
    public void setVariableId(String VariableId) {
        this.VariableId = VariableId;
    }

    /**
     * Get module_type。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数 
     * @return ModuleType module_type。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
     */
    public Long getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set module_type。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
     * @param ModuleType module_type。枚举值: 1:环境参数, 2:应用参数, 3:系统参数, -1:所有参数
     */
    public void setModuleType(Long ModuleType) {
        this.ModuleType = ModuleType;
    }

    public DescribeVariableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVariableRequest(DescribeVariableRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.VariableId != null) {
            this.VariableId = new String(source.VariableId);
        }
        if (source.ModuleType != null) {
            this.ModuleType = new Long(source.ModuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "VariableId", this.VariableId);
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);

    }
}

