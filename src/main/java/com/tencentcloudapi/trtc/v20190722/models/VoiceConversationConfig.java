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

public class VoiceConversationConfig extends AbstractModel {

    /**
    * <p>对话服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者对话服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>对话服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * <p>对话服务订阅的主播名，订阅指定真实用户的音频，只能填写一个订阅主播。</p>
    */
    @SerializedName("TargetUserId")
    @Expose
    private String [] TargetUserId;

    /**
    * <p>回推机器人参数。</p>
    */
    @SerializedName("TTSPushRoomParams")
    @Expose
    private TranscriptionUserInfoParams TTSPushRoomParams;

    /**
    * <p>参与对话的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止对话任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p><p>单位：秒</p>
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * <p>用于过滤LLM返回内容，不播放括号中的内容。1：中文括号（）2：英文括号() 3：中文方括号【】4：英文方括号[] 5：英文花括号{} 。默认值为空，表示不进行过滤。 示例值：1取值范围：[1, 5]。S2S 模式不支持填写该参数。</p>
    */
    @SerializedName("FilterBracketsContent")
    @Expose
    private Long [] FilterBracketsContent;

    /**
    * <p>字幕显示模式。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>0： 尽快显示</li><li>1： 句子级别实时显示</li></ul>
    */
    @SerializedName("SubtitleMode")
    @Expose
    private Long SubtitleMode;

    /**
    * <p>控制新一轮对话的触发方式，默认为&quot;auto&quot;。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>&quot;auto&quot;： 后台自动识别断句触发LLM(基于静音时长)</li></ul>
    */
    @SerializedName("TurnDetectionMode")
    @Expose
    private String TurnDetectionMode;

    /**
     * Get <p>对话服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者对话服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p> 
     * @return UserId <p>对话服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者对话服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>对话服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者对话服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
     * @param UserId <p>对话服务在TRTC房间使用的<a href="https://cloud.tencent.com/document/product/647/46351#userid">UserId</a>，注意这个userId不能与其他TRTC或者对话服务等已经使用的UserId重复，建议可以把房间ID作为userId的标识的一部分。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>对话服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p> 
     * @return UserSig <p>对话服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set <p>对话服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
     * @param UserSig <p>对话服务加入TRTC房间的用户签名，当前 UserId 对应的验证签名，相当于登录密码，具体计算方法请参考TRTC计算<a href="https://cloud.tencent.com/document/product/647/45910#UserSig">UserSig</a>的方案。</p>
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get <p>对话服务订阅的主播名，订阅指定真实用户的音频，只能填写一个订阅主播。</p> 
     * @return TargetUserId <p>对话服务订阅的主播名，订阅指定真实用户的音频，只能填写一个订阅主播。</p>
     */
    public String [] getTargetUserId() {
        return this.TargetUserId;
    }

    /**
     * Set <p>对话服务订阅的主播名，订阅指定真实用户的音频，只能填写一个订阅主播。</p>
     * @param TargetUserId <p>对话服务订阅的主播名，订阅指定真实用户的音频，只能填写一个订阅主播。</p>
     */
    public void setTargetUserId(String [] TargetUserId) {
        this.TargetUserId = TargetUserId;
    }

    /**
     * Get <p>回推机器人参数。</p> 
     * @return TTSPushRoomParams <p>回推机器人参数。</p>
     */
    public TranscriptionUserInfoParams getTTSPushRoomParams() {
        return this.TTSPushRoomParams;
    }

    /**
     * Set <p>回推机器人参数。</p>
     * @param TTSPushRoomParams <p>回推机器人参数。</p>
     */
    public void setTTSPushRoomParams(TranscriptionUserInfoParams TTSPushRoomParams) {
        this.TTSPushRoomParams = TTSPushRoomParams;
    }

    /**
     * Get <p>参与对话的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止对话任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p><p>单位：秒</p> 
     * @return MaxIdleTime <p>参与对话的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止对话任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p><p>单位：秒</p>
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set <p>参与对话的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止对话任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p><p>单位：秒</p>
     * @param MaxIdleTime <p>参与对话的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止对话任务，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。</p><p>单位：秒</p>
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get <p>用于过滤LLM返回内容，不播放括号中的内容。1：中文括号（）2：英文括号() 3：中文方括号【】4：英文方括号[] 5：英文花括号{} 。默认值为空，表示不进行过滤。 示例值：1取值范围：[1, 5]。S2S 模式不支持填写该参数。</p> 
     * @return FilterBracketsContent <p>用于过滤LLM返回内容，不播放括号中的内容。1：中文括号（）2：英文括号() 3：中文方括号【】4：英文方括号[] 5：英文花括号{} 。默认值为空，表示不进行过滤。 示例值：1取值范围：[1, 5]。S2S 模式不支持填写该参数。</p>
     */
    public Long [] getFilterBracketsContent() {
        return this.FilterBracketsContent;
    }

    /**
     * Set <p>用于过滤LLM返回内容，不播放括号中的内容。1：中文括号（）2：英文括号() 3：中文方括号【】4：英文方括号[] 5：英文花括号{} 。默认值为空，表示不进行过滤。 示例值：1取值范围：[1, 5]。S2S 模式不支持填写该参数。</p>
     * @param FilterBracketsContent <p>用于过滤LLM返回内容，不播放括号中的内容。1：中文括号（）2：英文括号() 3：中文方括号【】4：英文方括号[] 5：英文花括号{} 。默认值为空，表示不进行过滤。 示例值：1取值范围：[1, 5]。S2S 模式不支持填写该参数。</p>
     */
    public void setFilterBracketsContent(Long [] FilterBracketsContent) {
        this.FilterBracketsContent = FilterBracketsContent;
    }

    /**
     * Get <p>字幕显示模式。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>0： 尽快显示</li><li>1： 句子级别实时显示</li></ul> 
     * @return SubtitleMode <p>字幕显示模式。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>0： 尽快显示</li><li>1： 句子级别实时显示</li></ul>
     */
    public Long getSubtitleMode() {
        return this.SubtitleMode;
    }

    /**
     * Set <p>字幕显示模式。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>0： 尽快显示</li><li>1： 句子级别实时显示</li></ul>
     * @param SubtitleMode <p>字幕显示模式。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>0： 尽快显示</li><li>1： 句子级别实时显示</li></ul>
     */
    public void setSubtitleMode(Long SubtitleMode) {
        this.SubtitleMode = SubtitleMode;
    }

    /**
     * Get <p>控制新一轮对话的触发方式，默认为&quot;auto&quot;。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>&quot;auto&quot;： 后台自动识别断句触发LLM(基于静音时长)</li></ul> 
     * @return TurnDetectionMode <p>控制新一轮对话的触发方式，默认为&quot;auto&quot;。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>&quot;auto&quot;： 后台自动识别断句触发LLM(基于静音时长)</li></ul>
     */
    public String getTurnDetectionMode() {
        return this.TurnDetectionMode;
    }

    /**
     * Set <p>控制新一轮对话的触发方式，默认为&quot;auto&quot;。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>&quot;auto&quot;： 后台自动识别断句触发LLM(基于静音时长)</li></ul>
     * @param TurnDetectionMode <p>控制新一轮对话的触发方式，默认为&quot;auto&quot;。S2S 模式不支持填写该参数。</p><p>枚举值：</p><ul><li>&quot;auto&quot;： 后台自动识别断句触发LLM(基于静音时长)</li></ul>
     */
    public void setTurnDetectionMode(String TurnDetectionMode) {
        this.TurnDetectionMode = TurnDetectionMode;
    }

    public VoiceConversationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationConfig(VoiceConversationConfig source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.TargetUserId != null) {
            this.TargetUserId = new String[source.TargetUserId.length];
            for (int i = 0; i < source.TargetUserId.length; i++) {
                this.TargetUserId[i] = new String(source.TargetUserId[i]);
            }
        }
        if (source.TTSPushRoomParams != null) {
            this.TTSPushRoomParams = new TranscriptionUserInfoParams(source.TTSPushRoomParams);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.FilterBracketsContent != null) {
            this.FilterBracketsContent = new Long[source.FilterBracketsContent.length];
            for (int i = 0; i < source.FilterBracketsContent.length; i++) {
                this.FilterBracketsContent[i] = new Long(source.FilterBracketsContent[i]);
            }
        }
        if (source.SubtitleMode != null) {
            this.SubtitleMode = new Long(source.SubtitleMode);
        }
        if (source.TurnDetectionMode != null) {
            this.TurnDetectionMode = new String(source.TurnDetectionMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamArraySimple(map, prefix + "TargetUserId.", this.TargetUserId);
        this.setParamObj(map, prefix + "TTSPushRoomParams.", this.TTSPushRoomParams);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamArraySimple(map, prefix + "FilterBracketsContent.", this.FilterBracketsContent);
        this.setParamSimple(map, prefix + "SubtitleMode", this.SubtitleMode);
        this.setParamSimple(map, prefix + "TurnDetectionMode", this.TurnDetectionMode);

    }
}

