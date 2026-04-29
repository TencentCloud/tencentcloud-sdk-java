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

public class DynamicInstanceForm extends AbstractModel {

    /**
    * <p>DynamicInstance名，长度限制1-64字符，只能包含小写字母</p>
    */
    @SerializedName("DynamicInstanceName")
    @Expose
    private String DynamicInstanceName;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>是否支持高可用</p>
    */
    @SerializedName("SupportHA")
    @Expose
    private Boolean SupportHA;

    /**
    * <p>自定义镜像信息</p>
    */
    @SerializedName("CustomImage")
    @Expose
    private CustomImage CustomImage;

    /**
    * <p>资源组配置</p>
    */
    @SerializedName("DynamicInstanceGroups")
    @Expose
    private DynamicInstanceGroup [] DynamicInstanceGroups;

    /**
    * <p>是否支持存储配置</p>
    */
    @SerializedName("SupportPV")
    @Expose
    private Boolean SupportPV;

    /**
    * <p>cbs存储卷列表</p>
    */
    @SerializedName("CBSVolumes")
    @Expose
    private CBSVolume [] CBSVolumes;

    /**
    * <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p>
    */
    @SerializedName("CFSVolumes")
    @Expose
    private CFSVolume [] CFSVolumes;

    /**
    * <p>cos存储卷列表</p>
    */
    @SerializedName("COSVolumes")
    @Expose
    private COSVolume [] COSVolumes;

    /**
    * <p>挂载卷列表</p>
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
    * <p>pod标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private TkeLabel [] Labels;

    /**
    * <p>Tolerations定义</p>
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("Envs")
    @Expose
    private NameValue [] Envs;

    /**
    * <p>依赖外部组件</p>
    */
    @SerializedName("DependServices")
    @Expose
    private DependService [] DependServices;

    /**
    * <p>是否开启token鉴权</p>
    */
    @SerializedName("SupportToken")
    @Expose
    private Boolean SupportToken;

    /**
    * <p>cfs trubo挂载列表，不包含标准版cfs</p>
    */
    @SerializedName("CFSTurboVolumes")
    @Expose
    private CFSTurboVolume [] CFSTurboVolumes;

    /**
     * Get <p>DynamicInstance名，长度限制1-64字符，只能包含小写字母</p> 
     * @return DynamicInstanceName <p>DynamicInstance名，长度限制1-64字符，只能包含小写字母</p>
     */
    public String getDynamicInstanceName() {
        return this.DynamicInstanceName;
    }

    /**
     * Set <p>DynamicInstance名，长度限制1-64字符，只能包含小写字母</p>
     * @param DynamicInstanceName <p>DynamicInstance名，长度限制1-64字符，只能包含小写字母</p>
     */
    public void setDynamicInstanceName(String DynamicInstanceName) {
        this.DynamicInstanceName = DynamicInstanceName;
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
     * Get <p>是否支持高可用</p> 
     * @return SupportHA <p>是否支持高可用</p>
     */
    public Boolean getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set <p>是否支持高可用</p>
     * @param SupportHA <p>是否支持高可用</p>
     */
    public void setSupportHA(Boolean SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get <p>自定义镜像信息</p> 
     * @return CustomImage <p>自定义镜像信息</p>
     */
    public CustomImage getCustomImage() {
        return this.CustomImage;
    }

    /**
     * Set <p>自定义镜像信息</p>
     * @param CustomImage <p>自定义镜像信息</p>
     */
    public void setCustomImage(CustomImage CustomImage) {
        this.CustomImage = CustomImage;
    }

    /**
     * Get <p>资源组配置</p> 
     * @return DynamicInstanceGroups <p>资源组配置</p>
     */
    public DynamicInstanceGroup [] getDynamicInstanceGroups() {
        return this.DynamicInstanceGroups;
    }

    /**
     * Set <p>资源组配置</p>
     * @param DynamicInstanceGroups <p>资源组配置</p>
     */
    public void setDynamicInstanceGroups(DynamicInstanceGroup [] DynamicInstanceGroups) {
        this.DynamicInstanceGroups = DynamicInstanceGroups;
    }

    /**
     * Get <p>是否支持存储配置</p> 
     * @return SupportPV <p>是否支持存储配置</p>
     */
    public Boolean getSupportPV() {
        return this.SupportPV;
    }

    /**
     * Set <p>是否支持存储配置</p>
     * @param SupportPV <p>是否支持存储配置</p>
     */
    public void setSupportPV(Boolean SupportPV) {
        this.SupportPV = SupportPV;
    }

    /**
     * Get <p>cbs存储卷列表</p> 
     * @return CBSVolumes <p>cbs存储卷列表</p>
     */
    public CBSVolume [] getCBSVolumes() {
        return this.CBSVolumes;
    }

    /**
     * Set <p>cbs存储卷列表</p>
     * @param CBSVolumes <p>cbs存储卷列表</p>
     */
    public void setCBSVolumes(CBSVolume [] CBSVolumes) {
        this.CBSVolumes = CBSVolumes;
    }

    /**
     * Get <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p> 
     * @return CFSVolumes <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p>
     */
    public CFSVolume [] getCFSVolumes() {
        return this.CFSVolumes;
    }

    /**
     * Set <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p>
     * @param CFSVolumes <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p>
     */
    public void setCFSVolumes(CFSVolume [] CFSVolumes) {
        this.CFSVolumes = CFSVolumes;
    }

    /**
     * Get <p>cos存储卷列表</p> 
     * @return COSVolumes <p>cos存储卷列表</p>
     */
    public COSVolume [] getCOSVolumes() {
        return this.COSVolumes;
    }

    /**
     * Set <p>cos存储卷列表</p>
     * @param COSVolumes <p>cos存储卷列表</p>
     */
    public void setCOSVolumes(COSVolume [] COSVolumes) {
        this.COSVolumes = COSVolumes;
    }

    /**
     * Get <p>挂载卷列表</p> 
     * @return VolumeMounts <p>挂载卷列表</p>
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set <p>挂载卷列表</p>
     * @param VolumeMounts <p>挂载卷列表</p>
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    /**
     * Get <p>pod标签</p> 
     * @return Labels <p>pod标签</p>
     */
    public TkeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>pod标签</p>
     * @param Labels <p>pod标签</p>
     */
    public void setLabels(TkeLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Tolerations定义</p> 
     * @return Tolerations <p>Tolerations定义</p>
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set <p>Tolerations定义</p>
     * @param Tolerations <p>Tolerations定义</p>
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get <p>环境变量</p> 
     * @return Envs <p>环境变量</p>
     */
    public NameValue [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>环境变量</p>
     * @param Envs <p>环境变量</p>
     */
    public void setEnvs(NameValue [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get <p>依赖外部组件</p> 
     * @return DependServices <p>依赖外部组件</p>
     */
    public DependService [] getDependServices() {
        return this.DependServices;
    }

    /**
     * Set <p>依赖外部组件</p>
     * @param DependServices <p>依赖外部组件</p>
     */
    public void setDependServices(DependService [] DependServices) {
        this.DependServices = DependServices;
    }

    /**
     * Get <p>是否开启token鉴权</p> 
     * @return SupportToken <p>是否开启token鉴权</p>
     */
    public Boolean getSupportToken() {
        return this.SupportToken;
    }

    /**
     * Set <p>是否开启token鉴权</p>
     * @param SupportToken <p>是否开启token鉴权</p>
     */
    public void setSupportToken(Boolean SupportToken) {
        this.SupportToken = SupportToken;
    }

    /**
     * Get <p>cfs trubo挂载列表，不包含标准版cfs</p> 
     * @return CFSTurboVolumes <p>cfs trubo挂载列表，不包含标准版cfs</p>
     */
    public CFSTurboVolume [] getCFSTurboVolumes() {
        return this.CFSTurboVolumes;
    }

    /**
     * Set <p>cfs trubo挂载列表，不包含标准版cfs</p>
     * @param CFSTurboVolumes <p>cfs trubo挂载列表，不包含标准版cfs</p>
     */
    public void setCFSTurboVolumes(CFSTurboVolume [] CFSTurboVolumes) {
        this.CFSTurboVolumes = CFSTurboVolumes;
    }

    public DynamicInstanceForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicInstanceForm(DynamicInstanceForm source) {
        if (source.DynamicInstanceName != null) {
            this.DynamicInstanceName = new String(source.DynamicInstanceName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Boolean(source.SupportHA);
        }
        if (source.CustomImage != null) {
            this.CustomImage = new CustomImage(source.CustomImage);
        }
        if (source.DynamicInstanceGroups != null) {
            this.DynamicInstanceGroups = new DynamicInstanceGroup[source.DynamicInstanceGroups.length];
            for (int i = 0; i < source.DynamicInstanceGroups.length; i++) {
                this.DynamicInstanceGroups[i] = new DynamicInstanceGroup(source.DynamicInstanceGroups[i]);
            }
        }
        if (source.SupportPV != null) {
            this.SupportPV = new Boolean(source.SupportPV);
        }
        if (source.CBSVolumes != null) {
            this.CBSVolumes = new CBSVolume[source.CBSVolumes.length];
            for (int i = 0; i < source.CBSVolumes.length; i++) {
                this.CBSVolumes[i] = new CBSVolume(source.CBSVolumes[i]);
            }
        }
        if (source.CFSVolumes != null) {
            this.CFSVolumes = new CFSVolume[source.CFSVolumes.length];
            for (int i = 0; i < source.CFSVolumes.length; i++) {
                this.CFSVolumes[i] = new CFSVolume(source.CFSVolumes[i]);
            }
        }
        if (source.COSVolumes != null) {
            this.COSVolumes = new COSVolume[source.COSVolumes.length];
            for (int i = 0; i < source.COSVolumes.length; i++) {
                this.COSVolumes[i] = new COSVolume(source.COSVolumes[i]);
            }
        }
        if (source.VolumeMounts != null) {
            this.VolumeMounts = new VolumeMount[source.VolumeMounts.length];
            for (int i = 0; i < source.VolumeMounts.length; i++) {
                this.VolumeMounts[i] = new VolumeMount(source.VolumeMounts[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new TkeLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new TkeLabel(source.Labels[i]);
            }
        }
        if (source.Tolerations != null) {
            this.Tolerations = new Toleration[source.Tolerations.length];
            for (int i = 0; i < source.Tolerations.length; i++) {
                this.Tolerations[i] = new Toleration(source.Tolerations[i]);
            }
        }
        if (source.Envs != null) {
            this.Envs = new NameValue[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new NameValue(source.Envs[i]);
            }
        }
        if (source.DependServices != null) {
            this.DependServices = new DependService[source.DependServices.length];
            for (int i = 0; i < source.DependServices.length; i++) {
                this.DependServices[i] = new DependService(source.DependServices[i]);
            }
        }
        if (source.SupportToken != null) {
            this.SupportToken = new Boolean(source.SupportToken);
        }
        if (source.CFSTurboVolumes != null) {
            this.CFSTurboVolumes = new CFSTurboVolume[source.CFSTurboVolumes.length];
            for (int i = 0; i < source.CFSTurboVolumes.length; i++) {
                this.CFSTurboVolumes[i] = new CFSTurboVolume(source.CFSTurboVolumes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DynamicInstanceName", this.DynamicInstanceName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamObj(map, prefix + "CustomImage.", this.CustomImage);
        this.setParamArrayObj(map, prefix + "DynamicInstanceGroups.", this.DynamicInstanceGroups);
        this.setParamSimple(map, prefix + "SupportPV", this.SupportPV);
        this.setParamArrayObj(map, prefix + "CBSVolumes.", this.CBSVolumes);
        this.setParamArrayObj(map, prefix + "CFSVolumes.", this.CFSVolumes);
        this.setParamArrayObj(map, prefix + "COSVolumes.", this.COSVolumes);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "DependServices.", this.DependServices);
        this.setParamSimple(map, prefix + "SupportToken", this.SupportToken);
        this.setParamArrayObj(map, prefix + "CFSTurboVolumes.", this.CFSTurboVolumes);

    }
}

