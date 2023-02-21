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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAIFormTaskResponse extends AbstractModel{

    /**
    * 本次识别任务的唯一身份ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 本次识别任务的操作URL，有效期自生成之时起共24小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUrl")
    @Expose
    private String OperateUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本次识别任务的唯一身份ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 本次识别任务的唯一身份ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 本次识别任务的唯一身份ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 本次识别任务的唯一身份ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 本次识别任务的操作URL，有效期自生成之时起共24小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateUrl 本次识别任务的操作URL，有效期自生成之时起共24小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateUrl() {
        return this.OperateUrl;
    }

    /**
     * Set 本次识别任务的操作URL，有效期自生成之时起共24小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUrl 本次识别任务的操作URL，有效期自生成之时起共24小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUrl(String OperateUrl) {
        this.OperateUrl = OperateUrl;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateAIFormTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIFormTaskResponse(CreateAIFormTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.OperateUrl != null) {
            this.OperateUrl = new String(source.OperateUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "OperateUrl", this.OperateUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

