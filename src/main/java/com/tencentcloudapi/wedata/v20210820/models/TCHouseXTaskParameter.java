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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCHouseXTaskParameter extends AbstractModel {

    /**
    * DriverCPU核数
    */
    @SerializedName("DriverCores")
    @Expose
    private Long DriverCores;

    /**
    * ExecutorCPU核数
    */
    @SerializedName("ExecutorCores")
    @Expose
    private Long ExecutorCores;

    /**
    * Executor个数
    */
    @SerializedName("NumExecutors")
    @Expose
    private Long NumExecutors;

    /**
     * Get DriverCPU核数 
     * @return DriverCores DriverCPU核数
     */
    public Long getDriverCores() {
        return this.DriverCores;
    }

    /**
     * Set DriverCPU核数
     * @param DriverCores DriverCPU核数
     */
    public void setDriverCores(Long DriverCores) {
        this.DriverCores = DriverCores;
    }

    /**
     * Get ExecutorCPU核数 
     * @return ExecutorCores ExecutorCPU核数
     */
    public Long getExecutorCores() {
        return this.ExecutorCores;
    }

    /**
     * Set ExecutorCPU核数
     * @param ExecutorCores ExecutorCPU核数
     */
    public void setExecutorCores(Long ExecutorCores) {
        this.ExecutorCores = ExecutorCores;
    }

    /**
     * Get Executor个数 
     * @return NumExecutors Executor个数
     */
    public Long getNumExecutors() {
        return this.NumExecutors;
    }

    /**
     * Set Executor个数
     * @param NumExecutors Executor个数
     */
    public void setNumExecutors(Long NumExecutors) {
        this.NumExecutors = NumExecutors;
    }

    public TCHouseXTaskParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCHouseXTaskParameter(TCHouseXTaskParameter source) {
        if (source.DriverCores != null) {
            this.DriverCores = new Long(source.DriverCores);
        }
        if (source.ExecutorCores != null) {
            this.ExecutorCores = new Long(source.ExecutorCores);
        }
        if (source.NumExecutors != null) {
            this.NumExecutors = new Long(source.NumExecutors);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DriverCores", this.DriverCores);
        this.setParamSimple(map, prefix + "ExecutorCores", this.ExecutorCores);
        this.setParamSimple(map, prefix + "NumExecutors", this.NumExecutors);

    }
}

