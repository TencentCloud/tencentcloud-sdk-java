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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrequencyLimitConfig extends AbstractModel {

    /**
    * 限额对象 "ConnectionsLimit" 或 "QPSLimit"
    */
    @SerializedName("LimitObject")
    @Expose
    private String LimitObject;

    /**
    * 限额配置
    */
    @SerializedName("LimitConfig")
    @Expose
    private String LimitConfig;

    /**
     * Get 限额对象 "ConnectionsLimit" 或 "QPSLimit" 
     * @return LimitObject 限额对象 "ConnectionsLimit" 或 "QPSLimit"
     */
    public String getLimitObject() {
        return this.LimitObject;
    }

    /**
     * Set 限额对象 "ConnectionsLimit" 或 "QPSLimit"
     * @param LimitObject 限额对象 "ConnectionsLimit" 或 "QPSLimit"
     */
    public void setLimitObject(String LimitObject) {
        this.LimitObject = LimitObject;
    }

    /**
     * Get 限额配置 
     * @return LimitConfig 限额配置
     */
    public String getLimitConfig() {
        return this.LimitConfig;
    }

    /**
     * Set 限额配置
     * @param LimitConfig 限额配置
     */
    public void setLimitConfig(String LimitConfig) {
        this.LimitConfig = LimitConfig;
    }

    public FrequencyLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrequencyLimitConfig(FrequencyLimitConfig source) {
        if (source.LimitObject != null) {
            this.LimitObject = new String(source.LimitObject);
        }
        if (source.LimitConfig != null) {
            this.LimitConfig = new String(source.LimitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitObject", this.LimitObject);
        this.setParamSimple(map, prefix + "LimitConfig", this.LimitConfig);

    }
}

