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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sService extends AbstractModel{

    /**
    * 权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * k8s集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 容器命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 容器服务的名字
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 服务的端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 额外选择的Pod的Label
    */
    @SerializedName("ExtraLabels")
    @Expose
    private K8sLabel [] ExtraLabels;

    /**
    * 自定义的服务名字，可选
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 权重 
     * @return Weight 权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
     * @param Weight 权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get k8s集群ID 
     * @return ClusterId k8s集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set k8s集群ID
     * @param ClusterId k8s集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 容器命名空间 
     * @return Namespace 容器命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 容器命名空间
     * @param Namespace 容器命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 容器服务的名字 
     * @return ServiceName 容器服务的名字
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 容器服务的名字
     * @param ServiceName 容器服务的名字
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 服务的端口 
     * @return Port 服务的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 服务的端口
     * @param Port 服务的端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 额外选择的Pod的Label 
     * @return ExtraLabels 额外选择的Pod的Label
     */
    public K8sLabel [] getExtraLabels() {
        return this.ExtraLabels;
    }

    /**
     * Set 额外选择的Pod的Label
     * @param ExtraLabels 额外选择的Pod的Label
     */
    public void setExtraLabels(K8sLabel [] ExtraLabels) {
        this.ExtraLabels = ExtraLabels;
    }

    /**
     * Get 自定义的服务名字，可选 
     * @return Name 自定义的服务名字，可选
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义的服务名字，可选
     * @param Name 自定义的服务名字，可选
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public K8sService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sService(K8sService source) {
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ExtraLabels != null) {
            this.ExtraLabels = new K8sLabel[source.ExtraLabels.length];
            for (int i = 0; i < source.ExtraLabels.length; i++) {
                this.ExtraLabels[i] = new K8sLabel(source.ExtraLabels[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "ExtraLabels.", this.ExtraLabels);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

