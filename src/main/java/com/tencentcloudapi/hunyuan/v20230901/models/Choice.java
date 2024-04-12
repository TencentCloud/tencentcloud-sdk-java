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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Choice extends AbstractModel {

    /**
    * 结束标志位，为 stop 则表示尾包。
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * 增量返回值，流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Delta")
    @Expose
    private Delta Delta;

    /**
    * 返回值，非流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private Message Message;

    /**
     * Get 结束标志位，为 stop 则表示尾包。 
     * @return FinishReason 结束标志位，为 stop 则表示尾包。
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set 结束标志位，为 stop 则表示尾包。
     * @param FinishReason 结束标志位，为 stop 则表示尾包。
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get 增量返回值，流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Delta 增量返回值，流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Delta getDelta() {
        return this.Delta;
    }

    /**
     * Set 增量返回值，流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Delta 增量返回值，流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelta(Delta Delta) {
        this.Delta = Delta;
    }

    /**
     * Get 返回值，非流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 返回值，非流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Message getMessage() {
        return this.Message;
    }

    /**
     * Set 返回值，非流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 返回值，非流式调用时使用该字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(Message Message) {
        this.Message = Message;
    }

    public Choice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Choice(Choice source) {
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.Delta != null) {
            this.Delta = new Delta(source.Delta);
        }
        if (source.Message != null) {
            this.Message = new Message(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamObj(map, prefix + "Delta.", this.Delta);
        this.setParamObj(map, prefix + "Message.", this.Message);

    }
}

