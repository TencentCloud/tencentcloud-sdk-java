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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchGetPlaybackTokenRequest extends AbstractModel {

    /**
    * <p>低代码平台的SdkAppId。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>房间ID。</p>
    */
    @SerializedName("RoomIds")
    @Expose
    private Long [] RoomIds;

    /**
    * <p>token过期时间，单位秒。如果传0则表示不过期</p>
    */
    @SerializedName("ExpireSeconds")
    @Expose
    private Long ExpireSeconds;

    /**
     * Get <p>低代码平台的SdkAppId。</p> 
     * @return SdkAppId <p>低代码平台的SdkAppId。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>低代码平台的SdkAppId。</p>
     * @param SdkAppId <p>低代码平台的SdkAppId。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>房间ID。</p> 
     * @return RoomIds <p>房间ID。</p>
     */
    public Long [] getRoomIds() {
        return this.RoomIds;
    }

    /**
     * Set <p>房间ID。</p>
     * @param RoomIds <p>房间ID。</p>
     */
    public void setRoomIds(Long [] RoomIds) {
        this.RoomIds = RoomIds;
    }

    /**
     * Get <p>token过期时间，单位秒。如果传0则表示不过期</p> 
     * @return ExpireSeconds <p>token过期时间，单位秒。如果传0则表示不过期</p>
     */
    public Long getExpireSeconds() {
        return this.ExpireSeconds;
    }

    /**
     * Set <p>token过期时间，单位秒。如果传0则表示不过期</p>
     * @param ExpireSeconds <p>token过期时间，单位秒。如果传0则表示不过期</p>
     */
    public void setExpireSeconds(Long ExpireSeconds) {
        this.ExpireSeconds = ExpireSeconds;
    }

    public BatchGetPlaybackTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchGetPlaybackTokenRequest(BatchGetPlaybackTokenRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomIds != null) {
            this.RoomIds = new Long[source.RoomIds.length];
            for (int i = 0; i < source.RoomIds.length; i++) {
                this.RoomIds[i] = new Long(source.RoomIds[i]);
            }
        }
        if (source.ExpireSeconds != null) {
            this.ExpireSeconds = new Long(source.ExpireSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "RoomIds.", this.RoomIds);
        this.setParamSimple(map, prefix + "ExpireSeconds", this.ExpireSeconds);

    }
}

