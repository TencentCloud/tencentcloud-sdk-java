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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusRegionsRequest extends AbstractModel {

    /**
    * 1-预付费，2-后付费，3-全地域（不填默认全地域）
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get 1-预付费，2-后付费，3-全地域（不填默认全地域） 
     * @return PayMode 1-预付费，2-后付费，3-全地域（不填默认全地域）
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 1-预付费，2-后付费，3-全地域（不填默认全地域）
     * @param PayMode 1-预付费，2-后付费，3-全地域（不填默认全地域）
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    public DescribePrometheusRegionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusRegionsRequest(DescribePrometheusRegionsRequest source) {
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

