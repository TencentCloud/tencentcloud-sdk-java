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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUserResponse extends AbstractModel{

    /**
    * 子用户 UIN
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
    * 如果输入参数组合为自动生成随机密码，则返回生成的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 子用户密钥 ID
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 子用户密钥 Key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 子用户 UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 子用户 UIN 
     * @return Uin 子用户 UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 子用户 UIN
     * @param Uin 子用户 UIN
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
     * Get 如果输入参数组合为自动生成随机密码，则返回生成的密码 
     * @return Password 如果输入参数组合为自动生成随机密码，则返回生成的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 如果输入参数组合为自动生成随机密码，则返回生成的密码
     * @param Password 如果输入参数组合为自动生成随机密码，则返回生成的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 子用户密钥 ID 
     * @return SecretId 子用户密钥 ID
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 子用户密钥 ID
     * @param SecretId 子用户密钥 ID
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 子用户密钥 Key 
     * @return SecretKey 子用户密钥 Key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 子用户密钥 Key
     * @param SecretKey 子用户密钥 Key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
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
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

