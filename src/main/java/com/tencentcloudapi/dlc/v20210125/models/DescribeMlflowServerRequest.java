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

public class DescribeMlflowServerRequest extends AbstractModel {

    /**
    * <p>MlFlowServer的ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
     * Get <p>MlFlowServer的ID</p> 
     * @return ServerId <p>MlFlowServer的ID</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MlFlowServer的ID</p>
     * @param ServerId <p>MlFlowServer的ID</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    public DescribeMlflowServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMlflowServerRequest(DescribeMlflowServerRequest source) {
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);

    }
}

