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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataAuthorization extends AbstractModel {

    /**
    * <p>数据委托方，客户主体名称</p>
    */
    @SerializedName("DataProviderName")
    @Expose
    private String DataProviderName;

    /**
    * <p>数据受托方，腾讯云主体名称，固定填：腾讯云计算（北京）有限责任公司</p>
    */
    @SerializedName("DataRecipientName")
    @Expose
    private String DataRecipientName;

    /**
    * <p>客户请求RCE所提供的用户数据类型，支持多选</p><p>枚举值：</p><ul><li>1： 手机号</li><li>2： 微信开放账号</li><li>3： QQ开放账号</li><li>4： IP地址</li><li>5： URL网址</li><li>999： 其他</li></ul>
    */
    @SerializedName("UserDataType")
    @Expose
    private Long [] UserDataType;

    /**
    * <p>客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul>
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Boolean IsAuthorized;

    /**
    * <p>客户是否已按合规指南要求获取用户授权，同意腾讯云结合客户提供的信息，对已合法收集的用户数据进行必要处理得出服务结果，并返回给客户</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul>
    */
    @SerializedName("IsOrderHanding")
    @Expose
    private Boolean IsOrderHanding;

    /**
    * <p>客户获得的用户授权期限Unix时间戳（单位秒），不填默认无固定期限</p>
    */
    @SerializedName("AuthorizationDeadline")
    @Expose
    private Long AuthorizationDeadline;

    /**
    * <p>客户获得用户授权所依赖的协议地址</p>
    */
    @SerializedName("PrivacyPolicyLink")
    @Expose
    private String PrivacyPolicyLink;

    /**
     * Get <p>数据委托方，客户主体名称</p> 
     * @return DataProviderName <p>数据委托方，客户主体名称</p>
     */
    public String getDataProviderName() {
        return this.DataProviderName;
    }

    /**
     * Set <p>数据委托方，客户主体名称</p>
     * @param DataProviderName <p>数据委托方，客户主体名称</p>
     */
    public void setDataProviderName(String DataProviderName) {
        this.DataProviderName = DataProviderName;
    }

    /**
     * Get <p>数据受托方，腾讯云主体名称，固定填：腾讯云计算（北京）有限责任公司</p> 
     * @return DataRecipientName <p>数据受托方，腾讯云主体名称，固定填：腾讯云计算（北京）有限责任公司</p>
     */
    public String getDataRecipientName() {
        return this.DataRecipientName;
    }

    /**
     * Set <p>数据受托方，腾讯云主体名称，固定填：腾讯云计算（北京）有限责任公司</p>
     * @param DataRecipientName <p>数据受托方，腾讯云主体名称，固定填：腾讯云计算（北京）有限责任公司</p>
     */
    public void setDataRecipientName(String DataRecipientName) {
        this.DataRecipientName = DataRecipientName;
    }

    /**
     * Get <p>客户请求RCE所提供的用户数据类型，支持多选</p><p>枚举值：</p><ul><li>1： 手机号</li><li>2： 微信开放账号</li><li>3： QQ开放账号</li><li>4： IP地址</li><li>5： URL网址</li><li>999： 其他</li></ul> 
     * @return UserDataType <p>客户请求RCE所提供的用户数据类型，支持多选</p><p>枚举值：</p><ul><li>1： 手机号</li><li>2： 微信开放账号</li><li>3： QQ开放账号</li><li>4： IP地址</li><li>5： URL网址</li><li>999： 其他</li></ul>
     */
    public Long [] getUserDataType() {
        return this.UserDataType;
    }

    /**
     * Set <p>客户请求RCE所提供的用户数据类型，支持多选</p><p>枚举值：</p><ul><li>1： 手机号</li><li>2： 微信开放账号</li><li>3： QQ开放账号</li><li>4： IP地址</li><li>5： URL网址</li><li>999： 其他</li></ul>
     * @param UserDataType <p>客户请求RCE所提供的用户数据类型，支持多选</p><p>枚举值：</p><ul><li>1： 手机号</li><li>2： 微信开放账号</li><li>3： QQ开放账号</li><li>4： IP地址</li><li>5： URL网址</li><li>999： 其他</li></ul>
     */
    public void setUserDataType(Long [] UserDataType) {
        this.UserDataType = UserDataType;
    }

    /**
     * Get <p>客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul> 
     * @return IsAuthorized <p>客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul>
     */
    public Boolean getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set <p>客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul>
     * @param IsAuthorized <p>客户是否已按合规指南要求获取用户授权，同意客户委托腾讯云处理入参信息</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul>
     */
    public void setIsAuthorized(Boolean IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get <p>客户是否已按合规指南要求获取用户授权，同意腾讯云结合客户提供的信息，对已合法收集的用户数据进行必要处理得出服务结果，并返回给客户</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul> 
     * @return IsOrderHanding <p>客户是否已按合规指南要求获取用户授权，同意腾讯云结合客户提供的信息，对已合法收集的用户数据进行必要处理得出服务结果，并返回给客户</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul>
     */
    public Boolean getIsOrderHanding() {
        return this.IsOrderHanding;
    }

    /**
     * Set <p>客户是否已按合规指南要求获取用户授权，同意腾讯云结合客户提供的信息，对已合法收集的用户数据进行必要处理得出服务结果，并返回给客户</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul>
     * @param IsOrderHanding <p>客户是否已按合规指南要求获取用户授权，同意腾讯云结合客户提供的信息，对已合法收集的用户数据进行必要处理得出服务结果，并返回给客户</p><p>枚举值：</p><ul><li>true： 已授权</li><li>false： 未授权</li></ul>
     */
    public void setIsOrderHanding(Boolean IsOrderHanding) {
        this.IsOrderHanding = IsOrderHanding;
    }

    /**
     * Get <p>客户获得的用户授权期限Unix时间戳（单位秒），不填默认无固定期限</p> 
     * @return AuthorizationDeadline <p>客户获得的用户授权期限Unix时间戳（单位秒），不填默认无固定期限</p>
     */
    public Long getAuthorizationDeadline() {
        return this.AuthorizationDeadline;
    }

    /**
     * Set <p>客户获得的用户授权期限Unix时间戳（单位秒），不填默认无固定期限</p>
     * @param AuthorizationDeadline <p>客户获得的用户授权期限Unix时间戳（单位秒），不填默认无固定期限</p>
     */
    public void setAuthorizationDeadline(Long AuthorizationDeadline) {
        this.AuthorizationDeadline = AuthorizationDeadline;
    }

    /**
     * Get <p>客户获得用户授权所依赖的协议地址</p> 
     * @return PrivacyPolicyLink <p>客户获得用户授权所依赖的协议地址</p>
     */
    public String getPrivacyPolicyLink() {
        return this.PrivacyPolicyLink;
    }

    /**
     * Set <p>客户获得用户授权所依赖的协议地址</p>
     * @param PrivacyPolicyLink <p>客户获得用户授权所依赖的协议地址</p>
     */
    public void setPrivacyPolicyLink(String PrivacyPolicyLink) {
        this.PrivacyPolicyLink = PrivacyPolicyLink;
    }

    public DataAuthorization() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataAuthorization(DataAuthorization source) {
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
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Boolean(source.IsAuthorized);
        }
        if (source.IsOrderHanding != null) {
            this.IsOrderHanding = new Boolean(source.IsOrderHanding);
        }
        if (source.AuthorizationDeadline != null) {
            this.AuthorizationDeadline = new Long(source.AuthorizationDeadline);
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
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "IsOrderHanding", this.IsOrderHanding);
        this.setParamSimple(map, prefix + "AuthorizationDeadline", this.AuthorizationDeadline);
        this.setParamSimple(map, prefix + "PrivacyPolicyLink", this.PrivacyPolicyLink);

    }
}

