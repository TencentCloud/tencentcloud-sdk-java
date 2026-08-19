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

public class ImageModerationRequest extends AbstractModel {

    /**
    * <p>该字段表示使用的策略的具体编号，该字段需要先在<a href="https://console.cloud.tencent.com/cms/clouds/manage">内容安全控制台</a>中配置。<br>备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p>
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
    * <p>该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的<strong>Base64编码内容大小不得超过10MB</strong>。<br>备注：<strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * <p>该字段表示待检测图片文件的访问链接，URL源图<strong>大小不超过30MB</strong>。<br>备注：该字段与FileContent必须选择输入其中一个。</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p><strong>GIF检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p><strong>GIF检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p>
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
    * <p>该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>该字段表示输入的策略标识用于调用业务来区分策略场景</p>
    */
    @SerializedName("BizTag")
    @Expose
    private String BizTag;

    /**
     * Get <p>该字段表示使用的策略的具体编号，该字段需要先在<a href="https://console.cloud.tencent.com/cms/clouds/manage">内容安全控制台</a>中配置。<br>备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p> 
     * @return BizType <p>该字段表示使用的策略的具体编号，该字段需要先在<a href="https://console.cloud.tencent.com/cms/clouds/manage">内容安全控制台</a>中配置。<br>备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p>
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>该字段表示使用的策略的具体编号，该字段需要先在<a href="https://console.cloud.tencent.com/cms/clouds/manage">内容安全控制台</a>中配置。<br>备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p>
     * @param BizType <p>该字段表示使用的策略的具体编号，该字段需要先在<a href="https://console.cloud.tencent.com/cms/clouds/manage">内容安全控制台</a>中配置。<br>备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。</p>
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
     * Get <p>该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的<strong>Base64编码内容大小不得超过10MB</strong>。<br>备注：<strong>该字段与FileUrl必须选择输入其中一个</strong>。</p> 
     * @return FileContent <p>该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的<strong>Base64编码内容大小不得超过10MB</strong>。<br>备注：<strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set <p>该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的<strong>Base64编码内容大小不得超过10MB</strong>。<br>备注：<strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
     * @param FileContent <p>该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的<strong>Base64编码内容大小不得超过10MB</strong>。<br>备注：<strong>该字段与FileUrl必须选择输入其中一个</strong>。</p>
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get <p>该字段表示待检测图片文件的访问链接，URL源图<strong>大小不超过30MB</strong>。<br>备注：该字段与FileContent必须选择输入其中一个。</p> 
     * @return FileUrl <p>该字段表示待检测图片文件的访问链接，URL源图<strong>大小不超过30MB</strong>。<br>备注：该字段与FileContent必须选择输入其中一个。</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>该字段表示待检测图片文件的访问链接，URL源图<strong>大小不超过30MB</strong>。<br>备注：该字段与FileContent必须选择输入其中一个。</p>
     * @param FileUrl <p>该字段表示待检测图片文件的访问链接，URL源图<strong>大小不超过30MB</strong>。<br>备注：该字段与FileContent必须选择输入其中一个。</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p><strong>GIF检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p> 
     * @return Interval <p><strong>GIF检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p><strong>GIF检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p>
     * @param Interval <p><strong>GIF检测专用</strong>，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p><strong>GIF检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p> 
     * @return MaxFrames <p><strong>GIF检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p>
     */
    public Long getMaxFrames() {
        return this.MaxFrames;
    }

    /**
     * Set <p><strong>GIF检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p>
     * @param MaxFrames <p><strong>GIF检测专用</strong>，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。</p>
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
     * Get <p>该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。</p> 
     * @return Type <p>该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。</p>
     * @param Type <p>该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>该字段表示输入的策略标识用于调用业务来区分策略场景</p> 
     * @return BizTag <p>该字段表示输入的策略标识用于调用业务来区分策略场景</p>
     */
    public String getBizTag() {
        return this.BizTag;
    }

    /**
     * Set <p>该字段表示输入的策略标识用于调用业务来区分策略场景</p>
     * @param BizTag <p>该字段表示输入的策略标识用于调用业务来区分策略场景</p>
     */
    public void setBizTag(String BizTag) {
        this.BizTag = BizTag;
    }

    public ImageModerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageModerationRequest(ImageModerationRequest source) {
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
        if (source.BizTag != null) {
            this.BizTag = new String(source.BizTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "MaxFrames", this.MaxFrames);
        this.setParamObj(map, prefix + "User.", this.User);
        this.setParamObj(map, prefix + "Device.", this.Device);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BizTag", this.BizTag);

    }
}

