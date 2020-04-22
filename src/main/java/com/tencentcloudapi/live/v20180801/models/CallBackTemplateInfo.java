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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallBackTemplateInfo extends AbstractModel{

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
    * 断流回调 URL。
    */
    @SerializedName("StreamEndNotifyUrl")
    @Expose
    private String StreamEndNotifyUrl;

    /**
    * 混流回调 URL。
    */
    @SerializedName("StreamMixNotifyUrl")
    @Expose
    private String StreamMixNotifyUrl;

    /**
    * 录制回调 URL。
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
     * Get 混流回调 URL。 
     * @return StreamMixNotifyUrl 混流回调 URL。
     */
    public String getStreamMixNotifyUrl() {
        return this.StreamMixNotifyUrl;
    }

    /**
     * Set 混流回调 URL。
     * @param StreamMixNotifyUrl 混流回调 URL。
     */
    public void setStreamMixNotifyUrl(String StreamMixNotifyUrl) {
        this.StreamMixNotifyUrl = StreamMixNotifyUrl;
    }

    /**
     * Get 录制回调 URL。 
     * @return RecordNotifyUrl 录制回调 URL。
     */
    public String getRecordNotifyUrl() {
        return this.RecordNotifyUrl;
    }

    /**
     * Set 录制回调 URL。
     * @param RecordNotifyUrl 录制回调 URL。
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StreamBeginNotifyUrl", this.StreamBeginNotifyUrl);
        this.setParamSimple(map, prefix + "StreamEndNotifyUrl", this.StreamEndNotifyUrl);
        this.setParamSimple(map, prefix + "StreamMixNotifyUrl", this.StreamMixNotifyUrl);
        this.setParamSimple(map, prefix + "RecordNotifyUrl", this.RecordNotifyUrl);
        this.setParamSimple(map, prefix + "SnapshotNotifyUrl", this.SnapshotNotifyUrl);
        this.setParamSimple(map, prefix + "PornCensorshipNotifyUrl", this.PornCensorshipNotifyUrl);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);

    }
}

