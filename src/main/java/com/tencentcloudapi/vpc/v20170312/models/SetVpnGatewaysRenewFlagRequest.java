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

public class SetVpnGatewaysRenewFlagRequest extends AbstractModel{

    /**
    * VPNGW字符型ID列表
    */
    @SerializedName("VpnGatewayIds")
    @Expose
    private String [] VpnGatewayIds;

    /**
    * 自动续费标记[0, 1, 2]
0表示默认状态(初始状态)， 1表示自动续费，2表示明确不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * VPNGW类型['IPSEC', 'SSL']
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get VPNGW字符型ID列表 
     * @return VpnGatewayIds VPNGW字符型ID列表
     */
    public String [] getVpnGatewayIds() {
        return this.VpnGatewayIds;
    }

    /**
     * Set VPNGW字符型ID列表
     * @param VpnGatewayIds VPNGW字符型ID列表
     */
    public void setVpnGatewayIds(String [] VpnGatewayIds) {
        this.VpnGatewayIds = VpnGatewayIds;
    }

    /**
     * Get 自动续费标记[0, 1, 2]
0表示默认状态(初始状态)， 1表示自动续费，2表示明确不自动续费 
     * @return AutoRenewFlag 自动续费标记[0, 1, 2]
0表示默认状态(初始状态)， 1表示自动续费，2表示明确不自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记[0, 1, 2]
0表示默认状态(初始状态)， 1表示自动续费，2表示明确不自动续费
     * @param AutoRenewFlag 自动续费标记[0, 1, 2]
0表示默认状态(初始状态)， 1表示自动续费，2表示明确不自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get VPNGW类型['IPSEC', 'SSL'] 
     * @return Type VPNGW类型['IPSEC', 'SSL']
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set VPNGW类型['IPSEC', 'SSL']
     * @param Type VPNGW类型['IPSEC', 'SSL']
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SetVpnGatewaysRenewFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetVpnGatewaysRenewFlagRequest(SetVpnGatewaysRenewFlagRequest source) {
        if (source.VpnGatewayIds != null) {
            this.VpnGatewayIds = new String[source.VpnGatewayIds.length];
            for (int i = 0; i < source.VpnGatewayIds.length; i++) {
                this.VpnGatewayIds[i] = new String(source.VpnGatewayIds[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpnGatewayIds.", this.VpnGatewayIds);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

