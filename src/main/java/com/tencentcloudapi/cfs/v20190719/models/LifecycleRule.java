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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleRule extends AbstractModel {

    /**
    * <p>数据转储后的存储类型。其中：InfrequentAccess：低频介质存储；ColdStorage：冷存储。</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>数据转储文件类型。其中，BIG_FILE：超大文件；STD_FILE：普通文件；SMALL_FILE：小文件；ALL：所有文件。</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>数据转储行为。其中，Archive：沉降；Noarchive：不沉降。</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>数据转储触发时间。由“DEFAULT_ATIME_”与“数字”组成，单位为天。当 Action 为 Noarchive，请保持为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>数据转储文件最大规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMaxSize")
    @Expose
    private String FileMaxSize;

    /**
    * <p>数据转储文件最小规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMinSize")
    @Expose
    private String FileMinSize;

    /**
    * <p>策略类型</p>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>阈值范围[10-90]</p>
    */
    @SerializedName("ExpireThreshold")
    @Expose
    private Long ExpireThreshold;

    /**
    * <p>阈值范围[10-90]</p>
    */
    @SerializedName("TargetThreshold")
    @Expose
    private Long TargetThreshold;

    /**
    * <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）</p><p>为空时，默认为false</p>
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
    * <p>新建文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效</p>
    */
    @SerializedName("IsCreateRealTimeSync")
    @Expose
    private Boolean IsCreateRealTimeSync;

    /**
    * <p>修改文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效。与 IsOverwrite 独立</p>
    */
    @SerializedName("IsModifyRealTimeSync")
    @Expose
    private Boolean IsModifyRealTimeSync;

    /**
    * <p>删除文件是否同步至 S3。true：同步删除（30 秒内）/ false：不同步删除。默认 false。为 true 时要求目标 COS Bucket 已开启多版本。仅当 StorageType=ExternalStorage 时生效</p>
    */
    @SerializedName("IsSyncDelete")
    @Expose
    private Boolean IsSyncDelete;

    /**
     * Get <p>数据转储后的存储类型。其中：InfrequentAccess：低频介质存储；ColdStorage：冷存储。</p> 
     * @return StorageType <p>数据转储后的存储类型。其中：InfrequentAccess：低频介质存储；ColdStorage：冷存储。</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>数据转储后的存储类型。其中：InfrequentAccess：低频介质存储；ColdStorage：冷存储。</p>
     * @param StorageType <p>数据转储后的存储类型。其中：InfrequentAccess：低频介质存储；ColdStorage：冷存储。</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>数据转储文件类型。其中，BIG_FILE：超大文件；STD_FILE：普通文件；SMALL_FILE：小文件；ALL：所有文件。</p> 
     * @return FileType <p>数据转储文件类型。其中，BIG_FILE：超大文件；STD_FILE：普通文件；SMALL_FILE：小文件；ALL：所有文件。</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>数据转储文件类型。其中，BIG_FILE：超大文件；STD_FILE：普通文件；SMALL_FILE：小文件；ALL：所有文件。</p>
     * @param FileType <p>数据转储文件类型。其中，BIG_FILE：超大文件；STD_FILE：普通文件；SMALL_FILE：小文件；ALL：所有文件。</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>数据转储行为。其中，Archive：沉降；Noarchive：不沉降。</p> 
     * @return Action <p>数据转储行为。其中，Archive：沉降；Noarchive：不沉降。</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>数据转储行为。其中，Archive：沉降；Noarchive：不沉降。</p>
     * @param Action <p>数据转储行为。其中，Archive：沉降；Noarchive：不沉降。</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>数据转储触发时间。由“DEFAULT_ATIME_”与“数字”组成，单位为天。当 Action 为 Noarchive，请保持为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Interval <p>数据转储触发时间。由“DEFAULT_ATIME_”与“数字”组成，单位为天。当 Action 为 Noarchive，请保持为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>数据转储触发时间。由“DEFAULT_ATIME_”与“数字”组成，单位为天。当 Action 为 Noarchive，请保持为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Interval <p>数据转储触发时间。由“DEFAULT_ATIME_”与“数字”组成，单位为天。当 Action 为 Noarchive，请保持为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>数据转储文件最大规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMaxSize <p>数据转储文件最大规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMaxSize() {
        return this.FileMaxSize;
    }

    /**
     * Set <p>数据转储文件最大规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMaxSize <p>数据转储文件最大规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMaxSize(String FileMaxSize) {
        this.FileMaxSize = FileMaxSize;
    }

    /**
     * Get <p>数据转储文件最小规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMinSize <p>数据转储文件最小规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMinSize() {
        return this.FileMinSize;
    }

    /**
     * Set <p>数据转储文件最小规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMinSize <p>数据转储文件最小规格。其数值需使用“数字+单位”格式进行表示，单位支持K（KiB）、M（MiB）、G（GiB）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMinSize(String FileMinSize) {
        this.FileMinSize = FileMinSize;
    }

    /**
     * Get <p>策略类型</p> 
     * @return PolicyType <p>策略类型</p>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>策略类型</p>
     * @param PolicyType <p>策略类型</p>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>阈值范围[10-90]</p> 
     * @return ExpireThreshold <p>阈值范围[10-90]</p>
     */
    public Long getExpireThreshold() {
        return this.ExpireThreshold;
    }

    /**
     * Set <p>阈值范围[10-90]</p>
     * @param ExpireThreshold <p>阈值范围[10-90]</p>
     */
    public void setExpireThreshold(Long ExpireThreshold) {
        this.ExpireThreshold = ExpireThreshold;
    }

    /**
     * Get <p>阈值范围[10-90]</p> 
     * @return TargetThreshold <p>阈值范围[10-90]</p>
     */
    public Long getTargetThreshold() {
        return this.TargetThreshold;
    }

    /**
     * Set <p>阈值范围[10-90]</p>
     * @param TargetThreshold <p>阈值范围[10-90]</p>
     */
    public void setTargetThreshold(Long TargetThreshold) {
        this.TargetThreshold = TargetThreshold;
    }

    /**
     * Get <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）</p><p>为空时，默认为false</p> 
     * @return IsOverwrite <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）</p><p>为空时，默认为false</p>
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）</p><p>为空时，默认为false</p>
     * @param IsOverwrite <p>当CFSTurbo内的文件和外置存储存在同名情况时，是否覆盖。</p><p>ture：覆盖</p><p>false：不覆盖（同时也不会释放热存数据）</p><p>为空时，默认为false</p>
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    /**
     * Get <p>新建文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效</p> 
     * @return IsCreateRealTimeSync <p>新建文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效</p>
     */
    public Boolean getIsCreateRealTimeSync() {
        return this.IsCreateRealTimeSync;
    }

    /**
     * Set <p>新建文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效</p>
     * @param IsCreateRealTimeSync <p>新建文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效</p>
     */
    public void setIsCreateRealTimeSync(Boolean IsCreateRealTimeSync) {
        this.IsCreateRealTimeSync = IsCreateRealTimeSync;
    }

    /**
     * Get <p>修改文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效。与 IsOverwrite 独立</p> 
     * @return IsModifyRealTimeSync <p>修改文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效。与 IsOverwrite 独立</p>
     */
    public Boolean getIsModifyRealTimeSync() {
        return this.IsModifyRealTimeSync;
    }

    /**
     * Set <p>修改文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效。与 IsOverwrite 独立</p>
     * @param IsModifyRealTimeSync <p>修改文件是否近实时同步至 S3。true：近实时同步（30 秒内）/ false：基于策略配置时间同步。默认 false。仅当 StorageType=ExternalStorage 时生效。与 IsOverwrite 独立</p>
     */
    public void setIsModifyRealTimeSync(Boolean IsModifyRealTimeSync) {
        this.IsModifyRealTimeSync = IsModifyRealTimeSync;
    }

    /**
     * Get <p>删除文件是否同步至 S3。true：同步删除（30 秒内）/ false：不同步删除。默认 false。为 true 时要求目标 COS Bucket 已开启多版本。仅当 StorageType=ExternalStorage 时生效</p> 
     * @return IsSyncDelete <p>删除文件是否同步至 S3。true：同步删除（30 秒内）/ false：不同步删除。默认 false。为 true 时要求目标 COS Bucket 已开启多版本。仅当 StorageType=ExternalStorage 时生效</p>
     */
    public Boolean getIsSyncDelete() {
        return this.IsSyncDelete;
    }

    /**
     * Set <p>删除文件是否同步至 S3。true：同步删除（30 秒内）/ false：不同步删除。默认 false。为 true 时要求目标 COS Bucket 已开启多版本。仅当 StorageType=ExternalStorage 时生效</p>
     * @param IsSyncDelete <p>删除文件是否同步至 S3。true：同步删除（30 秒内）/ false：不同步删除。默认 false。为 true 时要求目标 COS Bucket 已开启多版本。仅当 StorageType=ExternalStorage 时生效</p>
     */
    public void setIsSyncDelete(Boolean IsSyncDelete) {
        this.IsSyncDelete = IsSyncDelete;
    }

    public LifecycleRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleRule(LifecycleRule source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.FileMaxSize != null) {
            this.FileMaxSize = new String(source.FileMaxSize);
        }
        if (source.FileMinSize != null) {
            this.FileMinSize = new String(source.FileMinSize);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.ExpireThreshold != null) {
            this.ExpireThreshold = new Long(source.ExpireThreshold);
        }
        if (source.TargetThreshold != null) {
            this.TargetThreshold = new Long(source.TargetThreshold);
        }
        if (source.IsOverwrite != null) {
            this.IsOverwrite = new Boolean(source.IsOverwrite);
        }
        if (source.IsCreateRealTimeSync != null) {
            this.IsCreateRealTimeSync = new Boolean(source.IsCreateRealTimeSync);
        }
        if (source.IsModifyRealTimeSync != null) {
            this.IsModifyRealTimeSync = new Boolean(source.IsModifyRealTimeSync);
        }
        if (source.IsSyncDelete != null) {
            this.IsSyncDelete = new Boolean(source.IsSyncDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "FileMaxSize", this.FileMaxSize);
        this.setParamSimple(map, prefix + "FileMinSize", this.FileMinSize);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "ExpireThreshold", this.ExpireThreshold);
        this.setParamSimple(map, prefix + "TargetThreshold", this.TargetThreshold);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);
        this.setParamSimple(map, prefix + "IsCreateRealTimeSync", this.IsCreateRealTimeSync);
        this.setParamSimple(map, prefix + "IsModifyRealTimeSync", this.IsModifyRealTimeSync);
        this.setParamSimple(map, prefix + "IsSyncDelete", this.IsSyncDelete);

    }
}

