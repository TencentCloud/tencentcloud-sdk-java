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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CvmAgentStatus extends AbstractModel{

    /**
    * agent状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 对应状态的agent总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get agent状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status agent状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set agent状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status agent状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 对应状态的agent总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 对应状态的agent总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 对应状态的agent总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 对应状态的agent总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public CvmAgentStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CvmAgentStatus(CvmAgentStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

