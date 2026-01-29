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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexAccesses extends AbstractModel {

    /**
    * 索引命中次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ops")
    @Expose
    private Long Ops;

    /**
    * 命中次数从何时开始计数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Since")
    @Expose
    private String Since;

    /**
     * Get 索引命中次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ops 索引命中次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOps() {
        return this.Ops;
    }

    /**
     * Set 索引命中次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ops 索引命中次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOps(Long Ops) {
        this.Ops = Ops;
    }

    /**
     * Get 命中次数从何时开始计数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Since 命中次数从何时开始计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSince() {
        return this.Since;
    }

    /**
     * Set 命中次数从何时开始计数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Since 命中次数从何时开始计数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSince(String Since) {
        this.Since = Since;
    }

    public IndexAccesses() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexAccesses(IndexAccesses source) {
        if (source.Ops != null) {
            this.Ops = new Long(source.Ops);
        }
        if (source.Since != null) {
            this.Since = new String(source.Since);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ops", this.Ops);
        this.setParamSimple(map, prefix + "Since", this.Since);

    }
}

