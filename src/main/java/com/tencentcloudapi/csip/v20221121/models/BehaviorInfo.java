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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BehaviorInfo extends AbstractModel {

    /**
    * 日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 具体数据，用来渲染曲线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeInfo")
    @Expose
    private NodeInfo [] NodeInfo;

    /**
     * Get 日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 具体数据，用来渲染曲线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeInfo 具体数据，用来渲染曲线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeInfo [] getNodeInfo() {
        return this.NodeInfo;
    }

    /**
     * Set 具体数据，用来渲染曲线
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeInfo 具体数据，用来渲染曲线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeInfo(NodeInfo [] NodeInfo) {
        this.NodeInfo = NodeInfo;
    }

    public BehaviorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BehaviorInfo(BehaviorInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.NodeInfo != null) {
            this.NodeInfo = new NodeInfo[source.NodeInfo.length];
            for (int i = 0; i < source.NodeInfo.length; i++) {
                this.NodeInfo[i] = new NodeInfo(source.NodeInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamArrayObj(map, prefix + "NodeInfo.", this.NodeInfo);

    }
}

