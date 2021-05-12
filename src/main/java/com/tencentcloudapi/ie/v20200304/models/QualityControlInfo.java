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

public class QualityControlInfo extends AbstractModel{

    /**
    * 对流进行截图的间隔ms，默认1000ms
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 是否保存截图
    */
    @SerializedName("VideoShot")
    @Expose
    private Boolean VideoShot;

    /**
    * 是否检测抖动重影
    */
    @SerializedName("Jitter")
    @Expose
    private Boolean Jitter;

    /**
    * 是否检测模糊
    */
    @SerializedName("Blur")
    @Expose
    private Boolean Blur;

    /**
    * 是否检测低光照、过曝
    */
    @SerializedName("AbnormalLighting")
    @Expose
    private Boolean AbnormalLighting;

    /**
    * 是否检测花屏
    */
    @SerializedName("CrashScreen")
    @Expose
    private Boolean CrashScreen;

    /**
    * 是否检测黑边、白边、黑屏、白屏、绿屏
    */
    @SerializedName("BlackWhiteEdge")
    @Expose
    private Boolean BlackWhiteEdge;

    /**
    * 是否检测噪点
    */
    @SerializedName("Noise")
    @Expose
    private Boolean Noise;

    /**
    * 是否检测马赛克
    */
    @SerializedName("Mosaic")
    @Expose
    private Boolean Mosaic;

    /**
    * 是否检测二维码，包括小程序码、条形码
    */
    @SerializedName("QRCode")
    @Expose
    private Boolean QRCode;

    /**
    * 是否开启画面质量评价
    */
    @SerializedName("QualityEvaluation")
    @Expose
    private Boolean QualityEvaluation;

    /**
    * 画面质量评价过滤阈值，结果只返回低于阈值的时间段，默认60
    */
    @SerializedName("QualityEvalScore")
    @Expose
    private Long QualityEvalScore;

    /**
    * 是否检测视频音频，包含静音、低音、爆音
    */
    @SerializedName("Voice")
    @Expose
    private Boolean Voice;

    /**
     * Get 对流进行截图的间隔ms，默认1000ms 
     * @return Interval 对流进行截图的间隔ms，默认1000ms
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 对流进行截图的间隔ms，默认1000ms
     * @param Interval 对流进行截图的间隔ms，默认1000ms
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 是否保存截图 
     * @return VideoShot 是否保存截图
     */
    public Boolean getVideoShot() {
        return this.VideoShot;
    }

    /**
     * Set 是否保存截图
     * @param VideoShot 是否保存截图
     */
    public void setVideoShot(Boolean VideoShot) {
        this.VideoShot = VideoShot;
    }

    /**
     * Get 是否检测抖动重影 
     * @return Jitter 是否检测抖动重影
     */
    public Boolean getJitter() {
        return this.Jitter;
    }

    /**
     * Set 是否检测抖动重影
     * @param Jitter 是否检测抖动重影
     */
    public void setJitter(Boolean Jitter) {
        this.Jitter = Jitter;
    }

    /**
     * Get 是否检测模糊 
     * @return Blur 是否检测模糊
     */
    public Boolean getBlur() {
        return this.Blur;
    }

    /**
     * Set 是否检测模糊
     * @param Blur 是否检测模糊
     */
    public void setBlur(Boolean Blur) {
        this.Blur = Blur;
    }

    /**
     * Get 是否检测低光照、过曝 
     * @return AbnormalLighting 是否检测低光照、过曝
     */
    public Boolean getAbnormalLighting() {
        return this.AbnormalLighting;
    }

    /**
     * Set 是否检测低光照、过曝
     * @param AbnormalLighting 是否检测低光照、过曝
     */
    public void setAbnormalLighting(Boolean AbnormalLighting) {
        this.AbnormalLighting = AbnormalLighting;
    }

    /**
     * Get 是否检测花屏 
     * @return CrashScreen 是否检测花屏
     */
    public Boolean getCrashScreen() {
        return this.CrashScreen;
    }

    /**
     * Set 是否检测花屏
     * @param CrashScreen 是否检测花屏
     */
    public void setCrashScreen(Boolean CrashScreen) {
        this.CrashScreen = CrashScreen;
    }

    /**
     * Get 是否检测黑边、白边、黑屏、白屏、绿屏 
     * @return BlackWhiteEdge 是否检测黑边、白边、黑屏、白屏、绿屏
     */
    public Boolean getBlackWhiteEdge() {
        return this.BlackWhiteEdge;
    }

    /**
     * Set 是否检测黑边、白边、黑屏、白屏、绿屏
     * @param BlackWhiteEdge 是否检测黑边、白边、黑屏、白屏、绿屏
     */
    public void setBlackWhiteEdge(Boolean BlackWhiteEdge) {
        this.BlackWhiteEdge = BlackWhiteEdge;
    }

    /**
     * Get 是否检测噪点 
     * @return Noise 是否检测噪点
     */
    public Boolean getNoise() {
        return this.Noise;
    }

    /**
     * Set 是否检测噪点
     * @param Noise 是否检测噪点
     */
    public void setNoise(Boolean Noise) {
        this.Noise = Noise;
    }

    /**
     * Get 是否检测马赛克 
     * @return Mosaic 是否检测马赛克
     */
    public Boolean getMosaic() {
        return this.Mosaic;
    }

    /**
     * Set 是否检测马赛克
     * @param Mosaic 是否检测马赛克
     */
    public void setMosaic(Boolean Mosaic) {
        this.Mosaic = Mosaic;
    }

    /**
     * Get 是否检测二维码，包括小程序码、条形码 
     * @return QRCode 是否检测二维码，包括小程序码、条形码
     */
    public Boolean getQRCode() {
        return this.QRCode;
    }

    /**
     * Set 是否检测二维码，包括小程序码、条形码
     * @param QRCode 是否检测二维码，包括小程序码、条形码
     */
    public void setQRCode(Boolean QRCode) {
        this.QRCode = QRCode;
    }

    /**
     * Get 是否开启画面质量评价 
     * @return QualityEvaluation 是否开启画面质量评价
     */
    public Boolean getQualityEvaluation() {
        return this.QualityEvaluation;
    }

    /**
     * Set 是否开启画面质量评价
     * @param QualityEvaluation 是否开启画面质量评价
     */
    public void setQualityEvaluation(Boolean QualityEvaluation) {
        this.QualityEvaluation = QualityEvaluation;
    }

    /**
     * Get 画面质量评价过滤阈值，结果只返回低于阈值的时间段，默认60 
     * @return QualityEvalScore 画面质量评价过滤阈值，结果只返回低于阈值的时间段，默认60
     */
    public Long getQualityEvalScore() {
        return this.QualityEvalScore;
    }

    /**
     * Set 画面质量评价过滤阈值，结果只返回低于阈值的时间段，默认60
     * @param QualityEvalScore 画面质量评价过滤阈值，结果只返回低于阈值的时间段，默认60
     */
    public void setQualityEvalScore(Long QualityEvalScore) {
        this.QualityEvalScore = QualityEvalScore;
    }

    /**
     * Get 是否检测视频音频，包含静音、低音、爆音 
     * @return Voice 是否检测视频音频，包含静音、低音、爆音
     */
    public Boolean getVoice() {
        return this.Voice;
    }

    /**
     * Set 是否检测视频音频，包含静音、低音、爆音
     * @param Voice 是否检测视频音频，包含静音、低音、爆音
     */
    public void setVoice(Boolean Voice) {
        this.Voice = Voice;
    }

    public QualityControlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlInfo(QualityControlInfo source) {
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.VideoShot != null) {
            this.VideoShot = new Boolean(source.VideoShot);
        }
        if (source.Jitter != null) {
            this.Jitter = new Boolean(source.Jitter);
        }
        if (source.Blur != null) {
            this.Blur = new Boolean(source.Blur);
        }
        if (source.AbnormalLighting != null) {
            this.AbnormalLighting = new Boolean(source.AbnormalLighting);
        }
        if (source.CrashScreen != null) {
            this.CrashScreen = new Boolean(source.CrashScreen);
        }
        if (source.BlackWhiteEdge != null) {
            this.BlackWhiteEdge = new Boolean(source.BlackWhiteEdge);
        }
        if (source.Noise != null) {
            this.Noise = new Boolean(source.Noise);
        }
        if (source.Mosaic != null) {
            this.Mosaic = new Boolean(source.Mosaic);
        }
        if (source.QRCode != null) {
            this.QRCode = new Boolean(source.QRCode);
        }
        if (source.QualityEvaluation != null) {
            this.QualityEvaluation = new Boolean(source.QualityEvaluation);
        }
        if (source.QualityEvalScore != null) {
            this.QualityEvalScore = new Long(source.QualityEvalScore);
        }
        if (source.Voice != null) {
            this.Voice = new Boolean(source.Voice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "VideoShot", this.VideoShot);
        this.setParamSimple(map, prefix + "Jitter", this.Jitter);
        this.setParamSimple(map, prefix + "Blur", this.Blur);
        this.setParamSimple(map, prefix + "AbnormalLighting", this.AbnormalLighting);
        this.setParamSimple(map, prefix + "CrashScreen", this.CrashScreen);
        this.setParamSimple(map, prefix + "BlackWhiteEdge", this.BlackWhiteEdge);
        this.setParamSimple(map, prefix + "Noise", this.Noise);
        this.setParamSimple(map, prefix + "Mosaic", this.Mosaic);
        this.setParamSimple(map, prefix + "QRCode", this.QRCode);
        this.setParamSimple(map, prefix + "QualityEvaluation", this.QualityEvaluation);
        this.setParamSimple(map, prefix + "QualityEvalScore", this.QualityEvalScore);
        this.setParamSimple(map, prefix + "Voice", this.Voice);

    }
}

