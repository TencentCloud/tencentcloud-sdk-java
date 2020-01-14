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

public class KeyList extends AbstractModel{

    /**
    * 用户按键（0-9、*、#、A-D)
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 1: 呼通被叫 2：interruptPrompt 重播提示 3：拆线
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
     * Get 用户按键（0-9、*、#、A-D) 
     * @return Key 用户按键（0-9、*、#、A-D)
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 用户按键（0-9、*、#、A-D)
     * @param Key 用户按键（0-9、*、#、A-D)
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 1: 呼通被叫 2：interruptPrompt 重播提示 3：拆线 
     * @return Operate 1: 呼通被叫 2：interruptPrompt 重播提示 3：拆线
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 1: 呼通被叫 2：interruptPrompt 重播提示 3：拆线
     * @param Operate 1: 呼通被叫 2：interruptPrompt 重播提示 3：拆线
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operate", this.Operate);

    }
}

