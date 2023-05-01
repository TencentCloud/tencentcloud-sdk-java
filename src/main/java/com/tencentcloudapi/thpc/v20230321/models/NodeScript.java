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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeScript extends AbstractModel{

    /**
    * 节点执行脚本获取地址。
目前仅支持cos地址。地址最大长度：255。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptPath")
    @Expose
    private String ScriptPath;

    /**
    * 脚本执行超时时间（包含拉取脚本的时间）。单位秒，默认值：30。取值范围：10～1200。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get 节点执行脚本获取地址。
目前仅支持cos地址。地址最大长度：255。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptPath 节点执行脚本获取地址。
目前仅支持cos地址。地址最大长度：255。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptPath() {
        return this.ScriptPath;
    }

    /**
     * Set 节点执行脚本获取地址。
目前仅支持cos地址。地址最大长度：255。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptPath 节点执行脚本获取地址。
目前仅支持cos地址。地址最大长度：255。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptPath(String ScriptPath) {
        this.ScriptPath = ScriptPath;
    }

    /**
     * Get 脚本执行超时时间（包含拉取脚本的时间）。单位秒，默认值：30。取值范围：10～1200。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout 脚本执行超时时间（包含拉取脚本的时间）。单位秒，默认值：30。取值范围：10～1200。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 脚本执行超时时间（包含拉取脚本的时间）。单位秒，默认值：30。取值范围：10～1200。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout 脚本执行超时时间（包含拉取脚本的时间）。单位秒，默认值：30。取值范围：10～1200。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public NodeScript() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeScript(NodeScript source) {
        if (source.ScriptPath != null) {
            this.ScriptPath = new String(source.ScriptPath);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptPath", this.ScriptPath);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

