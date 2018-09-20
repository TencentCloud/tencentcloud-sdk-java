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

public class RenewDBInstanceRequest  extends AbstractModel{

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
    private Integer Period;

    /**
    * 是否自动使用代金券，0-不使用；1-使用；默认不实用
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Integer AutoVoucher;

    /**
    * 代金券ID数组，目前只支持使用1张代金券
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * 获取实例ID，形如mssql-j8kv137v
     * @return InstanceId 实例ID，形如mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，形如mssql-j8kv137v
     * @param InstanceId 实例ID，形如mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取续费多少个月，取值范围为1-48，默认为1
     * @return Period 续费多少个月，取值范围为1-48，默认为1
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置续费多少个月，取值范围为1-48，默认为1
     * @param Period 续费多少个月，取值范围为1-48，默认为1
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 获取是否自动使用代金券，0-不使用；1-使用；默认不实用
     * @return AutoVoucher 是否自动使用代金券，0-不使用；1-使用；默认不实用
     */
    public Integer getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * 设置是否自动使用代金券，0-不使用；1-使用；默认不实用
     * @param AutoVoucher 是否自动使用代金券，0-不使用；1-使用；默认不实用
     */
    public void setAutoVoucher(Integer AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * 获取代金券ID数组，目前只支持使用1张代金券
     * @return VoucherIds 代金券ID数组，目前只支持使用1张代金券
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * 设置代金券ID数组，目前只支持使用1张代金券
     * @param VoucherIds 代金券ID数组，目前只支持使用1张代金券
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

