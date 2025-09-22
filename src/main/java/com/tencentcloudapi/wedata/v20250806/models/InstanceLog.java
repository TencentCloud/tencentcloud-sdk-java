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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLog extends AbstractModel {

    /**
    * 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeContent")
    @Expose
    private String CodeContent;

    /**
    * **日志内容**
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogInfo")
    @Expose
    private String LogInfo;

    /**
    * **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
     * Get 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceKey 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceKey 实例唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeContent **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeContent() {
        return this.CodeContent;
    }

    /**
     * Set **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeContent **运行代码内容**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeContent(String CodeContent) {
        this.CodeContent = CodeContent;
    }

    /**
     * Get **日志内容**
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogInfo **日志内容**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogInfo() {
        return this.LogInfo;
    }

    /**
     * Set **日志内容**
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogInfo **日志内容**
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogInfo(String LogInfo) {
        this.LogInfo = LogInfo;
    }

    /**
     * Get **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextCursor **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextCursor **分页查询日志时使用，无具体业务含义**

第一次查询时值为null 
第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    public InstanceLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLog(InstanceLog source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeContent != null) {
            this.CodeContent = new String(source.CodeContent);
        }
        if (source.LogInfo != null) {
            this.LogInfo = new String(source.LogInfo);
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeContent", this.CodeContent);
        this.setParamSimple(map, prefix + "LogInfo", this.LogInfo);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);

    }
}

