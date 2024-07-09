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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShotInfo extends AbstractModel {

    /**
    * 镜头开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Float StartTimeStamp;

    /**
    * 镜头结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Float EndTimeStamp;

    /**
     * Get 镜头开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTimeStamp 镜头开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set 镜头开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTimeStamp 镜头开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTimeStamp(Float StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get 镜头结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTimeStamp 镜头结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set 镜头结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTimeStamp 镜头结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTimeStamp(Float EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    public ShotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShotInfo(ShotInfo source) {
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Float(source.StartTimeStamp);
        }
        if (source.EndTimeStamp != null) {
            this.EndTimeStamp = new Float(source.EndTimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "EndTimeStamp", this.EndTimeStamp);

    }
}

