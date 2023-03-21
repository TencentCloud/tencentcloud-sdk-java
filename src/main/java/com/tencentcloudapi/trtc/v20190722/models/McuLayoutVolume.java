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

public class McuLayoutVolume extends AbstractModel{

    /**
    * AppData的内容，会被写入自定义SEI中的app_data字段，长度需小于4096。
    */
    @SerializedName("AppData")
    @Expose
    private String AppData;

    /**
    * SEI消息的payload_type，默认值100，取值范围100-254（244除外，244为我们内部自定义的时间戳SEI）
    */
    @SerializedName("PayloadType")
    @Expose
    private Long PayloadType;

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
     * Get AppData的内容，会被写入自定义SEI中的app_data字段，长度需小于4096。 
     * @return AppData AppData的内容，会被写入自定义SEI中的app_data字段，长度需小于4096。
     */
    public String getAppData() {
        return this.AppData;
    }

    /**
     * Set AppData的内容，会被写入自定义SEI中的app_data字段，长度需小于4096。
     * @param AppData AppData的内容，会被写入自定义SEI中的app_data字段，长度需小于4096。
     */
    public void setAppData(String AppData) {
        this.AppData = AppData;
    }

    /**
     * Get SEI消息的payload_type，默认值100，取值范围100-254（244除外，244为我们内部自定义的时间戳SEI） 
     * @return PayloadType SEI消息的payload_type，默认值100，取值范围100-254（244除外，244为我们内部自定义的时间戳SEI）
     */
    public Long getPayloadType() {
        return this.PayloadType;
    }

    /**
     * Set SEI消息的payload_type，默认值100，取值范围100-254（244除外，244为我们内部自定义的时间戳SEI）
     * @param PayloadType SEI消息的payload_type，默认值100，取值范围100-254（244除外，244为我们内部自定义的时间戳SEI）
     */
    public void setPayloadType(Long PayloadType) {
        this.PayloadType = PayloadType;
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

    public McuLayoutVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuLayoutVolume(McuLayoutVolume source) {
        if (source.AppData != null) {
            this.AppData = new String(source.AppData);
        }
        if (source.PayloadType != null) {
            this.PayloadType = new Long(source.PayloadType);
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
        this.setParamSimple(map, prefix + "AppData", this.AppData);
        this.setParamSimple(map, prefix + "PayloadType", this.PayloadType);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "FollowIdr", this.FollowIdr);

    }
}

