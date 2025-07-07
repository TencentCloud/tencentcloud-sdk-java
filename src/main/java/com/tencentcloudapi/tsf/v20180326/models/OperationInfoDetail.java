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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationInfoDetail extends AbstractModel {

    /**
    * 不显示的原因
    */
    @SerializedName("DisabledReason")
    @Expose
    private String DisabledReason;

    /**
    * 该按钮是否可点击
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 是否显示该按钮
    */
    @SerializedName("Supported")
    @Expose
    private Boolean Supported;

    /**
     * Get 不显示的原因 
     * @return DisabledReason 不显示的原因
     */
    public String getDisabledReason() {
        return this.DisabledReason;
    }

    /**
     * Set 不显示的原因
     * @param DisabledReason 不显示的原因
     */
    public void setDisabledReason(String DisabledReason) {
        this.DisabledReason = DisabledReason;
    }

    /**
     * Get 该按钮是否可点击 
     * @return Enabled 该按钮是否可点击
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 该按钮是否可点击
     * @param Enabled 该按钮是否可点击
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 是否显示该按钮 
     * @return Supported 是否显示该按钮
     */
    public Boolean getSupported() {
        return this.Supported;
    }

    /**
     * Set 是否显示该按钮
     * @param Supported 是否显示该按钮
     */
    public void setSupported(Boolean Supported) {
        this.Supported = Supported;
    }

    public OperationInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationInfoDetail(OperationInfoDetail source) {
        if (source.DisabledReason != null) {
            this.DisabledReason = new String(source.DisabledReason);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Supported != null) {
            this.Supported = new Boolean(source.Supported);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisabledReason", this.DisabledReason);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Supported", this.Supported);

    }
}

