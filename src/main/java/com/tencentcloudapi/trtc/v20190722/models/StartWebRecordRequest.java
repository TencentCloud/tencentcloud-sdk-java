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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartWebRecordRequest extends AbstractModel {

    /**
    * 需要录制的网页URL

    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * 录制最大时长限制， 单位 s, 合法取值范围[1800, 36000], 默认 36000s(10 小时)

    */
    @SerializedName("MaxDurationLimit")
    @Expose
    private Long MaxDurationLimit;

    /**
    * 【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4
    */
    @SerializedName("StorageParams")
    @Expose
    private StorageParams StorageParams;

    /**
    * 页面录制视频参数
    */
    @SerializedName("WebRecordVideoParams")
    @Expose
    private WebRecordVideoParams WebRecordVideoParams;

    /**
    * 【必填】TRTC的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复
传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private McuPublishCdnParam [] PublishCdnParams;

    /**
     * Get 需要录制的网页URL
 
     * @return RecordUrl 需要录制的网页URL

     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set 需要录制的网页URL

     * @param RecordUrl 需要录制的网页URL

     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get 录制最大时长限制， 单位 s, 合法取值范围[1800, 36000], 默认 36000s(10 小时)
 
     * @return MaxDurationLimit 录制最大时长限制， 单位 s, 合法取值范围[1800, 36000], 默认 36000s(10 小时)

     */
    public Long getMaxDurationLimit() {
        return this.MaxDurationLimit;
    }

    /**
     * Set 录制最大时长限制， 单位 s, 合法取值范围[1800, 36000], 默认 36000s(10 小时)

     * @param MaxDurationLimit 录制最大时长限制， 单位 s, 合法取值范围[1800, 36000], 默认 36000s(10 小时)

     */
    public void setMaxDurationLimit(Long MaxDurationLimit) {
        this.MaxDurationLimit = MaxDurationLimit;
    }

    /**
     * Get 【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4 
     * @return StorageParams 【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4
     */
    public StorageParams getStorageParams() {
        return this.StorageParams;
    }

    /**
     * Set 【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4
     * @param StorageParams 【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4
     */
    public void setStorageParams(StorageParams StorageParams) {
        this.StorageParams = StorageParams;
    }

    /**
     * Get 页面录制视频参数 
     * @return WebRecordVideoParams 页面录制视频参数
     */
    public WebRecordVideoParams getWebRecordVideoParams() {
        return this.WebRecordVideoParams;
    }

    /**
     * Set 页面录制视频参数
     * @param WebRecordVideoParams 页面录制视频参数
     */
    public void setWebRecordVideoParams(WebRecordVideoParams WebRecordVideoParams) {
        this.WebRecordVideoParams = WebRecordVideoParams;
    }

    /**
     * Get 【必填】TRTC的SdkAppId 
     * @return SdkAppId 【必填】TRTC的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 【必填】TRTC的SdkAppId
     * @param SdkAppId 【必填】TRTC的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复
传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。 
     * @return RecordId 当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复
传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复
传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。
     * @param RecordId 当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复
传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1 
     * @return PublishCdnParams 若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set 若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1
     * @param PublishCdnParams 若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1
     */
    public void setPublishCdnParams(McuPublishCdnParam [] PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    public StartWebRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartWebRecordRequest(StartWebRecordRequest source) {
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
        if (source.MaxDurationLimit != null) {
            this.MaxDurationLimit = new Long(source.MaxDurationLimit);
        }
        if (source.StorageParams != null) {
            this.StorageParams = new StorageParams(source.StorageParams);
        }
        if (source.WebRecordVideoParams != null) {
            this.WebRecordVideoParams = new WebRecordVideoParams(source.WebRecordVideoParams);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.PublishCdnParams != null) {
            this.PublishCdnParams = new McuPublishCdnParam[source.PublishCdnParams.length];
            for (int i = 0; i < source.PublishCdnParams.length; i++) {
                this.PublishCdnParams[i] = new McuPublishCdnParam(source.PublishCdnParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "MaxDurationLimit", this.MaxDurationLimit);
        this.setParamObj(map, prefix + "StorageParams.", this.StorageParams);
        this.setParamObj(map, prefix + "WebRecordVideoParams.", this.WebRecordVideoParams);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamArrayObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);

    }
}

