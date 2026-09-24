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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeployTemplatesRequest extends AbstractModel {

    /**
    * 模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 可选。传入当前推理服务 ID 时，仅返回与该服务占用兼容的模板：同一 Scene、卡型家族兼容、机数相等、非机密计算。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get 模型ID 
     * @return ModelId 模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型ID
     * @param ModelId 模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 可选。传入当前推理服务 ID 时，仅返回与该服务占用兼容的模板：同一 Scene、卡型家族兼容、机数相等、非机密计算。 
     * @return ServiceId 可选。传入当前推理服务 ID 时，仅返回与该服务占用兼容的模板：同一 Scene、卡型家族兼容、机数相等、非机密计算。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 可选。传入当前推理服务 ID 时，仅返回与该服务占用兼容的模板：同一 Scene、卡型家族兼容、机数相等、非机密计算。
     * @param ServiceId 可选。传入当前推理服务 ID 时，仅返回与该服务占用兼容的模板：同一 Scene、卡型家族兼容、机数相等、非机密计算。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public DescribeDeployTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeployTemplatesRequest(DescribeDeployTemplatesRequest source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

