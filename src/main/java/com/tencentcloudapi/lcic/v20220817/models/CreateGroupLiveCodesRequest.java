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

public class CreateGroupLiveCodesRequest extends AbstractModel {

    /**
    * <p>低代码互动课堂的SdkAppId。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>房间ID。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * <p>分组数量。注：最大数量限制为30</p>
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
     * Get <p>低代码互动课堂的SdkAppId。</p> 
     * @return SdkAppId <p>低代码互动课堂的SdkAppId。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>低代码互动课堂的SdkAppId。</p>
     * @param SdkAppId <p>低代码互动课堂的SdkAppId。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>房间ID。</p> 
     * @return RoomId <p>房间ID。</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>房间ID。</p>
     * @param RoomId <p>房间ID。</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>分组数量。注：最大数量限制为30</p> 
     * @return Number <p>分组数量。注：最大数量限制为30</p>
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set <p>分组数量。注：最大数量限制为30</p>
     * @param Number <p>分组数量。注：最大数量限制为30</p>
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    public CreateGroupLiveCodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGroupLiveCodesRequest(CreateGroupLiveCodesRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Number", this.Number);

    }
}

