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

public class QualityInspectResultItem extends AbstractModel{

    /**
    * 异常类型，取值范围：
<li>Jitter：抖动；</li>
<li>Blur：模糊；</li>
<li>LowLighting：低光照；</li>
<li>HighLighting：过曝；</li>
<li>CrashScreen：花屏；</li>
<li>BlackWhiteEdge：黑白边；</li>
<li>SolidColorScreen：纯色屏；</li>
<li>Noise：噪点；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码；</li>
<li>LowVoice：低音；</li>
<li>HighVoice：爆音；</li>
<li>NoVoice：静音；</li>
<li>LowEvaluation：无参考打分低于阈值。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 异常片段列表。
<font color=red>注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。
    */
    @SerializedName("SegmentSet")
    @Expose
    private QualityInspectItem [] SegmentSet;

    /**
    * 异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * 异常片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get 异常类型，取值范围：
<li>Jitter：抖动；</li>
<li>Blur：模糊；</li>
<li>LowLighting：低光照；</li>
<li>HighLighting：过曝；</li>
<li>CrashScreen：花屏；</li>
<li>BlackWhiteEdge：黑白边；</li>
<li>SolidColorScreen：纯色屏；</li>
<li>Noise：噪点；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码；</li>
<li>LowVoice：低音；</li>
<li>HighVoice：爆音；</li>
<li>NoVoice：静音；</li>
<li>LowEvaluation：无参考打分低于阈值。</li> 
     * @return Type 异常类型，取值范围：
<li>Jitter：抖动；</li>
<li>Blur：模糊；</li>
<li>LowLighting：低光照；</li>
<li>HighLighting：过曝；</li>
<li>CrashScreen：花屏；</li>
<li>BlackWhiteEdge：黑白边；</li>
<li>SolidColorScreen：纯色屏；</li>
<li>Noise：噪点；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码；</li>
<li>LowVoice：低音；</li>
<li>HighVoice：爆音；</li>
<li>NoVoice：静音；</li>
<li>LowEvaluation：无参考打分低于阈值。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 异常类型，取值范围：
<li>Jitter：抖动；</li>
<li>Blur：模糊；</li>
<li>LowLighting：低光照；</li>
<li>HighLighting：过曝；</li>
<li>CrashScreen：花屏；</li>
<li>BlackWhiteEdge：黑白边；</li>
<li>SolidColorScreen：纯色屏；</li>
<li>Noise：噪点；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码；</li>
<li>LowVoice：低音；</li>
<li>HighVoice：爆音；</li>
<li>NoVoice：静音；</li>
<li>LowEvaluation：无参考打分低于阈值。</li>
     * @param Type 异常类型，取值范围：
<li>Jitter：抖动；</li>
<li>Blur：模糊；</li>
<li>LowLighting：低光照；</li>
<li>HighLighting：过曝；</li>
<li>CrashScreen：花屏；</li>
<li>BlackWhiteEdge：黑白边；</li>
<li>SolidColorScreen：纯色屏；</li>
<li>Noise：噪点；</li>
<li>Mosaic：马赛克；</li>
<li>QRCode：二维码；</li>
<li>AppletCode：小程序码；</li>
<li>BarCode：条形码；</li>
<li>LowVoice：低音；</li>
<li>HighVoice：爆音；</li>
<li>NoVoice：静音；</li>
<li>LowEvaluation：无参考打分低于阈值。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 异常片段列表。
<font color=red>注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。 
     * @return SegmentSet 异常片段列表。
<font color=red>注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。
     */
    public QualityInspectItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 异常片段列表。
<font color=red>注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。
     * @param SegmentSet 异常片段列表。
<font color=red>注意：</font> 该列表最多仅展示前 100 个元素。如希望获得完整结果，请从 SegmentSetFileUrl 对应的文件中获取。
     */
    public void setSegmentSet(QualityInspectItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get 异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。 
     * @return SegmentSetFileUrl 异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set 异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。
     * @param SegmentSetFileUrl 异常片段列表文件 URL。文件 内容 为  JSON，数据结构与 SegmentSet 字段一致。（文件不会永久存储，到达SegmentSetFileUrlExpireTime 时间点后文件将被删除）。
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get 异常片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return SegmentSetFileUrlExpireTime 异常片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set 异常片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param SegmentSetFileUrlExpireTime 异常片段列表文件 URL 失效时间，使用  [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public QualityInspectResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectResultItem(QualityInspectResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new QualityInspectItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new QualityInspectItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);

    }
}

