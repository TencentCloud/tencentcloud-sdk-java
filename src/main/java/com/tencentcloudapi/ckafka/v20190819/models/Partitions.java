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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Partitions extends AbstractModel{

    /**
    * 分区
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * partition 消费位移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 分区 
     * @return Partition 分区
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区
     * @param Partition 分区
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get partition 消费位移 
     * @return Offset partition 消费位移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set partition 消费位移
     * @param Offset partition 消费位移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public Partitions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Partitions(Partitions source) {
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

