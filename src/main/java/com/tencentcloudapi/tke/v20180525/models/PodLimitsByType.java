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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodLimitsByType extends AbstractModel{

    /**
    * TKE共享网卡非固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TKERouteENINonStaticIP")
    @Expose
    private Long TKERouteENINonStaticIP;

    /**
    * TKE共享网卡固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TKERouteENIStaticIP")
    @Expose
    private Long TKERouteENIStaticIP;

    /**
    * TKE独立网卡模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TKEDirectENI")
    @Expose
    private Long TKEDirectENI;

    /**
     * Get TKE共享网卡非固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TKERouteENINonStaticIP TKE共享网卡非固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTKERouteENINonStaticIP() {
        return this.TKERouteENINonStaticIP;
    }

    /**
     * Set TKE共享网卡非固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TKERouteENINonStaticIP TKE共享网卡非固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTKERouteENINonStaticIP(Long TKERouteENINonStaticIP) {
        this.TKERouteENINonStaticIP = TKERouteENINonStaticIP;
    }

    /**
     * Get TKE共享网卡固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TKERouteENIStaticIP TKE共享网卡固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTKERouteENIStaticIP() {
        return this.TKERouteENIStaticIP;
    }

    /**
     * Set TKE共享网卡固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TKERouteENIStaticIP TKE共享网卡固定IP模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTKERouteENIStaticIP(Long TKERouteENIStaticIP) {
        this.TKERouteENIStaticIP = TKERouteENIStaticIP;
    }

    /**
     * Get TKE独立网卡模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TKEDirectENI TKE独立网卡模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTKEDirectENI() {
        return this.TKEDirectENI;
    }

    /**
     * Set TKE独立网卡模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TKEDirectENI TKE独立网卡模式可支持的Pod数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTKEDirectENI(Long TKEDirectENI) {
        this.TKEDirectENI = TKEDirectENI;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TKERouteENINonStaticIP", this.TKERouteENINonStaticIP);
        this.setParamSimple(map, prefix + "TKERouteENIStaticIP", this.TKERouteENIStaticIP);
        this.setParamSimple(map, prefix + "TKEDirectENI", this.TKEDirectENI);

    }
}

