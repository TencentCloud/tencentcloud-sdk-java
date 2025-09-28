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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiveInfo extends AbstractModel {

    /**
    * 接收组
    */
    @SerializedName("ReceiveGroup")
    @Expose
    private Long [] ReceiveGroup;

    /**
    * 最后接收时间，格式: "HH:mm:ss"
    */
    @SerializedName("EndReceiveTime")
    @Expose
    private String EndReceiveTime;

    /**
    * 接收名
    */
    @SerializedName("ReceiveName")
    @Expose
    private String ReceiveName;

    /**
    * 推送渠道
    */
    @SerializedName("SendChannel")
    @Expose
    private Long [] SendChannel;

    /**
    * 开始时间，格式: "HH:mm:ss"
    */
    @SerializedName("StartReceiveTime")
    @Expose
    private String StartReceiveTime;

    /**
    * 接收用户列表
    */
    @SerializedName("ReceiveUin")
    @Expose
    private ReceiveUin [] ReceiveUin;

    /**
     * Get 接收组 
     * @return ReceiveGroup 接收组
     */
    public Long [] getReceiveGroup() {
        return this.ReceiveGroup;
    }

    /**
     * Set 接收组
     * @param ReceiveGroup 接收组
     */
    public void setReceiveGroup(Long [] ReceiveGroup) {
        this.ReceiveGroup = ReceiveGroup;
    }

    /**
     * Get 最后接收时间，格式: "HH:mm:ss" 
     * @return EndReceiveTime 最后接收时间，格式: "HH:mm:ss"
     */
    public String getEndReceiveTime() {
        return this.EndReceiveTime;
    }

    /**
     * Set 最后接收时间，格式: "HH:mm:ss"
     * @param EndReceiveTime 最后接收时间，格式: "HH:mm:ss"
     */
    public void setEndReceiveTime(String EndReceiveTime) {
        this.EndReceiveTime = EndReceiveTime;
    }

    /**
     * Get 接收名 
     * @return ReceiveName 接收名
     */
    public String getReceiveName() {
        return this.ReceiveName;
    }

    /**
     * Set 接收名
     * @param ReceiveName 接收名
     */
    public void setReceiveName(String ReceiveName) {
        this.ReceiveName = ReceiveName;
    }

    /**
     * Get 推送渠道 
     * @return SendChannel 推送渠道
     */
    public Long [] getSendChannel() {
        return this.SendChannel;
    }

    /**
     * Set 推送渠道
     * @param SendChannel 推送渠道
     */
    public void setSendChannel(Long [] SendChannel) {
        this.SendChannel = SendChannel;
    }

    /**
     * Get 开始时间，格式: "HH:mm:ss" 
     * @return StartReceiveTime 开始时间，格式: "HH:mm:ss"
     */
    public String getStartReceiveTime() {
        return this.StartReceiveTime;
    }

    /**
     * Set 开始时间，格式: "HH:mm:ss"
     * @param StartReceiveTime 开始时间，格式: "HH:mm:ss"
     */
    public void setStartReceiveTime(String StartReceiveTime) {
        this.StartReceiveTime = StartReceiveTime;
    }

    /**
     * Get 接收用户列表 
     * @return ReceiveUin 接收用户列表
     */
    public ReceiveUin [] getReceiveUin() {
        return this.ReceiveUin;
    }

    /**
     * Set 接收用户列表
     * @param ReceiveUin 接收用户列表
     */
    public void setReceiveUin(ReceiveUin [] ReceiveUin) {
        this.ReceiveUin = ReceiveUin;
    }

    public ReceiveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiveInfo(ReceiveInfo source) {
        if (source.ReceiveGroup != null) {
            this.ReceiveGroup = new Long[source.ReceiveGroup.length];
            for (int i = 0; i < source.ReceiveGroup.length; i++) {
                this.ReceiveGroup[i] = new Long(source.ReceiveGroup[i]);
            }
        }
        if (source.EndReceiveTime != null) {
            this.EndReceiveTime = new String(source.EndReceiveTime);
        }
        if (source.ReceiveName != null) {
            this.ReceiveName = new String(source.ReceiveName);
        }
        if (source.SendChannel != null) {
            this.SendChannel = new Long[source.SendChannel.length];
            for (int i = 0; i < source.SendChannel.length; i++) {
                this.SendChannel[i] = new Long(source.SendChannel[i]);
            }
        }
        if (source.StartReceiveTime != null) {
            this.StartReceiveTime = new String(source.StartReceiveTime);
        }
        if (source.ReceiveUin != null) {
            this.ReceiveUin = new ReceiveUin[source.ReceiveUin.length];
            for (int i = 0; i < source.ReceiveUin.length; i++) {
                this.ReceiveUin[i] = new ReceiveUin(source.ReceiveUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ReceiveGroup.", this.ReceiveGroup);
        this.setParamSimple(map, prefix + "EndReceiveTime", this.EndReceiveTime);
        this.setParamSimple(map, prefix + "ReceiveName", this.ReceiveName);
        this.setParamArraySimple(map, prefix + "SendChannel.", this.SendChannel);
        this.setParamSimple(map, prefix + "StartReceiveTime", this.StartReceiveTime);
        this.setParamArrayObj(map, prefix + "ReceiveUin.", this.ReceiveUin);

    }
}

