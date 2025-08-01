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

public class DescribeDataEngineSessionParametersRequest extends AbstractModel {

    /**
    * 引擎id
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 引擎名称，当指定引擎名称后优先使用名称获取配置
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
     * Get 引擎id 
     * @return DataEngineId 引擎id
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎id
     * @param DataEngineId 引擎id
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 引擎名称，当指定引擎名称后优先使用名称获取配置 
     * @return DataEngineName 引擎名称，当指定引擎名称后优先使用名称获取配置
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 引擎名称，当指定引擎名称后优先使用名称获取配置
     * @param DataEngineName 引擎名称，当指定引擎名称后优先使用名称获取配置
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    public DescribeDataEngineSessionParametersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataEngineSessionParametersRequest(DescribeDataEngineSessionParametersRequest source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);

    }
}

