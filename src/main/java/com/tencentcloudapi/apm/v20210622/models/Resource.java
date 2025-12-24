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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel {

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * tke资源层信息
    */
    @SerializedName("TKEMeta")
    @Expose
    private TkeMeta [] TKEMeta;

    /**
    * cvm资源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVMMeta")
    @Expose
    private CVMMeta [] CVMMeta;

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get tke资源层信息 
     * @return TKEMeta tke资源层信息
     */
    public TkeMeta [] getTKEMeta() {
        return this.TKEMeta;
    }

    /**
     * Set tke资源层信息
     * @param TKEMeta tke资源层信息
     */
    public void setTKEMeta(TkeMeta [] TKEMeta) {
        this.TKEMeta = TKEMeta;
    }

    /**
     * Get cvm资源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVMMeta cvm资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CVMMeta [] getCVMMeta() {
        return this.CVMMeta;
    }

    /**
     * Set cvm资源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVMMeta cvm资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVMMeta(CVMMeta [] CVMMeta) {
        this.CVMMeta = CVMMeta;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.TKEMeta != null) {
            this.TKEMeta = new TkeMeta[source.TKEMeta.length];
            for (int i = 0; i < source.TKEMeta.length; i++) {
                this.TKEMeta[i] = new TkeMeta(source.TKEMeta[i]);
            }
        }
        if (source.CVMMeta != null) {
            this.CVMMeta = new CVMMeta[source.CVMMeta.length];
            for (int i = 0; i < source.CVMMeta.length; i++) {
                this.CVMMeta[i] = new CVMMeta(source.CVMMeta[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamArrayObj(map, prefix + "TKEMeta.", this.TKEMeta);
        this.setParamArrayObj(map, prefix + "CVMMeta.", this.CVMMeta);

    }
}

