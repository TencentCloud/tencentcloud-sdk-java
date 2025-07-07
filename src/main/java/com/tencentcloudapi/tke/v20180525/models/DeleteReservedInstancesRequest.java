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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteReservedInstancesRequest extends AbstractModel {

    /**
    * 预留券实例ID。
    */
    @SerializedName("ReservedInstanceIds")
    @Expose
    private String [] ReservedInstanceIds;

    /**
     * Get 预留券实例ID。 
     * @return ReservedInstanceIds 预留券实例ID。
     */
    public String [] getReservedInstanceIds() {
        return this.ReservedInstanceIds;
    }

    /**
     * Set 预留券实例ID。
     * @param ReservedInstanceIds 预留券实例ID。
     */
    public void setReservedInstanceIds(String [] ReservedInstanceIds) {
        this.ReservedInstanceIds = ReservedInstanceIds;
    }

    public DeleteReservedInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteReservedInstancesRequest(DeleteReservedInstancesRequest source) {
        if (source.ReservedInstanceIds != null) {
            this.ReservedInstanceIds = new String[source.ReservedInstanceIds.length];
            for (int i = 0; i < source.ReservedInstanceIds.length; i++) {
                this.ReservedInstanceIds[i] = new String(source.ReservedInstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ReservedInstanceIds.", this.ReservedInstanceIds);

    }
}

