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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationRequest extends AbstractModel {

    /**
    * <p>应用名称，最长60字符</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>应用类型，V：虚拟机应用；C：容器应用；S：serverless应用</p>
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * <p>应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用</p>
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * <p>应用描述</p>
    */
    @SerializedName("ApplicationDesc")
    @Expose
    private String ApplicationDesc;

    /**
    * <p>应用日志配置项，废弃参数</p>
    */
    @SerializedName("ApplicationLogConfig")
    @Expose
    private String ApplicationLogConfig;

    /**
    * <p>应用资源类型，废弃参数</p>
    */
    @SerializedName("ApplicationResourceType")
    @Expose
    private String ApplicationResourceType;

    /**
    * <p>应用runtime类型</p>
    */
    @SerializedName("ApplicationRuntimeType")
    @Expose
    private String ApplicationRuntimeType;

    /**
    * <p>【数据集ID】。可通过调用<a href="https://cloud.tencent.com/document/product/649/73477">DescribePrograms</a>查询已创建的数据集列表或登录<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program&amp;roleId=role-a26486wy">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/108544">CreateProgram</a>创建新的数据集。</p>
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * <p>服务配置信息列表</p>
    */
    @SerializedName("ServiceConfigList")
    @Expose
    private ServiceConfig [] ServiceConfigList;

    /**
    * <p>忽略创建镜像仓库</p>
    */
    @SerializedName("IgnoreCreateImageRepository")
    @Expose
    private Boolean IgnoreCreateImageRepository;

    /**
    * <p>数据集id列表</p>
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

    /**
    * <p>apm业务系统id</p>
    */
    @SerializedName("ApmInstanceId")
    @Expose
    private String ApmInstanceId;

    /**
    * <p>编程语言:  Java；C/C++；Python；Go；Other</p>
    */
    @SerializedName("ProgramLanguage")
    @Expose
    private String ProgramLanguage;

    /**
    * <p>开发框架-SpringCloud/Dubbo/Go-GRPC/Other</p>
    */
    @SerializedName("FrameworkType")
    @Expose
    private String FrameworkType;

    /**
    * <p>注册配置治理，关闭注册配置治理或者使用北极星注册中心时必须传值</p>
    */
    @SerializedName("ServiceGovernanceConfig")
    @Expose
    private ServiceGovernanceConfig ServiceGovernanceConfig;

    /**
    * <p>是否创建并关联同名镜像仓库</p>
    */
    @SerializedName("CreateSameNameImageRepository")
    @Expose
    private Boolean CreateSameNameImageRepository;

    /**
     * Get <p>应用名称，最长60字符</p> 
     * @return ApplicationName <p>应用名称，最长60字符</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>应用名称，最长60字符</p>
     * @param ApplicationName <p>应用名称，最长60字符</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>应用类型，V：虚拟机应用；C：容器应用；S：serverless应用</p> 
     * @return ApplicationType <p>应用类型，V：虚拟机应用；C：容器应用；S：serverless应用</p>
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set <p>应用类型，V：虚拟机应用；C：容器应用；S：serverless应用</p>
     * @param ApplicationType <p>应用类型，V：虚拟机应用；C：容器应用；S：serverless应用</p>
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get <p>应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用</p> 
     * @return MicroserviceType <p>应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用</p>
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set <p>应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用</p>
     * @param MicroserviceType <p>应用微服务类型，M：service mesh应用；N：普通应用；G：网关应用</p>
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get <p>应用描述</p> 
     * @return ApplicationDesc <p>应用描述</p>
     */
    public String getApplicationDesc() {
        return this.ApplicationDesc;
    }

    /**
     * Set <p>应用描述</p>
     * @param ApplicationDesc <p>应用描述</p>
     */
    public void setApplicationDesc(String ApplicationDesc) {
        this.ApplicationDesc = ApplicationDesc;
    }

    /**
     * Get <p>应用日志配置项，废弃参数</p> 
     * @return ApplicationLogConfig <p>应用日志配置项，废弃参数</p>
     * @deprecated
     */
    @Deprecated
    public String getApplicationLogConfig() {
        return this.ApplicationLogConfig;
    }

    /**
     * Set <p>应用日志配置项，废弃参数</p>
     * @param ApplicationLogConfig <p>应用日志配置项，废弃参数</p>
     * @deprecated
     */
    @Deprecated
    public void setApplicationLogConfig(String ApplicationLogConfig) {
        this.ApplicationLogConfig = ApplicationLogConfig;
    }

    /**
     * Get <p>应用资源类型，废弃参数</p> 
     * @return ApplicationResourceType <p>应用资源类型，废弃参数</p>
     * @deprecated
     */
    @Deprecated
    public String getApplicationResourceType() {
        return this.ApplicationResourceType;
    }

    /**
     * Set <p>应用资源类型，废弃参数</p>
     * @param ApplicationResourceType <p>应用资源类型，废弃参数</p>
     * @deprecated
     */
    @Deprecated
    public void setApplicationResourceType(String ApplicationResourceType) {
        this.ApplicationResourceType = ApplicationResourceType;
    }

    /**
     * Get <p>应用runtime类型</p> 
     * @return ApplicationRuntimeType <p>应用runtime类型</p>
     */
    public String getApplicationRuntimeType() {
        return this.ApplicationRuntimeType;
    }

    /**
     * Set <p>应用runtime类型</p>
     * @param ApplicationRuntimeType <p>应用runtime类型</p>
     */
    public void setApplicationRuntimeType(String ApplicationRuntimeType) {
        this.ApplicationRuntimeType = ApplicationRuntimeType;
    }

    /**
     * Get <p>【数据集ID】。可通过调用<a href="https://cloud.tencent.com/document/product/649/73477">DescribePrograms</a>查询已创建的数据集列表或登录<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program&amp;roleId=role-a26486wy">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/108544">CreateProgram</a>创建新的数据集。</p> 
     * @return ProgramId <p>【数据集ID】。可通过调用<a href="https://cloud.tencent.com/document/product/649/73477">DescribePrograms</a>查询已创建的数据集列表或登录<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program&amp;roleId=role-a26486wy">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/108544">CreateProgram</a>创建新的数据集。</p>
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set <p>【数据集ID】。可通过调用<a href="https://cloud.tencent.com/document/product/649/73477">DescribePrograms</a>查询已创建的数据集列表或登录<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program&amp;roleId=role-a26486wy">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/108544">CreateProgram</a>创建新的数据集。</p>
     * @param ProgramId <p>【数据集ID】。可通过调用<a href="https://cloud.tencent.com/document/product/649/73477">DescribePrograms</a>查询已创建的数据集列表或登录<a href="https://console.cloud.tencent.com/tsf/privilege?rid=1&amp;tab=program&amp;roleId=role-a26486wy">控制台</a>进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/108544">CreateProgram</a>创建新的数据集。</p>
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get <p>服务配置信息列表</p> 
     * @return ServiceConfigList <p>服务配置信息列表</p>
     */
    public ServiceConfig [] getServiceConfigList() {
        return this.ServiceConfigList;
    }

    /**
     * Set <p>服务配置信息列表</p>
     * @param ServiceConfigList <p>服务配置信息列表</p>
     */
    public void setServiceConfigList(ServiceConfig [] ServiceConfigList) {
        this.ServiceConfigList = ServiceConfigList;
    }

    /**
     * Get <p>忽略创建镜像仓库</p> 
     * @return IgnoreCreateImageRepository <p>忽略创建镜像仓库</p>
     */
    public Boolean getIgnoreCreateImageRepository() {
        return this.IgnoreCreateImageRepository;
    }

    /**
     * Set <p>忽略创建镜像仓库</p>
     * @param IgnoreCreateImageRepository <p>忽略创建镜像仓库</p>
     */
    public void setIgnoreCreateImageRepository(Boolean IgnoreCreateImageRepository) {
        this.IgnoreCreateImageRepository = IgnoreCreateImageRepository;
    }

    /**
     * Get <p>数据集id列表</p> 
     * @return ProgramIdList <p>数据集id列表</p>
     */
    public String [] getProgramIdList() {
        return this.ProgramIdList;
    }

    /**
     * Set <p>数据集id列表</p>
     * @param ProgramIdList <p>数据集id列表</p>
     */
    public void setProgramIdList(String [] ProgramIdList) {
        this.ProgramIdList = ProgramIdList;
    }

    /**
     * Get <p>apm业务系统id</p> 
     * @return ApmInstanceId <p>apm业务系统id</p>
     */
    public String getApmInstanceId() {
        return this.ApmInstanceId;
    }

    /**
     * Set <p>apm业务系统id</p>
     * @param ApmInstanceId <p>apm业务系统id</p>
     */
    public void setApmInstanceId(String ApmInstanceId) {
        this.ApmInstanceId = ApmInstanceId;
    }

    /**
     * Get <p>编程语言:  Java；C/C++；Python；Go；Other</p> 
     * @return ProgramLanguage <p>编程语言:  Java；C/C++；Python；Go；Other</p>
     */
    public String getProgramLanguage() {
        return this.ProgramLanguage;
    }

    /**
     * Set <p>编程语言:  Java；C/C++；Python；Go；Other</p>
     * @param ProgramLanguage <p>编程语言:  Java；C/C++；Python；Go；Other</p>
     */
    public void setProgramLanguage(String ProgramLanguage) {
        this.ProgramLanguage = ProgramLanguage;
    }

    /**
     * Get <p>开发框架-SpringCloud/Dubbo/Go-GRPC/Other</p> 
     * @return FrameworkType <p>开发框架-SpringCloud/Dubbo/Go-GRPC/Other</p>
     */
    public String getFrameworkType() {
        return this.FrameworkType;
    }

    /**
     * Set <p>开发框架-SpringCloud/Dubbo/Go-GRPC/Other</p>
     * @param FrameworkType <p>开发框架-SpringCloud/Dubbo/Go-GRPC/Other</p>
     */
    public void setFrameworkType(String FrameworkType) {
        this.FrameworkType = FrameworkType;
    }

    /**
     * Get <p>注册配置治理，关闭注册配置治理或者使用北极星注册中心时必须传值</p> 
     * @return ServiceGovernanceConfig <p>注册配置治理，关闭注册配置治理或者使用北极星注册中心时必须传值</p>
     */
    public ServiceGovernanceConfig getServiceGovernanceConfig() {
        return this.ServiceGovernanceConfig;
    }

    /**
     * Set <p>注册配置治理，关闭注册配置治理或者使用北极星注册中心时必须传值</p>
     * @param ServiceGovernanceConfig <p>注册配置治理，关闭注册配置治理或者使用北极星注册中心时必须传值</p>
     */
    public void setServiceGovernanceConfig(ServiceGovernanceConfig ServiceGovernanceConfig) {
        this.ServiceGovernanceConfig = ServiceGovernanceConfig;
    }

    /**
     * Get <p>是否创建并关联同名镜像仓库</p> 
     * @return CreateSameNameImageRepository <p>是否创建并关联同名镜像仓库</p>
     */
    public Boolean getCreateSameNameImageRepository() {
        return this.CreateSameNameImageRepository;
    }

    /**
     * Set <p>是否创建并关联同名镜像仓库</p>
     * @param CreateSameNameImageRepository <p>是否创建并关联同名镜像仓库</p>
     */
    public void setCreateSameNameImageRepository(Boolean CreateSameNameImageRepository) {
        this.CreateSameNameImageRepository = CreateSameNameImageRepository;
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
        if (source.ApmInstanceId != null) {
            this.ApmInstanceId = new String(source.ApmInstanceId);
        }
        if (source.ProgramLanguage != null) {
            this.ProgramLanguage = new String(source.ProgramLanguage);
        }
        if (source.FrameworkType != null) {
            this.FrameworkType = new String(source.FrameworkType);
        }
        if (source.ServiceGovernanceConfig != null) {
            this.ServiceGovernanceConfig = new ServiceGovernanceConfig(source.ServiceGovernanceConfig);
        }
        if (source.CreateSameNameImageRepository != null) {
            this.CreateSameNameImageRepository = new Boolean(source.CreateSameNameImageRepository);
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
        this.setParamSimple(map, prefix + "ApmInstanceId", this.ApmInstanceId);
        this.setParamSimple(map, prefix + "ProgramLanguage", this.ProgramLanguage);
        this.setParamSimple(map, prefix + "FrameworkType", this.FrameworkType);
        this.setParamObj(map, prefix + "ServiceGovernanceConfig.", this.ServiceGovernanceConfig);
        this.setParamSimple(map, prefix + "CreateSameNameImageRepository", this.CreateSameNameImageRepository);

    }
}

