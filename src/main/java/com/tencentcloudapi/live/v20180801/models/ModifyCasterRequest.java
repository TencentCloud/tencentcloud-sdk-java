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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCasterRequest extends AbstractModel {

    /**
    * 导播台ID
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * 导播台名称
    */
    @SerializedName("CasterName")
    @Expose
    private String CasterName;

    /**
    * 导播台的描述，最大允许长度256
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 录制模板id。
默认为0。
当使用直播录制功能时，可将使用的录制模版填入。
该接口仅保存字段，不涉及任何录制功能。
    */
    @SerializedName("RecordTemplateId")
    @Expose
    private Long RecordTemplateId;

    /**
    * 录制状态，当调用录制接口后，可通过该字段保存录制状态。
0：未录制 
1：录制中
该接口仅保存字段，不涉及任何录制处理。
    */
    @SerializedName("RecordStatus")
    @Expose
    private Long RecordStatus;

    /**
    * 导播台的过期时间戳。值为-1或unix时间戳。
默认值为-1。 
当值为-1时，表示该导播台永不过期。 
当值为正常unix时间戳时，导播台将在该时间过期。
导播台过期后，预监与主监画面将自动停止，转推自动停止。 
点播、直播url将停止转拉，推流url需自行停止推流。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 导播台延时播放时间，单位为秒。 
默认为0，最大支持300秒
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 导播台转场类型。 
默认为空。 
允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。
    */
    @SerializedName("TransitionType")
    @Expose
    private String TransitionType;

    /**
    * 导播台主监输出的宽度，单位为像素。 
默认为1280，最大允许4096。
    */
    @SerializedName("PgmWidth")
    @Expose
    private Long PgmWidth;

    /**
    * 导播台主监输出的高度，单位为像素。 
默认为720，最大允许2160。
    */
    @SerializedName("PgmHeight")
    @Expose
    private Long PgmHeight;

    /**
    * 导播台主监输出的帧率。 
默认为0，表示随源输出。 最大支持60。
    */
    @SerializedName("PgmFps")
    @Expose
    private Long PgmFps;

    /**
    * 导播台主监输出的码率，单位为kbps。 
默认为0，表示随源的码率输出。 
最大允许10000kbps。
    */
    @SerializedName("PgmBitRate")
    @Expose
    private Long PgmBitRate;

    /**
    * 导播台的计费类型。 
0 通用型 
1 播单型。 
注： 本参数暂无作用。
    */
    @SerializedName("FeeType")
    @Expose
    private Long FeeType;

    /**
    * 录制接口返回的taskid
注：该接口只做字段保存，不涉及录制操作。
    */
    @SerializedName("RecordTaskId")
    @Expose
    private String RecordTaskId;

    /**
    * 导播台主监输出的音频码率，单位为kbps。 
可选项：[0, 128, 192, 256] 
默认值为0，表示随源的音频码率输出。
    */
    @SerializedName("PgmAudioBitRate")
    @Expose
    private Long PgmAudioBitRate;

    /**
     * Get 导播台ID 
     * @return CasterId 导播台ID
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set 导播台ID
     * @param CasterId 导播台ID
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get 导播台名称 
     * @return CasterName 导播台名称
     */
    public String getCasterName() {
        return this.CasterName;
    }

    /**
     * Set 导播台名称
     * @param CasterName 导播台名称
     */
    public void setCasterName(String CasterName) {
        this.CasterName = CasterName;
    }

    /**
     * Get 导播台的描述，最大允许长度256 
     * @return Description 导播台的描述，最大允许长度256
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 导播台的描述，最大允许长度256
     * @param Description 导播台的描述，最大允许长度256
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 录制模板id。
默认为0。
当使用直播录制功能时，可将使用的录制模版填入。
该接口仅保存字段，不涉及任何录制功能。 
     * @return RecordTemplateId 录制模板id。
默认为0。
当使用直播录制功能时，可将使用的录制模版填入。
该接口仅保存字段，不涉及任何录制功能。
     */
    public Long getRecordTemplateId() {
        return this.RecordTemplateId;
    }

    /**
     * Set 录制模板id。
默认为0。
当使用直播录制功能时，可将使用的录制模版填入。
该接口仅保存字段，不涉及任何录制功能。
     * @param RecordTemplateId 录制模板id。
默认为0。
当使用直播录制功能时，可将使用的录制模版填入。
该接口仅保存字段，不涉及任何录制功能。
     */
    public void setRecordTemplateId(Long RecordTemplateId) {
        this.RecordTemplateId = RecordTemplateId;
    }

    /**
     * Get 录制状态，当调用录制接口后，可通过该字段保存录制状态。
0：未录制 
1：录制中
该接口仅保存字段，不涉及任何录制处理。 
     * @return RecordStatus 录制状态，当调用录制接口后，可通过该字段保存录制状态。
0：未录制 
1：录制中
该接口仅保存字段，不涉及任何录制处理。
     */
    public Long getRecordStatus() {
        return this.RecordStatus;
    }

    /**
     * Set 录制状态，当调用录制接口后，可通过该字段保存录制状态。
0：未录制 
1：录制中
该接口仅保存字段，不涉及任何录制处理。
     * @param RecordStatus 录制状态，当调用录制接口后，可通过该字段保存录制状态。
0：未录制 
1：录制中
该接口仅保存字段，不涉及任何录制处理。
     */
    public void setRecordStatus(Long RecordStatus) {
        this.RecordStatus = RecordStatus;
    }

    /**
     * Get 导播台的过期时间戳。值为-1或unix时间戳。
默认值为-1。 
当值为-1时，表示该导播台永不过期。 
当值为正常unix时间戳时，导播台将在该时间过期。
导播台过期后，预监与主监画面将自动停止，转推自动停止。 
点播、直播url将停止转拉，推流url需自行停止推流。 
     * @return ExpireTime 导播台的过期时间戳。值为-1或unix时间戳。
默认值为-1。 
当值为-1时，表示该导播台永不过期。 
当值为正常unix时间戳时，导播台将在该时间过期。
导播台过期后，预监与主监画面将自动停止，转推自动停止。 
点播、直播url将停止转拉，推流url需自行停止推流。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 导播台的过期时间戳。值为-1或unix时间戳。
默认值为-1。 
当值为-1时，表示该导播台永不过期。 
当值为正常unix时间戳时，导播台将在该时间过期。
导播台过期后，预监与主监画面将自动停止，转推自动停止。 
点播、直播url将停止转拉，推流url需自行停止推流。
     * @param ExpireTime 导播台的过期时间戳。值为-1或unix时间戳。
默认值为-1。 
当值为-1时，表示该导播台永不过期。 
当值为正常unix时间戳时，导播台将在该时间过期。
导播台过期后，预监与主监画面将自动停止，转推自动停止。 
点播、直播url将停止转拉，推流url需自行停止推流。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 导播台延时播放时间，单位为秒。 
默认为0，最大支持300秒 
     * @return DelayTime 导播台延时播放时间，单位为秒。 
默认为0，最大支持300秒
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 导播台延时播放时间，单位为秒。 
默认为0，最大支持300秒
     * @param DelayTime 导播台延时播放时间，单位为秒。 
默认为0，最大支持300秒
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 导播台转场类型。 
默认为空。 
允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。 
     * @return TransitionType 导播台转场类型。 
默认为空。 
允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。
     */
    public String getTransitionType() {
        return this.TransitionType;
    }

    /**
     * Set 导播台转场类型。 
默认为空。 
允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。
     * @param TransitionType 导播台转场类型。 
默认为空。 
允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。
     */
    public void setTransitionType(String TransitionType) {
        this.TransitionType = TransitionType;
    }

    /**
     * Get 导播台主监输出的宽度，单位为像素。 
默认为1280，最大允许4096。 
     * @return PgmWidth 导播台主监输出的宽度，单位为像素。 
默认为1280，最大允许4096。
     */
    public Long getPgmWidth() {
        return this.PgmWidth;
    }

    /**
     * Set 导播台主监输出的宽度，单位为像素。 
默认为1280，最大允许4096。
     * @param PgmWidth 导播台主监输出的宽度，单位为像素。 
默认为1280，最大允许4096。
     */
    public void setPgmWidth(Long PgmWidth) {
        this.PgmWidth = PgmWidth;
    }

    /**
     * Get 导播台主监输出的高度，单位为像素。 
默认为720，最大允许2160。 
     * @return PgmHeight 导播台主监输出的高度，单位为像素。 
默认为720，最大允许2160。
     */
    public Long getPgmHeight() {
        return this.PgmHeight;
    }

    /**
     * Set 导播台主监输出的高度，单位为像素。 
默认为720，最大允许2160。
     * @param PgmHeight 导播台主监输出的高度，单位为像素。 
默认为720，最大允许2160。
     */
    public void setPgmHeight(Long PgmHeight) {
        this.PgmHeight = PgmHeight;
    }

    /**
     * Get 导播台主监输出的帧率。 
默认为0，表示随源输出。 最大支持60。 
     * @return PgmFps 导播台主监输出的帧率。 
默认为0，表示随源输出。 最大支持60。
     */
    public Long getPgmFps() {
        return this.PgmFps;
    }

    /**
     * Set 导播台主监输出的帧率。 
默认为0，表示随源输出。 最大支持60。
     * @param PgmFps 导播台主监输出的帧率。 
默认为0，表示随源输出。 最大支持60。
     */
    public void setPgmFps(Long PgmFps) {
        this.PgmFps = PgmFps;
    }

    /**
     * Get 导播台主监输出的码率，单位为kbps。 
默认为0，表示随源的码率输出。 
最大允许10000kbps。 
     * @return PgmBitRate 导播台主监输出的码率，单位为kbps。 
默认为0，表示随源的码率输出。 
最大允许10000kbps。
     */
    public Long getPgmBitRate() {
        return this.PgmBitRate;
    }

    /**
     * Set 导播台主监输出的码率，单位为kbps。 
默认为0，表示随源的码率输出。 
最大允许10000kbps。
     * @param PgmBitRate 导播台主监输出的码率，单位为kbps。 
默认为0，表示随源的码率输出。 
最大允许10000kbps。
     */
    public void setPgmBitRate(Long PgmBitRate) {
        this.PgmBitRate = PgmBitRate;
    }

    /**
     * Get 导播台的计费类型。 
0 通用型 
1 播单型。 
注： 本参数暂无作用。 
     * @return FeeType 导播台的计费类型。 
0 通用型 
1 播单型。 
注： 本参数暂无作用。
     */
    public Long getFeeType() {
        return this.FeeType;
    }

    /**
     * Set 导播台的计费类型。 
0 通用型 
1 播单型。 
注： 本参数暂无作用。
     * @param FeeType 导播台的计费类型。 
0 通用型 
1 播单型。 
注： 本参数暂无作用。
     */
    public void setFeeType(Long FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get 录制接口返回的taskid
注：该接口只做字段保存，不涉及录制操作。 
     * @return RecordTaskId 录制接口返回的taskid
注：该接口只做字段保存，不涉及录制操作。
     */
    public String getRecordTaskId() {
        return this.RecordTaskId;
    }

    /**
     * Set 录制接口返回的taskid
注：该接口只做字段保存，不涉及录制操作。
     * @param RecordTaskId 录制接口返回的taskid
注：该接口只做字段保存，不涉及录制操作。
     */
    public void setRecordTaskId(String RecordTaskId) {
        this.RecordTaskId = RecordTaskId;
    }

    /**
     * Get 导播台主监输出的音频码率，单位为kbps。 
可选项：[0, 128, 192, 256] 
默认值为0，表示随源的音频码率输出。 
     * @return PgmAudioBitRate 导播台主监输出的音频码率，单位为kbps。 
可选项：[0, 128, 192, 256] 
默认值为0，表示随源的音频码率输出。
     */
    public Long getPgmAudioBitRate() {
        return this.PgmAudioBitRate;
    }

    /**
     * Set 导播台主监输出的音频码率，单位为kbps。 
可选项：[0, 128, 192, 256] 
默认值为0，表示随源的音频码率输出。
     * @param PgmAudioBitRate 导播台主监输出的音频码率，单位为kbps。 
可选项：[0, 128, 192, 256] 
默认值为0，表示随源的音频码率输出。
     */
    public void setPgmAudioBitRate(Long PgmAudioBitRate) {
        this.PgmAudioBitRate = PgmAudioBitRate;
    }

    public ModifyCasterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCasterRequest(ModifyCasterRequest source) {
        if (source.CasterId != null) {
            this.CasterId = new Long(source.CasterId);
        }
        if (source.CasterName != null) {
            this.CasterName = new String(source.CasterName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RecordTemplateId != null) {
            this.RecordTemplateId = new Long(source.RecordTemplateId);
        }
        if (source.RecordStatus != null) {
            this.RecordStatus = new Long(source.RecordStatus);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.TransitionType != null) {
            this.TransitionType = new String(source.TransitionType);
        }
        if (source.PgmWidth != null) {
            this.PgmWidth = new Long(source.PgmWidth);
        }
        if (source.PgmHeight != null) {
            this.PgmHeight = new Long(source.PgmHeight);
        }
        if (source.PgmFps != null) {
            this.PgmFps = new Long(source.PgmFps);
        }
        if (source.PgmBitRate != null) {
            this.PgmBitRate = new Long(source.PgmBitRate);
        }
        if (source.FeeType != null) {
            this.FeeType = new Long(source.FeeType);
        }
        if (source.RecordTaskId != null) {
            this.RecordTaskId = new String(source.RecordTaskId);
        }
        if (source.PgmAudioBitRate != null) {
            this.PgmAudioBitRate = new Long(source.PgmAudioBitRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasterId", this.CasterId);
        this.setParamSimple(map, prefix + "CasterName", this.CasterName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RecordTemplateId", this.RecordTemplateId);
        this.setParamSimple(map, prefix + "RecordStatus", this.RecordStatus);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "TransitionType", this.TransitionType);
        this.setParamSimple(map, prefix + "PgmWidth", this.PgmWidth);
        this.setParamSimple(map, prefix + "PgmHeight", this.PgmHeight);
        this.setParamSimple(map, prefix + "PgmFps", this.PgmFps);
        this.setParamSimple(map, prefix + "PgmBitRate", this.PgmBitRate);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamSimple(map, prefix + "RecordTaskId", this.RecordTaskId);
        this.setParamSimple(map, prefix + "PgmAudioBitRate", this.PgmAudioBitRate);

    }
}

