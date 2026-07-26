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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OnceSchedule extends AbstractModel {

    /**
    * 触发时间
    */
    @SerializedName("FireTime")
    @Expose
    private String FireTime;

    /**
     * Get 触发时间 
     * @return FireTime 触发时间
     */
    public String getFireTime() {
        return this.FireTime;
    }

    /**
     * Set 触发时间
     * @param FireTime 触发时间
     */
    public void setFireTime(String FireTime) {
        this.FireTime = FireTime;
    }

    public OnceSchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OnceSchedule(OnceSchedule source) {
        if (source.FireTime != null) {
            this.FireTime = new String(source.FireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FireTime", this.FireTime);

    }
}

