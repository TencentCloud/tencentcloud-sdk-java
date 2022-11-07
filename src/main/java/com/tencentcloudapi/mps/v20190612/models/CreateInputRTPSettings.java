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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInputRTPSettings extends AbstractModel{

    /**
    * 默认为“none”，可选值['none']。
    */
    @SerializedName("FEC")
    @Expose
    private String FEC;

    /**
    * 空闲超时时间，默认5000，单位ms，范围为[1000, 10000]。
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
     * Get 默认为“none”，可选值['none']。 
     * @return FEC 默认为“none”，可选值['none']。
     */
    public String getFEC() {
        return this.FEC;
    }

    /**
     * Set 默认为“none”，可选值['none']。
     * @param FEC 默认为“none”，可选值['none']。
     */
    public void setFEC(String FEC) {
        this.FEC = FEC;
    }

    /**
     * Get 空闲超时时间，默认5000，单位ms，范围为[1000, 10000]。 
     * @return IdleTimeout 空闲超时时间，默认5000，单位ms，范围为[1000, 10000]。
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set 空闲超时时间，默认5000，单位ms，范围为[1000, 10000]。
     * @param IdleTimeout 空闲超时时间，默认5000，单位ms，范围为[1000, 10000]。
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    public CreateInputRTPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInputRTPSettings(CreateInputRTPSettings source) {
        if (source.FEC != null) {
            this.FEC = new String(source.FEC);
        }
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FEC", this.FEC);
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);

    }
}

