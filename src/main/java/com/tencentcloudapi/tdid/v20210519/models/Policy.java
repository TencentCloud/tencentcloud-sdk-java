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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Policy extends AbstractModel{

    /**
    * 披露策略索引
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 披露策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网络ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * 合约应用ID
    */
    @SerializedName("ContractAppId")
    @Expose
    private Long ContractAppId;

    /**
    * 披露策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 凭证模板ID
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * 策略Json
    */
    @SerializedName("PolicyJson")
    @Expose
    private String PolicyJson;

    /**
    * 生成时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建者DID
    */
    @SerializedName("CreatorDid")
    @Expose
    private String CreatorDid;

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 模板索引
    */
    @SerializedName("CptIndex")
    @Expose
    private Long CptIndex;

    /**
     * Get 披露策略索引 
     * @return Id 披露策略索引
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 披露策略索引
     * @param Id 披露策略索引
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 披露策略名称 
     * @return Name 披露策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 披露策略名称
     * @param Name 披露策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网络ID 
     * @return ClusterId 网络ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 网络ID
     * @param ClusterId 网络ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 群组ID 
     * @return GroupId 群组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群组ID
     * @param GroupId 群组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 合约应用ID 
     * @return ContractAppId 合约应用ID
     */
    public Long getContractAppId() {
        return this.ContractAppId;
    }

    /**
     * Set 合约应用ID
     * @param ContractAppId 合约应用ID
     */
    public void setContractAppId(Long ContractAppId) {
        this.ContractAppId = ContractAppId;
    }

    /**
     * Get 披露策略ID 
     * @return PolicyId 披露策略ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 披露策略ID
     * @param PolicyId 披露策略ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 凭证模板ID 
     * @return CptId 凭证模板ID
     */
    public Long getCptId() {
        return this.CptId;
    }

    /**
     * Set 凭证模板ID
     * @param CptId 凭证模板ID
     */
    public void setCptId(Long CptId) {
        this.CptId = CptId;
    }

    /**
     * Get 策略Json 
     * @return PolicyJson 策略Json
     */
    public String getPolicyJson() {
        return this.PolicyJson;
    }

    /**
     * Set 策略Json
     * @param PolicyJson 策略Json
     */
    public void setPolicyJson(String PolicyJson) {
        this.PolicyJson = PolicyJson;
    }

    /**
     * Get 生成时间 
     * @return CreateTime 生成时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 生成时间
     * @param CreateTime 生成时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建者DID 
     * @return CreatorDid 创建者DID
     */
    public String getCreatorDid() {
        return this.CreatorDid;
    }

    /**
     * Set 创建者DID
     * @param CreatorDid 创建者DID
     */
    public void setCreatorDid(String CreatorDid) {
        this.CreatorDid = CreatorDid;
    }

    /**
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 模板索引 
     * @return CptIndex 模板索引
     */
    public Long getCptIndex() {
        return this.CptIndex;
    }

    /**
     * Set 模板索引
     * @param CptIndex 模板索引
     */
    public void setCptIndex(Long CptIndex) {
        this.CptIndex = CptIndex;
    }

    public Policy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Policy(Policy source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ContractAppId != null) {
            this.ContractAppId = new Long(source.ContractAppId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.PolicyJson != null) {
            this.PolicyJson = new String(source.PolicyJson);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreatorDid != null) {
            this.CreatorDid = new String(source.CreatorDid);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.CptIndex != null) {
            this.CptIndex = new Long(source.CptIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ContractAppId", this.ContractAppId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "CptId", this.CptId);
        this.setParamSimple(map, prefix + "PolicyJson", this.PolicyJson);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreatorDid", this.CreatorDid);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "CptIndex", this.CptIndex);

    }
}

