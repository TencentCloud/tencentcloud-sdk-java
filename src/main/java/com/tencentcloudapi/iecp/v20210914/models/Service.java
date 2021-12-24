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

public class Service extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 类型 (ClusterIP|NodePort)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 端口配置
    */
    @SerializedName("Ports")
    @Expose
    private PortConfig [] Ports;

    /**
    * 标签
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 命名空间默认default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 服务IP
    */
    @SerializedName("ClusterIP")
    @Expose
    private String ClusterIP;

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
     * Get 类型 (ClusterIP|NodePort) 
     * @return Type 类型 (ClusterIP|NodePort)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型 (ClusterIP|NodePort)
     * @param Type 类型 (ClusterIP|NodePort)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 端口配置 
     * @return Ports 端口配置
     */
    public PortConfig [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 端口配置
     * @param Ports 端口配置
     */
    public void setPorts(PortConfig [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 标签 
     * @return Labels 标签
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签
     * @param Labels 标签
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 命名空间默认default 
     * @return Namespace 命名空间默认default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间默认default
     * @param Namespace 命名空间默认default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 服务IP 
     * @return ClusterIP 服务IP
     */
    public String getClusterIP() {
        return this.ClusterIP;
    }

    /**
     * Set 服务IP
     * @param ClusterIP 服务IP
     */
    public void setClusterIP(String ClusterIP) {
        this.ClusterIP = ClusterIP;
    }

    public Service() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Service(Service source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Ports != null) {
            this.Ports = new PortConfig[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortConfig(source.Ports[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ClusterIP != null) {
            this.ClusterIP = new String(source.ClusterIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ClusterIP", this.ClusterIP);

    }
}

