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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuFeedBackRoomParams extends AbstractModel {

    /**
    * <p>回推房间的RoomId。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>房间类型，必须和回推房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。</p>
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * <p>回推房间使用的UserId(https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转推服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>回推房间UserId对应的用户签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
     * Get <p>回推房间的RoomId。</p> 
     * @return RoomId <p>回推房间的RoomId。</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>回推房间的RoomId。</p>
     * @param RoomId <p>回推房间的RoomId。</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>房间类型，必须和回推房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。</p> 
     * @return RoomIdType <p>房间类型，必须和回推房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。</p>
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set <p>房间类型，必须和回推房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。</p>
     * @param RoomIdType <p>房间类型，必须和回推房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。</p>
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get <p>回推房间使用的UserId(https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转推服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p> 
     * @return UserId <p>回推房间使用的UserId(https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转推服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>回推房间使用的UserId(https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转推服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
     * @param UserId <p>回推房间使用的UserId(https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转推服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>回推房间UserId对应的用户签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p> 
     * @return UserSig <p>回推房间UserId对应的用户签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set <p>回推房间UserId对应的用户签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
     * @param UserSig <p>回推房间UserId对应的用户签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    public McuFeedBackRoomParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuFeedBackRoomParams(McuFeedBackRoomParams source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);

    }
}

