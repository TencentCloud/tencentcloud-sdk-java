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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUserResponse extends AbstractModel {

    /**
    * 子用户用户 UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 子用户用户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子用户 UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 子用户备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 子用户能否登录控制台 0-无法登录控制台，1-可以登录控制台
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * 手机号
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 区号
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 最近一次登录ip
    */
    @SerializedName("RecentlyLoginIP")
    @Expose
    private String RecentlyLoginIP;

    /**
    * 最近一次登录时间
    */
    @SerializedName("RecentlyLoginTime")
    @Expose
    private String RecentlyLoginTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 子用户用户 UIN 
     * @return Uin 子用户用户 UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 子用户用户 UIN
     * @param Uin 子用户用户 UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子用户用户名 
     * @return Name 子用户用户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子用户用户名
     * @param Name 子用户用户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 子用户 UID 
     * @return Uid 子用户 UID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set 子用户 UID
     * @param Uid 子用户 UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 子用户备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 子用户备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 子用户备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 子用户备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 子用户能否登录控制台 0-无法登录控制台，1-可以登录控制台 
     * @return ConsoleLogin 子用户能否登录控制台 0-无法登录控制台，1-可以登录控制台
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set 子用户能否登录控制台 0-无法登录控制台，1-可以登录控制台
     * @param ConsoleLogin 子用户能否登录控制台 0-无法登录控制台，1-可以登录控制台
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get 手机号 
     * @return PhoneNum 手机号
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 手机号
     * @param PhoneNum 手机号
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 区号 
     * @return CountryCode 区号
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 区号
     * @param CountryCode 区号
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 邮箱 
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 最近一次登录ip 
     * @return RecentlyLoginIP 最近一次登录ip
     */
    public String getRecentlyLoginIP() {
        return this.RecentlyLoginIP;
    }

    /**
     * Set 最近一次登录ip
     * @param RecentlyLoginIP 最近一次登录ip
     */
    public void setRecentlyLoginIP(String RecentlyLoginIP) {
        this.RecentlyLoginIP = RecentlyLoginIP;
    }

    /**
     * Get 最近一次登录时间 
     * @return RecentlyLoginTime 最近一次登录时间
     */
    public String getRecentlyLoginTime() {
        return this.RecentlyLoginTime;
    }

    /**
     * Set 最近一次登录时间
     * @param RecentlyLoginTime 最近一次登录时间
     */
    public void setRecentlyLoginTime(String RecentlyLoginTime) {
        this.RecentlyLoginTime = RecentlyLoginTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUserResponse(GetUserResponse source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.RecentlyLoginIP != null) {
            this.RecentlyLoginIP = new String(source.RecentlyLoginIP);
        }
        if (source.RecentlyLoginTime != null) {
            this.RecentlyLoginTime = new String(source.RecentlyLoginTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "RecentlyLoginIP", this.RecentlyLoginIP);
        this.setParamSimple(map, prefix + "RecentlyLoginTime", this.RecentlyLoginTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

