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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LBOperateProtectInfo extends AbstractModel {

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 保护状态，true：表示开启了操作保护，false：表示未开启操作保护。
    */
    @SerializedName("ProtectState")
    @Expose
    private Boolean ProtectState;

    /**
    * 操作保护的设置uin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * 设置操作保护时的描述信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 负载均衡实例 ID。 
     * @return LoadBalancerId 负载均衡实例 ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LoadBalancerId 负载均衡实例 ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 保护状态，true：表示开启了操作保护，false：表示未开启操作保护。 
     * @return ProtectState 保护状态，true：表示开启了操作保护，false：表示未开启操作保护。
     */
    public Boolean getProtectState() {
        return this.ProtectState;
    }

    /**
     * Set 保护状态，true：表示开启了操作保护，false：表示未开启操作保护。
     * @param ProtectState 保护状态，true：表示开启了操作保护，false：表示未开启操作保护。
     */
    public void setProtectState(Boolean ProtectState) {
        this.ProtectState = ProtectState;
    }

    /**
     * Get 操作保护的设置uin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUin 操作保护的设置uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set 操作保护的设置uin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUin 操作保护的设置uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get 设置操作保护时的描述信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 设置操作保护时的描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 设置操作保护时的描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 设置操作保护时的描述信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 最后修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public LBOperateProtectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LBOperateProtectInfo(LBOperateProtectInfo source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ProtectState != null) {
            this.ProtectState = new Boolean(source.ProtectState);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ProtectState", this.ProtectState);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

