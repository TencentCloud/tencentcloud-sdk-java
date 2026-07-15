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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkConversationConfig extends AbstractModel {

    /**
    * 欢迎语
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
    * 欢迎语优先级。`0`=默认，`1`=高优不可打断
    */
    @SerializedName("WelcomeMessagePriority")
    @Expose
    private Long WelcomeMessagePriority;

    /**
    * 智能打断模式。`0`=服务端自动打断，`1`=端上发送打断信令
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * 打断词列表。AI 说话期间，仅当用户说出列表中的词才打断 AI；不会触发新的回复
    */
    @SerializedName("InterruptWordList")
    @Expose
    private String [] InterruptWordList;

    /**
     * Get 欢迎语 
     * @return WelcomeMessage 欢迎语
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set 欢迎语
     * @param WelcomeMessage 欢迎语
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    /**
     * Get 欢迎语优先级。`0`=默认，`1`=高优不可打断 
     * @return WelcomeMessagePriority 欢迎语优先级。`0`=默认，`1`=高优不可打断
     */
    public Long getWelcomeMessagePriority() {
        return this.WelcomeMessagePriority;
    }

    /**
     * Set 欢迎语优先级。`0`=默认，`1`=高优不可打断
     * @param WelcomeMessagePriority 欢迎语优先级。`0`=默认，`1`=高优不可打断
     */
    public void setWelcomeMessagePriority(Long WelcomeMessagePriority) {
        this.WelcomeMessagePriority = WelcomeMessagePriority;
    }

    /**
     * Get 智能打断模式。`0`=服务端自动打断，`1`=端上发送打断信令 
     * @return InterruptMode 智能打断模式。`0`=服务端自动打断，`1`=端上发送打断信令
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set 智能打断模式。`0`=服务端自动打断，`1`=端上发送打断信令
     * @param InterruptMode 智能打断模式。`0`=服务端自动打断，`1`=端上发送打断信令
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get 打断词列表。AI 说话期间，仅当用户说出列表中的词才打断 AI；不会触发新的回复 
     * @return InterruptWordList 打断词列表。AI 说话期间，仅当用户说出列表中的词才打断 AI；不会触发新的回复
     */
    public String [] getInterruptWordList() {
        return this.InterruptWordList;
    }

    /**
     * Set 打断词列表。AI 说话期间，仅当用户说出列表中的词才打断 AI；不会触发新的回复
     * @param InterruptWordList 打断词列表。AI 说话期间，仅当用户说出列表中的词才打断 AI；不会触发新的回复
     */
    public void setInterruptWordList(String [] InterruptWordList) {
        this.InterruptWordList = InterruptWordList;
    }

    public TalkConversationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkConversationConfig(TalkConversationConfig source) {
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
        if (source.WelcomeMessagePriority != null) {
            this.WelcomeMessagePriority = new Long(source.WelcomeMessagePriority);
        }
        if (source.InterruptMode != null) {
            this.InterruptMode = new Long(source.InterruptMode);
        }
        if (source.InterruptWordList != null) {
            this.InterruptWordList = new String[source.InterruptWordList.length];
            for (int i = 0; i < source.InterruptWordList.length; i++) {
                this.InterruptWordList[i] = new String(source.InterruptWordList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);
        this.setParamSimple(map, prefix + "WelcomeMessagePriority", this.WelcomeMessagePriority);
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamArraySimple(map, prefix + "InterruptWordList.", this.InterruptWordList);

    }
}

