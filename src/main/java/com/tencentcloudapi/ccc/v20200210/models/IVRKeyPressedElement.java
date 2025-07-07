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

public class IVRKeyPressedElement extends AbstractModel {

    /**
    * 命中的关键字或者按键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 按键关联的标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Unix 毫秒时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 节点标签
    */
    @SerializedName("NodeLabel")
    @Expose
    private String NodeLabel;

    /**
    * 用户原始输入
    */
    @SerializedName("OriginalContent")
    @Expose
    private String OriginalContent;

    /**
    * TTS 提示音内容
    */
    @SerializedName("TTSPrompt")
    @Expose
    private String TTSPrompt;

    /**
     * Get 命中的关键字或者按键 
     * @return Key 命中的关键字或者按键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 命中的关键字或者按键
     * @param Key 命中的关键字或者按键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 按键关联的标签 
     * @return Label 按键关联的标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 按键关联的标签
     * @param Label 按键关联的标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Unix 毫秒时间戳 
     * @return Timestamp Unix 毫秒时间戳
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Unix 毫秒时间戳
     * @param Timestamp Unix 毫秒时间戳
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 节点标签 
     * @return NodeLabel 节点标签
     */
    public String getNodeLabel() {
        return this.NodeLabel;
    }

    /**
     * Set 节点标签
     * @param NodeLabel 节点标签
     */
    public void setNodeLabel(String NodeLabel) {
        this.NodeLabel = NodeLabel;
    }

    /**
     * Get 用户原始输入 
     * @return OriginalContent 用户原始输入
     */
    public String getOriginalContent() {
        return this.OriginalContent;
    }

    /**
     * Set 用户原始输入
     * @param OriginalContent 用户原始输入
     */
    public void setOriginalContent(String OriginalContent) {
        this.OriginalContent = OriginalContent;
    }

    /**
     * Get TTS 提示音内容 
     * @return TTSPrompt TTS 提示音内容
     */
    public String getTTSPrompt() {
        return this.TTSPrompt;
    }

    /**
     * Set TTS 提示音内容
     * @param TTSPrompt TTS 提示音内容
     */
    public void setTTSPrompt(String TTSPrompt) {
        this.TTSPrompt = TTSPrompt;
    }

    public IVRKeyPressedElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IVRKeyPressedElement(IVRKeyPressedElement source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.NodeLabel != null) {
            this.NodeLabel = new String(source.NodeLabel);
        }
        if (source.OriginalContent != null) {
            this.OriginalContent = new String(source.OriginalContent);
        }
        if (source.TTSPrompt != null) {
            this.TTSPrompt = new String(source.TTSPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "NodeLabel", this.NodeLabel);
        this.setParamSimple(map, prefix + "OriginalContent", this.OriginalContent);
        this.setParamSimple(map, prefix + "TTSPrompt", this.TTSPrompt);

    }
}

