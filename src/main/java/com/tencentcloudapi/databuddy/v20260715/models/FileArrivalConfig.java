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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileArrivalConfig extends AbstractModel {

    /**
    * <p>运行命中的文件所在COS桶名</p><p>举例：dlc-sh-store-139153****</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>运行命中的文件所在COS地域</p><p>举例：ap-shanghai</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * <p>文件存储路径</p><p>举例：cosn://dlc-sh-store-139153**** /test/</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileStoragePath")
    @Expose
    private String FileStoragePath;

    /**
    * <p>文件名匹配规则</p><p>举例：</p><ul><li>空: 当前监听范围内的全部文件</li><li><code>*.csv: 任意以 .csv 结尾的文件名</code></li><li><code>orders_*.csv: orders_ 开头且以 .csv 结尾的文件名</code></li><li>orders.csv: 精确匹配 orders.csv</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileNamePattern")
    @Expose
    private String FileNamePattern;

    /**
    * <p>是否包含子目录</p><p>默认值：false</p><p>是否递归匹配子目录，默认 false</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Recursive")
    @Expose
    private Boolean Recursive;

    /**
    * <p>最小触发间隔时间</p><p>参数格式：数字</p><p>默认值：300</p><p>单位：秒；默认 300秒（5 分钟）；60-86400 秒（1–1440 分钟）；两次触发之间的最小间隔。期间内到达的文件，需等待该时间结束后才会触发运行。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinTriggerIntervalTime")
    @Expose
    private String MinTriggerIntervalTime;

    /**
    * <p>批次等待时间</p><p>参数格式：数字</p><p>默认值：120</p><p>单位：秒；默认 120秒（2 分钟）；60-3600 秒（1–60 分钟）；文件到达后等待该时长才触发运行。若等待期间再次有新文件到达，则重新开始计时。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchWaitTime")
    @Expose
    private String BatchWaitTime;

    /**
     * Get <p>运行命中的文件所在COS桶名</p><p>举例：dlc-sh-store-139153****</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucket <p>运行命中的文件所在COS桶名</p><p>举例：dlc-sh-store-139153****</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>运行命中的文件所在COS桶名</p><p>举例：dlc-sh-store-139153****</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucket <p>运行命中的文件所在COS桶名</p><p>举例：dlc-sh-store-139153****</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>运行命中的文件所在COS地域</p><p>举例：ap-shanghai</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosRegion <p>运行命中的文件所在COS地域</p><p>举例：ap-shanghai</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set <p>运行命中的文件所在COS地域</p><p>举例：ap-shanghai</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosRegion <p>运行命中的文件所在COS地域</p><p>举例：ap-shanghai</p><p>入参不填，如果填写则忽略；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get <p>文件存储路径</p><p>举例：cosn://dlc-sh-store-139153**** /test/</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileStoragePath <p>文件存储路径</p><p>举例：cosn://dlc-sh-store-139153**** /test/</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileStoragePath() {
        return this.FileStoragePath;
    }

    /**
     * Set <p>文件存储路径</p><p>举例：cosn://dlc-sh-store-139153**** /test/</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileStoragePath <p>文件存储路径</p><p>举例：cosn://dlc-sh-store-139153**** /test/</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileStoragePath(String FileStoragePath) {
        this.FileStoragePath = FileStoragePath;
    }

    /**
     * Get <p>文件名匹配规则</p><p>举例：</p><ul><li>空: 当前监听范围内的全部文件</li><li><code>*.csv: 任意以 .csv 结尾的文件名</code></li><li><code>orders_*.csv: orders_ 开头且以 .csv 结尾的文件名</code></li><li>orders.csv: 精确匹配 orders.csv</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileNamePattern <p>文件名匹配规则</p><p>举例：</p><ul><li>空: 当前监听范围内的全部文件</li><li><code>*.csv: 任意以 .csv 结尾的文件名</code></li><li><code>orders_*.csv: orders_ 开头且以 .csv 结尾的文件名</code></li><li>orders.csv: 精确匹配 orders.csv</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileNamePattern() {
        return this.FileNamePattern;
    }

    /**
     * Set <p>文件名匹配规则</p><p>举例：</p><ul><li>空: 当前监听范围内的全部文件</li><li><code>*.csv: 任意以 .csv 结尾的文件名</code></li><li><code>orders_*.csv: orders_ 开头且以 .csv 结尾的文件名</code></li><li>orders.csv: 精确匹配 orders.csv</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileNamePattern <p>文件名匹配规则</p><p>举例：</p><ul><li>空: 当前监听范围内的全部文件</li><li><code>*.csv: 任意以 .csv 结尾的文件名</code></li><li><code>orders_*.csv: orders_ 开头且以 .csv 结尾的文件名</code></li><li>orders.csv: 精确匹配 orders.csv</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileNamePattern(String FileNamePattern) {
        this.FileNamePattern = FileNamePattern;
    }

    /**
     * Get <p>是否包含子目录</p><p>默认值：false</p><p>是否递归匹配子目录，默认 false</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Recursive <p>是否包含子目录</p><p>默认值：false</p><p>是否递归匹配子目录，默认 false</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRecursive() {
        return this.Recursive;
    }

    /**
     * Set <p>是否包含子目录</p><p>默认值：false</p><p>是否递归匹配子目录，默认 false</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Recursive <p>是否包含子目录</p><p>默认值：false</p><p>是否递归匹配子目录，默认 false</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecursive(Boolean Recursive) {
        this.Recursive = Recursive;
    }

    /**
     * Get <p>最小触发间隔时间</p><p>参数格式：数字</p><p>默认值：300</p><p>单位：秒；默认 300秒（5 分钟）；60-86400 秒（1–1440 分钟）；两次触发之间的最小间隔。期间内到达的文件，需等待该时间结束后才会触发运行。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinTriggerIntervalTime <p>最小触发间隔时间</p><p>参数格式：数字</p><p>默认值：300</p><p>单位：秒；默认 300秒（5 分钟）；60-86400 秒（1–1440 分钟）；两次触发之间的最小间隔。期间内到达的文件，需等待该时间结束后才会触发运行。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMinTriggerIntervalTime() {
        return this.MinTriggerIntervalTime;
    }

    /**
     * Set <p>最小触发间隔时间</p><p>参数格式：数字</p><p>默认值：300</p><p>单位：秒；默认 300秒（5 分钟）；60-86400 秒（1–1440 分钟）；两次触发之间的最小间隔。期间内到达的文件，需等待该时间结束后才会触发运行。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinTriggerIntervalTime <p>最小触发间隔时间</p><p>参数格式：数字</p><p>默认值：300</p><p>单位：秒；默认 300秒（5 分钟）；60-86400 秒（1–1440 分钟）；两次触发之间的最小间隔。期间内到达的文件，需等待该时间结束后才会触发运行。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinTriggerIntervalTime(String MinTriggerIntervalTime) {
        this.MinTriggerIntervalTime = MinTriggerIntervalTime;
    }

    /**
     * Get <p>批次等待时间</p><p>参数格式：数字</p><p>默认值：120</p><p>单位：秒；默认 120秒（2 分钟）；60-3600 秒（1–60 分钟）；文件到达后等待该时长才触发运行。若等待期间再次有新文件到达，则重新开始计时。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchWaitTime <p>批次等待时间</p><p>参数格式：数字</p><p>默认值：120</p><p>单位：秒；默认 120秒（2 分钟）；60-3600 秒（1–60 分钟）；文件到达后等待该时长才触发运行。若等待期间再次有新文件到达，则重新开始计时。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchWaitTime() {
        return this.BatchWaitTime;
    }

    /**
     * Set <p>批次等待时间</p><p>参数格式：数字</p><p>默认值：120</p><p>单位：秒；默认 120秒（2 分钟）；60-3600 秒（1–60 分钟）；文件到达后等待该时长才触发运行。若等待期间再次有新文件到达，则重新开始计时。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchWaitTime <p>批次等待时间</p><p>参数格式：数字</p><p>默认值：120</p><p>单位：秒；默认 120秒（2 分钟）；60-3600 秒（1–60 分钟）；文件到达后等待该时长才触发运行。若等待期间再次有新文件到达，则重新开始计时。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchWaitTime(String BatchWaitTime) {
        this.BatchWaitTime = BatchWaitTime;
    }

    public FileArrivalConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileArrivalConfig(FileArrivalConfig source) {
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.FileStoragePath != null) {
            this.FileStoragePath = new String(source.FileStoragePath);
        }
        if (source.FileNamePattern != null) {
            this.FileNamePattern = new String(source.FileNamePattern);
        }
        if (source.Recursive != null) {
            this.Recursive = new Boolean(source.Recursive);
        }
        if (source.MinTriggerIntervalTime != null) {
            this.MinTriggerIntervalTime = new String(source.MinTriggerIntervalTime);
        }
        if (source.BatchWaitTime != null) {
            this.BatchWaitTime = new String(source.BatchWaitTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "FileStoragePath", this.FileStoragePath);
        this.setParamSimple(map, prefix + "FileNamePattern", this.FileNamePattern);
        this.setParamSimple(map, prefix + "Recursive", this.Recursive);
        this.setParamSimple(map, prefix + "MinTriggerIntervalTime", this.MinTriggerIntervalTime);
        this.setParamSimple(map, prefix + "BatchWaitTime", this.BatchWaitTime);

    }
}

