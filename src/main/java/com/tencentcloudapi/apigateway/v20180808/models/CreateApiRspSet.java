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

public class CreateApiRspSet extends AbstractModel{

    /**
    * 个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 返回的数组
    */
    @SerializedName("ApiSet")
    @Expose
    private CreateApiRsp [] ApiSet;

    /**
     * Get 个数 
     * @return TotalCount 个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 个数
     * @param TotalCount 个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 返回的数组 
     * @return ApiSet 返回的数组
     */
    public CreateApiRsp [] getApiSet() {
        return this.ApiSet;
    }

    /**
     * Set 返回的数组
     * @param ApiSet 返回的数组
     */
    public void setApiSet(CreateApiRsp [] ApiSet) {
        this.ApiSet = ApiSet;
    }

    public CreateApiRspSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiRspSet(CreateApiRspSet source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiSet != null) {
            this.ApiSet = new CreateApiRsp[source.ApiSet.length];
            for (int i = 0; i < source.ApiSet.length; i++) {
                this.ApiSet[i] = new CreateApiRsp(source.ApiSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiSet.", this.ApiSet);

    }
}

