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

public class RuntimeConfig extends AbstractModel {

    /**
    * 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeType")
    @Expose
    private String RuntimeType;

    /**
    * 运行时版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 运行时根目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeRootDir")
    @Expose
    private String RuntimeRootDir;

    /**
     * Get 运行时类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeType 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntimeType() {
        return this.RuntimeType;
    }

    /**
     * Set 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeType 运行时类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeType(String RuntimeType) {
        this.RuntimeType = RuntimeType;
    }

    /**
     * Get 运行时版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeVersion 运行时版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set 运行时版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeVersion 运行时版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get 运行时根目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeRootDir 运行时根目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntimeRootDir() {
        return this.RuntimeRootDir;
    }

    /**
     * Set 运行时根目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeRootDir 运行时根目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeRootDir(String RuntimeRootDir) {
        this.RuntimeRootDir = RuntimeRootDir;
    }

    public RuntimeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuntimeConfig(RuntimeConfig source) {
        if (source.RuntimeType != null) {
            this.RuntimeType = new String(source.RuntimeType);
        }
        if (source.RuntimeVersion != null) {
            this.RuntimeVersion = new String(source.RuntimeVersion);
        }
        if (source.RuntimeRootDir != null) {
            this.RuntimeRootDir = new String(source.RuntimeRootDir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuntimeType", this.RuntimeType);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "RuntimeRootDir", this.RuntimeRootDir);

    }
}

