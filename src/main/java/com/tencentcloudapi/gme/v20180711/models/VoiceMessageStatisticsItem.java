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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceMessageStatisticsItem extends AbstractModel {

    /**
    * 离线语音DAU
    */
    @SerializedName("Dau")
    @Expose
    private Long Dau;

    /**
     * Get 离线语音DAU 
     * @return Dau 离线语音DAU
     */
    public Long getDau() {
        return this.Dau;
    }

    /**
     * Set 离线语音DAU
     * @param Dau 离线语音DAU
     */
    public void setDau(Long Dau) {
        this.Dau = Dau;
    }

    public VoiceMessageStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceMessageStatisticsItem(VoiceMessageStatisticsItem source) {
        if (source.Dau != null) {
            this.Dau = new Long(source.Dau);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dau", this.Dau);

    }
}

