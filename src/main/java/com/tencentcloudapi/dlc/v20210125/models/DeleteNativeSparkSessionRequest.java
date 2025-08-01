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

public class DeleteNativeSparkSessionRequest extends AbstractModel {

    /**
    * 引擎id
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * 资源组id
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * spark session名称
    */
    @SerializedName("EngineSessionName")
    @Expose
    private String EngineSessionName;

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
     * Get 资源组id 
     * @return ResourceGroupId 资源组id
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组id
     * @param ResourceGroupId 资源组id
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get spark session名称 
     * @return EngineSessionName spark session名称
     */
    public String getEngineSessionName() {
        return this.EngineSessionName;
    }

    /**
     * Set spark session名称
     * @param EngineSessionName spark session名称
     */
    public void setEngineSessionName(String EngineSessionName) {
        this.EngineSessionName = EngineSessionName;
    }

    public DeleteNativeSparkSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNativeSparkSessionRequest(DeleteNativeSparkSessionRequest source) {
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.EngineSessionName != null) {
            this.EngineSessionName = new String(source.EngineSessionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "EngineSessionName", this.EngineSessionName);

    }
}

