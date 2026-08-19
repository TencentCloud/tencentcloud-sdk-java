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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CWPOrderExtraParam extends AbstractModel {

    /**
    * PrePay 包年包月
PostPay 按量计费
Disposable 一次性交付
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 一次性服务交付状态,仅一次性资源订单才有该值
false 未验收
true 已验收
    */
    @SerializedName("DisposableStatus")
    @Expose
    private Boolean DisposableStatus;

    /**
     * Get PrePay 包年包月
PostPay 按量计费
Disposable 一次性交付 
     * @return Mode PrePay 包年包月
PostPay 按量计费
Disposable 一次性交付
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set PrePay 包年包月
PostPay 按量计费
Disposable 一次性交付
     * @param Mode PrePay 包年包月
PostPay 按量计费
Disposable 一次性交付
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 一次性服务交付状态,仅一次性资源订单才有该值
false 未验收
true 已验收 
     * @return DisposableStatus 一次性服务交付状态,仅一次性资源订单才有该值
false 未验收
true 已验收
     */
    public Boolean getDisposableStatus() {
        return this.DisposableStatus;
    }

    /**
     * Set 一次性服务交付状态,仅一次性资源订单才有该值
false 未验收
true 已验收
     * @param DisposableStatus 一次性服务交付状态,仅一次性资源订单才有该值
false 未验收
true 已验收
     */
    public void setDisposableStatus(Boolean DisposableStatus) {
        this.DisposableStatus = DisposableStatus;
    }

    public CWPOrderExtraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CWPOrderExtraParam(CWPOrderExtraParam source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.DisposableStatus != null) {
            this.DisposableStatus = new Boolean(source.DisposableStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "DisposableStatus", this.DisposableStatus);

    }
}

