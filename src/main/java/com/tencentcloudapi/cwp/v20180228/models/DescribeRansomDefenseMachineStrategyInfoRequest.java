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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRansomDefenseMachineStrategyInfoRequest extends AbstractModel {

    /**
    * 主机Quuid列表
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get 主机Quuid列表 
     * @return Quuids 主机Quuid列表
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 主机Quuid列表
     * @param Quuids 主机Quuid列表
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public DescribeRansomDefenseMachineStrategyInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRansomDefenseMachineStrategyInfoRequest(DescribeRansomDefenseMachineStrategyInfoRequest source) {
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

