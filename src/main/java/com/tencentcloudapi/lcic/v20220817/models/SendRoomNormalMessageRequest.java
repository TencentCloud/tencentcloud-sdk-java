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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendRoomNormalMessageRequest extends AbstractModel {

    /**
    * 低代码互动课堂的SdkAppId。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 房间ID。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 管理员指定消息发送方账号（若需设置 FromAccount 信息，则该参数取值不能为空）
    */
    @SerializedName("FromAccount")
    @Expose
    private String FromAccount;

    /**
    * 自定义消息
    */
    @SerializedName("MsgBody")
    @Expose
    private MsgBody [] MsgBody;

    /**
    * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）。
    */
    @SerializedName("CloudCustomData")
    @Expose
    private String CloudCustomData;

    /**
    * 昵称，当FromAccount没有在房间中，需要填写NickName，当FromAccount在房间中，填写NickName无意义
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

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
     * Get 房间ID。 
     * @return RoomId 房间ID。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID。
     * @param RoomId 房间ID。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 管理员指定消息发送方账号（若需设置 FromAccount 信息，则该参数取值不能为空） 
     * @return FromAccount 管理员指定消息发送方账号（若需设置 FromAccount 信息，则该参数取值不能为空）
     */
    public String getFromAccount() {
        return this.FromAccount;
    }

    /**
     * Set 管理员指定消息发送方账号（若需设置 FromAccount 信息，则该参数取值不能为空）
     * @param FromAccount 管理员指定消息发送方账号（若需设置 FromAccount 信息，则该参数取值不能为空）
     */
    public void setFromAccount(String FromAccount) {
        this.FromAccount = FromAccount;
    }

    /**
     * Get 自定义消息 
     * @return MsgBody 自定义消息
     */
    public MsgBody [] getMsgBody() {
        return this.MsgBody;
    }

    /**
     * Set 自定义消息
     * @param MsgBody 自定义消息
     */
    public void setMsgBody(MsgBody [] MsgBody) {
        this.MsgBody = MsgBody;
    }

    /**
     * Get 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）。 
     * @return CloudCustomData 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）。
     */
    public String getCloudCustomData() {
        return this.CloudCustomData;
    }

    /**
     * Set 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）。
     * @param CloudCustomData 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）。
     */
    public void setCloudCustomData(String CloudCustomData) {
        this.CloudCustomData = CloudCustomData;
    }

    /**
     * Get 昵称，当FromAccount没有在房间中，需要填写NickName，当FromAccount在房间中，填写NickName无意义 
     * @return NickName 昵称，当FromAccount没有在房间中，需要填写NickName，当FromAccount在房间中，填写NickName无意义
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称，当FromAccount没有在房间中，需要填写NickName，当FromAccount在房间中，填写NickName无意义
     * @param NickName 昵称，当FromAccount没有在房间中，需要填写NickName，当FromAccount在房间中，填写NickName无意义
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public SendRoomNormalMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendRoomNormalMessageRequest(SendRoomNormalMessageRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.FromAccount != null) {
            this.FromAccount = new String(source.FromAccount);
        }
        if (source.MsgBody != null) {
            this.MsgBody = new MsgBody[source.MsgBody.length];
            for (int i = 0; i < source.MsgBody.length; i++) {
                this.MsgBody[i] = new MsgBody(source.MsgBody[i]);
            }
        }
        if (source.CloudCustomData != null) {
            this.CloudCustomData = new String(source.CloudCustomData);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "FromAccount", this.FromAccount);
        this.setParamArrayObj(map, prefix + "MsgBody.", this.MsgBody);
        this.setParamSimple(map, prefix + "CloudCustomData", this.CloudCustomData);
        this.setParamSimple(map, prefix + "NickName", this.NickName);

    }
}

