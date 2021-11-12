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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationRequest extends AbstractModel{

    /**
    * 应用名称
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 应用类型，V：虚拟机应用；C：容器应用；S：serverless应用
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 应用描述
    */
    @SerializedName("ApplicationDesc")
    @Expose
    private String ApplicationDesc;

    /**
    * 应用日志配置项，废弃参数
    */
    @SerializedName("ApplicationLogConfig")
    @Expose
    private String ApplicationLogConfig;

    /**
    * 应用资源类型，废弃参数
    */
    @SerializedName("ApplicationResourceType")
    @Expose
    private String ApplicationResourceType;

    /**
    * 应用runtime类型
    */
    @SerializedName("ApplicationRuntimeType")
    @Expose
    private String ApplicationRuntimeType;

    /**
    * 需要绑定的数据集ID
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * 服务配置信息列表
    */
    @SerializedName("ServiceConfigList")
    @Expose
    private ServiceConfig [] ServiceConfigList;

    /**
    * 忽略创建镜像仓库
    */
    @SerializedName("IgnoreCreateImageRepository")
    @Expose
    private Boolean IgnoreCreateImageRepository;

    /**
    * 无
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

    /**
     * Get 应用名称 
     * @return ApplicationName 应用名称
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
     * @param ApplicationName 应用名称
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 应用类型，V：虚拟机应用；C：容器应用；S：serverless应用 
     * @return ApplicationType 应用类型，V：虚拟机应用；C：容器应用；S：serverless应用
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型，V：虚拟机应用；C：容器应用；S：serverless应用
     * @param ApplicationType 应用类型，V：虚拟机应用；C：容器应用；S：serverless应用
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用 
     * @return MicroserviceType 应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用
     * @param MicroserviceType 应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get 应用描述 
     * @return ApplicationDesc 应用描述
     */
    public String getApplicationDesc() {
        return this.ApplicationDesc;
    }

    /**
     * Set 应用描述
     * @param ApplicationDesc 应用描述
     */
    public void setApplicationDesc(String ApplicationDesc) {
        this.ApplicationDesc = ApplicationDesc;
    }

    /**
     * Get 应用日志配置项，废弃参数 
     * @return ApplicationLogConfig 应用日志配置项，废弃参数
     */
    public String getApplicationLogConfig() {
        return this.ApplicationLogConfig;
    }

    /**
     * Set 应用日志配置项，废弃参数
     * @param ApplicationLogConfig 应用日志配置项，废弃参数
     */
    public void setApplicationLogConfig(String ApplicationLogConfig) {
        this.ApplicationLogConfig = ApplicationLogConfig;
    }

    /**
     * Get 应用资源类型，废弃参数 
     * @return ApplicationResourceType 应用资源类型，废弃参数
     */
    public String getApplicationResourceType() {
        return this.ApplicationResourceType;
    }

    /**
     * Set 应用资源类型，废弃参数
     * @param ApplicationResourceType 应用资源类型，废弃参数
     */
    public void setApplicationResourceType(String ApplicationResourceType) {
        this.ApplicationResourceType = ApplicationResourceType;
    }

    /**
     * Get 应用runtime类型 
     * @return ApplicationRuntimeType 应用runtime类型
     */
    public String getApplicationRuntimeType() {
        return this.ApplicationRuntimeType;
    }

    /**
     * Set 应用runtime类型
     * @param ApplicationRuntimeType 应用runtime类型
     */
    public void setApplicationRuntimeType(String ApplicationRuntimeType) {
        this.ApplicationRuntimeType = ApplicationRuntimeType;
    }

    /**
     * Get 需要绑定的数据集ID 
     * @return ProgramId 需要绑定的数据集ID
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set 需要绑定的数据集ID
     * @param ProgramId 需要绑定的数据集ID
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get 服务配置信息列表 
     * @return ServiceConfigList 服务配置信息列表
     */
    public ServiceConfig [] getServiceConfigList() {
        return this.ServiceConfigList;
    }

    /**
     * Set 服务配置信息列表
     * @param ServiceConfigList 服务配置信息列表
     */
    public void setServiceConfigList(ServiceConfig [] ServiceConfigList) {
        this.ServiceConfigList = ServiceConfigList;
    }

    /**
     * Get 忽略创建镜像仓库 
     * @return IgnoreCreateImageRepository 忽略创建镜像仓库
     */
    public Boolean getIgnoreCreateImageRepository() {
        return this.IgnoreCreateImageRepository;
    }

    /**
     * Set 忽略创建镜像仓库
     * @param IgnoreCreateImageRepository 忽略创建镜像仓库
     */
    public void setIgnoreCreateImageRepository(Boolean IgnoreCreateImageRepository) {
        this.IgnoreCreateImageRepository = IgnoreCreateImageRepository;
    }

    /**
     * Get 无 
     * @return ProgramIdList 无
     */
    public String [] getProgramIdList() {
        return this.ProgramIdList;
    }

    /**
     * Set 无
     * @param ProgramIdList 无
     */
    public void setProgramIdList(String [] ProgramIdList) {
        this.ProgramIdList = ProgramIdList;
    }

    public CreateApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationRequest(CreateApplicationRequest source) {
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.ApplicationDesc != null) {
            this.ApplicationDesc = new String(source.ApplicationDesc);
        }
        if (source.ApplicationLogConfig != null) {
            this.ApplicationLogConfig = new String(source.ApplicationLogConfig);
        }
        if (source.ApplicationResourceType != null) {
            this.ApplicationResourceType = new String(source.ApplicationResourceType);
        }
        if (source.ApplicationRuntimeType != null) {
            this.ApplicationRuntimeType = new String(source.ApplicationRuntimeType);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.ServiceConfigList != null) {
            this.ServiceConfigList = new ServiceConfig[source.ServiceConfigList.length];
            for (int i = 0; i < source.ServiceConfigList.length; i++) {
                this.ServiceConfigList[i] = new ServiceConfig(source.ServiceConfigList[i]);
            }
        }
        if (source.IgnoreCreateImageRepository != null) {
            this.IgnoreCreateImageRepository = new Boolean(source.IgnoreCreateImageRepository);
        }
        if (source.ProgramIdList != null) {
            this.ProgramIdList = new String[source.ProgramIdList.length];
            for (int i = 0; i < source.ProgramIdList.length; i++) {
                this.ProgramIdList[i] = new String(source.ProgramIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamSimple(map, prefix + "ApplicationDesc", this.ApplicationDesc);
        this.setParamSimple(map, prefix + "ApplicationLogConfig", this.ApplicationLogConfig);
        this.setParamSimple(map, prefix + "ApplicationResourceType", this.ApplicationResourceType);
        this.setParamSimple(map, prefix + "ApplicationRuntimeType", this.ApplicationRuntimeType);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamArrayObj(map, prefix + "ServiceConfigList.", this.ServiceConfigList);
        this.setParamSimple(map, prefix + "IgnoreCreateImageRepository", this.IgnoreCreateImageRepository);
        this.setParamArraySimple(map, prefix + "ProgramIdList.", this.ProgramIdList);

    }
}

