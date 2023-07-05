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

public class DlcRewriteDataInfo extends AbstractModel{

    /**
    * 是否启用数据重排布治理项：enable（启动）、disable（不启用，默认）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RewriteDataEnable")
    @Expose
    private String RewriteDataEnable;

    /**
    * 用于运行数据重排布治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 重排布任务执行的文件个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinInputFiles")
    @Expose
    private Long MinInputFiles;

    /**
    * 数据重排布写后的数据文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetFileSizeBytes")
    @Expose
    private Long TargetFileSizeBytes;

    /**
    * 数据重排布治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntervalMin")
    @Expose
    private Long IntervalMin;

    /**
     * Get 是否启用数据重排布治理项：enable（启动）、disable（不启用，默认）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RewriteDataEnable 是否启用数据重排布治理项：enable（启动）、disable（不启用，默认）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRewriteDataEnable() {
        return this.RewriteDataEnable;
    }

    /**
     * Set 是否启用数据重排布治理项：enable（启动）、disable（不启用，默认）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RewriteDataEnable 是否启用数据重排布治理项：enable（启动）、disable（不启用，默认）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRewriteDataEnable(String RewriteDataEnable) {
        this.RewriteDataEnable = RewriteDataEnable;
    }

    /**
     * Get 用于运行数据重排布治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Engine 用于运行数据重排布治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 用于运行数据重排布治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Engine 用于运行数据重排布治理项的引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 重排布任务执行的文件个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinInputFiles 重排布任务执行的文件个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinInputFiles() {
        return this.MinInputFiles;
    }

    /**
     * Set 重排布任务执行的文件个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinInputFiles 重排布任务执行的文件个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinInputFiles(Long MinInputFiles) {
        this.MinInputFiles = MinInputFiles;
    }

    /**
     * Get 数据重排布写后的数据文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetFileSizeBytes 数据重排布写后的数据文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetFileSizeBytes() {
        return this.TargetFileSizeBytes;
    }

    /**
     * Set 数据重排布写后的数据文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetFileSizeBytes 数据重排布写后的数据文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetFileSizeBytes(Long TargetFileSizeBytes) {
        this.TargetFileSizeBytes = TargetFileSizeBytes;
    }

    /**
     * Get 数据重排布治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntervalMin 数据重排布治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntervalMin() {
        return this.IntervalMin;
    }

    /**
     * Set 数据重排布治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntervalMin 数据重排布治理运行周期，单位为分钟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntervalMin(Long IntervalMin) {
        this.IntervalMin = IntervalMin;
    }

    public DlcRewriteDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcRewriteDataInfo(DlcRewriteDataInfo source) {
        if (source.RewriteDataEnable != null) {
            this.RewriteDataEnable = new String(source.RewriteDataEnable);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.MinInputFiles != null) {
            this.MinInputFiles = new Long(source.MinInputFiles);
        }
        if (source.TargetFileSizeBytes != null) {
            this.TargetFileSizeBytes = new Long(source.TargetFileSizeBytes);
        }
        if (source.IntervalMin != null) {
            this.IntervalMin = new Long(source.IntervalMin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RewriteDataEnable", this.RewriteDataEnable);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "MinInputFiles", this.MinInputFiles);
        this.setParamSimple(map, prefix + "TargetFileSizeBytes", this.TargetFileSizeBytes);
        this.setParamSimple(map, prefix + "IntervalMin", this.IntervalMin);

    }
}

