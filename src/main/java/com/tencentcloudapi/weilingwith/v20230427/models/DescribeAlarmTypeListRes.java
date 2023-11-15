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

public class DescribeAlarmTypeListRes extends AbstractModel {

    /**
    * 告警类型查询列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmTypeSet")
    @Expose
    private AlarmTypeDetailInfo [] AlarmTypeSet;

    /**
     * Get 告警类型查询列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmTypeSet 告警类型查询列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmTypeDetailInfo [] getAlarmTypeSet() {
        return this.AlarmTypeSet;
    }

    /**
     * Set 告警类型查询列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmTypeSet 告警类型查询列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmTypeSet(AlarmTypeDetailInfo [] AlarmTypeSet) {
        this.AlarmTypeSet = AlarmTypeSet;
    }

    public DescribeAlarmTypeListRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmTypeListRes(DescribeAlarmTypeListRes source) {
        if (source.AlarmTypeSet != null) {
            this.AlarmTypeSet = new AlarmTypeDetailInfo[source.AlarmTypeSet.length];
            for (int i = 0; i < source.AlarmTypeSet.length; i++) {
                this.AlarmTypeSet[i] = new AlarmTypeDetailInfo(source.AlarmTypeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AlarmTypeSet.", this.AlarmTypeSet);

    }
}

