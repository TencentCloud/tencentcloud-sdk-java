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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GrantedAccountItem extends AbstractModel {

    /**
    * 账户Id
    */
    @SerializedName("AccountId")
    @Expose
    private Long AccountId;

    /**
    * 用户UserId
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 所属分组Id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 分组路劲GroupIdPathArray
    */
    @SerializedName("GroupIdPathArray")
    @Expose
    private Long [] GroupIdPathArray;

    /**
    * 所属分组NamePathArray
    */
    @SerializedName("GroupNamePathArray")
    @Expose
    private String [] GroupNamePathArray;

    /**
    * 目录id
    */
    @SerializedName("MenuId")
    @Expose
    private Long MenuId;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 关联id
    */
    @SerializedName("RelationId")
    @Expose
    private Long RelationId;

    /**
     * Get 账户Id 
     * @return AccountId 账户Id
     */
    public Long getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 账户Id
     * @param AccountId 账户Id
     */
    public void setAccountId(Long AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 用户UserId 
     * @return UserId 用户UserId
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户UserId
     * @param UserId 用户UserId
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户名称 
     * @return UserName 用户名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称
     * @param UserName 用户名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 所属分组Id 
     * @return GroupId 所属分组Id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 所属分组Id
     * @param GroupId 所属分组Id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组路劲GroupIdPathArray 
     * @return GroupIdPathArray 分组路劲GroupIdPathArray
     */
    public Long [] getGroupIdPathArray() {
        return this.GroupIdPathArray;
    }

    /**
     * Set 分组路劲GroupIdPathArray
     * @param GroupIdPathArray 分组路劲GroupIdPathArray
     */
    public void setGroupIdPathArray(Long [] GroupIdPathArray) {
        this.GroupIdPathArray = GroupIdPathArray;
    }

    /**
     * Get 所属分组NamePathArray 
     * @return GroupNamePathArray 所属分组NamePathArray
     */
    public String [] getGroupNamePathArray() {
        return this.GroupNamePathArray;
    }

    /**
     * Set 所属分组NamePathArray
     * @param GroupNamePathArray 所属分组NamePathArray
     */
    public void setGroupNamePathArray(String [] GroupNamePathArray) {
        this.GroupNamePathArray = GroupNamePathArray;
    }

    /**
     * Get 目录id 
     * @return MenuId 目录id
     */
    public Long getMenuId() {
        return this.MenuId;
    }

    /**
     * Set 目录id
     * @param MenuId 目录id
     */
    public void setMenuId(Long MenuId) {
        this.MenuId = MenuId;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 关联id 
     * @return RelationId 关联id
     */
    public Long getRelationId() {
        return this.RelationId;
    }

    /**
     * Set 关联id
     * @param RelationId 关联id
     */
    public void setRelationId(Long RelationId) {
        this.RelationId = RelationId;
    }

    public GrantedAccountItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrantedAccountItem(GrantedAccountItem source) {
        if (source.AccountId != null) {
            this.AccountId = new Long(source.AccountId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupIdPathArray != null) {
            this.GroupIdPathArray = new Long[source.GroupIdPathArray.length];
            for (int i = 0; i < source.GroupIdPathArray.length; i++) {
                this.GroupIdPathArray[i] = new Long(source.GroupIdPathArray[i]);
            }
        }
        if (source.GroupNamePathArray != null) {
            this.GroupNamePathArray = new String[source.GroupNamePathArray.length];
            for (int i = 0; i < source.GroupNamePathArray.length; i++) {
                this.GroupNamePathArray[i] = new String(source.GroupNamePathArray[i]);
            }
        }
        if (source.MenuId != null) {
            this.MenuId = new Long(source.MenuId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.RelationId != null) {
            this.RelationId = new Long(source.RelationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "GroupIdPathArray.", this.GroupIdPathArray);
        this.setParamArraySimple(map, prefix + "GroupNamePathArray.", this.GroupNamePathArray);
        this.setParamSimple(map, prefix + "MenuId", this.MenuId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RelationId", this.RelationId);

    }
}

