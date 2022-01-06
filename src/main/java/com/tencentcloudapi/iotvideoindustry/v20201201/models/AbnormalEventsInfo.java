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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalEventsInfo extends AbstractModel{

    /**
    * 类型值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private Long Key;

    /**
    * 类型总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 类型值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 类型值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKey() {
        return this.Key;
    }

    /**
     * Set 类型值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 类型值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(Long Key) {
        this.Key = Key;
    }

    /**
     * Get 类型总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 类型总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 类型总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 类型总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public AbnormalEventsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalEventsInfo(AbnormalEventsInfo source) {
        if (source.Key != null) {
            this.Key = new Long(source.Key);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

