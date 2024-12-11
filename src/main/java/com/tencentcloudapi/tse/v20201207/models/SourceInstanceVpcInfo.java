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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceInstanceVpcInfo extends AbstractModel {

    /**
    * 微服务引擎VPC信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcID")
    @Expose
    private String VpcID;

    /**
    * 微服务引擎子网信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetID")
    @Expose
    private String SubnetID;

    /**
     * Get 微服务引擎VPC信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcID 微服务引擎VPC信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcID() {
        return this.VpcID;
    }

    /**
     * Set 微服务引擎VPC信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcID 微服务引擎VPC信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcID(String VpcID) {
        this.VpcID = VpcID;
    }

    /**
     * Get 微服务引擎子网信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetID 微服务引擎子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetID() {
        return this.SubnetID;
    }

    /**
     * Set 微服务引擎子网信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetID 微服务引擎子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetID(String SubnetID) {
        this.SubnetID = SubnetID;
    }

    public SourceInstanceVpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceInstanceVpcInfo(SourceInstanceVpcInfo source) {
        if (source.VpcID != null) {
            this.VpcID = new String(source.VpcID);
        }
        if (source.SubnetID != null) {
            this.SubnetID = new String(source.SubnetID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcID", this.VpcID);
        this.setParamSimple(map, prefix + "SubnetID", this.SubnetID);

    }
}

