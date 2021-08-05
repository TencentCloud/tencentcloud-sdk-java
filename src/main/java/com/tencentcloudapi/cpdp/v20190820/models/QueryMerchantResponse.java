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

public class QueryMerchantResponse extends AbstractModel{

    /**
    * 分配给商户的 AppId，该 AppId 为后续各项 交易的商户标识。
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 收款商户名称。
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * B2B 支付标志。是否开通 B2B 支付， 1:开通 0:不开通。
    */
    @SerializedName("BusinessPayFlag")
    @Expose
    private String BusinessPayFlag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分配给商户的 AppId，该 AppId 为后续各项 交易的商户标识。 
     * @return MerchantAppId 分配给商户的 AppId，该 AppId 为后续各项 交易的商户标识。
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 分配给商户的 AppId，该 AppId 为后续各项 交易的商户标识。
     * @param MerchantAppId 分配给商户的 AppId，该 AppId 为后续各项 交易的商户标识。
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 收款商户名称。 
     * @return MerchantName 收款商户名称。
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 收款商户名称。
     * @param MerchantName 收款商户名称。
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get B2B 支付标志。是否开通 B2B 支付， 1:开通 0:不开通。 
     * @return BusinessPayFlag B2B 支付标志。是否开通 B2B 支付， 1:开通 0:不开通。
     */
    public String getBusinessPayFlag() {
        return this.BusinessPayFlag;
    }

    /**
     * Set B2B 支付标志。是否开通 B2B 支付， 1:开通 0:不开通。
     * @param BusinessPayFlag B2B 支付标志。是否开通 B2B 支付， 1:开通 0:不开通。
     */
    public void setBusinessPayFlag(String BusinessPayFlag) {
        this.BusinessPayFlag = BusinessPayFlag;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public QueryMerchantResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMerchantResponse(QueryMerchantResponse source) {
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.BusinessPayFlag != null) {
            this.BusinessPayFlag = new String(source.BusinessPayFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "BusinessPayFlag", this.BusinessPayFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

