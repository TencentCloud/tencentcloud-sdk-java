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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateL3SwitchRequest extends AbstractModel {

    /**
    * 互通规则ID
    */
    @SerializedName("L3ConnId")
    @Expose
    private String L3ConnId;

    /**
    * 互通规则开关
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get 互通规则ID 
     * @return L3ConnId 互通规则ID
     */
    public String getL3ConnId() {
        return this.L3ConnId;
    }

    /**
     * Set 互通规则ID
     * @param L3ConnId 互通规则ID
     */
    public void setL3ConnId(String L3ConnId) {
        this.L3ConnId = L3ConnId;
    }

    /**
     * Get 互通规则开关 
     * @return Enable 互通规则开关
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 互通规则开关
     * @param Enable 互通规则开关
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public UpdateL3SwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateL3SwitchRequest(UpdateL3SwitchRequest source) {
        if (source.L3ConnId != null) {
            this.L3ConnId = new String(source.L3ConnId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "L3ConnId", this.L3ConnId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

