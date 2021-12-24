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

public class DescribeApplicationVisualizationResponse extends AbstractModel{

    /**
    * 基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicInfo")
    @Expose
    private ApplicationBasicInfo BasicInfo;

    /**
    * 基本配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicConfig")
    @Expose
    private ApplicationBasicConfig BasicConfig;

    /**
    * 卷配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Volumes")
    @Expose
    private Volume [] Volumes;

    /**
    * 初始化容器配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitContainers")
    @Expose
    private Container [] InitContainers;

    /**
    * 容器配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Containers")
    @Expose
    private Container [] Containers;

    /**
    * 服务配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private Service Service;

    /**
    * Job配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Job")
    @Expose
    private Job Job;

    /**
    * CronJob配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronJob")
    @Expose
    private CronJob CronJob;

    /**
    * 重启策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
    * HPA
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HorizontalPodAutoscaler")
    @Expose
    private HorizontalPodAutoscaler HorizontalPodAutoscaler;

    /**
    * 镜像拉取Secret
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImagePullSecrets")
    @Expose
    private String [] ImagePullSecrets;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicInfo 基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplicationBasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set 基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicInfo 基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicInfo(ApplicationBasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get 基本配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicConfig 基本配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplicationBasicConfig getBasicConfig() {
        return this.BasicConfig;
    }

    /**
     * Set 基本配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicConfig 基本配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicConfig(ApplicationBasicConfig BasicConfig) {
        this.BasicConfig = BasicConfig;
    }

    /**
     * Get 卷配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Volumes 卷配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Volume [] getVolumes() {
        return this.Volumes;
    }

    /**
     * Set 卷配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Volumes 卷配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumes(Volume [] Volumes) {
        this.Volumes = Volumes;
    }

    /**
     * Get 初始化容器配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitContainers 初始化容器配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Container [] getInitContainers() {
        return this.InitContainers;
    }

    /**
     * Set 初始化容器配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitContainers 初始化容器配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitContainers(Container [] InitContainers) {
        this.InitContainers = InitContainers;
    }

    /**
     * Get 容器配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Containers 容器配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Container [] getContainers() {
        return this.Containers;
    }

    /**
     * Set 容器配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Containers 容器配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainers(Container [] Containers) {
        this.Containers = Containers;
    }

    /**
     * Get 服务配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service 服务配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Service getService() {
        return this.Service;
    }

    /**
     * Set 服务配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service 服务配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(Service Service) {
        this.Service = Service;
    }

    /**
     * Get Job配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Job Job配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Job getJob() {
        return this.Job;
    }

    /**
     * Set Job配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Job Job配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJob(Job Job) {
        this.Job = Job;
    }

    /**
     * Get CronJob配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronJob CronJob配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CronJob getCronJob() {
        return this.CronJob;
    }

    /**
     * Set CronJob配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronJob CronJob配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronJob(CronJob CronJob) {
        this.CronJob = CronJob;
    }

    /**
     * Get 重启策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartPolicy 重启策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * Set 重启策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartPolicy 重启策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * Get HPA
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HorizontalPodAutoscaler HPA
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HorizontalPodAutoscaler getHorizontalPodAutoscaler() {
        return this.HorizontalPodAutoscaler;
    }

    /**
     * Set HPA
注意：此字段可能返回 null，表示取不到有效值。
     * @param HorizontalPodAutoscaler HPA
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHorizontalPodAutoscaler(HorizontalPodAutoscaler HorizontalPodAutoscaler) {
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
    }

    /**
     * Get 镜像拉取Secret
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImagePullSecrets 镜像拉取Secret
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getImagePullSecrets() {
        return this.ImagePullSecrets;
    }

    /**
     * Set 镜像拉取Secret
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImagePullSecrets 镜像拉取Secret
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImagePullSecrets(String [] ImagePullSecrets) {
        this.ImagePullSecrets = ImagePullSecrets;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeApplicationVisualizationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationVisualizationResponse(DescribeApplicationVisualizationResponse source) {
        if (source.BasicInfo != null) {
            this.BasicInfo = new ApplicationBasicInfo(source.BasicInfo);
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
        if (source.HorizontalPodAutoscaler != null) {
            this.HorizontalPodAutoscaler = new HorizontalPodAutoscaler(source.HorizontalPodAutoscaler);
        }
        if (source.ImagePullSecrets != null) {
            this.ImagePullSecrets = new String[source.ImagePullSecrets.length];
            for (int i = 0; i < source.ImagePullSecrets.length; i++) {
                this.ImagePullSecrets[i] = new String(source.ImagePullSecrets[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BasicInfo.", this.BasicInfo);
        this.setParamObj(map, prefix + "BasicConfig.", this.BasicConfig);
        this.setParamArrayObj(map, prefix + "Volumes.", this.Volumes);
        this.setParamArrayObj(map, prefix + "InitContainers.", this.InitContainers);
        this.setParamArrayObj(map, prefix + "Containers.", this.Containers);
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamObj(map, prefix + "Job.", this.Job);
        this.setParamObj(map, prefix + "CronJob.", this.CronJob);
        this.setParamSimple(map, prefix + "RestartPolicy", this.RestartPolicy);
        this.setParamObj(map, prefix + "HorizontalPodAutoscaler.", this.HorizontalPodAutoscaler);
        this.setParamArraySimple(map, prefix + "ImagePullSecrets.", this.ImagePullSecrets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

