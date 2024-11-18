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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataServicePublishedApiListResp extends AbstractModel {

    /**
    * 服务id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 服务Api名称
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * 所属目录名称
    */
    @SerializedName("ApiFolderName")
    @Expose
    private String ApiFolderName;

    /**
    * 服务Api标签名称集合
    */
    @SerializedName("ApiTagNames")
    @Expose
    private String ApiTagNames;

    /**
    * 服务负责人
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 服务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Api的id
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 服务Api认证方式 0:免认证 1:应用认证
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 服务Api状态 0:创建 1:已上线 2:已删除 3:已下线
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * 配置方式 0:向导、1、脚本、2、注册Api
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigType")
    @Expose
    private Long ConfigType;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 服务id 
     * @return Id 服务id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 服务id
     * @param Id 服务id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 服务Api名称 
     * @return ApiName 服务Api名称
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set 服务Api名称
     * @param ApiName 服务Api名称
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get 所属目录名称 
     * @return ApiFolderName 所属目录名称
     */
    public String getApiFolderName() {
        return this.ApiFolderName;
    }

    /**
     * Set 所属目录名称
     * @param ApiFolderName 所属目录名称
     */
    public void setApiFolderName(String ApiFolderName) {
        this.ApiFolderName = ApiFolderName;
    }

    /**
     * Get 服务Api标签名称集合 
     * @return ApiTagNames 服务Api标签名称集合
     */
    public String getApiTagNames() {
        return this.ApiTagNames;
    }

    /**
     * Set 服务Api标签名称集合
     * @param ApiTagNames 服务Api标签名称集合
     */
    public void setApiTagNames(String ApiTagNames) {
        this.ApiTagNames = ApiTagNames;
    }

    /**
     * Get 服务负责人 
     * @return OwnerName 服务负责人
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 服务负责人
     * @param OwnerName 服务负责人
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 服务创建时间 
     * @return CreateTime 服务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 服务创建时间
     * @param CreateTime 服务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Api的id 
     * @return ApiId Api的id
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Api的id
     * @param ApiId Api的id
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 服务Api认证方式 0:免认证 1:应用认证 
     * @return AuthType 服务Api认证方式 0:免认证 1:应用认证
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 服务Api认证方式 0:免认证 1:应用认证
     * @param AuthType 服务Api认证方式 0:免认证 1:应用认证
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 服务Api状态 0:创建 1:已上线 2:已删除 3:已下线 
     * @return ApiStatus 服务Api状态 0:创建 1:已上线 2:已删除 3:已下线
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set 服务Api状态 0:创建 1:已上线 2:已删除 3:已下线
     * @param ApiStatus 服务Api状态 0:创建 1:已上线 2:已删除 3:已下线
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get 配置方式 0:向导、1、脚本、2、注册Api
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigType 配置方式 0:向导、1、脚本、2、注册Api
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 配置方式 0:向导、1、脚本、2、注册Api
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigType 配置方式 0:向导、1、脚本、2、注册Api
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigType(Long ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public DescribeDataServicePublishedApiListResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataServicePublishedApiListResp(DescribeDataServicePublishedApiListResp source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiFolderName != null) {
            this.ApiFolderName = new String(source.ApiFolderName);
        }
        if (source.ApiTagNames != null) {
            this.ApiTagNames = new String(source.ApiTagNames);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.ApiStatus != null) {
            this.ApiStatus = new Long(source.ApiStatus);
        }
        if (source.ConfigType != null) {
            this.ConfigType = new Long(source.ConfigType);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiFolderName", this.ApiFolderName);
        this.setParamSimple(map, prefix + "ApiTagNames", this.ApiTagNames);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ApiStatus", this.ApiStatus);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

