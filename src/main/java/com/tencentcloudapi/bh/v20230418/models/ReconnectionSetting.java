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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconnectionSetting extends AbstractModel {

    /**
    * 重连次数
    */
    @SerializedName("ReconnectionMaxCount")
    @Expose
    private Long ReconnectionMaxCount;

    /**
    * true：可以重连，false：不可以重连
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get 重连次数 
     * @return ReconnectionMaxCount 重连次数
     */
    public Long getReconnectionMaxCount() {
        return this.ReconnectionMaxCount;
    }

    /**
     * Set 重连次数
     * @param ReconnectionMaxCount 重连次数
     */
    public void setReconnectionMaxCount(Long ReconnectionMaxCount) {
        this.ReconnectionMaxCount = ReconnectionMaxCount;
    }

    /**
     * Get true：可以重连，false：不可以重连 
     * @return Enable true：可以重连，false：不可以重连
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set true：可以重连，false：不可以重连
     * @param Enable true：可以重连，false：不可以重连
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public ReconnectionSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconnectionSetting(ReconnectionSetting source) {
        if (source.ReconnectionMaxCount != null) {
            this.ReconnectionMaxCount = new Long(source.ReconnectionMaxCount);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReconnectionMaxCount", this.ReconnectionMaxCount);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

