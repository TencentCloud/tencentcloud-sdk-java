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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtherAccountInfo extends AbstractModel {

    /**
    * 其他账号信息；
AccountType是10004时，填入中国大陆标准11位手机号的MD5值
注释：
MD5手机号加密方式，使用中国大陆11位手机号进行MD5加密，加密后取32位小写值。
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * 账号绑定的MD5手机号。
注释：只支持标准中国大陆11位手机号MD5加密后位的32位小写字符串。
    */
    @SerializedName("MobilePhone")
    @Expose
    private String MobilePhone;

    /**
    * 用户设备号（已不推荐使用）。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get 其他账号信息；
AccountType是10004时，填入中国大陆标准11位手机号的MD5值
注释：
MD5手机号加密方式，使用中国大陆11位手机号进行MD5加密，加密后取32位小写值。 
     * @return AccountId 其他账号信息；
AccountType是10004时，填入中国大陆标准11位手机号的MD5值
注释：
MD5手机号加密方式，使用中国大陆11位手机号进行MD5加密，加密后取32位小写值。
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 其他账号信息；
AccountType是10004时，填入中国大陆标准11位手机号的MD5值
注释：
MD5手机号加密方式，使用中国大陆11位手机号进行MD5加密，加密后取32位小写值。
     * @param AccountId 其他账号信息；
AccountType是10004时，填入中国大陆标准11位手机号的MD5值
注释：
MD5手机号加密方式，使用中国大陆11位手机号进行MD5加密，加密后取32位小写值。
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 账号绑定的MD5手机号。
注释：只支持标准中国大陆11位手机号MD5加密后位的32位小写字符串。 
     * @return MobilePhone 账号绑定的MD5手机号。
注释：只支持标准中国大陆11位手机号MD5加密后位的32位小写字符串。
     */
    public String getMobilePhone() {
        return this.MobilePhone;
    }

    /**
     * Set 账号绑定的MD5手机号。
注释：只支持标准中国大陆11位手机号MD5加密后位的32位小写字符串。
     * @param MobilePhone 账号绑定的MD5手机号。
注释：只支持标准中国大陆11位手机号MD5加密后位的32位小写字符串。
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * Get 用户设备号（已不推荐使用）。 
     * @return DeviceId 用户设备号（已不推荐使用）。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 用户设备号（已不推荐使用）。
     * @param DeviceId 用户设备号（已不推荐使用）。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public OtherAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtherAccountInfo(OtherAccountInfo source) {
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.MobilePhone != null) {
            this.MobilePhone = new String(source.MobilePhone);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "MobilePhone", this.MobilePhone);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

