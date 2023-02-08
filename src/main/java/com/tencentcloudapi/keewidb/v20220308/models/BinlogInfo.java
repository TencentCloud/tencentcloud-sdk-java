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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BinlogInfo extends AbstractModel{

    /**
    * 备份开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份 ID。
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 备份文件名。
    */
    @SerializedName("Filename")
    @Expose
    private String Filename;

    /**
    * 备份文件大小，单位：Byte。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
     * Get 备份开始时间。 
     * @return StartTime 备份开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份开始时间。
     * @param StartTime 备份开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份结束时间。 
     * @return EndTime 备份结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 备份结束时间。
     * @param EndTime 备份结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备份 ID。 
     * @return BackupId 备份 ID。
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份 ID。
     * @param BackupId 备份 ID。
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份文件名。 
     * @return Filename 备份文件名。
     */
    public String getFilename() {
        return this.Filename;
    }

    /**
     * Set 备份文件名。
     * @param Filename 备份文件名。
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * Get 备份文件大小，单位：Byte。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 备份文件大小，单位：Byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 备份文件大小，单位：Byte。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 备份文件大小，单位：Byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    public BinlogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogInfo(BinlogInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.Filename != null) {
            this.Filename = new String(source.Filename);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "Filename", this.Filename);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);

    }
}

