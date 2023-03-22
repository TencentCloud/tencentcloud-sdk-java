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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TRTCParams extends AbstractModel{

    /**
    * 应用id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SDKAppId")
    @Expose
    private Long SDKAppId;

    /**
    * 用户id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户id签名，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * 房间id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrRoomId")
    @Expose
    private String StrRoomId;

    /**
    * 权限票据，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateMapKey")
    @Expose
    private String PrivateMapKey;

    /**
     * Get 应用id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SDKAppId 应用id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSDKAppId() {
        return this.SDKAppId;
    }

    /**
     * Set 应用id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param SDKAppId 应用id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSDKAppId(Long SDKAppId) {
        this.SDKAppId = SDKAppId;
    }

    /**
     * Get 用户id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户id签名，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserSig 用户id签名，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set 用户id签名，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserSig 用户id签名，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get 房间id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrRoomId 房间id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrRoomId() {
        return this.StrRoomId;
    }

    /**
     * Set 房间id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrRoomId 房间id，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrRoomId(String StrRoomId) {
        this.StrRoomId = StrRoomId;
    }

    /**
     * Get 权限票据，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateMapKey 权限票据，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateMapKey() {
        return this.PrivateMapKey;
    }

    /**
     * Set 权限票据，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateMapKey 权限票据，供TRTC SDK使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateMapKey(String PrivateMapKey) {
        this.PrivateMapKey = PrivateMapKey;
    }

    public TRTCParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TRTCParams(TRTCParams source) {
        if (source.SDKAppId != null) {
            this.SDKAppId = new Long(source.SDKAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.StrRoomId != null) {
            this.StrRoomId = new String(source.StrRoomId);
        }
        if (source.PrivateMapKey != null) {
            this.PrivateMapKey = new String(source.PrivateMapKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SDKAppId", this.SDKAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamSimple(map, prefix + "StrRoomId", this.StrRoomId);
        this.setParamSimple(map, prefix + "PrivateMapKey", this.PrivateMapKey);

    }
}

