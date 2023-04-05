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

public class GetRoomMessageRequest extends AbstractModel{

    /**
    * 低代码互动课堂的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 房间Id。	
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 消息序列。获取该序列以前的消息(不包含该seq消息)
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
    * 消息拉取的条数。最大数量不能超过套餐包限制。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 低代码互动课堂的SdkAppId。 
     * @return SdkAppId 低代码互动课堂的SdkAppId。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId。
     * @param SdkAppId 低代码互动课堂的SdkAppId。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 房间Id。	 
     * @return RoomId 房间Id。	
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间Id。	
     * @param RoomId 房间Id。	
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 消息序列。获取该序列以前的消息(不包含该seq消息) 
     * @return Seq 消息序列。获取该序列以前的消息(不包含该seq消息)
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * Set 消息序列。获取该序列以前的消息(不包含该seq消息)
     * @param Seq 消息序列。获取该序列以前的消息(不包含该seq消息)
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 消息拉取的条数。最大数量不能超过套餐包限制。 
     * @return Limit 消息拉取的条数。最大数量不能超过套餐包限制。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 消息拉取的条数。最大数量不能超过套餐包限制。
     * @param Limit 消息拉取的条数。最大数量不能超过套餐包限制。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public GetRoomMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRoomMessageRequest(GetRoomMessageRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.Seq != null) {
            this.Seq = new Long(source.Seq);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

