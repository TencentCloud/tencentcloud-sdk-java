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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOnAudio extends AbstractModel {

    /**
    * <p>音频文件输入信息。注意：（1）音频流的编码格式支持：aac、ac3、eac3、flac、opus和mp3；（2）当转自适应码流模板中设置的切片类型为ts的时候，音频流的编码格式不能为flac。</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>音轨名称，如：中文、English。注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p>
    */
    @SerializedName("AudioName")
    @Expose
    private String AudioName;

    /**
    * <p>音轨语言，如：chi、eng，遵循 ISO 639-2</p>
    */
    @SerializedName("AudioLanguage")
    @Expose
    private String AudioLanguage;

    /**
    * <p>默认音频轨道。为true时指定当前音频为默认音频轨道，最多可指定1条默认音频轨道。</p><p>默认值：false</p>
    */
    @SerializedName("DefaultTrack")
    @Expose
    private Boolean DefaultTrack;

    /**
     * Get <p>音频文件输入信息。注意：（1）音频流的编码格式支持：aac、ac3、eac3、flac、opus和mp3；（2）当转自适应码流模板中设置的切片类型为ts的时候，音频流的编码格式不能为flac。</p> 
     * @return InputInfo <p>音频文件输入信息。注意：（1）音频流的编码格式支持：aac、ac3、eac3、flac、opus和mp3；（2）当转自适应码流模板中设置的切片类型为ts的时候，音频流的编码格式不能为flac。</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>音频文件输入信息。注意：（1）音频流的编码格式支持：aac、ac3、eac3、flac、opus和mp3；（2）当转自适应码流模板中设置的切片类型为ts的时候，音频流的编码格式不能为flac。</p>
     * @param InputInfo <p>音频文件输入信息。注意：（1）音频流的编码格式支持：aac、ac3、eac3、flac、opus和mp3；（2）当转自适应码流模板中设置的切片类型为ts的时候，音频流的编码格式不能为flac。</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>音轨名称，如：中文、English。注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p> 
     * @return AudioName <p>音轨名称，如：中文、English。注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p>
     */
    public String getAudioName() {
        return this.AudioName;
    }

    /**
     * Set <p>音轨名称，如：中文、English。注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p>
     * @param AudioName <p>音轨名称，如：中文、English。注意：仅支持中文、英文、数字、空格、下划线(_)、短横线(-)、句点(.)和中英文括号，长度不能超过64个字符。</p>
     */
    public void setAudioName(String AudioName) {
        this.AudioName = AudioName;
    }

    /**
     * Get <p>音轨语言，如：chi、eng，遵循 ISO 639-2</p> 
     * @return AudioLanguage <p>音轨语言，如：chi、eng，遵循 ISO 639-2</p>
     */
    public String getAudioLanguage() {
        return this.AudioLanguage;
    }

    /**
     * Set <p>音轨语言，如：chi、eng，遵循 ISO 639-2</p>
     * @param AudioLanguage <p>音轨语言，如：chi、eng，遵循 ISO 639-2</p>
     */
    public void setAudioLanguage(String AudioLanguage) {
        this.AudioLanguage = AudioLanguage;
    }

    /**
     * Get <p>默认音频轨道。为true时指定当前音频为默认音频轨道，最多可指定1条默认音频轨道。</p><p>默认值：false</p> 
     * @return DefaultTrack <p>默认音频轨道。为true时指定当前音频为默认音频轨道，最多可指定1条默认音频轨道。</p><p>默认值：false</p>
     */
    public Boolean getDefaultTrack() {
        return this.DefaultTrack;
    }

    /**
     * Set <p>默认音频轨道。为true时指定当前音频为默认音频轨道，最多可指定1条默认音频轨道。</p><p>默认值：false</p>
     * @param DefaultTrack <p>默认音频轨道。为true时指定当前音频为默认音频轨道，最多可指定1条默认音频轨道。</p><p>默认值：false</p>
     */
    public void setDefaultTrack(Boolean DefaultTrack) {
        this.DefaultTrack = DefaultTrack;
    }

    public AddOnAudio() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOnAudio(AddOnAudio source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.AudioName != null) {
            this.AudioName = new String(source.AudioName);
        }
        if (source.AudioLanguage != null) {
            this.AudioLanguage = new String(source.AudioLanguage);
        }
        if (source.DefaultTrack != null) {
            this.DefaultTrack = new Boolean(source.DefaultTrack);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "AudioName", this.AudioName);
        this.setParamSimple(map, prefix + "AudioLanguage", this.AudioLanguage);
        this.setParamSimple(map, prefix + "DefaultTrack", this.DefaultTrack);

    }
}

