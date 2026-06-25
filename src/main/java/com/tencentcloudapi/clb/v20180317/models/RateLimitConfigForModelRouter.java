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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitConfigForModelRouter extends AbstractModel {

    /**
    * <p>每分钟限制的请求数量</p><p>单位：次/分钟</p>
    */
    @SerializedName("RPM")
    @Expose
    private Long RPM;

    /**
    * <p>每分钟限制的Token数量</p><p>单位：个/分钟</p>
    */
    @SerializedName("TPM")
    @Expose
    private Long TPM;

    /**
     * Get <p>每分钟限制的请求数量</p><p>单位：次/分钟</p> 
     * @return RPM <p>每分钟限制的请求数量</p><p>单位：次/分钟</p>
     */
    public Long getRPM() {
        return this.RPM;
    }

    /**
     * Set <p>每分钟限制的请求数量</p><p>单位：次/分钟</p>
     * @param RPM <p>每分钟限制的请求数量</p><p>单位：次/分钟</p>
     */
    public void setRPM(Long RPM) {
        this.RPM = RPM;
    }

    /**
     * Get <p>每分钟限制的Token数量</p><p>单位：个/分钟</p> 
     * @return TPM <p>每分钟限制的Token数量</p><p>单位：个/分钟</p>
     */
    public Long getTPM() {
        return this.TPM;
    }

    /**
     * Set <p>每分钟限制的Token数量</p><p>单位：个/分钟</p>
     * @param TPM <p>每分钟限制的Token数量</p><p>单位：个/分钟</p>
     */
    public void setTPM(Long TPM) {
        this.TPM = TPM;
    }

    public RateLimitConfigForModelRouter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitConfigForModelRouter(RateLimitConfigForModelRouter source) {
        if (source.RPM != null) {
            this.RPM = new Long(source.RPM);
        }
        if (source.TPM != null) {
            this.TPM = new Long(source.TPM);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RPM", this.RPM);
        this.setParamSimple(map, prefix + "TPM", this.TPM);

    }
}

