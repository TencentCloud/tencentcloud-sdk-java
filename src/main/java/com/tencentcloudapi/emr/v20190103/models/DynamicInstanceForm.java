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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DynamicInstanceName")
    @Expose
    private String DynamicInstanceName;

    /**
    * <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>是否支持高可用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportHA")
    @Expose
    private Boolean SupportHA;

    /**
    * <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomImage")
    @Expose
    private CustomImage CustomImage;

    /**
    * <p>资源组配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DynamicInstanceGroups")
    @Expose
    private DynamicInstanceGroup [] DynamicInstanceGroups;

    /**
    * <p>是否支持存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportPV")
    @Expose
    private Boolean SupportPV;

    /**
    * <p>cbs存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CBSVolumes")
    @Expose
    private CBSVolume [] CBSVolumes;

    /**
    * <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFSVolumes")
    @Expose
    private CFSVolume [] CFSVolumes;

    /**
    * <p>cos存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COSVolumes")
    @Expose
    private COSVolume [] COSVolumes;

    /**
    * <p>挂载卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeMounts")
    @Expose
    private VolumeMount [] VolumeMounts;

    /**
    * <p>pod标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private TkeLabel [] Labels;

    /**
    * <p>Tolerations定义</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tolerations")
    @Expose
    private Toleration [] Tolerations;

    /**
    * <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Envs")
    @Expose
    private NameValue [] Envs;

    /**
    * <p>依赖外部组件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependServices")
    @Expose
    private DependService [] DependServices;

    /**
    * <p>是否开启token鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportToken")
    @Expose
    private Boolean SupportToken;

    /**
    * <p>cfs trubo挂载列表，不包含标准版cfs</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFSTurboVolumes")
    @Expose
    private CFSTurboVolume [] CFSTurboVolumes;

    /**
    * <p>自定义镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfoV2")
    @Expose
    private ImageInfoV2 ImageInfoV2;

    /**
    * <p>GooseFS盘</p>
    */
    @SerializedName("GooseFSVolumes")
    @Expose
    private GooseFSVolume [] GooseFSVolumes;

    /**
     * Get <p>DynamicInstance名，长度限制1-64字符，只能包含小写字母</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DynamicInstanceName <p>DynamicInstance名，长度限制1-64字符，只能包含小写字母</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDynamicInstanceName() {
        return this.DynamicInstanceName;
    }

    /**
     * Set <p>DynamicInstance名，长度限制1-64字符，只能包含小写字母</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DynamicInstanceName <p>DynamicInstance名，长度限制1-64字符，只能包含小写字母</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDynamicInstanceName(String DynamicInstanceName) {
        this.DynamicInstanceName = DynamicInstanceName;
    }

    /**
     * Get <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>是否支持高可用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportHA <p>是否支持高可用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set <p>是否支持高可用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportHA <p>是否支持高可用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportHA(Boolean SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomImage <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomImage getCustomImage() {
        return this.CustomImage;
    }

    /**
     * Set <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomImage <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomImage(CustomImage CustomImage) {
        this.CustomImage = CustomImage;
    }

    /**
     * Get <p>资源组配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DynamicInstanceGroups <p>资源组配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DynamicInstanceGroup [] getDynamicInstanceGroups() {
        return this.DynamicInstanceGroups;
    }

    /**
     * Set <p>资源组配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DynamicInstanceGroups <p>资源组配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDynamicInstanceGroups(DynamicInstanceGroup [] DynamicInstanceGroups) {
        this.DynamicInstanceGroups = DynamicInstanceGroups;
    }

    /**
     * Get <p>是否支持存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportPV <p>是否支持存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportPV() {
        return this.SupportPV;
    }

    /**
     * Set <p>是否支持存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportPV <p>是否支持存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportPV(Boolean SupportPV) {
        this.SupportPV = SupportPV;
    }

    /**
     * Get <p>cbs存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CBSVolumes <p>cbs存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CBSVolume [] getCBSVolumes() {
        return this.CBSVolumes;
    }

    /**
     * Set <p>cbs存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CBSVolumes <p>cbs存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCBSVolumes(CBSVolume [] CBSVolumes) {
        this.CBSVolumes = CBSVolumes;
    }

    /**
     * Get <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFSVolumes <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CFSVolume [] getCFSVolumes() {
        return this.CFSVolumes;
    }

    /**
     * Set <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFSVolumes <p>cfs存储卷列表，只包含cfs，不包含cfs turbo</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFSVolumes(CFSVolume [] CFSVolumes) {
        this.CFSVolumes = CFSVolumes;
    }

    /**
     * Get <p>cos存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return COSVolumes <p>cos存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public COSVolume [] getCOSVolumes() {
        return this.COSVolumes;
    }

    /**
     * Set <p>cos存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param COSVolumes <p>cos存储卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOSVolumes(COSVolume [] COSVolumes) {
        this.COSVolumes = COSVolumes;
    }

    /**
     * Get <p>挂载卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeMounts <p>挂载卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeMount [] getVolumeMounts() {
        return this.VolumeMounts;
    }

    /**
     * Set <p>挂载卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeMounts <p>挂载卷列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeMounts(VolumeMount [] VolumeMounts) {
        this.VolumeMounts = VolumeMounts;
    }

    /**
     * Get <p>pod标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels <p>pod标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TkeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>pod标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels <p>pod标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(TkeLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Tolerations定义</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tolerations <p>Tolerations定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Toleration [] getTolerations() {
        return this.Tolerations;
    }

    /**
     * Set <p>Tolerations定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tolerations <p>Tolerations定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTolerations(Toleration [] Tolerations) {
        this.Tolerations = Tolerations;
    }

    /**
     * Get <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Envs <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NameValue [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Envs <p>环境变量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvs(NameValue [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get <p>依赖外部组件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependServices <p>依赖外部组件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependService [] getDependServices() {
        return this.DependServices;
    }

    /**
     * Set <p>依赖外部组件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependServices <p>依赖外部组件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependServices(DependService [] DependServices) {
        this.DependServices = DependServices;
    }

    /**
     * Get <p>是否开启token鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportToken <p>是否开启token鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportToken() {
        return this.SupportToken;
    }

    /**
     * Set <p>是否开启token鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportToken <p>是否开启token鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportToken(Boolean SupportToken) {
        this.SupportToken = SupportToken;
    }

    /**
     * Get <p>cfs trubo挂载列表，不包含标准版cfs</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFSTurboVolumes <p>cfs trubo挂载列表，不包含标准版cfs</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CFSTurboVolume [] getCFSTurboVolumes() {
        return this.CFSTurboVolumes;
    }

    /**
     * Set <p>cfs trubo挂载列表，不包含标准版cfs</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFSTurboVolumes <p>cfs trubo挂载列表，不包含标准版cfs</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFSTurboVolumes(CFSTurboVolume [] CFSTurboVolumes) {
        this.CFSTurboVolumes = CFSTurboVolumes;
    }

    /**
     * Get <p>自定义镜像</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageInfoV2 <p>自定义镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfoV2 getImageInfoV2() {
        return this.ImageInfoV2;
    }

    /**
     * Set <p>自定义镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageInfoV2 <p>自定义镜像</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageInfoV2(ImageInfoV2 ImageInfoV2) {
        this.ImageInfoV2 = ImageInfoV2;
    }

    /**
     * Get <p>GooseFS盘</p> 
     * @return GooseFSVolumes <p>GooseFS盘</p>
     */
    public GooseFSVolume [] getGooseFSVolumes() {
        return this.GooseFSVolumes;
    }

    /**
     * Set <p>GooseFS盘</p>
     * @param GooseFSVolumes <p>GooseFS盘</p>
     */
    public void setGooseFSVolumes(GooseFSVolume [] GooseFSVolumes) {
        this.GooseFSVolumes = GooseFSVolumes;
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
        if (source.ImageInfoV2 != null) {
            this.ImageInfoV2 = new ImageInfoV2(source.ImageInfoV2);
        }
        if (source.GooseFSVolumes != null) {
            this.GooseFSVolumes = new GooseFSVolume[source.GooseFSVolumes.length];
            for (int i = 0; i < source.GooseFSVolumes.length; i++) {
                this.GooseFSVolumes[i] = new GooseFSVolume(source.GooseFSVolumes[i]);
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
        this.setParamObj(map, prefix + "ImageInfoV2.", this.ImageInfoV2);
        this.setParamArrayObj(map, prefix + "GooseFSVolumes.", this.GooseFSVolumes);

    }
}

