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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySwitchTimePeriodRequest extends AbstractModel{

    /**
    * 处于等待切换状态中的实例ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 入参取值为 0 ，代表立即切换。
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
     * Get 处于等待切换状态中的实例ID 
     * @return DBInstanceId 处于等待切换状态中的实例ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 处于等待切换状态中的实例ID
     * @param DBInstanceId 处于等待切换状态中的实例ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 入参取值为 0 ，代表立即切换。 
     * @return SwitchTag 入参取值为 0 ，代表立即切换。
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set 入参取值为 0 ，代表立即切换。
     * @param SwitchTag 入参取值为 0 ，代表立即切换。
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    public ModifySwitchTimePeriodRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySwitchTimePeriodRequest(ModifySwitchTimePeriodRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);

    }
}

