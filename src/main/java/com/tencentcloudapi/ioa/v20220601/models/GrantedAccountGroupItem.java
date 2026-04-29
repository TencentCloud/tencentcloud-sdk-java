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

public class GrantedAccountGroupItem extends AbstractModel {

    /**
    * 账户组Id
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * 分组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 所属分组Id
    */
    @SerializedName("IdPathArray")
    @Expose
    private Long [] IdPathArray;

    /**
    * 所属分组NamePathArray
    */
    @SerializedName("NamePathArray")
    @Expose
    private String [] NamePathArray;

    /**
    * 目录id
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

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
     * Get 账户组Id 
     * @return AccountGroupId 账户组Id
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账户组Id
     * @param AccountGroupId 账户组Id
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 分组名称 
     * @return Name 分组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分组名称
     * @param Name 分组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 所属分组Id 
     * @return IdPathArray 所属分组Id
     */
    public Long [] getIdPathArray() {
        return this.IdPathArray;
    }

    /**
     * Set 所属分组Id
     * @param IdPathArray 所属分组Id
     */
    public void setIdPathArray(Long [] IdPathArray) {
        this.IdPathArray = IdPathArray;
    }

    /**
     * Get 所属分组NamePathArray 
     * @return NamePathArray 所属分组NamePathArray
     */
    public String [] getNamePathArray() {
        return this.NamePathArray;
    }

    /**
     * Set 所属分组NamePathArray
     * @param NamePathArray 所属分组NamePathArray
     */
    public void setNamePathArray(String [] NamePathArray) {
        this.NamePathArray = NamePathArray;
    }

    /**
     * Get 目录id 
     * @return AccountCount 目录id
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set 目录id
     * @param AccountCount 目录id
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
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

    public GrantedAccountGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrantedAccountGroupItem(GrantedAccountGroupItem source) {
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new Long(source.AccountGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdPathArray != null) {
            this.IdPathArray = new Long[source.IdPathArray.length];
            for (int i = 0; i < source.IdPathArray.length; i++) {
                this.IdPathArray[i] = new Long(source.IdPathArray[i]);
            }
        }
        if (source.NamePathArray != null) {
            this.NamePathArray = new String[source.NamePathArray.length];
            for (int i = 0; i < source.NamePathArray.length; i++) {
                this.NamePathArray[i] = new String(source.NamePathArray[i]);
            }
        }
        if (source.AccountCount != null) {
            this.AccountCount = new Long(source.AccountCount);
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
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "IdPathArray.", this.IdPathArray);
        this.setParamArraySimple(map, prefix + "NamePathArray.", this.NamePathArray);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RelationId", this.RelationId);

    }
}

