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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkloadConfig extends AbstractModel{

    /**
    * 工作副本数
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 资源配置
    */
    @SerializedName("Resources")
    @Expose
    private ResourceRequirements Resources;

    /**
    * HPA策略
    */
    @SerializedName("HorizontalPodAutoscaler")
    @Expose
    private HorizontalPodAutoscalerSpec HorizontalPodAutoscaler;

    /**
    * 部署到指定节点
    */
    @SerializedName("SelectedNodeList")
    @Expose
    private String [] SelectedNodeList;

    /**
     * Get 工作副本数 
     * @return Replicas 工作副本数
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 工作副本数
     * @param Replicas 工作副本数
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 资源配置 
     * @return Resources 资源配置
     */
    public ResourceRequirements getResources() {
        return this.Resources;
    }

    /**
     * Set 资源配置
     * @param Resources 资源配置
     */
    public void setResources(ResourceRequirements Resources) {
        this.Resources = Resources;
    }

    /**
     * Get HPA策略 
     * @return HorizontalPodAutoscaler HPA策略
     */
    public HorizontalPodAutoscalerSpec getHorizontalPodAutoscaler() {
        return this.HorizontalPodAutoscaler;
    }

    /**
     * Set HPA策略
     * @param HorizontalPodAutoscaler HPA策略
     */
    public void setHorizontalPodAutoscaler(HorizontalPodAutoscalerSpec HorizontalPodAutoscaler) {
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
    }

    /**
     * Get 部署到指定节点 
     * @return SelectedNodeList 部署到指定节点
     */
    public String [] getSelectedNodeList() {
        return this.SelectedNodeList;
    }

    /**
     * Set 部署到指定节点
     * @param SelectedNodeList 部署到指定节点
     */
    public void setSelectedNodeList(String [] SelectedNodeList) {
        this.SelectedNodeList = SelectedNodeList;
    }

    public WorkloadConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkloadConfig(WorkloadConfig source) {
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.Resources != null) {
            this.Resources = new ResourceRequirements(source.Resources);
        }
        if (source.HorizontalPodAutoscaler != null) {
            this.HorizontalPodAutoscaler = new HorizontalPodAutoscalerSpec(source.HorizontalPodAutoscaler);
        }
        if (source.SelectedNodeList != null) {
            this.SelectedNodeList = new String[source.SelectedNodeList.length];
            for (int i = 0; i < source.SelectedNodeList.length; i++) {
                this.SelectedNodeList[i] = new String(source.SelectedNodeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "HorizontalPodAutoscaler.", this.HorizontalPodAutoscaler);
        this.setParamArraySimple(map, prefix + "SelectedNodeList.", this.SelectedNodeList);

    }
}

