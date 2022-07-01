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

public class AlterDMSPartitionRequest extends AbstractModel{

    /**
    * 当前名称，变更前db名称
    */
    @SerializedName("CurrentDbName")
    @Expose
    private String CurrentDbName;

    /**
    * 当前名称，变更前table名称
    */
    @SerializedName("CurrentTableName")
    @Expose
    private String CurrentTableName;

    /**
    * 当前名称，变更前Part名称
    */
    @SerializedName("CurrentValues")
    @Expose
    private String CurrentValues;

    /**
    * 分区
    */
    @SerializedName("Partition")
    @Expose
    private DMSPartition Partition;

    /**
     * Get 当前名称，变更前db名称 
     * @return CurrentDbName 当前名称，变更前db名称
     */
    public String getCurrentDbName() {
        return this.CurrentDbName;
    }

    /**
     * Set 当前名称，变更前db名称
     * @param CurrentDbName 当前名称，变更前db名称
     */
    public void setCurrentDbName(String CurrentDbName) {
        this.CurrentDbName = CurrentDbName;
    }

    /**
     * Get 当前名称，变更前table名称 
     * @return CurrentTableName 当前名称，变更前table名称
     */
    public String getCurrentTableName() {
        return this.CurrentTableName;
    }

    /**
     * Set 当前名称，变更前table名称
     * @param CurrentTableName 当前名称，变更前table名称
     */
    public void setCurrentTableName(String CurrentTableName) {
        this.CurrentTableName = CurrentTableName;
    }

    /**
     * Get 当前名称，变更前Part名称 
     * @return CurrentValues 当前名称，变更前Part名称
     */
    public String getCurrentValues() {
        return this.CurrentValues;
    }

    /**
     * Set 当前名称，变更前Part名称
     * @param CurrentValues 当前名称，变更前Part名称
     */
    public void setCurrentValues(String CurrentValues) {
        this.CurrentValues = CurrentValues;
    }

    /**
     * Get 分区 
     * @return Partition 分区
     */
    public DMSPartition getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区
     * @param Partition 分区
     */
    public void setPartition(DMSPartition Partition) {
        this.Partition = Partition;
    }

    public AlterDMSPartitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlterDMSPartitionRequest(AlterDMSPartitionRequest source) {
        if (source.CurrentDbName != null) {
            this.CurrentDbName = new String(source.CurrentDbName);
        }
        if (source.CurrentTableName != null) {
            this.CurrentTableName = new String(source.CurrentTableName);
        }
        if (source.CurrentValues != null) {
            this.CurrentValues = new String(source.CurrentValues);
        }
        if (source.Partition != null) {
            this.Partition = new DMSPartition(source.Partition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentDbName", this.CurrentDbName);
        this.setParamSimple(map, prefix + "CurrentTableName", this.CurrentTableName);
        this.setParamSimple(map, prefix + "CurrentValues", this.CurrentValues);
        this.setParamObj(map, prefix + "Partition.", this.Partition);

    }
}

