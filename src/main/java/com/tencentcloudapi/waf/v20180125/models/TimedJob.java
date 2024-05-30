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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimedJob extends AbstractModel {

    /**
    * 开始时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartDateTime")
    @Expose
    private Long StartDateTime;

    /**
    * 结束时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndDateTime")
    @Expose
    private Long EndDateTime;

    /**
     * Get 开始时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartDateTime 开始时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartDateTime() {
        return this.StartDateTime;
    }

    /**
     * Set 开始时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartDateTime 开始时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartDateTime(Long StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    /**
     * Get 结束时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndDateTime 结束时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndDateTime() {
        return this.EndDateTime;
    }

    /**
     * Set 结束时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndDateTime 结束时间戳，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndDateTime(Long EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    public TimedJob() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimedJob(TimedJob source) {
        if (source.StartDateTime != null) {
            this.StartDateTime = new Long(source.StartDateTime);
        }
        if (source.EndDateTime != null) {
            this.EndDateTime = new Long(source.EndDateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDateTime", this.StartDateTime);
        this.setParamSimple(map, prefix + "EndDateTime", this.EndDateTime);

    }
}

