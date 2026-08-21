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
    * <p>转录服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * <p>转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。<br>使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p>
    */
    @SerializedName("SubscribeList")
    @Expose
    private TranscriptionUserInfoParams [] SubscribeList;

    /**
    * <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。<br>同一个用户同时在黑白名单时，以黑名单为主。</p>
    */
    @SerializedName("UnSubscribeList")
    @Expose
    private TranscriptionUserInfoParams [] UnSubscribeList;

    /**
    * <p>所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p>
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * <p>自定义数据模式： 0表示不开启自定义数据，1表示开启自定义数据。<br>不填默认为0，表示不开启自定义数据。</p>
    */
    @SerializedName("SendCustomMode")
    @Expose
    private Long SendCustomMode;

    /**
     * Get <p>转录服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p> 
     * @return UserId <p>转录服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>转录服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
     * @param UserId <p>转录服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者转录服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p> 
     * @return UserSig <p>转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set <p>转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
     * @param UserSig <p>转录服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get <p>转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。<br>使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p> 
     * @return SubscribeList <p>转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。<br>使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p>
     */
    public TranscriptionUserInfoParams [] getSubscribeList() {
        return this.SubscribeList;
    }

    /**
     * Set <p>转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。<br>使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p>
     * @param SubscribeList <p>转录用户白名单，开始服务时，为空或不填表示转录所有主播音频，填具体值表示转录指定主播音频。<br>使用黑白名单时，同一个用户同时在黑白名单时，以黑名单为主。</p>
     */
    public void setSubscribeList(TranscriptionUserInfoParams [] SubscribeList) {
        this.SubscribeList = SubscribeList;
    }

    /**
     * Get <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。<br>同一个用户同时在黑白名单时，以黑名单为主。</p> 
     * @return UnSubscribeList <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。<br>同一个用户同时在黑白名单时，以黑名单为主。</p>
     */
    public TranscriptionUserInfoParams [] getUnSubscribeList() {
        return this.UnSubscribeList;
    }

    /**
     * Set <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。<br>同一个用户同时在黑白名单时，以黑名单为主。</p>
     * @param UnSubscribeList <p>转录用户黑名单，为空或不填表示无黑名单，填具体值表示不转录指定主播音频。<br>同一个用户同时在黑白名单时，以黑名单为主。</p>
     */
    public void setUnSubscribeList(TranscriptionUserInfoParams [] UnSubscribeList) {
        this.UnSubscribeList = UnSubscribeList;
    }

    /**
     * Get <p>所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p> 
     * @return MaxIdleTime <p>所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p>
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set <p>所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p>
     * @param MaxIdleTime <p>所有参与转录的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转录任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p>
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get <p>自定义数据模式： 0表示不开启自定义数据，1表示开启自定义数据。<br>不填默认为0，表示不开启自定义数据。</p> 
     * @return SendCustomMode <p>自定义数据模式： 0表示不开启自定义数据，1表示开启自定义数据。<br>不填默认为0，表示不开启自定义数据。</p>
     */
    public Long getSendCustomMode() {
        return this.SendCustomMode;
    }

    /**
     * Set <p>自定义数据模式： 0表示不开启自定义数据，1表示开启自定义数据。<br>不填默认为0，表示不开启自定义数据。</p>
     * @param SendCustomMode <p>自定义数据模式： 0表示不开启自定义数据，1表示开启自定义数据。<br>不填默认为0，表示不开启自定义数据。</p>
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

