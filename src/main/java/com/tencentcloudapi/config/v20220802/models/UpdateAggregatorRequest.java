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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAggregatorRequest extends AbstractModel {

    /**
    * <p>账号组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>账号组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>账号组类型</p><p>枚举值：</p><ul><li>RD： 全局账号组</li><li>CUSTOM： 自定义账号组</li></ul>
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * <p>账号组创建者ID</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * <p>账号组成员信息列表，最多100个</p>
    */
    @SerializedName("AggregatorAccounts")
    @Expose
    private AggregatorAccount [] AggregatorAccounts;

    /**
     * Get <p>账号组名称</p> 
     * @return Name <p>账号组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>账号组名称</p>
     * @param Name <p>账号组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>账号组描述</p> 
     * @return Description <p>账号组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>账号组描述</p>
     * @param Description <p>账号组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>账号组类型</p><p>枚举值：</p><ul><li>RD： 全局账号组</li><li>CUSTOM： 自定义账号组</li></ul> 
     * @return AccountGroupId <p>账号组类型</p><p>枚举值：</p><ul><li>RD： 全局账号组</li><li>CUSTOM： 自定义账号组</li></ul>
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>账号组类型</p><p>枚举值：</p><ul><li>RD： 全局账号组</li><li>CUSTOM： 自定义账号组</li></ul>
     * @param AccountGroupId <p>账号组类型</p><p>枚举值：</p><ul><li>RD： 全局账号组</li><li>CUSTOM： 自定义账号组</li></ul>
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>账号组创建者ID</p> 
     * @return OwnerUin <p>账号组创建者ID</p>
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>账号组创建者ID</p>
     * @param OwnerUin <p>账号组创建者ID</p>
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>账号组成员信息列表，最多100个</p> 
     * @return AggregatorAccounts <p>账号组成员信息列表，最多100个</p>
     */
    public AggregatorAccount [] getAggregatorAccounts() {
        return this.AggregatorAccounts;
    }

    /**
     * Set <p>账号组成员信息列表，最多100个</p>
     * @param AggregatorAccounts <p>账号组成员信息列表，最多100个</p>
     */
    public void setAggregatorAccounts(AggregatorAccount [] AggregatorAccounts) {
        this.AggregatorAccounts = AggregatorAccounts;
    }

    public UpdateAggregatorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAggregatorRequest(UpdateAggregatorRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.AggregatorAccounts != null) {
            this.AggregatorAccounts = new AggregatorAccount[source.AggregatorAccounts.length];
            for (int i = 0; i < source.AggregatorAccounts.length; i++) {
                this.AggregatorAccounts[i] = new AggregatorAccount(source.AggregatorAccounts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamArrayObj(map, prefix + "AggregatorAccounts.", this.AggregatorAccounts);

    }
}

