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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkJobSpec extends AbstractModel {

    /**
    * <p>Driver 资源规格（CU 数）.</p>
    */
    @SerializedName("DriverCU")
    @Expose
    private Long DriverCU;

    /**
    * <p>Executor 资源规格（CU 数）.</p>
    */
    @SerializedName("ExecutorCU")
    @Expose
    private Long ExecutorCU;

    /**
    * <p>Executor 实例数量（弹性伸缩关闭时的固定数量）.</p>
    */
    @SerializedName("ExecutorNum")
    @Expose
    private Long ExecutorNum;

    /**
    * <p>是否开启弹性扩缩容.</p>
    */
    @SerializedName("DynamicAllocation")
    @Expose
    private Boolean DynamicAllocation;

    /**
    * <p>弹性扩缩容最小 Executor 数.</p>
    */
    @SerializedName("MinExecutors")
    @Expose
    private Long MinExecutors;

    /**
    * <p>弹性扩缩容最大 Executor 数.</p>
    */
    @SerializedName("MaxExecutors")
    @Expose
    private Long MaxExecutors;

    /**
     * Get <p>Driver 资源规格（CU 数）.</p> 
     * @return DriverCU <p>Driver 资源规格（CU 数）.</p>
     */
    public Long getDriverCU() {
        return this.DriverCU;
    }

    /**
     * Set <p>Driver 资源规格（CU 数）.</p>
     * @param DriverCU <p>Driver 资源规格（CU 数）.</p>
     */
    public void setDriverCU(Long DriverCU) {
        this.DriverCU = DriverCU;
    }

    /**
     * Get <p>Executor 资源规格（CU 数）.</p> 
     * @return ExecutorCU <p>Executor 资源规格（CU 数）.</p>
     */
    public Long getExecutorCU() {
        return this.ExecutorCU;
    }

    /**
     * Set <p>Executor 资源规格（CU 数）.</p>
     * @param ExecutorCU <p>Executor 资源规格（CU 数）.</p>
     */
    public void setExecutorCU(Long ExecutorCU) {
        this.ExecutorCU = ExecutorCU;
    }

    /**
     * Get <p>Executor 实例数量（弹性伸缩关闭时的固定数量）.</p> 
     * @return ExecutorNum <p>Executor 实例数量（弹性伸缩关闭时的固定数量）.</p>
     */
    public Long getExecutorNum() {
        return this.ExecutorNum;
    }

    /**
     * Set <p>Executor 实例数量（弹性伸缩关闭时的固定数量）.</p>
     * @param ExecutorNum <p>Executor 实例数量（弹性伸缩关闭时的固定数量）.</p>
     */
    public void setExecutorNum(Long ExecutorNum) {
        this.ExecutorNum = ExecutorNum;
    }

    /**
     * Get <p>是否开启弹性扩缩容.</p> 
     * @return DynamicAllocation <p>是否开启弹性扩缩容.</p>
     */
    public Boolean getDynamicAllocation() {
        return this.DynamicAllocation;
    }

    /**
     * Set <p>是否开启弹性扩缩容.</p>
     * @param DynamicAllocation <p>是否开启弹性扩缩容.</p>
     */
    public void setDynamicAllocation(Boolean DynamicAllocation) {
        this.DynamicAllocation = DynamicAllocation;
    }

    /**
     * Get <p>弹性扩缩容最小 Executor 数.</p> 
     * @return MinExecutors <p>弹性扩缩容最小 Executor 数.</p>
     */
    public Long getMinExecutors() {
        return this.MinExecutors;
    }

    /**
     * Set <p>弹性扩缩容最小 Executor 数.</p>
     * @param MinExecutors <p>弹性扩缩容最小 Executor 数.</p>
     */
    public void setMinExecutors(Long MinExecutors) {
        this.MinExecutors = MinExecutors;
    }

    /**
     * Get <p>弹性扩缩容最大 Executor 数.</p> 
     * @return MaxExecutors <p>弹性扩缩容最大 Executor 数.</p>
     */
    public Long getMaxExecutors() {
        return this.MaxExecutors;
    }

    /**
     * Set <p>弹性扩缩容最大 Executor 数.</p>
     * @param MaxExecutors <p>弹性扩缩容最大 Executor 数.</p>
     */
    public void setMaxExecutors(Long MaxExecutors) {
        this.MaxExecutors = MaxExecutors;
    }

    public SparkJobSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkJobSpec(SparkJobSpec source) {
        if (source.DriverCU != null) {
            this.DriverCU = new Long(source.DriverCU);
        }
        if (source.ExecutorCU != null) {
            this.ExecutorCU = new Long(source.ExecutorCU);
        }
        if (source.ExecutorNum != null) {
            this.ExecutorNum = new Long(source.ExecutorNum);
        }
        if (source.DynamicAllocation != null) {
            this.DynamicAllocation = new Boolean(source.DynamicAllocation);
        }
        if (source.MinExecutors != null) {
            this.MinExecutors = new Long(source.MinExecutors);
        }
        if (source.MaxExecutors != null) {
            this.MaxExecutors = new Long(source.MaxExecutors);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DriverCU", this.DriverCU);
        this.setParamSimple(map, prefix + "ExecutorCU", this.ExecutorCU);
        this.setParamSimple(map, prefix + "ExecutorNum", this.ExecutorNum);
        this.setParamSimple(map, prefix + "DynamicAllocation", this.DynamicAllocation);
        this.setParamSimple(map, prefix + "MinExecutors", this.MinExecutors);
        this.setParamSimple(map, prefix + "MaxExecutors", this.MaxExecutors);

    }
}

