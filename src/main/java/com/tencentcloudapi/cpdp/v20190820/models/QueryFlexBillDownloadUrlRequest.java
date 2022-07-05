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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFlexBillDownloadUrlRequest extends AbstractModel{

    /**
    * 对账单日期
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

    /**
    * 对账单类型：FREEZE, SETTLEMENT,PAYMENT
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * 服务商ID，如不填则查询平台级别对账单文件
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 对账单日期 
     * @return BillDate 对账单日期
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set 对账单日期
     * @param BillDate 对账单日期
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    /**
     * Get 对账单类型：FREEZE, SETTLEMENT,PAYMENT 
     * @return BillType 对账单类型：FREEZE, SETTLEMENT,PAYMENT
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set 对账单类型：FREEZE, SETTLEMENT,PAYMENT
     * @param BillType 对账单类型：FREEZE, SETTLEMENT,PAYMENT
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get 服务商ID，如不填则查询平台级别对账单文件 
     * @return ServiceProviderId 服务商ID，如不填则查询平台级别对账单文件
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set 服务商ID，如不填则查询平台级别对账单文件
     * @param ServiceProviderId 服务商ID，如不填则查询平台级别对账单文件
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境 
     * @return Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     * @param Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public QueryFlexBillDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFlexBillDownloadUrlRequest(QueryFlexBillDownloadUrlRequest source) {
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

