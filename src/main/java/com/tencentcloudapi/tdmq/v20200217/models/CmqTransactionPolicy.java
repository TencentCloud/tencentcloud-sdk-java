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

public class CmqTransactionPolicy extends AbstractModel{

    /**
    * 第一次回查时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstQueryInterval")
    @Expose
    private Long FirstQueryInterval;

    /**
    * 最大查询次数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxQueryCount")
    @Expose
    private Long MaxQueryCount;

    /**
     * Get 第一次回查时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstQueryInterval 第一次回查时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstQueryInterval() {
        return this.FirstQueryInterval;
    }

    /**
     * Set 第一次回查时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstQueryInterval 第一次回查时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstQueryInterval(Long FirstQueryInterval) {
        this.FirstQueryInterval = FirstQueryInterval;
    }

    /**
     * Get 最大查询次数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxQueryCount 最大查询次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxQueryCount() {
        return this.MaxQueryCount;
    }

    /**
     * Set 最大查询次数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxQueryCount 最大查询次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxQueryCount(Long MaxQueryCount) {
        this.MaxQueryCount = MaxQueryCount;
    }

    public CmqTransactionPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqTransactionPolicy(CmqTransactionPolicy source) {
        if (source.FirstQueryInterval != null) {
            this.FirstQueryInterval = new Long(source.FirstQueryInterval);
        }
        if (source.MaxQueryCount != null) {
            this.MaxQueryCount = new Long(source.MaxQueryCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstQueryInterval", this.FirstQueryInterval);
        this.setParamSimple(map, prefix + "MaxQueryCount", this.MaxQueryCount);

    }
}

