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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetAddressStatistics extends AbstractModel{

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 互联网公网地址数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetNum")
    @Expose
    private Long SubnetNum;

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 互联网公网地址数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetNum 互联网公网地址数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubnetNum() {
        return this.SubnetNum;
    }

    /**
     * Set 互联网公网地址数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetNum 互联网公网地址数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetNum(Long SubnetNum) {
        this.SubnetNum = SubnetNum;
    }

    public InternetAddressStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternetAddressStatistics(InternetAddressStatistics source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SubnetNum != null) {
            this.SubnetNum = new Long(source.SubnetNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SubnetNum", this.SubnetNum);

    }
}

