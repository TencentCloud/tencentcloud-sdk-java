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

public class DistributeQueryRequest extends AbstractModel{

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
    * 查询类型（1-全部，2-单笔）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 商户分账单号，type为2时，和DistributeNo二者传其一
    */
    @SerializedName("OutDistributeNo")
    @Expose
    private String OutDistributeNo;

    /**
    * 平台分账单号，type为2时，和OutDistributeNo二者传其一
    */
    @SerializedName("DistributeNo")
    @Expose
    private String DistributeNo;

    /**
    * 平台交易订单号
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

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
     * Get 查询类型（1-全部，2-单笔） 
     * @return Type 查询类型（1-全部，2-单笔）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 查询类型（1-全部，2-单笔）
     * @param Type 查询类型（1-全部，2-单笔）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 商户分账单号，type为2时，和DistributeNo二者传其一 
     * @return OutDistributeNo 商户分账单号，type为2时，和DistributeNo二者传其一
     */
    public String getOutDistributeNo() {
        return this.OutDistributeNo;
    }

    /**
     * Set 商户分账单号，type为2时，和DistributeNo二者传其一
     * @param OutDistributeNo 商户分账单号，type为2时，和DistributeNo二者传其一
     */
    public void setOutDistributeNo(String OutDistributeNo) {
        this.OutDistributeNo = OutDistributeNo;
    }

    /**
     * Get 平台分账单号，type为2时，和OutDistributeNo二者传其一 
     * @return DistributeNo 平台分账单号，type为2时，和OutDistributeNo二者传其一
     */
    public String getDistributeNo() {
        return this.DistributeNo;
    }

    /**
     * Set 平台分账单号，type为2时，和OutDistributeNo二者传其一
     * @param DistributeNo 平台分账单号，type为2时，和OutDistributeNo二者传其一
     */
    public void setDistributeNo(String DistributeNo) {
        this.DistributeNo = DistributeNo;
    }

    /**
     * Get 平台交易订单号 
     * @return OrderNo 平台交易订单号
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 平台交易订单号
     * @param OrderNo 平台交易订单号
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
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

    public DistributeQueryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributeQueryRequest(DistributeQueryRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OutDistributeNo != null) {
            this.OutDistributeNo = new String(source.OutDistributeNo);
        }
        if (source.DistributeNo != null) {
            this.DistributeNo = new String(source.DistributeNo);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OutDistributeNo", this.OutDistributeNo);
        this.setParamSimple(map, prefix + "DistributeNo", this.DistributeNo);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

