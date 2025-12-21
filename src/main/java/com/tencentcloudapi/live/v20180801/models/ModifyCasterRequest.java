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
    * <p>导播台ID</p>
    */
    @SerializedName("CasterId")
    @Expose
    private Long CasterId;

    /**
    * <p>导播台名称</p>
    */
    @SerializedName("CasterName")
    @Expose
    private String CasterName;

    /**
    * <p>导播台的描述，最大允许长度256</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>录制模板id。默认为0。当使用直播录制功能时，可将使用的录制模版填入。该接口仅保存字段，不涉及任何录制功能。</p>
    */
    @SerializedName("RecordTemplateId")
    @Expose
    private Long RecordTemplateId;

    /**
    * <p>录制状态，当调用录制接口后，可通过该字段保存录制状态。0：未录制 1：录制中该接口仅保存字段，不涉及任何录制处理。</p>
    */
    @SerializedName("RecordStatus")
    @Expose
    private Long RecordStatus;

    /**
    * <p>导播台的过期时间戳。值为-1或unix时间戳。默认值为-1。 当值为-1时，表示该导播台永不过期。 当值为正常unix时间戳时，导播台将在该时间过期。导播台过期后，预监与主监画面将自动停止，转推自动停止。 点播、直播url将停止转拉，推流url需自行停止推流。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>导播台延时播放时间，单位为秒。 默认为0，最大支持300秒</p>
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * <p>导播台转场类型。 默认为空。 允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。</p>
    */
    @SerializedName("TransitionType")
    @Expose
    private String TransitionType;

    /**
    * <p>导播台主监输出的宽度，单位为像素。 默认为1280，最大允许4096。</p>
    */
    @SerializedName("PgmWidth")
    @Expose
    private Long PgmWidth;

    /**
    * <p>导播台主监输出的高度，单位为像素。 默认为720，最大允许2160。</p>
    */
    @SerializedName("PgmHeight")
    @Expose
    private Long PgmHeight;

    /**
    * <p>导播台主监输出的帧率。 默认为0，表示随源输出。 最大支持60。</p>
    */
    @SerializedName("PgmFps")
    @Expose
    private Long PgmFps;

    /**
    * <p>导播台主监输出的码率，单位为kbps。 默认为0，表示随源的码率输出。 最大允许10000kbps。</p>
    */
    @SerializedName("PgmBitRate")
    @Expose
    private Long PgmBitRate;

    /**
    * <p>导播台的计费类型。 0 通用型 1 播单型。 注： 本参数暂无作用。</p>
    */
    @SerializedName("FeeType")
    @Expose
    private Long FeeType;

    /**
    * <p>录制接口返回的taskid注：该接口只做字段保存，不涉及录制操作。</p>
    */
    @SerializedName("RecordTaskId")
    @Expose
    private String RecordTaskId;

    /**
    * <p>导播台主监输出的音频码率，单位为kbps。 可选项：[0, 128, 192, 256] 默认值为0，表示随源的音频码率输出。</p>
    */
    @SerializedName("PgmAudioBitRate")
    @Expose
    private Long PgmAudioBitRate;

    /**
     * Get <p>导播台ID</p> 
     * @return CasterId <p>导播台ID</p>
     */
    public Long getCasterId() {
        return this.CasterId;
    }

    /**
     * Set <p>导播台ID</p>
     * @param CasterId <p>导播台ID</p>
     */
    public void setCasterId(Long CasterId) {
        this.CasterId = CasterId;
    }

    /**
     * Get <p>导播台名称</p> 
     * @return CasterName <p>导播台名称</p>
     */
    public String getCasterName() {
        return this.CasterName;
    }

    /**
     * Set <p>导播台名称</p>
     * @param CasterName <p>导播台名称</p>
     */
    public void setCasterName(String CasterName) {
        this.CasterName = CasterName;
    }

    /**
     * Get <p>导播台的描述，最大允许长度256</p> 
     * @return Description <p>导播台的描述，最大允许长度256</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>导播台的描述，最大允许长度256</p>
     * @param Description <p>导播台的描述，最大允许长度256</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>录制模板id。默认为0。当使用直播录制功能时，可将使用的录制模版填入。该接口仅保存字段，不涉及任何录制功能。</p> 
     * @return RecordTemplateId <p>录制模板id。默认为0。当使用直播录制功能时，可将使用的录制模版填入。该接口仅保存字段，不涉及任何录制功能。</p>
     */
    public Long getRecordTemplateId() {
        return this.RecordTemplateId;
    }

    /**
     * Set <p>录制模板id。默认为0。当使用直播录制功能时，可将使用的录制模版填入。该接口仅保存字段，不涉及任何录制功能。</p>
     * @param RecordTemplateId <p>录制模板id。默认为0。当使用直播录制功能时，可将使用的录制模版填入。该接口仅保存字段，不涉及任何录制功能。</p>
     */
    public void setRecordTemplateId(Long RecordTemplateId) {
        this.RecordTemplateId = RecordTemplateId;
    }

    /**
     * Get <p>录制状态，当调用录制接口后，可通过该字段保存录制状态。0：未录制 1：录制中该接口仅保存字段，不涉及任何录制处理。</p> 
     * @return RecordStatus <p>录制状态，当调用录制接口后，可通过该字段保存录制状态。0：未录制 1：录制中该接口仅保存字段，不涉及任何录制处理。</p>
     */
    public Long getRecordStatus() {
        return this.RecordStatus;
    }

    /**
     * Set <p>录制状态，当调用录制接口后，可通过该字段保存录制状态。0：未录制 1：录制中该接口仅保存字段，不涉及任何录制处理。</p>
     * @param RecordStatus <p>录制状态，当调用录制接口后，可通过该字段保存录制状态。0：未录制 1：录制中该接口仅保存字段，不涉及任何录制处理。</p>
     */
    public void setRecordStatus(Long RecordStatus) {
        this.RecordStatus = RecordStatus;
    }

    /**
     * Get <p>导播台的过期时间戳。值为-1或unix时间戳。默认值为-1。 当值为-1时，表示该导播台永不过期。 当值为正常unix时间戳时，导播台将在该时间过期。导播台过期后，预监与主监画面将自动停止，转推自动停止。 点播、直播url将停止转拉，推流url需自行停止推流。</p> 
     * @return ExpireTime <p>导播台的过期时间戳。值为-1或unix时间戳。默认值为-1。 当值为-1时，表示该导播台永不过期。 当值为正常unix时间戳时，导播台将在该时间过期。导播台过期后，预监与主监画面将自动停止，转推自动停止。 点播、直播url将停止转拉，推流url需自行停止推流。</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>导播台的过期时间戳。值为-1或unix时间戳。默认值为-1。 当值为-1时，表示该导播台永不过期。 当值为正常unix时间戳时，导播台将在该时间过期。导播台过期后，预监与主监画面将自动停止，转推自动停止。 点播、直播url将停止转拉，推流url需自行停止推流。</p>
     * @param ExpireTime <p>导播台的过期时间戳。值为-1或unix时间戳。默认值为-1。 当值为-1时，表示该导播台永不过期。 当值为正常unix时间戳时，导播台将在该时间过期。导播台过期后，预监与主监画面将自动停止，转推自动停止。 点播、直播url将停止转拉，推流url需自行停止推流。</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>导播台延时播放时间，单位为秒。 默认为0，最大支持300秒</p> 
     * @return DelayTime <p>导播台延时播放时间，单位为秒。 默认为0，最大支持300秒</p>
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>导播台延时播放时间，单位为秒。 默认为0，最大支持300秒</p>
     * @param DelayTime <p>导播台延时播放时间，单位为秒。 默认为0，最大支持300秒</p>
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>导播台转场类型。 默认为空。 允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。</p> 
     * @return TransitionType <p>导播台转场类型。 默认为空。 允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。</p>
     */
    public String getTransitionType() {
        return this.TransitionType;
    }

    /**
     * Set <p>导播台转场类型。 默认为空。 允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。</p>
     * @param TransitionType <p>导播台转场类型。 默认为空。 允许使用通过DescribeCasterTransitionTypes接口中查询到的转场类型。</p>
     */
    public void setTransitionType(String TransitionType) {
        this.TransitionType = TransitionType;
    }

    /**
     * Get <p>导播台主监输出的宽度，单位为像素。 默认为1280，最大允许4096。</p> 
     * @return PgmWidth <p>导播台主监输出的宽度，单位为像素。 默认为1280，最大允许4096。</p>
     */
    public Long getPgmWidth() {
        return this.PgmWidth;
    }

    /**
     * Set <p>导播台主监输出的宽度，单位为像素。 默认为1280，最大允许4096。</p>
     * @param PgmWidth <p>导播台主监输出的宽度，单位为像素。 默认为1280，最大允许4096。</p>
     */
    public void setPgmWidth(Long PgmWidth) {
        this.PgmWidth = PgmWidth;
    }

    /**
     * Get <p>导播台主监输出的高度，单位为像素。 默认为720，最大允许2160。</p> 
     * @return PgmHeight <p>导播台主监输出的高度，单位为像素。 默认为720，最大允许2160。</p>
     */
    public Long getPgmHeight() {
        return this.PgmHeight;
    }

    /**
     * Set <p>导播台主监输出的高度，单位为像素。 默认为720，最大允许2160。</p>
     * @param PgmHeight <p>导播台主监输出的高度，单位为像素。 默认为720，最大允许2160。</p>
     */
    public void setPgmHeight(Long PgmHeight) {
        this.PgmHeight = PgmHeight;
    }

    /**
     * Get <p>导播台主监输出的帧率。 默认为0，表示随源输出。 最大支持60。</p> 
     * @return PgmFps <p>导播台主监输出的帧率。 默认为0，表示随源输出。 最大支持60。</p>
     */
    public Long getPgmFps() {
        return this.PgmFps;
    }

    /**
     * Set <p>导播台主监输出的帧率。 默认为0，表示随源输出。 最大支持60。</p>
     * @param PgmFps <p>导播台主监输出的帧率。 默认为0，表示随源输出。 最大支持60。</p>
     */
    public void setPgmFps(Long PgmFps) {
        this.PgmFps = PgmFps;
    }

    /**
     * Get <p>导播台主监输出的码率，单位为kbps。 默认为0，表示随源的码率输出。 最大允许10000kbps。</p> 
     * @return PgmBitRate <p>导播台主监输出的码率，单位为kbps。 默认为0，表示随源的码率输出。 最大允许10000kbps。</p>
     */
    public Long getPgmBitRate() {
        return this.PgmBitRate;
    }

    /**
     * Set <p>导播台主监输出的码率，单位为kbps。 默认为0，表示随源的码率输出。 最大允许10000kbps。</p>
     * @param PgmBitRate <p>导播台主监输出的码率，单位为kbps。 默认为0，表示随源的码率输出。 最大允许10000kbps。</p>
     */
    public void setPgmBitRate(Long PgmBitRate) {
        this.PgmBitRate = PgmBitRate;
    }

    /**
     * Get <p>导播台的计费类型。 0 通用型 1 播单型。 注： 本参数暂无作用。</p> 
     * @return FeeType <p>导播台的计费类型。 0 通用型 1 播单型。 注： 本参数暂无作用。</p>
     */
    public Long getFeeType() {
        return this.FeeType;
    }

    /**
     * Set <p>导播台的计费类型。 0 通用型 1 播单型。 注： 本参数暂无作用。</p>
     * @param FeeType <p>导播台的计费类型。 0 通用型 1 播单型。 注： 本参数暂无作用。</p>
     */
    public void setFeeType(Long FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get <p>录制接口返回的taskid注：该接口只做字段保存，不涉及录制操作。</p> 
     * @return RecordTaskId <p>录制接口返回的taskid注：该接口只做字段保存，不涉及录制操作。</p>
     */
    public String getRecordTaskId() {
        return this.RecordTaskId;
    }

    /**
     * Set <p>录制接口返回的taskid注：该接口只做字段保存，不涉及录制操作。</p>
     * @param RecordTaskId <p>录制接口返回的taskid注：该接口只做字段保存，不涉及录制操作。</p>
     */
    public void setRecordTaskId(String RecordTaskId) {
        this.RecordTaskId = RecordTaskId;
    }

    /**
     * Get <p>导播台主监输出的音频码率，单位为kbps。 可选项：[0, 128, 192, 256] 默认值为0，表示随源的音频码率输出。</p> 
     * @return PgmAudioBitRate <p>导播台主监输出的音频码率，单位为kbps。 可选项：[0, 128, 192, 256] 默认值为0，表示随源的音频码率输出。</p>
     */
    public Long getPgmAudioBitRate() {
        return this.PgmAudioBitRate;
    }

    /**
     * Set <p>导播台主监输出的音频码率，单位为kbps。 可选项：[0, 128, 192, 256] 默认值为0，表示随源的音频码率输出。</p>
     * @param PgmAudioBitRate <p>导播台主监输出的音频码率，单位为kbps。 可选项：[0, 128, 192, 256] 默认值为0，表示随源的音频码率输出。</p>
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

