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

public class DescribeEdgeUnitApplicationLogsRequest extends AbstractModel{

    /**
    * 单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * 最大条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pod名
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 容器名
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
     * Get 单元ID 
     * @return EdgeUnitId 单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set 单元ID
     * @param EdgeUnitId 单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 最大条数 
     * @return Limit 最大条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大条数
     * @param Limit 最大条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pod名 
     * @return PodName Pod名
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod名
     * @param PodName Pod名
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 容器名 
     * @return ContainerName 容器名
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名
     * @param ContainerName 容器名
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    public DescribeEdgeUnitApplicationLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitApplicationLogsRequest(DescribeEdgeUnitApplicationLogsRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long(source.ApplicationId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);

    }
}

