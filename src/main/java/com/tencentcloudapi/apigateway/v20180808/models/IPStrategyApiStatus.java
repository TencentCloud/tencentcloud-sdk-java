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

public class IPStrategyApiStatus extends AbstractModel{

    /**
    * 环境绑定API数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 环境绑定API详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiIdStatusSet")
    @Expose
    private IPStrategyApi [] ApiIdStatusSet;

    /**
     * Get 环境绑定API数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 环境绑定API数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 环境绑定API数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 环境绑定API数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 环境绑定API详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiIdStatusSet 环境绑定API详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IPStrategyApi [] getApiIdStatusSet() {
        return this.ApiIdStatusSet;
    }

    /**
     * Set 环境绑定API详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiIdStatusSet 环境绑定API详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiIdStatusSet(IPStrategyApi [] ApiIdStatusSet) {
        this.ApiIdStatusSet = ApiIdStatusSet;
    }

    public IPStrategyApiStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPStrategyApiStatus(IPStrategyApiStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApiIdStatusSet != null) {
            this.ApiIdStatusSet = new IPStrategyApi[source.ApiIdStatusSet.length];
            for (int i = 0; i < source.ApiIdStatusSet.length; i++) {
                this.ApiIdStatusSet[i] = new IPStrategyApi(source.ApiIdStatusSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ApiIdStatusSet.", this.ApiIdStatusSet);

    }
}

