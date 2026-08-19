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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchCasterToEmergencyRequest extends AbstractModel {

    /**
    * <p>导播台ID。</p>
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * <p>是否启用从头开始播放功能，仅对单点播输入源生效</p><p>默认值：false</p>
    */
    @SerializedName("FromBeginning")
    @Expose
    private Boolean FromBeginning;

    /**
     * Get <p>导播台ID。</p> 
     * @return CasterId <p>导播台ID。</p>
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set <p>导播台ID。</p>
     * @param CasterId <p>导播台ID。</p>
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get <p>是否启用从头开始播放功能，仅对单点播输入源生效</p><p>默认值：false</p> 
     * @return FromBeginning <p>是否启用从头开始播放功能，仅对单点播输入源生效</p><p>默认值：false</p>
     */
    public Boolean getFromBeginning() {
        return this.FromBeginning;
    }

    /**
     * Set <p>是否启用从头开始播放功能，仅对单点播输入源生效</p><p>默认值：false</p>
     * @param FromBeginning <p>是否启用从头开始播放功能，仅对单点播输入源生效</p><p>默认值：false</p>
     */
    public void setFromBeginning(Boolean FromBeginning) {
        this.FromBeginning = FromBeginning;
    }

    public SwitchCasterToEmergencyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchCasterToEmergencyRequest(SwitchCasterToEmergencyRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.FromBeginning != null) {
            this.FromBeginning = new Boolean(source.FromBeginning);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamSimple(map, prefix + "FromBeginning", this.FromBeginning);

    }
}

