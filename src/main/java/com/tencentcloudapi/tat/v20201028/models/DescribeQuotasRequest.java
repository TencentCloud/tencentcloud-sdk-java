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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQuotasRequest extends AbstractModel {

    /**
    * 资源名称，目前有"COMMAND","REGISTER_CODE" 这两个指标
    */
    @SerializedName("ResourceNames")
    @Expose
    private String [] ResourceNames;

    /**
     * Get 资源名称，目前有"COMMAND","REGISTER_CODE" 这两个指标 
     * @return ResourceNames 资源名称，目前有"COMMAND","REGISTER_CODE" 这两个指标
     */
    public String [] getResourceNames() {
        return this.ResourceNames;
    }

    /**
     * Set 资源名称，目前有"COMMAND","REGISTER_CODE" 这两个指标
     * @param ResourceNames 资源名称，目前有"COMMAND","REGISTER_CODE" 这两个指标
     */
    public void setResourceNames(String [] ResourceNames) {
        this.ResourceNames = ResourceNames;
    }

    public DescribeQuotasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQuotasRequest(DescribeQuotasRequest source) {
        if (source.ResourceNames != null) {
            this.ResourceNames = new String[source.ResourceNames.length];
            for (int i = 0; i < source.ResourceNames.length; i++) {
                this.ResourceNames[i] = new String(source.ResourceNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceNames.", this.ResourceNames);

    }
}

