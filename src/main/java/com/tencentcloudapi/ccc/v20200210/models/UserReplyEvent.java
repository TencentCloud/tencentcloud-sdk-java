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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserReplyEvent extends AbstractModel {

    /**
    * <p>ASR语音识别引擎将用户语音转换成的原始文本结果</p>
    */
    @SerializedName("ASRTranscript")
    @Expose
    private String ASRTranscript;

    /**
    * <p>命中画布中该对话节点配置的回复分类</p>
    */
    @SerializedName("MatchedIntent")
    @Expose
    private String MatchedIntent;

    /**
    * <p>用户回复分类的标签， json序列化后的信息</p>
    */
    @SerializedName("ExtractedSlots")
    @Expose
    private String ExtractedSlots;

    /**
    * <p>用户回复命中的分支类型</p><p>枚举值：</p><ul><li>Intent： 用户意图</li><li>Fallback： 兜底分支</li><li>NoResponse： 无响应跳转分支</li><li>SlotCollectionSuccess： 词槽收集完成跳转分支</li><li>SlotCollectionFail： 词槽收集失败跳转分支</li><li>GlobalIntent： 全局节点意图</li><li>LogicAnd： 逻辑判断节点 and</li><li>LogicOr： 逻辑判断节点 or</li><li>DTMF成功： DTMFSuccess</li><li>DTMF失败： DTMFFail</li><li>DTMF导航： DTMFNavigation</li><li>DTMF分机： DTMFExtension</li><li>DTMF收号： DTMFCollection</li><li>转接智能体节点失败： TransferAgentFail</li></ul>
    */
    @SerializedName("BranchType")
    @Expose
    private String BranchType;

    /**
     * Get <p>ASR语音识别引擎将用户语音转换成的原始文本结果</p> 
     * @return ASRTranscript <p>ASR语音识别引擎将用户语音转换成的原始文本结果</p>
     */
    public String getASRTranscript() {
        return this.ASRTranscript;
    }

    /**
     * Set <p>ASR语音识别引擎将用户语音转换成的原始文本结果</p>
     * @param ASRTranscript <p>ASR语音识别引擎将用户语音转换成的原始文本结果</p>
     */
    public void setASRTranscript(String ASRTranscript) {
        this.ASRTranscript = ASRTranscript;
    }

    /**
     * Get <p>命中画布中该对话节点配置的回复分类</p> 
     * @return MatchedIntent <p>命中画布中该对话节点配置的回复分类</p>
     */
    public String getMatchedIntent() {
        return this.MatchedIntent;
    }

    /**
     * Set <p>命中画布中该对话节点配置的回复分类</p>
     * @param MatchedIntent <p>命中画布中该对话节点配置的回复分类</p>
     */
    public void setMatchedIntent(String MatchedIntent) {
        this.MatchedIntent = MatchedIntent;
    }

    /**
     * Get <p>用户回复分类的标签， json序列化后的信息</p> 
     * @return ExtractedSlots <p>用户回复分类的标签， json序列化后的信息</p>
     */
    public String getExtractedSlots() {
        return this.ExtractedSlots;
    }

    /**
     * Set <p>用户回复分类的标签， json序列化后的信息</p>
     * @param ExtractedSlots <p>用户回复分类的标签， json序列化后的信息</p>
     */
    public void setExtractedSlots(String ExtractedSlots) {
        this.ExtractedSlots = ExtractedSlots;
    }

    /**
     * Get <p>用户回复命中的分支类型</p><p>枚举值：</p><ul><li>Intent： 用户意图</li><li>Fallback： 兜底分支</li><li>NoResponse： 无响应跳转分支</li><li>SlotCollectionSuccess： 词槽收集完成跳转分支</li><li>SlotCollectionFail： 词槽收集失败跳转分支</li><li>GlobalIntent： 全局节点意图</li><li>LogicAnd： 逻辑判断节点 and</li><li>LogicOr： 逻辑判断节点 or</li><li>DTMF成功： DTMFSuccess</li><li>DTMF失败： DTMFFail</li><li>DTMF导航： DTMFNavigation</li><li>DTMF分机： DTMFExtension</li><li>DTMF收号： DTMFCollection</li><li>转接智能体节点失败： TransferAgentFail</li></ul> 
     * @return BranchType <p>用户回复命中的分支类型</p><p>枚举值：</p><ul><li>Intent： 用户意图</li><li>Fallback： 兜底分支</li><li>NoResponse： 无响应跳转分支</li><li>SlotCollectionSuccess： 词槽收集完成跳转分支</li><li>SlotCollectionFail： 词槽收集失败跳转分支</li><li>GlobalIntent： 全局节点意图</li><li>LogicAnd： 逻辑判断节点 and</li><li>LogicOr： 逻辑判断节点 or</li><li>DTMF成功： DTMFSuccess</li><li>DTMF失败： DTMFFail</li><li>DTMF导航： DTMFNavigation</li><li>DTMF分机： DTMFExtension</li><li>DTMF收号： DTMFCollection</li><li>转接智能体节点失败： TransferAgentFail</li></ul>
     */
    public String getBranchType() {
        return this.BranchType;
    }

    /**
     * Set <p>用户回复命中的分支类型</p><p>枚举值：</p><ul><li>Intent： 用户意图</li><li>Fallback： 兜底分支</li><li>NoResponse： 无响应跳转分支</li><li>SlotCollectionSuccess： 词槽收集完成跳转分支</li><li>SlotCollectionFail： 词槽收集失败跳转分支</li><li>GlobalIntent： 全局节点意图</li><li>LogicAnd： 逻辑判断节点 and</li><li>LogicOr： 逻辑判断节点 or</li><li>DTMF成功： DTMFSuccess</li><li>DTMF失败： DTMFFail</li><li>DTMF导航： DTMFNavigation</li><li>DTMF分机： DTMFExtension</li><li>DTMF收号： DTMFCollection</li><li>转接智能体节点失败： TransferAgentFail</li></ul>
     * @param BranchType <p>用户回复命中的分支类型</p><p>枚举值：</p><ul><li>Intent： 用户意图</li><li>Fallback： 兜底分支</li><li>NoResponse： 无响应跳转分支</li><li>SlotCollectionSuccess： 词槽收集完成跳转分支</li><li>SlotCollectionFail： 词槽收集失败跳转分支</li><li>GlobalIntent： 全局节点意图</li><li>LogicAnd： 逻辑判断节点 and</li><li>LogicOr： 逻辑判断节点 or</li><li>DTMF成功： DTMFSuccess</li><li>DTMF失败： DTMFFail</li><li>DTMF导航： DTMFNavigation</li><li>DTMF分机： DTMFExtension</li><li>DTMF收号： DTMFCollection</li><li>转接智能体节点失败： TransferAgentFail</li></ul>
     */
    public void setBranchType(String BranchType) {
        this.BranchType = BranchType;
    }

    public UserReplyEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserReplyEvent(UserReplyEvent source) {
        if (source.ASRTranscript != null) {
            this.ASRTranscript = new String(source.ASRTranscript);
        }
        if (source.MatchedIntent != null) {
            this.MatchedIntent = new String(source.MatchedIntent);
        }
        if (source.ExtractedSlots != null) {
            this.ExtractedSlots = new String(source.ExtractedSlots);
        }
        if (source.BranchType != null) {
            this.BranchType = new String(source.BranchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ASRTranscript", this.ASRTranscript);
        this.setParamSimple(map, prefix + "MatchedIntent", this.MatchedIntent);
        this.setParamSimple(map, prefix + "ExtractedSlots", this.ExtractedSlots);
        this.setParamSimple(map, prefix + "BranchType", this.BranchType);

    }
}

