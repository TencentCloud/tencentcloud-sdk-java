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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextOutputComm extends AbstractModel {

    /**
    * 接口唯一ID，旁路调用接口返回有该字段，标识唯一接口
    */
    @SerializedName("BUCtrlID")
    @Expose
    private Long BUCtrlID;

    /**
    * 消息发送时间
    */
    @SerializedName("SendTime")
    @Expose
    private Long SendTime;

    /**
    * 接入业务的唯一ID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 请求字段里的Common.Uin
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
     * Get 接口唯一ID，旁路调用接口返回有该字段，标识唯一接口 
     * @return BUCtrlID 接口唯一ID，旁路调用接口返回有该字段，标识唯一接口
     */
    public Long getBUCtrlID() {
        return this.BUCtrlID;
    }

    /**
     * Set 接口唯一ID，旁路调用接口返回有该字段，标识唯一接口
     * @param BUCtrlID 接口唯一ID，旁路调用接口返回有该字段，标识唯一接口
     */
    public void setBUCtrlID(Long BUCtrlID) {
        this.BUCtrlID = BUCtrlID;
    }

    /**
     * Get 消息发送时间 
     * @return SendTime 消息发送时间
     */
    public Long getSendTime() {
        return this.SendTime;
    }

    /**
     * Set 消息发送时间
     * @param SendTime 消息发送时间
     */
    public void setSendTime(Long SendTime) {
        this.SendTime = SendTime;
    }

    /**
     * Get 接入业务的唯一ID 
     * @return AppID 接入业务的唯一ID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 接入业务的唯一ID
     * @param AppID 接入业务的唯一ID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 请求字段里的Common.Uin 
     * @return Uin 请求字段里的Common.Uin
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 请求字段里的Common.Uin
     * @param Uin 请求字段里的Common.Uin
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    public TextOutputComm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextOutputComm(TextOutputComm source) {
        if (source.BUCtrlID != null) {
            this.BUCtrlID = new Long(source.BUCtrlID);
        }
        if (source.SendTime != null) {
            this.SendTime = new Long(source.SendTime);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BUCtrlID", this.BUCtrlID);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

