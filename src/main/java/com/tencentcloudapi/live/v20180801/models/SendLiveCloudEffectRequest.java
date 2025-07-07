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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendLiveCloudEffectRequest extends AbstractModel {

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 您的推流域名。
    */
    @SerializedName("PushDomainName")
    @Expose
    private String PushDomainName;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 云端特效 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 默认随系统配置，云端特效循环 少于5次。可自定义指定礼物循环次数，不超过100次。
    */
    @SerializedName("LoopTimes")
    @Expose
    private Long LoopTimes;

    /**
    * 操作人备注信息。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 缩小比例，默认0 不缩放。
可选值：0-9， 值越大，越缩小。
    */
    @SerializedName("ZoomFactor")
    @Expose
    private Long ZoomFactor;

    /**
    * 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的横向比例，可选值 0 - 100。
    */
    @SerializedName("XPosition")
    @Expose
    private String XPosition;

    /**
    * 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的纵向比例，可选值 0 - 100。
    */
    @SerializedName("YPosition")
    @Expose
    private String YPosition;

    /**
     * Get 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。 
     * @return AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     * @param AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为 live。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 您的推流域名。 
     * @return PushDomainName 您的推流域名。
     */
    public String getPushDomainName() {
        return this.PushDomainName;
    }

    /**
     * Set 您的推流域名。
     * @param PushDomainName 您的推流域名。
     */
    public void setPushDomainName(String PushDomainName) {
        this.PushDomainName = PushDomainName;
    }

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 云端特效 ID。 
     * @return Id 云端特效 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 云端特效 ID。
     * @param Id 云端特效 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 默认随系统配置，云端特效循环 少于5次。可自定义指定礼物循环次数，不超过100次。 
     * @return LoopTimes 默认随系统配置，云端特效循环 少于5次。可自定义指定礼物循环次数，不超过100次。
     */
    public Long getLoopTimes() {
        return this.LoopTimes;
    }

    /**
     * Set 默认随系统配置，云端特效循环 少于5次。可自定义指定礼物循环次数，不超过100次。
     * @param LoopTimes 默认随系统配置，云端特效循环 少于5次。可自定义指定礼物循环次数，不超过100次。
     */
    public void setLoopTimes(Long LoopTimes) {
        this.LoopTimes = LoopTimes;
    }

    /**
     * Get 操作人备注信息。 
     * @return Operator 操作人备注信息。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人备注信息。
     * @param Operator 操作人备注信息。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 缩小比例，默认0 不缩放。
可选值：0-9， 值越大，越缩小。 
     * @return ZoomFactor 缩小比例，默认0 不缩放。
可选值：0-9， 值越大，越缩小。
     */
    public Long getZoomFactor() {
        return this.ZoomFactor;
    }

    /**
     * Set 缩小比例，默认0 不缩放。
可选值：0-9， 值越大，越缩小。
     * @param ZoomFactor 缩小比例，默认0 不缩放。
可选值：0-9， 值越大，越缩小。
     */
    public void setZoomFactor(Long ZoomFactor) {
        this.ZoomFactor = ZoomFactor;
    }

    /**
     * Get 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的横向比例，可选值 0 - 100。 
     * @return XPosition 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的横向比例，可选值 0 - 100。
     */
    public String getXPosition() {
        return this.XPosition;
    }

    /**
     * Set 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的横向比例，可选值 0 - 100。
     * @param XPosition 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的横向比例，可选值 0 - 100。
     */
    public void setXPosition(String XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * Get 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的纵向比例，可选值 0 - 100。 
     * @return YPosition 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的纵向比例，可选值 0 - 100。
     */
    public String getYPosition() {
        return this.YPosition;
    }

    /**
     * Set 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的纵向比例，可选值 0 - 100。
     * @param YPosition 指定云端特效渲染位置百分比。默认居中显示。
原点为画面左上角，该参数指定特效渲染离原点的纵向比例，可选值 0 - 100。
     */
    public void setYPosition(String YPosition) {
        this.YPosition = YPosition;
    }

    public SendLiveCloudEffectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendLiveCloudEffectRequest(SendLiveCloudEffectRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.PushDomainName != null) {
            this.PushDomainName = new String(source.PushDomainName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.LoopTimes != null) {
            this.LoopTimes = new Long(source.LoopTimes);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.ZoomFactor != null) {
            this.ZoomFactor = new Long(source.ZoomFactor);
        }
        if (source.XPosition != null) {
            this.XPosition = new String(source.XPosition);
        }
        if (source.YPosition != null) {
            this.YPosition = new String(source.YPosition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PushDomainName", this.PushDomainName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "LoopTimes", this.LoopTimes);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "ZoomFactor", this.ZoomFactor);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);

    }
}

