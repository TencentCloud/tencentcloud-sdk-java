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

public class VisionRecognitionResult extends AbstractModel {

    /**
    * 任务状态（1：分析失败；2：下载/读取视频/图片失败；3：成功）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 识别到的目标类型。可能取值：

- `person`：人
- `vehicle`：车辆
- `dog`：狗
- `cat`：猫
- `fire`：火焰
- `smoke`：烟雾
- `package`：快递包裹
- `license_plate`：车牌

    */
    @SerializedName("DetectedClassifications")
    @Expose
    private String [] DetectedClassifications;

    /**
    * 摘要文本
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 摘要文本（次选语言）
    */
    @SerializedName("AlternativeSummary")
    @Expose
    private String AlternativeSummary;

    /**
     * Get 任务状态（1：分析失败；2：下载/读取视频/图片失败；3：成功） 
     * @return Status 任务状态（1：分析失败；2：下载/读取视频/图片失败；3：成功）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态（1：分析失败；2：下载/读取视频/图片失败；3：成功）
     * @param Status 任务状态（1：分析失败；2：下载/读取视频/图片失败；3：成功）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 识别到的目标类型。可能取值：

- `person`：人
- `vehicle`：车辆
- `dog`：狗
- `cat`：猫
- `fire`：火焰
- `smoke`：烟雾
- `package`：快递包裹
- `license_plate`：车牌
 
     * @return DetectedClassifications 识别到的目标类型。可能取值：

- `person`：人
- `vehicle`：车辆
- `dog`：狗
- `cat`：猫
- `fire`：火焰
- `smoke`：烟雾
- `package`：快递包裹
- `license_plate`：车牌

     */
    public String [] getDetectedClassifications() {
        return this.DetectedClassifications;
    }

    /**
     * Set 识别到的目标类型。可能取值：

- `person`：人
- `vehicle`：车辆
- `dog`：狗
- `cat`：猫
- `fire`：火焰
- `smoke`：烟雾
- `package`：快递包裹
- `license_plate`：车牌

     * @param DetectedClassifications 识别到的目标类型。可能取值：

- `person`：人
- `vehicle`：车辆
- `dog`：狗
- `cat`：猫
- `fire`：火焰
- `smoke`：烟雾
- `package`：快递包裹
- `license_plate`：车牌

     */
    public void setDetectedClassifications(String [] DetectedClassifications) {
        this.DetectedClassifications = DetectedClassifications;
    }

    /**
     * Get 摘要文本 
     * @return Summary 摘要文本
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 摘要文本
     * @param Summary 摘要文本
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 摘要文本（次选语言） 
     * @return AlternativeSummary 摘要文本（次选语言）
     */
    public String getAlternativeSummary() {
        return this.AlternativeSummary;
    }

    /**
     * Set 摘要文本（次选语言）
     * @param AlternativeSummary 摘要文本（次选语言）
     */
    public void setAlternativeSummary(String AlternativeSummary) {
        this.AlternativeSummary = AlternativeSummary;
    }

    public VisionRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VisionRecognitionResult(VisionRecognitionResult source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DetectedClassifications != null) {
            this.DetectedClassifications = new String[source.DetectedClassifications.length];
            for (int i = 0; i < source.DetectedClassifications.length; i++) {
                this.DetectedClassifications[i] = new String(source.DetectedClassifications[i]);
            }
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.AlternativeSummary != null) {
            this.AlternativeSummary = new String(source.AlternativeSummary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DetectedClassifications.", this.DetectedClassifications);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "AlternativeSummary", this.AlternativeSummary);

    }
}

