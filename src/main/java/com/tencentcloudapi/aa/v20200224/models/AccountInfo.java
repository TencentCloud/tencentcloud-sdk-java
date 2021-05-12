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
package com.tencentcloudapi.aa.v20200224.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel{

    /**
    * 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
1：QQ开放账号。
2：微信开放账号。
4：手机号（暂仅支持国内手机号）。
8：设备号（imei/imeiMD5/idfa/idfaMd5）。
0：其他。
10004：手机号MD5（标准中国大陆手机号11位，MD5后取32位小写值）
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * QQ账号信息，AccountType是1时，该字段必填。
    */
    @SerializedName("QQAccount")
    @Expose
    private QQAccountInfo QQAccount;

    /**
    * 微信账号信息，AccountType是2时，该字段必填。
    */
    @SerializedName("WeChatAccount")
    @Expose
    private WeChatAccountInfo WeChatAccount;

    /**
    * 其它账号信息，AccountType是0、4、8或10004时，该字段必填。
    */
    @SerializedName("OtherAccount")
    @Expose
    private OtherAccountInfo OtherAccount;

    /**
     * Get 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
1：QQ开放账号。
2：微信开放账号。
4：手机号（暂仅支持国内手机号）。
8：设备号（imei/imeiMD5/idfa/idfaMd5）。
0：其他。
10004：手机号MD5（标准中国大陆手机号11位，MD5后取32位小写值） 
     * @return AccountType 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
1：QQ开放账号。
2：微信开放账号。
4：手机号（暂仅支持国内手机号）。
8：设备号（imei/imeiMD5/idfa/idfaMd5）。
0：其他。
10004：手机号MD5（标准中国大陆手机号11位，MD5后取32位小写值）
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
1：QQ开放账号。
2：微信开放账号。
4：手机号（暂仅支持国内手机号）。
8：设备号（imei/imeiMD5/idfa/idfaMd5）。
0：其他。
10004：手机号MD5（标准中国大陆手机号11位，MD5后取32位小写值）
     * @param AccountType 用户账号类型（默认开通 QQ 开放账号、手机号，手机 MD5 账号类型查询。如需使用微信开放账号，则需要 提交工单 由腾讯云进行资格审核，审核通过后方可正常使用微信开放账号）：
1：QQ开放账号。
2：微信开放账号。
4：手机号（暂仅支持国内手机号）。
8：设备号（imei/imeiMD5/idfa/idfaMd5）。
0：其他。
10004：手机号MD5（标准中国大陆手机号11位，MD5后取32位小写值）
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get QQ账号信息，AccountType是1时，该字段必填。 
     * @return QQAccount QQ账号信息，AccountType是1时，该字段必填。
     */
    public QQAccountInfo getQQAccount() {
        return this.QQAccount;
    }

    /**
     * Set QQ账号信息，AccountType是1时，该字段必填。
     * @param QQAccount QQ账号信息，AccountType是1时，该字段必填。
     */
    public void setQQAccount(QQAccountInfo QQAccount) {
        this.QQAccount = QQAccount;
    }

    /**
     * Get 微信账号信息，AccountType是2时，该字段必填。 
     * @return WeChatAccount 微信账号信息，AccountType是2时，该字段必填。
     */
    public WeChatAccountInfo getWeChatAccount() {
        return this.WeChatAccount;
    }

    /**
     * Set 微信账号信息，AccountType是2时，该字段必填。
     * @param WeChatAccount 微信账号信息，AccountType是2时，该字段必填。
     */
    public void setWeChatAccount(WeChatAccountInfo WeChatAccount) {
        this.WeChatAccount = WeChatAccount;
    }

    /**
     * Get 其它账号信息，AccountType是0、4、8或10004时，该字段必填。 
     * @return OtherAccount 其它账号信息，AccountType是0、4、8或10004时，该字段必填。
     */
    public OtherAccountInfo getOtherAccount() {
        return this.OtherAccount;
    }

    /**
     * Set 其它账号信息，AccountType是0、4、8或10004时，该字段必填。
     * @param OtherAccount 其它账号信息，AccountType是0、4、8或10004时，该字段必填。
     */
    public void setOtherAccount(OtherAccountInfo OtherAccount) {
        this.OtherAccount = OtherAccount;
    }

    public AccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountInfo(AccountInfo source) {
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.QQAccount != null) {
            this.QQAccount = new QQAccountInfo(source.QQAccount);
        }
        if (source.WeChatAccount != null) {
            this.WeChatAccount = new WeChatAccountInfo(source.WeChatAccount);
        }
        if (source.OtherAccount != null) {
            this.OtherAccount = new OtherAccountInfo(source.OtherAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamObj(map, prefix + "QQAccount.", this.QQAccount);
        this.setParamObj(map, prefix + "WeChatAccount.", this.WeChatAccount);
        this.setParamObj(map, prefix + "OtherAccount.", this.OtherAccount);

    }
}

