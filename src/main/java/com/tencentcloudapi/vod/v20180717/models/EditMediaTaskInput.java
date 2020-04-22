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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditMediaTaskInput extends AbstractModel{

    /**
    * 输入视频的来源类型，可以取的值为 File，Stream 两种。
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 输入的视频文件信息，当 InputType 为 File 时，该字段有值。
    */
    @SerializedName("FileInfoSet")
    @Expose
    private EditMediaFileInfo [] FileInfoSet;

    /**
    * 输入的流信息，当 InputType 为 Stream 时，该字段有值。
    */
    @SerializedName("StreamInfoSet")
    @Expose
    private EditMediaStreamInfo [] StreamInfoSet;

    /**
     * Get 输入视频的来源类型，可以取的值为 File，Stream 两种。 
     * @return InputType 输入视频的来源类型，可以取的值为 File，Stream 两种。
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 输入视频的来源类型，可以取的值为 File，Stream 两种。
     * @param InputType 输入视频的来源类型，可以取的值为 File，Stream 两种。
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 输入的视频文件信息，当 InputType 为 File 时，该字段有值。 
     * @return FileInfoSet 输入的视频文件信息，当 InputType 为 File 时，该字段有值。
     */
    public EditMediaFileInfo [] getFileInfoSet() {
        return this.FileInfoSet;
    }

    /**
     * Set 输入的视频文件信息，当 InputType 为 File 时，该字段有值。
     * @param FileInfoSet 输入的视频文件信息，当 InputType 为 File 时，该字段有值。
     */
    public void setFileInfoSet(EditMediaFileInfo [] FileInfoSet) {
        this.FileInfoSet = FileInfoSet;
    }

    /**
     * Get 输入的流信息，当 InputType 为 Stream 时，该字段有值。 
     * @return StreamInfoSet 输入的流信息，当 InputType 为 Stream 时，该字段有值。
     */
    public EditMediaStreamInfo [] getStreamInfoSet() {
        return this.StreamInfoSet;
    }

    /**
     * Set 输入的流信息，当 InputType 为 Stream 时，该字段有值。
     * @param StreamInfoSet 输入的流信息，当 InputType 为 Stream 时，该字段有值。
     */
    public void setStreamInfoSet(EditMediaStreamInfo [] StreamInfoSet) {
        this.StreamInfoSet = StreamInfoSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamArrayObj(map, prefix + "FileInfoSet.", this.FileInfoSet);
        this.setParamArrayObj(map, prefix + "StreamInfoSet.", this.StreamInfoSet);

    }
}

