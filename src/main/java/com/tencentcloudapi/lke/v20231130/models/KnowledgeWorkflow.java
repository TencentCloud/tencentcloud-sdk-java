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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeWorkflow extends AbstractModel {

    /**
    * 是否启用工作流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEnabled")
    @Expose
    private Boolean IsEnabled;

    /**
    * 是否启用PDL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsePdl")
    @Expose
    private Boolean UsePdl;

    /**
     * Get 是否启用工作流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEnabled 是否启用工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 是否启用工作流
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEnabled 是否启用工作流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEnabled(Boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 是否启用PDL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsePdl 是否启用PDL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUsePdl() {
        return this.UsePdl;
    }

    /**
     * Set 是否启用PDL
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsePdl 是否启用PDL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsePdl(Boolean UsePdl) {
        this.UsePdl = UsePdl;
    }

    public KnowledgeWorkflow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeWorkflow(KnowledgeWorkflow source) {
        if (source.IsEnabled != null) {
            this.IsEnabled = new Boolean(source.IsEnabled);
        }
        if (source.UsePdl != null) {
            this.UsePdl = new Boolean(source.UsePdl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "UsePdl", this.UsePdl);

    }
}

