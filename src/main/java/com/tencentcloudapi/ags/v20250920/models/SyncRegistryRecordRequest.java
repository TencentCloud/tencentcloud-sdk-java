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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncRegistryRecordRequest extends AbstractModel {

    /**
    * <p>父 Registry ID。</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>Record ID。</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>可选。指定要同步的目标 Version；与 Label 互斥；均省略时使用 Stable。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>可选。指定要同步的目标 Label；与 VersionId 互斥；均省略时使用 Stable。Label 在请求开始时只解析一次。</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>可选，最大 4096 字符。若同步创建新 Version，将写入新 Version 的 ChangeLog；省略时保存为空。</p>
    */
    @SerializedName("ChangeLog")
    @Expose
    private String ChangeLog;

    /**
     * Get <p>父 Registry ID。</p> 
     * @return RegistryId <p>父 Registry ID。</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>父 Registry ID。</p>
     * @param RegistryId <p>父 Registry ID。</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>Record ID。</p> 
     * @return RecordId <p>Record ID。</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>Record ID。</p>
     * @param RecordId <p>Record ID。</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>可选。指定要同步的目标 Version；与 Label 互斥；均省略时使用 Stable。</p> 
     * @return VersionId <p>可选。指定要同步的目标 Version；与 Label 互斥；均省略时使用 Stable。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>可选。指定要同步的目标 Version；与 Label 互斥；均省略时使用 Stable。</p>
     * @param VersionId <p>可选。指定要同步的目标 Version；与 Label 互斥；均省略时使用 Stable。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>可选。指定要同步的目标 Label；与 VersionId 互斥；均省略时使用 Stable。Label 在请求开始时只解析一次。</p> 
     * @return Label <p>可选。指定要同步的目标 Label；与 VersionId 互斥；均省略时使用 Stable。Label 在请求开始时只解析一次。</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>可选。指定要同步的目标 Label；与 VersionId 互斥；均省略时使用 Stable。Label 在请求开始时只解析一次。</p>
     * @param Label <p>可选。指定要同步的目标 Label；与 VersionId 互斥；均省略时使用 Stable。Label 在请求开始时只解析一次。</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>可选，最大 4096 字符。若同步创建新 Version，将写入新 Version 的 ChangeLog；省略时保存为空。</p> 
     * @return ChangeLog <p>可选，最大 4096 字符。若同步创建新 Version，将写入新 Version 的 ChangeLog；省略时保存为空。</p>
     */
    public String getChangeLog() {
        return this.ChangeLog;
    }

    /**
     * Set <p>可选，最大 4096 字符。若同步创建新 Version，将写入新 Version 的 ChangeLog；省略时保存为空。</p>
     * @param ChangeLog <p>可选，最大 4096 字符。若同步创建新 Version，将写入新 Version 的 ChangeLog；省略时保存为空。</p>
     */
    public void setChangeLog(String ChangeLog) {
        this.ChangeLog = ChangeLog;
    }

    public SyncRegistryRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncRegistryRecordRequest(SyncRegistryRecordRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.ChangeLog != null) {
            this.ChangeLog = new String(source.ChangeLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "ChangeLog", this.ChangeLog);

    }
}

