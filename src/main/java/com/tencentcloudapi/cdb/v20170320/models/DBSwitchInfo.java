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

public class DBSwitchInfo extends AbstractModel {

    /**
    * 切换时间，格式为：2017-09-03 01:34:31
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchTime")
    @Expose
    private String SwitchTime;

    /**
    * 切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchType")
    @Expose
    private String SwitchType;

    /**
     * Get 切换时间，格式为：2017-09-03 01:34:31
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchTime 切换时间，格式为：2017-09-03 01:34:31
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitchTime() {
        return this.SwitchTime;
    }

    /**
     * Set 切换时间，格式为：2017-09-03 01:34:31
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchTime 切换时间，格式为：2017-09-03 01:34:31
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchTime(String SwitchTime) {
        this.SwitchTime = SwitchTime;
    }

    /**
     * Get 切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchType 切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set 切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchType 切换类型，可能的返回值为：TRANSFER - 数据迁移；MASTER2SLAVE - 主备切换；RECOVERY - 主从恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchType(String SwitchType) {
        this.SwitchType = SwitchType;
    }

    public DBSwitchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBSwitchInfo(DBSwitchInfo source) {
        if (source.SwitchTime != null) {
            this.SwitchTime = new String(source.SwitchTime);
        }
        if (source.SwitchType != null) {
            this.SwitchType = new String(source.SwitchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchTime", this.SwitchTime);
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);

    }
}

