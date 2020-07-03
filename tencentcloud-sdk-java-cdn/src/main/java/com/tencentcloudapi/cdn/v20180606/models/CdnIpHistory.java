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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnIpHistory extends AbstractModel{

    /**
    * 操作类型
online：节点上线
offline：节点下线
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 操作类型对应的操作时间
当该值为 null 时表示无历史状态变更记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Datetime")
    @Expose
    private String Datetime;

    /**
     * Get 操作类型
online：节点上线
offline：节点下线 
     * @return Status 操作类型
online：节点上线
offline：节点下线
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 操作类型
online：节点上线
offline：节点下线
     * @param Status 操作类型
online：节点上线
offline：节点下线
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 操作类型对应的操作时间
当该值为 null 时表示无历史状态变更记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Datetime 操作类型对应的操作时间
当该值为 null 时表示无历史状态变更记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatetime() {
        return this.Datetime;
    }

    /**
     * Set 操作类型对应的操作时间
当该值为 null 时表示无历史状态变更记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Datetime 操作类型对应的操作时间
当该值为 null 时表示无历史状态变更记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatetime(String Datetime) {
        this.Datetime = Datetime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Datetime", this.Datetime);

    }
}

