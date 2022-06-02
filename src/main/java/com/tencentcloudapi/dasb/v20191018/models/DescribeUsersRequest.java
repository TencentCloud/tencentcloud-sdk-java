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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUsersRequest extends AbstractModel{

    /**
    * 如果IdSet不为空，则忽略其他参数
    */
    @SerializedName("IdSet")
    @Expose
    private Long [] IdSet;

    /**
    * 模糊查询，IdSet、UserName、Phone为空时才生效，对用户名和姓名进行模糊查询
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分页，偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数量，默认20, 最大500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 精确查询，IdSet为空时才生效
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 精确查询，IdSet、UserName为空时才生效。
大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 查询具有指定资产ID访问权限的用户
    */
    @SerializedName("AuthorizedDeviceIdSet")
    @Expose
    private Long [] AuthorizedDeviceIdSet;

    /**
    * 认证方式，0 - 本地, 1 - LDAP, 2 - OAuth, 不传为全部
    */
    @SerializedName("AuthTypeSet")
    @Expose
    private Long [] AuthTypeSet;

    /**
     * Get 如果IdSet不为空，则忽略其他参数 
     * @return IdSet 如果IdSet不为空，则忽略其他参数
     */
    public Long [] getIdSet() {
        return this.IdSet;
    }

    /**
     * Set 如果IdSet不为空，则忽略其他参数
     * @param IdSet 如果IdSet不为空，则忽略其他参数
     */
    public void setIdSet(Long [] IdSet) {
        this.IdSet = IdSet;
    }

    /**
     * Get 模糊查询，IdSet、UserName、Phone为空时才生效，对用户名和姓名进行模糊查询 
     * @return Name 模糊查询，IdSet、UserName、Phone为空时才生效，对用户名和姓名进行模糊查询
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模糊查询，IdSet、UserName、Phone为空时才生效，对用户名和姓名进行模糊查询
     * @param Name 模糊查询，IdSet、UserName、Phone为空时才生效，对用户名和姓名进行模糊查询
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分页，偏移位置 
     * @return Offset 分页，偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页，偏移位置
     * @param Offset 分页，偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目数量，默认20, 最大500 
     * @return Limit 每页条目数量，默认20, 最大500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数量，默认20, 最大500
     * @param Limit 每页条目数量，默认20, 最大500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 精确查询，IdSet为空时才生效 
     * @return UserName 精确查询，IdSet为空时才生效
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 精确查询，IdSet为空时才生效
     * @param UserName 精确查询，IdSet为空时才生效
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 精确查询，IdSet、UserName为空时才生效。
大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx" 
     * @return Phone 精确查询，IdSet、UserName为空时才生效。
大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 精确查询，IdSet、UserName为空时才生效。
大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
     * @param Phone 精确查询，IdSet、UserName为空时才生效。
大陆手机号直接填写，如果是其他国家、地区号码,按照"国家地区代码|手机号"的格式输入。如: "+852|xxxxxxxx"
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 查询具有指定资产ID访问权限的用户 
     * @return AuthorizedDeviceIdSet 查询具有指定资产ID访问权限的用户
     */
    public Long [] getAuthorizedDeviceIdSet() {
        return this.AuthorizedDeviceIdSet;
    }

    /**
     * Set 查询具有指定资产ID访问权限的用户
     * @param AuthorizedDeviceIdSet 查询具有指定资产ID访问权限的用户
     */
    public void setAuthorizedDeviceIdSet(Long [] AuthorizedDeviceIdSet) {
        this.AuthorizedDeviceIdSet = AuthorizedDeviceIdSet;
    }

    /**
     * Get 认证方式，0 - 本地, 1 - LDAP, 2 - OAuth, 不传为全部 
     * @return AuthTypeSet 认证方式，0 - 本地, 1 - LDAP, 2 - OAuth, 不传为全部
     */
    public Long [] getAuthTypeSet() {
        return this.AuthTypeSet;
    }

    /**
     * Set 认证方式，0 - 本地, 1 - LDAP, 2 - OAuth, 不传为全部
     * @param AuthTypeSet 认证方式，0 - 本地, 1 - LDAP, 2 - OAuth, 不传为全部
     */
    public void setAuthTypeSet(Long [] AuthTypeSet) {
        this.AuthTypeSet = AuthTypeSet;
    }

    public DescribeUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsersRequest(DescribeUsersRequest source) {
        if (source.IdSet != null) {
            this.IdSet = new Long[source.IdSet.length];
            for (int i = 0; i < source.IdSet.length; i++) {
                this.IdSet[i] = new Long(source.IdSet[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.AuthorizedDeviceIdSet != null) {
            this.AuthorizedDeviceIdSet = new Long[source.AuthorizedDeviceIdSet.length];
            for (int i = 0; i < source.AuthorizedDeviceIdSet.length; i++) {
                this.AuthorizedDeviceIdSet[i] = new Long(source.AuthorizedDeviceIdSet[i]);
            }
        }
        if (source.AuthTypeSet != null) {
            this.AuthTypeSet = new Long[source.AuthTypeSet.length];
            for (int i = 0; i < source.AuthTypeSet.length; i++) {
                this.AuthTypeSet[i] = new Long(source.AuthTypeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IdSet.", this.IdSet);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamArraySimple(map, prefix + "AuthorizedDeviceIdSet.", this.AuthorizedDeviceIdSet);
        this.setParamArraySimple(map, prefix + "AuthTypeSet.", this.AuthTypeSet);

    }
}

