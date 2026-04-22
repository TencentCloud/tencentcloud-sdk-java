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
    * <p>该字段表示策略的具体编号，用于接口调度，在内容安全控制台中可配置。若不传入Biztype参数（留空），则代表采用默认的识别策略；传入则会在审核时根据业务场景采取不同的审核策略。<br>备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p>
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * <p>该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>该字段表示待检测图片文件内容的Base64编码，图片<strong>大小不超过10MB</strong>，建议<strong>分辨率不低于256x256</strong>，否则可能会影响识别效果。<br>备注： <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * <p>该字段表示待检测图片文件的访问链接，图片支持PNG、JPG、JPEG、BMP、GIF、WEBP格式，<strong>大小不超过100MB</strong>，建议<strong>分辨率不低于256x256</strong>；图片下载时间限制为3秒，超过则会返回下载超时；由于网络安全策略，<strong>送审带重定向的链接，可能引起下载失败</strong>，请尽量避免，比如Http返回302状态码的链接，可能导致接口返回ResourceUnavailable.ImageDownloadError。<br>备注：<strong>该字段与FileContent必须选择输入其中一个</strong>。</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p><strong>GIF/长图检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测），长图则按照长边：短边取整计算要切割的总图数；默认值为0，此时只会检测GIF的第一帧或对长图不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p><strong>GIF/长图检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧或对长图不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p>
    */
    @SerializedName("MaxFrames")
    @Expose
    private Long MaxFrames;

    /**
    * <p>该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。</p>
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
    * <p>该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。</p>
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
    * <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 一般图片异步检测</li><li>IMAGE_LLM： 大模型图片异步检测</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>该字段表示待审核的图片资源链接，最多支持传入4张图片</p>
    */
    @SerializedName("FileUrlList")
    @Expose
    private String [] FileUrlList;

    /**
    * <p>待审核的文本内容，需为UTF-8编码并以Base64格式传入，字数限制5000字内。</p>
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
     * Get <p>该字段表示策略的具体编号，用于接口调度，在内容安全控制台中可配置。若不传入Biztype参数（留空），则代表采用默认的识别策略；传入则会在审核时根据业务场景采取不同的审核策略。<br>备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p> 
     * @return BizType <p>该字段表示策略的具体编号，用于接口调度，在内容安全控制台中可配置。若不传入Biztype参数（留空），则代表采用默认的识别策略；传入则会在审核时根据业务场景采取不同的审核策略。<br>备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p>
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>该字段表示策略的具体编号，用于接口调度，在内容安全控制台中可配置。若不传入Biztype参数（留空），则代表采用默认的识别策略；传入则会在审核时根据业务场景采取不同的审核策略。<br>备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p>
     * @param BizType <p>该字段表示策略的具体编号，用于接口调度，在内容安全控制台中可配置。若不传入Biztype参数（留空），则代表采用默认的识别策略；传入则会在审核时根据业务场景采取不同的审核策略。<br>备注：Biztype仅为数字、字母与下划线的组合，长度为3-32个字符；不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p>
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p> 
     * @return DataId <p>该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
     * @param DataId <p>该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，<strong>长度不超过64个字符</strong>。</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>该字段表示待检测图片文件内容的Base64编码，图片<strong>大小不超过10MB</strong>，建议<strong>分辨率不低于256x256</strong>，否则可能会影响识别效果。<br>备注： <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p> 
     * @return FileContent <p>该字段表示待检测图片文件内容的Base64编码，图片<strong>大小不超过10MB</strong>，建议<strong>分辨率不低于256x256</strong>，否则可能会影响识别效果。<br>备注： <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set <p>该字段表示待检测图片文件内容的Base64编码，图片<strong>大小不超过10MB</strong>，建议<strong>分辨率不低于256x256</strong>，否则可能会影响识别效果。<br>备注： <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
     * @param FileContent <p>该字段表示待检测图片文件内容的Base64编码，图片<strong>大小不超过10MB</strong>，建议<strong>分辨率不低于256x256</strong>，否则可能会影响识别效果。<br>备注： <strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get <p>该字段表示待检测图片文件的访问链接，图片支持PNG、JPG、JPEG、BMP、GIF、WEBP格式，<strong>大小不超过100MB</strong>，建议<strong>分辨率不低于256x256</strong>；图片下载时间限制为3秒，超过则会返回下载超时；由于网络安全策略，<strong>送审带重定向的链接，可能引起下载失败</strong>，请尽量避免，比如Http返回302状态码的链接，可能导致接口返回ResourceUnavailable.ImageDownloadError。<br>备注：<strong>该字段与FileContent必须选择输入其中一个</strong>。</p> 
     * @return FileUrl <p>该字段表示待检测图片文件的访问链接，图片支持PNG、JPG、JPEG、BMP、GIF、WEBP格式，<strong>大小不超过100MB</strong>，建议<strong>分辨率不低于256x256</strong>；图片下载时间限制为3秒，超过则会返回下载超时；由于网络安全策略，<strong>送审带重定向的链接，可能引起下载失败</strong>，请尽量避免，比如Http返回302状态码的链接，可能导致接口返回ResourceUnavailable.ImageDownloadError。<br>备注：<strong>该字段与FileContent必须选择输入其中一个</strong>。</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>该字段表示待检测图片文件的访问链接，图片支持PNG、JPG、JPEG、BMP、GIF、WEBP格式，<strong>大小不超过100MB</strong>，建议<strong>分辨率不低于256x256</strong>；图片下载时间限制为3秒，超过则会返回下载超时；由于网络安全策略，<strong>送审带重定向的链接，可能引起下载失败</strong>，请尽量避免，比如Http返回302状态码的链接，可能导致接口返回ResourceUnavailable.ImageDownloadError。<br>备注：<strong>该字段与FileContent必须选择输入其中一个</strong>。</p>
     * @param FileUrl <p>该字段表示待检测图片文件的访问链接，图片支持PNG、JPG、JPEG、BMP、GIF、WEBP格式，<strong>大小不超过100MB</strong>，建议<strong>分辨率不低于256x256</strong>；图片下载时间限制为3秒，超过则会返回下载超时；由于网络安全策略，<strong>送审带重定向的链接，可能引起下载失败</strong>，请尽量避免，比如Http返回302状态码的链接，可能导致接口返回ResourceUnavailable.ImageDownloadError。<br>备注：<strong>该字段与FileContent必须选择输入其中一个</strong>。</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p><strong>GIF/长图检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测），长图则按照长边：短边取整计算要切割的总图数；默认值为0，此时只会检测GIF的第一帧或对长图不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p> 
     * @return Interval <p><strong>GIF/长图检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测），长图则按照长边：短边取整计算要切割的总图数；默认值为0，此时只会检测GIF的第一帧或对长图不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p><strong>GIF/长图检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测），长图则按照长边：短边取整计算要切割的总图数；默认值为0，此时只会检测GIF的第一帧或对长图不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p>
     * @param Interval <p><strong>GIF/长图检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测），长图则按照长边：短边取整计算要切割的总图数；默认值为0，此时只会检测GIF的第一帧或对长图不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p><strong>GIF/长图检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧或对长图不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p> 
     * @return MaxFrames <p><strong>GIF/长图检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧或对长图不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p>
     */
    public Long getMaxFrames() {
        return this.MaxFrames;
    }

    /**
     * Set <p><strong>GIF/长图检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧或对长图不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p>
     * @param MaxFrames <p><strong>GIF/长图检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧或对长图不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF/长图时，将每间隔2帧检测一次且最多检测400帧。</p>
     */
    public void setMaxFrames(Long MaxFrames) {
        this.MaxFrames = MaxFrames;
    }

    /**
     * Get <p>该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。</p> 
     * @return User <p>该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。</p>
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set <p>该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。</p>
     * @param User <p>该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。</p>
     */
    public void setUser(User User) {
        this.User = User;
    }

    /**
     * Get <p>该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。</p> 
     * @return Device <p>该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。</p>
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set <p>该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。</p>
     * @param Device <p>该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。</p>
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    /**
     * Get <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 一般图片异步检测</li><li>IMAGE_LLM： 大模型图片异步检测</li></ul> 
     * @return Type <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 一般图片异步检测</li><li>IMAGE_LLM： 大模型图片异步检测</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 一般图片异步检测</li><li>IMAGE_LLM： 大模型图片异步检测</li></ul>
     * @param Type <p>服务类型，可为空，默认为 IMAGE。</p><p>枚举值：</p><ul><li>IMAGE： 一般图片异步检测</li><li>IMAGE_LLM： 大模型图片异步检测</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>该字段表示待审核的图片资源链接，最多支持传入4张图片</p> 
     * @return FileUrlList <p>该字段表示待审核的图片资源链接，最多支持传入4张图片</p>
     */
    public String [] getFileUrlList() {
        return this.FileUrlList;
    }

    /**
     * Set <p>该字段表示待审核的图片资源链接，最多支持传入4张图片</p>
     * @param FileUrlList <p>该字段表示待审核的图片资源链接，最多支持传入4张图片</p>
     */
    public void setFileUrlList(String [] FileUrlList) {
        this.FileUrlList = FileUrlList;
    }

    /**
     * Get <p>待审核的文本内容，需为UTF-8编码并以Base64格式传入，字数限制5000字内。</p> 
     * @return TextContent <p>待审核的文本内容，需为UTF-8编码并以Base64格式传入，字数限制5000字内。</p>
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set <p>待审核的文本内容，需为UTF-8编码并以Base64格式传入，字数限制5000字内。</p>
     * @param TextContent <p>待审核的文本内容，需为UTF-8编码并以Base64格式传入，字数限制5000字内。</p>
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

