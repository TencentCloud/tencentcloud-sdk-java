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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysePayModeDetail extends AbstractModel {

    /**
    * 计费模式code
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 计费模式Name
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
     * Get 计费模式code 
     * @return PayMode 计费模式code
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式code
     * @param PayMode 计费模式code
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 计费模式Name 
     * @return PayModeName 计费模式Name
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set 计费模式Name
     * @param PayModeName 计费模式Name
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    public AnalysePayModeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysePayModeDetail(AnalysePayModeDetail source) {
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);

    }
}

