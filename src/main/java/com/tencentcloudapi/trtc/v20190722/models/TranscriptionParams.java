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

public class TranscriptionParams extends AbstractModel {

    /**
    * 转录机器人的UserId，用于进房发起转录任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个转录任务时，机器人的userid也不能相互重复，否则会中断前一个任务。需要保证转录机器人UserId在房间内唯一。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 转录机器人UserId对应的校验签名，即UserId和UserSig相当于转录机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * IM[管理员账户](
https://cloud.tencent.com/document/product/269/31999#app-.E7.AE.A1.E7.90.86.E5.91.98)，如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。
    */
    @SerializedName("IMAdminUserId")
    @Expose
    private String IMAdminUserId;

    /**
    * IM管理员账户生成的签名，用于向特定群组发送消息。如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。必须和IM管理员的UserId一起填写。
    */
    @SerializedName("IMAdminUserSig")
    @Expose
    private String IMAdminUserSig;

    /**
    * 房间内推流用户全部退出后超过MaxIdleTime秒，后台自动关闭转录任务，默认值是60s。
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * 1表示机器人只订阅单个人的流，0表示机器人订阅整个房间的流，如果不填默认订阅整个房间的流。
    */
    @SerializedName("TranscriptionMode")
    @Expose
    private Long TranscriptionMode;

    /**
    * TranscriptionMode为1时必填，机器人只会拉该userid的流，忽略房间里其他用户。
    */
    @SerializedName("TargetUserId")
    @Expose
    private String TargetUserId;

    /**
    * 机器人订阅的用户列表
仅 TranscriptionMode 为 1或者 TranscriptionMode 为无限上麦模式支持传入多个用户列表
    */
    @SerializedName("TargetUserIdList")
    @Expose
    private String [] TargetUserIdList;

    /**
    * 声纹配置
    */
    @SerializedName("VoicePrint")
    @Expose
    private VoicePrint VoicePrint;

    /**
     * Get 转录机器人的UserId，用于进房发起转录任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个转录任务时，机器人的userid也不能相互重复，否则会中断前一个任务。需要保证转录机器人UserId在房间内唯一。 
     * @return UserId 转录机器人的UserId，用于进房发起转录任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个转录任务时，机器人的userid也不能相互重复，否则会中断前一个任务。需要保证转录机器人UserId在房间内唯一。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 转录机器人的UserId，用于进房发起转录任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个转录任务时，机器人的userid也不能相互重复，否则会中断前一个任务。需要保证转录机器人UserId在房间内唯一。
     * @param UserId 转录机器人的UserId，用于进房发起转录任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个转录任务时，机器人的userid也不能相互重复，否则会中断前一个任务。需要保证转录机器人UserId在房间内唯一。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 转录机器人UserId对应的校验签名，即UserId和UserSig相当于转录机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。 
     * @return UserSig 转录机器人UserId对应的校验签名，即UserId和UserSig相当于转录机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set 转录机器人UserId对应的校验签名，即UserId和UserSig相当于转录机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     * @param UserSig 转录机器人UserId对应的校验签名，即UserId和UserSig相当于转录机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get IM[管理员账户](
https://cloud.tencent.com/document/product/269/31999#app-.E7.AE.A1.E7.90.86.E5.91.98)，如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。 
     * @return IMAdminUserId IM[管理员账户](
https://cloud.tencent.com/document/product/269/31999#app-.E7.AE.A1.E7.90.86.E5.91.98)，如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。
     * @deprecated
     */
    @Deprecated
    public String getIMAdminUserId() {
        return this.IMAdminUserId;
    }

    /**
     * Set IM[管理员账户](
https://cloud.tencent.com/document/product/269/31999#app-.E7.AE.A1.E7.90.86.E5.91.98)，如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。
     * @param IMAdminUserId IM[管理员账户](
https://cloud.tencent.com/document/product/269/31999#app-.E7.AE.A1.E7.90.86.E5.91.98)，如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。
     * @deprecated
     */
    @Deprecated
    public void setIMAdminUserId(String IMAdminUserId) {
        this.IMAdminUserId = IMAdminUserId;
    }

    /**
     * Get IM管理员账户生成的签名，用于向特定群组发送消息。如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。必须和IM管理员的UserId一起填写。 
     * @return IMAdminUserSig IM管理员账户生成的签名，用于向特定群组发送消息。如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。必须和IM管理员的UserId一起填写。
     * @deprecated
     */
    @Deprecated
    public String getIMAdminUserSig() {
        return this.IMAdminUserSig;
    }

    /**
     * Set IM管理员账户生成的签名，用于向特定群组发送消息。如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。必须和IM管理员的UserId一起填写。
     * @param IMAdminUserSig IM管理员账户生成的签名，用于向特定群组发送消息。如果填写，后台下发消息会使用IM通道，而不是TRTC自定义消息。必须和IM管理员的UserId一起填写。
     * @deprecated
     */
    @Deprecated
    public void setIMAdminUserSig(String IMAdminUserSig) {
        this.IMAdminUserSig = IMAdminUserSig;
    }

    /**
     * Get 房间内推流用户全部退出后超过MaxIdleTime秒，后台自动关闭转录任务，默认值是60s。 
     * @return MaxIdleTime 房间内推流用户全部退出后超过MaxIdleTime秒，后台自动关闭转录任务，默认值是60s。
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set 房间内推流用户全部退出后超过MaxIdleTime秒，后台自动关闭转录任务，默认值是60s。
     * @param MaxIdleTime 房间内推流用户全部退出后超过MaxIdleTime秒，后台自动关闭转录任务，默认值是60s。
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get 1表示机器人只订阅单个人的流，0表示机器人订阅整个房间的流，如果不填默认订阅整个房间的流。 
     * @return TranscriptionMode 1表示机器人只订阅单个人的流，0表示机器人订阅整个房间的流，如果不填默认订阅整个房间的流。
     */
    public Long getTranscriptionMode() {
        return this.TranscriptionMode;
    }

    /**
     * Set 1表示机器人只订阅单个人的流，0表示机器人订阅整个房间的流，如果不填默认订阅整个房间的流。
     * @param TranscriptionMode 1表示机器人只订阅单个人的流，0表示机器人订阅整个房间的流，如果不填默认订阅整个房间的流。
     */
    public void setTranscriptionMode(Long TranscriptionMode) {
        this.TranscriptionMode = TranscriptionMode;
    }

    /**
     * Get TranscriptionMode为1时必填，机器人只会拉该userid的流，忽略房间里其他用户。 
     * @return TargetUserId TranscriptionMode为1时必填，机器人只会拉该userid的流，忽略房间里其他用户。
     */
    public String getTargetUserId() {
        return this.TargetUserId;
    }

    /**
     * Set TranscriptionMode为1时必填，机器人只会拉该userid的流，忽略房间里其他用户。
     * @param TargetUserId TranscriptionMode为1时必填，机器人只会拉该userid的流，忽略房间里其他用户。
     */
    public void setTargetUserId(String TargetUserId) {
        this.TargetUserId = TargetUserId;
    }

    /**
     * Get 机器人订阅的用户列表
仅 TranscriptionMode 为 1或者 TranscriptionMode 为无限上麦模式支持传入多个用户列表 
     * @return TargetUserIdList 机器人订阅的用户列表
仅 TranscriptionMode 为 1或者 TranscriptionMode 为无限上麦模式支持传入多个用户列表
     */
    public String [] getTargetUserIdList() {
        return this.TargetUserIdList;
    }

    /**
     * Set 机器人订阅的用户列表
仅 TranscriptionMode 为 1或者 TranscriptionMode 为无限上麦模式支持传入多个用户列表
     * @param TargetUserIdList 机器人订阅的用户列表
仅 TranscriptionMode 为 1或者 TranscriptionMode 为无限上麦模式支持传入多个用户列表
     */
    public void setTargetUserIdList(String [] TargetUserIdList) {
        this.TargetUserIdList = TargetUserIdList;
    }

    /**
     * Get 声纹配置 
     * @return VoicePrint 声纹配置
     */
    public VoicePrint getVoicePrint() {
        return this.VoicePrint;
    }

    /**
     * Set 声纹配置
     * @param VoicePrint 声纹配置
     */
    public void setVoicePrint(VoicePrint VoicePrint) {
        this.VoicePrint = VoicePrint;
    }

    public TranscriptionParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscriptionParams(TranscriptionParams source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.IMAdminUserId != null) {
            this.IMAdminUserId = new String(source.IMAdminUserId);
        }
        if (source.IMAdminUserSig != null) {
            this.IMAdminUserSig = new String(source.IMAdminUserSig);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.TranscriptionMode != null) {
            this.TranscriptionMode = new Long(source.TranscriptionMode);
        }
        if (source.TargetUserId != null) {
            this.TargetUserId = new String(source.TargetUserId);
        }
        if (source.TargetUserIdList != null) {
            this.TargetUserIdList = new String[source.TargetUserIdList.length];
            for (int i = 0; i < source.TargetUserIdList.length; i++) {
                this.TargetUserIdList[i] = new String(source.TargetUserIdList[i]);
            }
        }
        if (source.VoicePrint != null) {
            this.VoicePrint = new VoicePrint(source.VoicePrint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamSimple(map, prefix + "IMAdminUserId", this.IMAdminUserId);
        this.setParamSimple(map, prefix + "IMAdminUserSig", this.IMAdminUserSig);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "TranscriptionMode", this.TranscriptionMode);
        this.setParamSimple(map, prefix + "TargetUserId", this.TargetUserId);
        this.setParamArraySimple(map, prefix + "TargetUserIdList.", this.TargetUserIdList);
        this.setParamObj(map, prefix + "VoicePrint.", this.VoicePrint);

    }
}

