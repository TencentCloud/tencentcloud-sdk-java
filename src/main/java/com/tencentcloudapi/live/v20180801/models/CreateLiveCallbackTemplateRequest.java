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

public class CreateLiveCallbackTemplateRequest extends AbstractModel{

    /**
    * 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 开播回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("StreamBeginNotifyUrl")
    @Expose
    private String StreamBeginNotifyUrl;

    /**
    * 断流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("StreamEndNotifyUrl")
    @Expose
    private String StreamEndNotifyUrl;

    /**
    * 录制回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("RecordNotifyUrl")
    @Expose
    private String RecordNotifyUrl;

    /**
    * 截图回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("SnapshotNotifyUrl")
    @Expose
    private String SnapshotNotifyUrl;

    /**
    * 鉴黄回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。
    */
    @SerializedName("PornCensorshipNotifyUrl")
    @Expose
    private String PornCensorshipNotifyUrl;

    /**
    * 回调 Key，回调 URL 公用，回调签名详见事件消息通知文档。
[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * 混流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("StreamMixNotifyUrl")
    @Expose
    private String StreamMixNotifyUrl;

    /**
     * Get 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。 
     * @return TemplateName 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
     * @param TemplateName 模板名称。
长度上限：255字节。
仅支持中文、英文、数字、_、-。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。 
     * @return Description 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
     * @param Description 描述信息。
长度上限：1024字节。
仅支持中文、英文、数字、_、-。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 开播回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。 
     * @return StreamBeginNotifyUrl 开播回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public String getStreamBeginNotifyUrl() {
        return this.StreamBeginNotifyUrl;
    }

    /**
     * Set 开播回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @param StreamBeginNotifyUrl 开播回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public void setStreamBeginNotifyUrl(String StreamBeginNotifyUrl) {
        this.StreamBeginNotifyUrl = StreamBeginNotifyUrl;
    }

    /**
     * Get 断流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。 
     * @return StreamEndNotifyUrl 断流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public String getStreamEndNotifyUrl() {
        return this.StreamEndNotifyUrl;
    }

    /**
     * Set 断流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @param StreamEndNotifyUrl 断流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public void setStreamEndNotifyUrl(String StreamEndNotifyUrl) {
        this.StreamEndNotifyUrl = StreamEndNotifyUrl;
    }

    /**
     * Get 录制回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。 
     * @return RecordNotifyUrl 录制回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public String getRecordNotifyUrl() {
        return this.RecordNotifyUrl;
    }

    /**
     * Set 录制回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @param RecordNotifyUrl 录制回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public void setRecordNotifyUrl(String RecordNotifyUrl) {
        this.RecordNotifyUrl = RecordNotifyUrl;
    }

    /**
     * Get 截图回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。 
     * @return SnapshotNotifyUrl 截图回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public String getSnapshotNotifyUrl() {
        return this.SnapshotNotifyUrl;
    }

    /**
     * Set 截图回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @param SnapshotNotifyUrl 截图回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public void setSnapshotNotifyUrl(String SnapshotNotifyUrl) {
        this.SnapshotNotifyUrl = SnapshotNotifyUrl;
    }

    /**
     * Get 鉴黄回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。 
     * @return PornCensorshipNotifyUrl 鉴黄回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。
     */
    public String getPornCensorshipNotifyUrl() {
        return this.PornCensorshipNotifyUrl;
    }

    /**
     * Set 鉴黄回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。
     * @param PornCensorshipNotifyUrl 鉴黄回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。
     */
    public void setPornCensorshipNotifyUrl(String PornCensorshipNotifyUrl) {
        this.PornCensorshipNotifyUrl = PornCensorshipNotifyUrl;
    }

    /**
     * Get 回调 Key，回调 URL 公用，回调签名详见事件消息通知文档。
[事件消息通知](/document/product/267/32744)。 
     * @return CallbackKey 回调 Key，回调 URL 公用，回调签名详见事件消息通知文档。
[事件消息通知](/document/product/267/32744)。
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set 回调 Key，回调 URL 公用，回调签名详见事件消息通知文档。
[事件消息通知](/document/product/267/32744)。
     * @param CallbackKey 回调 Key，回调 URL 公用，回调签名详见事件消息通知文档。
[事件消息通知](/document/product/267/32744)。
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * Get 混流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。 
     * @return StreamMixNotifyUrl 混流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public String getStreamMixNotifyUrl() {
        return this.StreamMixNotifyUrl;
    }

    /**
     * Set 混流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @param StreamMixNotifyUrl 混流回调 URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public void setStreamMixNotifyUrl(String StreamMixNotifyUrl) {
        this.StreamMixNotifyUrl = StreamMixNotifyUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StreamBeginNotifyUrl", this.StreamBeginNotifyUrl);
        this.setParamSimple(map, prefix + "StreamEndNotifyUrl", this.StreamEndNotifyUrl);
        this.setParamSimple(map, prefix + "RecordNotifyUrl", this.RecordNotifyUrl);
        this.setParamSimple(map, prefix + "SnapshotNotifyUrl", this.SnapshotNotifyUrl);
        this.setParamSimple(map, prefix + "PornCensorshipNotifyUrl", this.PornCensorshipNotifyUrl);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "StreamMixNotifyUrl", this.StreamMixNotifyUrl);

    }
}

