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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageModerationRequest extends AbstractModel{

    /**
    * 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略。 -- 该字段暂未开放。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 数据ID，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 数据Base64编码，图片检测接口为图片文件内容，大小不能超过5M
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 图片资源访问链接，__与FileContent参数必须二选一输入__
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 截帧频率，GIF图/长图检测专用，默认值为0，表示只会检测GIF图/长图的第一帧
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * GIF图/长图检测专用，代表均匀最大截帧数量，默认值为1（即只取GIF第一张，或长图不做切分处理（可能会造成处理超时））。
    */
    @SerializedName("MaxFrames")
    @Expose
    private Long MaxFrames;

    /**
    * 账号相关信息字段，填入后可识别违规风险账号。
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
    * 设备相关信息字段，填入后可识别违规风险设备。
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
     * Get 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略。 -- 该字段暂未开放。 
     * @return BizType 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略。 -- 该字段暂未开放。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略。 -- 该字段暂未开放。
     * @param BizType 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略。 -- 该字段暂未开放。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 数据ID，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符 
     * @return DataId 数据ID，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 数据ID，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
     * @param DataId 数据ID，可以由英文字母、数字、下划线、-、@#组成，不超过64个字符
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 数据Base64编码，图片检测接口为图片文件内容，大小不能超过5M 
     * @return FileContent 数据Base64编码，图片检测接口为图片文件内容，大小不能超过5M
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 数据Base64编码，图片检测接口为图片文件内容，大小不能超过5M
     * @param FileContent 数据Base64编码，图片检测接口为图片文件内容，大小不能超过5M
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 图片资源访问链接，__与FileContent参数必须二选一输入__ 
     * @return FileUrl 图片资源访问链接，__与FileContent参数必须二选一输入__
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 图片资源访问链接，__与FileContent参数必须二选一输入__
     * @param FileUrl 图片资源访问链接，__与FileContent参数必须二选一输入__
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 截帧频率，GIF图/长图检测专用，默认值为0，表示只会检测GIF图/长图的第一帧 
     * @return Interval 截帧频率，GIF图/长图检测专用，默认值为0，表示只会检测GIF图/长图的第一帧
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 截帧频率，GIF图/长图检测专用，默认值为0，表示只会检测GIF图/长图的第一帧
     * @param Interval 截帧频率，GIF图/长图检测专用，默认值为0，表示只会检测GIF图/长图的第一帧
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get GIF图/长图检测专用，代表均匀最大截帧数量，默认值为1（即只取GIF第一张，或长图不做切分处理（可能会造成处理超时））。 
     * @return MaxFrames GIF图/长图检测专用，代表均匀最大截帧数量，默认值为1（即只取GIF第一张，或长图不做切分处理（可能会造成处理超时））。
     */
    public Long getMaxFrames() {
        return this.MaxFrames;
    }

    /**
     * Set GIF图/长图检测专用，代表均匀最大截帧数量，默认值为1（即只取GIF第一张，或长图不做切分处理（可能会造成处理超时））。
     * @param MaxFrames GIF图/长图检测专用，代表均匀最大截帧数量，默认值为1（即只取GIF第一张，或长图不做切分处理（可能会造成处理超时））。
     */
    public void setMaxFrames(Long MaxFrames) {
        this.MaxFrames = MaxFrames;
    }

    /**
     * Get 账号相关信息字段，填入后可识别违规风险账号。 
     * @return User 账号相关信息字段，填入后可识别违规风险账号。
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set 账号相关信息字段，填入后可识别违规风险账号。
     * @param User 账号相关信息字段，填入后可识别违规风险账号。
     */
    public void setUser(User User) {
        this.User = User;
    }

    /**
     * Get 设备相关信息字段，填入后可识别违规风险设备。 
     * @return Device 设备相关信息字段，填入后可识别违规风险设备。
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set 设备相关信息字段，填入后可识别违规风险设备。
     * @param Device 设备相关信息字段，填入后可识别违规风险设备。
     */
    public void setDevice(Device Device) {
        this.Device = Device;
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

    }
}

