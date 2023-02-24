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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpngwBandwidthData extends AbstractModel{

    /**
    * 出带宽流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutBandwidth")
    @Expose
    private OutBandwidth OutBandwidth;

    /**
    * 入带宽流量
    */
    @SerializedName("InBandwidth")
    @Expose
    private InBandwidth InBandwidth;

    /**
     * Get 出带宽流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutBandwidth 出带宽流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutBandwidth getOutBandwidth() {
        return this.OutBandwidth;
    }

    /**
     * Set 出带宽流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutBandwidth 出带宽流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutBandwidth(OutBandwidth OutBandwidth) {
        this.OutBandwidth = OutBandwidth;
    }

    /**
     * Get 入带宽流量 
     * @return InBandwidth 入带宽流量
     */
    public InBandwidth getInBandwidth() {
        return this.InBandwidth;
    }

    /**
     * Set 入带宽流量
     * @param InBandwidth 入带宽流量
     */
    public void setInBandwidth(InBandwidth InBandwidth) {
        this.InBandwidth = InBandwidth;
    }

    public VpngwBandwidthData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpngwBandwidthData(VpngwBandwidthData source) {
        if (source.OutBandwidth != null) {
            this.OutBandwidth = new OutBandwidth(source.OutBandwidth);
        }
        if (source.InBandwidth != null) {
            this.InBandwidth = new InBandwidth(source.InBandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OutBandwidth.", this.OutBandwidth);
        this.setParamObj(map, prefix + "InBandwidth.", this.InBandwidth);

    }
}

