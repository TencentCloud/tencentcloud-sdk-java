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

public class CheckQueueNameRequest extends AbstractModel {

    /**
    * 队列名称
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 分区编码，用于校验同分区下队列名称是否重复
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
     * Get 队列名称 
     * @return QueueName 队列名称
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称
     * @param QueueName 队列名称
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 分区编码，用于校验同分区下队列名称是否重复 
     * @return PartitionCode 分区编码，用于校验同分区下队列名称是否重复
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set 分区编码，用于校验同分区下队列名称是否重复
     * @param PartitionCode 分区编码，用于校验同分区下队列名称是否重复
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    public CheckQueueNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckQueueNameRequest(CheckQueueNameRequest source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);

    }
}

