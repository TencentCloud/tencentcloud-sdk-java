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
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModelRequest extends AbstractModel{

    /**
    * 模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要部署的模型文件路径名
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 关于模型的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 部署目标集群的名称，`集群模式` 必填
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 运行环境镜像的标签，详见 [Serving 环境](https://cloud.tencent.com/document/product/851/17320#serving-.E7.8E.AF.E5.A2.83)
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 要部署的模型副本数目，`集群模式` 选填
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 暴露外网或内网，默认暴露外网，`集群模式` 选填
    */
    @SerializedName("Expose")
    @Expose
    private String Expose;

    /**
    * 部署模式，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式` 下服务的运行规模，形如 `2U4G1P`，详见 [自定义的训练规模](https://cloud.tencent.com/document/product/851/17319#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.9A.84.E8.AE.AD.E7.BB.83.E8.A7.84.E6.A8.A1)
    */
    @SerializedName("ServType")
    @Expose
    private String ServType;

    /**
    * `无服务器模式` 可选的其他配置信息，详见 [利用无服务器函数部署](https://cloud.tencent.com/document/product/851/17049#.E5.88.A9.E7.94.A8.E6.97.A0.E6.9C.8D.E5.8A.A1.E5.99.A8.E5.87.BD.E6.95.B0.E9.83.A8.E7.BD.B2)
    */
    @SerializedName("RuntimeConf")
    @Expose
    private String [] RuntimeConf;

    /**
     * Get 模型名称 
     * @return Name 模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模型名称
     * @param Name 模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 要部署的模型文件路径名 
     * @return Model 要部署的模型文件路径名
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 要部署的模型文件路径名
     * @param Model 要部署的模型文件路径名
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 关于模型的描述 
     * @return Description 关于模型的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 关于模型的描述
     * @param Description 关于模型的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 部署目标集群的名称，`集群模式` 必填 
     * @return Cluster 部署目标集群的名称，`集群模式` 必填
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 部署目标集群的名称，`集群模式` 必填
     * @param Cluster 部署目标集群的名称，`集群模式` 必填
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 运行环境镜像的标签，详见 [Serving 环境](https://cloud.tencent.com/document/product/851/17320#serving-.E7.8E.AF.E5.A2.83) 
     * @return RuntimeVersion 运行环境镜像的标签，详见 [Serving 环境](https://cloud.tencent.com/document/product/851/17320#serving-.E7.8E.AF.E5.A2.83)
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set 运行环境镜像的标签，详见 [Serving 环境](https://cloud.tencent.com/document/product/851/17320#serving-.E7.8E.AF.E5.A2.83)
     * @param RuntimeVersion 运行环境镜像的标签，详见 [Serving 环境](https://cloud.tencent.com/document/product/851/17320#serving-.E7.8E.AF.E5.A2.83)
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get 要部署的模型副本数目，`集群模式` 选填 
     * @return Replicas 要部署的模型副本数目，`集群模式` 选填
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 要部署的模型副本数目，`集群模式` 选填
     * @param Replicas 要部署的模型副本数目，`集群模式` 选填
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 暴露外网或内网，默认暴露外网，`集群模式` 选填 
     * @return Expose 暴露外网或内网，默认暴露外网，`集群模式` 选填
     */
    public String getExpose() {
        return this.Expose;
    }

    /**
     * Set 暴露外网或内网，默认暴露外网，`集群模式` 选填
     * @param Expose 暴露外网或内网，默认暴露外网，`集群模式` 选填
     */
    public void setExpose(String Expose) {
        this.Expose = Expose;
    }

    /**
     * Get 部署模式，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式` 下服务的运行规模，形如 `2U4G1P`，详见 [自定义的训练规模](https://cloud.tencent.com/document/product/851/17319#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.9A.84.E8.AE.AD.E7.BB.83.E8.A7.84.E6.A8.A1) 
     * @return ServType 部署模式，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式` 下服务的运行规模，形如 `2U4G1P`，详见 [自定义的训练规模](https://cloud.tencent.com/document/product/851/17319#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.9A.84.E8.AE.AD.E7.BB.83.E8.A7.84.E6.A8.A1)
     */
    public String getServType() {
        return this.ServType;
    }

    /**
     * Set 部署模式，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式` 下服务的运行规模，形如 `2U4G1P`，详见 [自定义的训练规模](https://cloud.tencent.com/document/product/851/17319#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.9A.84.E8.AE.AD.E7.BB.83.E8.A7.84.E6.A8.A1)
     * @param ServType 部署模式，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式` 下服务的运行规模，形如 `2U4G1P`，详见 [自定义的训练规模](https://cloud.tencent.com/document/product/851/17319#.E8.87.AA.E5.AE.9A.E4.B9.89.E7.9A.84.E8.AE.AD.E7.BB.83.E8.A7.84.E6.A8.A1)
     */
    public void setServType(String ServType) {
        this.ServType = ServType;
    }

    /**
     * Get `无服务器模式` 可选的其他配置信息，详见 [利用无服务器函数部署](https://cloud.tencent.com/document/product/851/17049#.E5.88.A9.E7.94.A8.E6.97.A0.E6.9C.8D.E5.8A.A1.E5.99.A8.E5.87.BD.E6.95.B0.E9.83.A8.E7.BD.B2) 
     * @return RuntimeConf `无服务器模式` 可选的其他配置信息，详见 [利用无服务器函数部署](https://cloud.tencent.com/document/product/851/17049#.E5.88.A9.E7.94.A8.E6.97.A0.E6.9C.8D.E5.8A.A1.E5.99.A8.E5.87.BD.E6.95.B0.E9.83.A8.E7.BD.B2)
     */
    public String [] getRuntimeConf() {
        return this.RuntimeConf;
    }

    /**
     * Set `无服务器模式` 可选的其他配置信息，详见 [利用无服务器函数部署](https://cloud.tencent.com/document/product/851/17049#.E5.88.A9.E7.94.A8.E6.97.A0.E6.9C.8D.E5.8A.A1.E5.99.A8.E5.87.BD.E6.95.B0.E9.83.A8.E7.BD.B2)
     * @param RuntimeConf `无服务器模式` 可选的其他配置信息，详见 [利用无服务器函数部署](https://cloud.tencent.com/document/product/851/17049#.E5.88.A9.E7.94.A8.E6.97.A0.E6.9C.8D.E5.8A.A1.E5.99.A8.E5.87.BD.E6.95.B0.E9.83.A8.E7.BD.B2)
     */
    public void setRuntimeConf(String [] RuntimeConf) {
        this.RuntimeConf = RuntimeConf;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Expose", this.Expose);
        this.setParamSimple(map, prefix + "ServType", this.ServType);
        this.setParamArraySimple(map, prefix + "RuntimeConf.", this.RuntimeConf);

    }
}

