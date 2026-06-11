/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopologyNodeStats extends AbstractModel {

    /**
    * 节点总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 健康节点数量
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * 警告节点数量
    */
    @SerializedName("Warning")
    @Expose
    private Long Warning;

    /**
    * 异常节点数量
    */
    @SerializedName("Error")
    @Expose
    private Long Error;

    /**
     * Get 节点总数 
     * @return Total 节点总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 节点总数
     * @param Total 节点总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 健康节点数量 
     * @return Healthy 健康节点数量
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 健康节点数量
     * @param Healthy 健康节点数量
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get 警告节点数量 
     * @return Warning 警告节点数量
     */
    public Long getWarning() {
        return this.Warning;
    }

    /**
     * Set 警告节点数量
     * @param Warning 警告节点数量
     */
    public void setWarning(Long Warning) {
        this.Warning = Warning;
    }

    /**
     * Get 异常节点数量 
     * @return Error 异常节点数量
     */
    public Long getError() {
        return this.Error;
    }

    /**
     * Set 异常节点数量
     * @param Error 异常节点数量
     */
    public void setError(Long Error) {
        this.Error = Error;
    }

    public TopologyNodeStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologyNodeStats(TopologyNodeStats source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Healthy != null) {
            this.Healthy = new Long(source.Healthy);
        }
        if (source.Warning != null) {
            this.Warning = new Long(source.Warning);
        }
        if (source.Error != null) {
            this.Error = new Long(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "Warning", this.Warning);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

