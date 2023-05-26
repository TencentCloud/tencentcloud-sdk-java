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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessPolicy extends AbstractModel{

    /**
    * 目的CIDR
    */
    @SerializedName("TargetCidr")
    @Expose
    private String TargetCidr;

    /**
    * 策略ID
    */
    @SerializedName("VpnGatewayIdSslAccessPolicyId")
    @Expose
    private String VpnGatewayIdSslAccessPolicyId;

    /**
    * 是否对所有用户都生效。1 生效 0不生效
    */
    @SerializedName("ForAllClient")
    @Expose
    private Long ForAllClient;

    /**
    * 用户组ID
    */
    @SerializedName("UserGroupIds")
    @Expose
    private String [] UserGroupIds;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Remark
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 目的CIDR 
     * @return TargetCidr 目的CIDR
     */
    public String getTargetCidr() {
        return this.TargetCidr;
    }

    /**
     * Set 目的CIDR
     * @param TargetCidr 目的CIDR
     */
    public void setTargetCidr(String TargetCidr) {
        this.TargetCidr = TargetCidr;
    }

    /**
     * Get 策略ID 
     * @return VpnGatewayIdSslAccessPolicyId 策略ID
     */
    public String getVpnGatewayIdSslAccessPolicyId() {
        return this.VpnGatewayIdSslAccessPolicyId;
    }

    /**
     * Set 策略ID
     * @param VpnGatewayIdSslAccessPolicyId 策略ID
     */
    public void setVpnGatewayIdSslAccessPolicyId(String VpnGatewayIdSslAccessPolicyId) {
        this.VpnGatewayIdSslAccessPolicyId = VpnGatewayIdSslAccessPolicyId;
    }

    /**
     * Get 是否对所有用户都生效。1 生效 0不生效 
     * @return ForAllClient 是否对所有用户都生效。1 生效 0不生效
     */
    public Long getForAllClient() {
        return this.ForAllClient;
    }

    /**
     * Set 是否对所有用户都生效。1 生效 0不生效
     * @param ForAllClient 是否对所有用户都生效。1 生效 0不生效
     */
    public void setForAllClient(Long ForAllClient) {
        this.ForAllClient = ForAllClient;
    }

    /**
     * Get 用户组ID 
     * @return UserGroupIds 用户组ID
     */
    public String [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set 用户组ID
     * @param UserGroupIds 用户组ID
     */
    public void setUserGroupIds(String [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Remark
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark Remark
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remark
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark Remark
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AccessPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessPolicy(AccessPolicy source) {
        if (source.TargetCidr != null) {
            this.TargetCidr = new String(source.TargetCidr);
        }
        if (source.VpnGatewayIdSslAccessPolicyId != null) {
            this.VpnGatewayIdSslAccessPolicyId = new String(source.VpnGatewayIdSslAccessPolicyId);
        }
        if (source.ForAllClient != null) {
            this.ForAllClient = new Long(source.ForAllClient);
        }
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new String[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new String(source.UserGroupIds[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetCidr", this.TargetCidr);
        this.setParamSimple(map, prefix + "VpnGatewayIdSslAccessPolicyId", this.VpnGatewayIdSslAccessPolicyId);
        this.setParamSimple(map, prefix + "ForAllClient", this.ForAllClient);
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

