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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDLPFileDetectResultData extends AbstractModel {

    /**
    * 提交任务时的文件md5
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 提交任务时的文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 状态：等待检测->正在检测->检测失败/检测成功。或任务不存在
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 文件检测结果，json字符串。
    */
    @SerializedName("DetectResult")
    @Expose
    private String DetectResult;

    /**
     * Get 提交任务时的文件md5 
     * @return FileMd5 提交任务时的文件md5
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 提交任务时的文件md5
     * @param FileMd5 提交任务时的文件md5
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 提交任务时的文件名 
     * @return FileName 提交任务时的文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 提交任务时的文件名
     * @param FileName 提交任务时的文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 状态：等待检测->正在检测->检测失败/检测成功。或任务不存在 
     * @return Status 状态：等待检测->正在检测->检测失败/检测成功。或任务不存在
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：等待检测->正在检测->检测失败/检测成功。或任务不存在
     * @param Status 状态：等待检测->正在检测->检测失败/检测成功。或任务不存在
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 文件检测结果，json字符串。 
     * @return DetectResult 文件检测结果，json字符串。
     */
    public String getDetectResult() {
        return this.DetectResult;
    }

    /**
     * Set 文件检测结果，json字符串。
     * @param DetectResult 文件检测结果，json字符串。
     */
    public void setDetectResult(String DetectResult) {
        this.DetectResult = DetectResult;
    }

    public DescribeDLPFileDetectResultData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLPFileDetectResultData(DescribeDLPFileDetectResultData source) {
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DetectResult != null) {
            this.DetectResult = new String(source.DetectResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DetectResult", this.DetectResult);

    }
}

