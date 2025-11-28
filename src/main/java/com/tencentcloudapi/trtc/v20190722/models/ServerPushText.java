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

public class ServerPushText extends AbstractModel {

    /**
    * 服务端推送播报文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 是否允许该文本打断机器人说话
    */
    @SerializedName("Interrupt")
    @Expose
    private Boolean Interrupt;

    /**
    * 播报完文本后，是否自动关闭对话任务
    */
    @SerializedName("StopAfterPlay")
    @Expose
    private Boolean StopAfterPlay;

    /**
    * 服务端推送播报音频
    格式说明：音频必须为单声道，采样率必须跟对应TTS的采样率保持一致，编码为Base64字符串。
    输入规则：当提供Audio字段时，将不接受Text字段的输入。系统将直接播放Audio字段中的音频内容。
    */
    @SerializedName("Audio")
    @Expose
    private String Audio;

    /**
    * 默认为0，仅在Interrupt为false时有效
- 0表示当前有交互发生时，会丢弃Interrupt为false的消息
- 1表示当前有交互发生时，不会丢弃Interrupt为false的消息，而是缓存下来，等待当前交互结束后，再去处理

注意：DropMode为1时，允许缓存多个消息，如果后续出现了打断，缓存的消息会被清空
    */
    @SerializedName("DropMode")
    @Expose
    private Long DropMode;

    /**
    * ServerPushText消息的优先级，0表示可被打断，1表示不会被打断。**目前仅支持传入0，如果需要传入1，请提工单联系我们添加权限。**
注意：在接收到Priority=1的消息后，后续其他任何消息都会被忽略（包括Priority=1的消息），直到Priority=1的消息处理结束。该字段可与Interrupt、DropMode字段配合使用。
例子：
- Priority=1、Interrupt=true，会打断现有交互，立刻播报，播报过程中不会被打断
- Priority=1、Interrupt=false、DropMode=1，会等待当前交互结束，再进行播报，播报过程中不会被打断

    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 是否将文本加入到llm历史上下文中
    */
    @SerializedName("AddHistory")
    @Expose
    private Boolean AddHistory;

    /**
    * 如果填写，会和字幕绑定发送到端上，注意确保内容为json字符串
    */
    @SerializedName("MetaInfo")
    @Expose
    private String MetaInfo;

    /**
     * Get 服务端推送播报文本 
     * @return Text 服务端推送播报文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 服务端推送播报文本
     * @param Text 服务端推送播报文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 是否允许该文本打断机器人说话 
     * @return Interrupt 是否允许该文本打断机器人说话
     */
    public Boolean getInterrupt() {
        return this.Interrupt;
    }

    /**
     * Set 是否允许该文本打断机器人说话
     * @param Interrupt 是否允许该文本打断机器人说话
     */
    public void setInterrupt(Boolean Interrupt) {
        this.Interrupt = Interrupt;
    }

    /**
     * Get 播报完文本后，是否自动关闭对话任务 
     * @return StopAfterPlay 播报完文本后，是否自动关闭对话任务
     */
    public Boolean getStopAfterPlay() {
        return this.StopAfterPlay;
    }

    /**
     * Set 播报完文本后，是否自动关闭对话任务
     * @param StopAfterPlay 播报完文本后，是否自动关闭对话任务
     */
    public void setStopAfterPlay(Boolean StopAfterPlay) {
        this.StopAfterPlay = StopAfterPlay;
    }

    /**
     * Get 服务端推送播报音频
    格式说明：音频必须为单声道，采样率必须跟对应TTS的采样率保持一致，编码为Base64字符串。
    输入规则：当提供Audio字段时，将不接受Text字段的输入。系统将直接播放Audio字段中的音频内容。 
     * @return Audio 服务端推送播报音频
    格式说明：音频必须为单声道，采样率必须跟对应TTS的采样率保持一致，编码为Base64字符串。
    输入规则：当提供Audio字段时，将不接受Text字段的输入。系统将直接播放Audio字段中的音频内容。
     */
    public String getAudio() {
        return this.Audio;
    }

    /**
     * Set 服务端推送播报音频
    格式说明：音频必须为单声道，采样率必须跟对应TTS的采样率保持一致，编码为Base64字符串。
    输入规则：当提供Audio字段时，将不接受Text字段的输入。系统将直接播放Audio字段中的音频内容。
     * @param Audio 服务端推送播报音频
    格式说明：音频必须为单声道，采样率必须跟对应TTS的采样率保持一致，编码为Base64字符串。
    输入规则：当提供Audio字段时，将不接受Text字段的输入。系统将直接播放Audio字段中的音频内容。
     */
    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    /**
     * Get 默认为0，仅在Interrupt为false时有效
- 0表示当前有交互发生时，会丢弃Interrupt为false的消息
- 1表示当前有交互发生时，不会丢弃Interrupt为false的消息，而是缓存下来，等待当前交互结束后，再去处理

注意：DropMode为1时，允许缓存多个消息，如果后续出现了打断，缓存的消息会被清空 
     * @return DropMode 默认为0，仅在Interrupt为false时有效
- 0表示当前有交互发生时，会丢弃Interrupt为false的消息
- 1表示当前有交互发生时，不会丢弃Interrupt为false的消息，而是缓存下来，等待当前交互结束后，再去处理

注意：DropMode为1时，允许缓存多个消息，如果后续出现了打断，缓存的消息会被清空
     */
    public Long getDropMode() {
        return this.DropMode;
    }

    /**
     * Set 默认为0，仅在Interrupt为false时有效
- 0表示当前有交互发生时，会丢弃Interrupt为false的消息
- 1表示当前有交互发生时，不会丢弃Interrupt为false的消息，而是缓存下来，等待当前交互结束后，再去处理

注意：DropMode为1时，允许缓存多个消息，如果后续出现了打断，缓存的消息会被清空
     * @param DropMode 默认为0，仅在Interrupt为false时有效
- 0表示当前有交互发生时，会丢弃Interrupt为false的消息
- 1表示当前有交互发生时，不会丢弃Interrupt为false的消息，而是缓存下来，等待当前交互结束后，再去处理

注意：DropMode为1时，允许缓存多个消息，如果后续出现了打断，缓存的消息会被清空
     */
    public void setDropMode(Long DropMode) {
        this.DropMode = DropMode;
    }

    /**
     * Get ServerPushText消息的优先级，0表示可被打断，1表示不会被打断。**目前仅支持传入0，如果需要传入1，请提工单联系我们添加权限。**
注意：在接收到Priority=1的消息后，后续其他任何消息都会被忽略（包括Priority=1的消息），直到Priority=1的消息处理结束。该字段可与Interrupt、DropMode字段配合使用。
例子：
- Priority=1、Interrupt=true，会打断现有交互，立刻播报，播报过程中不会被打断
- Priority=1、Interrupt=false、DropMode=1，会等待当前交互结束，再进行播报，播报过程中不会被打断
 
     * @return Priority ServerPushText消息的优先级，0表示可被打断，1表示不会被打断。**目前仅支持传入0，如果需要传入1，请提工单联系我们添加权限。**
注意：在接收到Priority=1的消息后，后续其他任何消息都会被忽略（包括Priority=1的消息），直到Priority=1的消息处理结束。该字段可与Interrupt、DropMode字段配合使用。
例子：
- Priority=1、Interrupt=true，会打断现有交互，立刻播报，播报过程中不会被打断
- Priority=1、Interrupt=false、DropMode=1，会等待当前交互结束，再进行播报，播报过程中不会被打断

     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set ServerPushText消息的优先级，0表示可被打断，1表示不会被打断。**目前仅支持传入0，如果需要传入1，请提工单联系我们添加权限。**
注意：在接收到Priority=1的消息后，后续其他任何消息都会被忽略（包括Priority=1的消息），直到Priority=1的消息处理结束。该字段可与Interrupt、DropMode字段配合使用。
例子：
- Priority=1、Interrupt=true，会打断现有交互，立刻播报，播报过程中不会被打断
- Priority=1、Interrupt=false、DropMode=1，会等待当前交互结束，再进行播报，播报过程中不会被打断

     * @param Priority ServerPushText消息的优先级，0表示可被打断，1表示不会被打断。**目前仅支持传入0，如果需要传入1，请提工单联系我们添加权限。**
注意：在接收到Priority=1的消息后，后续其他任何消息都会被忽略（包括Priority=1的消息），直到Priority=1的消息处理结束。该字段可与Interrupt、DropMode字段配合使用。
例子：
- Priority=1、Interrupt=true，会打断现有交互，立刻播报，播报过程中不会被打断
- Priority=1、Interrupt=false、DropMode=1，会等待当前交互结束，再进行播报，播报过程中不会被打断

     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 是否将文本加入到llm历史上下文中 
     * @return AddHistory 是否将文本加入到llm历史上下文中
     */
    public Boolean getAddHistory() {
        return this.AddHistory;
    }

    /**
     * Set 是否将文本加入到llm历史上下文中
     * @param AddHistory 是否将文本加入到llm历史上下文中
     */
    public void setAddHistory(Boolean AddHistory) {
        this.AddHistory = AddHistory;
    }

    /**
     * Get 如果填写，会和字幕绑定发送到端上，注意确保内容为json字符串 
     * @return MetaInfo 如果填写，会和字幕绑定发送到端上，注意确保内容为json字符串
     */
    public String getMetaInfo() {
        return this.MetaInfo;
    }

    /**
     * Set 如果填写，会和字幕绑定发送到端上，注意确保内容为json字符串
     * @param MetaInfo 如果填写，会和字幕绑定发送到端上，注意确保内容为json字符串
     */
    public void setMetaInfo(String MetaInfo) {
        this.MetaInfo = MetaInfo;
    }

    public ServerPushText() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerPushText(ServerPushText source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Interrupt != null) {
            this.Interrupt = new Boolean(source.Interrupt);
        }
        if (source.StopAfterPlay != null) {
            this.StopAfterPlay = new Boolean(source.StopAfterPlay);
        }
        if (source.Audio != null) {
            this.Audio = new String(source.Audio);
        }
        if (source.DropMode != null) {
            this.DropMode = new Long(source.DropMode);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.AddHistory != null) {
            this.AddHistory = new Boolean(source.AddHistory);
        }
        if (source.MetaInfo != null) {
            this.MetaInfo = new String(source.MetaInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Interrupt", this.Interrupt);
        this.setParamSimple(map, prefix + "StopAfterPlay", this.StopAfterPlay);
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamSimple(map, prefix + "DropMode", this.DropMode);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "AddHistory", this.AddHistory);
        this.setParamSimple(map, prefix + "MetaInfo", this.MetaInfo);

    }
}

