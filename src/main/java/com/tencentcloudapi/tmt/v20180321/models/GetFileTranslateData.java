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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFileTranslateData extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态

- init：任务已初始化
- wait：任务等待执行
- success：任务执行成功
- fail：任务执行失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 文件数据，目标文件必须小于50M，否则请通过回调方式请求文件翻译接口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileData")
    @Expose
    private String FileData;

    /**
    * 错误提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 任务进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 本次翻译消耗的字符数	
    */
    @SerializedName("UsedAmount")
    @Expose
    private Long UsedAmount;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态

- init：任务已初始化
- wait：任务等待执行
- success：任务执行成功
- fail：任务执行失败 
     * @return Status 任务状态

- init：任务已初始化
- wait：任务等待执行
- success：任务执行成功
- fail：任务执行失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态

- init：任务已初始化
- wait：任务等待执行
- success：任务执行成功
- fail：任务执行失败
     * @param Status 任务状态

- init：任务已初始化
- wait：任务等待执行
- success：任务执行成功
- fail：任务执行失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 文件数据，目标文件必须小于50M，否则请通过回调方式请求文件翻译接口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileData 文件数据，目标文件必须小于50M，否则请通过回调方式请求文件翻译接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileData() {
        return this.FileData;
    }

    /**
     * Set 文件数据，目标文件必须小于50M，否则请通过回调方式请求文件翻译接口
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileData 文件数据，目标文件必须小于50M，否则请通过回调方式请求文件翻译接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileData(String FileData) {
        this.FileData = FileData;
    }

    /**
     * Get 错误提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 错误提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 错误提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 任务进度 
     * @return Progress 任务进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度
     * @param Progress 任务进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 本次翻译消耗的字符数	 
     * @return UsedAmount 本次翻译消耗的字符数	
     */
    public Long getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set 本次翻译消耗的字符数	
     * @param UsedAmount 本次翻译消耗的字符数	
     */
    public void setUsedAmount(Long UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    public GetFileTranslateData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFileTranslateData(GetFileTranslateData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileData != null) {
            this.FileData = new String(source.FileData);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.UsedAmount != null) {
            this.UsedAmount = new Long(source.UsedAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileData", this.FileData);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);

    }
}

