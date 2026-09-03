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
    * <p>账户组Id</p>
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * <p>分组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>所属分组Id</p>
    */
    @SerializedName("IdPathArray")
    @Expose
    private Long [] IdPathArray;

    /**
    * <p>所属分组NamePathArray</p>
    */
    @SerializedName("NamePathArray")
    @Expose
    private String [] NamePathArray;

    /**
    * <p>目录id</p>
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>关联id</p>
    */
    @SerializedName("RelationId")
    @Expose
    private Long RelationId;

    /**
     * Get <p>账户组Id</p> 
     * @return AccountGroupId <p>账户组Id</p>
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>账户组Id</p>
     * @param AccountGroupId <p>账户组Id</p>
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>分组名称</p> 
     * @return Name <p>分组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分组名称</p>
     * @param Name <p>分组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>所属分组Id</p> 
     * @return IdPathArray <p>所属分组Id</p>
     */
    public Long [] getIdPathArray() {
        return this.IdPathArray;
    }

    /**
     * Set <p>所属分组Id</p>
     * @param IdPathArray <p>所属分组Id</p>
     */
    public void setIdPathArray(Long [] IdPathArray) {
        this.IdPathArray = IdPathArray;
    }

    /**
     * Get <p>所属分组NamePathArray</p> 
     * @return NamePathArray <p>所属分组NamePathArray</p>
     */
    public String [] getNamePathArray() {
        return this.NamePathArray;
    }

    /**
     * Set <p>所属分组NamePathArray</p>
     * @param NamePathArray <p>所属分组NamePathArray</p>
     */
    public void setNamePathArray(String [] NamePathArray) {
        this.NamePathArray = NamePathArray;
    }

    /**
     * Get <p>目录id</p> 
     * @return AccountCount <p>目录id</p>
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set <p>目录id</p>
     * @param AccountCount <p>目录id</p>
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get <p>过期时间</p> 
     * @return ExpireTime <p>过期时间</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpireTime <p>过期时间</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>关联id</p> 
     * @return RelationId <p>关联id</p>
     */
    public Long getRelationId() {
        return this.RelationId;
    }

    /**
     * Set <p>关联id</p>
     * @param RelationId <p>关联id</p>
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

