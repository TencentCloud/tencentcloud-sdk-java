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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApiRateLimitRuleRequest extends AbstractModel{

    /**
    * Api Id
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * qps值
    */
    @SerializedName("MaxQps")
    @Expose
    private Long MaxQps;

    /**
    * 开启/禁用，enabled/disabled, 不传默认开启
    */
    @SerializedName("UsableStatus")
    @Expose
    private String UsableStatus;

    /**
     * Get Api Id 
     * @return ApiId Api Id
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Api Id
     * @param ApiId Api Id
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get qps值 
     * @return MaxQps qps值
     */
    public Long getMaxQps() {
        return this.MaxQps;
    }

    /**
     * Set qps值
     * @param MaxQps qps值
     */
    public void setMaxQps(Long MaxQps) {
        this.MaxQps = MaxQps;
    }

    /**
     * Get 开启/禁用，enabled/disabled, 不传默认开启 
     * @return UsableStatus 开启/禁用，enabled/disabled, 不传默认开启
     */
    public String getUsableStatus() {
        return this.UsableStatus;
    }

    /**
     * Set 开启/禁用，enabled/disabled, 不传默认开启
     * @param UsableStatus 开启/禁用，enabled/disabled, 不传默认开启
     */
    public void setUsableStatus(String UsableStatus) {
        this.UsableStatus = UsableStatus;
    }

    public CreateApiRateLimitRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiRateLimitRuleRequest(CreateApiRateLimitRuleRequest source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.MaxQps != null) {
            this.MaxQps = new Long(source.MaxQps);
        }
        if (source.UsableStatus != null) {
            this.UsableStatus = new String(source.UsableStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "MaxQps", this.MaxQps);
        this.setParamSimple(map, prefix + "UsableStatus", this.UsableStatus);

    }
}

