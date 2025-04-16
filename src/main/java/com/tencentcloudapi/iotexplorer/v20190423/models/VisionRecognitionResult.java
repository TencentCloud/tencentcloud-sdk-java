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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VisionRecognitionResult extends AbstractModel {

    /**
    * 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空）
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
    * 视频摘要文本
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
     * Get 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空） 
     * @return Status 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空）
     * @param Status 任务状态（1：失败；2：成功但结果为空；3：成功且结果非空）
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
     * Get 视频摘要文本 
     * @return Summary 视频摘要文本
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 视频摘要文本
     * @param Summary 视频摘要文本
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DetectedClassifications.", this.DetectedClassifications);
        this.setParamSimple(map, prefix + "Summary", this.Summary);

    }
}

