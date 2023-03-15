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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueueQuota extends AbstractModel{

    /**
    * 可创建最大Queue数
    */
    @SerializedName("MaxQueue")
    @Expose
    private Long MaxQueue;

    /**
    * 已创建Queue数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedQueue")
    @Expose
    private Long UsedQueue;

    /**
     * Get 可创建最大Queue数 
     * @return MaxQueue 可创建最大Queue数
     */
    public Long getMaxQueue() {
        return this.MaxQueue;
    }

    /**
     * Set 可创建最大Queue数
     * @param MaxQueue 可创建最大Queue数
     */
    public void setMaxQueue(Long MaxQueue) {
        this.MaxQueue = MaxQueue;
    }

    /**
     * Get 已创建Queue数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedQueue 已创建Queue数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsedQueue() {
        return this.UsedQueue;
    }

    /**
     * Set 已创建Queue数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedQueue 已创建Queue数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedQueue(Long UsedQueue) {
        this.UsedQueue = UsedQueue;
    }

    public QueueQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueueQuota(QueueQuota source) {
        if (source.MaxQueue != null) {
            this.MaxQueue = new Long(source.MaxQueue);
        }
        if (source.UsedQueue != null) {
            this.UsedQueue = new Long(source.UsedQueue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxQueue", this.MaxQueue);
        this.setParamSimple(map, prefix + "UsedQueue", this.UsedQueue);

    }
}

