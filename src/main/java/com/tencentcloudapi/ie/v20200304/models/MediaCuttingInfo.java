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

public class MediaCuttingInfo extends AbstractModel{

    /**
    * 截取时间信息。
    */
    @SerializedName("TimeInfo")
    @Expose
    private MediaCuttingTimeInfo TimeInfo;

    /**
    * 输出结果信息。
    */
    @SerializedName("TargetInfo")
    @Expose
    private MediaTargetInfo TargetInfo;

    /**
    * 截取结果形式信息。
    */
    @SerializedName("OutForm")
    @Expose
    private MediaCuttingOutForm OutForm;

    /**
    * 列表文件形式，存储到用户存储服务中，可选值：
<li>NoListFile：不存储结果列表; </li>
<li>UseSaveInfo：默认，结果列表和结果存储同一位置（即SaveInfoSet 的第一个存储位置）；</li>
<li>SaveInfoSet 存储的Id：存储在指定的存储位置。</li>
    */
    @SerializedName("ResultListSaveType")
    @Expose
    private String ResultListSaveType;

    /**
    * 水印信息，最多支持 10 个水印。
    */
    @SerializedName("WatermarkInfoSet")
    @Expose
    private MediaCuttingWatermark [] WatermarkInfoSet;

    /**
    * 是否去除纯色截图，如果值为 True ，对应时间点的截图如果是纯色，将略过。
    */
    @SerializedName("DropPureColor")
    @Expose
    private String DropPureColor;

    /**
     * Get 截取时间信息。 
     * @return TimeInfo 截取时间信息。
     */
    public MediaCuttingTimeInfo getTimeInfo() {
        return this.TimeInfo;
    }

    /**
     * Set 截取时间信息。
     * @param TimeInfo 截取时间信息。
     */
    public void setTimeInfo(MediaCuttingTimeInfo TimeInfo) {
        this.TimeInfo = TimeInfo;
    }

    /**
     * Get 输出结果信息。 
     * @return TargetInfo 输出结果信息。
     */
    public MediaTargetInfo getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set 输出结果信息。
     * @param TargetInfo 输出结果信息。
     */
    public void setTargetInfo(MediaTargetInfo TargetInfo) {
        this.TargetInfo = TargetInfo;
    }

    /**
     * Get 截取结果形式信息。 
     * @return OutForm 截取结果形式信息。
     */
    public MediaCuttingOutForm getOutForm() {
        return this.OutForm;
    }

    /**
     * Set 截取结果形式信息。
     * @param OutForm 截取结果形式信息。
     */
    public void setOutForm(MediaCuttingOutForm OutForm) {
        this.OutForm = OutForm;
    }

    /**
     * Get 列表文件形式，存储到用户存储服务中，可选值：
<li>NoListFile：不存储结果列表; </li>
<li>UseSaveInfo：默认，结果列表和结果存储同一位置（即SaveInfoSet 的第一个存储位置）；</li>
<li>SaveInfoSet 存储的Id：存储在指定的存储位置。</li> 
     * @return ResultListSaveType 列表文件形式，存储到用户存储服务中，可选值：
<li>NoListFile：不存储结果列表; </li>
<li>UseSaveInfo：默认，结果列表和结果存储同一位置（即SaveInfoSet 的第一个存储位置）；</li>
<li>SaveInfoSet 存储的Id：存储在指定的存储位置。</li>
     */
    public String getResultListSaveType() {
        return this.ResultListSaveType;
    }

    /**
     * Set 列表文件形式，存储到用户存储服务中，可选值：
<li>NoListFile：不存储结果列表; </li>
<li>UseSaveInfo：默认，结果列表和结果存储同一位置（即SaveInfoSet 的第一个存储位置）；</li>
<li>SaveInfoSet 存储的Id：存储在指定的存储位置。</li>
     * @param ResultListSaveType 列表文件形式，存储到用户存储服务中，可选值：
<li>NoListFile：不存储结果列表; </li>
<li>UseSaveInfo：默认，结果列表和结果存储同一位置（即SaveInfoSet 的第一个存储位置）；</li>
<li>SaveInfoSet 存储的Id：存储在指定的存储位置。</li>
     */
    public void setResultListSaveType(String ResultListSaveType) {
        this.ResultListSaveType = ResultListSaveType;
    }

    /**
     * Get 水印信息，最多支持 10 个水印。 
     * @return WatermarkInfoSet 水印信息，最多支持 10 个水印。
     */
    public MediaCuttingWatermark [] getWatermarkInfoSet() {
        return this.WatermarkInfoSet;
    }

    /**
     * Set 水印信息，最多支持 10 个水印。
     * @param WatermarkInfoSet 水印信息，最多支持 10 个水印。
     */
    public void setWatermarkInfoSet(MediaCuttingWatermark [] WatermarkInfoSet) {
        this.WatermarkInfoSet = WatermarkInfoSet;
    }

    /**
     * Get 是否去除纯色截图，如果值为 True ，对应时间点的截图如果是纯色，将略过。 
     * @return DropPureColor 是否去除纯色截图，如果值为 True ，对应时间点的截图如果是纯色，将略过。
     */
    public String getDropPureColor() {
        return this.DropPureColor;
    }

    /**
     * Set 是否去除纯色截图，如果值为 True ，对应时间点的截图如果是纯色，将略过。
     * @param DropPureColor 是否去除纯色截图，如果值为 True ，对应时间点的截图如果是纯色，将略过。
     */
    public void setDropPureColor(String DropPureColor) {
        this.DropPureColor = DropPureColor;
    }

    public MediaCuttingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCuttingInfo(MediaCuttingInfo source) {
        if (source.TimeInfo != null) {
            this.TimeInfo = new MediaCuttingTimeInfo(source.TimeInfo);
        }
        if (source.TargetInfo != null) {
            this.TargetInfo = new MediaTargetInfo(source.TargetInfo);
        }
        if (source.OutForm != null) {
            this.OutForm = new MediaCuttingOutForm(source.OutForm);
        }
        if (source.ResultListSaveType != null) {
            this.ResultListSaveType = new String(source.ResultListSaveType);
        }
        if (source.WatermarkInfoSet != null) {
            this.WatermarkInfoSet = new MediaCuttingWatermark[source.WatermarkInfoSet.length];
            for (int i = 0; i < source.WatermarkInfoSet.length; i++) {
                this.WatermarkInfoSet[i] = new MediaCuttingWatermark(source.WatermarkInfoSet[i]);
            }
        }
        if (source.DropPureColor != null) {
            this.DropPureColor = new String(source.DropPureColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TimeInfo.", this.TimeInfo);
        this.setParamObj(map, prefix + "TargetInfo.", this.TargetInfo);
        this.setParamObj(map, prefix + "OutForm.", this.OutForm);
        this.setParamSimple(map, prefix + "ResultListSaveType", this.ResultListSaveType);
        this.setParamArrayObj(map, prefix + "WatermarkInfoSet.", this.WatermarkInfoSet);
        this.setParamSimple(map, prefix + "DropPureColor", this.DropPureColor);

    }
}

