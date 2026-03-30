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

public class CredentialEffectScope extends AbstractModel {

    /**
    * 是否排除模式
枚举值：
0：包含模式（仅Instances中的机器生效），此时Instances必填
1：排除模式（Instances中的机器不生效，其余机器生效），此时Instances可选（空列表表示全部机器生效）
    */
    @SerializedName("Exclude")
    @Expose
    private Long Exclude;

    /**
    * 机器实例ID列表。Exclude为0时必填，表示仅这些机器可访问凭证；Exclude为1时可选，表示这些机器不可访问凭证（空列表表示全部机器生效）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instances")
    @Expose
    private String [] Instances;

    /**
     * Get 是否排除模式
枚举值：
0：包含模式（仅Instances中的机器生效），此时Instances必填
1：排除模式（Instances中的机器不生效，其余机器生效），此时Instances可选（空列表表示全部机器生效） 
     * @return Exclude 是否排除模式
枚举值：
0：包含模式（仅Instances中的机器生效），此时Instances必填
1：排除模式（Instances中的机器不生效，其余机器生效），此时Instances可选（空列表表示全部机器生效）
     */
    public Long getExclude() {
        return this.Exclude;
    }

    /**
     * Set 是否排除模式
枚举值：
0：包含模式（仅Instances中的机器生效），此时Instances必填
1：排除模式（Instances中的机器不生效，其余机器生效），此时Instances可选（空列表表示全部机器生效）
     * @param Exclude 是否排除模式
枚举值：
0：包含模式（仅Instances中的机器生效），此时Instances必填
1：排除模式（Instances中的机器不生效，其余机器生效），此时Instances可选（空列表表示全部机器生效）
     */
    public void setExclude(Long Exclude) {
        this.Exclude = Exclude;
    }

    /**
     * Get 机器实例ID列表。Exclude为0时必填，表示仅这些机器可访问凭证；Exclude为1时可选，表示这些机器不可访问凭证（空列表表示全部机器生效）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instances 机器实例ID列表。Exclude为0时必填，表示仅这些机器可访问凭证；Exclude为1时可选，表示这些机器不可访问凭证（空列表表示全部机器生效）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 机器实例ID列表。Exclude为0时必填，表示仅这些机器可访问凭证；Exclude为1时可选，表示这些机器不可访问凭证（空列表表示全部机器生效）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instances 机器实例ID列表。Exclude为0时必填，表示仅这些机器可访问凭证；Exclude为1时可选，表示这些机器不可访问凭证（空列表表示全部机器生效）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstances(String [] Instances) {
        this.Instances = Instances;
    }

    public CredentialEffectScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CredentialEffectScope(CredentialEffectScope source) {
        if (source.Exclude != null) {
            this.Exclude = new Long(source.Exclude);
        }
        if (source.Instances != null) {
            this.Instances = new String[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new String(source.Instances[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Exclude", this.Exclude);
        this.setParamArraySimple(map, prefix + "Instances.", this.Instances);

    }
}

