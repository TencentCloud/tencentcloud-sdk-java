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

public class DeleteRegistryRecordRequest extends AbstractModel {

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
    * <p>可选。传入时只删除 Record 下指定 Version（软删除）；省略时删除整个 Record。显式传入空字符串或 null 返回 InvalidParameter.VersionId，不得回退为删除整个 Record。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>删除原因，最大 1024 字符。删除单个 Version 时必填；删除整个 Record 时可选。</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

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
     * Get <p>可选。传入时只删除 Record 下指定 Version（软删除）；省略时删除整个 Record。显式传入空字符串或 null 返回 InvalidParameter.VersionId，不得回退为删除整个 Record。</p> 
     * @return VersionId <p>可选。传入时只删除 Record 下指定 Version（软删除）；省略时删除整个 Record。显式传入空字符串或 null 返回 InvalidParameter.VersionId，不得回退为删除整个 Record。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>可选。传入时只删除 Record 下指定 Version（软删除）；省略时删除整个 Record。显式传入空字符串或 null 返回 InvalidParameter.VersionId，不得回退为删除整个 Record。</p>
     * @param VersionId <p>可选。传入时只删除 Record 下指定 Version（软删除）；省略时删除整个 Record。显式传入空字符串或 null 返回 InvalidParameter.VersionId，不得回退为删除整个 Record。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>删除原因，最大 1024 字符。删除单个 Version 时必填；删除整个 Record 时可选。</p> 
     * @return Reason <p>删除原因，最大 1024 字符。删除单个 Version 时必填；删除整个 Record 时可选。</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>删除原因，最大 1024 字符。删除单个 Version 时必填；删除整个 Record 时可选。</p>
     * @param Reason <p>删除原因，最大 1024 字符。删除单个 Version 时必填；删除整个 Record 时可选。</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public DeleteRegistryRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRegistryRecordRequest(DeleteRegistryRecordRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

