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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInputRTPSettings extends AbstractModel {

    /**
    * <p>是否FEC。</p>
    */
    @SerializedName("FEC")
    @Expose
    private String FEC;

    /**
    * <p>空闲超时时间。</p>
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
     * Get <p>是否FEC。</p> 
     * @return FEC <p>是否FEC。</p>
     */
    public String getFEC() {
        return this.FEC;
    }

    /**
     * Set <p>是否FEC。</p>
     * @param FEC <p>是否FEC。</p>
     */
    public void setFEC(String FEC) {
        this.FEC = FEC;
    }

    /**
     * Get <p>空闲超时时间。</p> 
     * @return IdleTimeout <p>空闲超时时间。</p>
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set <p>空闲超时时间。</p>
     * @param IdleTimeout <p>空闲超时时间。</p>
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    public DescribeInputRTPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInputRTPSettings(DescribeInputRTPSettings source) {
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

