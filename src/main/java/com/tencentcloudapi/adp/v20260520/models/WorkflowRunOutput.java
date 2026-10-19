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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRunOutput extends AbstractModel {

    /**
    * 工作流输出
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 当前的回复消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestMessage")
    @Expose
    private ReplyMessage LatestMessage;

    /**
     * Get 工作流输出 
     * @return Output 工作流输出
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 工作流输出
     * @param Output 工作流输出
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 当前的回复消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestMessage 当前的回复消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReplyMessage getLatestMessage() {
        return this.LatestMessage;
    }

    /**
     * Set 当前的回复消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestMessage 当前的回复消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestMessage(ReplyMessage LatestMessage) {
        this.LatestMessage = LatestMessage;
    }

    public WorkflowRunOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunOutput(WorkflowRunOutput source) {
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.LatestMessage != null) {
            this.LatestMessage = new ReplyMessage(source.LatestMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamObj(map, prefix + "LatestMessage.", this.LatestMessage);

    }
}

