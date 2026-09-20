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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventActionsInfo extends AbstractModel {

    /**
    * 状态增量，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateDelta")
    @Expose
    private String StateDelta;

    /**
     * Get 状态增量，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateDelta 状态增量，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStateDelta() {
        return this.StateDelta;
    }

    /**
     * Set 状态增量，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateDelta 状态增量，JSON 字符串，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateDelta(String StateDelta) {
        this.StateDelta = StateDelta;
    }

    public EventActionsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventActionsInfo(EventActionsInfo source) {
        if (source.StateDelta != null) {
            this.StateDelta = new String(source.StateDelta);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StateDelta", this.StateDelta);

    }
}

