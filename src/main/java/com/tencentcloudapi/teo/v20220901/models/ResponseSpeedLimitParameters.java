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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResponseSpeedLimitParameters extends AbstractModel {

    /**
    * 下载限速模式，取值有：
<li>LimitUponDownload：全过程下载限速；</li>
<li>LimitAfterSpecificBytesDownloaded：全速下载特定字节后开始限速；</li>
<li>LimitAfterSpecificSecondsDownloaded：全速下载特定时间后开始限速。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 限速值，单位为：KB/s，填写数值，指定限速大小。
    */
    @SerializedName("MaxSpeed")
    @Expose
    private String MaxSpeed;

    /**
    * 限速开始值，可以为下载大小或指定时长，单位为：KB或s，当 Mode 取值为 LimitAfterSpecificBytesDownloaded 或 LimitAfterSpecificSecondsDownloaded 时，该参数必填。填写数值，指定下载大小或指定时长。
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
     * Get 下载限速模式，取值有：
<li>LimitUponDownload：全过程下载限速；</li>
<li>LimitAfterSpecificBytesDownloaded：全速下载特定字节后开始限速；</li>
<li>LimitAfterSpecificSecondsDownloaded：全速下载特定时间后开始限速。</li> 
     * @return Mode 下载限速模式，取值有：
<li>LimitUponDownload：全过程下载限速；</li>
<li>LimitAfterSpecificBytesDownloaded：全速下载特定字节后开始限速；</li>
<li>LimitAfterSpecificSecondsDownloaded：全速下载特定时间后开始限速。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 下载限速模式，取值有：
<li>LimitUponDownload：全过程下载限速；</li>
<li>LimitAfterSpecificBytesDownloaded：全速下载特定字节后开始限速；</li>
<li>LimitAfterSpecificSecondsDownloaded：全速下载特定时间后开始限速。</li>
     * @param Mode 下载限速模式，取值有：
<li>LimitUponDownload：全过程下载限速；</li>
<li>LimitAfterSpecificBytesDownloaded：全速下载特定字节后开始限速；</li>
<li>LimitAfterSpecificSecondsDownloaded：全速下载特定时间后开始限速。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 限速值，单位为：KB/s，填写数值，指定限速大小。 
     * @return MaxSpeed 限速值，单位为：KB/s，填写数值，指定限速大小。
     */
    public String getMaxSpeed() {
        return this.MaxSpeed;
    }

    /**
     * Set 限速值，单位为：KB/s，填写数值，指定限速大小。
     * @param MaxSpeed 限速值，单位为：KB/s，填写数值，指定限速大小。
     */
    public void setMaxSpeed(String MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }

    /**
     * Get 限速开始值，可以为下载大小或指定时长，单位为：KB或s，当 Mode 取值为 LimitAfterSpecificBytesDownloaded 或 LimitAfterSpecificSecondsDownloaded 时，该参数必填。填写数值，指定下载大小或指定时长。 
     * @return StartAt 限速开始值，可以为下载大小或指定时长，单位为：KB或s，当 Mode 取值为 LimitAfterSpecificBytesDownloaded 或 LimitAfterSpecificSecondsDownloaded 时，该参数必填。填写数值，指定下载大小或指定时长。
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 限速开始值，可以为下载大小或指定时长，单位为：KB或s，当 Mode 取值为 LimitAfterSpecificBytesDownloaded 或 LimitAfterSpecificSecondsDownloaded 时，该参数必填。填写数值，指定下载大小或指定时长。
     * @param StartAt 限速开始值，可以为下载大小或指定时长，单位为：KB或s，当 Mode 取值为 LimitAfterSpecificBytesDownloaded 或 LimitAfterSpecificSecondsDownloaded 时，该参数必填。填写数值，指定下载大小或指定时长。
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    public ResponseSpeedLimitParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseSpeedLimitParameters(ResponseSpeedLimitParameters source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.MaxSpeed != null) {
            this.MaxSpeed = new String(source.MaxSpeed);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "MaxSpeed", this.MaxSpeed);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);

    }
}

