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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromptModerateConfigDTO extends AbstractModel {

    /**
    * 执行动作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InterceptMessage")
    @Expose
    private String InterceptMessage;

    /**
     * Get 执行动作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 执行动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 执行动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InterceptMessage 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInterceptMessage() {
        return this.InterceptMessage;
    }

    /**
     * Set 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param InterceptMessage 响应拦截内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterceptMessage(String InterceptMessage) {
        this.InterceptMessage = InterceptMessage;
    }

    public PromptModerateConfigDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptModerateConfigDTO(PromptModerateConfigDTO source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.InterceptMessage != null) {
            this.InterceptMessage = new String(source.InterceptMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "InterceptMessage", this.InterceptMessage);

    }
}

