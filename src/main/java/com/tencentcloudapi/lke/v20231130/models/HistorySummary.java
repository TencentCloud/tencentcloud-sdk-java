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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HistorySummary extends AbstractModel {

    /**
    * 助手
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Assistant")
    @Expose
    private String Assistant;

    /**
    * 用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
     * Get 助手
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Assistant 助手
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssistant() {
        return this.Assistant;
    }

    /**
     * Set 助手
注意：此字段可能返回 null，表示取不到有效值。
     * @param Assistant 助手
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssistant(String Assistant) {
        this.Assistant = Assistant;
    }

    /**
     * Get 用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    public HistorySummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HistorySummary(HistorySummary source) {
        if (source.Assistant != null) {
            this.Assistant = new String(source.Assistant);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Assistant", this.Assistant);
        this.setParamSimple(map, prefix + "User", this.User);

    }
}

