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

public class InstanceRebootTime extends AbstractModel {

    /**
    * 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 预期重启时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeInSeconds")
    @Expose
    private Long TimeInSeconds;

    /**
     * Get 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 预期重启时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeInSeconds 预期重启时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeInSeconds() {
        return this.TimeInSeconds;
    }

    /**
     * Set 预期重启时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeInSeconds 预期重启时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeInSeconds(Long TimeInSeconds) {
        this.TimeInSeconds = TimeInSeconds;
    }

    public InstanceRebootTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceRebootTime(InstanceRebootTime source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TimeInSeconds != null) {
            this.TimeInSeconds = new Long(source.TimeInSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TimeInSeconds", this.TimeInSeconds);

    }
}

