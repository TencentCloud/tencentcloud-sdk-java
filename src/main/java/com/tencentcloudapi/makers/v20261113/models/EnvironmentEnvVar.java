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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvironmentEnvVar extends AbstractModel {

    /**
    * <p>变量 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>生效环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Env")
    @Expose
    private String [] Env;

    /**
     * Get <p>变量 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>变量 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>变量 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>变量 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key <p>变量名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value <p>变量值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>生效环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Env <p>生效环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>生效环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Env <p>生效环境 slug</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnv(String [] Env) {
        this.Env = Env;
    }

    public EnvironmentEnvVar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvironmentEnvVar(EnvironmentEnvVar source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Env != null) {
            this.Env = new String[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new String(source.Env[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamArraySimple(map, prefix + "Env.", this.Env);

    }
}

