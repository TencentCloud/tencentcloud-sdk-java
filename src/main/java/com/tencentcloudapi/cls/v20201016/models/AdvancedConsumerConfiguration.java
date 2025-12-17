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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedConsumerConfiguration extends AbstractModel {

    /**
    * Ckafka分区hash状态。 默认 false

- true：开启根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区
- false：关闭根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区
    */
    @SerializedName("PartitionHashStatus")
    @Expose
    private Boolean PartitionHashStatus;

    /**
    * 需要计算 hash 的字段列表。最大支持5个字段。
    */
    @SerializedName("PartitionFields")
    @Expose
    private String [] PartitionFields;

    /**
     * Get Ckafka分区hash状态。 默认 false

- true：开启根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区
- false：关闭根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区 
     * @return PartitionHashStatus Ckafka分区hash状态。 默认 false

- true：开启根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区
- false：关闭根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区
     */
    public Boolean getPartitionHashStatus() {
        return this.PartitionHashStatus;
    }

    /**
     * Set Ckafka分区hash状态。 默认 false

- true：开启根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区
- false：关闭根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区
     * @param PartitionHashStatus Ckafka分区hash状态。 默认 false

- true：开启根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区
- false：关闭根据字段 Hash 值结果相等的信息投递到统一 ckafka 分区
     */
    public void setPartitionHashStatus(Boolean PartitionHashStatus) {
        this.PartitionHashStatus = PartitionHashStatus;
    }

    /**
     * Get 需要计算 hash 的字段列表。最大支持5个字段。 
     * @return PartitionFields 需要计算 hash 的字段列表。最大支持5个字段。
     */
    public String [] getPartitionFields() {
        return this.PartitionFields;
    }

    /**
     * Set 需要计算 hash 的字段列表。最大支持5个字段。
     * @param PartitionFields 需要计算 hash 的字段列表。最大支持5个字段。
     */
    public void setPartitionFields(String [] PartitionFields) {
        this.PartitionFields = PartitionFields;
    }

    public AdvancedConsumerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedConsumerConfiguration(AdvancedConsumerConfiguration source) {
        if (source.PartitionHashStatus != null) {
            this.PartitionHashStatus = new Boolean(source.PartitionHashStatus);
        }
        if (source.PartitionFields != null) {
            this.PartitionFields = new String[source.PartitionFields.length];
            for (int i = 0; i < source.PartitionFields.length; i++) {
                this.PartitionFields[i] = new String(source.PartitionFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionHashStatus", this.PartitionHashStatus);
        this.setParamArraySimple(map, prefix + "PartitionFields.", this.PartitionFields);

    }
}

