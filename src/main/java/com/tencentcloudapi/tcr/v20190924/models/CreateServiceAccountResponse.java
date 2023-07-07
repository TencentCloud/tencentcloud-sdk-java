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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceAccountResponse extends AbstractModel{

    /**
    * 服务级账号名（会自动加上前缀tcr$）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务级账号密码，仅展示一次，请注意留存
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 服务级账号失效时间（时间戳）
    */
    @SerializedName("ExpiresAt")
    @Expose
    private Long ExpiresAt;

    /**
    * 服务级账号创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务级账号名（会自动加上前缀tcr$） 
     * @return Name 服务级账号名（会自动加上前缀tcr$）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务级账号名（会自动加上前缀tcr$）
     * @param Name 服务级账号名（会自动加上前缀tcr$）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务级账号密码，仅展示一次，请注意留存 
     * @return Password 服务级账号密码，仅展示一次，请注意留存
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 服务级账号密码，仅展示一次，请注意留存
     * @param Password 服务级账号密码，仅展示一次，请注意留存
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 服务级账号失效时间（时间戳） 
     * @return ExpiresAt 服务级账号失效时间（时间戳）
     */
    public Long getExpiresAt() {
        return this.ExpiresAt;
    }

    /**
     * Set 服务级账号失效时间（时间戳）
     * @param ExpiresAt 服务级账号失效时间（时间戳）
     */
    public void setExpiresAt(Long ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }

    /**
     * Get 服务级账号创建时间 
     * @return CreateTime 服务级账号创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 服务级账号创建时间
     * @param CreateTime 服务级账号创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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

    public CreateServiceAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceAccountResponse(CreateServiceAccountResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ExpiresAt != null) {
            this.ExpiresAt = new Long(source.ExpiresAt);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ExpiresAt", this.ExpiresAt);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

