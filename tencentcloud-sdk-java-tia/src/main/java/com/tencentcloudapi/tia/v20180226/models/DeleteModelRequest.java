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

public class DeleteModelRequest extends AbstractModel{

    /**
    * 要删除的模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 要删除的模型所在的集群名称，`集群模式` 必填
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 模型类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式`
    */
    @SerializedName("ServType")
    @Expose
    private String ServType;

    /**
     * Get 要删除的模型名称 
     * @return Name 要删除的模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 要删除的模型名称
     * @param Name 要删除的模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 要删除的模型所在的集群名称，`集群模式` 必填 
     * @return Cluster 要删除的模型所在的集群名称，`集群模式` 必填
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 要删除的模型所在的集群名称，`集群模式` 必填
     * @param Cluster 要删除的模型所在的集群名称，`集群模式` 必填
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 模型类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式` 
     * @return ServType 模型类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式`
     */
    public String getServType() {
        return this.ServType;
    }

    /**
     * Set 模型类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式`
     * @param ServType 模型类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式`
     */
    public void setServType(String ServType) {
        this.ServType = ServType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "ServType", this.ServType);

    }
}

