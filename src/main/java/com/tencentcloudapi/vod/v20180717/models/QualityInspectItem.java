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

public class QualityInspectItem extends AbstractModel{

    /**
    * 异常片段起始的偏移时间，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 异常片段终止的偏移时间，单位：秒。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 检测出异常的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>BlackWhiteEdge：黑白边；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li>
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * 置信度，取值范围：[0, 100]。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
     * Get 异常片段起始的偏移时间，单位：秒。 
     * @return StartTimeOffset 异常片段起始的偏移时间，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 异常片段起始的偏移时间，单位：秒。
     * @param StartTimeOffset 异常片段起始的偏移时间，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 异常片段终止的偏移时间，单位：秒。 
     * @return EndTimeOffset 异常片段终止的偏移时间，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 异常片段终止的偏移时间，单位：秒。
     * @param EndTimeOffset 异常片段终止的偏移时间，单位：秒。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 检测出异常的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>BlackWhiteEdge：黑白边；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li> 
     * @return AreaCoordSet 检测出异常的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>BlackWhiteEdge：黑白边；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li>
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set 检测出异常的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>BlackWhiteEdge：黑白边；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li>
     * @param AreaCoordSet 检测出异常的区域坐标。数组包含 4 个元素 [x1,y1,x2,y2]，依次表示区域左上点、右下点的横纵坐标。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>BlackWhiteEdge：黑白边；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li>
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get 置信度，取值范围：[0, 100]。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li> 
     * @return Confidence 置信度，取值范围：[0, 100]。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，取值范围：[0, 100]。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li>
     * @param Confidence 置信度，取值范围：[0, 100]。
<font color=red>注意：</font> 仅当 Type 取值为下列之一时，本字段取值有效：
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码。</li>
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    public QualityInspectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectItem(QualityInspectItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

