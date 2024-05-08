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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TRTCParams extends AbstractModel {

    /**
    * TRTC入参: TRTC的实例ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC入参: 用户加入房间的ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * TRTC入参: 用户的签名用来鉴权
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * TRTC入参: 加入的TRTC房间名称
    */
    @SerializedName("StrRoomId")
    @Expose
    private String StrRoomId;

    /**
    * TRTC入参: 校验TRTC的KEY
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
     * Get TRTC入参: TRTC的实例ID 
     * @return SdkAppId TRTC入参: TRTC的实例ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC入参: TRTC的实例ID
     * @param SdkAppId TRTC入参: TRTC的实例ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC入参: 用户加入房间的ID 
     * @return UserId TRTC入参: 用户加入房间的ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set TRTC入参: 用户加入房间的ID
     * @param UserId TRTC入参: 用户加入房间的ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get TRTC入参: 用户的签名用来鉴权 
     * @return UserSig TRTC入参: 用户的签名用来鉴权
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set TRTC入参: 用户的签名用来鉴权
     * @param UserSig TRTC入参: 用户的签名用来鉴权
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get TRTC入参: 加入的TRTC房间名称 
     * @return StrRoomId TRTC入参: 加入的TRTC房间名称
     */
    public String getStrRoomId() {
        return this.StrRoomId;
    }

    /**
     * Set TRTC入参: 加入的TRTC房间名称
     * @param StrRoomId TRTC入参: 加入的TRTC房间名称
     */
    public void setStrRoomId(String StrRoomId) {
        this.StrRoomId = StrRoomId;
    }

    /**
     * Get TRTC入参: 校验TRTC的KEY 
     * @return PrivateKey TRTC入参: 校验TRTC的KEY
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set TRTC入参: 校验TRTC的KEY
     * @param PrivateKey TRTC入参: 校验TRTC的KEY
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    public TRTCParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TRTCParams(TRTCParams source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
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
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamSimple(map, prefix + "StrRoomId", this.StrRoomId);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);

    }
}

