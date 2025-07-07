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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkConfig extends AbstractModel {

    /**
    * 高防EIP地址
    */
    @SerializedName("AntiDDosEip")
    @Expose
    private String AntiDDosEip;

    /**
    * 高防EIP绑定状态。
0：解绑
1：绑定
    */
    @SerializedName("AntiDDosEipStatus")
    @Expose
    private Long AntiDDosEipStatus;

    /**
    * WAF原生VIP绑定状态。
0：解绑
1：绑定
    */
    @SerializedName("VipStatus")
    @Expose
    private Long VipStatus;

    /**
     * Get 高防EIP地址 
     * @return AntiDDosEip 高防EIP地址
     */
    public String getAntiDDosEip() {
        return this.AntiDDosEip;
    }

    /**
     * Set 高防EIP地址
     * @param AntiDDosEip 高防EIP地址
     */
    public void setAntiDDosEip(String AntiDDosEip) {
        this.AntiDDosEip = AntiDDosEip;
    }

    /**
     * Get 高防EIP绑定状态。
0：解绑
1：绑定 
     * @return AntiDDosEipStatus 高防EIP绑定状态。
0：解绑
1：绑定
     */
    public Long getAntiDDosEipStatus() {
        return this.AntiDDosEipStatus;
    }

    /**
     * Set 高防EIP绑定状态。
0：解绑
1：绑定
     * @param AntiDDosEipStatus 高防EIP绑定状态。
0：解绑
1：绑定
     */
    public void setAntiDDosEipStatus(Long AntiDDosEipStatus) {
        this.AntiDDosEipStatus = AntiDDosEipStatus;
    }

    /**
     * Get WAF原生VIP绑定状态。
0：解绑
1：绑定 
     * @return VipStatus WAF原生VIP绑定状态。
0：解绑
1：绑定
     */
    public Long getVipStatus() {
        return this.VipStatus;
    }

    /**
     * Set WAF原生VIP绑定状态。
0：解绑
1：绑定
     * @param VipStatus WAF原生VIP绑定状态。
0：解绑
1：绑定
     */
    public void setVipStatus(Long VipStatus) {
        this.VipStatus = VipStatus;
    }

    public NetworkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkConfig(NetworkConfig source) {
        if (source.AntiDDosEip != null) {
            this.AntiDDosEip = new String(source.AntiDDosEip);
        }
        if (source.AntiDDosEipStatus != null) {
            this.AntiDDosEipStatus = new Long(source.AntiDDosEipStatus);
        }
        if (source.VipStatus != null) {
            this.VipStatus = new Long(source.VipStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AntiDDosEip", this.AntiDDosEip);
        this.setParamSimple(map, prefix + "AntiDDosEipStatus", this.AntiDDosEipStatus);
        this.setParamSimple(map, prefix + "VipStatus", this.VipStatus);

    }
}

