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

public class CallBackTemplateInfo extends AbstractModel {

    /**
    * 模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 模板名称。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 开播回调 URL。
    */
    @SerializedName("StreamBeginNotifyUrl")
    @Expose
    private String StreamBeginNotifyUrl;

    /**
    * 混流回调 URL。(参数已弃用)。
    */
    @SerializedName("StreamMixNotifyUrl")
    @Expose
    private String StreamMixNotifyUrl;

    /**
    * 断流回调 URL。
    */
    @SerializedName("StreamEndNotifyUrl")
    @Expose
    private String StreamEndNotifyUrl;

    /**
    * 录制文件回调 URL。
    */
    @SerializedName("RecordNotifyUrl")
    @Expose
    private String RecordNotifyUrl;

    /**
    * 截图回调 URL。
    */
    @SerializedName("SnapshotNotifyUrl")
    @Expose
    private String SnapshotNotifyUrl;

    /**
    * 鉴黄回调 URL。
    */
    @SerializedName("PornCensorshipNotifyUrl")
    @Expose
    private String PornCensorshipNotifyUrl;

    /**
    * 回调的鉴权 key。
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * 推流异常回调 URL。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PushExceptionNotifyUrl")
    @Expose
    private String PushExceptionNotifyUrl;

    /**
    * 音频审核回调 URL。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioAuditNotifyUrl")
    @Expose
    private String AudioAuditNotifyUrl;

    /**
    * 录制异常回调 URL。
    */
    @SerializedName("RecordExceptionNotifyUrl")
    @Expose
    private String RecordExceptionNotifyUrl;

    /**
    * 录制异常回调级别，可选择：error: 错误。alarm: 告警。
    */
    @SerializedName("RecordExceptionLevels")
    @Expose
    private String [] RecordExceptionLevels;

    /**
     * Get 模板 ID。 
     * @return TemplateId 模板 ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 ID。
     * @param TemplateId 模板 ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称。 
     * @return TemplateName 模板名称。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
     * @param TemplateName 模板名称。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 描述信息。 
     * @return Description 描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
     * @param Description 描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 开播回调 URL。 
     * @return StreamBeginNotifyUrl 开播回调 URL。
     */
    public String getStreamBeginNotifyUrl() {
        return this.StreamBeginNotifyUrl;
    }

    /**
     * Set 开播回调 URL。
     * @param StreamBeginNotifyUrl 开播回调 URL。
     */
    public void setStreamBeginNotifyUrl(String StreamBeginNotifyUrl) {
        this.StreamBeginNotifyUrl = StreamBeginNotifyUrl;
    }

    /**
     * Get 混流回调 URL。(参数已弃用)。 
     * @return StreamMixNotifyUrl 混流回调 URL。(参数已弃用)。
     */
    public String getStreamMixNotifyUrl() {
        return this.StreamMixNotifyUrl;
    }

    /**
     * Set 混流回调 URL。(参数已弃用)。
     * @param StreamMixNotifyUrl 混流回调 URL。(参数已弃用)。
     */
    public void setStreamMixNotifyUrl(String StreamMixNotifyUrl) {
        this.StreamMixNotifyUrl = StreamMixNotifyUrl;
    }

    /**
     * Get 断流回调 URL。 
     * @return StreamEndNotifyUrl 断流回调 URL。
     */
    public String getStreamEndNotifyUrl() {
        return this.StreamEndNotifyUrl;
    }

    /**
     * Set 断流回调 URL。
     * @param StreamEndNotifyUrl 断流回调 URL。
     */
    public void setStreamEndNotifyUrl(String StreamEndNotifyUrl) {
        this.StreamEndNotifyUrl = StreamEndNotifyUrl;
    }

    /**
     * Get 录制文件回调 URL。 
     * @return RecordNotifyUrl 录制文件回调 URL。
     */
    public String getRecordNotifyUrl() {
        return this.RecordNotifyUrl;
    }

    /**
     * Set 录制文件回调 URL。
     * @param RecordNotifyUrl 录制文件回调 URL。
     */
    public void setRecordNotifyUrl(String RecordNotifyUrl) {
        this.RecordNotifyUrl = RecordNotifyUrl;
    }

    /**
     * Get 截图回调 URL。 
     * @return SnapshotNotifyUrl 截图回调 URL。
     */
    public String getSnapshotNotifyUrl() {
        return this.SnapshotNotifyUrl;
    }

    /**
     * Set 截图回调 URL。
     * @param SnapshotNotifyUrl 截图回调 URL。
     */
    public void setSnapshotNotifyUrl(String SnapshotNotifyUrl) {
        this.SnapshotNotifyUrl = SnapshotNotifyUrl;
    }

    /**
     * Get 鉴黄回调 URL。 
     * @return PornCensorshipNotifyUrl 鉴黄回调 URL。
     */
    public String getPornCensorshipNotifyUrl() {
        return this.PornCensorshipNotifyUrl;
    }

    /**
     * Set 鉴黄回调 URL。
     * @param PornCensorshipNotifyUrl 鉴黄回调 URL。
     */
    public void setPornCensorshipNotifyUrl(String PornCensorshipNotifyUrl) {
        this.PornCensorshipNotifyUrl = PornCensorshipNotifyUrl;
    }

    /**
     * Get 回调的鉴权 key。 
     * @return CallbackKey 回调的鉴权 key。
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set 回调的鉴权 key。
     * @param CallbackKey 回调的鉴权 key。
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get 推流异常回调 URL。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PushExceptionNotifyUrl 推流异常回调 URL。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPushExceptionNotifyUrl() {
        return this.PushExceptionNotifyUrl;
    }

    /**
     * Set 推流异常回调 URL。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PushExceptionNotifyUrl 推流异常回调 URL。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPushExceptionNotifyUrl(String PushExceptionNotifyUrl) {
        this.PushExceptionNotifyUrl = PushExceptionNotifyUrl;
    }

    /**
     * Get 音频审核回调 URL。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioAuditNotifyUrl 音频审核回调 URL。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAudioAuditNotifyUrl() {
        return this.AudioAuditNotifyUrl;
    }

    /**
     * Set 音频审核回调 URL。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioAuditNotifyUrl 音频审核回调 URL。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioAuditNotifyUrl(String AudioAuditNotifyUrl) {
        this.AudioAuditNotifyUrl = AudioAuditNotifyUrl;
    }

    /**
     * Get 录制异常回调 URL。 
     * @return RecordExceptionNotifyUrl 录制异常回调 URL。
     */
    public String getRecordExceptionNotifyUrl() {
        return this.RecordExceptionNotifyUrl;
    }

    /**
     * Set 录制异常回调 URL。
     * @param RecordExceptionNotifyUrl 录制异常回调 URL。
     */
    public void setRecordExceptionNotifyUrl(String RecordExceptionNotifyUrl) {
        this.RecordExceptionNotifyUrl = RecordExceptionNotifyUrl;
    }

    /**
     * Get 录制异常回调级别，可选择：error: 错误。alarm: 告警。 
     * @return RecordExceptionLevels 录制异常回调级别，可选择：error: 错误。alarm: 告警。
     */
    public String [] getRecordExceptionLevels() {
        return this.RecordExceptionLevels;
    }

    /**
     * Set 录制异常回调级别，可选择：error: 错误。alarm: 告警。
     * @param RecordExceptionLevels 录制异常回调级别，可选择：error: 错误。alarm: 告警。
     */
    public void setRecordExceptionLevels(String [] RecordExceptionLevels) {
        this.RecordExceptionLevels = RecordExceptionLevels;
    }

    public CallBackTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallBackTemplateInfo(CallBackTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.StreamBeginNotifyUrl != null) {
            this.StreamBeginNotifyUrl = new String(source.StreamBeginNotifyUrl);
        }
        if (source.StreamMixNotifyUrl != null) {
            this.StreamMixNotifyUrl = new String(source.StreamMixNotifyUrl);
        }
        if (source.StreamEndNotifyUrl != null) {
            this.StreamEndNotifyUrl = new String(source.StreamEndNotifyUrl);
        }
        if (source.RecordNotifyUrl != null) {
            this.RecordNotifyUrl = new String(source.RecordNotifyUrl);
        }
        if (source.SnapshotNotifyUrl != null) {
            this.SnapshotNotifyUrl = new String(source.SnapshotNotifyUrl);
        }
        if (source.PornCensorshipNotifyUrl != null) {
            this.PornCensorshipNotifyUrl = new String(source.PornCensorshipNotifyUrl);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.PushExceptionNotifyUrl != null) {
            this.PushExceptionNotifyUrl = new String(source.PushExceptionNotifyUrl);
        }
        if (source.AudioAuditNotifyUrl != null) {
            this.AudioAuditNotifyUrl = new String(source.AudioAuditNotifyUrl);
        }
        if (source.RecordExceptionNotifyUrl != null) {
            this.RecordExceptionNotifyUrl = new String(source.RecordExceptionNotifyUrl);
        }
        if (source.RecordExceptionLevels != null) {
            this.RecordExceptionLevels = new String[source.RecordExceptionLevels.length];
            for (int i = 0; i < source.RecordExceptionLevels.length; i++) {
                this.RecordExceptionLevels[i] = new String(source.RecordExceptionLevels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StreamBeginNotifyUrl", this.StreamBeginNotifyUrl);
        this.setParamSimple(map, prefix + "StreamMixNotifyUrl", this.StreamMixNotifyUrl);
        this.setParamSimple(map, prefix + "StreamEndNotifyUrl", this.StreamEndNotifyUrl);
        this.setParamSimple(map, prefix + "RecordNotifyUrl", this.RecordNotifyUrl);
        this.setParamSimple(map, prefix + "SnapshotNotifyUrl", this.SnapshotNotifyUrl);
        this.setParamSimple(map, prefix + "PornCensorshipNotifyUrl", this.PornCensorshipNotifyUrl);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "PushExceptionNotifyUrl", this.PushExceptionNotifyUrl);
        this.setParamSimple(map, prefix + "AudioAuditNotifyUrl", this.AudioAuditNotifyUrl);
        this.setParamSimple(map, prefix + "RecordExceptionNotifyUrl", this.RecordExceptionNotifyUrl);
        this.setParamArraySimple(map, prefix + "RecordExceptionLevels.", this.RecordExceptionLevels);

    }
}

