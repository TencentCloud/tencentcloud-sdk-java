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

public class AddUserResponse extends AbstractModel {

    /**
    * <p>子用户 UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>子用户用户名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>如果输入参数组合为自动生成随机密码，则返回生成的密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>子用户密钥 ID</p>
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>子用户密钥 Key</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>子用户 UID</p>
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * <p>手机号验证地址。</p>
    */
    @SerializedName("PhoneNumVerifyLink")
    @Expose
    private String PhoneNumVerifyLink;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>子用户 UIN</p> 
     * @return Uin <p>子用户 UIN</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>子用户 UIN</p>
     * @param Uin <p>子用户 UIN</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>子用户用户名</p> 
     * @return Name <p>子用户用户名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>子用户用户名</p>
     * @param Name <p>子用户用户名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>如果输入参数组合为自动生成随机密码，则返回生成的密码</p> 
     * @return Password <p>如果输入参数组合为自动生成随机密码，则返回生成的密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>如果输入参数组合为自动生成随机密码，则返回生成的密码</p>
     * @param Password <p>如果输入参数组合为自动生成随机密码，则返回生成的密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>子用户密钥 ID</p> 
     * @return SecretId <p>子用户密钥 ID</p>
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>子用户密钥 ID</p>
     * @param SecretId <p>子用户密钥 ID</p>
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>子用户密钥 Key</p> 
     * @return SecretKey <p>子用户密钥 Key</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>子用户密钥 Key</p>
     * @param SecretKey <p>子用户密钥 Key</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>子用户 UID</p> 
     * @return Uid <p>子用户 UID</p>
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set <p>子用户 UID</p>
     * @param Uid <p>子用户 UID</p>
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>手机号验证地址。</p> 
     * @return PhoneNumVerifyLink <p>手机号验证地址。</p>
     */
    public String getPhoneNumVerifyLink() {
        return this.PhoneNumVerifyLink;
    }

    /**
     * Set <p>手机号验证地址。</p>
     * @param PhoneNumVerifyLink <p>手机号验证地址。</p>
     */
    public void setPhoneNumVerifyLink(String PhoneNumVerifyLink) {
        this.PhoneNumVerifyLink = PhoneNumVerifyLink;
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

    public AddUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUserResponse(AddUserResponse source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.PhoneNumVerifyLink != null) {
            this.PhoneNumVerifyLink = new String(source.PhoneNumVerifyLink);
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
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "PhoneNumVerifyLink", this.PhoneNumVerifyLink);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

