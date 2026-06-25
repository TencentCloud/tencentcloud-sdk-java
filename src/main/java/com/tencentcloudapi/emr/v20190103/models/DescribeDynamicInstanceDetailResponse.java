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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDynamicInstanceDetailResponse extends AbstractModel {

    /**
    * <p>ray集群名</p>
    */
    @SerializedName("RayClusterName")
    @Expose
    private String RayClusterName;

    /**
    * <p>ray集群ID</p>
    */
    @SerializedName("RayClusterId")
    @Expose
    private Long RayClusterId;

    /**
    * <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul>
    */
    @SerializedName("SubmitType")
    @Expose
    private Long SubmitType;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>labels</p>
    */
    @SerializedName("Labels")
    @Expose
    private NameValue [] Labels;

    /**
    * <p>Tolerations</p>
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("Env")
    @Expose
    private NameValue [] Env;

    /**
    * <p>是否依赖 Kerberos 外部组件</p>
    */
    @SerializedName("SupportExternalKerberosService")
    @Expose
    private Boolean SupportExternalKerberosService;

    /**
    * <p>依赖的Kerberos集群</p>
    */
    @SerializedName("KerberosCluster")
    @Expose
    private String KerberosCluster;

    /**
    * <p>token</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>HeadGroup</p>
    */
    @SerializedName("HeadGroupSpec")
    @Expose
    private DynamicInstanceGroupSpec HeadGroupSpec;

    /**
    * <p>WorkerGroup</p>
    */
    @SerializedName("WorkerGroupSpecs")
    @Expose
    private DynamicInstanceGroupSpec [] WorkerGroupSpecs;

    /**
    * <p>是否开启存储配置</p>
    */
    @SerializedName("StorageConfigEnabled")
    @Expose
    private Boolean StorageConfigEnabled;

    /**
    * <p>Redis 实例信息</p>
    */
    @SerializedName("RedisInstance")
    @Expose
    private RedisInstance RedisInstance;

    /**
    * <p>镜像信息</p>
    */
    @SerializedName("CustomImage")
    @Expose
    private CustomImage CustomImage;

    /**
    * <p>dashboard链接</p>
    */
    @SerializedName("DashboardUrl")
    @Expose
    private String DashboardUrl;

    /**
    * <p>pod 总数</p>
    */
    @SerializedName("TotalPodCount")
    @Expose
    private Long TotalPodCount;

    /**
    * <p>是否高可用</p>
    */
    @SerializedName("HighAvailability")
    @Expose
    private Boolean HighAvailability;

    /**
    * <p>存储信息</p>
    */
    @SerializedName("PersistentVolume")
    @Expose
    private PersistentVolume PersistentVolume;

    /**
    * <p>rayClusterYamlJson</p>
    */
    @SerializedName("RayClusterYaml")
    @Expose
    private String RayClusterYaml;

    /**
    * <p>镜像信息</p>
    */
    @SerializedName("ImageInfoV2")
    @Expose
    private ImageInfoV2 ImageInfoV2;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>ray集群名</p> 
     * @return RayClusterName <p>ray集群名</p>
     */
    public String getRayClusterName() {
        return this.RayClusterName;
    }

    /**
     * Set <p>ray集群名</p>
     * @param RayClusterName <p>ray集群名</p>
     */
    public void setRayClusterName(String RayClusterName) {
        this.RayClusterName = RayClusterName;
    }

    /**
     * Get <p>ray集群ID</p> 
     * @return RayClusterId <p>ray集群ID</p>
     */
    public Long getRayClusterId() {
        return this.RayClusterId;
    }

    /**
     * Set <p>ray集群ID</p>
     * @param RayClusterId <p>ray集群ID</p>
     */
    public void setRayClusterId(Long RayClusterId) {
        this.RayClusterId = RayClusterId;
    }

    /**
     * Get <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul> 
     * @return SubmitType <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul>
     */
    public Long getSubmitType() {
        return this.SubmitType;
    }

    /**
     * Set <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul>
     * @param SubmitType <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul>
     */
    public void setSubmitType(Long SubmitType) {
        this.SubmitType = SubmitType;
    }

    /**
     * Get <p>命名空间</p> 
     * @return Namespace <p>命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
     * @param Namespace <p>命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
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
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>labels</p> 
     * @return Labels <p>labels</p>
     */
    public NameValue [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>labels</p>
     * @param Labels <p>labels</p>
     */
    public void setLabels(NameValue [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Tolerations</p> 
     * @return Tolerations <p>Tolerations</p>
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set <p>Tolerations</p>
     * @param Tolerations <p>Tolerations</p>
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get <p>环境变量</p> 
     * @return Env <p>环境变量</p>
     */
    public NameValue [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境变量</p>
     * @param Env <p>环境变量</p>
     */
    public void setEnv(NameValue [] Env) {
        this.Env = Env;
    }

    /**
     * Get <p>是否依赖 Kerberos 外部组件</p> 
     * @return SupportExternalKerberosService <p>是否依赖 Kerberos 外部组件</p>
     */
    public Boolean getSupportExternalKerberosService() {
        return this.SupportExternalKerberosService;
    }

    /**
     * Set <p>是否依赖 Kerberos 外部组件</p>
     * @param SupportExternalKerberosService <p>是否依赖 Kerberos 外部组件</p>
     */
    public void setSupportExternalKerberosService(Boolean SupportExternalKerberosService) {
        this.SupportExternalKerberosService = SupportExternalKerberosService;
    }

    /**
     * Get <p>依赖的Kerberos集群</p> 
     * @return KerberosCluster <p>依赖的Kerberos集群</p>
     */
    public String getKerberosCluster() {
        return this.KerberosCluster;
    }

    /**
     * Set <p>依赖的Kerberos集群</p>
     * @param KerberosCluster <p>依赖的Kerberos集群</p>
     */
    public void setKerberosCluster(String KerberosCluster) {
        this.KerberosCluster = KerberosCluster;
    }

    /**
     * Get <p>token</p> 
     * @return Token <p>token</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>token</p>
     * @param Token <p>token</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>HeadGroup</p> 
     * @return HeadGroupSpec <p>HeadGroup</p>
     */
    public DynamicInstanceGroupSpec getHeadGroupSpec() {
        return this.HeadGroupSpec;
    }

    /**
     * Set <p>HeadGroup</p>
     * @param HeadGroupSpec <p>HeadGroup</p>
     */
    public void setHeadGroupSpec(DynamicInstanceGroupSpec HeadGroupSpec) {
        this.HeadGroupSpec = HeadGroupSpec;
    }

    /**
     * Get <p>WorkerGroup</p> 
     * @return WorkerGroupSpecs <p>WorkerGroup</p>
     */
    public DynamicInstanceGroupSpec [] getWorkerGroupSpecs() {
        return this.WorkerGroupSpecs;
    }

    /**
     * Set <p>WorkerGroup</p>
     * @param WorkerGroupSpecs <p>WorkerGroup</p>
     */
    public void setWorkerGroupSpecs(DynamicInstanceGroupSpec [] WorkerGroupSpecs) {
        this.WorkerGroupSpecs = WorkerGroupSpecs;
    }

    /**
     * Get <p>是否开启存储配置</p> 
     * @return StorageConfigEnabled <p>是否开启存储配置</p>
     */
    public Boolean getStorageConfigEnabled() {
        return this.StorageConfigEnabled;
    }

    /**
     * Set <p>是否开启存储配置</p>
     * @param StorageConfigEnabled <p>是否开启存储配置</p>
     */
    public void setStorageConfigEnabled(Boolean StorageConfigEnabled) {
        this.StorageConfigEnabled = StorageConfigEnabled;
    }

    /**
     * Get <p>Redis 实例信息</p> 
     * @return RedisInstance <p>Redis 实例信息</p>
     */
    public RedisInstance getRedisInstance() {
        return this.RedisInstance;
    }

    /**
     * Set <p>Redis 实例信息</p>
     * @param RedisInstance <p>Redis 实例信息</p>
     */
    public void setRedisInstance(RedisInstance RedisInstance) {
        this.RedisInstance = RedisInstance;
    }

    /**
     * Get <p>镜像信息</p> 
     * @return CustomImage <p>镜像信息</p>
     */
    public CustomImage getCustomImage() {
        return this.CustomImage;
    }

    /**
     * Set <p>镜像信息</p>
     * @param CustomImage <p>镜像信息</p>
     */
    public void setCustomImage(CustomImage CustomImage) {
        this.CustomImage = CustomImage;
    }

    /**
     * Get <p>dashboard链接</p> 
     * @return DashboardUrl <p>dashboard链接</p>
     */
    public String getDashboardUrl() {
        return this.DashboardUrl;
    }

    /**
     * Set <p>dashboard链接</p>
     * @param DashboardUrl <p>dashboard链接</p>
     */
    public void setDashboardUrl(String DashboardUrl) {
        this.DashboardUrl = DashboardUrl;
    }

    /**
     * Get <p>pod 总数</p> 
     * @return TotalPodCount <p>pod 总数</p>
     */
    public Long getTotalPodCount() {
        return this.TotalPodCount;
    }

    /**
     * Set <p>pod 总数</p>
     * @param TotalPodCount <p>pod 总数</p>
     */
    public void setTotalPodCount(Long TotalPodCount) {
        this.TotalPodCount = TotalPodCount;
    }

    /**
     * Get <p>是否高可用</p> 
     * @return HighAvailability <p>是否高可用</p>
     */
    public Boolean getHighAvailability() {
        return this.HighAvailability;
    }

    /**
     * Set <p>是否高可用</p>
     * @param HighAvailability <p>是否高可用</p>
     */
    public void setHighAvailability(Boolean HighAvailability) {
        this.HighAvailability = HighAvailability;
    }

    /**
     * Get <p>存储信息</p> 
     * @return PersistentVolume <p>存储信息</p>
     */
    public PersistentVolume getPersistentVolume() {
        return this.PersistentVolume;
    }

    /**
     * Set <p>存储信息</p>
     * @param PersistentVolume <p>存储信息</p>
     */
    public void setPersistentVolume(PersistentVolume PersistentVolume) {
        this.PersistentVolume = PersistentVolume;
    }

    /**
     * Get <p>rayClusterYamlJson</p> 
     * @return RayClusterYaml <p>rayClusterYamlJson</p>
     */
    public String getRayClusterYaml() {
        return this.RayClusterYaml;
    }

    /**
     * Set <p>rayClusterYamlJson</p>
     * @param RayClusterYaml <p>rayClusterYamlJson</p>
     */
    public void setRayClusterYaml(String RayClusterYaml) {
        this.RayClusterYaml = RayClusterYaml;
    }

    /**
     * Get <p>镜像信息</p> 
     * @return ImageInfoV2 <p>镜像信息</p>
     */
    public ImageInfoV2 getImageInfoV2() {
        return this.ImageInfoV2;
    }

    /**
     * Set <p>镜像信息</p>
     * @param ImageInfoV2 <p>镜像信息</p>
     */
    public void setImageInfoV2(ImageInfoV2 ImageInfoV2) {
        this.ImageInfoV2 = ImageInfoV2;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDynamicInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDynamicInstanceDetailResponse(DescribeDynamicInstanceDetailResponse source) {
        if (source.RayClusterName != null) {
            this.RayClusterName = new String(source.RayClusterName);
        }
        if (source.RayClusterId != null) {
            this.RayClusterId = new Long(source.RayClusterId);
        }
        if (source.SubmitType != null) {
            this.SubmitType = new Long(source.SubmitType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Labels != null) {
            this.Labels = new NameValue[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new NameValue(source.Labels[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new Toleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new Toleration(source.Tolerations[i]);
            }
        }
        if (source.Env != null) {
            this.Env = new NameValue[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new NameValue(source.Env[i]);
            }
        }
        if (source.SupportExternalKerberosService != null) {
            this.SupportExternalKerberosService = new Boolean(source.SupportExternalKerberosService);
        }
        if (source.KerberosCluster != null) {
            this.KerberosCluster = new String(source.KerberosCluster);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.HeadGroupSpec != null) {
            this.HeadGroupSpec = new DynamicInstanceGroupSpec(source.HeadGroupSpec);
        }
        if (source.WorkerGroupSpecs != null) {
            this.WorkerGroupSpecs = new DynamicInstanceGroupSpec[source.WorkerGroupSpecs.length];
            for (int i = 0; i < source.WorkerGroupSpecs.length; i++) {
                this.WorkerGroupSpecs[i] = new DynamicInstanceGroupSpec(source.WorkerGroupSpecs[i]);
            }
        }
        if (source.StorageConfigEnabled != null) {
            this.StorageConfigEnabled = new Boolean(source.StorageConfigEnabled);
        }
        if (source.RedisInstance != null) {
            this.RedisInstance = new RedisInstance(source.RedisInstance);
        }
        if (source.CustomImage != null) {
            this.CustomImage = new CustomImage(source.CustomImage);
        }
        if (source.DashboardUrl != null) {
            this.DashboardUrl = new String(source.DashboardUrl);
        }
        if (source.TotalPodCount != null) {
            this.TotalPodCount = new Long(source.TotalPodCount);
        }
        if (source.HighAvailability != null) {
            this.HighAvailability = new Boolean(source.HighAvailability);
        }
        if (source.PersistentVolume != null) {
            this.PersistentVolume = new PersistentVolume(source.PersistentVolume);
        }
        if (source.RayClusterYaml != null) {
            this.RayClusterYaml = new String(source.RayClusterYaml);
        }
        if (source.ImageInfoV2 != null) {
            this.ImageInfoV2 = new ImageInfoV2(source.ImageInfoV2);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RayClusterName", this.RayClusterName);
        this.setParamSimple(map, prefix + "RayClusterId", this.RayClusterId);
        this.setParamSimple(map, prefix + "SubmitType", this.SubmitType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamArrayObj(map, prefix + "Env.", this.Env);
        this.setParamSimple(map, prefix + "SupportExternalKerberosService", this.SupportExternalKerberosService);
        this.setParamSimple(map, prefix + "KerberosCluster", this.KerberosCluster);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamObj(map, prefix + "HeadGroupSpec.", this.HeadGroupSpec);
        this.setParamArrayObj(map, prefix + "WorkerGroupSpecs.", this.WorkerGroupSpecs);
        this.setParamSimple(map, prefix + "StorageConfigEnabled", this.StorageConfigEnabled);
        this.setParamObj(map, prefix + "RedisInstance.", this.RedisInstance);
        this.setParamObj(map, prefix + "CustomImage.", this.CustomImage);
        this.setParamSimple(map, prefix + "DashboardUrl", this.DashboardUrl);
        this.setParamSimple(map, prefix + "TotalPodCount", this.TotalPodCount);
        this.setParamSimple(map, prefix + "HighAvailability", this.HighAvailability);
        this.setParamObj(map, prefix + "PersistentVolume.", this.PersistentVolume);
        this.setParamSimple(map, prefix + "RayClusterYaml", this.RayClusterYaml);
        this.setParamObj(map, prefix + "ImageInfoV2.", this.ImageInfoV2);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

