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
package com.tencentcloudapi.npp.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RreCallerHandle extends AbstractModel{

    /**
    * 呼叫主叫以后，给主叫用户的语音提示，播放该提示时用户所有按键无效
    */
    @SerializedName("ReadPrompt")
    @Expose
    private String ReadPrompt;

    /**
    * 可中断提示，播放该提示时，用户可以按键
    */
    @SerializedName("InterruptPrompt")
    @Expose
    private String InterruptPrompt;

    /**
    * 对应按键操作,如果没有结构体里定义按键操作用户按键以后都从 interruptPrompt 重新播放
    */
    @SerializedName("KeyList")
    @Expose
    private KeyList [] KeyList;

    /**
    * 最多重复播放次数，超过该次数拆线
    */
    @SerializedName("RepeatTimes")
    @Expose
    private String RepeatTimes;

    /**
    * 用户按键回调通知地址，如果为空不回调
    */
    @SerializedName("KeyPressUrl")
    @Expose
    private String KeyPressUrl;

    /**
    * 提示音男声女声：1女声，2男声。默认女声
    */
    @SerializedName("PromptGender")
    @Expose
    private String PromptGender;

    /**
     * Get 呼叫主叫以后，给主叫用户的语音提示，播放该提示时用户所有按键无效 
     * @return ReadPrompt 呼叫主叫以后，给主叫用户的语音提示，播放该提示时用户所有按键无效
     */
    public String getReadPrompt() {
        return this.ReadPrompt;
    }

    /**
     * Set 呼叫主叫以后，给主叫用户的语音提示，播放该提示时用户所有按键无效
     * @param ReadPrompt 呼叫主叫以后，给主叫用户的语音提示，播放该提示时用户所有按键无效
     */
    public void setReadPrompt(String ReadPrompt) {
        this.ReadPrompt = ReadPrompt;
    }

    /**
     * Get 可中断提示，播放该提示时，用户可以按键 
     * @return InterruptPrompt 可中断提示，播放该提示时，用户可以按键
     */
    public String getInterruptPrompt() {
        return this.InterruptPrompt;
    }

    /**
     * Set 可中断提示，播放该提示时，用户可以按键
     * @param InterruptPrompt 可中断提示，播放该提示时，用户可以按键
     */
    public void setInterruptPrompt(String InterruptPrompt) {
        this.InterruptPrompt = InterruptPrompt;
    }

    /**
     * Get 对应按键操作,如果没有结构体里定义按键操作用户按键以后都从 interruptPrompt 重新播放 
     * @return KeyList 对应按键操作,如果没有结构体里定义按键操作用户按键以后都从 interruptPrompt 重新播放
     */
    public KeyList [] getKeyList() {
        return this.KeyList;
    }

    /**
     * Set 对应按键操作,如果没有结构体里定义按键操作用户按键以后都从 interruptPrompt 重新播放
     * @param KeyList 对应按键操作,如果没有结构体里定义按键操作用户按键以后都从 interruptPrompt 重新播放
     */
    public void setKeyList(KeyList [] KeyList) {
        this.KeyList = KeyList;
    }

    /**
     * Get 最多重复播放次数，超过该次数拆线 
     * @return RepeatTimes 最多重复播放次数，超过该次数拆线
     */
    public String getRepeatTimes() {
        return this.RepeatTimes;
    }

    /**
     * Set 最多重复播放次数，超过该次数拆线
     * @param RepeatTimes 最多重复播放次数，超过该次数拆线
     */
    public void setRepeatTimes(String RepeatTimes) {
        this.RepeatTimes = RepeatTimes;
    }

    /**
     * Get 用户按键回调通知地址，如果为空不回调 
     * @return KeyPressUrl 用户按键回调通知地址，如果为空不回调
     */
    public String getKeyPressUrl() {
        return this.KeyPressUrl;
    }

    /**
     * Set 用户按键回调通知地址，如果为空不回调
     * @param KeyPressUrl 用户按键回调通知地址，如果为空不回调
     */
    public void setKeyPressUrl(String KeyPressUrl) {
        this.KeyPressUrl = KeyPressUrl;
    }

    /**
     * Get 提示音男声女声：1女声，2男声。默认女声 
     * @return PromptGender 提示音男声女声：1女声，2男声。默认女声
     */
    public String getPromptGender() {
        return this.PromptGender;
    }

    /**
     * Set 提示音男声女声：1女声，2男声。默认女声
     * @param PromptGender 提示音男声女声：1女声，2男声。默认女声
     */
    public void setPromptGender(String PromptGender) {
        this.PromptGender = PromptGender;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadPrompt", this.ReadPrompt);
        this.setParamSimple(map, prefix + "InterruptPrompt", this.InterruptPrompt);
        this.setParamArrayObj(map, prefix + "KeyList.", this.KeyList);
        this.setParamSimple(map, prefix + "RepeatTimes", this.RepeatTimes);
        this.setParamSimple(map, prefix + "KeyPressUrl", this.KeyPressUrl);
        this.setParamSimple(map, prefix + "PromptGender", this.PromptGender);

    }
}

