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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountProtectionSettings extends AbstractModel {

    /**
    * <p>账号保护功能开关。</p><p>枚举值：</p><ul><li>on： 开启；</li><li>off： 关闭。</li></ul><p>默认值：off。</p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>请求目的。用于标识请求所属的业务操作场景。</p> <p>枚举值：</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD：在已知原密码的情况下修改密码的请求；</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION：修改账号安全问题的请求；</li> <li>ACCOUNT.CHECK_EXISTENCE：校验账号是否已存在的请求，常见于登录或注册页面输入邮箱、手机号后的预校验；</li> <li>ACCOUNT.LOGIN：登录账号的请求；</li> <li>ACCOUNT.REGISTER：注册新账号的请求；</li> <li>ACCOUNT.RESET_PASSWORD：重置密码的请求，通常通过邮箱或短信验证身份后设置新密码；</li> <li>ACCOUNT.UPDATE：修改账号关联信息的请求，例如手机号、邮箱、支付卡号、收货地址等；</li> <li>ASSET.CHECK_GIFTCARD_BALANCE：通过卡号等信息查询礼品卡余额的请求；</li> <li>ASSET.CHECK_LOYALTY_POINTS：查询账号积分余额的请求；</li> <li>ASSET.REDEEM_CODE：使用兑换码兑换权益的请求；</li> <li>BROWSE.QUERY：站内搜索商品或服务的请求；</li> <li>PAYMENT.ADD_TO_CART：将商品加入购物车的请求；</li> <li>PAYMENT.GET_METHODS：获取账号已绑定支付方式列表的请求；</li> <li>PAYMENT.MAKE_PAYMENT：提交支付、结算或转账的请求。</li> </ul>
    */
    @SerializedName("RequestPurpose")
    @Expose
    private String RequestPurpose;

    /**
    * <p>用户标识在请求来源中的位置，其中 key 替换为实际的参数名称。</p><p>取值有：</p><ul><li>http.request.cookies["key"]：从 Cookie 中获取名称为 key 的 Cookie 值；</li><li>http.request.headers["key"]：从请求头中获取名称为 key 的头部值；</li><li>http.request.uri.args["key"]：从 URL 查询参数中获取名称为 key 的参数值。</li></ul>
    */
    @SerializedName("UserIDSource")
    @Expose
    private String UserIDSource;

    /**
    * <p>用户风险等级配置。</p>
    */
    @SerializedName("UserRiskProfile")
    @Expose
    private UserRiskProfile UserRiskProfile;

    /**
     * Get <p>账号保护功能开关。</p><p>枚举值：</p><ul><li>on： 开启；</li><li>off： 关闭。</li></ul><p>默认值：off。</p> 
     * @return Enabled <p>账号保护功能开关。</p><p>枚举值：</p><ul><li>on： 开启；</li><li>off： 关闭。</li></ul><p>默认值：off。</p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>账号保护功能开关。</p><p>枚举值：</p><ul><li>on： 开启；</li><li>off： 关闭。</li></ul><p>默认值：off。</p>
     * @param Enabled <p>账号保护功能开关。</p><p>枚举值：</p><ul><li>on： 开启；</li><li>off： 关闭。</li></ul><p>默认值：off。</p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>请求目的。用于标识请求所属的业务操作场景。</p> <p>枚举值：</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD：在已知原密码的情况下修改密码的请求；</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION：修改账号安全问题的请求；</li> <li>ACCOUNT.CHECK_EXISTENCE：校验账号是否已存在的请求，常见于登录或注册页面输入邮箱、手机号后的预校验；</li> <li>ACCOUNT.LOGIN：登录账号的请求；</li> <li>ACCOUNT.REGISTER：注册新账号的请求；</li> <li>ACCOUNT.RESET_PASSWORD：重置密码的请求，通常通过邮箱或短信验证身份后设置新密码；</li> <li>ACCOUNT.UPDATE：修改账号关联信息的请求，例如手机号、邮箱、支付卡号、收货地址等；</li> <li>ASSET.CHECK_GIFTCARD_BALANCE：通过卡号等信息查询礼品卡余额的请求；</li> <li>ASSET.CHECK_LOYALTY_POINTS：查询账号积分余额的请求；</li> <li>ASSET.REDEEM_CODE：使用兑换码兑换权益的请求；</li> <li>BROWSE.QUERY：站内搜索商品或服务的请求；</li> <li>PAYMENT.ADD_TO_CART：将商品加入购物车的请求；</li> <li>PAYMENT.GET_METHODS：获取账号已绑定支付方式列表的请求；</li> <li>PAYMENT.MAKE_PAYMENT：提交支付、结算或转账的请求。</li> </ul> 
     * @return RequestPurpose <p>请求目的。用于标识请求所属的业务操作场景。</p> <p>枚举值：</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD：在已知原密码的情况下修改密码的请求；</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION：修改账号安全问题的请求；</li> <li>ACCOUNT.CHECK_EXISTENCE：校验账号是否已存在的请求，常见于登录或注册页面输入邮箱、手机号后的预校验；</li> <li>ACCOUNT.LOGIN：登录账号的请求；</li> <li>ACCOUNT.REGISTER：注册新账号的请求；</li> <li>ACCOUNT.RESET_PASSWORD：重置密码的请求，通常通过邮箱或短信验证身份后设置新密码；</li> <li>ACCOUNT.UPDATE：修改账号关联信息的请求，例如手机号、邮箱、支付卡号、收货地址等；</li> <li>ASSET.CHECK_GIFTCARD_BALANCE：通过卡号等信息查询礼品卡余额的请求；</li> <li>ASSET.CHECK_LOYALTY_POINTS：查询账号积分余额的请求；</li> <li>ASSET.REDEEM_CODE：使用兑换码兑换权益的请求；</li> <li>BROWSE.QUERY：站内搜索商品或服务的请求；</li> <li>PAYMENT.ADD_TO_CART：将商品加入购物车的请求；</li> <li>PAYMENT.GET_METHODS：获取账号已绑定支付方式列表的请求；</li> <li>PAYMENT.MAKE_PAYMENT：提交支付、结算或转账的请求。</li> </ul>
     */
    public String getRequestPurpose() {
        return this.RequestPurpose;
    }

    /**
     * Set <p>请求目的。用于标识请求所属的业务操作场景。</p> <p>枚举值：</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD：在已知原密码的情况下修改密码的请求；</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION：修改账号安全问题的请求；</li> <li>ACCOUNT.CHECK_EXISTENCE：校验账号是否已存在的请求，常见于登录或注册页面输入邮箱、手机号后的预校验；</li> <li>ACCOUNT.LOGIN：登录账号的请求；</li> <li>ACCOUNT.REGISTER：注册新账号的请求；</li> <li>ACCOUNT.RESET_PASSWORD：重置密码的请求，通常通过邮箱或短信验证身份后设置新密码；</li> <li>ACCOUNT.UPDATE：修改账号关联信息的请求，例如手机号、邮箱、支付卡号、收货地址等；</li> <li>ASSET.CHECK_GIFTCARD_BALANCE：通过卡号等信息查询礼品卡余额的请求；</li> <li>ASSET.CHECK_LOYALTY_POINTS：查询账号积分余额的请求；</li> <li>ASSET.REDEEM_CODE：使用兑换码兑换权益的请求；</li> <li>BROWSE.QUERY：站内搜索商品或服务的请求；</li> <li>PAYMENT.ADD_TO_CART：将商品加入购物车的请求；</li> <li>PAYMENT.GET_METHODS：获取账号已绑定支付方式列表的请求；</li> <li>PAYMENT.MAKE_PAYMENT：提交支付、结算或转账的请求。</li> </ul>
     * @param RequestPurpose <p>请求目的。用于标识请求所属的业务操作场景。</p> <p>枚举值：</p> <ul> <li>ACCOUNT.CHANGE_PASSWORD：在已知原密码的情况下修改密码的请求；</li> <li>ACCOUNT.CHANGE_SECURITY_QUESTION：修改账号安全问题的请求；</li> <li>ACCOUNT.CHECK_EXISTENCE：校验账号是否已存在的请求，常见于登录或注册页面输入邮箱、手机号后的预校验；</li> <li>ACCOUNT.LOGIN：登录账号的请求；</li> <li>ACCOUNT.REGISTER：注册新账号的请求；</li> <li>ACCOUNT.RESET_PASSWORD：重置密码的请求，通常通过邮箱或短信验证身份后设置新密码；</li> <li>ACCOUNT.UPDATE：修改账号关联信息的请求，例如手机号、邮箱、支付卡号、收货地址等；</li> <li>ASSET.CHECK_GIFTCARD_BALANCE：通过卡号等信息查询礼品卡余额的请求；</li> <li>ASSET.CHECK_LOYALTY_POINTS：查询账号积分余额的请求；</li> <li>ASSET.REDEEM_CODE：使用兑换码兑换权益的请求；</li> <li>BROWSE.QUERY：站内搜索商品或服务的请求；</li> <li>PAYMENT.ADD_TO_CART：将商品加入购物车的请求；</li> <li>PAYMENT.GET_METHODS：获取账号已绑定支付方式列表的请求；</li> <li>PAYMENT.MAKE_PAYMENT：提交支付、结算或转账的请求。</li> </ul>
     */
    public void setRequestPurpose(String RequestPurpose) {
        this.RequestPurpose = RequestPurpose;
    }

    /**
     * Get <p>用户标识在请求来源中的位置，其中 key 替换为实际的参数名称。</p><p>取值有：</p><ul><li>http.request.cookies["key"]：从 Cookie 中获取名称为 key 的 Cookie 值；</li><li>http.request.headers["key"]：从请求头中获取名称为 key 的头部值；</li><li>http.request.uri.args["key"]：从 URL 查询参数中获取名称为 key 的参数值。</li></ul> 
     * @return UserIDSource <p>用户标识在请求来源中的位置，其中 key 替换为实际的参数名称。</p><p>取值有：</p><ul><li>http.request.cookies["key"]：从 Cookie 中获取名称为 key 的 Cookie 值；</li><li>http.request.headers["key"]：从请求头中获取名称为 key 的头部值；</li><li>http.request.uri.args["key"]：从 URL 查询参数中获取名称为 key 的参数值。</li></ul>
     */
    public String getUserIDSource() {
        return this.UserIDSource;
    }

    /**
     * Set <p>用户标识在请求来源中的位置，其中 key 替换为实际的参数名称。</p><p>取值有：</p><ul><li>http.request.cookies["key"]：从 Cookie 中获取名称为 key 的 Cookie 值；</li><li>http.request.headers["key"]：从请求头中获取名称为 key 的头部值；</li><li>http.request.uri.args["key"]：从 URL 查询参数中获取名称为 key 的参数值。</li></ul>
     * @param UserIDSource <p>用户标识在请求来源中的位置，其中 key 替换为实际的参数名称。</p><p>取值有：</p><ul><li>http.request.cookies["key"]：从 Cookie 中获取名称为 key 的 Cookie 值；</li><li>http.request.headers["key"]：从请求头中获取名称为 key 的头部值；</li><li>http.request.uri.args["key"]：从 URL 查询参数中获取名称为 key 的参数值。</li></ul>
     */
    public void setUserIDSource(String UserIDSource) {
        this.UserIDSource = UserIDSource;
    }

    /**
     * Get <p>用户风险等级配置。</p> 
     * @return UserRiskProfile <p>用户风险等级配置。</p>
     */
    public UserRiskProfile getUserRiskProfile() {
        return this.UserRiskProfile;
    }

    /**
     * Set <p>用户风险等级配置。</p>
     * @param UserRiskProfile <p>用户风险等级配置。</p>
     */
    public void setUserRiskProfile(UserRiskProfile UserRiskProfile) {
        this.UserRiskProfile = UserRiskProfile;
    }

    public AccountProtectionSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountProtectionSettings(AccountProtectionSettings source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.RequestPurpose != null) {
            this.RequestPurpose = new String(source.RequestPurpose);
        }
        if (source.UserIDSource != null) {
            this.UserIDSource = new String(source.UserIDSource);
        }
        if (source.UserRiskProfile != null) {
            this.UserRiskProfile = new UserRiskProfile(source.UserRiskProfile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RequestPurpose", this.RequestPurpose);
        this.setParamSimple(map, prefix + "UserIDSource", this.UserIDSource);
        this.setParamObj(map, prefix + "UserRiskProfile.", this.UserRiskProfile);

    }
}

