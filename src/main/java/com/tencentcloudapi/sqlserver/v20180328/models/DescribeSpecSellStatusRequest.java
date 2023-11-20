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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecSellStatusRequest extends AbstractModel {

    /**
    * 可用区英文ID，形如ap-guangzhou-3
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例规格ID，可通过DescribeProductConfig接口获取。
    */
    @SerializedName("SpecIdSet")
    @Expose
    private Long [] SpecIdSet;

    /**
    * 数据库版本信息，可通过DescribeProductConfig接口获取。
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 产品ID，可通过DescribeProductConfig接口获取。
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * 付费模式，POST-按量计费 PRE-包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 付费模式，CNY-人民币 USD-美元
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get 可用区英文ID，形如ap-guangzhou-3 
     * @return Zone 可用区英文ID，形如ap-guangzhou-3
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区英文ID，形如ap-guangzhou-3
     * @param Zone 可用区英文ID，形如ap-guangzhou-3
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例规格ID，可通过DescribeProductConfig接口获取。 
     * @return SpecIdSet 实例规格ID，可通过DescribeProductConfig接口获取。
     */
    public Long [] getSpecIdSet() {
        return this.SpecIdSet;
    }

    /**
     * Set 实例规格ID，可通过DescribeProductConfig接口获取。
     * @param SpecIdSet 实例规格ID，可通过DescribeProductConfig接口获取。
     */
    public void setSpecIdSet(Long [] SpecIdSet) {
        this.SpecIdSet = SpecIdSet;
    }

    /**
     * Get 数据库版本信息，可通过DescribeProductConfig接口获取。 
     * @return DBVersion 数据库版本信息，可通过DescribeProductConfig接口获取。
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set 数据库版本信息，可通过DescribeProductConfig接口获取。
     * @param DBVersion 数据库版本信息，可通过DescribeProductConfig接口获取。
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 产品ID，可通过DescribeProductConfig接口获取。 
     * @return Pid 产品ID，可通过DescribeProductConfig接口获取。
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 产品ID，可通过DescribeProductConfig接口获取。
     * @param Pid 产品ID，可通过DescribeProductConfig接口获取。
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 付费模式，POST-按量计费 PRE-包年包月 
     * @return PayMode 付费模式，POST-按量计费 PRE-包年包月
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式，POST-按量计费 PRE-包年包月
     * @param PayMode 付费模式，POST-按量计费 PRE-包年包月
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 付费模式，CNY-人民币 USD-美元 
     * @return Currency 付费模式，CNY-人民币 USD-美元
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 付费模式，CNY-人民币 USD-美元
     * @param Currency 付费模式，CNY-人民币 USD-美元
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public DescribeSpecSellStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecSellStatusRequest(DescribeSpecSellStatusRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SpecIdSet != null) {
            this.SpecIdSet = new Long[source.SpecIdSet.length];
            for (int i = 0; i < source.SpecIdSet.length; i++) {
                this.SpecIdSet[i] = new Long(source.SpecIdSet[i]);
            }
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "SpecIdSet.", this.SpecIdSet);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

