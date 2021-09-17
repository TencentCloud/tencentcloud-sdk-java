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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncFailReason extends AbstractModel{

    /**
    * 经办人Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 失败原因
例如：Id不符合规范、证件号码不合法等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 经办人Id 
     * @return Id 经办人Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 经办人Id
     * @param Id 经办人Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 失败原因
例如：Id不符合规范、证件号码不合法等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 失败原因
例如：Id不符合规范、证件号码不合法等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 失败原因
例如：Id不符合规范、证件号码不合法等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 失败原因
例如：Id不符合规范、证件号码不合法等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SyncFailReason() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncFailReason(SyncFailReason source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

