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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmLevelListRes extends AbstractModel {

    /**
    * 告警级别枚举获取数组
    */
    @SerializedName("AlarmLevelSet")
    @Expose
    private AlarmLevelInfo [] AlarmLevelSet;

    /**
     * Get 告警级别枚举获取数组 
     * @return AlarmLevelSet 告警级别枚举获取数组
     */
    public AlarmLevelInfo [] getAlarmLevelSet() {
        return this.AlarmLevelSet;
    }

    /**
     * Set 告警级别枚举获取数组
     * @param AlarmLevelSet 告警级别枚举获取数组
     */
    public void setAlarmLevelSet(AlarmLevelInfo [] AlarmLevelSet) {
        this.AlarmLevelSet = AlarmLevelSet;
    }

    public DescribeAlarmLevelListRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmLevelListRes(DescribeAlarmLevelListRes source) {
        if (source.AlarmLevelSet != null) {
            this.AlarmLevelSet = new AlarmLevelInfo[source.AlarmLevelSet.length];
            for (int i = 0; i < source.AlarmLevelSet.length; i++) {
                this.AlarmLevelSet[i] = new AlarmLevelInfo(source.AlarmLevelSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AlarmLevelSet.", this.AlarmLevelSet);

    }
}

