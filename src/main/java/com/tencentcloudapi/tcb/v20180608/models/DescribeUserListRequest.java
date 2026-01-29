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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserListRequest extends AbstractModel {

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 页码，从1开始，默认1
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 每页数量，默认20，最大100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 用户名，模糊查询
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户昵称，模糊查询
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 手机号，模糊查询
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 邮箱，模糊查询
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 页码，从1开始，默认1 
     * @return PageNo 页码，从1开始，默认1
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码，从1开始，默认1
     * @param PageNo 页码，从1开始，默认1
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 每页数量，默认20，最大100 
     * @return PageSize 每页数量，默认20，最大100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量，默认20，最大100
     * @param PageSize 每页数量，默认20，最大100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 用户名，模糊查询 
     * @return Name 用户名，模糊查询
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户名，模糊查询
     * @param Name 用户名，模糊查询
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户昵称，模糊查询 
     * @return NickName 用户昵称，模糊查询
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 用户昵称，模糊查询
     * @param NickName 用户昵称，模糊查询
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 手机号，模糊查询 
     * @return Phone 手机号，模糊查询
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号，模糊查询
     * @param Phone 手机号，模糊查询
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 邮箱，模糊查询 
     * @return Email 邮箱，模糊查询
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱，模糊查询
     * @param Email 邮箱，模糊查询
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public DescribeUserListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserListRequest(DescribeUserListRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

