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

public class ApiKeysStatus extends AbstractModel{

    /**
    * 符合条件的 API 密钥数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * API 密钥列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiKeySet")
    @Expose
    private ApiKey [] ApiKeySet;

    /**
     * Get 符合条件的 API 密钥数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 符合条件的 API 密钥数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的 API 密钥数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 符合条件的 API 密钥数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get API 密钥列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiKeySet API 密钥列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiKey [] getApiKeySet() {
        return this.ApiKeySet;
    }

    /**
     * Set API 密钥列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiKeySet API 密钥列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiKeySet(ApiKey [] ApiKeySet) {
        this.ApiKeySet = ApiKeySet;
    }

    public ApiKeysStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiKeysStatus(ApiKeysStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiKeySet != null) {
            this.ApiKeySet = new ApiKey[source.ApiKeySet.length];
            for (int i = 0; i < source.ApiKeySet.length; i++) {
                this.ApiKeySet[i] = new ApiKey(source.ApiKeySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiKeySet.", this.ApiKeySet);

    }
}

