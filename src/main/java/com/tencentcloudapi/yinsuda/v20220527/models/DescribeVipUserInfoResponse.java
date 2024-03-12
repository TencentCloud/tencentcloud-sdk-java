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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVipUserInfoResponse extends AbstractModel {

    /**
    * 是否是会员。（0:不是会员 1:是会员）
    */
    @SerializedName("IsVip")
    @Expose
    private Long IsVip;

    /**
    * 主播id
    */
    @SerializedName("AnchorId")
    @Expose
    private String AnchorId;

    /**
    * 房间id
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 会员过期时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 会员状态。（-1:未开通过；1:已开通，未过期；2:已开通，已过期）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否是会员。（0:不是会员 1:是会员） 
     * @return IsVip 是否是会员。（0:不是会员 1:是会员）
     */
    public Long getIsVip() {
        return this.IsVip;
    }

    /**
     * Set 是否是会员。（0:不是会员 1:是会员）
     * @param IsVip 是否是会员。（0:不是会员 1:是会员）
     */
    public void setIsVip(Long IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get 主播id 
     * @return AnchorId 主播id
     */
    public String getAnchorId() {
        return this.AnchorId;
    }

    /**
     * Set 主播id
     * @param AnchorId 主播id
     */
    public void setAnchorId(String AnchorId) {
        this.AnchorId = AnchorId;
    }

    /**
     * Get 房间id 
     * @return RoomId 房间id
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间id
     * @param RoomId 房间id
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 会员过期时间 
     * @return EndTime 会员过期时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 会员过期时间
     * @param EndTime 会员过期时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 会员状态。（-1:未开通过；1:已开通，未过期；2:已开通，已过期） 
     * @return Status 会员状态。（-1:未开通过；1:已开通，未过期；2:已开通，已过期）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 会员状态。（-1:未开通过；1:已开通，未过期；2:已开通，已过期）
     * @param Status 会员状态。（-1:未开通过；1:已开通，未过期；2:已开通，已过期）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    public DescribeVipUserInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVipUserInfoResponse(DescribeVipUserInfoResponse source) {
        if (source.IsVip != null) {
            this.IsVip = new Long(source.IsVip);
        }
        if (source.AnchorId != null) {
            this.AnchorId = new String(source.AnchorId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "AnchorId", this.AnchorId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

