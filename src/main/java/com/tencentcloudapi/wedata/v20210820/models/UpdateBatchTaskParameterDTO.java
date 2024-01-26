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

public class UpdateBatchTaskParameterDTO extends AbstractModel {

    /**
    * spark作业driver资源规格大小, 可取small,medium,large,xlarge
    */
    @SerializedName("DriverSize")
    @Expose
    private String DriverSize;

    /**
    * 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums
    */
    @SerializedName("ExecutorMaxNumbers")
    @Expose
    private String ExecutorMaxNumbers;

    /**
    * spark作业executor个数
    */
    @SerializedName("ExecutorNumbers")
    @Expose
    private String ExecutorNumbers;

    /**
    * spark作业executor资源规格大小, 可取small,medium,large,xlarge
    */
    @SerializedName("ExecutorSize")
    @Expose
    private String ExecutorSize;

    /**
    * sparksql和presto引擎参数
    */
    @SerializedName("RunConfParams")
    @Expose
    private String RunConfParams;

    /**
    * 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
    */
    @SerializedName("IsInherit")
    @Expose
    private String IsInherit;

    /**
     * Get spark作业driver资源规格大小, 可取small,medium,large,xlarge 
     * @return DriverSize spark作业driver资源规格大小, 可取small,medium,large,xlarge
     */
    public String getDriverSize() {
        return this.DriverSize;
    }

    /**
     * Set spark作业driver资源规格大小, 可取small,medium,large,xlarge
     * @param DriverSize spark作业driver资源规格大小, 可取small,medium,large,xlarge
     */
    public void setDriverSize(String DriverSize) {
        this.DriverSize = DriverSize;
    }

    /**
     * Get 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums 
     * @return ExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums
     */
    public String getExecutorMaxNumbers() {
        return this.ExecutorMaxNumbers;
    }

    /**
     * Set 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums
     * @param ExecutorMaxNumbers 指定的Executor数量（最大值），默认为1，当开启动态分配有效，若未开启，则该值等于AppExecutorNums
     */
    public void setExecutorMaxNumbers(String ExecutorMaxNumbers) {
        this.ExecutorMaxNumbers = ExecutorMaxNumbers;
    }

    /**
     * Get spark作业executor个数 
     * @return ExecutorNumbers spark作业executor个数
     */
    public String getExecutorNumbers() {
        return this.ExecutorNumbers;
    }

    /**
     * Set spark作业executor个数
     * @param ExecutorNumbers spark作业executor个数
     */
    public void setExecutorNumbers(String ExecutorNumbers) {
        this.ExecutorNumbers = ExecutorNumbers;
    }

    /**
     * Get spark作业executor资源规格大小, 可取small,medium,large,xlarge 
     * @return ExecutorSize spark作业executor资源规格大小, 可取small,medium,large,xlarge
     */
    public String getExecutorSize() {
        return this.ExecutorSize;
    }

    /**
     * Set spark作业executor资源规格大小, 可取small,medium,large,xlarge
     * @param ExecutorSize spark作业executor资源规格大小, 可取small,medium,large,xlarge
     */
    public void setExecutorSize(String ExecutorSize) {
        this.ExecutorSize = ExecutorSize;
    }

    /**
     * Get sparksql和presto引擎参数 
     * @return RunConfParams sparksql和presto引擎参数
     */
    public String getRunConfParams() {
        return this.RunConfParams;
    }

    /**
     * Set sparksql和presto引擎参数
     * @param RunConfParams sparksql和presto引擎参数
     */
    public void setRunConfParams(String RunConfParams) {
        this.RunConfParams = RunConfParams;
    }

    /**
     * Get 任务资源配置是否继承集群模板，0（默认）不继承，1：继承 
     * @return IsInherit 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
     */
    public String getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
     * @param IsInherit 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
     */
    public void setIsInherit(String IsInherit) {
        this.IsInherit = IsInherit;
    }

    public UpdateBatchTaskParameterDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBatchTaskParameterDTO(UpdateBatchTaskParameterDTO source) {
        if (source.DriverSize != null) {
            this.DriverSize = new String(source.DriverSize);
        }
        if (source.ExecutorMaxNumbers != null) {
            this.ExecutorMaxNumbers = new String(source.ExecutorMaxNumbers);
        }
        if (source.ExecutorNumbers != null) {
            this.ExecutorNumbers = new String(source.ExecutorNumbers);
        }
        if (source.ExecutorSize != null) {
            this.ExecutorSize = new String(source.ExecutorSize);
        }
        if (source.RunConfParams != null) {
            this.RunConfParams = new String(source.RunConfParams);
        }
        if (source.IsInherit != null) {
            this.IsInherit = new String(source.IsInherit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DriverSize", this.DriverSize);
        this.setParamSimple(map, prefix + "ExecutorMaxNumbers", this.ExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "ExecutorNumbers", this.ExecutorNumbers);
        this.setParamSimple(map, prefix + "ExecutorSize", this.ExecutorSize);
        this.setParamSimple(map, prefix + "RunConfParams", this.RunConfParams);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);

    }
}

