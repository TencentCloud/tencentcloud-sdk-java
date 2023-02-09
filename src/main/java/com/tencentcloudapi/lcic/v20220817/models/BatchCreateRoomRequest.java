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

public class BatchCreateRoomRequest extends AbstractModel{

    /**
    * 低代码平台的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 创建房间ID列表
    */
    @SerializedName("RoomInfos")
    @Expose
    private RoomInfo [] RoomInfos;

    /**
     * Get 低代码平台的SdkAppId。 
     * @return SdkAppId 低代码平台的SdkAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码平台的SdkAppId。
     * @param SdkAppId 低代码平台的SdkAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 创建房间ID列表 
     * @return RoomInfos 创建房间ID列表
     */
    public RoomInfo [] getRoomInfos() {
        return this.RoomInfos;
    }

    /**
     * Set 创建房间ID列表
     * @param RoomInfos 创建房间ID列表
     */
    public void setRoomInfos(RoomInfo [] RoomInfos) {
        this.RoomInfos = RoomInfos;
    }

    public BatchCreateRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateRoomRequest(BatchCreateRoomRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomInfos != null) {
            this.RoomInfos = new RoomInfo[source.RoomInfos.length];
            for (int i = 0; i < source.RoomInfos.length; i++) {
                this.RoomInfos[i] = new RoomInfo(source.RoomInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "RoomInfos.", this.RoomInfos);

    }
}

