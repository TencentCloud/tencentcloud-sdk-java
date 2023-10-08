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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReservedInstanceScopeRequest extends AbstractModel{

    /**
    * 预留券唯一 ID
    */
    @SerializedName("ReservedInstanceIds")
    @Expose
    private String [] ReservedInstanceIds;

    /**
    * 预留券抵扣范围信息
    */
    @SerializedName("ReservedInstanceScope")
    @Expose
    private ReservedInstanceScope ReservedInstanceScope;

    /**
     * Get 预留券唯一 ID 
     * @return ReservedInstanceIds 预留券唯一 ID
     */
    public String [] getReservedInstanceIds() {
        return this.ReservedInstanceIds;
    }

    /**
     * Set 预留券唯一 ID
     * @param ReservedInstanceIds 预留券唯一 ID
     */
    public void setReservedInstanceIds(String [] ReservedInstanceIds) {
        this.ReservedInstanceIds = ReservedInstanceIds;
    }

    /**
     * Get 预留券抵扣范围信息 
     * @return ReservedInstanceScope 预留券抵扣范围信息
     */
    public ReservedInstanceScope getReservedInstanceScope() {
        return this.ReservedInstanceScope;
    }

    /**
     * Set 预留券抵扣范围信息
     * @param ReservedInstanceScope 预留券抵扣范围信息
     */
    public void setReservedInstanceScope(ReservedInstanceScope ReservedInstanceScope) {
        this.ReservedInstanceScope = ReservedInstanceScope;
    }

    public ModifyReservedInstanceScopeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReservedInstanceScopeRequest(ModifyReservedInstanceScopeRequest source) {
        if (source.ReservedInstanceIds != null) {
            this.ReservedInstanceIds = new String[source.ReservedInstanceIds.length];
            for (int i = 0; i < source.ReservedInstanceIds.length; i++) {
                this.ReservedInstanceIds[i] = new String(source.ReservedInstanceIds[i]);
            }
        }
        if (source.ReservedInstanceScope != null) {
            this.ReservedInstanceScope = new ReservedInstanceScope(source.ReservedInstanceScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ReservedInstanceIds.", this.ReservedInstanceIds);
        this.setParamObj(map, prefix + "ReservedInstanceScope.", this.ReservedInstanceScope);

    }
}

