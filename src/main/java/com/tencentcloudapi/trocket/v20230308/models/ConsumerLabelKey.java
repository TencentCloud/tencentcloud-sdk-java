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

public class ConsumerLabelKey extends AbstractModel {

    /**
    * <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Group <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Group <p>消费组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label <p>灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label <p>灰度标签名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public ConsumerLabelKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerLabelKey(ConsumerLabelKey source) {
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

