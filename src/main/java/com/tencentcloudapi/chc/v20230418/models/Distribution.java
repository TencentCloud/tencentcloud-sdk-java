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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Distribution extends AbstractModel {

    /**
    * 机架编号
    */
    @SerializedName("RackNumber")
    @Expose
    private String RackNumber;

    /**
    * 机架的用量分布
    */
    @SerializedName("RackUsageSet")
    @Expose
    private RackUsage [] RackUsageSet;

    /**
     * Get 机架编号 
     * @return RackNumber 机架编号
     */
    public String getRackNumber() {
        return this.RackNumber;
    }

    /**
     * Set 机架编号
     * @param RackNumber 机架编号
     */
    public void setRackNumber(String RackNumber) {
        this.RackNumber = RackNumber;
    }

    /**
     * Get 机架的用量分布 
     * @return RackUsageSet 机架的用量分布
     */
    public RackUsage [] getRackUsageSet() {
        return this.RackUsageSet;
    }

    /**
     * Set 机架的用量分布
     * @param RackUsageSet 机架的用量分布
     */
    public void setRackUsageSet(RackUsage [] RackUsageSet) {
        this.RackUsageSet = RackUsageSet;
    }

    public Distribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Distribution(Distribution source) {
        if (source.RackNumber != null) {
            this.RackNumber = new String(source.RackNumber);
        }
        if (source.RackUsageSet != null) {
            this.RackUsageSet = new RackUsage[source.RackUsageSet.length];
            for (int i = 0; i < source.RackUsageSet.length; i++) {
                this.RackUsageSet[i] = new RackUsage(source.RackUsageSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RackNumber", this.RackNumber);
        this.setParamArrayObj(map, prefix + "RackUsageSet.", this.RackUsageSet);

    }
}

