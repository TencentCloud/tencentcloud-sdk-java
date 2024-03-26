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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskAttachInfo extends AbstractModel {

    /**
    * 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachKey")
    @Expose
    private String AttachKey;

    /**
    * 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachValue")
    @Expose
    private String AttachValue;

    /**
     * Get 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachKey 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttachKey() {
        return this.AttachKey;
    }

    /**
     * Set 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachKey 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachKey(String AttachKey) {
        this.AttachKey = AttachKey;
    }

    /**
     * Get 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachValue 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAttachValue() {
        return this.AttachValue;
    }

    /**
     * Set 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachValue 升级任务：
”FastUpgradeStatus“：表示升级类型。1-原地升级；0-普通升级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachValue(String AttachValue) {
        this.AttachValue = AttachValue;
    }

    public TaskAttachInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskAttachInfo(TaskAttachInfo source) {
        if (source.AttachKey != null) {
            this.AttachKey = new String(source.AttachKey);
        }
        if (source.AttachValue != null) {
            this.AttachValue = new String(source.AttachValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttachKey", this.AttachKey);
        this.setParamSimple(map, prefix + "AttachValue", this.AttachValue);

    }
}

