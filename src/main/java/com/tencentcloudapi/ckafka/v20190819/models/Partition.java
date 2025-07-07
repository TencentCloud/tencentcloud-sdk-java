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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Partition extends AbstractModel {

    /**
    * 分区ID
    */
    @SerializedName("PartitionId")
    @Expose
    private Long PartitionId;

    /**
     * Get 分区ID 
     * @return PartitionId 分区ID
     */
    public Long getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set 分区ID
     * @param PartitionId 分区ID
     */
    public void setPartitionId(Long PartitionId) {
        this.PartitionId = PartitionId;
    }

    public Partition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Partition(Partition source) {
        if (source.PartitionId != null) {
            this.PartitionId = new Long(source.PartitionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);

    }
}

