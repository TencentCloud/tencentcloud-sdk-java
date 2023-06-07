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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySparkAppBatchRequest extends AbstractModel{

    /**
    * 需要批量修改的Spark作业任务ID列表
    */
    @SerializedName("SparkAppId")
    @Expose
    private String [] SparkAppId;

    /**
    * 引擎ID
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
    */
    @SerializedName("AppDriverSize")
    @Expose
    private String AppDriverSize;

    /**
    * executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
    */
    @SerializedName("AppExecutorSize")
    @Expose
    private String AppExecutorSize;

    /**
    * 指定executor数量，最小值为1，最大值小于集群规格
    */
    @SerializedName("AppExecutorNums")
    @Expose
    private Long AppExecutorNums;

    /**
    * 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
    */
    @SerializedName("AppExecutorMaxNumbers")
    @Expose
    private Long AppExecutorMaxNumbers;

    /**
    * 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

    /**
     * Get 需要批量修改的Spark作业任务ID列表 
     * @return SparkAppId 需要批量修改的Spark作业任务ID列表
     */
    public String [] getSparkAppId() {
        return this.SparkAppId;
    }

    /**
     * Set 需要批量修改的Spark作业任务ID列表
     * @param SparkAppId 需要批量修改的Spark作业任务ID列表
     */
    public void setSparkAppId(String [] SparkAppId) {
        this.SparkAppId = SparkAppId;
    }

    /**
     * Get 引擎ID 
     * @return DataEngine 引擎ID
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set 引擎ID
     * @param DataEngine 引擎ID
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge 
     * @return AppDriverSize driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     */
    public String getAppDriverSize() {
        return this.AppDriverSize;
    }

    /**
     * Set driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     * @param AppDriverSize driver规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     */
    public void setAppDriverSize(String AppDriverSize) {
        this.AppDriverSize = AppDriverSize;
    }

    /**
     * Get executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge 
     * @return AppExecutorSize executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     */
    public String getAppExecutorSize() {
        return this.AppExecutorSize;
    }

    /**
     * Set executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     * @param AppExecutorSize executor规格：small,medium,large,xlarge；内存型(引擎类型)：m.small,m.medium,m.large,m.xlarge
     */
    public void setAppExecutorSize(String AppExecutorSize) {
        this.AppExecutorSize = AppExecutorSize;
    }

    /**
     * Get 指定executor数量，最小值为1，最大值小于集群规格 
     * @return AppExecutorNums 指定executor数量，最小值为1，最大值小于集群规格
     */
    public Long getAppExecutorNums() {
        return this.AppExecutorNums;
    }

    /**
     * Set 指定executor数量，最小值为1，最大值小于集群规格
     * @param AppExecutorNums 指定executor数量，最小值为1，最大值小于集群规格
     */
    public void setAppExecutorNums(Long AppExecutorNums) {
        this.AppExecutorNums = AppExecutorNums;
    }

    /**
     * Get 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums） 
     * @return AppExecutorMaxNumbers 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
     */
    public Long getAppExecutorMaxNumbers() {
        return this.AppExecutorMaxNumbers;
    }

    /**
     * Set 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
     * @param AppExecutorMaxNumbers 指定executor max数量（动态配置场景下），最小值为1，最大值小于集群规格（当ExecutorMaxNumbers小于ExecutorNums时，改值设定为ExecutorNums）
     */
    public void setAppExecutorMaxNumbers(Long AppExecutorMaxNumbers) {
        this.AppExecutorMaxNumbers = AppExecutorMaxNumbers;
    }

    /**
     * Get 任务资源配置是否继承集群模板，0（默认）不继承，1：继承 
     * @return IsInherit 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
     * @param IsInherit 任务资源配置是否继承集群模板，0（默认）不继承，1：继承
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    public ModifySparkAppBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySparkAppBatchRequest(ModifySparkAppBatchRequest source) {
        if (source.SparkAppId != null) {
            this.SparkAppId = new String[source.SparkAppId.length];
            for (int i = 0; i < source.SparkAppId.length; i++) {
                this.SparkAppId[i] = new String(source.SparkAppId[i]);
            }
        }
        if (source.DataEngine != null) {
            this.DataEngine = new String(source.DataEngine);
        }
        if (source.AppDriverSize != null) {
            this.AppDriverSize = new String(source.AppDriverSize);
        }
        if (source.AppExecutorSize != null) {
            this.AppExecutorSize = new String(source.AppExecutorSize);
        }
        if (source.AppExecutorNums != null) {
            this.AppExecutorNums = new Long(source.AppExecutorNums);
        }
        if (source.AppExecutorMaxNumbers != null) {
            this.AppExecutorMaxNumbers = new Long(source.AppExecutorMaxNumbers);
        }
        if (source.IsInherit != null) {
            this.IsInherit = new Long(source.IsInherit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SparkAppId.", this.SparkAppId);
        this.setParamSimple(map, prefix + "DataEngine", this.DataEngine);
        this.setParamSimple(map, prefix + "AppDriverSize", this.AppDriverSize);
        this.setParamSimple(map, prefix + "AppExecutorSize", this.AppExecutorSize);
        this.setParamSimple(map, prefix + "AppExecutorNums", this.AppExecutorNums);
        this.setParamSimple(map, prefix + "AppExecutorMaxNumbers", this.AppExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);

    }
}

