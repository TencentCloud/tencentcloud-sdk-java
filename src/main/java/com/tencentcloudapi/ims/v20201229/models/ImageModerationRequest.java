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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageModerationRequest extends AbstractModel {

    /**
    * 该字段表示使用的策略的具体编号，该字段需要先在[内容安全控制台](#https://console.cloud.tencent.com/cms/clouds/manage)中配置。
备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，**长度不超过64个字符**。
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的**Base64编码内容大小不得超过10MB**。<br/>备注：**该字段与FileUrl必须选择输入其中一个**。
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 该字段表示待检测图片文件的访问链接，URL源图**大小不超过30MB**。<br />备注：该字段与FileContent必须选择输入其中一个。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * **GIF检测专用**，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * **GIF检测专用**，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。
    */
    @SerializedName("MaxFrames")
    @Expose
    private Long MaxFrames;

    /**
    * 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
    * 该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
    * 该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 该字段表示使用的策略的具体编号，该字段需要先在[内容安全控制台](#https://console.cloud.tencent.com/cms/clouds/manage)中配置。
备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。 
     * @return BizType 该字段表示使用的策略的具体编号，该字段需要先在[内容安全控制台](#https://console.cloud.tencent.com/cms/clouds/manage)中配置。
备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 该字段表示使用的策略的具体编号，该字段需要先在[内容安全控制台](#https://console.cloud.tencent.com/cms/clouds/manage)中配置。
备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。
     * @param BizType 该字段表示使用的策略的具体编号，该字段需要先在[内容安全控制台](#https://console.cloud.tencent.com/cms/clouds/manage)中配置。
备注：不同Biztype关联不同的业务场景与识别能力策略，调用前请确认正确的Biztype。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，**长度不超过64个字符**。 
     * @return DataId 该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，**长度不超过64个字符**。
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，**长度不超过64个字符**。
     * @param DataId 该字段表示您为待检测对象分配的数据ID，传入后可方便您对文件进行标识和管理。<br>取值：由英文字母（大小写均可）、数字及四个特殊符号（_，-，@，#）组成，**长度不超过64个字符**。
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的**Base64编码内容大小不得超过10MB**。<br/>备注：**该字段与FileUrl必须选择输入其中一个**。 
     * @return FileContent 该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的**Base64编码内容大小不得超过10MB**。<br/>备注：**该字段与FileUrl必须选择输入其中一个**。
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的**Base64编码内容大小不得超过10MB**。<br/>备注：**该字段与FileUrl必须选择输入其中一个**。
     * @param FileContent 该字段表示待检测图片文件内容的Base64编码，由于云API对请求包体有大小限制，图片的**Base64编码内容大小不得超过10MB**。<br/>备注：**该字段与FileUrl必须选择输入其中一个**。
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 该字段表示待检测图片文件的访问链接，URL源图**大小不超过30MB**。<br />备注：该字段与FileContent必须选择输入其中一个。 
     * @return FileUrl 该字段表示待检测图片文件的访问链接，URL源图**大小不超过30MB**。<br />备注：该字段与FileContent必须选择输入其中一个。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 该字段表示待检测图片文件的访问链接，URL源图**大小不超过30MB**。<br />备注：该字段与FileContent必须选择输入其中一个。
     * @param FileUrl 该字段表示待检测图片文件的访问链接，URL源图**大小不超过30MB**。<br />备注：该字段与FileContent必须选择输入其中一个。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get **GIF检测专用**，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。 
     * @return Interval **GIF检测专用**，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set **GIF检测专用**，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。
     * @param Interval **GIF检测专用**，用于表示GIF截帧频率（每隔多少张图片抽取一帧进行检测）；默认值为0，此时只会检测GIF的第一帧或不进行切分处理。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get **GIF检测专用**，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。 
     * @return MaxFrames **GIF检测专用**，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。
     */
    public Long getMaxFrames() {
        return this.MaxFrames;
    }

    /**
     * Set **GIF检测专用**，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。
     * @param MaxFrames **GIF检测专用**，用于标识最大截帧数量；默认值为1，此时只会检测输入GIF的第一帧不进行切分处理（可能会造成处理超时）。<br>备注：Interval与MaxFrames参数需要组合使用。例如，Interval=3, MaxFrames=400，则代表在检测GIF时，将每间隔2帧检测一次且最多检测400帧。
     */
    public void setMaxFrames(Long MaxFrames) {
        this.MaxFrames = MaxFrames;
    }

    /**
     * Get 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。 
     * @return User 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。
     * @param User 该字段表示待检测对象对应的用户相关信息，若填入则可甄别相应违规风险用户。
     */
    public void setUser(User User) {
        this.User = User;
    }

    /**
     * Get 该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。 
     * @return Device 该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set 该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。
     * @param Device 该字段表示待检测对象对应的设备相关信息，若填入则可甄别相应违规风险设备。
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    /**
     * Get 该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。 
     * @return Type 该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。
     * @param Type 该字段表示输入的图片审核类型，取值含：IMAGE（内容安全）、IMAGE_AIGC（AI生成识别）两种，默认值为IMAGE。
     */
    public void setType(String Type) {
        this.Type = Type;
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

    }
}

