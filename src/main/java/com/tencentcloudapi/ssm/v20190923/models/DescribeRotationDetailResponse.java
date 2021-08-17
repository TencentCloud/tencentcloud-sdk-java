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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRotationDetailResponse extends AbstractModel{

    /**
    * 否允许轮转，true表示开启轮转，false表示禁止轮转。
    */
    @SerializedName("EnableRotation")
    @Expose
    private Boolean EnableRotation;

    /**
    * 轮转的频率，以天为单位，默认为1天。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Frequency")
    @Expose
    private Long Frequency;

    /**
    * 最近一次轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestRotateTime")
    @Expose
    private String LatestRotateTime;

    /**
    * 下一次开始轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextRotateBeginTime")
    @Expose
    private String NextRotateBeginTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 否允许轮转，true表示开启轮转，false表示禁止轮转。 
     * @return EnableRotation 否允许轮转，true表示开启轮转，false表示禁止轮转。
     */
    public Boolean getEnableRotation() {
        return this.EnableRotation;
    }

    /**
     * Set 否允许轮转，true表示开启轮转，false表示禁止轮转。
     * @param EnableRotation 否允许轮转，true表示开启轮转，false表示禁止轮转。
     */
    public void setEnableRotation(Boolean EnableRotation) {
        this.EnableRotation = EnableRotation;
    }

    /**
     * Get 轮转的频率，以天为单位，默认为1天。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Frequency 轮转的频率，以天为单位，默认为1天。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 轮转的频率，以天为单位，默认为1天。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Frequency 轮转的频率，以天为单位，默认为1天。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrequency(Long Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get 最近一次轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestRotateTime 最近一次轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestRotateTime() {
        return this.LatestRotateTime;
    }

    /**
     * Set 最近一次轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestRotateTime 最近一次轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestRotateTime(String LatestRotateTime) {
        this.LatestRotateTime = LatestRotateTime;
    }

    /**
     * Get 下一次开始轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextRotateBeginTime 下一次开始轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextRotateBeginTime() {
        return this.NextRotateBeginTime;
    }

    /**
     * Set 下一次开始轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextRotateBeginTime 下一次开始轮转的时间，显式可见的时间字符串，格式 2006-01-02 15:04:05。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextRotateBeginTime(String NextRotateBeginTime) {
        this.NextRotateBeginTime = NextRotateBeginTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRotationDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRotationDetailResponse(DescribeRotationDetailResponse source) {
        if (source.EnableRotation != null) {
            this.EnableRotation = new Boolean(source.EnableRotation);
        }
        if (source.Frequency != null) {
            this.Frequency = new Long(source.Frequency);
        }
        if (source.LatestRotateTime != null) {
            this.LatestRotateTime = new String(source.LatestRotateTime);
        }
        if (source.NextRotateBeginTime != null) {
            this.NextRotateBeginTime = new String(source.NextRotateBeginTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableRotation", this.EnableRotation);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "LatestRotateTime", this.LatestRotateTime);
        this.setParamSimple(map, prefix + "NextRotateBeginTime", this.NextRotateBeginTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

