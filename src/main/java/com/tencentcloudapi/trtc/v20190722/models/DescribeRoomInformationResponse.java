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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomInformationResponse extends AbstractModel{

    /**
    * 返回当页数据总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 房间信息列表
    */
    @SerializedName("RoomList")
    @Expose
    private RoomState [] RoomList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回当页数据总数 
     * @return Total 返回当页数据总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 返回当页数据总数
     * @param Total 返回当页数据总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 房间信息列表 
     * @return RoomList 房间信息列表
     */
    public RoomState [] getRoomList() {
        return this.RoomList;
    }

    /**
     * Set 房间信息列表
     * @param RoomList 房间信息列表
     */
    public void setRoomList(RoomState [] RoomList) {
        this.RoomList = RoomList;
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

    public DescribeRoomInformationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomInformationResponse(DescribeRoomInformationResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RoomList != null) {
            this.RoomList = new RoomState[source.RoomList.length];
            for (int i = 0; i < source.RoomList.length; i++) {
                this.RoomList[i] = new RoomState(source.RoomList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "RoomList.", this.RoomList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

