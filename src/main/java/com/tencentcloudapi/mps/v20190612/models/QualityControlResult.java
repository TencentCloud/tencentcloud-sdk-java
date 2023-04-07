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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlResult extends AbstractModel{

    /**
    * 异常类型，取值范围：
Jitter：抖动，
Blur：模糊，
LowLighting：低光照，
HighLighting：过曝，
CrashScreen：花屏，
BlackWhiteEdge：黑白边，
SolidColorScreen：纯色屏，
Noise：噪点，
Mosaic：马赛克，
QRCode：二维码，
AppletCode：小程序码，
BarCode：条形码，
LowVoice：低音，
HighVoice：爆音，
NoVoice：静音，
LowEvaluation：无参考打分低于阈值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 质检结果项。
    */
    @SerializedName("QualityControlItems")
    @Expose
    private QualityControlItem [] QualityControlItems;

    /**
     * Get 异常类型，取值范围：
Jitter：抖动，
Blur：模糊，
LowLighting：低光照，
HighLighting：过曝，
CrashScreen：花屏，
BlackWhiteEdge：黑白边，
SolidColorScreen：纯色屏，
Noise：噪点，
Mosaic：马赛克，
QRCode：二维码，
AppletCode：小程序码，
BarCode：条形码，
LowVoice：低音，
HighVoice：爆音，
NoVoice：静音，
LowEvaluation：无参考打分低于阈值。 
     * @return Type 异常类型，取值范围：
Jitter：抖动，
Blur：模糊，
LowLighting：低光照，
HighLighting：过曝，
CrashScreen：花屏，
BlackWhiteEdge：黑白边，
SolidColorScreen：纯色屏，
Noise：噪点，
Mosaic：马赛克，
QRCode：二维码，
AppletCode：小程序码，
BarCode：条形码，
LowVoice：低音，
HighVoice：爆音，
NoVoice：静音，
LowEvaluation：无参考打分低于阈值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 异常类型，取值范围：
Jitter：抖动，
Blur：模糊，
LowLighting：低光照，
HighLighting：过曝，
CrashScreen：花屏，
BlackWhiteEdge：黑白边，
SolidColorScreen：纯色屏，
Noise：噪点，
Mosaic：马赛克，
QRCode：二维码，
AppletCode：小程序码，
BarCode：条形码，
LowVoice：低音，
HighVoice：爆音，
NoVoice：静音，
LowEvaluation：无参考打分低于阈值。
     * @param Type 异常类型，取值范围：
Jitter：抖动，
Blur：模糊，
LowLighting：低光照，
HighLighting：过曝，
CrashScreen：花屏，
BlackWhiteEdge：黑白边，
SolidColorScreen：纯色屏，
Noise：噪点，
Mosaic：马赛克，
QRCode：二维码，
AppletCode：小程序码，
BarCode：条形码，
LowVoice：低音，
HighVoice：爆音，
NoVoice：静音，
LowEvaluation：无参考打分低于阈值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 质检结果项。 
     * @return QualityControlItems 质检结果项。
     */
    public QualityControlItem [] getQualityControlItems() {
        return this.QualityControlItems;
    }

    /**
     * Set 质检结果项。
     * @param QualityControlItems 质检结果项。
     */
    public void setQualityControlItems(QualityControlItem [] QualityControlItems) {
        this.QualityControlItems = QualityControlItems;
    }

    public QualityControlResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlResult(QualityControlResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.QualityControlItems != null) {
            this.QualityControlItems = new QualityControlItem[source.QualityControlItems.length];
            for (int i = 0; i < source.QualityControlItems.length; i++) {
                this.QualityControlItems[i] = new QualityControlItem(source.QualityControlItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "QualityControlItems.", this.QualityControlItems);

    }
}

