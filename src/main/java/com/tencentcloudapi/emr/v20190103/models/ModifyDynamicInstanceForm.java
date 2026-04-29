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

public class ModifyDynamicInstanceForm extends AbstractModel {

    /**
    * <p>更新作用域：<br>1：添加workerGroup（DynamicInstance级别）<br>2：更新存储配置（DynamicInstance级别）<br>3：更新标签配置（DynamicInstance级别）<br>4：更新高级配置（DynamicInstance级别）<br>5：更新PodCpu、PodMem（DynamicInstance-group级别）<br>6：更新PodNum、MinPodNum、MaxPodNum（DynamicInstance-group级别）<br>7：更新存储配置（DynamicInstance-group级别）<br>8：更新标签配置（DynamicInstance-group级别）</p>
    */
    @SerializedName("ModifyScope")
    @Expose
    private Long ModifyScope;

    /**
    * <p>添加的workerGroup信息</p>
    */
    @SerializedName("AddDynamicInstanceGroup")
    @Expose
    private DynamicInstanceGroup AddDynamicInstanceGroup;

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
    * <p>cfs存储卷列表，不包含cfs turbo列表</p>
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
    * <p>是否生成新token鉴权</p>
    */
    @SerializedName("SupportNewToken")
    @Expose
    private Boolean SupportNewToken;

    /**
    * <p>DynamicInstance-group级别的更新信息</p>
    */
    @SerializedName("ModifyDynamicInstanceGroup")
    @Expose
    private DynamicInstanceGroup ModifyDynamicInstanceGroup;

    /**
    * <p>cfs turbo挂载列表，不包含标准版</p>
    */
    @SerializedName("CFSTurboVolumes")
    @Expose
    private CFSTurboVolume [] CFSTurboVolumes;

    /**
     * Get <p>更新作用域：<br>1：添加workerGroup（DynamicInstance级别）<br>2：更新存储配置（DynamicInstance级别）<br>3：更新标签配置（DynamicInstance级别）<br>4：更新高级配置（DynamicInstance级别）<br>5：更新PodCpu、PodMem（DynamicInstance-group级别）<br>6：更新PodNum、MinPodNum、MaxPodNum（DynamicInstance-group级别）<br>7：更新存储配置（DynamicInstance-group级别）<br>8：更新标签配置（DynamicInstance-group级别）</p> 
     * @return ModifyScope <p>更新作用域：<br>1：添加workerGroup（DynamicInstance级别）<br>2：更新存储配置（DynamicInstance级别）<br>3：更新标签配置（DynamicInstance级别）<br>4：更新高级配置（DynamicInstance级别）<br>5：更新PodCpu、PodMem（DynamicInstance-group级别）<br>6：更新PodNum、MinPodNum、MaxPodNum（DynamicInstance-group级别）<br>7：更新存储配置（DynamicInstance-group级别）<br>8：更新标签配置（DynamicInstance-group级别）</p>
     */
    public Long getModifyScope() {
        return this.ModifyScope;
    }

    /**
     * Set <p>更新作用域：<br>1：添加workerGroup（DynamicInstance级别）<br>2：更新存储配置（DynamicInstance级别）<br>3：更新标签配置（DynamicInstance级别）<br>4：更新高级配置（DynamicInstance级别）<br>5：更新PodCpu、PodMem（DynamicInstance-group级别）<br>6：更新PodNum、MinPodNum、MaxPodNum（DynamicInstance-group级别）<br>7：更新存储配置（DynamicInstance-group级别）<br>8：更新标签配置（DynamicInstance-group级别）</p>
     * @param ModifyScope <p>更新作用域：<br>1：添加workerGroup（DynamicInstance级别）<br>2：更新存储配置（DynamicInstance级别）<br>3：更新标签配置（DynamicInstance级别）<br>4：更新高级配置（DynamicInstance级别）<br>5：更新PodCpu、PodMem（DynamicInstance-group级别）<br>6：更新PodNum、MinPodNum、MaxPodNum（DynamicInstance-group级别）<br>7：更新存储配置（DynamicInstance-group级别）<br>8：更新标签配置（DynamicInstance-group级别）</p>
     */
    public void setModifyScope(Long ModifyScope) {
        this.ModifyScope = ModifyScope;
    }

    /**
     * Get <p>添加的workerGroup信息</p> 
     * @return AddDynamicInstanceGroup <p>添加的workerGroup信息</p>
     */
    public DynamicInstanceGroup getAddDynamicInstanceGroup() {
        return this.AddDynamicInstanceGroup;
    }

    /**
     * Set <p>添加的workerGroup信息</p>
     * @param AddDynamicInstanceGroup <p>添加的workerGroup信息</p>
     */
    public void setAddDynamicInstanceGroup(DynamicInstanceGroup AddDynamicInstanceGroup) {
        this.AddDynamicInstanceGroup = AddDynamicInstanceGroup;
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
     * Get <p>cfs存储卷列表，不包含cfs turbo列表</p> 
     * @return CFSVolumes <p>cfs存储卷列表，不包含cfs turbo列表</p>
     */
    public CFSVolume [] getCFSVolumes() {
        return this.CFSVolumes;
    }

    /**
     * Set <p>cfs存储卷列表，不包含cfs turbo列表</p>
     * @param CFSVolumes <p>cfs存储卷列表，不包含cfs turbo列表</p>
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
     * Get <p>是否生成新token鉴权</p> 
     * @return SupportNewToken <p>是否生成新token鉴权</p>
     */
    public Boolean getSupportNewToken() {
        return this.SupportNewToken;
    }

    /**
     * Set <p>是否生成新token鉴权</p>
     * @param SupportNewToken <p>是否生成新token鉴权</p>
     */
    public void setSupportNewToken(Boolean SupportNewToken) {
        this.SupportNewToken = SupportNewToken;
    }

    /**
     * Get <p>DynamicInstance-group级别的更新信息</p> 
     * @return ModifyDynamicInstanceGroup <p>DynamicInstance-group级别的更新信息</p>
     */
    public DynamicInstanceGroup getModifyDynamicInstanceGroup() {
        return this.ModifyDynamicInstanceGroup;
    }

    /**
     * Set <p>DynamicInstance-group级别的更新信息</p>
     * @param ModifyDynamicInstanceGroup <p>DynamicInstance-group级别的更新信息</p>
     */
    public void setModifyDynamicInstanceGroup(DynamicInstanceGroup ModifyDynamicInstanceGroup) {
        this.ModifyDynamicInstanceGroup = ModifyDynamicInstanceGroup;
    }

    /**
     * Get <p>cfs turbo挂载列表，不包含标准版</p> 
     * @return CFSTurboVolumes <p>cfs turbo挂载列表，不包含标准版</p>
     */
    public CFSTurboVolume [] getCFSTurboVolumes() {
        return this.CFSTurboVolumes;
    }

    /**
     * Set <p>cfs turbo挂载列表，不包含标准版</p>
     * @param CFSTurboVolumes <p>cfs turbo挂载列表，不包含标准版</p>
     */
    public void setCFSTurboVolumes(CFSTurboVolume [] CFSTurboVolumes) {
        this.CFSTurboVolumes = CFSTurboVolumes;
    }

    public ModifyDynamicInstanceForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDynamicInstanceForm(ModifyDynamicInstanceForm source) {
        if (source.ModifyScope != null) {
            this.ModifyScope = new Long(source.ModifyScope);
        }
        if (source.AddDynamicInstanceGroup != null) {
            this.AddDynamicInstanceGroup = new DynamicInstanceGroup(source.AddDynamicInstanceGroup);
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
        if (source.SupportNewToken != null) {
            this.SupportNewToken = new Boolean(source.SupportNewToken);
        }
        if (source.ModifyDynamicInstanceGroup != null) {
            this.ModifyDynamicInstanceGroup = new DynamicInstanceGroup(source.ModifyDynamicInstanceGroup);
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
        this.setParamSimple(map, prefix + "ModifyScope", this.ModifyScope);
        this.setParamObj(map, prefix + "AddDynamicInstanceGroup.", this.AddDynamicInstanceGroup);
        this.setParamSimple(map, prefix + "SupportPV", this.SupportPV);
        this.setParamArrayObj(map, prefix + "CBSVolumes.", this.CBSVolumes);
        this.setParamArrayObj(map, prefix + "CFSVolumes.", this.CFSVolumes);
        this.setParamArrayObj(map, prefix + "COSVolumes.", this.COSVolumes);
        this.setParamArrayObj(map, prefix + "VolumeMounts.", this.VolumeMounts);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Tolerations.", this.Tolerations);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "DependServices.", this.DependServices);
        this.setParamSimple(map, prefix + "SupportNewToken", this.SupportNewToken);
        this.setParamObj(map, prefix + "ModifyDynamicInstanceGroup.", this.ModifyDynamicInstanceGroup);
        this.setParamArrayObj(map, prefix + "CFSTurboVolumes.", this.CFSTurboVolumes);

    }
}

