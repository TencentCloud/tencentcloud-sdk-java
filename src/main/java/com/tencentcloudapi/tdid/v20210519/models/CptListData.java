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

public class CptListData extends AbstractModel{

    /**
    * ID信息
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 模版名称
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
    * 凭证模板ID
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * 模板类型，1: 系统模板，2: 用户模板，3:普通模板
    */
    @SerializedName("CptType")
    @Expose
    private Long CptType;

    /**
    * 凭证模版描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 凭证模板Json
    */
    @SerializedName("CptJson")
    @Expose
    private String CptJson;

    /**
    * 创建时间
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
     * Get ID信息 
     * @return Id ID信息
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID信息
     * @param Id ID信息
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 模版名称 
     * @return Name 模版名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模版名称
     * @param Name 模版名称
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
     * Get 模板类型，1: 系统模板，2: 用户模板，3:普通模板 
     * @return CptType 模板类型，1: 系统模板，2: 用户模板，3:普通模板
     */
    public Long getCptType() {
        return this.CptType;
    }

    /**
     * Set 模板类型，1: 系统模板，2: 用户模板，3:普通模板
     * @param CptType 模板类型，1: 系统模板，2: 用户模板，3:普通模板
     */
    public void setCptType(Long CptType) {
        this.CptType = CptType;
    }

    /**
     * Get 凭证模版描述 
     * @return Description 凭证模版描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 凭证模版描述
     * @param Description 凭证模版描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 凭证模板Json 
     * @return CptJson 凭证模板Json
     */
    public String getCptJson() {
        return this.CptJson;
    }

    /**
     * Set 凭证模板Json
     * @param CptJson 凭证模板Json
     */
    public void setCptJson(String CptJson) {
        this.CptJson = CptJson;
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

    public CptListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CptListData(CptListData source) {
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
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.CptType != null) {
            this.CptType = new Long(source.CptType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CptJson != null) {
            this.CptJson = new String(source.CptJson);
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
        this.setParamSimple(map, prefix + "CptId", this.CptId);
        this.setParamSimple(map, prefix + "CptType", this.CptType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CptJson", this.CptJson);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreatorDid", this.CreatorDid);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

