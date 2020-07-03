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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TsfPageInstance extends AbstractModel{

    /**
    * 机器实例总数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 机器实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private Instance [] Content;

    /**
     * Get 机器实例总数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 机器实例总数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 机器实例总数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 机器实例总数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 机器实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 机器实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Instance [] getContent() {
        return this.Content;
    }

    /**
     * Set 机器实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 机器实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(Instance [] Content) {
        this.Content = Content;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

