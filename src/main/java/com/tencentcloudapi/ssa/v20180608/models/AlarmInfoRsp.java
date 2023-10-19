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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmInfoRsp extends AbstractModel {

    /**
    * 近7天威胁告警
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackEvent")
    @Expose
    private AttackEvent [] AttackEvent;

    /**
     * Get 近7天威胁告警
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackEvent 近7天威胁告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttackEvent [] getAttackEvent() {
        return this.AttackEvent;
    }

    /**
     * Set 近7天威胁告警
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackEvent 近7天威胁告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackEvent(AttackEvent [] AttackEvent) {
        this.AttackEvent = AttackEvent;
    }

    public AlarmInfoRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmInfoRsp(AlarmInfoRsp source) {
        if (source.AttackEvent != null) {
            this.AttackEvent = new AttackEvent[source.AttackEvent.length];
            for (int i = 0; i < source.AttackEvent.length; i++) {
                this.AttackEvent[i] = new AttackEvent(source.AttackEvent[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AttackEvent.", this.AttackEvent);

    }
}

