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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceConfig extends AbstractModel{

    /**
    * 服务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 端口信息列表
    */
    @SerializedName("Ports")
    @Expose
    private Ports [] Ports;

    /**
    * 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheck")
    @Expose
    private HealthCheckConfig HealthCheck;

    /**
     * Get 服务名 
     * @return Name 服务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名
     * @param Name 服务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 端口信息列表 
     * @return Ports 端口信息列表
     */
    public Ports [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 端口信息列表
     * @param Ports 端口信息列表
     */
    public void setPorts(Ports [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheck 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckConfig getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheck 健康检查配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheck(HealthCheckConfig HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    public ServiceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceConfig(ServiceConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Ports != null) {
            this.Ports = new Ports[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Ports(source.Ports[i]);
            }
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new HealthCheckConfig(source.HealthCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);

    }
}

