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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreMediaTask extends AbstractModel{

    /**
    * 文件ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 文件原始存储类型。
    */
    @SerializedName("OriginalStorageClass")
    @Expose
    private String OriginalStorageClass;

    /**
    * 文件目标存储类型。对于临时取回，目标存储类型与原始存储类型相同。
    */
    @SerializedName("TargetStorageClass")
    @Expose
    private String TargetStorageClass;

    /**
    * 取回模式，取值：
<li>Expedited：极速模式</li>
<li>Standard：标准模式</li>
<li>Bulk：批量模式</li>
    */
    @SerializedName("RestoreTier")
    @Expose
    private String RestoreTier;

    /**
    * 临时取回副本有效期，单位：天。对于永久取回，取值为0。
    */
    @SerializedName("RestoreDay")
    @Expose
    private Long RestoreDay;

    /**
    * 该字段已废弃。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 该字段已废弃。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 文件ID。 
     * @return FileId 文件ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID。
     * @param FileId 文件ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件原始存储类型。 
     * @return OriginalStorageClass 文件原始存储类型。
     */
    public String getOriginalStorageClass() {
        return this.OriginalStorageClass;
    }

    /**
     * Set 文件原始存储类型。
     * @param OriginalStorageClass 文件原始存储类型。
     */
    public void setOriginalStorageClass(String OriginalStorageClass) {
        this.OriginalStorageClass = OriginalStorageClass;
    }

    /**
     * Get 文件目标存储类型。对于临时取回，目标存储类型与原始存储类型相同。 
     * @return TargetStorageClass 文件目标存储类型。对于临时取回，目标存储类型与原始存储类型相同。
     */
    public String getTargetStorageClass() {
        return this.TargetStorageClass;
    }

    /**
     * Set 文件目标存储类型。对于临时取回，目标存储类型与原始存储类型相同。
     * @param TargetStorageClass 文件目标存储类型。对于临时取回，目标存储类型与原始存储类型相同。
     */
    public void setTargetStorageClass(String TargetStorageClass) {
        this.TargetStorageClass = TargetStorageClass;
    }

    /**
     * Get 取回模式，取值：
<li>Expedited：极速模式</li>
<li>Standard：标准模式</li>
<li>Bulk：批量模式</li> 
     * @return RestoreTier 取回模式，取值：
<li>Expedited：极速模式</li>
<li>Standard：标准模式</li>
<li>Bulk：批量模式</li>
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set 取回模式，取值：
<li>Expedited：极速模式</li>
<li>Standard：标准模式</li>
<li>Bulk：批量模式</li>
     * @param RestoreTier 取回模式，取值：
<li>Expedited：极速模式</li>
<li>Standard：标准模式</li>
<li>Bulk：批量模式</li>
     */
    public void setRestoreTier(String RestoreTier) {
        this.RestoreTier = RestoreTier;
    }

    /**
     * Get 临时取回副本有效期，单位：天。对于永久取回，取值为0。 
     * @return RestoreDay 临时取回副本有效期，单位：天。对于永久取回，取值为0。
     */
    public Long getRestoreDay() {
        return this.RestoreDay;
    }

    /**
     * Set 临时取回副本有效期，单位：天。对于永久取回，取值为0。
     * @param RestoreDay 临时取回副本有效期，单位：天。对于永久取回，取值为0。
     */
    public void setRestoreDay(Long RestoreDay) {
        this.RestoreDay = RestoreDay;
    }

    /**
     * Get 该字段已废弃。 
     * @return Status 该字段已废弃。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 该字段已废弃。
     * @param Status 该字段已废弃。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 该字段已废弃。 
     * @return Message 该字段已废弃。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 该字段已废弃。
     * @param Message 该字段已废弃。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public RestoreMediaTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreMediaTask(RestoreMediaTask source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.OriginalStorageClass != null) {
            this.OriginalStorageClass = new String(source.OriginalStorageClass);
        }
        if (source.TargetStorageClass != null) {
            this.TargetStorageClass = new String(source.TargetStorageClass);
        }
        if (source.RestoreTier != null) {
            this.RestoreTier = new String(source.RestoreTier);
        }
        if (source.RestoreDay != null) {
            this.RestoreDay = new Long(source.RestoreDay);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "OriginalStorageClass", this.OriginalStorageClass);
        this.setParamSimple(map, prefix + "TargetStorageClass", this.TargetStorageClass);
        this.setParamSimple(map, prefix + "RestoreTier", this.RestoreTier);
        this.setParamSimple(map, prefix + "RestoreDay", this.RestoreDay);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

