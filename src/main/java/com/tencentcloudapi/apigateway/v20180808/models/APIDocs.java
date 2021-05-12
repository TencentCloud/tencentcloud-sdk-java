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

public class APIDocs extends AbstractModel{

    /**
    * API文档数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * API文档基本信息
    */
    @SerializedName("APIDocSet")
    @Expose
    private APIDoc [] APIDocSet;

    /**
     * Get API文档数量 
     * @return TotalCount API文档数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set API文档数量
     * @param TotalCount API文档数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get API文档基本信息 
     * @return APIDocSet API文档基本信息
     */
    public APIDoc [] getAPIDocSet() {
        return this.APIDocSet;
    }

    /**
     * Set API文档基本信息
     * @param APIDocSet API文档基本信息
     */
    public void setAPIDocSet(APIDoc [] APIDocSet) {
        this.APIDocSet = APIDocSet;
    }

    public APIDocs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIDocs(APIDocs source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.APIDocSet != null) {
            this.APIDocSet = new APIDoc[source.APIDocSet.length];
            for (int i = 0; i < source.APIDocSet.length; i++) {
                this.APIDocSet[i] = new APIDoc(source.APIDocSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "APIDocSet.", this.APIDocSet);

    }
}

