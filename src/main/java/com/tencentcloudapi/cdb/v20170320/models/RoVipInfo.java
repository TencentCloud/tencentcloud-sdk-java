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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoVipInfo extends AbstractModel {

    /**
    * 只读vip状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoVipStatus")
    @Expose
    private Long RoVipStatus;

    /**
    * 只读vip的子网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoSubnetId")
    @Expose
    private Long RoSubnetId;

    /**
    * 只读vip的私有网络
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoVpcId")
    @Expose
    private Long RoVpcId;

    /**
    * 只读vip的端口号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoVport")
    @Expose
    private Long RoVport;

    /**
    * 只读vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoVip")
    @Expose
    private String RoVip;

    /**
     * Get 只读vip状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoVipStatus 只读vip状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoVipStatus() {
        return this.RoVipStatus;
    }

    /**
     * Set 只读vip状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoVipStatus 只读vip状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoVipStatus(Long RoVipStatus) {
        this.RoVipStatus = RoVipStatus;
    }

    /**
     * Get 只读vip的子网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoSubnetId 只读vip的子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoSubnetId() {
        return this.RoSubnetId;
    }

    /**
     * Set 只读vip的子网
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoSubnetId 只读vip的子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoSubnetId(Long RoSubnetId) {
        this.RoSubnetId = RoSubnetId;
    }

    /**
     * Get 只读vip的私有网络
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoVpcId 只读vip的私有网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoVpcId() {
        return this.RoVpcId;
    }

    /**
     * Set 只读vip的私有网络
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoVpcId 只读vip的私有网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoVpcId(Long RoVpcId) {
        this.RoVpcId = RoVpcId;
    }

    /**
     * Get 只读vip的端口号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoVport 只读vip的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoVport() {
        return this.RoVport;
    }

    /**
     * Set 只读vip的端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoVport 只读vip的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoVport(Long RoVport) {
        this.RoVport = RoVport;
    }

    /**
     * Get 只读vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoVip 只读vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoVip() {
        return this.RoVip;
    }

    /**
     * Set 只读vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoVip 只读vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoVip(String RoVip) {
        this.RoVip = RoVip;
    }

    public RoVipInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoVipInfo(RoVipInfo source) {
        if (source.RoVipStatus != null) {
            this.RoVipStatus = new Long(source.RoVipStatus);
        }
        if (source.RoSubnetId != null) {
            this.RoSubnetId = new Long(source.RoSubnetId);
        }
        if (source.RoVpcId != null) {
            this.RoVpcId = new Long(source.RoVpcId);
        }
        if (source.RoVport != null) {
            this.RoVport = new Long(source.RoVport);
        }
        if (source.RoVip != null) {
            this.RoVip = new String(source.RoVip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoVipStatus", this.RoVipStatus);
        this.setParamSimple(map, prefix + "RoSubnetId", this.RoSubnetId);
        this.setParamSimple(map, prefix + "RoVpcId", this.RoVpcId);
        this.setParamSimple(map, prefix + "RoVport", this.RoVport);
        this.setParamSimple(map, prefix + "RoVip", this.RoVip);

    }
}

