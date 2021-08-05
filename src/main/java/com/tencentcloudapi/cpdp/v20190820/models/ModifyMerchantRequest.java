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

public class ModifyMerchantRequest extends AbstractModel{

    /**
    * 进件成功后返给商户的AppId
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 收款商户名称
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * B2B 支付标志。是否开通 B2B支付， 1:开通 0:不开通。
    */
    @SerializedName("BusinessPayFlag")
    @Expose
    private String BusinessPayFlag;

    /**
     * Get 进件成功后返给商户的AppId 
     * @return MerchantAppId 进件成功后返给商户的AppId
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 进件成功后返给商户的AppId
     * @param MerchantAppId 进件成功后返给商户的AppId
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 收款商户名称 
     * @return MerchantName 收款商户名称
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 收款商户名称
     * @param MerchantName 收款商户名称
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get B2B 支付标志。是否开通 B2B支付， 1:开通 0:不开通。 
     * @return BusinessPayFlag B2B 支付标志。是否开通 B2B支付， 1:开通 0:不开通。
     */
    public String getBusinessPayFlag() {
        return this.BusinessPayFlag;
    }

    /**
     * Set B2B 支付标志。是否开通 B2B支付， 1:开通 0:不开通。
     * @param BusinessPayFlag B2B 支付标志。是否开通 B2B支付， 1:开通 0:不开通。
     */
    public void setBusinessPayFlag(String BusinessPayFlag) {
        this.BusinessPayFlag = BusinessPayFlag;
    }

    public ModifyMerchantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMerchantRequest(ModifyMerchantRequest source) {
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.BusinessPayFlag != null) {
            this.BusinessPayFlag = new String(source.BusinessPayFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "BusinessPayFlag", this.BusinessPayFlag);

    }
}

