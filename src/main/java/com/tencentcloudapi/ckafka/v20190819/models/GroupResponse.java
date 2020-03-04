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

public class GroupResponse extends AbstractModel{

    /**
    * 计数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * GroupList
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupList")
    @Expose
    private DescribeGroup [] GroupList;

    /**
     * Get 计数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 计数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get GroupList
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupList GroupList
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeGroup [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set GroupList
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupList GroupList
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupList(DescribeGroup [] GroupList) {
        this.GroupList = GroupList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "GroupList.", this.GroupList);

    }
}

