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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCosSecKeyInstanceRequest extends AbstractModel {

    /**
    * 地域信息，例如广州：ap-guangzhou，上海：ap-shanghai，默认为广州。
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 密钥有效时间，默认为1小时。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get 地域信息，例如广州：ap-guangzhou，上海：ap-shanghai，默认为广州。 
     * @return CosRegion 地域信息，例如广州：ap-guangzhou，上海：ap-shanghai，默认为广州。
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set 地域信息，例如广州：ap-guangzhou，上海：ap-shanghai，默认为广州。
     * @param CosRegion 地域信息，例如广州：ap-guangzhou，上海：ap-shanghai，默认为广州。
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 密钥有效时间，默认为1小时。 
     * @return Duration 密钥有效时间，默认为1小时。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 密钥有效时间，默认为1小时。
     * @param Duration 密钥有效时间，默认为1小时。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public CreateCosSecKeyInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosSecKeyInstanceRequest(CreateCosSecKeyInstanceRequest source) {
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

