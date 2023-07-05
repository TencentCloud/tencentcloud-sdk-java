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

public class DlcMergeManifestsInfo extends AbstractModel{

    /**
    * 是否启用合并元数据Manifests文件治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MergeManifestsEnable")
    @Expose
    private String MergeManifestsEnable;

    /**
    * 用于运行合并元数据Manifests文件治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 合并元数据Manifests文件治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntervalMin")
    @Expose
    private Long IntervalMin;

    /**
     * Get 是否启用合并元数据Manifests文件治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MergeManifestsEnable 是否启用合并元数据Manifests文件治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMergeManifestsEnable() {
        return this.MergeManifestsEnable;
    }

    /**
     * Set 是否启用合并元数据Manifests文件治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。
     * @param MergeManifestsEnable 是否启用合并元数据Manifests文件治理项：enable、none
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMergeManifestsEnable(String MergeManifestsEnable) {
        this.MergeManifestsEnable = MergeManifestsEnable;
    }

    /**
     * Get 用于运行合并元数据Manifests文件治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Engine 用于运行合并元数据Manifests文件治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 用于运行合并元数据Manifests文件治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Engine 用于运行合并元数据Manifests文件治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 合并元数据Manifests文件治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntervalMin 合并元数据Manifests文件治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntervalMin() {
        return this.IntervalMin;
    }

    /**
     * Set 合并元数据Manifests文件治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntervalMin 合并元数据Manifests文件治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntervalMin(Long IntervalMin) {
        this.IntervalMin = IntervalMin;
    }

    public DlcMergeManifestsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcMergeManifestsInfo(DlcMergeManifestsInfo source) {
        if (source.MergeManifestsEnable != null) {
            this.MergeManifestsEnable = new String(source.MergeManifestsEnable);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.IntervalMin != null) {
            this.IntervalMin = new Long(source.IntervalMin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MergeManifestsEnable", this.MergeManifestsEnable);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "IntervalMin", this.IntervalMin);

    }
}

