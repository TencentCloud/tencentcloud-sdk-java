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
package com.tencentcloudapi.tds.v20220801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataAuthorizationInfo extends AbstractModel {

    /**
    * 数据委托方、需求方：客户主体名称。
    */
    @SerializedName("DataProviderName")
    @Expose
    private String DataProviderName;

    /**
    * 数据受托方、提供方：腾讯云主体名称。

固定填：腾讯云计算（北京）有限责任公司
    */
    @SerializedName("DataRecipientName")
    @Expose
    private String DataRecipientName;

    /**
    * 客户请求所涉及的用户个人信息类型，支持多选。实际以接口请求传参为准。
1-手机号；
2-微信开放账号；
3-QQ开放账号；
4-IP地址；
    */
    @SerializedName("UserDataType")
    @Expose
    private Long [] UserDataType;

    /**
    * 客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息，结合已合法收集的用户数据进行必要处理得出服务结果，并返回给客户。

1-已授权；其它值为未授权。
    */
    @SerializedName("IsAuthorize")
    @Expose
    private Long IsAuthorize;

    /**
    * 客户获得的用户授权期限时间戳（单位秒）。

不填或0默认无固定期限。
    */
    @SerializedName("AuthorizationTerm")
    @Expose
    private Long AuthorizationTerm;

    /**
    * 客户获得用户授权所依赖的协议地址。
    */
    @SerializedName("PrivacyPolicyLink")
    @Expose
    private String PrivacyPolicyLink;

    /**
     * Get 数据委托方、需求方：客户主体名称。 
     * @return DataProviderName 数据委托方、需求方：客户主体名称。
     */
    public String getDataProviderName() {
        return this.DataProviderName;
    }

    /**
     * Set 数据委托方、需求方：客户主体名称。
     * @param DataProviderName 数据委托方、需求方：客户主体名称。
     */
    public void setDataProviderName(String DataProviderName) {
        this.DataProviderName = DataProviderName;
    }

    /**
     * Get 数据受托方、提供方：腾讯云主体名称。

固定填：腾讯云计算（北京）有限责任公司 
     * @return DataRecipientName 数据受托方、提供方：腾讯云主体名称。

固定填：腾讯云计算（北京）有限责任公司
     */
    public String getDataRecipientName() {
        return this.DataRecipientName;
    }

    /**
     * Set 数据受托方、提供方：腾讯云主体名称。

固定填：腾讯云计算（北京）有限责任公司
     * @param DataRecipientName 数据受托方、提供方：腾讯云主体名称。

固定填：腾讯云计算（北京）有限责任公司
     */
    public void setDataRecipientName(String DataRecipientName) {
        this.DataRecipientName = DataRecipientName;
    }

    /**
     * Get 客户请求所涉及的用户个人信息类型，支持多选。实际以接口请求传参为准。
1-手机号；
2-微信开放账号；
3-QQ开放账号；
4-IP地址； 
     * @return UserDataType 客户请求所涉及的用户个人信息类型，支持多选。实际以接口请求传参为准。
1-手机号；
2-微信开放账号；
3-QQ开放账号；
4-IP地址；
     */
    public Long [] getUserDataType() {
        return this.UserDataType;
    }

    /**
     * Set 客户请求所涉及的用户个人信息类型，支持多选。实际以接口请求传参为准。
1-手机号；
2-微信开放账号；
3-QQ开放账号；
4-IP地址；
     * @param UserDataType 客户请求所涉及的用户个人信息类型，支持多选。实际以接口请求传参为准。
1-手机号；
2-微信开放账号；
3-QQ开放账号；
4-IP地址；
     */
    public void setUserDataType(Long [] UserDataType) {
        this.UserDataType = UserDataType;
    }

    /**
     * Get 客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息，结合已合法收集的用户数据进行必要处理得出服务结果，并返回给客户。

1-已授权；其它值为未授权。 
     * @return IsAuthorize 客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息，结合已合法收集的用户数据进行必要处理得出服务结果，并返回给客户。

1-已授权；其它值为未授权。
     */
    public Long getIsAuthorize() {
        return this.IsAuthorize;
    }

    /**
     * Set 客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息，结合已合法收集的用户数据进行必要处理得出服务结果，并返回给客户。

1-已授权；其它值为未授权。
     * @param IsAuthorize 客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息，结合已合法收集的用户数据进行必要处理得出服务结果，并返回给客户。

1-已授权；其它值为未授权。
     */
    public void setIsAuthorize(Long IsAuthorize) {
        this.IsAuthorize = IsAuthorize;
    }

    /**
     * Get 客户获得的用户授权期限时间戳（单位秒）。

不填或0默认无固定期限。 
     * @return AuthorizationTerm 客户获得的用户授权期限时间戳（单位秒）。

不填或0默认无固定期限。
     */
    public Long getAuthorizationTerm() {
        return this.AuthorizationTerm;
    }

    /**
     * Set 客户获得的用户授权期限时间戳（单位秒）。

不填或0默认无固定期限。
     * @param AuthorizationTerm 客户获得的用户授权期限时间戳（单位秒）。

不填或0默认无固定期限。
     */
    public void setAuthorizationTerm(Long AuthorizationTerm) {
        this.AuthorizationTerm = AuthorizationTerm;
    }

    /**
     * Get 客户获得用户授权所依赖的协议地址。 
     * @return PrivacyPolicyLink 客户获得用户授权所依赖的协议地址。
     */
    public String getPrivacyPolicyLink() {
        return this.PrivacyPolicyLink;
    }

    /**
     * Set 客户获得用户授权所依赖的协议地址。
     * @param PrivacyPolicyLink 客户获得用户授权所依赖的协议地址。
     */
    public void setPrivacyPolicyLink(String PrivacyPolicyLink) {
        this.PrivacyPolicyLink = PrivacyPolicyLink;
    }

    public DataAuthorizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataAuthorizationInfo(DataAuthorizationInfo source) {
        if (source.DataProviderName != null) {
            this.DataProviderName = new String(source.DataProviderName);
        }
        if (source.DataRecipientName != null) {
            this.DataRecipientName = new String(source.DataRecipientName);
        }
        if (source.UserDataType != null) {
            this.UserDataType = new Long[source.UserDataType.length];
            for (int i = 0; i < source.UserDataType.length; i++) {
                this.UserDataType[i] = new Long(source.UserDataType[i]);
            }
        }
        if (source.IsAuthorize != null) {
            this.IsAuthorize = new Long(source.IsAuthorize);
        }
        if (source.AuthorizationTerm != null) {
            this.AuthorizationTerm = new Long(source.AuthorizationTerm);
        }
        if (source.PrivacyPolicyLink != null) {
            this.PrivacyPolicyLink = new String(source.PrivacyPolicyLink);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataProviderName", this.DataProviderName);
        this.setParamSimple(map, prefix + "DataRecipientName", this.DataRecipientName);
        this.setParamArraySimple(map, prefix + "UserDataType.", this.UserDataType);
        this.setParamSimple(map, prefix + "IsAuthorize", this.IsAuthorize);
        this.setParamSimple(map, prefix + "AuthorizationTerm", this.AuthorizationTerm);
        this.setParamSimple(map, prefix + "PrivacyPolicyLink", this.PrivacyPolicyLink);

    }
}

