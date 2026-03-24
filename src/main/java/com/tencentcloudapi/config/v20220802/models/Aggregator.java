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

public class Aggregator extends AbstractModel {

    /**
    * 账号组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 账号组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建者用户ID
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 账号组成员数量
    */
    @SerializedName("AccountCount")
    @Expose
    private Long AccountCount;

    /**
    * RD:全局账号组
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 账号组ID
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * 账号组状态
    */
    @SerializedName("AggregatorStatus")
    @Expose
    private Long AggregatorStatus;

    /**
    * 账号组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
     * Get 账号组名称 
     * @return Name 账号组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账号组名称
     * @param Name 账号组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 账号组描述 
     * @return Description 账号组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 账号组描述
     * @param Description 账号组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建者用户ID 
     * @return OwnerUin 创建者用户ID
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 创建者用户ID
     * @param OwnerUin 创建者用户ID
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
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
     * Get 账号组成员数量 
     * @return AccountCount 账号组成员数量
     */
    public Long getAccountCount() {
        return this.AccountCount;
    }

    /**
     * Set 账号组成员数量
     * @param AccountCount 账号组成员数量
     */
    public void setAccountCount(Long AccountCount) {
        this.AccountCount = AccountCount;
    }

    /**
     * Get RD:全局账号组 
     * @return Type RD:全局账号组
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set RD:全局账号组
     * @param Type RD:全局账号组
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 账号组ID 
     * @return AccountGroupId 账号组ID
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID
     * @param AccountGroupId 账号组ID
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 账号组状态 
     * @return AggregatorStatus 账号组状态
     */
    public Long getAggregatorStatus() {
        return this.AggregatorStatus;
    }

    /**
     * Set 账号组状态
     * @param AggregatorStatus 账号组状态
     */
    public void setAggregatorStatus(Long AggregatorStatus) {
        this.AggregatorStatus = AggregatorStatus;
    }

    /**
     * Get 账号组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberName 账号组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set 账号组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberName 账号组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public Aggregator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Aggregator(Aggregator source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AccountCount != null) {
            this.AccountCount = new Long(source.AccountCount);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.AggregatorStatus != null) {
            this.AggregatorStatus = new Long(source.AggregatorStatus);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AccountCount", this.AccountCount);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "AggregatorStatus", this.AggregatorStatus);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);

    }
}

