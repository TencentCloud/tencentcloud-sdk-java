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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferTemplateGroup extends AbstractModel{

    /**
    * 算法框架
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Framework")
    @Expose
    private String Framework;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
    * 支持的训练框架集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Groups")
    @Expose
    private String [] Groups;

    /**
    * 镜像模板参数列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InferTemplates")
    @Expose
    private InferTemplate [] InferTemplates;

    /**
     * Get 算法框架
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Framework 算法框架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFramework() {
        return this.Framework;
    }

    /**
     * Set 算法框架
注意：此字段可能返回 null，表示取不到有效值。
     * @param Framework 算法框架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFramework(String Framework) {
        this.Framework = Framework;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkVersion 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkVersion 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    /**
     * Get 支持的训练框架集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Groups 支持的训练框架集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 支持的训练框架集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Groups 支持的训练框架集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroups(String [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 镜像模板参数列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InferTemplates 镜像模板参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InferTemplate [] getInferTemplates() {
        return this.InferTemplates;
    }

    /**
     * Set 镜像模板参数列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InferTemplates 镜像模板参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInferTemplates(InferTemplate [] InferTemplates) {
        this.InferTemplates = InferTemplates;
    }

    public InferTemplateGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferTemplateGroup(InferTemplateGroup source) {
        if (source.Framework != null) {
            this.Framework = new String(source.Framework);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
        if (source.Groups != null) {
            this.Groups = new String[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new String(source.Groups[i]);
            }
        }
        if (source.InferTemplates != null) {
            this.InferTemplates = new InferTemplate[source.InferTemplates.length];
            for (int i = 0; i < source.InferTemplates.length; i++) {
                this.InferTemplates[i] = new InferTemplate(source.InferTemplates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Framework", this.Framework);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamArraySimple(map, prefix + "Groups.", this.Groups);
        this.setParamArrayObj(map, prefix + "InferTemplates.", this.InferTemplates);

    }
}

