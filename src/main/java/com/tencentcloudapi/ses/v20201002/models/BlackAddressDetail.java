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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlackAddressDetail extends AbstractModel {

    /**
    * 黑名单地址id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 邮箱地址
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * 黑名单状态，0:已过期，1:生效中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 黑名单地址id 
     * @return Id 黑名单地址id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 黑名单地址id
     * @param Id 黑名单地址id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 邮箱地址 
     * @return Email 邮箱地址
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱地址
     * @param Email 邮箱地址
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过期时间 
     * @return ExpireDate 过期时间
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set 过期时间
     * @param ExpireDate 过期时间
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get 黑名单状态，0:已过期，1:生效中 
     * @return Status 黑名单状态，0:已过期，1:生效中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 黑名单状态，0:已过期，1:生效中
     * @param Status 黑名单状态，0:已过期，1:生效中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public BlackAddressDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlackAddressDetail(BlackAddressDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

