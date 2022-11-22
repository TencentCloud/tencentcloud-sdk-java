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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResilientStreamConf extends AbstractModel{

    /**
    * 是否开启延播平滑吐流，true开启，false不开启，默认不开启。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 延播时间，单位秒，目前支持的范围为10~300秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BufferTime")
    @Expose
    private Long BufferTime;

    /**
     * Get 是否开启延播平滑吐流，true开启，false不开启，默认不开启。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 是否开启延播平滑吐流，true开启，false不开启，默认不开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启延播平滑吐流，true开启，false不开启，默认不开启。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 是否开启延播平滑吐流，true开启，false不开启，默认不开启。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 延播时间，单位秒，目前支持的范围为10~300秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BufferTime 延播时间，单位秒，目前支持的范围为10~300秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBufferTime() {
        return this.BufferTime;
    }

    /**
     * Set 延播时间，单位秒，目前支持的范围为10~300秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BufferTime 延播时间，单位秒，目前支持的范围为10~300秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBufferTime(Long BufferTime) {
        this.BufferTime = BufferTime;
    }

    public ResilientStreamConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResilientStreamConf(ResilientStreamConf source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.BufferTime != null) {
            this.BufferTime = new Long(source.BufferTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "BufferTime", this.BufferTime);

    }
}

