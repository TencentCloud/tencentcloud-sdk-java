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
    * <p>腾讯云AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>腾讯云Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>模型ID</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>凭据ID</p>
    */
    @SerializedName("CredentialID")
    @Expose
    private String CredentialID;

    /**
    * <p>凭据名称</p>
    */
    @SerializedName("CredentialName")
    @Expose
    private String CredentialName;

    /**
    * <p>http协议类型</p>
    */
    @SerializedName("HttpProtocolType")
    @Expose
    private String HttpProtocolType;

    /**
    * <p>https时，是否校验目标证书</p>
    */
    @SerializedName("CheckTargetCertsError")
    @Expose
    private Boolean CheckTargetCertsError;

    /**
    * <p>http协议版本：1.1/2.0</p>
    */
    @SerializedName("HttpProtocolVersion")
    @Expose
    private String HttpProtocolVersion;

    /**
    * <p>目标路径</p>
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>目标器列表</p>
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * <p>被模型服务使用的个数</p>
    */
    @SerializedName("ModelServiceCount")
    @Expose
    private Long ModelServiceCount;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最后修改时间</p>
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * <p>model ID</p>
    */
    @SerializedName("ModelID")
    @Expose
    private String ModelID;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>腾讯云AppID</p> 
     * @return AppID <p>腾讯云AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>腾讯云AppID</p>
     * @param AppID <p>腾讯云AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>腾讯云Uin</p> 
     * @return Uin <p>腾讯云Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>腾讯云Uin</p>
     * @param Uin <p>腾讯云Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>模型ID</p> 
     * @return ID <p>模型ID</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>模型ID</p>
     * @param ID <p>模型ID</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>模型名称</p> 
     * @return Name <p>模型名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模型名称</p>
     * @param Name <p>模型名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>凭据ID</p> 
     * @return CredentialID <p>凭据ID</p>
     */
    public String getCredentialID() {
        return this.CredentialID;
    }

    /**
     * Set <p>凭据ID</p>
     * @param CredentialID <p>凭据ID</p>
     */
    public void setCredentialID(String CredentialID) {
        this.CredentialID = CredentialID;
    }

    /**
     * Get <p>凭据名称</p> 
     * @return CredentialName <p>凭据名称</p>
     */
    public String getCredentialName() {
        return this.CredentialName;
    }

    /**
     * Set <p>凭据名称</p>
     * @param CredentialName <p>凭据名称</p>
     */
    public void setCredentialName(String CredentialName) {
        this.CredentialName = CredentialName;
    }

    /**
     * Get <p>http协议类型</p> 
     * @return HttpProtocolType <p>http协议类型</p>
     */
    public String getHttpProtocolType() {
        return this.HttpProtocolType;
    }

    /**
     * Set <p>http协议类型</p>
     * @param HttpProtocolType <p>http协议类型</p>
     */
    public void setHttpProtocolType(String HttpProtocolType) {
        this.HttpProtocolType = HttpProtocolType;
    }

    /**
     * Get <p>https时，是否校验目标证书</p> 
     * @return CheckTargetCertsError <p>https时，是否校验目标证书</p>
     */
    public Boolean getCheckTargetCertsError() {
        return this.CheckTargetCertsError;
    }

    /**
     * Set <p>https时，是否校验目标证书</p>
     * @param CheckTargetCertsError <p>https时，是否校验目标证书</p>
     */
    public void setCheckTargetCertsError(Boolean CheckTargetCertsError) {
        this.CheckTargetCertsError = CheckTargetCertsError;
    }

    /**
     * Get <p>http协议版本：1.1/2.0</p> 
     * @return HttpProtocolVersion <p>http协议版本：1.1/2.0</p>
     */
    public String getHttpProtocolVersion() {
        return this.HttpProtocolVersion;
    }

    /**
     * Set <p>http协议版本：1.1/2.0</p>
     * @param HttpProtocolVersion <p>http协议版本：1.1/2.0</p>
     */
    public void setHttpProtocolVersion(String HttpProtocolVersion) {
        this.HttpProtocolVersion = HttpProtocolVersion;
    }

    /**
     * Get <p>目标路径</p> 
     * @return TargetPath <p>目标路径</p>
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>目标路径</p>
     * @param TargetPath <p>目标路径</p>
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>目标器列表</p> 
     * @return TargetHosts <p>目标器列表</p>
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set <p>目标器列表</p>
     * @param TargetHosts <p>目标器列表</p>
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get <p>被模型服务使用的个数</p> 
     * @return ModelServiceCount <p>被模型服务使用的个数</p>
     */
    public Long getModelServiceCount() {
        return this.ModelServiceCount;
    }

    /**
     * Set <p>被模型服务使用的个数</p>
     * @param ModelServiceCount <p>被模型服务使用的个数</p>
     */
    public void setModelServiceCount(Long ModelServiceCount) {
        this.ModelServiceCount = ModelServiceCount;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后修改时间</p> 
     * @return LastUpdateTime <p>最后修改时间</p>
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set <p>最后修改时间</p>
     * @param LastUpdateTime <p>最后修改时间</p>
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get <p>model ID</p> 
     * @return ModelID <p>model ID</p>
     */
    public String getModelID() {
        return this.ModelID;
    }

    /**
     * Set <p>model ID</p>
     * @param ModelID <p>model ID</p>
     */
    public void setModelID(String ModelID) {
        this.ModelID = ModelID;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
        if (source.ModelID != null) {
            this.ModelID = new String(source.ModelID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "ModelID", this.ModelID);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

