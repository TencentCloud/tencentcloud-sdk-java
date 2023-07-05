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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcDataGovernPolicy extends AbstractModel{

    /**
    * 数据排布治理项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewriteDataPolicy")
    @Expose
    private DlcRewriteDataInfo RewriteDataPolicy;

    /**
    * 快照过期治理项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredSnapshotsPolicy")
    @Expose
    private DlcExpiredSnapshotsInfo ExpiredSnapshotsPolicy;

    /**
    * 移除孤立文件治理项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoveOrphanFilesPolicy")
    @Expose
    private DlcRemoveOrphanFilesInfo RemoveOrphanFilesPolicy;

    /**
    * 合并元数据Manifests治理项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MergeManifestsPolicy")
    @Expose
    private DlcMergeManifestsInfo MergeManifestsPolicy;

    /**
    * 是否集成库规则：default（默认继承）、none（不继承）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InheritDataBase")
    @Expose
    private String InheritDataBase;

    /**
    * 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 治理引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GovernEngine")
    @Expose
    private String GovernEngine;

    /**
     * Get 数据排布治理项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewriteDataPolicy 数据排布治理项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DlcRewriteDataInfo getRewriteDataPolicy() {
        return this.RewriteDataPolicy;
    }

    /**
     * Set 数据排布治理项
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewriteDataPolicy 数据排布治理项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewriteDataPolicy(DlcRewriteDataInfo RewriteDataPolicy) {
        this.RewriteDataPolicy = RewriteDataPolicy;
    }

    /**
     * Get 快照过期治理项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredSnapshotsPolicy 快照过期治理项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DlcExpiredSnapshotsInfo getExpiredSnapshotsPolicy() {
        return this.ExpiredSnapshotsPolicy;
    }

    /**
     * Set 快照过期治理项
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredSnapshotsPolicy 快照过期治理项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredSnapshotsPolicy(DlcExpiredSnapshotsInfo ExpiredSnapshotsPolicy) {
        this.ExpiredSnapshotsPolicy = ExpiredSnapshotsPolicy;
    }

    /**
     * Get 移除孤立文件治理项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoveOrphanFilesPolicy 移除孤立文件治理项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DlcRemoveOrphanFilesInfo getRemoveOrphanFilesPolicy() {
        return this.RemoveOrphanFilesPolicy;
    }

    /**
     * Set 移除孤立文件治理项
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoveOrphanFilesPolicy 移除孤立文件治理项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoveOrphanFilesPolicy(DlcRemoveOrphanFilesInfo RemoveOrphanFilesPolicy) {
        this.RemoveOrphanFilesPolicy = RemoveOrphanFilesPolicy;
    }

    /**
     * Get 合并元数据Manifests治理项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MergeManifestsPolicy 合并元数据Manifests治理项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DlcMergeManifestsInfo getMergeManifestsPolicy() {
        return this.MergeManifestsPolicy;
    }

    /**
     * Set 合并元数据Manifests治理项
注意：此字段可能返回 null，表示取不到有效值。
     * @param MergeManifestsPolicy 合并元数据Manifests治理项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMergeManifestsPolicy(DlcMergeManifestsInfo MergeManifestsPolicy) {
        this.MergeManifestsPolicy = MergeManifestsPolicy;
    }

    /**
     * Get 是否集成库规则：default（默认继承）、none（不继承）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InheritDataBase 是否集成库规则：default（默认继承）、none（不继承）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInheritDataBase() {
        return this.InheritDataBase;
    }

    /**
     * Set 是否集成库规则：default（默认继承）、none（不继承）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InheritDataBase 是否集成库规则：default（默认继承）、none（不继承）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInheritDataBase(String InheritDataBase) {
        this.InheritDataBase = InheritDataBase;
    }

    /**
     * Get 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 治理引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GovernEngine 治理引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGovernEngine() {
        return this.GovernEngine;
    }

    /**
     * Set 治理引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param GovernEngine 治理引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGovernEngine(String GovernEngine) {
        this.GovernEngine = GovernEngine;
    }

    public DlcDataGovernPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcDataGovernPolicy(DlcDataGovernPolicy source) {
        if (source.RewriteDataPolicy != null) {
            this.RewriteDataPolicy = new DlcRewriteDataInfo(source.RewriteDataPolicy);
        }
        if (source.ExpiredSnapshotsPolicy != null) {
            this.ExpiredSnapshotsPolicy = new DlcExpiredSnapshotsInfo(source.ExpiredSnapshotsPolicy);
        }
        if (source.RemoveOrphanFilesPolicy != null) {
            this.RemoveOrphanFilesPolicy = new DlcRemoveOrphanFilesInfo(source.RemoveOrphanFilesPolicy);
        }
        if (source.MergeManifestsPolicy != null) {
            this.MergeManifestsPolicy = new DlcMergeManifestsInfo(source.MergeManifestsPolicy);
        }
        if (source.InheritDataBase != null) {
            this.InheritDataBase = new String(source.InheritDataBase);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.GovernEngine != null) {
            this.GovernEngine = new String(source.GovernEngine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RewriteDataPolicy.", this.RewriteDataPolicy);
        this.setParamObj(map, prefix + "ExpiredSnapshotsPolicy.", this.ExpiredSnapshotsPolicy);
        this.setParamObj(map, prefix + "RemoveOrphanFilesPolicy.", this.RemoveOrphanFilesPolicy);
        this.setParamObj(map, prefix + "MergeManifestsPolicy.", this.MergeManifestsPolicy);
        this.setParamSimple(map, prefix + "InheritDataBase", this.InheritDataBase);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "GovernEngine", this.GovernEngine);

    }
}

