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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuPassThrough extends AbstractModel{

    /**
    * 透传SEI的payload内容。
    */
    @SerializedName("PayloadContent")
    @Expose
    private String PayloadContent;

    /**
    * SEI消息的payload_type，取值范围5、100-254（244除外，244为我们内部自定义的时间戳SEI）。
    */
    @SerializedName("PayloadType")
    @Expose
    private Long PayloadType;

    /**
    * PayloadType为5，PayloadUuid必须填写。PayloadType不是5时，不需要填写，填写会被后台忽略。该值必须是32长度的十六进制。
    */
    @SerializedName("PayloadUuid")
    @Expose
    private String PayloadUuid;

    /**
    * SEI发送间隔，单位毫秒，默认值为1000。
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 取值范围[0,1]，填1：发送关键帧时会确保带SEI；填0：发送关键帧时不确保带SEI。默认值为0。
    */
    @SerializedName("FollowIdr")
    @Expose
    private Long FollowIdr;

    /**
     * Get 透传SEI的payload内容。 
     * @return PayloadContent 透传SEI的payload内容。
     */
    public String getPayloadContent() {
        return this.PayloadContent;
    }

    /**
     * Set 透传SEI的payload内容。
     * @param PayloadContent 透传SEI的payload内容。
     */
    public void setPayloadContent(String PayloadContent) {
        this.PayloadContent = PayloadContent;
    }

    /**
     * Get SEI消息的payload_type，取值范围5、100-254（244除外，244为我们内部自定义的时间戳SEI）。 
     * @return PayloadType SEI消息的payload_type，取值范围5、100-254（244除外，244为我们内部自定义的时间戳SEI）。
     */
    public Long getPayloadType() {
        return this.PayloadType;
    }

    /**
     * Set SEI消息的payload_type，取值范围5、100-254（244除外，244为我们内部自定义的时间戳SEI）。
     * @param PayloadType SEI消息的payload_type，取值范围5、100-254（244除外，244为我们内部自定义的时间戳SEI）。
     */
    public void setPayloadType(Long PayloadType) {
        this.PayloadType = PayloadType;
    }

    /**
     * Get PayloadType为5，PayloadUuid必须填写。PayloadType不是5时，不需要填写，填写会被后台忽略。该值必须是32长度的十六进制。 
     * @return PayloadUuid PayloadType为5，PayloadUuid必须填写。PayloadType不是5时，不需要填写，填写会被后台忽略。该值必须是32长度的十六进制。
     */
    public String getPayloadUuid() {
        return this.PayloadUuid;
    }

    /**
     * Set PayloadType为5，PayloadUuid必须填写。PayloadType不是5时，不需要填写，填写会被后台忽略。该值必须是32长度的十六进制。
     * @param PayloadUuid PayloadType为5，PayloadUuid必须填写。PayloadType不是5时，不需要填写，填写会被后台忽略。该值必须是32长度的十六进制。
     */
    public void setPayloadUuid(String PayloadUuid) {
        this.PayloadUuid = PayloadUuid;
    }

    /**
     * Get SEI发送间隔，单位毫秒，默认值为1000。 
     * @return Interval SEI发送间隔，单位毫秒，默认值为1000。
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set SEI发送间隔，单位毫秒，默认值为1000。
     * @param Interval SEI发送间隔，单位毫秒，默认值为1000。
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 取值范围[0,1]，填1：发送关键帧时会确保带SEI；填0：发送关键帧时不确保带SEI。默认值为0。 
     * @return FollowIdr 取值范围[0,1]，填1：发送关键帧时会确保带SEI；填0：发送关键帧时不确保带SEI。默认值为0。
     */
    public Long getFollowIdr() {
        return this.FollowIdr;
    }

    /**
     * Set 取值范围[0,1]，填1：发送关键帧时会确保带SEI；填0：发送关键帧时不确保带SEI。默认值为0。
     * @param FollowIdr 取值范围[0,1]，填1：发送关键帧时会确保带SEI；填0：发送关键帧时不确保带SEI。默认值为0。
     */
    public void setFollowIdr(Long FollowIdr) {
        this.FollowIdr = FollowIdr;
    }

    public McuPassThrough() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuPassThrough(McuPassThrough source) {
        if (source.PayloadContent != null) {
            this.PayloadContent = new String(source.PayloadContent);
        }
        if (source.PayloadType != null) {
            this.PayloadType = new Long(source.PayloadType);
        }
        if (source.PayloadUuid != null) {
            this.PayloadUuid = new String(source.PayloadUuid);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.FollowIdr != null) {
            this.FollowIdr = new Long(source.FollowIdr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayloadContent", this.PayloadContent);
        this.setParamSimple(map, prefix + "PayloadType", this.PayloadType);
        this.setParamSimple(map, prefix + "PayloadUuid", this.PayloadUuid);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "FollowIdr", this.FollowIdr);

    }
}

