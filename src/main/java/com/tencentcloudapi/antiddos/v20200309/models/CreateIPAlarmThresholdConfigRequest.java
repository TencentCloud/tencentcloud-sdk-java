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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIPAlarmThresholdConfigRequest extends AbstractModel{

    /**
    * IP告警阈值配置列表
    */
    @SerializedName("IpAlarmThresholdConfigList")
    @Expose
    private IPAlarmThresholdRelation [] IpAlarmThresholdConfigList;

    /**
     * Get IP告警阈值配置列表 
     * @return IpAlarmThresholdConfigList IP告警阈值配置列表
     */
    public IPAlarmThresholdRelation [] getIpAlarmThresholdConfigList() {
        return this.IpAlarmThresholdConfigList;
    }

    /**
     * Set IP告警阈值配置列表
     * @param IpAlarmThresholdConfigList IP告警阈值配置列表
     */
    public void setIpAlarmThresholdConfigList(IPAlarmThresholdRelation [] IpAlarmThresholdConfigList) {
        this.IpAlarmThresholdConfigList = IpAlarmThresholdConfigList;
    }

    public CreateIPAlarmThresholdConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIPAlarmThresholdConfigRequest(CreateIPAlarmThresholdConfigRequest source) {
        if (source.IpAlarmThresholdConfigList != null) {
            this.IpAlarmThresholdConfigList = new IPAlarmThresholdRelation[source.IpAlarmThresholdConfigList.length];
            for (int i = 0; i < source.IpAlarmThresholdConfigList.length; i++) {
                this.IpAlarmThresholdConfigList[i] = new IPAlarmThresholdRelation(source.IpAlarmThresholdConfigList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "IpAlarmThresholdConfigList.", this.IpAlarmThresholdConfigList);

    }
}

