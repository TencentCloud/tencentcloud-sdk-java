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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastProjectInfo extends AbstractModel{

    /**
    * 点播转直播项目状态，取值有：
<li>Working ：运行中；</li>
<li>Idle ：空闲。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 输入源列表。
    */
    @SerializedName("SourceInfos")
    @Expose
    private MediaCastSourceInfo [] SourceInfos;

    /**
    * 输出源列表。
    */
    @SerializedName("DestinationInfos")
    @Expose
    private MediaCastDestinationInfo [] DestinationInfos;

    /**
    * 输出媒体配置。
    */
    @SerializedName("OutputMediaSetting")
    @Expose
    private MediaCastOutputMediaSetting OutputMediaSetting;

    /**
    * 播放参数。
    */
    @SerializedName("PlaySetting")
    @Expose
    private MediaCastPlaySetting PlaySetting;

    /**
    * 项目启动时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 项目结束时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如果项目还在运行中，改字段为空。
    */
    @SerializedName("StopTime")
    @Expose
    private String StopTime;

    /**
     * Get 点播转直播项目状态，取值有：
<li>Working ：运行中；</li>
<li>Idle ：空闲。</li> 
     * @return Status 点播转直播项目状态，取值有：
<li>Working ：运行中；</li>
<li>Idle ：空闲。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 点播转直播项目状态，取值有：
<li>Working ：运行中；</li>
<li>Idle ：空闲。</li>
     * @param Status 点播转直播项目状态，取值有：
<li>Working ：运行中；</li>
<li>Idle ：空闲。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 输入源列表。 
     * @return SourceInfos 输入源列表。
     */
    public MediaCastSourceInfo [] getSourceInfos() {
        return this.SourceInfos;
    }

    /**
     * Set 输入源列表。
     * @param SourceInfos 输入源列表。
     */
    public void setSourceInfos(MediaCastSourceInfo [] SourceInfos) {
        this.SourceInfos = SourceInfos;
    }

    /**
     * Get 输出源列表。 
     * @return DestinationInfos 输出源列表。
     */
    public MediaCastDestinationInfo [] getDestinationInfos() {
        return this.DestinationInfos;
    }

    /**
     * Set 输出源列表。
     * @param DestinationInfos 输出源列表。
     */
    public void setDestinationInfos(MediaCastDestinationInfo [] DestinationInfos) {
        this.DestinationInfos = DestinationInfos;
    }

    /**
     * Get 输出媒体配置。 
     * @return OutputMediaSetting 输出媒体配置。
     */
    public MediaCastOutputMediaSetting getOutputMediaSetting() {
        return this.OutputMediaSetting;
    }

    /**
     * Set 输出媒体配置。
     * @param OutputMediaSetting 输出媒体配置。
     */
    public void setOutputMediaSetting(MediaCastOutputMediaSetting OutputMediaSetting) {
        this.OutputMediaSetting = OutputMediaSetting;
    }

    /**
     * Get 播放参数。 
     * @return PlaySetting 播放参数。
     */
    public MediaCastPlaySetting getPlaySetting() {
        return this.PlaySetting;
    }

    /**
     * Set 播放参数。
     * @param PlaySetting 播放参数。
     */
    public void setPlaySetting(MediaCastPlaySetting PlaySetting) {
        this.PlaySetting = PlaySetting;
    }

    /**
     * Get 项目启动时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return StartTime 项目启动时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 项目启动时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param StartTime 项目启动时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 项目结束时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如果项目还在运行中，改字段为空。 
     * @return StopTime 项目结束时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如果项目还在运行中，改字段为空。
     */
    public String getStopTime() {
        return this.StopTime;
    }

    /**
     * Set 项目结束时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如果项目还在运行中，改字段为空。
     * @param StopTime 项目结束时间。采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。如果项目还在运行中，改字段为空。
     */
    public void setStopTime(String StopTime) {
        this.StopTime = StopTime;
    }

    public MediaCastProjectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastProjectInfo(MediaCastProjectInfo source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SourceInfos != null) {
            this.SourceInfos = new MediaCastSourceInfo[source.SourceInfos.length];
            for (int i = 0; i < source.SourceInfos.length; i++) {
                this.SourceInfos[i] = new MediaCastSourceInfo(source.SourceInfos[i]);
            }
        }
        if (source.DestinationInfos != null) {
            this.DestinationInfos = new MediaCastDestinationInfo[source.DestinationInfos.length];
            for (int i = 0; i < source.DestinationInfos.length; i++) {
                this.DestinationInfos[i] = new MediaCastDestinationInfo(source.DestinationInfos[i]);
            }
        }
        if (source.OutputMediaSetting != null) {
            this.OutputMediaSetting = new MediaCastOutputMediaSetting(source.OutputMediaSetting);
        }
        if (source.PlaySetting != null) {
            this.PlaySetting = new MediaCastPlaySetting(source.PlaySetting);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.StopTime != null) {
            this.StopTime = new String(source.StopTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "SourceInfos.", this.SourceInfos);
        this.setParamArrayObj(map, prefix + "DestinationInfos.", this.DestinationInfos);
        this.setParamObj(map, prefix + "OutputMediaSetting.", this.OutputMediaSetting);
        this.setParamObj(map, prefix + "PlaySetting.", this.PlaySetting);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);

    }
}

