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
    * <p>环境id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>页码，从1开始，默认1</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>每页数量，默认20，最大100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>用户名，模糊查询</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>用户昵称，模糊查询</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>手机号，模糊查询</p>
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * <p>邮箱，模糊查询</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>用户id列表，根据id过滤用户</p>
    */
    @SerializedName("UidList")
    @Expose
    private String [] UidList;

    /**
     * Get <p>环境id</p> 
     * @return EnvId <p>环境id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境id</p>
     * @param EnvId <p>环境id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>页码，从1开始，默认1</p> 
     * @return PageNo <p>页码，从1开始，默认1</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>页码，从1开始，默认1</p>
     * @param PageNo <p>页码，从1开始，默认1</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>每页数量，默认20，最大100</p> 
     * @return PageSize <p>每页数量，默认20，最大100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量，默认20，最大100</p>
     * @param PageSize <p>每页数量，默认20，最大100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>用户名，模糊查询</p> 
     * @return Name <p>用户名，模糊查询</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>用户名，模糊查询</p>
     * @param Name <p>用户名，模糊查询</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>用户昵称，模糊查询</p> 
     * @return NickName <p>用户昵称，模糊查询</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>用户昵称，模糊查询</p>
     * @param NickName <p>用户昵称，模糊查询</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>手机号，模糊查询</p> 
     * @return Phone <p>手机号，模糊查询</p>
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>手机号，模糊查询</p>
     * @param Phone <p>手机号，模糊查询</p>
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>邮箱，模糊查询</p> 
     * @return Email <p>邮箱，模糊查询</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>邮箱，模糊查询</p>
     * @param Email <p>邮箱，模糊查询</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>用户id列表，根据id过滤用户</p> 
     * @return UidList <p>用户id列表，根据id过滤用户</p>
     */
    public String [] getUidList() {
        return this.UidList;
    }

    /**
     * Set <p>用户id列表，根据id过滤用户</p>
     * @param UidList <p>用户id列表，根据id过滤用户</p>
     */
    public void setUidList(String [] UidList) {
        this.UidList = UidList;
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
        if (source.UidList != null) {
            this.UidList = new String[source.UidList.length];
            for (int i = 0; i < source.UidList.length; i++) {
                this.UidList[i] = new String(source.UidList[i]);
            }
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
        this.setParamArraySimple(map, prefix + "UidList.", this.UidList);

    }
}

