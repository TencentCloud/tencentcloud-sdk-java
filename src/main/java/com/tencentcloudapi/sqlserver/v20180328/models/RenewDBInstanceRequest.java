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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewDBInstanceRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 续费多少个月，取值范围为1-48，默认为1
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 是否自动使用代金券，0-不使用；1-使用；默认不实用
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 代金券ID数组，目前只支持使用1张代金券
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * 续费标记 0:正常续费 1:自动续费：只用于按量计费转包年包月时有效。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get 实例ID，形如mssql-j8kv137v 
     * @return InstanceId 实例ID，形如mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-j8kv137v
     * @param InstanceId 实例ID，形如mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 续费多少个月，取值范围为1-48，默认为1 
     * @return Period 续费多少个月，取值范围为1-48，默认为1
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 续费多少个月，取值范围为1-48，默认为1
     * @param Period 续费多少个月，取值范围为1-48，默认为1
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 是否自动使用代金券，0-不使用；1-使用；默认不实用 
     * @return AutoVoucher 是否自动使用代金券，0-不使用；1-使用；默认不实用
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券，0-不使用；1-使用；默认不实用
     * @param AutoVoucher 是否自动使用代金券，0-不使用；1-使用；默认不实用
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券ID数组，目前只支持使用1张代金券 
     * @return VoucherIds 代金券ID数组，目前只支持使用1张代金券
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券ID数组，目前只支持使用1张代金券
     * @param VoucherIds 代金券ID数组，目前只支持使用1张代金券
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get 续费标记 0:正常续费 1:自动续费：只用于按量计费转包年包月时有效。 
     * @return AutoRenewFlag 续费标记 0:正常续费 1:自动续费：只用于按量计费转包年包月时有效。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 续费标记 0:正常续费 1:自动续费：只用于按量计费转包年包月时有效。
     * @param AutoRenewFlag 续费标记 0:正常续费 1:自动续费：只用于按量计费转包年包月时有效。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public RenewDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDBInstanceRequest(RenewDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

