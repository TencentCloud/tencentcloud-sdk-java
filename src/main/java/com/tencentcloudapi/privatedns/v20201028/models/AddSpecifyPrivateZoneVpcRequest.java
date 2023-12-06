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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSpecifyPrivateZoneVpcRequest extends AbstractModel {

    /**
    * 私有域id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 本次新增的vpc信息
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * 本次新增关联账户vpc信息
    */
    @SerializedName("AccountVpcSet")
    @Expose
    private AccountVpcInfo [] AccountVpcSet;

    /**
    * 是否为同步操作
    */
    @SerializedName("Sync")
    @Expose
    private Boolean Sync;

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
     * Get 本次新增的vpc信息 
     * @return VpcSet 本次新增的vpc信息
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set 本次新增的vpc信息
     * @param VpcSet 本次新增的vpc信息
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get 本次新增关联账户vpc信息 
     * @return AccountVpcSet 本次新增关联账户vpc信息
     */
    public AccountVpcInfo [] getAccountVpcSet() {
        return this.AccountVpcSet;
    }

    /**
     * Set 本次新增关联账户vpc信息
     * @param AccountVpcSet 本次新增关联账户vpc信息
     */
    public void setAccountVpcSet(AccountVpcInfo [] AccountVpcSet) {
        this.AccountVpcSet = AccountVpcSet;
    }

    /**
     * Get 是否为同步操作 
     * @return Sync 是否为同步操作
     */
    public Boolean getSync() {
        return this.Sync;
    }

    /**
     * Set 是否为同步操作
     * @param Sync 是否为同步操作
     */
    public void setSync(Boolean Sync) {
        this.Sync = Sync;
    }

    public AddSpecifyPrivateZoneVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSpecifyPrivateZoneVpcRequest(AddSpecifyPrivateZoneVpcRequest source) {
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
        if (source.Sync != null) {
            this.Sync = new Boolean(source.Sync);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamArrayObj(map, prefix + "AccountVpcSet.", this.AccountVpcSet);
        this.setParamSimple(map, prefix + "Sync", this.Sync);

    }
}

