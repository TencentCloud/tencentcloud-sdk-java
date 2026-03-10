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

public class TranscriptionParam extends AbstractModel {

    /**
    * 转录服务在TRTC房间使用的[UserId](https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * 转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。
使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。
    */
    @SerializedName("SubscribeList")
    @Expose
    private TranscriptionUserInfoParams [] SubscribeList;

    /**
    * 转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。
同一个用户同时在黑白名单时，以黑名单为主。
    */
    @SerializedName("UnSubscribeList")
    @Expose
    private TranscriptionUserInfoParams [] UnSubscribeList;

    /**
    * 所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * 自定义通道：支持自定义信息，只可以填0-2， 0表示不开启自定义通道，1表示开启自定义数据，2表示开启自定义消息。不填默认不开启自定义通道。注意：填1自定义数据只对 SDK版本 >= 5.15.0生效。
    */
    @SerializedName("SendCustomMode")
    @Expose
    private Long SendCustomMode;

    /**
     * Get 转录服务在TRTC房间使用的[UserId](https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。 
     * @return UserId 转录服务在TRTC房间使用的[UserId](https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 转录服务在TRTC房间使用的[UserId](https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。
     * @param UserId 转录服务在TRTC房间使用的[UserId](https://cloud.tencent.com/document/product/647/46351#userid)，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。 
     * @return UserSig 转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set 转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     * @param UserSig 转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get 转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。
使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。 
     * @return SubscribeList 转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。
使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。
     */
    public TranscriptionUserInfoParams [] getSubscribeList() {
        return this.SubscribeList;
    }

    /**
     * Set 转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。
使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。
     * @param SubscribeList 转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。
使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。
     */
    public void setSubscribeList(TranscriptionUserInfoParams [] SubscribeList) {
        this.SubscribeList = SubscribeList;
    }

    /**
     * Get 转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。
同一个用户同时在黑白名单时，以黑名单为主。 
     * @return UnSubscribeList 转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。
同一个用户同时在黑白名单时，以黑名单为主。
     */
    public TranscriptionUserInfoParams [] getUnSubscribeList() {
        return this.UnSubscribeList;
    }

    /**
     * Set 转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。
同一个用户同时在黑白名单时，以黑名单为主。
     * @param UnSubscribeList 转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。
同一个用户同时在黑白名单时，以黑名单为主。
     */
    public void setUnSubscribeList(TranscriptionUserInfoParams [] UnSubscribeList) {
        this.UnSubscribeList = UnSubscribeList;
    }

    /**
     * Get 所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。 
     * @return MaxIdleTime 所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set 所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
     * @param MaxIdleTime 所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get 自定义通道：支持自定义信息，只可以填0-2， 0表示不开启自定义通道，1表示开启自定义数据，2表示开启自定义消息。不填默认不开启自定义通道。注意：填1自定义数据只对 SDK版本 >= 5.15.0生效。 
     * @return SendCustomMode 自定义通道：支持自定义信息，只可以填0-2， 0表示不开启自定义通道，1表示开启自定义数据，2表示开启自定义消息。不填默认不开启自定义通道。注意：填1自定义数据只对 SDK版本 >= 5.15.0生效。
     */
    public Long getSendCustomMode() {
        return this.SendCustomMode;
    }

    /**
     * Set 自定义通道：支持自定义信息，只可以填0-2， 0表示不开启自定义通道，1表示开启自定义数据，2表示开启自定义消息。不填默认不开启自定义通道。注意：填1自定义数据只对 SDK版本 >= 5.15.0生效。
     * @param SendCustomMode 自定义通道：支持自定义信息，只可以填0-2， 0表示不开启自定义通道，1表示开启自定义数据，2表示开启自定义消息。不填默认不开启自定义通道。注意：填1自定义数据只对 SDK版本 >= 5.15.0生效。
     */
    public void setSendCustomMode(Long SendCustomMode) {
        this.SendCustomMode = SendCustomMode;
    }

    public TranscriptionParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscriptionParam(TranscriptionParam source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.SubscribeList != null) {
            this.SubscribeList = new TranscriptionUserInfoParams[source.SubscribeList.length];
            for (int i = 0; i < source.SubscribeList.length; i++) {
                this.SubscribeList[i] = new TranscriptionUserInfoParams(source.SubscribeList[i]);
            }
        }
        if (source.UnSubscribeList != null) {
            this.UnSubscribeList = new TranscriptionUserInfoParams[source.UnSubscribeList.length];
            for (int i = 0; i < source.UnSubscribeList.length; i++) {
                this.UnSubscribeList[i] = new TranscriptionUserInfoParams(source.UnSubscribeList[i]);
            }
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.SendCustomMode != null) {
            this.SendCustomMode = new Long(source.SendCustomMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamArrayObj(map, prefix + "SubscribeList.", this.SubscribeList);
        this.setParamArrayObj(map, prefix + "UnSubscribeList.", this.UnSubscribeList);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "SendCustomMode", this.SendCustomMode);

    }
}

