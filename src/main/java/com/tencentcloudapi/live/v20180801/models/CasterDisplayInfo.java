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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CasterDisplayInfo extends AbstractModel {

    /**
    * 布局Index。
如果使用自定义布局，为自定义布局下标。
如果使用单输入布局，如使用输入1，则LayoutIndexType=1， 且LayoutIndex=1，以此类推。
    */
    @SerializedName("LayoutIndex")
    @Expose
    private Long LayoutIndex;

    /**
    * 使用的水印Index列表。
注：当作为入参使用时，列表中的水印Index需要已经存在。
    */
    @SerializedName("MarkPicIndexList")
    @Expose
    private Long [] MarkPicIndexList;

    /**
    * 使用的文字水印Index列表。
注：作为入参使用时，列表中的Index需要已经存在。
    */
    @SerializedName("MarkWordIndexList")
    @Expose
    private Long [] MarkWordIndexList;

    /**
    * 使用的转场类型。
注：支持的转场类型可通过DescribeCasterTransitionTypes接口获取。
    */
    @SerializedName("TransitionType")
    @Expose
    private String TransitionType;

    /**
    * 使用的音频输入Index列表。
注：当该字段非空时，表示使用布局中对应的输入源的视频，AudioIndexList中对应的输入源的音频。且这些输入源需已存在。
    */
    @SerializedName("AudioIndexList")
    @Expose
    private Long [] AudioIndexList;

    /**
    * 作为入参时，表示使用点播输入源，单画面输入时，点播文件是否从头开始播放。
默认为0。
有效值，0,1。
0代表不从头播放
1代表从头播放
    */
    @SerializedName("InputStartType")
    @Expose
    private Long InputStartType;

    /**
    * LayoutIndex类型，
默认值:0
可选值[0,1]
0:默认类型，代表普通布局
1:单输入类型，代表单输入布局
    */
    @SerializedName("LayoutIndexType")
    @Expose
    private Long LayoutIndexType;

    /**
     * Get 布局Index。
如果使用自定义布局，为自定义布局下标。
如果使用单输入布局，如使用输入1，则LayoutIndexType=1， 且LayoutIndex=1，以此类推。 
     * @return LayoutIndex 布局Index。
如果使用自定义布局，为自定义布局下标。
如果使用单输入布局，如使用输入1，则LayoutIndexType=1， 且LayoutIndex=1，以此类推。
     */
    public Long getLayoutIndex() {
        return this.LayoutIndex;
    }

    /**
     * Set 布局Index。
如果使用自定义布局，为自定义布局下标。
如果使用单输入布局，如使用输入1，则LayoutIndexType=1， 且LayoutIndex=1，以此类推。
     * @param LayoutIndex 布局Index。
如果使用自定义布局，为自定义布局下标。
如果使用单输入布局，如使用输入1，则LayoutIndexType=1， 且LayoutIndex=1，以此类推。
     */
    public void setLayoutIndex(Long LayoutIndex) {
        this.LayoutIndex = LayoutIndex;
    }

    /**
     * Get 使用的水印Index列表。
注：当作为入参使用时，列表中的水印Index需要已经存在。 
     * @return MarkPicIndexList 使用的水印Index列表。
注：当作为入参使用时，列表中的水印Index需要已经存在。
     */
    public Long [] getMarkPicIndexList() {
        return this.MarkPicIndexList;
    }

    /**
     * Set 使用的水印Index列表。
注：当作为入参使用时，列表中的水印Index需要已经存在。
     * @param MarkPicIndexList 使用的水印Index列表。
注：当作为入参使用时，列表中的水印Index需要已经存在。
     */
    public void setMarkPicIndexList(Long [] MarkPicIndexList) {
        this.MarkPicIndexList = MarkPicIndexList;
    }

    /**
     * Get 使用的文字水印Index列表。
注：作为入参使用时，列表中的Index需要已经存在。 
     * @return MarkWordIndexList 使用的文字水印Index列表。
注：作为入参使用时，列表中的Index需要已经存在。
     */
    public Long [] getMarkWordIndexList() {
        return this.MarkWordIndexList;
    }

    /**
     * Set 使用的文字水印Index列表。
注：作为入参使用时，列表中的Index需要已经存在。
     * @param MarkWordIndexList 使用的文字水印Index列表。
注：作为入参使用时，列表中的Index需要已经存在。
     */
    public void setMarkWordIndexList(Long [] MarkWordIndexList) {
        this.MarkWordIndexList = MarkWordIndexList;
    }

    /**
     * Get 使用的转场类型。
注：支持的转场类型可通过DescribeCasterTransitionTypes接口获取。 
     * @return TransitionType 使用的转场类型。
注：支持的转场类型可通过DescribeCasterTransitionTypes接口获取。
     */
    public String getTransitionType() {
        return this.TransitionType;
    }

    /**
     * Set 使用的转场类型。
注：支持的转场类型可通过DescribeCasterTransitionTypes接口获取。
     * @param TransitionType 使用的转场类型。
注：支持的转场类型可通过DescribeCasterTransitionTypes接口获取。
     */
    public void setTransitionType(String TransitionType) {
        this.TransitionType = TransitionType;
    }

    /**
     * Get 使用的音频输入Index列表。
注：当该字段非空时，表示使用布局中对应的输入源的视频，AudioIndexList中对应的输入源的音频。且这些输入源需已存在。 
     * @return AudioIndexList 使用的音频输入Index列表。
注：当该字段非空时，表示使用布局中对应的输入源的视频，AudioIndexList中对应的输入源的音频。且这些输入源需已存在。
     */
    public Long [] getAudioIndexList() {
        return this.AudioIndexList;
    }

    /**
     * Set 使用的音频输入Index列表。
注：当该字段非空时，表示使用布局中对应的输入源的视频，AudioIndexList中对应的输入源的音频。且这些输入源需已存在。
     * @param AudioIndexList 使用的音频输入Index列表。
注：当该字段非空时，表示使用布局中对应的输入源的视频，AudioIndexList中对应的输入源的音频。且这些输入源需已存在。
     */
    public void setAudioIndexList(Long [] AudioIndexList) {
        this.AudioIndexList = AudioIndexList;
    }

    /**
     * Get 作为入参时，表示使用点播输入源，单画面输入时，点播文件是否从头开始播放。
默认为0。
有效值，0,1。
0代表不从头播放
1代表从头播放 
     * @return InputStartType 作为入参时，表示使用点播输入源，单画面输入时，点播文件是否从头开始播放。
默认为0。
有效值，0,1。
0代表不从头播放
1代表从头播放
     */
    public Long getInputStartType() {
        return this.InputStartType;
    }

    /**
     * Set 作为入参时，表示使用点播输入源，单画面输入时，点播文件是否从头开始播放。
默认为0。
有效值，0,1。
0代表不从头播放
1代表从头播放
     * @param InputStartType 作为入参时，表示使用点播输入源，单画面输入时，点播文件是否从头开始播放。
默认为0。
有效值，0,1。
0代表不从头播放
1代表从头播放
     */
    public void setInputStartType(Long InputStartType) {
        this.InputStartType = InputStartType;
    }

    /**
     * Get LayoutIndex类型，
默认值:0
可选值[0,1]
0:默认类型，代表普通布局
1:单输入类型，代表单输入布局 
     * @return LayoutIndexType LayoutIndex类型，
默认值:0
可选值[0,1]
0:默认类型，代表普通布局
1:单输入类型，代表单输入布局
     */
    public Long getLayoutIndexType() {
        return this.LayoutIndexType;
    }

    /**
     * Set LayoutIndex类型，
默认值:0
可选值[0,1]
0:默认类型，代表普通布局
1:单输入类型，代表单输入布局
     * @param LayoutIndexType LayoutIndex类型，
默认值:0
可选值[0,1]
0:默认类型，代表普通布局
1:单输入类型，代表单输入布局
     */
    public void setLayoutIndexType(Long LayoutIndexType) {
        this.LayoutIndexType = LayoutIndexType;
    }

    public CasterDisplayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CasterDisplayInfo(CasterDisplayInfo source) {
        if (source.LayoutIndex != null) {
            this.LayoutIndex = new Long(source.LayoutIndex);
        }
        if (source.MarkPicIndexList != null) {
            this.MarkPicIndexList = new Long[source.MarkPicIndexList.length];
            for (int i = 0; i < source.MarkPicIndexList.length; i++) {
                this.MarkPicIndexList[i] = new Long(source.MarkPicIndexList[i]);
            }
        }
        if (source.MarkWordIndexList != null) {
            this.MarkWordIndexList = new Long[source.MarkWordIndexList.length];
            for (int i = 0; i < source.MarkWordIndexList.length; i++) {
                this.MarkWordIndexList[i] = new Long(source.MarkWordIndexList[i]);
            }
        }
        if (source.TransitionType != null) {
            this.TransitionType = new String(source.TransitionType);
        }
        if (source.AudioIndexList != null) {
            this.AudioIndexList = new Long[source.AudioIndexList.length];
            for (int i = 0; i < source.AudioIndexList.length; i++) {
                this.AudioIndexList[i] = new Long(source.AudioIndexList[i]);
            }
        }
        if (source.InputStartType != null) {
            this.InputStartType = new Long(source.InputStartType);
        }
        if (source.LayoutIndexType != null) {
            this.LayoutIndexType = new Long(source.LayoutIndexType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayoutIndex", this.LayoutIndex);
        this.setParamArraySimple(map, prefix + "MarkPicIndexList.", this.MarkPicIndexList);
        this.setParamArraySimple(map, prefix + "MarkWordIndexList.", this.MarkWordIndexList);
        this.setParamSimple(map, prefix + "TransitionType", this.TransitionType);
        this.setParamArraySimple(map, prefix + "AudioIndexList.", this.AudioIndexList);
        this.setParamSimple(map, prefix + "InputStartType", this.InputStartType);
        this.setParamSimple(map, prefix + "LayoutIndexType", this.LayoutIndexType);

    }
}

