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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEnterpriseSecurityDispatchStatusRequest extends AbstractModel {

    /**
    * <p>0：打开立即下发开关；</p><p>1：关闭立即下发开关；</p><p>2：关闭立即下发开关情况下，触发开始下发</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>开启自动下发时，注明本次修改是否为空绑资产绑定兜底安全组</p>
    */
    @SerializedName("BindFallbackOnce")
    @Expose
    private Long BindFallbackOnce;

    /**
     * Get <p>0：打开立即下发开关；</p><p>1：关闭立即下发开关；</p><p>2：关闭立即下发开关情况下，触发开始下发</p> 
     * @return Status <p>0：打开立即下发开关；</p><p>1：关闭立即下发开关；</p><p>2：关闭立即下发开关情况下，触发开始下发</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>0：打开立即下发开关；</p><p>1：关闭立即下发开关；</p><p>2：关闭立即下发开关情况下，触发开始下发</p>
     * @param Status <p>0：打开立即下发开关；</p><p>1：关闭立即下发开关；</p><p>2：关闭立即下发开关情况下，触发开始下发</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>开启自动下发时，注明本次修改是否为空绑资产绑定兜底安全组</p> 
     * @return BindFallbackOnce <p>开启自动下发时，注明本次修改是否为空绑资产绑定兜底安全组</p>
     */
    public Long getBindFallbackOnce() {
        return this.BindFallbackOnce;
    }

    /**
     * Set <p>开启自动下发时，注明本次修改是否为空绑资产绑定兜底安全组</p>
     * @param BindFallbackOnce <p>开启自动下发时，注明本次修改是否为空绑资产绑定兜底安全组</p>
     */
    public void setBindFallbackOnce(Long BindFallbackOnce) {
        this.BindFallbackOnce = BindFallbackOnce;
    }

    public ModifyEnterpriseSecurityDispatchStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnterpriseSecurityDispatchStatusRequest(ModifyEnterpriseSecurityDispatchStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BindFallbackOnce != null) {
            this.BindFallbackOnce = new Long(source.BindFallbackOnce);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BindFallbackOnce", this.BindFallbackOnce);

    }
}

