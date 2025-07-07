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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccurateQpsThreshold extends AbstractModel {

    /**
    * qps阈值控制维度,包含:second、minute、hour、day、month、year
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 全局配置ID
    */
    @SerializedName("GlobalConfigId")
    @Expose
    private String GlobalConfigId;

    /**
     * Get qps阈值控制维度,包含:second、minute、hour、day、month、year 
     * @return Unit qps阈值控制维度,包含:second、minute、hour、day、month、year
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set qps阈值控制维度,包含:second、minute、hour、day、month、year
     * @param Unit qps阈值控制维度,包含:second、minute、hour、day、month、year
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 全局配置ID 
     * @return GlobalConfigId 全局配置ID
     */
    public String getGlobalConfigId() {
        return this.GlobalConfigId;
    }

    /**
     * Set 全局配置ID
     * @param GlobalConfigId 全局配置ID
     */
    public void setGlobalConfigId(String GlobalConfigId) {
        this.GlobalConfigId = GlobalConfigId;
    }

    public AccurateQpsThreshold() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccurateQpsThreshold(AccurateQpsThreshold source) {
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.GlobalConfigId != null) {
            this.GlobalConfigId = new String(source.GlobalConfigId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "GlobalConfigId", this.GlobalConfigId);

    }
}

