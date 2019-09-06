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

public class DescribeTaskResponse  extends AbstractModel{

    /**
    * 作文识别文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 整体的批改结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CorrectData")
    @Expose
    private CorrectData CorrectData;

    /**
    * 任务状态，“Progressing”: 处理中（此时无结果返回）、“Finished”: 处理完成
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取作文识别文本
注意：此字段可能返回 null，表示取不到有效值。
     * @return Content 作文识别文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * 设置作文识别文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 作文识别文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * 获取整体的批改结果
注意：此字段可能返回 null，表示取不到有效值。
     * @return CorrectData 整体的批改结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CorrectData getCorrectData() {
        return this.CorrectData;
    }

    /**
     * 设置整体的批改结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param CorrectData 整体的批改结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCorrectData(CorrectData CorrectData) {
        this.CorrectData = CorrectData;
    }

    /**
     * 获取任务状态，“Progressing”: 处理中（此时无结果返回）、“Finished”: 处理完成
     * @return Status 任务状态，“Progressing”: 处理中（此时无结果返回）、“Finished”: 处理完成
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置任务状态，“Progressing”: 处理中（此时无结果返回）、“Finished”: 处理完成
     * @param Status 任务状态，“Progressing”: 处理中（此时无结果返回）、“Finished”: 处理完成
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamObj(map, prefix + "CorrectData.", this.CorrectData);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

