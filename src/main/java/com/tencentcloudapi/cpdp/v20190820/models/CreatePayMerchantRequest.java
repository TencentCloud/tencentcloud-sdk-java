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

public class CreatePayMerchantRequest extends AbstractModel{

    /**
    * 平台编号
    */
    @SerializedName("PlatformCode")
    @Expose
    private String PlatformCode;

    /**
    * 渠道方收款商户编号，由渠道方(银行)提 供。
    */
    @SerializedName("ChannelMerchantNo")
    @Expose
    private String ChannelMerchantNo;

    /**
    * 是否需要向渠道进行 商户信息验证 1:验证
0:不验证
    */
    @SerializedName("ChannelCheckFlag")
    @Expose
    private String ChannelCheckFlag;

    /**
    * 收款商户名称
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 是否开通 B2B 支付 1:开通 0:不开通 缺省:1
    */
    @SerializedName("BusinessPayFlag")
    @Expose
    private String BusinessPayFlag;

    /**
     * Get 平台编号 
     * @return PlatformCode 平台编号
     */
    public String getPlatformCode() {
        return this.PlatformCode;
    }

    /**
     * Set 平台编号
     * @param PlatformCode 平台编号
     */
    public void setPlatformCode(String PlatformCode) {
        this.PlatformCode = PlatformCode;
    }

    /**
     * Get 渠道方收款商户编号，由渠道方(银行)提 供。 
     * @return ChannelMerchantNo 渠道方收款商户编号，由渠道方(银行)提 供。
     */
    public String getChannelMerchantNo() {
        return this.ChannelMerchantNo;
    }

    /**
     * Set 渠道方收款商户编号，由渠道方(银行)提 供。
     * @param ChannelMerchantNo 渠道方收款商户编号，由渠道方(银行)提 供。
     */
    public void setChannelMerchantNo(String ChannelMerchantNo) {
        this.ChannelMerchantNo = ChannelMerchantNo;
    }

    /**
     * Get 是否需要向渠道进行 商户信息验证 1:验证
0:不验证 
     * @return ChannelCheckFlag 是否需要向渠道进行 商户信息验证 1:验证
0:不验证
     */
    public String getChannelCheckFlag() {
        return this.ChannelCheckFlag;
    }

    /**
     * Set 是否需要向渠道进行 商户信息验证 1:验证
0:不验证
     * @param ChannelCheckFlag 是否需要向渠道进行 商户信息验证 1:验证
0:不验证
     */
    public void setChannelCheckFlag(String ChannelCheckFlag) {
        this.ChannelCheckFlag = ChannelCheckFlag;
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
     * Get 是否开通 B2B 支付 1:开通 0:不开通 缺省:1 
     * @return BusinessPayFlag 是否开通 B2B 支付 1:开通 0:不开通 缺省:1
     */
    public String getBusinessPayFlag() {
        return this.BusinessPayFlag;
    }

    /**
     * Set 是否开通 B2B 支付 1:开通 0:不开通 缺省:1
     * @param BusinessPayFlag 是否开通 B2B 支付 1:开通 0:不开通 缺省:1
     */
    public void setBusinessPayFlag(String BusinessPayFlag) {
        this.BusinessPayFlag = BusinessPayFlag;
    }

    public CreatePayMerchantRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePayMerchantRequest(CreatePayMerchantRequest source) {
        if (source.PlatformCode != null) {
            this.PlatformCode = new String(source.PlatformCode);
        }
        if (source.ChannelMerchantNo != null) {
            this.ChannelMerchantNo = new String(source.ChannelMerchantNo);
        }
        if (source.ChannelCheckFlag != null) {
            this.ChannelCheckFlag = new String(source.ChannelCheckFlag);
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
        this.setParamSimple(map, prefix + "PlatformCode", this.PlatformCode);
        this.setParamSimple(map, prefix + "ChannelMerchantNo", this.ChannelMerchantNo);
        this.setParamSimple(map, prefix + "ChannelCheckFlag", this.ChannelCheckFlag);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "BusinessPayFlag", this.BusinessPayFlag);

    }
}

