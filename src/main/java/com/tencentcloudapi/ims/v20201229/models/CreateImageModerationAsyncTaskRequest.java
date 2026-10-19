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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageModerationAsyncTaskRequest extends AbstractModel {

    /**
    * <p>接收审核信息回调地址，审核过程中产生的所有结果发送至此地址。</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>接口使用的识别策略编号，<strong>该策略编号在控制台上获取</strong>，获取方式请参考快速入门：</p><ul><li>标准内容安全：https://cloud.tencent.com/document/product/1124/135196</li><li>AI 生成识别：https://cloud.tencent.com/document/product/1124/135204</li></ul>
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * <p>该字段表示您为待检测图片分配的数据 ID，作用是方便您对数据进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>待检测图片的 Base64 编码， <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * <p>待检测图片的访问链接，<strong>该字段与FileContent必须选择输入其中一个</strong>。</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>用于 GIF 检测，表示截帧频率（每隔多少帧抽取一帧进行检测）。<br>建议与  MaxFrames 字段组合使用，例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 0，表示仅检测 GIF 第一帧</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>用于 GIF 检测，指定最大截帧数量，上限为 5 帧（暂不支持上调至更高值）。<br>建议与  Interval 字段配合使用：例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 1，即仅检测 GIF 首帧。</p>
    */
    @SerializedName("MaxFrames")
    @Expose
    private Long MaxFrames;

    /**
    * <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p>
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
    * <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p>
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
    * <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 标准内容安全</li><li>IMAGE_AIGC： AI 生成识别</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>审核 Agent 专用：待审核图片的访问链接 ，一次请求最多支持传入 4 张。</p>
    */
    @SerializedName("FileUrlList")
    @Expose
    private String [] FileUrlList;

    /**
    * <p>审核 Agent 专用：待审文本内容，需使用 UTF-8 编码并以 Base64 格式传入，字数上限 5000 字。</p>
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
     * Get <p>接收审核信息回调地址，审核过程中产生的所有结果发送至此地址。</p> 
     * @return CallbackUrl <p>接收审核信息回调地址，审核过程中产生的所有结果发送至此地址。</p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>接收审核信息回调地址，审核过程中产生的所有结果发送至此地址。</p>
     * @param CallbackUrl <p>接收审核信息回调地址，审核过程中产生的所有结果发送至此地址。</p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>接口使用的识别策略编号，<strong>该策略编号在控制台上获取</strong>，获取方式请参考快速入门：</p><ul><li>标准内容安全：https://cloud.tencent.com/document/product/1124/135196</li><li>AI 生成识别：https://cloud.tencent.com/document/product/1124/135204</li></ul> 
     * @return BizType <p>接口使用的识别策略编号，<strong>该策略编号在控制台上获取</strong>，获取方式请参考快速入门：</p><ul><li>标准内容安全：https://cloud.tencent.com/document/product/1124/135196</li><li>AI 生成识别：https://cloud.tencent.com/document/product/1124/135204</li></ul>
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>接口使用的识别策略编号，<strong>该策略编号在控制台上获取</strong>，获取方式请参考快速入门：</p><ul><li>标准内容安全：https://cloud.tencent.com/document/product/1124/135196</li><li>AI 生成识别：https://cloud.tencent.com/document/product/1124/135204</li></ul>
     * @param BizType <p>接口使用的识别策略编号，<strong>该策略编号在控制台上获取</strong>，获取方式请参考快速入门：</p><ul><li>标准内容安全：https://cloud.tencent.com/document/product/1124/135196</li><li>AI 生成识别：https://cloud.tencent.com/document/product/1124/135204</li></ul>
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>该字段表示您为待检测图片分配的数据 ID，作用是方便您对数据进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p> 
     * @return DataId <p>该字段表示您为待检测图片分配的数据 ID，作用是方便您对数据进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>该字段表示您为待检测图片分配的数据 ID，作用是方便您对数据进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
     * @param DataId <p>该字段表示您为待检测图片分配的数据 ID，作用是方便您对数据进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>待检测图片的 Base64 编码， <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p> 
     * @return FileContent <p>待检测图片的 Base64 编码， <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set <p>待检测图片的 Base64 编码， <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
     * @param FileContent <p>待检测图片的 Base64 编码， <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get <p>待检测图片的访问链接，<strong>该字段与FileContent必须选择输入其中一个</strong>。</p> 
     * @return FileUrl <p>待检测图片的访问链接，<strong>该字段与FileContent必须选择输入其中一个</strong>。</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>待检测图片的访问链接，<strong>该字段与FileContent必须选择输入其中一个</strong>。</p>
     * @param FileUrl <p>待检测图片的访问链接，<strong>该字段与FileContent必须选择输入其中一个</strong>。</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>用于 GIF 检测，表示截帧频率（每隔多少帧抽取一帧进行检测）。<br>建议与  MaxFrames 字段组合使用，例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 0，表示仅检测 GIF 第一帧</p> 
     * @return Interval <p>用于 GIF 检测，表示截帧频率（每隔多少帧抽取一帧进行检测）。<br>建议与  MaxFrames 字段组合使用，例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 0，表示仅检测 GIF 第一帧</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>用于 GIF 检测，表示截帧频率（每隔多少帧抽取一帧进行检测）。<br>建议与  MaxFrames 字段组合使用，例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 0，表示仅检测 GIF 第一帧</p>
     * @param Interval <p>用于 GIF 检测，表示截帧频率（每隔多少帧抽取一帧进行检测）。<br>建议与  MaxFrames 字段组合使用，例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 0，表示仅检测 GIF 第一帧</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>用于 GIF 检测，指定最大截帧数量，上限为 5 帧（暂不支持上调至更高值）。<br>建议与  Interval 字段配合使用：例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 1，即仅检测 GIF 首帧。</p> 
     * @return MaxFrames <p>用于 GIF 检测，指定最大截帧数量，上限为 5 帧（暂不支持上调至更高值）。<br>建议与  Interval 字段配合使用：例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 1，即仅检测 GIF 首帧。</p>
     */
    public Long getMaxFrames() {
        return this.MaxFrames;
    }

    /**
     * Set <p>用于 GIF 检测，指定最大截帧数量，上限为 5 帧（暂不支持上调至更高值）。<br>建议与  Interval 字段配合使用：例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 1，即仅检测 GIF 首帧。</p>
     * @param MaxFrames <p>用于 GIF 检测，指定最大截帧数量，上限为 5 帧（暂不支持上调至更高值）。<br>建议与  Interval 字段配合使用：例如  Interval=3、 MaxFrames=4，表示每 3 帧抽取 1 帧，最多检测 4 帧。默认值为 1，即仅检测 GIF 首帧。</p>
     */
    public void setMaxFrames(Long MaxFrames) {
        this.MaxFrames = MaxFrames;
    }

    /**
     * Get <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p> 
     * @return User <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p>
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p>
     * @param User <p>该字段标识用户信息，传入后可增强甄别有违规风险的发布者账号。</p>
     */
    public void setUser(User User) {
        this.User = User;
    }

    /**
     * Get <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p> 
     * @return Device <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p>
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p>
     * @param Device <p>该字段标识设备信息，传入后可增强甄别有违规风险的发布者设备。</p>
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    /**
     * Get <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 标准内容安全</li><li>IMAGE_AIGC： AI 生成识别</li></ul> 
     * @return Type <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 标准内容安全</li><li>IMAGE_AIGC： AI 生成识别</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 标准内容安全</li><li>IMAGE_AIGC： AI 生成识别</li></ul>
     * @param Type <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 标准内容安全</li><li>IMAGE_AIGC： AI 生成识别</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>审核 Agent 专用：待审核图片的访问链接 ，一次请求最多支持传入 4 张。</p> 
     * @return FileUrlList <p>审核 Agent 专用：待审核图片的访问链接 ，一次请求最多支持传入 4 张。</p>
     */
    public String [] getFileUrlList() {
        return this.FileUrlList;
    }

    /**
     * Set <p>审核 Agent 专用：待审核图片的访问链接 ，一次请求最多支持传入 4 张。</p>
     * @param FileUrlList <p>审核 Agent 专用：待审核图片的访问链接 ，一次请求最多支持传入 4 张。</p>
     */
    public void setFileUrlList(String [] FileUrlList) {
        this.FileUrlList = FileUrlList;
    }

    /**
     * Get <p>审核 Agent 专用：待审文本内容，需使用 UTF-8 编码并以 Base64 格式传入，字数上限 5000 字。</p> 
     * @return TextContent <p>审核 Agent 专用：待审文本内容，需使用 UTF-8 编码并以 Base64 格式传入，字数上限 5000 字。</p>
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set <p>审核 Agent 专用：待审文本内容，需使用 UTF-8 编码并以 Base64 格式传入，字数上限 5000 字。</p>
     * @param TextContent <p>审核 Agent 专用：待审文本内容，需使用 UTF-8 编码并以 Base64 格式传入，字数上限 5000 字。</p>
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    public CreateImageModerationAsyncTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageModerationAsyncTaskRequest(CreateImageModerationAsyncTaskRequest source) {
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MaxFrames != null) {
            this.MaxFrames = new Long(source.MaxFrames);
        }
        if (source.User != null) {
            this.User = new User(source.User);
        }
        if (source.Device != null) {
            this.Device = new Device(source.Device);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileUrlList != null) {
            this.FileUrlList = new String[source.FileUrlList.length];
            for (int i = 0; i < source.FileUrlList.length; i++) {
                this.FileUrlList[i] = new String(source.FileUrlList[i]);
            }
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MaxFrames", this.MaxFrames);
        this.setParamObj(map, prefix + "User.", this.User);
        this.setParamObj(map, prefix + "Device.", this.Device);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "FileUrlList.", this.FileUrlList);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);

    }
}

