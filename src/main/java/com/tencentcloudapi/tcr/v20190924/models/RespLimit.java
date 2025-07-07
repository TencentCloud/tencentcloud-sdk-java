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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RespLimit extends AbstractModel {

    /**
    * 配额信息
    */
    @SerializedName("LimitInfo")
    @Expose
    private Limit [] LimitInfo;

    /**
     * Get 配额信息 
     * @return LimitInfo 配额信息
     */
    public Limit [] getLimitInfo() {
        return this.LimitInfo;
    }

    /**
     * Set 配额信息
     * @param LimitInfo 配额信息
     */
    public void setLimitInfo(Limit [] LimitInfo) {
        this.LimitInfo = LimitInfo;
    }

    public RespLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RespLimit(RespLimit source) {
        if (source.LimitInfo != null) {
            this.LimitInfo = new Limit[source.LimitInfo.length];
            for (int i = 0; i < source.LimitInfo.length; i++) {
                this.LimitInfo[i] = new Limit(source.LimitInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LimitInfo.", this.LimitInfo);

    }
}

