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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentionVerifyData extends AbstractModel {

    /**
    * <p>意愿确认环节中录制的视频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionVerifyVideo")
    @Expose
    private String IntentionVerifyVideo;

    /**
    * <p>意愿确认环节中用户语音转文字的识别结果。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrResult")
    @Expose
    private String AsrResult;

    /**
    * <p>意愿确认环节（朗读模式）的结果码。取值范围：<br>0: &quot;成功&quot;<br>-1: &quot;系统异常&quot;<br>-2: &quot;参数错误&quot;<br>-3:&quot;业务繁忙，请重试&quot;<br>-4：&quot;后端服务异常，请重试&quot;<br>-5：&quot;后端服务进房异常，请重试&quot;<br>-6：&quot;后端服务录制异常，请重试&quot;<br>-7：&quot;文件存储异常，请重试&quot;<br>-8：&quot;后端服务重复进房，请重试&quot;<br>-9：&quot;实时视频流异常，请重试&quot;<br>-10：&quot;语音识别失败，请重试&quot;<br>-11：&quot;流程已中断，请重试&quot;<br>-12：&quot;流程未完成，请重试&quot;<br>-13：&quot;token校验不通过，请重试&quot;<br>-14：&quot;流程已结束&quot;<br>-15:&quot;超过预设重试次数&quot;<br>-16:&quot;系统未知错误，请联系人工核实&quot;<br>-17:&quot;未检测到用户声音&quot;<br>3001:&quot;请保持人脸在框内&quot;<br>3002:&quot;检测到多张人脸&quot;<br>3003:&quot;人脸检测失败&quot;<br>3011:&quot;人脸比对相似度低&quot;<br>3012:&quot;人脸比对失败&quot;<br>-800: &quot;前端不兼容错误&quot;<br>-801: &quot;用户未授权摄像头和麦克风权限&quot;<br>-802: &quot;核验流程异常中断，请勿切屏或进行其他操作&quot;<br>-803: &quot;用户主动关闭链接/异常断开链接&quot;</p><p>说明：若在人脸核身过程失败、未进入意愿确认过程，则该参数返回为空，请参考人脸核身错误码结果（DetectInfoText.ErrCode）注意：此字段可能返回 null，表示取不到有效值。<br>示例值：0</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * <p>意愿确认环节的结果信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>意愿确认环节中录制视频的最佳帧（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionVerifyBestFrame")
    @Expose
    private String IntentionVerifyBestFrame;

    /**
    * <p>本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrResultSimilarity")
    @Expose
    private String AsrResultSimilarity;

    /**
    * <p>意愿确认环节中录制的音频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionVerifyAudio")
    @Expose
    private String IntentionVerifyAudio;

    /**
     * Get <p>意愿确认环节中录制的视频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionVerifyVideo <p>意愿确认环节中录制的视频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntentionVerifyVideo() {
        return this.IntentionVerifyVideo;
    }

    /**
     * Set <p>意愿确认环节中录制的视频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionVerifyVideo <p>意愿确认环节中录制的视频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionVerifyVideo(String IntentionVerifyVideo) {
        this.IntentionVerifyVideo = IntentionVerifyVideo;
    }

    /**
     * Get <p>意愿确认环节中用户语音转文字的识别结果。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrResult <p>意愿确认环节中用户语音转文字的识别结果。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsrResult() {
        return this.AsrResult;
    }

    /**
     * Set <p>意愿确认环节中用户语音转文字的识别结果。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrResult <p>意愿确认环节中用户语音转文字的识别结果。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrResult(String AsrResult) {
        this.AsrResult = AsrResult;
    }

    /**
     * Get <p>意愿确认环节（朗读模式）的结果码。取值范围：<br>0: &quot;成功&quot;<br>-1: &quot;系统异常&quot;<br>-2: &quot;参数错误&quot;<br>-3:&quot;业务繁忙，请重试&quot;<br>-4：&quot;后端服务异常，请重试&quot;<br>-5：&quot;后端服务进房异常，请重试&quot;<br>-6：&quot;后端服务录制异常，请重试&quot;<br>-7：&quot;文件存储异常，请重试&quot;<br>-8：&quot;后端服务重复进房，请重试&quot;<br>-9：&quot;实时视频流异常，请重试&quot;<br>-10：&quot;语音识别失败，请重试&quot;<br>-11：&quot;流程已中断，请重试&quot;<br>-12：&quot;流程未完成，请重试&quot;<br>-13：&quot;token校验不通过，请重试&quot;<br>-14：&quot;流程已结束&quot;<br>-15:&quot;超过预设重试次数&quot;<br>-16:&quot;系统未知错误，请联系人工核实&quot;<br>-17:&quot;未检测到用户声音&quot;<br>3001:&quot;请保持人脸在框内&quot;<br>3002:&quot;检测到多张人脸&quot;<br>3003:&quot;人脸检测失败&quot;<br>3011:&quot;人脸比对相似度低&quot;<br>3012:&quot;人脸比对失败&quot;<br>-800: &quot;前端不兼容错误&quot;<br>-801: &quot;用户未授权摄像头和麦克风权限&quot;<br>-802: &quot;核验流程异常中断，请勿切屏或进行其他操作&quot;<br>-803: &quot;用户主动关闭链接/异常断开链接&quot;</p><p>说明：若在人脸核身过程失败、未进入意愿确认过程，则该参数返回为空，请参考人脸核身错误码结果（DetectInfoText.ErrCode）注意：此字段可能返回 null，表示取不到有效值。<br>示例值：0</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode <p>意愿确认环节（朗读模式）的结果码。取值范围：<br>0: &quot;成功&quot;<br>-1: &quot;系统异常&quot;<br>-2: &quot;参数错误&quot;<br>-3:&quot;业务繁忙，请重试&quot;<br>-4：&quot;后端服务异常，请重试&quot;<br>-5：&quot;后端服务进房异常，请重试&quot;<br>-6：&quot;后端服务录制异常，请重试&quot;<br>-7：&quot;文件存储异常，请重试&quot;<br>-8：&quot;后端服务重复进房，请重试&quot;<br>-9：&quot;实时视频流异常，请重试&quot;<br>-10：&quot;语音识别失败，请重试&quot;<br>-11：&quot;流程已中断，请重试&quot;<br>-12：&quot;流程未完成，请重试&quot;<br>-13：&quot;token校验不通过，请重试&quot;<br>-14：&quot;流程已结束&quot;<br>-15:&quot;超过预设重试次数&quot;<br>-16:&quot;系统未知错误，请联系人工核实&quot;<br>-17:&quot;未检测到用户声音&quot;<br>3001:&quot;请保持人脸在框内&quot;<br>3002:&quot;检测到多张人脸&quot;<br>3003:&quot;人脸检测失败&quot;<br>3011:&quot;人脸比对相似度低&quot;<br>3012:&quot;人脸比对失败&quot;<br>-800: &quot;前端不兼容错误&quot;<br>-801: &quot;用户未授权摄像头和麦克风权限&quot;<br>-802: &quot;核验流程异常中断，请勿切屏或进行其他操作&quot;<br>-803: &quot;用户主动关闭链接/异常断开链接&quot;</p><p>说明：若在人脸核身过程失败、未进入意愿确认过程，则该参数返回为空，请参考人脸核身错误码结果（DetectInfoText.ErrCode）注意：此字段可能返回 null，表示取不到有效值。<br>示例值：0</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>意愿确认环节（朗读模式）的结果码。取值范围：<br>0: &quot;成功&quot;<br>-1: &quot;系统异常&quot;<br>-2: &quot;参数错误&quot;<br>-3:&quot;业务繁忙，请重试&quot;<br>-4：&quot;后端服务异常，请重试&quot;<br>-5：&quot;后端服务进房异常，请重试&quot;<br>-6：&quot;后端服务录制异常，请重试&quot;<br>-7：&quot;文件存储异常，请重试&quot;<br>-8：&quot;后端服务重复进房，请重试&quot;<br>-9：&quot;实时视频流异常，请重试&quot;<br>-10：&quot;语音识别失败，请重试&quot;<br>-11：&quot;流程已中断，请重试&quot;<br>-12：&quot;流程未完成，请重试&quot;<br>-13：&quot;token校验不通过，请重试&quot;<br>-14：&quot;流程已结束&quot;<br>-15:&quot;超过预设重试次数&quot;<br>-16:&quot;系统未知错误，请联系人工核实&quot;<br>-17:&quot;未检测到用户声音&quot;<br>3001:&quot;请保持人脸在框内&quot;<br>3002:&quot;检测到多张人脸&quot;<br>3003:&quot;人脸检测失败&quot;<br>3011:&quot;人脸比对相似度低&quot;<br>3012:&quot;人脸比对失败&quot;<br>-800: &quot;前端不兼容错误&quot;<br>-801: &quot;用户未授权摄像头和麦克风权限&quot;<br>-802: &quot;核验流程异常中断，请勿切屏或进行其他操作&quot;<br>-803: &quot;用户主动关闭链接/异常断开链接&quot;</p><p>说明：若在人脸核身过程失败、未进入意愿确认过程，则该参数返回为空，请参考人脸核身错误码结果（DetectInfoText.ErrCode）注意：此字段可能返回 null，表示取不到有效值。<br>示例值：0</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode <p>意愿确认环节（朗读模式）的结果码。取值范围：<br>0: &quot;成功&quot;<br>-1: &quot;系统异常&quot;<br>-2: &quot;参数错误&quot;<br>-3:&quot;业务繁忙，请重试&quot;<br>-4：&quot;后端服务异常，请重试&quot;<br>-5：&quot;后端服务进房异常，请重试&quot;<br>-6：&quot;后端服务录制异常，请重试&quot;<br>-7：&quot;文件存储异常，请重试&quot;<br>-8：&quot;后端服务重复进房，请重试&quot;<br>-9：&quot;实时视频流异常，请重试&quot;<br>-10：&quot;语音识别失败，请重试&quot;<br>-11：&quot;流程已中断，请重试&quot;<br>-12：&quot;流程未完成，请重试&quot;<br>-13：&quot;token校验不通过，请重试&quot;<br>-14：&quot;流程已结束&quot;<br>-15:&quot;超过预设重试次数&quot;<br>-16:&quot;系统未知错误，请联系人工核实&quot;<br>-17:&quot;未检测到用户声音&quot;<br>3001:&quot;请保持人脸在框内&quot;<br>3002:&quot;检测到多张人脸&quot;<br>3003:&quot;人脸检测失败&quot;<br>3011:&quot;人脸比对相似度低&quot;<br>3012:&quot;人脸比对失败&quot;<br>-800: &quot;前端不兼容错误&quot;<br>-801: &quot;用户未授权摄像头和麦克风权限&quot;<br>-802: &quot;核验流程异常中断，请勿切屏或进行其他操作&quot;<br>-803: &quot;用户主动关闭链接/异常断开链接&quot;</p><p>说明：若在人脸核身过程失败、未进入意愿确认过程，则该参数返回为空，请参考人脸核身错误码结果（DetectInfoText.ErrCode）注意：此字段可能返回 null，表示取不到有效值。<br>示例值：0</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>意愿确认环节的结果信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage <p>意愿确认环节的结果信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>意愿确认环节的结果信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage <p>意愿确认环节的结果信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>意愿确认环节中录制视频的最佳帧（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionVerifyBestFrame <p>意愿确认环节中录制视频的最佳帧（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntentionVerifyBestFrame() {
        return this.IntentionVerifyBestFrame;
    }

    /**
     * Set <p>意愿确认环节中录制视频的最佳帧（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionVerifyBestFrame <p>意愿确认环节中录制视频的最佳帧（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionVerifyBestFrame(String IntentionVerifyBestFrame) {
        this.IntentionVerifyBestFrame = IntentionVerifyBestFrame;
    }

    /**
     * Get <p>本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrResultSimilarity <p>本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getAsrResultSimilarity() {
        return this.AsrResultSimilarity;
    }

    /**
     * Set <p>本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrResultSimilarity <p>本次流程用户语音与传入文本比对的相似度分值，取值范围 [0.00, 100.00]。只有配置了相似度阈值后才进行语音校验并返回相似度分值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setAsrResultSimilarity(String AsrResultSimilarity) {
        this.AsrResultSimilarity = AsrResultSimilarity;
    }

    /**
     * Get <p>意愿确认环节中录制的音频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionVerifyAudio <p>意愿确认环节中录制的音频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntentionVerifyAudio() {
        return this.IntentionVerifyAudio;
    }

    /**
     * Set <p>意愿确认环节中录制的音频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionVerifyAudio <p>意愿确认环节中录制的音频（base64）。</p><ul><li>若不存在则为空字符串。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionVerifyAudio(String IntentionVerifyAudio) {
        this.IntentionVerifyAudio = IntentionVerifyAudio;
    }

    public IntentionVerifyData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentionVerifyData(IntentionVerifyData source) {
        if (source.IntentionVerifyVideo != null) {
            this.IntentionVerifyVideo = new String(source.IntentionVerifyVideo);
        }
        if (source.AsrResult != null) {
            this.AsrResult = new String(source.AsrResult);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.IntentionVerifyBestFrame != null) {
            this.IntentionVerifyBestFrame = new String(source.IntentionVerifyBestFrame);
        }
        if (source.AsrResultSimilarity != null) {
            this.AsrResultSimilarity = new String(source.AsrResultSimilarity);
        }
        if (source.IntentionVerifyAudio != null) {
            this.IntentionVerifyAudio = new String(source.IntentionVerifyAudio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntentionVerifyVideo", this.IntentionVerifyVideo);
        this.setParamSimple(map, prefix + "AsrResult", this.AsrResult);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "IntentionVerifyBestFrame", this.IntentionVerifyBestFrame);
        this.setParamSimple(map, prefix + "AsrResultSimilarity", this.AsrResultSimilarity);
        this.setParamSimple(map, prefix + "IntentionVerifyAudio", this.IntentionVerifyAudio);

    }
}

