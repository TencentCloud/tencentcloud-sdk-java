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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RouteECMPAlgorithm extends AbstractModel {

    /**
    *  目标网段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetRouteAlgorithm")
    @Expose
    private String SubnetRouteAlgorithm;

    /**
     * Get  目标网段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestinationCidrBlock  目标网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set  目标网段
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestinationCidrBlock  目标网段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetRouteAlgorithm 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetRouteAlgorithm() {
        return this.SubnetRouteAlgorithm;
    }

    /**
     * Set 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetRouteAlgorithm 支持的 ECMP算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetRouteAlgorithm(String SubnetRouteAlgorithm) {
        this.SubnetRouteAlgorithm = SubnetRouteAlgorithm;
    }

    public RouteECMPAlgorithm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RouteECMPAlgorithm(RouteECMPAlgorithm source) {
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.SubnetRouteAlgorithm != null) {
            this.SubnetRouteAlgorithm = new String(source.SubnetRouteAlgorithm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "SubnetRouteAlgorithm", this.SubnetRouteAlgorithm);

    }
}

