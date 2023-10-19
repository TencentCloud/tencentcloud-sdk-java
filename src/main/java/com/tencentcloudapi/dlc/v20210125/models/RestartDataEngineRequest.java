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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartDataEngineRequest extends AbstractModel {

    /**
    * 引擎ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 是否强制重启，忽略任务
    */
    @SerializedName("ForcedOperation")
    @Expose
    private Boolean ForcedOperation;

    /**
     * Get 引擎ID 
     * @return DataEngineId 引擎ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set 引擎ID
     * @param DataEngineId 引擎ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get 是否强制重启，忽略任务 
     * @return ForcedOperation 是否强制重启，忽略任务
     */
    public Boolean getForcedOperation() {
        return this.ForcedOperation;
    }

    /**
     * Set 是否强制重启，忽略任务
     * @param ForcedOperation 是否强制重启，忽略任务
     */
    public void setForcedOperation(Boolean ForcedOperation) {
        this.ForcedOperation = ForcedOperation;
    }

    public RestartDataEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartDataEngineRequest(RestartDataEngineRequest source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.ForcedOperation != null) {
            this.ForcedOperation = new Boolean(source.ForcedOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "ForcedOperation", this.ForcedOperation);

    }
}

