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
    * 数据转储后的存储类型
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 数据转储文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 数据转储行为
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 数据转储触发时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 数据转储文件最大规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMaxSize")
    @Expose
    private String FileMaxSize;

    /**
    * 数据转储文件最小规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMinSize")
    @Expose
    private String FileMinSize;

    /**
     * Get 数据转储后的存储类型 
     * @return StorageType 数据转储后的存储类型
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 数据转储后的存储类型
     * @param StorageType 数据转储后的存储类型
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 数据转储文件类型 
     * @return FileType 数据转储文件类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 数据转储文件类型
     * @param FileType 数据转储文件类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 数据转储行为 
     * @return Action 数据转储行为
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 数据转储行为
     * @param Action 数据转储行为
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 数据转储触发时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Interval 数据转储触发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 数据转储触发时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Interval 数据转储触发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 数据转储文件最大规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMaxSize 数据转储文件最大规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMaxSize() {
        return this.FileMaxSize;
    }

    /**
     * Set 数据转储文件最大规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMaxSize 数据转储文件最大规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMaxSize(String FileMaxSize) {
        this.FileMaxSize = FileMaxSize;
    }

    /**
     * Get 数据转储文件最小规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMinSize 数据转储文件最小规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMinSize() {
        return this.FileMinSize;
    }

    /**
     * Set 数据转储文件最小规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMinSize 数据转储文件最小规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMinSize(String FileMinSize) {
        this.FileMinSize = FileMinSize;
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

    }
}

