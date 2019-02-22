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

public class ListModelsRequest  extends AbstractModel{

    /**
    * 部署模型的集群， `集群模式` 必填
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 分页参数，返回数量上限
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 分页参数，分页起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 部署类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式`。
    */
    @SerializedName("ServType")
    @Expose
    private String ServType;

    /**
     * 获取部署模型的集群， `集群模式` 必填
     * @return Cluster 部署模型的集群， `集群模式` 必填
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置部署模型的集群， `集群模式` 必填
     * @param Cluster 部署模型的集群， `集群模式` 必填
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取分页参数，返回数量上限
     * @return Limit 分页参数，返回数量上限
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页参数，返回数量上限
     * @param Limit 分页参数，返回数量上限
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取分页参数，分页起始位置
     * @return Offset 分页参数，分页起始位置
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页参数，分页起始位置
     * @param Offset 分页参数，分页起始位置
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取部署类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式`。
     * @return ServType 部署类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式`。
     */
    public String getServType() {
        return this.ServType;
    }

    /**
     * 设置部署类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式`。
     * @param ServType 部署类型，取值 `serverless` 即为 `无服务器模式`，否则为 `集群模式`。
     */
    public void setServType(String ServType) {
        this.ServType = ServType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ServType", this.ServType);

    }
}

