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

public class HorizontalPodAutoscaler extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 最小实例数
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * 最大实例数
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * 资源目标指标
    */
    @SerializedName("ResourceMetricTarget")
    @Expose
    private ResourceMetricTarget [] ResourceMetricTarget;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 最小实例数 
     * @return MinReplicas 最小实例数
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set 最小实例数
     * @param MinReplicas 最小实例数
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get 最大实例数 
     * @return MaxReplicas 最大实例数
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set 最大实例数
     * @param MaxReplicas 最大实例数
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get 资源目标指标 
     * @return ResourceMetricTarget 资源目标指标
     */
    public ResourceMetricTarget [] getResourceMetricTarget() {
        return this.ResourceMetricTarget;
    }

    /**
     * Set 资源目标指标
     * @param ResourceMetricTarget 资源目标指标
     */
    public void setResourceMetricTarget(ResourceMetricTarget [] ResourceMetricTarget) {
        this.ResourceMetricTarget = ResourceMetricTarget;
    }

    public HorizontalPodAutoscaler() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HorizontalPodAutoscaler(HorizontalPodAutoscaler source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.ResourceMetricTarget != null) {
            this.ResourceMetricTarget = new ResourceMetricTarget[source.ResourceMetricTarget.length];
            for (int i = 0; i < source.ResourceMetricTarget.length; i++) {
                this.ResourceMetricTarget[i] = new ResourceMetricTarget(source.ResourceMetricTarget[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamArrayObj(map, prefix + "ResourceMetricTarget.", this.ResourceMetricTarget);

    }
}

