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

public class CreateLiveCallbackTemplateRequest  extends AbstractModel{

    /**
    * 模板名称，非空的字符串。
长度上限：255字节。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 描述信息。
长度上限：1024字节。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 开播回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("StreamBeginNotifyUrl")
    @Expose
    private String StreamBeginNotifyUrl;

    /**
    * 断流回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("StreamEndNotifyUrl")
    @Expose
    private String StreamEndNotifyUrl;

    /**
    * 录制回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("RecordNotifyUrl")
    @Expose
    private String RecordNotifyUrl;

    /**
    * 截图回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
    */
    @SerializedName("SnapshotNotifyUrl")
    @Expose
    private String SnapshotNotifyUrl;

    /**
    * 鉴黄回调URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。
    */
    @SerializedName("PornCensorshipNotifyUrl")
    @Expose
    private String PornCensorshipNotifyUrl;

    /**
    * 回调key，回调URL公用，鉴权回调说明详见回调格式文档
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
     * 获取模板名称，非空的字符串。
长度上限：255字节。
     * @return TemplateName 模板名称，非空的字符串。
长度上限：255字节。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * 设置模板名称，非空的字符串。
长度上限：255字节。
     * @param TemplateName 模板名称，非空的字符串。
长度上限：255字节。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * 获取描述信息。
长度上限：1024字节。
     * @return Description 描述信息。
长度上限：1024字节。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置描述信息。
长度上限：1024字节。
     * @param Description 描述信息。
长度上限：1024字节。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取开播回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @return StreamBeginNotifyUrl 开播回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public String getStreamBeginNotifyUrl() {
        return this.StreamBeginNotifyUrl;
    }

    /**
     * 设置开播回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @param StreamBeginNotifyUrl 开播回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public void setStreamBeginNotifyUrl(String StreamBeginNotifyUrl) {
        this.StreamBeginNotifyUrl = StreamBeginNotifyUrl;
    }

    /**
     * 获取断流回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @return StreamEndNotifyUrl 断流回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public String getStreamEndNotifyUrl() {
        return this.StreamEndNotifyUrl;
    }

    /**
     * 设置断流回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @param StreamEndNotifyUrl 断流回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public void setStreamEndNotifyUrl(String StreamEndNotifyUrl) {
        this.StreamEndNotifyUrl = StreamEndNotifyUrl;
    }

    /**
     * 获取录制回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @return RecordNotifyUrl 录制回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public String getRecordNotifyUrl() {
        return this.RecordNotifyUrl;
    }

    /**
     * 设置录制回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @param RecordNotifyUrl 录制回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public void setRecordNotifyUrl(String RecordNotifyUrl) {
        this.RecordNotifyUrl = RecordNotifyUrl;
    }

    /**
     * 获取截图回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @return SnapshotNotifyUrl 截图回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public String getSnapshotNotifyUrl() {
        return this.SnapshotNotifyUrl;
    }

    /**
     * 设置截图回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     * @param SnapshotNotifyUrl 截图回调URL，
相关协议文档：[事件消息通知](/document/product/267/32744)。
     */
    public void setSnapshotNotifyUrl(String SnapshotNotifyUrl) {
        this.SnapshotNotifyUrl = SnapshotNotifyUrl;
    }

    /**
     * 获取鉴黄回调URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。
     * @return PornCensorshipNotifyUrl 鉴黄回调URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。
     */
    public String getPornCensorshipNotifyUrl() {
        return this.PornCensorshipNotifyUrl;
    }

    /**
     * 设置鉴黄回调URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。
     * @param PornCensorshipNotifyUrl 鉴黄回调URL，
相关协议文档：[事件消息通知](/document/product/267/32741)。
     */
    public void setPornCensorshipNotifyUrl(String PornCensorshipNotifyUrl) {
        this.PornCensorshipNotifyUrl = PornCensorshipNotifyUrl;
    }

    /**
     * 获取回调key，回调URL公用，鉴权回调说明详见回调格式文档
     * @return CallbackKey 回调key，回调URL公用，鉴权回调说明详见回调格式文档
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * 设置回调key，回调URL公用，鉴权回调说明详见回调格式文档
     * @param CallbackKey 回调key，回调URL公用，鉴权回调说明详见回调格式文档
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

