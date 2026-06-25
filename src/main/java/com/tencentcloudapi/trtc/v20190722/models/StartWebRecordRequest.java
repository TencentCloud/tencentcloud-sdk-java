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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartWebRecordRequest extends AbstractModel {

    /**
    * <p>【必填】需要录制的网页URL</p>
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * <p>【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4</p>
    */
    @SerializedName("StorageParams")
    @Expose
    private StorageParams StorageParams;

    /**
    * <p>【必填】TRTC的SdkAppId</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>录制最大时长限制， 单位 s, 合法取值范围[1800, 86400], 默认 86400s(24 小时)</p>
    */
    @SerializedName("MaxDurationLimit")
    @Expose
    private Long MaxDurationLimit;

    /**
    * <p>页面录制视频参数</p>
    */
    @SerializedName("WebRecordVideoParams")
    @Expose
    private WebRecordVideoParams WebRecordVideoParams;

    /**
    * <p>当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复<br>传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1</p>
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private McuPublishCdnParam [] PublishCdnParams;

    /**
    * <p>录制页面资源加载的超时时间，单位：秒。默认值为 0 秒，该值需大于等于 0秒，且小于等于 60秒。录制页面未启用页面加载超时检测时，请勿设置此参数。</p>
    */
    @SerializedName("ReadyTimeout")
    @Expose
    private Long ReadyTimeout;

    /**
    * <p>渲染移动模式参数；不准备渲染移动模式页面时，请勿设置此参数。</p>
    */
    @SerializedName("EmulateMobileParams")
    @Expose
    private EmulateMobileParams EmulateMobileParams;

    /**
     * Get <p>【必填】需要录制的网页URL</p> 
     * @return RecordUrl <p>【必填】需要录制的网页URL</p>
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set <p>【必填】需要录制的网页URL</p>
     * @param RecordUrl <p>【必填】需要录制的网页URL</p>
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get <p>【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4</p> 
     * @return StorageParams <p>【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4</p>
     */
    public StorageParams getStorageParams() {
        return this.StorageParams;
    }

    /**
     * Set <p>【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4</p>
     * @param StorageParams <p>【必填】云存储相关的参数，目前支持腾讯云对象存储以及腾讯云云点播VOD，不支持第三方云存储；输出文件的存储格式仅支持hls或mp4</p>
     */
    public void setStorageParams(StorageParams StorageParams) {
        this.StorageParams = StorageParams;
    }

    /**
     * Get <p>【必填】TRTC的SdkAppId</p> 
     * @return SdkAppId <p>【必填】TRTC的SdkAppId</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>【必填】TRTC的SdkAppId</p>
     * @param SdkAppId <p>【必填】TRTC的SdkAppId</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>录制最大时长限制， 单位 s, 合法取值范围[1800, 86400], 默认 86400s(24 小时)</p> 
     * @return MaxDurationLimit <p>录制最大时长限制， 单位 s, 合法取值范围[1800, 86400], 默认 86400s(24 小时)</p>
     */
    public Long getMaxDurationLimit() {
        return this.MaxDurationLimit;
    }

    /**
     * Set <p>录制最大时长限制， 单位 s, 合法取值范围[1800, 86400], 默认 86400s(24 小时)</p>
     * @param MaxDurationLimit <p>录制最大时长限制， 单位 s, 合法取值范围[1800, 86400], 默认 86400s(24 小时)</p>
     */
    public void setMaxDurationLimit(Long MaxDurationLimit) {
        this.MaxDurationLimit = MaxDurationLimit;
    }

    /**
     * Get <p>页面录制视频参数</p> 
     * @return WebRecordVideoParams <p>页面录制视频参数</p>
     */
    public WebRecordVideoParams getWebRecordVideoParams() {
        return this.WebRecordVideoParams;
    }

    /**
     * Set <p>页面录制视频参数</p>
     * @param WebRecordVideoParams <p>页面录制视频参数</p>
     */
    public void setWebRecordVideoParams(WebRecordVideoParams WebRecordVideoParams) {
        this.WebRecordVideoParams = WebRecordVideoParams;
    }

    /**
     * Get <p>当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复<br>传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。</p> 
     * @return RecordId <p>当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复<br>传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复<br>传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。</p>
     * @param RecordId <p>当对重复任务敏感时，请关注此值： 为了避免任务在短时间内重复发起，导致任务重复<br>传入录制RecordId来标识此次任务， 小于32字节，若携带RecordId发起两次以上的开始录制请求，任务只会启动一个，第二个报错FailedOperation.TaskExist。注意StartWebRecord调用失败时而非FailedOperation.TaskExist错误，请更换RecordId重新发起。</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1</p> 
     * @return PublishCdnParams <p>若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1</p>
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set <p>若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1</p>
     * @param PublishCdnParams <p>若您想要推流到CDN，可以使用PublishCdnParams.N参数设置，支持最多同时推流到10个CDN地址。若转推地址是腾讯云CDN时，请将IsTencentCdn明确设置为1</p>
     */
    public void setPublishCdnParams(McuPublishCdnParam [] PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    /**
     * Get <p>录制页面资源加载的超时时间，单位：秒。默认值为 0 秒，该值需大于等于 0秒，且小于等于 60秒。录制页面未启用页面加载超时检测时，请勿设置此参数。</p> 
     * @return ReadyTimeout <p>录制页面资源加载的超时时间，单位：秒。默认值为 0 秒，该值需大于等于 0秒，且小于等于 60秒。录制页面未启用页面加载超时检测时，请勿设置此参数。</p>
     */
    public Long getReadyTimeout() {
        return this.ReadyTimeout;
    }

    /**
     * Set <p>录制页面资源加载的超时时间，单位：秒。默认值为 0 秒，该值需大于等于 0秒，且小于等于 60秒。录制页面未启用页面加载超时检测时，请勿设置此参数。</p>
     * @param ReadyTimeout <p>录制页面资源加载的超时时间，单位：秒。默认值为 0 秒，该值需大于等于 0秒，且小于等于 60秒。录制页面未启用页面加载超时检测时，请勿设置此参数。</p>
     */
    public void setReadyTimeout(Long ReadyTimeout) {
        this.ReadyTimeout = ReadyTimeout;
    }

    /**
     * Get <p>渲染移动模式参数；不准备渲染移动模式页面时，请勿设置此参数。</p> 
     * @return EmulateMobileParams <p>渲染移动模式参数；不准备渲染移动模式页面时，请勿设置此参数。</p>
     */
    public EmulateMobileParams getEmulateMobileParams() {
        return this.EmulateMobileParams;
    }

    /**
     * Set <p>渲染移动模式参数；不准备渲染移动模式页面时，请勿设置此参数。</p>
     * @param EmulateMobileParams <p>渲染移动模式参数；不准备渲染移动模式页面时，请勿设置此参数。</p>
     */
    public void setEmulateMobileParams(EmulateMobileParams EmulateMobileParams) {
        this.EmulateMobileParams = EmulateMobileParams;
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
        if (source.StorageParams != null) {
            this.StorageParams = new StorageParams(source.StorageParams);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.MaxDurationLimit != null) {
            this.MaxDurationLimit = new Long(source.MaxDurationLimit);
        }
        if (source.WebRecordVideoParams != null) {
            this.WebRecordVideoParams = new WebRecordVideoParams(source.WebRecordVideoParams);
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
        if (source.ReadyTimeout != null) {
            this.ReadyTimeout = new Long(source.ReadyTimeout);
        }
        if (source.EmulateMobileParams != null) {
            this.EmulateMobileParams = new EmulateMobileParams(source.EmulateMobileParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamObj(map, prefix + "StorageParams.", this.StorageParams);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "MaxDurationLimit", this.MaxDurationLimit);
        this.setParamObj(map, prefix + "WebRecordVideoParams.", this.WebRecordVideoParams);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamArrayObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);
        this.setParamSimple(map, prefix + "ReadyTimeout", this.ReadyTimeout);
        this.setParamObj(map, prefix + "EmulateMobileParams.", this.EmulateMobileParams);

    }
}

