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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMicroserviceRequest extends AbstractModel {

    /**
    * 微服务 ID
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * 微服务备注信息
    */
    @SerializedName("MicroserviceDesc")
    @Expose
    private String MicroserviceDesc;

    /**
     * Get 微服务 ID 
     * @return MicroserviceId 微服务 ID
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set 微服务 ID
     * @param MicroserviceId 微服务 ID
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get 微服务备注信息 
     * @return MicroserviceDesc 微服务备注信息
     */
    public String getMicroserviceDesc() {
        return this.MicroserviceDesc;
    }

    /**
     * Set 微服务备注信息
     * @param MicroserviceDesc 微服务备注信息
     */
    public void setMicroserviceDesc(String MicroserviceDesc) {
        this.MicroserviceDesc = MicroserviceDesc;
    }

    public ModifyMicroserviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMicroserviceRequest(ModifyMicroserviceRequest source) {
        if (source.MicroserviceId != null) {
            this.MicroserviceId = new String(source.MicroserviceId);
        }
        if (source.MicroserviceDesc != null) {
            this.MicroserviceDesc = new String(source.MicroserviceDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MicroserviceId", this.MicroserviceId);
        this.setParamSimple(map, prefix + "MicroserviceDesc", this.MicroserviceDesc);

    }
}

