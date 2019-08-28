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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceRequest  extends AbstractModel{

    /**
    * 扩缩容配置
    */
    @SerializedName("Scaler")
    @Expose
    private Scaler Scaler;

    /**
    * 服务配置Id
    */
    @SerializedName("ServiceConfigId")
    @Expose
    private Long ServiceConfigId;

    /**
    * 服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
    */
    @SerializedName("ScaleMode")
    @Expose
    private String ScaleMode;

    /**
    * 集群，不填则使用默认集群。
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
     * 获取扩缩容配置
     * @return Scaler 扩缩容配置
     */
    public Scaler getScaler() {
        return this.Scaler;
    }

    /**
     * 设置扩缩容配置
     * @param Scaler 扩缩容配置
     */
    public void setScaler(Scaler Scaler) {
        this.Scaler = Scaler;
    }

    /**
     * 获取服务配置Id
     * @return ServiceConfigId 服务配置Id
     */
    public Long getServiceConfigId() {
        return this.ServiceConfigId;
    }

    /**
     * 设置服务配置Id
     * @param ServiceConfigId 服务配置Id
     */
    public void setServiceConfigId(Long ServiceConfigId) {
        this.ServiceConfigId = ServiceConfigId;
    }

    /**
     * 获取服务名称
     * @return Name 服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置服务名称
     * @param Name 服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
     * @return ScaleMode 扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
     */
    public String getScaleMode() {
        return this.ScaleMode;
    }

    /**
     * 设置扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
     * @param ScaleMode 扩缩容方式，支持AUTO, MANUAL，分别表示自动扩缩容和手动扩缩容
     */
    public void setScaleMode(String ScaleMode) {
        this.ScaleMode = ScaleMode;
    }

    /**
     * 获取集群，不填则使用默认集群。
     * @return Cluster 集群，不填则使用默认集群。
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置集群，不填则使用默认集群。
     * @param Cluster 集群，不填则使用默认集群。
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Scaler.", this.Scaler);
        this.setParamSimple(map, prefix + "ServiceConfigId", this.ServiceConfigId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ScaleMode", this.ScaleMode);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);

    }
}

