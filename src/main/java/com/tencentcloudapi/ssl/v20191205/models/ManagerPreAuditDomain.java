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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagerPreAuditDomain extends AbstractModel {

    /**
    * 预审核域名信息
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 预审核域名创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 预审核域名过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 预审核域名信息 
     * @return Domain 预审核域名信息
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 预审核域名信息
     * @param Domain 预审核域名信息
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 预审核域名创建时间 
     * @return CreateTime 预审核域名创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 预审核域名创建时间
     * @param CreateTime 预审核域名创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 预审核域名过期时间 
     * @return ExpireTime 预审核域名过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 预审核域名过期时间
     * @param ExpireTime 预审核域名过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public ManagerPreAuditDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagerPreAuditDomain(ManagerPreAuditDomain source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

