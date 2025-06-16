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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentConfig extends AbstractModel {

    /**
    * 机器人的UserId，用于进房发起任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个任务时，机器人的UserId也不能相互重复，否则会中断前一个任务。需要保证机器人UserId在房间内唯一。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * 机器人拉流的UserId, 填写后，机器人会拉取该UserId的流进行实时处理
    */
    @SerializedName("TargetUserId")
    @Expose
    private String TargetUserId;

    /**
    * 房间内超过MaxIdleTime 没有推流，后台自动关闭任务，默认值是60s。
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * 机器人的欢迎语
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
    * 智能打断模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * 控制新一轮对话的触发方式，默认为0。
- 0表示当服务端语音识别检测出的完整一句话后，自动触发一轮新的对话。
- 1表示客户端在收到字幕消息后，自行决定是否手动发送聊天信令触发一轮新的对话。
    */
    @SerializedName("TurnDetectionMode")
    @Expose
    private Long TurnDetectionMode;

    /**
    * 是否过滤掉用户只说了一个字的句子，true表示过滤，false表示不过滤，默认值为true
    */
    @SerializedName("FilterOneWord")
    @Expose
    private Boolean FilterOneWord;

    /**
    * 欢迎消息优先级，0默认，1高优，高优不能被打断。
    */
    @SerializedName("WelcomeMessagePriority")
    @Expose
    private Long WelcomeMessagePriority;

    /**
    * 用于过滤LLM返回内容，不播放括号中的内容。
1：中文括号（）
2：英文括号()
3：中文方括号【】
4：英文方括号[]
5：英文花括号{}
默认值为空，表示不进行过滤。
    */
    @SerializedName("FilterBracketsContent")
    @Expose
    private Long FilterBracketsContent;

    /**
    * 环境音设置
    */
    @SerializedName("AmbientSound")
    @Expose
    private AmbientSound AmbientSound;

    /**
    * 声纹配置
    */
    @SerializedName("VoicePrint")
    @Expose
    private VoicePrint VoicePrint;

    /**
    * 语义断句检测
    */
    @SerializedName("TurnDetection")
    @Expose
    private TurnDetection TurnDetection;

    /**
     * Get 机器人的UserId，用于进房发起任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个任务时，机器人的UserId也不能相互重复，否则会中断前一个任务。需要保证机器人UserId在房间内唯一。 
     * @return UserId 机器人的UserId，用于进房发起任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个任务时，机器人的UserId也不能相互重复，否则会中断前一个任务。需要保证机器人UserId在房间内唯一。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 机器人的UserId，用于进房发起任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个任务时，机器人的UserId也不能相互重复，否则会中断前一个任务。需要保证机器人UserId在房间内唯一。
     * @param UserId 机器人的UserId，用于进房发起任务。【注意】这个UserId不能与当前房间内的主播观众[UserId](https://cloud.tencent.com/document/product/647/46351#userid)重复。如果一个房间发起多个任务时，机器人的UserId也不能相互重复，否则会中断前一个任务。需要保证机器人UserId在房间内唯一。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。 
     * @return UserSig 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     * @param UserSig 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get 机器人拉流的UserId, 填写后，机器人会拉取该UserId的流进行实时处理 
     * @return TargetUserId 机器人拉流的UserId, 填写后，机器人会拉取该UserId的流进行实时处理
     */
    public String getTargetUserId() {
        return this.TargetUserId;
    }

    /**
     * Set 机器人拉流的UserId, 填写后，机器人会拉取该UserId的流进行实时处理
     * @param TargetUserId 机器人拉流的UserId, 填写后，机器人会拉取该UserId的流进行实时处理
     */
    public void setTargetUserId(String TargetUserId) {
        this.TargetUserId = TargetUserId;
    }

    /**
     * Get 房间内超过MaxIdleTime 没有推流，后台自动关闭任务，默认值是60s。 
     * @return MaxIdleTime 房间内超过MaxIdleTime 没有推流，后台自动关闭任务，默认值是60s。
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set 房间内超过MaxIdleTime 没有推流，后台自动关闭任务，默认值是60s。
     * @param MaxIdleTime 房间内超过MaxIdleTime 没有推流，后台自动关闭任务，默认值是60s。
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get 机器人的欢迎语 
     * @return WelcomeMessage 机器人的欢迎语
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set 机器人的欢迎语
     * @param WelcomeMessage 机器人的欢迎语
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    /**
     * Get 智能打断模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断 
     * @return InterruptMode 智能打断模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set 智能打断模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
     * @param InterruptMode 智能打断模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。 
     * @return InterruptSpeechDuration InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。
     * @param InterruptSpeechDuration InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get 控制新一轮对话的触发方式，默认为0。
- 0表示当服务端语音识别检测出的完整一句话后，自动触发一轮新的对话。
- 1表示客户端在收到字幕消息后，自行决定是否手动发送聊天信令触发一轮新的对话。 
     * @return TurnDetectionMode 控制新一轮对话的触发方式，默认为0。
- 0表示当服务端语音识别检测出的完整一句话后，自动触发一轮新的对话。
- 1表示客户端在收到字幕消息后，自行决定是否手动发送聊天信令触发一轮新的对话。
     */
    public Long getTurnDetectionMode() {
        return this.TurnDetectionMode;
    }

    /**
     * Set 控制新一轮对话的触发方式，默认为0。
- 0表示当服务端语音识别检测出的完整一句话后，自动触发一轮新的对话。
- 1表示客户端在收到字幕消息后，自行决定是否手动发送聊天信令触发一轮新的对话。
     * @param TurnDetectionMode 控制新一轮对话的触发方式，默认为0。
- 0表示当服务端语音识别检测出的完整一句话后，自动触发一轮新的对话。
- 1表示客户端在收到字幕消息后，自行决定是否手动发送聊天信令触发一轮新的对话。
     */
    public void setTurnDetectionMode(Long TurnDetectionMode) {
        this.TurnDetectionMode = TurnDetectionMode;
    }

    /**
     * Get 是否过滤掉用户只说了一个字的句子，true表示过滤，false表示不过滤，默认值为true 
     * @return FilterOneWord 是否过滤掉用户只说了一个字的句子，true表示过滤，false表示不过滤，默认值为true
     */
    public Boolean getFilterOneWord() {
        return this.FilterOneWord;
    }

    /**
     * Set 是否过滤掉用户只说了一个字的句子，true表示过滤，false表示不过滤，默认值为true
     * @param FilterOneWord 是否过滤掉用户只说了一个字的句子，true表示过滤，false表示不过滤，默认值为true
     */
    public void setFilterOneWord(Boolean FilterOneWord) {
        this.FilterOneWord = FilterOneWord;
    }

    /**
     * Get 欢迎消息优先级，0默认，1高优，高优不能被打断。 
     * @return WelcomeMessagePriority 欢迎消息优先级，0默认，1高优，高优不能被打断。
     */
    public Long getWelcomeMessagePriority() {
        return this.WelcomeMessagePriority;
    }

    /**
     * Set 欢迎消息优先级，0默认，1高优，高优不能被打断。
     * @param WelcomeMessagePriority 欢迎消息优先级，0默认，1高优，高优不能被打断。
     */
    public void setWelcomeMessagePriority(Long WelcomeMessagePriority) {
        this.WelcomeMessagePriority = WelcomeMessagePriority;
    }

    /**
     * Get 用于过滤LLM返回内容，不播放括号中的内容。
1：中文括号（）
2：英文括号()
3：中文方括号【】
4：英文方括号[]
5：英文花括号{}
默认值为空，表示不进行过滤。 
     * @return FilterBracketsContent 用于过滤LLM返回内容，不播放括号中的内容。
1：中文括号（）
2：英文括号()
3：中文方括号【】
4：英文方括号[]
5：英文花括号{}
默认值为空，表示不进行过滤。
     */
    public Long getFilterBracketsContent() {
        return this.FilterBracketsContent;
    }

    /**
     * Set 用于过滤LLM返回内容，不播放括号中的内容。
1：中文括号（）
2：英文括号()
3：中文方括号【】
4：英文方括号[]
5：英文花括号{}
默认值为空，表示不进行过滤。
     * @param FilterBracketsContent 用于过滤LLM返回内容，不播放括号中的内容。
1：中文括号（）
2：英文括号()
3：中文方括号【】
4：英文方括号[]
5：英文花括号{}
默认值为空，表示不进行过滤。
     */
    public void setFilterBracketsContent(Long FilterBracketsContent) {
        this.FilterBracketsContent = FilterBracketsContent;
    }

    /**
     * Get 环境音设置 
     * @return AmbientSound 环境音设置
     */
    public AmbientSound getAmbientSound() {
        return this.AmbientSound;
    }

    /**
     * Set 环境音设置
     * @param AmbientSound 环境音设置
     */
    public void setAmbientSound(AmbientSound AmbientSound) {
        this.AmbientSound = AmbientSound;
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

    /**
     * Get 语义断句检测 
     * @return TurnDetection 语义断句检测
     */
    public TurnDetection getTurnDetection() {
        return this.TurnDetection;
    }

    /**
     * Set 语义断句检测
     * @param TurnDetection 语义断句检测
     */
    public void setTurnDetection(TurnDetection TurnDetection) {
        this.TurnDetection = TurnDetection;
    }

    public AgentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentConfig(AgentConfig source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.TargetUserId != null) {
            this.TargetUserId = new String(source.TargetUserId);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
        if (source.InterruptMode != null) {
            this.InterruptMode = new Long(source.InterruptMode);
        }
        if (source.InterruptSpeechDuration != null) {
            this.InterruptSpeechDuration = new Long(source.InterruptSpeechDuration);
        }
        if (source.TurnDetectionMode != null) {
            this.TurnDetectionMode = new Long(source.TurnDetectionMode);
        }
        if (source.FilterOneWord != null) {
            this.FilterOneWord = new Boolean(source.FilterOneWord);
        }
        if (source.WelcomeMessagePriority != null) {
            this.WelcomeMessagePriority = new Long(source.WelcomeMessagePriority);
        }
        if (source.FilterBracketsContent != null) {
            this.FilterBracketsContent = new Long(source.FilterBracketsContent);
        }
        if (source.AmbientSound != null) {
            this.AmbientSound = new AmbientSound(source.AmbientSound);
        }
        if (source.VoicePrint != null) {
            this.VoicePrint = new VoicePrint(source.VoicePrint);
        }
        if (source.TurnDetection != null) {
            this.TurnDetection = new TurnDetection(source.TurnDetection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamSimple(map, prefix + "TargetUserId", this.TargetUserId);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamSimple(map, prefix + "TurnDetectionMode", this.TurnDetectionMode);
        this.setParamSimple(map, prefix + "FilterOneWord", this.FilterOneWord);
        this.setParamSimple(map, prefix + "WelcomeMessagePriority", this.WelcomeMessagePriority);
        this.setParamSimple(map, prefix + "FilterBracketsContent", this.FilterBracketsContent);
        this.setParamObj(map, prefix + "AmbientSound.", this.AmbientSound);
        this.setParamObj(map, prefix + "VoicePrint.", this.VoicePrint);
        this.setParamObj(map, prefix + "TurnDetection.", this.TurnDetection);

    }
}

