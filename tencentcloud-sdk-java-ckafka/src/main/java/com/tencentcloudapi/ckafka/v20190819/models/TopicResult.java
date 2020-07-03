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

public class TopicResult extends AbstractModel{

    /**
    * 返回的主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicList")
    @Expose
    private Topic [] TopicList;

    /**
    * 符合条件的 topic 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 返回的主题信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicList 返回的主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Topic [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set 返回的主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicList 返回的主题信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicList(Topic [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get 符合条件的 topic 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 符合条件的 topic 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的 topic 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 符合条件的 topic 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

