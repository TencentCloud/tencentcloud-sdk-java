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

public class CreatePayRollPreOrderWithAuthRequest extends AbstractModel{

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
    * 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
    */
    @SerializedName("AuthNumber")
    @Expose
    private String AuthNumber;

    /**
    * 该劳务活动的项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 该工人所属的用工企业
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 用户实名信息，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml)
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户证件号，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml)
    */
    @SerializedName("IdNo")
    @Expose
    private String IdNo;

    /**
    * 微工卡服务仅支持用于与商户有用工关系的用户，需明确用工类型；参考值：
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系
    */
    @SerializedName("EmploymentType")
    @Expose
    private String EmploymentType;

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
     * Get 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一 
     * @return AuthNumber 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     */
    public String getAuthNumber() {
        return this.AuthNumber;
    }

    /**
     * Set 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     * @param AuthNumber 商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一
     */
    public void setAuthNumber(String AuthNumber) {
        this.AuthNumber = AuthNumber;
    }

    /**
     * Get 该劳务活动的项目名称 
     * @return ProjectName 该劳务活动的项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 该劳务活动的项目名称
     * @param ProjectName 该劳务活动的项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 该工人所属的用工企业 
     * @return CompanyName 该工人所属的用工企业
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 该工人所属的用工企业
     * @param CompanyName 该工人所属的用工企业
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 用户实名信息，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml) 
     * @return UserName 用户实名信息，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml)
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户实名信息，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml)
     * @param UserName 用户实名信息，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml)
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户证件号，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml) 
     * @return IdNo 用户证件号，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml)
     */
    public String getIdNo() {
        return this.IdNo;
    }

    /**
     * Set 用户证件号，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml)
     * @param IdNo 用户证件号，该字段需进行加密处理，加密方法详见[敏感信息加密说明](https://pay.weixin.qq.com/wiki/doc/apiv3_partner/wechatpay/wechatpay4_3.shtml)
     */
    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    /**
     * Get 微工卡服务仅支持用于与商户有用工关系的用户，需明确用工类型；参考值：
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系 
     * @return EmploymentType 微工卡服务仅支持用于与商户有用工关系的用户，需明确用工类型；参考值：
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系
     */
    public String getEmploymentType() {
        return this.EmploymentType;
    }

    /**
     * Set 微工卡服务仅支持用于与商户有用工关系的用户，需明确用工类型；参考值：
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系
     * @param EmploymentType 微工卡服务仅支持用于与商户有用工关系的用户，需明确用工类型；参考值：
LONG_TERM_EMPLOYMENT：长期用工，
SHORT_TERM_EMPLOYMENT： 短期用工，
COOPERATION_EMPLOYMENT：合作关系
     */
    public void setEmploymentType(String EmploymentType) {
        this.EmploymentType = EmploymentType;
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

    public CreatePayRollPreOrderWithAuthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePayRollPreOrderWithAuthRequest(CreatePayRollPreOrderWithAuthRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.SubMerchantId != null) {
            this.SubMerchantId = new String(source.SubMerchantId);
        }
        if (source.AuthNumber != null) {
            this.AuthNumber = new String(source.AuthNumber);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.IdNo != null) {
            this.IdNo = new String(source.IdNo);
        }
        if (source.EmploymentType != null) {
            this.EmploymentType = new String(source.EmploymentType);
        }
        if (source.WechatAppId != null) {
            this.WechatAppId = new String(source.WechatAppId);
        }
        if (source.WechatSubAppId != null) {
            this.WechatSubAppId = new String(source.WechatSubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "SubMerchantId", this.SubMerchantId);
        this.setParamSimple(map, prefix + "AuthNumber", this.AuthNumber);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "IdNo", this.IdNo);
        this.setParamSimple(map, prefix + "EmploymentType", this.EmploymentType);
        this.setParamSimple(map, prefix + "WechatAppId", this.WechatAppId);
        this.setParamSimple(map, prefix + "WechatSubAppId", this.WechatSubAppId);

    }
}

