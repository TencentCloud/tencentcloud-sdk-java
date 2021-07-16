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

public class ApiAppApiInfos extends AbstractModel{

    /**
    * 数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 应用绑定的Api信息数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiAppApiSet")
    @Expose
    private ApiAppApiInfo [] ApiAppApiSet;

    /**
     * Get 数量 
     * @return TotalCount 数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数量
     * @param TotalCount 数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 应用绑定的Api信息数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiAppApiSet 应用绑定的Api信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiAppApiInfo [] getApiAppApiSet() {
        return this.ApiAppApiSet;
    }

    /**
     * Set 应用绑定的Api信息数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiAppApiSet 应用绑定的Api信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiAppApiSet(ApiAppApiInfo [] ApiAppApiSet) {
        this.ApiAppApiSet = ApiAppApiSet;
    }

    public ApiAppApiInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiAppApiInfos(ApiAppApiInfos source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiAppApiSet != null) {
            this.ApiAppApiSet = new ApiAppApiInfo[source.ApiAppApiSet.length];
            for (int i = 0; i < source.ApiAppApiSet.length; i++) {
                this.ApiAppApiSet[i] = new ApiAppApiInfo(source.ApiAppApiSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiAppApiSet.", this.ApiAppApiSet);

    }
}

