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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeCheckStepTip extends AbstractModel {

    /**
    * 错误或告警的详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 帮助文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HelpDoc")
    @Expose
    private String HelpDoc;

    /**
     * Get 错误或告警的详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 错误或告警的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误或告警的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 错误或告警的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 帮助文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HelpDoc 帮助文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHelpDoc() {
        return this.HelpDoc;
    }

    /**
     * Set 帮助文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param HelpDoc 帮助文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHelpDoc(String HelpDoc) {
        this.HelpDoc = HelpDoc;
    }

    public SubscribeCheckStepTip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeCheckStepTip(SubscribeCheckStepTip source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.HelpDoc != null) {
            this.HelpDoc = new String(source.HelpDoc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "HelpDoc", this.HelpDoc);

    }
}

