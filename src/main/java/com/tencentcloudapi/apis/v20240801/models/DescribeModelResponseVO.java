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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelResponseVO extends AbstractModel {

    /**
    * 腾讯云AppID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 腾讯云Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 模型ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 凭据ID
    */
    @SerializedName("CredentialID")
    @Expose
    private String CredentialID;

    /**
    * 凭据名称
    */
    @SerializedName("CredentialName")
    @Expose
    private String CredentialName;

    /**
    * http协议类型
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * https时，是否校验目标证书
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * http协议版本：1.1/2.0
    */
    @SerializedName("HttpProtocolVersion")
    @Expose
    private String HttpProtocolVersion;

    /**
    * 目标路径
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * 目标器列表
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * 被模型服务使用的个数
    */
    @SerializedName("ModelServiceCount")
    @Expose
    private Long ModelServiceCount;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后修改时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
     * Get 腾讯云AppID 
     * @return AppID 腾讯云AppID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 腾讯云AppID
     * @param AppID 腾讯云AppID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 腾讯云Uin 
     * @return Uin 腾讯云Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 腾讯云Uin
     * @param Uin 腾讯云Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 模型ID 
     * @return ID 模型ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 模型ID
     * @param ID 模型ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 模型名称 
     * @return Name 模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模型名称
     * @param Name 模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 凭据ID 
     * @return CredentialID 凭据ID
     */
    public String getCredentialID() {
        return this.CredentialID;
    }

    /**
     * Set 凭据ID
     * @param CredentialID 凭据ID
     */
    public void setCredentialID(String CredentialID) {
        this.CredentialID = CredentialID;
    }

    /**
     * Get 凭据名称 
     * @return CredentialName 凭据名称
     */
    public String getCredentialName() {
        return this.CredentialName;
    }

    /**
     * Set 凭据名称
     * @param CredentialName 凭据名称
     */
    public void setCredentialName(String CredentialName) {
        this.CredentialName = CredentialName;
    }

    /**
     * Get http协议类型 
     * @return HttpProtocolType http协议类型
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set http协议类型
     * @param HttpProtocolType http协议类型
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get https时，是否校验目标证书 
     * @return CheckTargetCertsError https时，是否校验目标证书
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set https时，是否校验目标证书
     * @param CheckTargetCertsError https时，是否校验目标证书
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get http协议版本：1.1/2.0 
     * @return HttpProtocolVersion http协议版本：1.1/2.0
     */
    public String getHttpProtocolVersion() {
        return this.HttpProtocolVersion;
    }

    /**
     * Set http协议版本：1.1/2.0
     * @param HttpProtocolVersion http协议版本：1.1/2.0
     */
    public void setHttpProtocolVersion(String HttpProtocolVersion) {
        this.HttpProtocolVersion = HttpProtocolVersion;
    }

    /**
     * Get 目标路径 
     * @return TargetPath 目标路径
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set 目标路径
     * @param TargetPath 目标路径
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get 目标器列表 
     * @return TargetHosts 目标器列表
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set 目标器列表
     * @param TargetHosts 目标器列表
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get 被模型服务使用的个数 
     * @return ModelServiceCount 被模型服务使用的个数
     */
    public Long getModelServiceCount() {
        return this.ModelServiceCount;
    }

    /**
     * Set 被模型服务使用的个数
     * @param ModelServiceCount 被模型服务使用的个数
     */
    public void setModelServiceCount(Long ModelServiceCount) {
        this.ModelServiceCount = ModelServiceCount;
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
     * Get 最后修改时间 
     * @return LastUpdateTime 最后修改时间
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后修改时间
     * @param LastUpdateTime 最后修改时间
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    public DescribeModelResponseVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelResponseVO(DescribeModelResponseVO source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CredentialID != null) {
            this.CredentialID = new String(source.CredentialID);
        }
        if (source.CredentialName != null) {
            this.CredentialName = new String(source.CredentialName);
        }
        if (source.HttpProtocolType != null) {
            this.HttpProtocolType = new String(source.HttpProtocolType);
        }
        if (source.CheckTargetCertsError != null) {
            this.CheckTargetCertsError = new Boolean(source.CheckTargetCertsError);
        }
        if (source.HttpProtocolVersion != null) {
            this.HttpProtocolVersion = new String(source.HttpProtocolVersion);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.TargetHosts != null) {
            this.TargetHosts = new TargetHostDTO[source.TargetHosts.length];
            for (int i = 0; i < source.TargetHosts.length; i++) {
                this.TargetHosts[i] = new TargetHostDTO(source.TargetHosts[i]);
            }
        }
        if (source.ModelServiceCount != null) {
            this.ModelServiceCount = new Long(source.ModelServiceCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CredentialID", this.CredentialID);
        this.setParamSimple(map, prefix + "CredentialName", this.CredentialName);
        this.setParamSimple(map, prefix + "HttpProtocolType", this.HttpProtocolType);
        this.setParamSimple(map, prefix + "CheckTargetCertsError", this.CheckTargetCertsError);
        this.setParamSimple(map, prefix + "HttpProtocolVersion", this.HttpProtocolVersion);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamArrayObj(map, prefix + "TargetHosts.", this.TargetHosts);
        this.setParamSimple(map, prefix + "ModelServiceCount", this.ModelServiceCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

