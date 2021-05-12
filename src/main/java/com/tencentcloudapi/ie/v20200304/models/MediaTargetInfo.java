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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaTargetInfo extends AbstractModel{

    /**
    * 目标文件名，不能带特殊字符（如/等），无需后缀名，最长200字符。

注1：部分子服务支持占位符，形式为： {parameter}
预设parameter有：
index：序号；
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 媒体封装格式，最长5字符，具体格式支持根据子任务确定。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 视频流信息。
    */
    @SerializedName("TargetVideoInfo")
    @Expose
    private TargetVideoInfo TargetVideoInfo;

    /**
    * 【不再使用】 对于多输出任务，部分子服务推荐结果信息以列表文件形式，存储到用户存储服务中，可选值：
UseSaveInfo：默认，结果列表和结果存储同一位置；
NoListFile：不存储结果列表。
    */
    @SerializedName("ResultListSaveType")
    @Expose
    private String ResultListSaveType;

    /**
     * Get 目标文件名，不能带特殊字符（如/等），无需后缀名，最长200字符。

注1：部分子服务支持占位符，形式为： {parameter}
预设parameter有：
index：序号； 
     * @return FileName 目标文件名，不能带特殊字符（如/等），无需后缀名，最长200字符。

注1：部分子服务支持占位符，形式为： {parameter}
预设parameter有：
index：序号；
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 目标文件名，不能带特殊字符（如/等），无需后缀名，最长200字符。

注1：部分子服务支持占位符，形式为： {parameter}
预设parameter有：
index：序号；
     * @param FileName 目标文件名，不能带特殊字符（如/等），无需后缀名，最长200字符。

注1：部分子服务支持占位符，形式为： {parameter}
预设parameter有：
index：序号；
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 媒体封装格式，最长5字符，具体格式支持根据子任务确定。 
     * @return Format 媒体封装格式，最长5字符，具体格式支持根据子任务确定。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 媒体封装格式，最长5字符，具体格式支持根据子任务确定。
     * @param Format 媒体封装格式，最长5字符，具体格式支持根据子任务确定。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 视频流信息。 
     * @return TargetVideoInfo 视频流信息。
     */
    public TargetVideoInfo getTargetVideoInfo() {
        return this.TargetVideoInfo;
    }

    /**
     * Set 视频流信息。
     * @param TargetVideoInfo 视频流信息。
     */
    public void setTargetVideoInfo(TargetVideoInfo TargetVideoInfo) {
        this.TargetVideoInfo = TargetVideoInfo;
    }

    /**
     * Get 【不再使用】 对于多输出任务，部分子服务推荐结果信息以列表文件形式，存储到用户存储服务中，可选值：
UseSaveInfo：默认，结果列表和结果存储同一位置；
NoListFile：不存储结果列表。 
     * @return ResultListSaveType 【不再使用】 对于多输出任务，部分子服务推荐结果信息以列表文件形式，存储到用户存储服务中，可选值：
UseSaveInfo：默认，结果列表和结果存储同一位置；
NoListFile：不存储结果列表。
     */
    public String getResultListSaveType() {
        return this.ResultListSaveType;
    }

    /**
     * Set 【不再使用】 对于多输出任务，部分子服务推荐结果信息以列表文件形式，存储到用户存储服务中，可选值：
UseSaveInfo：默认，结果列表和结果存储同一位置；
NoListFile：不存储结果列表。
     * @param ResultListSaveType 【不再使用】 对于多输出任务，部分子服务推荐结果信息以列表文件形式，存储到用户存储服务中，可选值：
UseSaveInfo：默认，结果列表和结果存储同一位置；
NoListFile：不存储结果列表。
     */
    public void setResultListSaveType(String ResultListSaveType) {
        this.ResultListSaveType = ResultListSaveType;
    }

    public MediaTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTargetInfo(MediaTargetInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.TargetVideoInfo != null) {
            this.TargetVideoInfo = new TargetVideoInfo(source.TargetVideoInfo);
        }
        if (source.ResultListSaveType != null) {
            this.ResultListSaveType = new String(source.ResultListSaveType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamObj(map, prefix + "TargetVideoInfo.", this.TargetVideoInfo);
        this.setParamSimple(map, prefix + "ResultListSaveType", this.ResultListSaveType);

    }
}

