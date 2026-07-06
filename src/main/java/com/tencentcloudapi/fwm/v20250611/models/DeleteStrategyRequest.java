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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteStrategyRequest extends AbstractModel {

    /**
    * 策略Id列表
    */
    @SerializedName("StrategyIds")
    @Expose
    private String [] StrategyIds;

    /**
     * Get 策略Id列表 
     * @return StrategyIds 策略Id列表
     */
    public String [] getStrategyIds() {
        return this.StrategyIds;
    }

    /**
     * Set 策略Id列表
     * @param StrategyIds 策略Id列表
     */
    public void setStrategyIds(String [] StrategyIds) {
        this.StrategyIds = StrategyIds;
    }

    public DeleteStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteStrategyRequest(DeleteStrategyRequest source) {
        if (source.StrategyIds != null) {
            this.StrategyIds = new String[source.StrategyIds.length];
            for (int i = 0; i < source.StrategyIds.length; i++) {
                this.StrategyIds[i] = new String(source.StrategyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StrategyIds.", this.StrategyIds);

    }
}

