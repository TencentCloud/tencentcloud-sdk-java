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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackRoGroupInfo extends AbstractModel {

    /**
    * 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * vpc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 子网信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * vip信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * vport信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get 实例组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroupId 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroupId 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get vpc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqVpcId vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqVpcId vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 子网信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqSubnetId 子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqSubnetId 子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get vip信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip vip信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip vip信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get vport信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vport vport信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set vport信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vport vport信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    public RollbackRoGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackRoGroupInfo(RollbackRoGroupInfo source) {
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

