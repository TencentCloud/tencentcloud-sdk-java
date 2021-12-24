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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEdgeUnitApplicationVisualizationRequest extends AbstractModel{

    /**
    * 单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * 应用配置
    */
    @SerializedName("BasicConfig")
    @Expose
    private ApplicationBasicConfig BasicConfig;

    /**
    * 卷配置
    */
    @SerializedName("Volumes")
    @Expose
    private Volume [] Volumes;

    /**
    * 初始容器列表
    */
    @SerializedName("InitContainers")
    @Expose
    private Container [] InitContainers;

    /**
    * 容器配置
    */
    @SerializedName("Containers")
    @Expose
    private Container [] Containers;

    /**
    * 服务配置
    */
    @SerializedName("Service")
    @Expose
    private Service Service;

    /**
    * Job配置
    */
    @SerializedName("Job")
    @Expose
    private Job Job;

    /**
    * CronJob配置
    */
    @SerializedName("CronJob")
    @Expose
    private CronJob CronJob;

    /**
    * 重启策略
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
    * 镜像拉取密钥
    */
    @SerializedName("ImagePullSecrets")
    @Expose
    private String [] ImagePullSecrets;

    /**
    * HPA配置
    */
    @SerializedName("HorizontalPodAutoscaler")
    @Expose
    private HorizontalPodAutoscaler HorizontalPodAutoscaler;

    /**
     * Get 单元ID 
     * @return EdgeUnitId 单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set 单元ID
     * @param EdgeUnitId 单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用配置 
     * @return BasicConfig 应用配置
     */
    public ApplicationBasicConfig getBasicConfig() {
        return this.BasicConfig;
    }

    /**
     * Set 应用配置
     * @param BasicConfig 应用配置
     */
    public void setBasicConfig(ApplicationBasicConfig BasicConfig) {
        this.BasicConfig = BasicConfig;
    }

    /**
     * Get 卷配置 
     * @return Volumes 卷配置
     */
    public Volume [] getVolumes() {
        return this.Volumes;
    }

    /**
     * Set 卷配置
     * @param Volumes 卷配置
     */
    public void setVolumes(Volume [] Volumes) {
        this.Volumes = Volumes;
    }

    /**
     * Get 初始容器列表 
     * @return InitContainers 初始容器列表
     */
    public Container [] getInitContainers() {
        return this.InitContainers;
    }

    /**
     * Set 初始容器列表
     * @param InitContainers 初始容器列表
     */
    public void setInitContainers(Container [] InitContainers) {
        this.InitContainers = InitContainers;
    }

    /**
     * Get 容器配置 
     * @return Containers 容器配置
     */
    public Container [] getContainers() {
        return this.Containers;
    }

    /**
     * Set 容器配置
     * @param Containers 容器配置
     */
    public void setContainers(Container [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get 服务配置 
     * @return Service 服务配置
     */
    public Service getService() {
        return this.Service;
    }

    /**
     * Set 服务配置
     * @param Service 服务配置
     */
    public void setService(Service Service) {
        this.Service = Service;
    }

    /**
     * Get Job配置 
     * @return Job Job配置
     */
    public Job getJob() {
        return this.Job;
    }

    /**
     * Set Job配置
     * @param Job Job配置
     */
    public void setJob(Job Job) {
        this.Job = Job;
    }

    /**
     * Get CronJob配置 
     * @return CronJob CronJob配置
     */
    public CronJob getCronJob() {
        return this.CronJob;
    }

    /**
     * Set CronJob配置
     * @param CronJob CronJob配置
     */
    public void setCronJob(CronJob CronJob) {
        this.CronJob = CronJob;
    }

    /**
     * Get 重启策略 
     * @return RestartPolicy 重启策略
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * Set 重启策略
     * @param RestartPolicy 重启策略
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * Get 镜像拉取密钥 
     * @return ImagePullSecrets 镜像拉取密钥
     */
    public String [] getImagePullSecrets() {
        return this.ImagePullSecrets;
    }

    /**
     * Set 镜像拉取密钥
     * @param ImagePullSecrets 镜像拉取密钥
     */
    public void setImagePullSecrets(String [] ImagePullSecrets) {
        this.ImagePullSecrets = ImagePullSecrets;
    }

    /**
     * Get HPA配置 
     * @return HorizontalPodAutoscaler HPA配置
     */
    public HorizontalPodAutoscaler getHorizontalPodAutoscaler() {
        return this.HorizontalPodAutoscaler;
    }

    /**
     * Set HPA配置
     * @param HorizontalPodAutoscaler HPA配置
     */
    public void setHorizontalPodAutoscaler(HorizontalPodAutoscaler HorizontalPodAutoscaler) {
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
    }

    public ModifyEdgeUnitApplicationVisualizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdgeUnitApplicationVisualizationRequest(ModifyEdgeUnitApplicationVisualizationRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long(source.ApplicationId);
        }
        if (source.BasicConfig != null) {
            this.BasicConfig = new ApplicationBasicConfig(source.BasicConfig);
        }
        if (source.Volumes != null) {
            this.Volumes = new Volume[source.Volumes.length];
            for (int i = 0; i < source.Volumes.length; i++) {
                this.Volumes[i] = new Volume(source.Volumes[i]);
            }
        }
        if (source.InitContainers != null) {
            this.InitContainers = new Container[source.InitContainers.length];
            for (int i = 0; i < source.InitContainers.length; i++) {
                this.InitContainers[i] = new Container(source.InitContainers[i]);
            }
        }
        if (source.Containers != null) {
            this.Containers = new Container[source.Containers.length];
            for (int i = 0; i < source.Containers.length; i++) {
                this.Containers[i] = new Container(source.Containers[i]);
            }
        }
        if (source.Service != null) {
            this.Service = new Service(source.Service);
        }
        if (source.Job != null) {
            this.Job = new Job(source.Job);
        }
        if (source.CronJob != null) {
            this.CronJob = new CronJob(source.CronJob);
        }
        if (source.RestartPolicy != null) {
            this.RestartPolicy = new String(source.RestartPolicy);
        }
        if (source.ImagePullSecrets != null) {
            this.ImagePullSecrets = new String[source.ImagePullSecrets.length];
            for (int i = 0; i < source.ImagePullSecrets.length; i++) {
                this.ImagePullSecrets[i] = new String(source.ImagePullSecrets[i]);
            }
        }
        if (source.HorizontalPodAutoscaler != null) {
            this.HorizontalPodAutoscaler = new HorizontalPodAutoscaler(source.HorizontalPodAutoscaler);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamObj(map, prefix + "BasicConfig.", this.BasicConfig);
        this.setParamArrayObj(map, prefix + "Volumes.", this.Volumes);
        this.setParamArrayObj(map, prefix + "InitContainers.", this.InitContainers);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamObj(map, prefix + "Job.", this.Job);
        this.setParamObj(map, prefix + "CronJob.", this.CronJob);
        this.setParamSimple(map, prefix + "RestartPolicy", this.RestartPolicy);
        this.setParamArraySimple(map, prefix + "ImagePullSecrets.", this.ImagePullSecrets);
        this.setParamObj(map, prefix + "HorizontalPodAutoscaler.", this.HorizontalPodAutoscaler);

    }
}

