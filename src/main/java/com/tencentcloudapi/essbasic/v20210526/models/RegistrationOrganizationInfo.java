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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistrationOrganizationInfo extends AbstractModel {

    /**
    * 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 机构在贵司业务系统中的唯一标识，用于与腾讯电子签企业账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 组织机构超管姓名。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
    * 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书+对公打款
2：法人授权/认证  会根据当前操作人的身份判定,如果当前操作人是法人,则是法人认证, 如果当前操作人不是法人,则走法人授权

注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款`
    */
    @SerializedName("AuthorizationTypes")
    @Expose
    private Long [] AuthorizationTypes;

    /**
     * Get 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。 
     * @return OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
     * @param OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 机构在贵司业务系统中的唯一标识，用于与腾讯电子签企业账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。 
     * @return OrganizationOpenId 机构在贵司业务系统中的唯一标识，用于与腾讯电子签企业账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 机构在贵司业务系统中的唯一标识，用于与腾讯电子签企业账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
     * @param OrganizationOpenId 机构在贵司业务系统中的唯一标识，用于与腾讯电子签企业账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。 
     * @return OpenId 员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
     * @param OpenId 员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一应用内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。 
     * @return UniformSocialCreditCode 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
     * @param UniformSocialCreditCode 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。 
     * @return LegalName 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
     * @param LegalName 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。 
     * @return Address 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。
     * @param Address 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名 
     * @return AdminName 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名
     * @param AdminName 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 组织机构超管姓名。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。 
     * @return AdminMobile 组织机构超管姓名。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set 组织机构超管姓名。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。
     * @param AdminMobile 组织机构超管姓名。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    /**
     * Get 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书+对公打款
2：法人授权/认证  会根据当前操作人的身份判定,如果当前操作人是法人,则是法人认证, 如果当前操作人不是法人,则走法人授权

注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款` 
     * @return AuthorizationTypes 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书+对公打款
2：法人授权/认证  会根据当前操作人的身份判定,如果当前操作人是法人,则是法人认证, 如果当前操作人不是法人,则走法人授权

注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款`
     */
    public Long [] getAuthorizationTypes() {
        return this.AuthorizationTypes;
    }

    /**
     * Set 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书+对公打款
2：法人授权/认证  会根据当前操作人的身份判定,如果当前操作人是法人,则是法人认证, 如果当前操作人不是法人,则走法人授权

注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款`
     * @param AuthorizationTypes 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书+对公打款
2：法人授权/认证  会根据当前操作人的身份判定,如果当前操作人是法人,则是法人认证, 如果当前操作人不是法人,则走法人授权

注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款`
     */
    public void setAuthorizationTypes(Long [] AuthorizationTypes) {
        this.AuthorizationTypes = AuthorizationTypes;
    }

    public RegistrationOrganizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistrationOrganizationInfo(RegistrationOrganizationInfo source) {
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminMobile != null) {
            this.AdminMobile = new String(source.AdminMobile);
        }
        if (source.AuthorizationTypes != null) {
            this.AuthorizationTypes = new Long[source.AuthorizationTypes.length];
            for (int i = 0; i < source.AuthorizationTypes.length; i++) {
                this.AuthorizationTypes[i] = new Long(source.AuthorizationTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminMobile", this.AdminMobile);
        this.setParamArraySimple(map, prefix + "AuthorizationTypes.", this.AuthorizationTypes);

    }
}

