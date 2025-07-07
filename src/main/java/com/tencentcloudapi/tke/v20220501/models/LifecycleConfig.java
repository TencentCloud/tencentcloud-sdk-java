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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleConfig extends AbstractModel {

    /**
    * 节点初始化前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreInit")
    @Expose
    private String PreInit;

    /**
    * 节点初始化后自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostInit")
    @Expose
    private String PostInit;

    /**
     * Get 节点初始化前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreInit 节点初始化前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreInit() {
        return this.PreInit;
    }

    /**
     * Set 节点初始化前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreInit 节点初始化前自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreInit(String PreInit) {
        this.PreInit = PreInit;
    }

    /**
     * Get 节点初始化后自定义脚本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostInit 节点初始化后自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPostInit() {
        return this.PostInit;
    }

    /**
     * Set 节点初始化后自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostInit 节点初始化后自定义脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostInit(String PostInit) {
        this.PostInit = PostInit;
    }

    public LifecycleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleConfig(LifecycleConfig source) {
        if (source.PreInit != null) {
            this.PreInit = new String(source.PreInit);
        }
        if (source.PostInit != null) {
            this.PostInit = new String(source.PostInit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PreInit", this.PreInit);
        this.setParamSimple(map, prefix + "PostInit", this.PostInit);

    }
}

