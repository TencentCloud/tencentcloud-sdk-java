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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Interrupt", this.Interrupt);
        this.setParamSimple(map, prefix + "StopAfterPlay", this.StopAfterPlay);

    }
}

