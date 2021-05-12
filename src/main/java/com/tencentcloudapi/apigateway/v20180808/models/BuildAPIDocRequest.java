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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildAPIDocRequest extends AbstractModel{

    /**
    * API文档ID
    */
    @SerializedName("ApiDocId")
    @Expose
    private String ApiDocId;

    /**
     * Get API文档ID 
     * @return ApiDocId API文档ID
     */
    public String getApiDocId() {
        return this.ApiDocId;
    }

    /**
     * Set API文档ID
     * @param ApiDocId API文档ID
     */
    public void setApiDocId(String ApiDocId) {
        this.ApiDocId = ApiDocId;
    }

    public BuildAPIDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildAPIDocRequest(BuildAPIDocRequest source) {
        if (source.ApiDocId != null) {
            this.ApiDocId = new String(source.ApiDocId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiDocId", this.ApiDocId);

    }
}

