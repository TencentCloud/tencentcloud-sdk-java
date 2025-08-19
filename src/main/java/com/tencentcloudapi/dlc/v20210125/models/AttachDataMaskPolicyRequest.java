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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachDataMaskPolicyRequest extends AbstractModel {

    /**
    * 要绑定的数据脱敏策略权限对象集合
    */
    @SerializedName("DataMaskStrategyPolicySet")
    @Expose
    private DataMaskStrategyPolicy [] DataMaskStrategyPolicySet;

    /**
     * Get 要绑定的数据脱敏策略权限对象集合 
     * @return DataMaskStrategyPolicySet 要绑定的数据脱敏策略权限对象集合
     */
    public DataMaskStrategyPolicy [] getDataMaskStrategyPolicySet() {
        return this.DataMaskStrategyPolicySet;
    }

    /**
     * Set 要绑定的数据脱敏策略权限对象集合
     * @param DataMaskStrategyPolicySet 要绑定的数据脱敏策略权限对象集合
     */
    public void setDataMaskStrategyPolicySet(DataMaskStrategyPolicy [] DataMaskStrategyPolicySet) {
        this.DataMaskStrategyPolicySet = DataMaskStrategyPolicySet;
    }

    public AttachDataMaskPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachDataMaskPolicyRequest(AttachDataMaskPolicyRequest source) {
        if (source.DataMaskStrategyPolicySet != null) {
            this.DataMaskStrategyPolicySet = new DataMaskStrategyPolicy[source.DataMaskStrategyPolicySet.length];
            for (int i = 0; i < source.DataMaskStrategyPolicySet.length; i++) {
                this.DataMaskStrategyPolicySet[i] = new DataMaskStrategyPolicy(source.DataMaskStrategyPolicySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataMaskStrategyPolicySet.", this.DataMaskStrategyPolicySet);

    }
}

