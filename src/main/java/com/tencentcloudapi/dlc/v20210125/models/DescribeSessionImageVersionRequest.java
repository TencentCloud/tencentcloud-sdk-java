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

public class DescribeSessionImageVersionRequest extends AbstractModel {

    /**
    * 引擎Id
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 框架类型：machine-learning、python、spark-ml
    */
    @SerializedName("FrameworkType")
    @Expose
    private String FrameworkType;

    /**
     * Get 引擎Id 
     * @return DataEngineId 引擎Id
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎Id
     * @param DataEngineId 引擎Id
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 框架类型：machine-learning、python、spark-ml 
     * @return FrameworkType 框架类型：machine-learning、python、spark-ml
     */
    public String getFrameworkType() {
        return this.FrameworkType;
    }

    /**
     * Set 框架类型：machine-learning、python、spark-ml
     * @param FrameworkType 框架类型：machine-learning、python、spark-ml
     */
    public void setFrameworkType(String FrameworkType) {
        this.FrameworkType = FrameworkType;
    }

    public DescribeSessionImageVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionImageVersionRequest(DescribeSessionImageVersionRequest source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.FrameworkType != null) {
            this.FrameworkType = new String(source.FrameworkType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "FrameworkType", this.FrameworkType);

    }
}

