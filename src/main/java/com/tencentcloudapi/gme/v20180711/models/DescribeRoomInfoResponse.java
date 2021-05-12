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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomInfoResponse extends AbstractModel{

    /**
    * 操作结果, 0成功, 非0失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 房间用户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoomUsers")
    @Expose
    private RoomUser [] RoomUsers;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 操作结果, 0成功, 非0失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 操作结果, 0成功, 非0失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 操作结果, 0成功, 非0失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 操作结果, 0成功, 非0失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 房间用户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoomUsers 房间用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoomUser [] getRoomUsers() {
        return this.RoomUsers;
    }

    /**
     * Set 房间用户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoomUsers 房间用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoomUsers(RoomUser [] RoomUsers) {
        this.RoomUsers = RoomUsers;
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

    public DescribeRoomInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomInfoResponse(DescribeRoomInfoResponse source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.RoomUsers != null) {
            this.RoomUsers = new RoomUser[source.RoomUsers.length];
            for (int i = 0; i < source.RoomUsers.length; i++) {
                this.RoomUsers[i] = new RoomUser(source.RoomUsers[i]);
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
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArrayObj(map, prefix + "RoomUsers.", this.RoomUsers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

