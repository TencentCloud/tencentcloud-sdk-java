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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompostionContext extends AbstractModel{

    /**
    * 作文内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 批改结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorrectData")
    @Expose
    private CorrectData CorrectData;

    /**
    * 任务 id，用于查询接口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 图像识别唯一标识，一次识别一个 SessionId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get 作文内容 
     * @return Content 作文内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 作文内容
     * @param Content 作文内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 批改结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CorrectData 批改结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CorrectData getCorrectData() {
        return this.CorrectData;
    }

    /**
     * Set 批改结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorrectData 批改结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorrectData(CorrectData CorrectData) {
        this.CorrectData = CorrectData;
    }

    /**
     * Get 任务 id，用于查询接口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务 id，用于查询接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 id，用于查询接口
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务 id，用于查询接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 图像识别唯一标识，一次识别一个 SessionId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId 图像识别唯一标识，一次识别一个 SessionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 图像识别唯一标识，一次识别一个 SessionId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId 图像识别唯一标识，一次识别一个 SessionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamObj(map, prefix + "CorrectData.", this.CorrectData);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

