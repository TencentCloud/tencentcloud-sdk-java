/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCloudRefundOrderRequest extends AbstractModel {

    /**
    * 米大师分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 用户Id，长度不小于5位，仅支持字母和数字的组合
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
    */
    @SerializedName("RefundId")
    @Expose
    private String RefundId;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
     * Get 米大师分配的支付主MidasAppId 
     * @return MidasAppId 米大师分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 米大师分配的支付主MidasAppId
     * @param MidasAppId 米大师分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 用户Id，长度不小于5位，仅支持字母和数字的组合 
     * @return UserId 用户Id，长度不小于5位，仅支持字母和数字的组合
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户Id，长度不小于5位，仅支持字母和数字的组合
     * @param UserId 用户Id，长度不小于5位，仅支持字母和数字的组合
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合 
     * @return RefundId 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public String getRefundId() {
        return this.RefundId;
    }

    /**
     * Set 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     * @param RefundId 退款订单号，仅支持数字、字母、下划线（_）、横杠字符（-）、点（.）的组合
     */
    public void setRefundId(String RefundId) {
        this.RefundId = RefundId;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param MidasEnvironment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    public QueryCloudRefundOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCloudRefundOrderRequest(QueryCloudRefundOrderRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RefundId != null) {
            this.RefundId = new String(source.RefundId);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RefundId", this.RefundId);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

