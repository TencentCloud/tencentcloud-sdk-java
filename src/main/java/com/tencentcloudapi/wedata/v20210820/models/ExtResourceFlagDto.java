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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtResourceFlagDto extends AbstractModel {

    /**
    * 父任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentTask")
    @Expose
    private Boolean ParentTask;

    /**
    * 生产事件获取标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventListener")
    @Expose
    private String EventListener;

    /**
    * Dlc相关配置获取标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DlcResourceConfig")
    @Expose
    private String DlcResourceConfig;

    /**
    * 脚本信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Script")
    @Expose
    private String Script;

    /**
    * 离线任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineSyncTask")
    @Expose
    private String OfflineSyncTask;

    /**
     * Get 父任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentTask 父任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getParentTask() {
        return this.ParentTask;
    }

    /**
     * Set 父任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentTask 父任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentTask(Boolean ParentTask) {
        this.ParentTask = ParentTask;
    }

    /**
     * Get 生产事件获取标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventListener 生产事件获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventListener() {
        return this.EventListener;
    }

    /**
     * Set 生产事件获取标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventListener 生产事件获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventListener(String EventListener) {
        this.EventListener = EventListener;
    }

    /**
     * Get Dlc相关配置获取标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DlcResourceConfig Dlc相关配置获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDlcResourceConfig() {
        return this.DlcResourceConfig;
    }

    /**
     * Set Dlc相关配置获取标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DlcResourceConfig Dlc相关配置获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDlcResourceConfig(String DlcResourceConfig) {
        this.DlcResourceConfig = DlcResourceConfig;
    }

    /**
     * Get 脚本信息获取标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Script 脚本信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScript() {
        return this.Script;
    }

    /**
     * Set 脚本信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Script 脚本信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScript(String Script) {
        this.Script = Script;
    }

    /**
     * Get 离线任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineSyncTask 离线任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOfflineSyncTask() {
        return this.OfflineSyncTask;
    }

    /**
     * Set 离线任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineSyncTask 离线任务信息获取标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineSyncTask(String OfflineSyncTask) {
        this.OfflineSyncTask = OfflineSyncTask;
    }

    public ExtResourceFlagDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtResourceFlagDto(ExtResourceFlagDto source) {
        if (source.ParentTask != null) {
            this.ParentTask = new Boolean(source.ParentTask);
        }
        if (source.EventListener != null) {
            this.EventListener = new String(source.EventListener);
        }
        if (source.DlcResourceConfig != null) {
            this.DlcResourceConfig = new String(source.DlcResourceConfig);
        }
        if (source.Script != null) {
            this.Script = new String(source.Script);
        }
        if (source.OfflineSyncTask != null) {
            this.OfflineSyncTask = new String(source.OfflineSyncTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentTask", this.ParentTask);
        this.setParamSimple(map, prefix + "EventListener", this.EventListener);
        this.setParamSimple(map, prefix + "DlcResourceConfig", this.DlcResourceConfig);
        this.setParamSimple(map, prefix + "Script", this.Script);
        this.setParamSimple(map, prefix + "OfflineSyncTask", this.OfflineSyncTask);

    }
}

