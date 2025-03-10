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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodLimitsByType extends AbstractModel {

    /**
    * TKE共享网卡非固定IP模式可支持的Pod数量
    */
    @SerializedName("TKERouteENINonStaticIP")
    @Expose
    private Long TKERouteENINonStaticIP;

    /**
    * TKE共享网卡固定IP模式可支持的Pod数量
    */
    @SerializedName("TKERouteENIStaticIP")
    @Expose
    private Long TKERouteENIStaticIP;

    /**
    * TKE独立网卡模式可支持的Pod数量
    */
    @SerializedName("TKEDirectENI")
    @Expose
    private Long TKEDirectENI;

    /**
    * TKE中继网卡模式可支持的Pod数量
    */
    @SerializedName("TKESubENI")
    @Expose
    private Long TKESubENI;

    /**
     * Get TKE共享网卡非固定IP模式可支持的Pod数量 
     * @return TKERouteENINonStaticIP TKE共享网卡非固定IP模式可支持的Pod数量
     */
    public Long getTKERouteENINonStaticIP() {
        return this.TKERouteENINonStaticIP;
    }

    /**
     * Set TKE共享网卡非固定IP模式可支持的Pod数量
     * @param TKERouteENINonStaticIP TKE共享网卡非固定IP模式可支持的Pod数量
     */
    public void setTKERouteENINonStaticIP(Long TKERouteENINonStaticIP) {
        this.TKERouteENINonStaticIP = TKERouteENINonStaticIP;
    }

    /**
     * Get TKE共享网卡固定IP模式可支持的Pod数量 
     * @return TKERouteENIStaticIP TKE共享网卡固定IP模式可支持的Pod数量
     */
    public Long getTKERouteENIStaticIP() {
        return this.TKERouteENIStaticIP;
    }

    /**
     * Set TKE共享网卡固定IP模式可支持的Pod数量
     * @param TKERouteENIStaticIP TKE共享网卡固定IP模式可支持的Pod数量
     */
    public void setTKERouteENIStaticIP(Long TKERouteENIStaticIP) {
        this.TKERouteENIStaticIP = TKERouteENIStaticIP;
    }

    /**
     * Get TKE独立网卡模式可支持的Pod数量 
     * @return TKEDirectENI TKE独立网卡模式可支持的Pod数量
     */
    public Long getTKEDirectENI() {
        return this.TKEDirectENI;
    }

    /**
     * Set TKE独立网卡模式可支持的Pod数量
     * @param TKEDirectENI TKE独立网卡模式可支持的Pod数量
     */
    public void setTKEDirectENI(Long TKEDirectENI) {
        this.TKEDirectENI = TKEDirectENI;
    }

    /**
     * Get TKE中继网卡模式可支持的Pod数量 
     * @return TKESubENI TKE中继网卡模式可支持的Pod数量
     */
    public Long getTKESubENI() {
        return this.TKESubENI;
    }

    /**
     * Set TKE中继网卡模式可支持的Pod数量
     * @param TKESubENI TKE中继网卡模式可支持的Pod数量
     */
    public void setTKESubENI(Long TKESubENI) {
        this.TKESubENI = TKESubENI;
    }

    public PodLimitsByType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodLimitsByType(PodLimitsByType source) {
        if (source.TKERouteENINonStaticIP != null) {
            this.TKERouteENINonStaticIP = new Long(source.TKERouteENINonStaticIP);
        }
        if (source.TKERouteENIStaticIP != null) {
            this.TKERouteENIStaticIP = new Long(source.TKERouteENIStaticIP);
        }
        if (source.TKEDirectENI != null) {
            this.TKEDirectENI = new Long(source.TKEDirectENI);
        }
        if (source.TKESubENI != null) {
            this.TKESubENI = new Long(source.TKESubENI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TKERouteENINonStaticIP", this.TKERouteENINonStaticIP);
        this.setParamSimple(map, prefix + "TKERouteENIStaticIP", this.TKERouteENIStaticIP);
        this.setParamSimple(map, prefix + "TKEDirectENI", this.TKEDirectENI);
        this.setParamSimple(map, prefix + "TKESubENI", this.TKESubENI);

    }
}

