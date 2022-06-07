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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSGeoIp extends AbstractModel{

    /**
    * 地域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long [] RegionId;

    /**
    * 区域封禁清空标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get 地域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long [] RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域封禁清空标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 区域封禁清空标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 区域封禁清空标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 区域封禁清空标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public DDoSGeoIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSGeoIp(DDoSGeoIp source) {
        if (source.RegionId != null) {
            this.RegionId = new Long[source.RegionId.length];
            for (int i = 0; i < source.RegionId.length; i++) {
                this.RegionId[i] = new Long(source.RegionId[i]);
            }
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RegionId.", this.RegionId);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

