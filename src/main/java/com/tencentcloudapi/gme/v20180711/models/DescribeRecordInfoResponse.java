/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordInfoResponse extends AbstractModel {

    /**
    * 录制信息。
    */
    @SerializedName("RecordInfo")
    @Expose
    private RecordInfo [] RecordInfo;

    /**
    * 录制类型：1代表单流 2代表混流 3代表单流和混流。
    */
    @SerializedName("RecordMode")
    @Expose
    private Long RecordMode;

    /**
    * 房间ID。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 录制信息。 
     * @return RecordInfo 录制信息。
     */
    public RecordInfo [] getRecordInfo() {
        return this.RecordInfo;
    }

    /**
     * Set 录制信息。
     * @param RecordInfo 录制信息。
     */
    public void setRecordInfo(RecordInfo [] RecordInfo) {
        this.RecordInfo = RecordInfo;
    }

    /**
     * Get 录制类型：1代表单流 2代表混流 3代表单流和混流。 
     * @return RecordMode 录制类型：1代表单流 2代表混流 3代表单流和混流。
     */
    public Long getRecordMode() {
        return this.RecordMode;
    }

    /**
     * Set 录制类型：1代表单流 2代表混流 3代表单流和混流。
     * @param RecordMode 录制类型：1代表单流 2代表混流 3代表单流和混流。
     */
    public void setRecordMode(Long RecordMode) {
        this.RecordMode = RecordMode;
    }

    /**
     * Get 房间ID。 
     * @return RoomId 房间ID。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID。
     * @param RoomId 房间ID。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRecordInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordInfoResponse(DescribeRecordInfoResponse source) {
        if (source.RecordInfo != null) {
            this.RecordInfo = new RecordInfo[source.RecordInfo.length];
            for (int i = 0; i < source.RecordInfo.length; i++) {
                this.RecordInfo[i] = new RecordInfo(source.RecordInfo[i]);
            }
        }
        if (source.RecordMode != null) {
            this.RecordMode = new Long(source.RecordMode);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordInfo.", this.RecordInfo);
        this.setParamSimple(map, prefix + "RecordMode", this.RecordMode);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

