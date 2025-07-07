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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageTraceItem extends AbstractModel {

    /**
    * 消息处理阶段，枚举值如下：

- produce：消息生产

- persist：消息存储

- consume：消息消费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stage")
    @Expose
    private String Stage;

    /**
    * 轨迹详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 消息处理阶段，枚举值如下：

- produce：消息生产

- persist：消息存储

- consume：消息消费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stage 消息处理阶段，枚举值如下：

- produce：消息生产

- persist：消息存储

- consume：消息消费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStage() {
        return this.Stage;
    }

    /**
     * Set 消息处理阶段，枚举值如下：

- produce：消息生产

- persist：消息存储

- consume：消息消费
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stage 消息处理阶段，枚举值如下：

- produce：消息生产

- persist：消息存储

- consume：消息消费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStage(String Stage) {
        this.Stage = Stage;
    }

    /**
     * Get 轨迹详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 轨迹详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 轨迹详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 轨迹详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public MessageTraceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageTraceItem(MessageTraceItem source) {
        if (source.Stage != null) {
            this.Stage = new String(source.Stage);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stage", this.Stage);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

