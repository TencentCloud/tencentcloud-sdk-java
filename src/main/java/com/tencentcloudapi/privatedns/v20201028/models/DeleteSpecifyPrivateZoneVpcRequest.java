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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSpecifyPrivateZoneVpcRequest extends AbstractModel{

    /**
    * 私有域id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 本次删除的VPC
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * 本次删除的关联账户VPC
    */
    @SerializedName("AccountVpcSet")
    @Expose
    private AccountVpcInfo [] AccountVpcSet;

    /**
     * Get 私有域id 
     * @return ZoneId 私有域id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 私有域id
     * @param ZoneId 私有域id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 本次删除的VPC 
     * @return VpcSet 本次删除的VPC
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set 本次删除的VPC
     * @param VpcSet 本次删除的VPC
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get 本次删除的关联账户VPC 
     * @return AccountVpcSet 本次删除的关联账户VPC
     */
    public AccountVpcInfo [] getAccountVpcSet() {
        return this.AccountVpcSet;
    }

    /**
     * Set 本次删除的关联账户VPC
     * @param AccountVpcSet 本次删除的关联账户VPC
     */
    public void setAccountVpcSet(AccountVpcInfo [] AccountVpcSet) {
        this.AccountVpcSet = AccountVpcSet;
    }

    public DeleteSpecifyPrivateZoneVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSpecifyPrivateZoneVpcRequest(DeleteSpecifyPrivateZoneVpcRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.AccountVpcSet != null) {
            this.AccountVpcSet = new AccountVpcInfo[source.AccountVpcSet.length];
            for (int i = 0; i < source.AccountVpcSet.length; i++) {
                this.AccountVpcSet[i] = new AccountVpcInfo(source.AccountVpcSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamArrayObj(map, prefix + "AccountVpcSet.", this.AccountVpcSet);

    }
}

