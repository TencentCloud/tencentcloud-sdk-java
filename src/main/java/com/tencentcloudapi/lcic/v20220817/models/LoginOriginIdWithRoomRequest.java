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

public class LoginOriginIdWithRoomRequest extends AbstractModel {

    /**
    * <p>低代码互动课堂的SdkAppId。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>用户在客户系统的Id，需要在同一应用下唯一。</p>
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * <p>课堂 ID</p>
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

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
     * Get <p>用户在客户系统的Id，需要在同一应用下唯一。</p> 
     * @return OriginId <p>用户在客户系统的Id，需要在同一应用下唯一。</p>
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set <p>用户在客户系统的Id，需要在同一应用下唯一。</p>
     * @param OriginId <p>用户在客户系统的Id，需要在同一应用下唯一。</p>
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get <p>课堂 ID</p> 
     * @return RoomId <p>课堂 ID</p>
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>课堂 ID</p>
     * @param RoomId <p>课堂 ID</p>
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    public LoginOriginIdWithRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginOriginIdWithRoomRequest(LoginOriginIdWithRoomRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

