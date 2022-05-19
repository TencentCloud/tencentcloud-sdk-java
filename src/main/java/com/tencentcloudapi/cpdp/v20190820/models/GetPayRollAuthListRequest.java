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

public class GetPayRollAuthListRequest extends AbstractModel{

    /**
    * 用户在商户对应appid下的唯一标识
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 微信服务商下特约商户的商户号，由微信支付生成并下发
    */
    @SerializedName("SubMerchantId")
    @Expose
    private String SubMerchantId;

    /**
    * 核身日期，一次只能查询一天，最久可查询90天内的记录，格式为YYYY-MM-DD
    */
    @SerializedName("AuthDate")
    @Expose
    private String AuthDate;

    /**
    * 非负整数，表示该次请求资源的起始位置，从0开始计数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 非0非负的整数，该次请求可返回的最大资源条数，默认值为10，最大支持10条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是服务商在微信申请公众号/小程序或移动应用成功后分配的账号ID（与服务商主体一致）
当输入服务商Appid时，会校验其与服务商商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID
    */
    @SerializedName("WechatAppId")
    @Expose
    private String WechatAppId;

    /**
    * 特约商户在微信申请公众号/小程序或移动应用成功后分配的账号ID（与特约商户主体一致）
当输入特约商户Appid时，会校验其与特约商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID
    */
    @SerializedName("WechatSubAppId")
    @Expose
    private String WechatSubAppId;

    /**
    * 核身状态，列表查询仅提供成功状态的核身记录查询，故此字段固定AUTHENTICATE_SUCCESS即可
    */
    @SerializedName("AuthStatus")
    @Expose
    private String AuthStatus;

    /**
     * Get 用户在商户对应appid下的唯一标识 
     * @return OpenId 用户在商户对应appid下的唯一标识
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户在商户对应appid下的唯一标识
     * @param OpenId 用户在商户对应appid下的唯一标识
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 微信服务商下特约商户的商户号，由微信支付生成并下发 
     * @return SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public String getSubMerchantId() {
        return this.SubMerchantId;
    }

    /**
     * Set 微信服务商下特约商户的商户号，由微信支付生成并下发
     * @param SubMerchantId 微信服务商下特约商户的商户号，由微信支付生成并下发
     */
    public void setSubMerchantId(String SubMerchantId) {
        this.SubMerchantId = SubMerchantId;
    }

    /**
     * Get 核身日期，一次只能查询一天，最久可查询90天内的记录，格式为YYYY-MM-DD 
     * @return AuthDate 核身日期，一次只能查询一天，最久可查询90天内的记录，格式为YYYY-MM-DD
     */
    public String getAuthDate() {
        return this.AuthDate;
    }

    /**
     * Set 核身日期，一次只能查询一天，最久可查询90天内的记录，格式为YYYY-MM-DD
     * @param AuthDate 核身日期，一次只能查询一天，最久可查询90天内的记录，格式为YYYY-MM-DD
     */
    public void setAuthDate(String AuthDate) {
        this.AuthDate = AuthDate;
    }

    /**
     * Get 非负整数，表示该次请求资源的起始位置，从0开始计数 
     * @return Offset 非负整数，表示该次请求资源的起始位置，从0开始计数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 非负整数，表示该次请求资源的起始位置，从0开始计数
     * @param Offset 非负整数，表示该次请求资源的起始位置，从0开始计数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 非0非负的整数，该次请求可返回的最大资源条数，默认值为10，最大支持10条 
     * @return Limit 非0非负的整数，该次请求可返回的最大资源条数，默认值为10，最大支持10条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 非0非负的整数，该次请求可返回的最大资源条数，默认值为10，最大支持10条
     * @param Limit 非0非负的整数，该次请求可返回的最大资源条数，默认值为10，最大支持10条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是服务商在微信申请公众号/小程序或移动应用成功后分配的账号ID（与服务商主体一致）
当输入服务商Appid时，会校验其与服务商商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID 
     * @return WechatAppId 是服务商在微信申请公众号/小程序或移动应用成功后分配的账号ID（与服务商主体一致）
当输入服务商Appid时，会校验其与服务商商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID
     */
    public String getWechatAppId() {
        return this.WechatAppId;
    }

    /**
     * Set 是服务商在微信申请公众号/小程序或移动应用成功后分配的账号ID（与服务商主体一致）
当输入服务商Appid时，会校验其与服务商商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID
     * @param WechatAppId 是服务商在微信申请公众号/小程序或移动应用成功后分配的账号ID（与服务商主体一致）
当输入服务商Appid时，会校验其与服务商商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID
     */
    public void setWechatAppId(String WechatAppId) {
        this.WechatAppId = WechatAppId;
    }

    /**
     * Get 特约商户在微信申请公众号/小程序或移动应用成功后分配的账号ID（与特约商户主体一致）
当输入特约商户Appid时，会校验其与特约商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID 
     * @return WechatSubAppId 特约商户在微信申请公众号/小程序或移动应用成功后分配的账号ID（与特约商户主体一致）
当输入特约商户Appid时，会校验其与特约商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID
     */
    public String getWechatSubAppId() {
        return this.WechatSubAppId;
    }

    /**
     * Set 特约商户在微信申请公众号/小程序或移动应用成功后分配的账号ID（与特约商户主体一致）
当输入特约商户Appid时，会校验其与特约商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID
     * @param WechatSubAppId 特约商户在微信申请公众号/小程序或移动应用成功后分配的账号ID（与特约商户主体一致）
当输入特约商户Appid时，会校验其与特约商户号的绑定关系。服务商APPID和与特约商户APPID至少输入一个，且必须要有拉起领薪卡小程序时使用的APPID
     */
    public void setWechatSubAppId(String WechatSubAppId) {
        this.WechatSubAppId = WechatSubAppId;
    }

    /**
     * Get 核身状态，列表查询仅提供成功状态的核身记录查询，故此字段固定AUTHENTICATE_SUCCESS即可 
     * @return AuthStatus 核身状态，列表查询仅提供成功状态的核身记录查询，故此字段固定AUTHENTICATE_SUCCESS即可
     */
    public String getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set 核身状态，列表查询仅提供成功状态的核身记录查询，故此字段固定AUTHENTICATE_SUCCESS即可
     * @param AuthStatus 核身状态，列表查询仅提供成功状态的核身记录查询，故此字段固定AUTHENTICATE_SUCCESS即可
     */
    public void setAuthStatus(String AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    public GetPayRollAuthListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPayRollAuthListRequest(GetPayRollAuthListRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.SubMerchantId != null) {
            this.SubMerchantId = new String(source.SubMerchantId);
        }
        if (source.AuthDate != null) {
            this.AuthDate = new String(source.AuthDate);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.WechatAppId != null) {
            this.WechatAppId = new String(source.WechatAppId);
        }
        if (source.WechatSubAppId != null) {
            this.WechatSubAppId = new String(source.WechatSubAppId);
        }
        if (source.AuthStatus != null) {
            this.AuthStatus = new String(source.AuthStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "SubMerchantId", this.SubMerchantId);
        this.setParamSimple(map, prefix + "AuthDate", this.AuthDate);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "WechatAppId", this.WechatAppId);
        this.setParamSimple(map, prefix + "WechatSubAppId", this.WechatSubAppId);
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);

    }
}

