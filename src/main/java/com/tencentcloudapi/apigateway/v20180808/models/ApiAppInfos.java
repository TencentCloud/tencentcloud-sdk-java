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

public class ApiAppInfos extends AbstractModel{

    /**
    * 应用数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 应用信息数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiAppSet")
    @Expose
    private ApiAppInfo [] ApiAppSet;

    /**
     * Get 应用数量 
     * @return TotalCount 应用数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 应用数量
     * @param TotalCount 应用数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 应用信息数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiAppSet 应用信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiAppInfo [] getApiAppSet() {
        return this.ApiAppSet;
    }

    /**
     * Set 应用信息数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiAppSet 应用信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiAppSet(ApiAppInfo [] ApiAppSet) {
        this.ApiAppSet = ApiAppSet;
    }

    public ApiAppInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiAppInfos(ApiAppInfos source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiAppSet != null) {
            this.ApiAppSet = new ApiAppInfo[source.ApiAppSet.length];
            for (int i = 0; i < source.ApiAppSet.length; i++) {
                this.ApiAppSet[i] = new ApiAppInfo(source.ApiAppSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiAppSet.", this.ApiAppSet);

    }
}

