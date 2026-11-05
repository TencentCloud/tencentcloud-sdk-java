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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileRestoreTaskRequest extends AbstractModel {

    /**
    * <p>待恢复的备份ID</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * <p>目标实例ID</p>
    */
    @SerializedName("TargetResourceId")
    @Expose
    private String TargetResourceId;

    /**
    * <ol><li>恢复路径列表（1-500项）；2. CVM和CFS文件备份不传则使用备份点中所有路径，COS备份该参数必填；3. 必须是绝对路径；</li></ol>
    */
    @SerializedName("RestorePaths")
    @Expose
    private String [] RestorePaths;

    /**
    * <p>目标位置</p><ol><li>不传则恢复到原始路径</li><li>cos恢复时不能以【/】开头</li></ol>
    */
    @SerializedName("TargetLocation")
    @Expose
    private String TargetLocation;

    /**
    * <p>冲突处理策略：skip-跳过/&quot;         &quot;overwrite-覆盖/newer-保留较新的版本/&quot;         &quot;if_changed-内容变化时覆盖，默认overwrite</p>
    */
    @SerializedName("ConflictStrategy")
    @Expose
    private String ConflictStrategy;

    /**
     * Get <p>待恢复的备份ID</p> 
     * @return BackupId <p>待恢复的备份ID</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>待恢复的备份ID</p>
     * @param BackupId <p>待恢复的备份ID</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>目标实例ID</p> 
     * @return TargetResourceId <p>目标实例ID</p>
     */
    public String getTargetResourceId() {
        return this.TargetResourceId;
    }

    /**
     * Set <p>目标实例ID</p>
     * @param TargetResourceId <p>目标实例ID</p>
     */
    public void setTargetResourceId(String TargetResourceId) {
        this.TargetResourceId = TargetResourceId;
    }

    /**
     * Get <ol><li>恢复路径列表（1-500项）；2. CVM和CFS文件备份不传则使用备份点中所有路径，COS备份该参数必填；3. 必须是绝对路径；</li></ol> 
     * @return RestorePaths <ol><li>恢复路径列表（1-500项）；2. CVM和CFS文件备份不传则使用备份点中所有路径，COS备份该参数必填；3. 必须是绝对路径；</li></ol>
     */
    public String [] getRestorePaths() {
        return this.RestorePaths;
    }

    /**
     * Set <ol><li>恢复路径列表（1-500项）；2. CVM和CFS文件备份不传则使用备份点中所有路径，COS备份该参数必填；3. 必须是绝对路径；</li></ol>
     * @param RestorePaths <ol><li>恢复路径列表（1-500项）；2. CVM和CFS文件备份不传则使用备份点中所有路径，COS备份该参数必填；3. 必须是绝对路径；</li></ol>
     */
    public void setRestorePaths(String [] RestorePaths) {
        this.RestorePaths = RestorePaths;
    }

    /**
     * Get <p>目标位置</p><ol><li>不传则恢复到原始路径</li><li>cos恢复时不能以【/】开头</li></ol> 
     * @return TargetLocation <p>目标位置</p><ol><li>不传则恢复到原始路径</li><li>cos恢复时不能以【/】开头</li></ol>
     */
    public String getTargetLocation() {
        return this.TargetLocation;
    }

    /**
     * Set <p>目标位置</p><ol><li>不传则恢复到原始路径</li><li>cos恢复时不能以【/】开头</li></ol>
     * @param TargetLocation <p>目标位置</p><ol><li>不传则恢复到原始路径</li><li>cos恢复时不能以【/】开头</li></ol>
     */
    public void setTargetLocation(String TargetLocation) {
        this.TargetLocation = TargetLocation;
    }

    /**
     * Get <p>冲突处理策略：skip-跳过/&quot;         &quot;overwrite-覆盖/newer-保留较新的版本/&quot;         &quot;if_changed-内容变化时覆盖，默认overwrite</p> 
     * @return ConflictStrategy <p>冲突处理策略：skip-跳过/&quot;         &quot;overwrite-覆盖/newer-保留较新的版本/&quot;         &quot;if_changed-内容变化时覆盖，默认overwrite</p>
     */
    public String getConflictStrategy() {
        return this.ConflictStrategy;
    }

    /**
     * Set <p>冲突处理策略：skip-跳过/&quot;         &quot;overwrite-覆盖/newer-保留较新的版本/&quot;         &quot;if_changed-内容变化时覆盖，默认overwrite</p>
     * @param ConflictStrategy <p>冲突处理策略：skip-跳过/&quot;         &quot;overwrite-覆盖/newer-保留较新的版本/&quot;         &quot;if_changed-内容变化时覆盖，默认overwrite</p>
     */
    public void setConflictStrategy(String ConflictStrategy) {
        this.ConflictStrategy = ConflictStrategy;
    }

    public CreateFileRestoreTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileRestoreTaskRequest(CreateFileRestoreTaskRequest source) {
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.TargetResourceId != null) {
            this.TargetResourceId = new String(source.TargetResourceId);
        }
        if (source.RestorePaths != null) {
            this.RestorePaths = new String[source.RestorePaths.length];
            for (int i = 0; i < source.RestorePaths.length; i++) {
                this.RestorePaths[i] = new String(source.RestorePaths[i]);
            }
        }
        if (source.TargetLocation != null) {
            this.TargetLocation = new String(source.TargetLocation);
        }
        if (source.ConflictStrategy != null) {
            this.ConflictStrategy = new String(source.ConflictStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "TargetResourceId", this.TargetResourceId);
        this.setParamArraySimple(map, prefix + "RestorePaths.", this.RestorePaths);
        this.setParamSimple(map, prefix + "TargetLocation", this.TargetLocation);
        this.setParamSimple(map, prefix + "ConflictStrategy", this.ConflictStrategy);

    }
}

