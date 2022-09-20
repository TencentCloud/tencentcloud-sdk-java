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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingInfo extends AbstractModel{

    /**
    * 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中；</li>
<li> 503: 任务失败。</li>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 拨测任务 ID。
    */
    @SerializedName("TestId")
    @Expose
    private String TestId;

    /**
    * 拨测任务配置。
    */
    @SerializedName("SpeedTestingConfig")
    @Expose
    private SpeedTestingConfig SpeedTestingConfig;

    /**
    * 拨测任务统计结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpeedTestingStatistics")
    @Expose
    private SpeedTestingStatistics SpeedTestingStatistics;

    /**
     * Get 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中；</li>
<li> 503: 任务失败。</li> 
     * @return StatusCode 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中；</li>
<li> 503: 任务失败。</li>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中；</li>
<li> 503: 任务失败。</li>
     * @param StatusCode 任务状态，取值有：
<li> 200：任务完成;</li>
<li> 100：任务进行中；</li>
<li> 503: 任务失败。</li>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 拨测任务 ID。 
     * @return TestId 拨测任务 ID。
     */
    public String getTestId() {
        return this.TestId;
    }

    /**
     * Set 拨测任务 ID。
     * @param TestId 拨测任务 ID。
     */
    public void setTestId(String TestId) {
        this.TestId = TestId;
    }

    /**
     * Get 拨测任务配置。 
     * @return SpeedTestingConfig 拨测任务配置。
     */
    public SpeedTestingConfig getSpeedTestingConfig() {
        return this.SpeedTestingConfig;
    }

    /**
     * Set 拨测任务配置。
     * @param SpeedTestingConfig 拨测任务配置。
     */
    public void setSpeedTestingConfig(SpeedTestingConfig SpeedTestingConfig) {
        this.SpeedTestingConfig = SpeedTestingConfig;
    }

    /**
     * Get 拨测任务统计结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpeedTestingStatistics 拨测任务统计结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpeedTestingStatistics getSpeedTestingStatistics() {
        return this.SpeedTestingStatistics;
    }

    /**
     * Set 拨测任务统计结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpeedTestingStatistics 拨测任务统计结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeedTestingStatistics(SpeedTestingStatistics SpeedTestingStatistics) {
        this.SpeedTestingStatistics = SpeedTestingStatistics;
    }

    public SpeedTestingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingInfo(SpeedTestingInfo source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.TestId != null) {
            this.TestId = new String(source.TestId);
        }
        if (source.SpeedTestingConfig != null) {
            this.SpeedTestingConfig = new SpeedTestingConfig(source.SpeedTestingConfig);
        }
        if (source.SpeedTestingStatistics != null) {
            this.SpeedTestingStatistics = new SpeedTestingStatistics(source.SpeedTestingStatistics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "TestId", this.TestId);
        this.setParamObj(map, prefix + "SpeedTestingConfig.", this.SpeedTestingConfig);
        this.setParamObj(map, prefix + "SpeedTestingStatistics.", this.SpeedTestingStatistics);

    }
}

