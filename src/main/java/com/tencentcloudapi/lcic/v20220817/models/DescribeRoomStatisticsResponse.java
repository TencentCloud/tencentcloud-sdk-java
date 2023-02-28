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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomStatisticsResponse extends AbstractModel{

    /**
    * 峰值在线成员人数。
    */
    @SerializedName("PeakMemberNumber")
    @Expose
    private Long PeakMemberNumber;

    /**
    * 累计在线人数。
    */
    @SerializedName("MemberNumber")
    @Expose
    private Long MemberNumber;

    /**
    * 记录总数。包含进入房间或者应到未到的。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 成员记录列表。
    */
    @SerializedName("MemberRecords")
    @Expose
    private MemberRecord [] MemberRecords;

    /**
    * 秒级unix时间戳，实际房间开始时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealStartTime")
    @Expose
    private Long RealStartTime;

    /**
    * 秒级unix时间戳，实际房间结束时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealEndTime")
    @Expose
    private Long RealEndTime;

    /**
    * 房间消息总数。
    */
    @SerializedName("MessageCount")
    @Expose
    private Long MessageCount;

    /**
    * 房间连麦总数。
    */
    @SerializedName("MicCount")
    @Expose
    private Long MicCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 峰值在线成员人数。 
     * @return PeakMemberNumber 峰值在线成员人数。
     */
    public Long getPeakMemberNumber() {
        return this.PeakMemberNumber;
    }

    /**
     * Set 峰值在线成员人数。
     * @param PeakMemberNumber 峰值在线成员人数。
     */
    public void setPeakMemberNumber(Long PeakMemberNumber) {
        this.PeakMemberNumber = PeakMemberNumber;
    }

    /**
     * Get 累计在线人数。 
     * @return MemberNumber 累计在线人数。
     */
    public Long getMemberNumber() {
        return this.MemberNumber;
    }

    /**
     * Set 累计在线人数。
     * @param MemberNumber 累计在线人数。
     */
    public void setMemberNumber(Long MemberNumber) {
        this.MemberNumber = MemberNumber;
    }

    /**
     * Get 记录总数。包含进入房间或者应到未到的。 
     * @return Total 记录总数。包含进入房间或者应到未到的。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 记录总数。包含进入房间或者应到未到的。
     * @param Total 记录总数。包含进入房间或者应到未到的。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 成员记录列表。 
     * @return MemberRecords 成员记录列表。
     */
    public MemberRecord [] getMemberRecords() {
        return this.MemberRecords;
    }

    /**
     * Set 成员记录列表。
     * @param MemberRecords 成员记录列表。
     */
    public void setMemberRecords(MemberRecord [] MemberRecords) {
        this.MemberRecords = MemberRecords;
    }

    /**
     * Get 秒级unix时间戳，实际房间开始时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealStartTime 秒级unix时间戳，实际房间开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealStartTime() {
        return this.RealStartTime;
    }

    /**
     * Set 秒级unix时间戳，实际房间开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealStartTime 秒级unix时间戳，实际房间开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealStartTime(Long RealStartTime) {
        this.RealStartTime = RealStartTime;
    }

    /**
     * Get 秒级unix时间戳，实际房间结束时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealEndTime 秒级unix时间戳，实际房间结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealEndTime() {
        return this.RealEndTime;
    }

    /**
     * Set 秒级unix时间戳，实际房间结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealEndTime 秒级unix时间戳，实际房间结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealEndTime(Long RealEndTime) {
        this.RealEndTime = RealEndTime;
    }

    /**
     * Get 房间消息总数。 
     * @return MessageCount 房间消息总数。
     */
    public Long getMessageCount() {
        return this.MessageCount;
    }

    /**
     * Set 房间消息总数。
     * @param MessageCount 房间消息总数。
     */
    public void setMessageCount(Long MessageCount) {
        this.MessageCount = MessageCount;
    }

    /**
     * Get 房间连麦总数。 
     * @return MicCount 房间连麦总数。
     */
    public Long getMicCount() {
        return this.MicCount;
    }

    /**
     * Set 房间连麦总数。
     * @param MicCount 房间连麦总数。
     */
    public void setMicCount(Long MicCount) {
        this.MicCount = MicCount;
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

    public DescribeRoomStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomStatisticsResponse(DescribeRoomStatisticsResponse source) {
        if (source.PeakMemberNumber != null) {
            this.PeakMemberNumber = new Long(source.PeakMemberNumber);
        }
        if (source.MemberNumber != null) {
            this.MemberNumber = new Long(source.MemberNumber);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.MemberRecords != null) {
            this.MemberRecords = new MemberRecord[source.MemberRecords.length];
            for (int i = 0; i < source.MemberRecords.length; i++) {
                this.MemberRecords[i] = new MemberRecord(source.MemberRecords[i]);
            }
        }
        if (source.RealStartTime != null) {
            this.RealStartTime = new Long(source.RealStartTime);
        }
        if (source.RealEndTime != null) {
            this.RealEndTime = new Long(source.RealEndTime);
        }
        if (source.MessageCount != null) {
            this.MessageCount = new Long(source.MessageCount);
        }
        if (source.MicCount != null) {
            this.MicCount = new Long(source.MicCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeakMemberNumber", this.PeakMemberNumber);
        this.setParamSimple(map, prefix + "MemberNumber", this.MemberNumber);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "MemberRecords.", this.MemberRecords);
        this.setParamSimple(map, prefix + "RealStartTime", this.RealStartTime);
        this.setParamSimple(map, prefix + "RealEndTime", this.RealEndTime);
        this.setParamSimple(map, prefix + "MessageCount", this.MessageCount);
        this.setParamSimple(map, prefix + "MicCount", this.MicCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

