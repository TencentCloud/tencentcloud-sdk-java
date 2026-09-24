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

public class DescribeRegistryAuditLogListRequest extends AbstractModel {

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
    * <p>Version ID；仅过滤 Version 维度动作，可选。</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>Action 精确过滤（如 <code>record.version.create</code>），可选。</p>
    */
    @SerializedName("ActionFilter")
    @Expose
    private String ActionFilter;

    /**
    * <p>发起者过滤（主账号 UIN 或子账号 UIN），可选。</p>
    */
    @SerializedName("Actor")
    @Expose
    private String Actor;

    /**
    * <p>起始时间；ISO 8601，可选。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间；ISO 8601，可选。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>分页起始偏移，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页条数，默认 20，最大 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get <p>Version ID；仅过滤 Version 维度动作，可选。</p> 
     * @return VersionId <p>Version ID；仅过滤 Version 维度动作，可选。</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>Version ID；仅过滤 Version 维度动作，可选。</p>
     * @param VersionId <p>Version ID；仅过滤 Version 维度动作，可选。</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>Action 精确过滤（如 <code>record.version.create</code>），可选。</p> 
     * @return ActionFilter <p>Action 精确过滤（如 <code>record.version.create</code>），可选。</p>
     */
    public String getActionFilter() {
        return this.ActionFilter;
    }

    /**
     * Set <p>Action 精确过滤（如 <code>record.version.create</code>），可选。</p>
     * @param ActionFilter <p>Action 精确过滤（如 <code>record.version.create</code>），可选。</p>
     */
    public void setActionFilter(String ActionFilter) {
        this.ActionFilter = ActionFilter;
    }

    /**
     * Get <p>发起者过滤（主账号 UIN 或子账号 UIN），可选。</p> 
     * @return Actor <p>发起者过滤（主账号 UIN 或子账号 UIN），可选。</p>
     */
    public String getActor() {
        return this.Actor;
    }

    /**
     * Set <p>发起者过滤（主账号 UIN 或子账号 UIN），可选。</p>
     * @param Actor <p>发起者过滤（主账号 UIN 或子账号 UIN），可选。</p>
     */
    public void setActor(String Actor) {
        this.Actor = Actor;
    }

    /**
     * Get <p>起始时间；ISO 8601，可选。</p> 
     * @return StartTime <p>起始时间；ISO 8601，可选。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始时间；ISO 8601，可选。</p>
     * @param StartTime <p>起始时间；ISO 8601，可选。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间；ISO 8601，可选。</p> 
     * @return EndTime <p>结束时间；ISO 8601，可选。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间；ISO 8601，可选。</p>
     * @param EndTime <p>结束时间；ISO 8601，可选。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>分页起始偏移，默认 0。</p> 
     * @return Offset <p>分页起始偏移，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页起始偏移，默认 0。</p>
     * @param Offset <p>分页起始偏移，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页条数，默认 20，最大 100。</p> 
     * @return Limit <p>分页条数，默认 20，最大 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页条数，默认 20，最大 100。</p>
     * @param Limit <p>分页条数，默认 20，最大 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRegistryAuditLogListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegistryAuditLogListRequest(DescribeRegistryAuditLogListRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.ActionFilter != null) {
            this.ActionFilter = new String(source.ActionFilter);
        }
        if (source.Actor != null) {
            this.Actor = new String(source.Actor);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "ActionFilter", this.ActionFilter);
        this.setParamSimple(map, prefix + "Actor", this.Actor);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

