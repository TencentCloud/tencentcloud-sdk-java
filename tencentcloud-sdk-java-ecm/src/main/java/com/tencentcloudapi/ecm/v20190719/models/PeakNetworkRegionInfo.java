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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakNetworkRegionInfo extends AbstractModel{

    /**
    * region信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 网络峰值集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeakNetworkSet")
    @Expose
    private PeakNetwork [] PeakNetworkSet;

    /**
     * Get region信息 
     * @return Region region信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set region信息
     * @param Region region信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 网络峰值集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeakNetworkSet 网络峰值集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PeakNetwork [] getPeakNetworkSet() {
        return this.PeakNetworkSet;
    }

    /**
     * Set 网络峰值集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeakNetworkSet 网络峰值集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeakNetworkSet(PeakNetwork [] PeakNetworkSet) {
        this.PeakNetworkSet = PeakNetworkSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "PeakNetworkSet.", this.PeakNetworkSet);

    }
}

