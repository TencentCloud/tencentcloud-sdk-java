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
package com.tencentcloudapi.hcm.v20181106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EvaluationResponse extends AbstractModel{

    /**
    * 图片唯一标识，一张图片一个SessionId；
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 识别出的算式信息；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
    * 任务 id，用于查询接口
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 图片唯一标识，一张图片一个SessionId； 
     * @return SessionId 图片唯一标识，一张图片一个SessionId；
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 图片唯一标识，一张图片一个SessionId；
     * @param SessionId 图片唯一标识，一张图片一个SessionId；
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 识别出的算式信息；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 识别出的算式信息；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set 识别出的算式信息；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 识别出的算式信息；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
    }

    /**
     * Get 任务 id，用于查询接口 
     * @return TaskId 任务 id，用于查询接口
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 id，用于查询接口
     * @param TaskId 任务 id，用于查询接口
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

