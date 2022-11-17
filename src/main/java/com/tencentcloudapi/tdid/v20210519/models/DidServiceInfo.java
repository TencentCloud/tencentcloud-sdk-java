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

public class DidServiceInfo extends AbstractModel{

    /**
    * DID服务索引
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 应用ID
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 账号唯一标识
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 联盟id
    */
    @SerializedName("ConsortiumId")
    @Expose
    private Long ConsortiumId;

    /**
    * 联盟名称
    */
    @SerializedName("ConsortiumName")
    @Expose
    private String ConsortiumName;

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
    * 链ID
    */
    @SerializedName("ChainId")
    @Expose
    private String ChainId;

    /**
    * 1为盟主，0为非盟主
    */
    @SerializedName("RoleType")
    @Expose
    private Long RoleType;

    /**
    * 机构DID
    */
    @SerializedName("AgencyDid")
    @Expose
    private String AgencyDid;

    /**
    * 机构名称
    */
    @SerializedName("CreateOrg")
    @Expose
    private String CreateOrg;

    /**
    * 端点
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

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
    * 群组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get DID服务索引 
     * @return Id DID服务索引
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set DID服务索引
     * @param Id DID服务索引
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 应用ID 
     * @return Appid 应用ID
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 应用ID
     * @param Appid 应用ID
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 账号唯一标识 
     * @return Uin 账号唯一标识
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账号唯一标识
     * @param Uin 账号唯一标识
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 联盟id 
     * @return ConsortiumId 联盟id
     */
    public Long getConsortiumId() {
        return this.ConsortiumId;
    }

    /**
     * Set 联盟id
     * @param ConsortiumId 联盟id
     */
    public void setConsortiumId(Long ConsortiumId) {
        this.ConsortiumId = ConsortiumId;
    }

    /**
     * Get 联盟名称 
     * @return ConsortiumName 联盟名称
     */
    public String getConsortiumName() {
        return this.ConsortiumName;
    }

    /**
     * Set 联盟名称
     * @param ConsortiumName 联盟名称
     */
    public void setConsortiumName(String ConsortiumName) {
        this.ConsortiumName = ConsortiumName;
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
     * Get 链ID 
     * @return ChainId 链ID
     */
    public String getChainId() {
        return this.ChainId;
    }

    /**
     * Set 链ID
     * @param ChainId 链ID
     */
    public void setChainId(String ChainId) {
        this.ChainId = ChainId;
    }

    /**
     * Get 1为盟主，0为非盟主 
     * @return RoleType 1为盟主，0为非盟主
     */
    public Long getRoleType() {
        return this.RoleType;
    }

    /**
     * Set 1为盟主，0为非盟主
     * @param RoleType 1为盟主，0为非盟主
     */
    public void setRoleType(Long RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get 机构DID 
     * @return AgencyDid 机构DID
     */
    public String getAgencyDid() {
        return this.AgencyDid;
    }

    /**
     * Set 机构DID
     * @param AgencyDid 机构DID
     */
    public void setAgencyDid(String AgencyDid) {
        this.AgencyDid = AgencyDid;
    }

    /**
     * Get 机构名称 
     * @return CreateOrg 机构名称
     */
    public String getCreateOrg() {
        return this.CreateOrg;
    }

    /**
     * Set 机构名称
     * @param CreateOrg 机构名称
     */
    public void setCreateOrg(String CreateOrg) {
        this.CreateOrg = CreateOrg;
    }

    /**
     * Get 端点 
     * @return Endpoint 端点
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 端点
     * @param Endpoint 端点
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
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
     * Get 群组名称 
     * @return GroupName 群组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 群组名称
     * @param GroupName 群组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public DidServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DidServiceInfo(DidServiceInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ConsortiumId != null) {
            this.ConsortiumId = new Long(source.ConsortiumId);
        }
        if (source.ConsortiumName != null) {
            this.ConsortiumName = new String(source.ConsortiumName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ChainId != null) {
            this.ChainId = new String(source.ChainId);
        }
        if (source.RoleType != null) {
            this.RoleType = new Long(source.RoleType);
        }
        if (source.AgencyDid != null) {
            this.AgencyDid = new String(source.AgencyDid);
        }
        if (source.CreateOrg != null) {
            this.CreateOrg = new String(source.CreateOrg);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ConsortiumId", this.ConsortiumId);
        this.setParamSimple(map, prefix + "ConsortiumName", this.ConsortiumName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "AgencyDid", this.AgencyDid);
        this.setParamSimple(map, prefix + "CreateOrg", this.CreateOrg);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

