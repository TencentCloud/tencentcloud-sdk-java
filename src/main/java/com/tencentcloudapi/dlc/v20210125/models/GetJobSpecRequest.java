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

public class GetJobSpecRequest extends AbstractModel {

    /**
    * <p>配置ID</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
     * Get <p>配置ID</p> 
     * @return SpecId <p>配置ID</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>配置ID</p>
     * @param SpecId <p>配置ID</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    public GetJobSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetJobSpecRequest(GetJobSpecRequest source) {
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);

    }
}

