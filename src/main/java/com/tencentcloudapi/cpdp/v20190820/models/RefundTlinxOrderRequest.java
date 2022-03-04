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

public class RefundTlinxOrderRequest extends AbstractModel{

    /**
    * 使用门店OpenId
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 使用门店OpenKey
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 原始订单的开发者交易流水号
    */
    @SerializedName("DeveloperNo")
    @Expose
    private String DeveloperNo;

    /**
    * 新退款订单的开发者流水号，同一门店内唯一
    */
    @SerializedName("RefundOutNo")
    @Expose
    private String RefundOutNo;

    /**
    * 退款订单名称，可以为空
    */
    @SerializedName("RefundOrderName")
    @Expose
    private String RefundOrderName;

    /**
    * 退款金额（以分为单位，没有小数点）
    */
    @SerializedName("RefundAmount")
    @Expose
    private String RefundAmount;

    /**
    * 主管密码，对密码进行SHA-1加密，默认为123456
    */
    @SerializedName("ShopPassword")
    @Expose
    private String ShopPassword;

    /**
    * 退款备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 使用门店OpenId 
     * @return OpenId 使用门店OpenId
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 使用门店OpenId
     * @param OpenId 使用门店OpenId
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 使用门店OpenKey 
     * @return OpenKey 使用门店OpenKey
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 使用门店OpenKey
     * @param OpenKey 使用门店OpenKey
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 原始订单的开发者交易流水号 
     * @return DeveloperNo 原始订单的开发者交易流水号
     */
    public String getDeveloperNo() {
        return this.DeveloperNo;
    }

    /**
     * Set 原始订单的开发者交易流水号
     * @param DeveloperNo 原始订单的开发者交易流水号
     */
    public void setDeveloperNo(String DeveloperNo) {
        this.DeveloperNo = DeveloperNo;
    }

    /**
     * Get 新退款订单的开发者流水号，同一门店内唯一 
     * @return RefundOutNo 新退款订单的开发者流水号，同一门店内唯一
     */
    public String getRefundOutNo() {
        return this.RefundOutNo;
    }

    /**
     * Set 新退款订单的开发者流水号，同一门店内唯一
     * @param RefundOutNo 新退款订单的开发者流水号，同一门店内唯一
     */
    public void setRefundOutNo(String RefundOutNo) {
        this.RefundOutNo = RefundOutNo;
    }

    /**
     * Get 退款订单名称，可以为空 
     * @return RefundOrderName 退款订单名称，可以为空
     */
    public String getRefundOrderName() {
        return this.RefundOrderName;
    }

    /**
     * Set 退款订单名称，可以为空
     * @param RefundOrderName 退款订单名称，可以为空
     */
    public void setRefundOrderName(String RefundOrderName) {
        this.RefundOrderName = RefundOrderName;
    }

    /**
     * Get 退款金额（以分为单位，没有小数点） 
     * @return RefundAmount 退款金额（以分为单位，没有小数点）
     */
    public String getRefundAmount() {
        return this.RefundAmount;
    }

    /**
     * Set 退款金额（以分为单位，没有小数点）
     * @param RefundAmount 退款金额（以分为单位，没有小数点）
     */
    public void setRefundAmount(String RefundAmount) {
        this.RefundAmount = RefundAmount;
    }

    /**
     * Get 主管密码，对密码进行SHA-1加密，默认为123456 
     * @return ShopPassword 主管密码，对密码进行SHA-1加密，默认为123456
     */
    public String getShopPassword() {
        return this.ShopPassword;
    }

    /**
     * Set 主管密码，对密码进行SHA-1加密，默认为123456
     * @param ShopPassword 主管密码，对密码进行SHA-1加密，默认为123456
     */
    public void setShopPassword(String ShopPassword) {
        this.ShopPassword = ShopPassword;
    }

    /**
     * Get 退款备注 
     * @return Remark 退款备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 退款备注
     * @param Remark 退款备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 沙箱环境填sandbox，正式环境不填 
     * @return Profile 沙箱环境填sandbox，正式环境不填
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 沙箱环境填sandbox，正式环境不填
     * @param Profile 沙箱环境填sandbox，正式环境不填
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public RefundTlinxOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefundTlinxOrderRequest(RefundTlinxOrderRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.DeveloperNo != null) {
            this.DeveloperNo = new String(source.DeveloperNo);
        }
        if (source.RefundOutNo != null) {
            this.RefundOutNo = new String(source.RefundOutNo);
        }
        if (source.RefundOrderName != null) {
            this.RefundOrderName = new String(source.RefundOrderName);
        }
        if (source.RefundAmount != null) {
            this.RefundAmount = new String(source.RefundAmount);
        }
        if (source.ShopPassword != null) {
            this.ShopPassword = new String(source.ShopPassword);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamSimple(map, prefix + "DeveloperNo", this.DeveloperNo);
        this.setParamSimple(map, prefix + "RefundOutNo", this.RefundOutNo);
        this.setParamSimple(map, prefix + "RefundOrderName", this.RefundOrderName);
        this.setParamSimple(map, prefix + "RefundAmount", this.RefundAmount);
        this.setParamSimple(map, prefix + "ShopPassword", this.ShopPassword);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

