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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostingConfig extends AbstractModel {

    /**
    * 托管资源替换时间， 默认为证书过期前30天存在续费证书则替换
    */
    @SerializedName("ReplaceTime")
    @Expose
    private Long ReplaceTime;

    /**
    * 托管发送消息类型：0，托管开始前消息提醒（没有续费证书也会收到该提示消息）； 1， 托管开始消息提醒（存在续费证书才会收到消息提醒）； 2， 托管资源替换失败消息提醒； 3 托管资源替换成功消息提醒
    */
    @SerializedName("MessageTypes")
    @Expose
    private Long [] MessageTypes;

    /**
    * 资源替换开始时间
    */
    @SerializedName("ReplaceStartTime")
    @Expose
    private String ReplaceStartTime;

    /**
    * 资源替换结束时间
    */
    @SerializedName("ReplaceEndTime")
    @Expose
    private String ReplaceEndTime;

    /**
     * Get 托管资源替换时间， 默认为证书过期前30天存在续费证书则替换 
     * @return ReplaceTime 托管资源替换时间， 默认为证书过期前30天存在续费证书则替换
     */
    public Long getReplaceTime() {
        return this.ReplaceTime;
    }

    /**
     * Set 托管资源替换时间， 默认为证书过期前30天存在续费证书则替换
     * @param ReplaceTime 托管资源替换时间， 默认为证书过期前30天存在续费证书则替换
     */
    public void setReplaceTime(Long ReplaceTime) {
        this.ReplaceTime = ReplaceTime;
    }

    /**
     * Get 托管发送消息类型：0，托管开始前消息提醒（没有续费证书也会收到该提示消息）； 1， 托管开始消息提醒（存在续费证书才会收到消息提醒）； 2， 托管资源替换失败消息提醒； 3 托管资源替换成功消息提醒 
     * @return MessageTypes 托管发送消息类型：0，托管开始前消息提醒（没有续费证书也会收到该提示消息）； 1， 托管开始消息提醒（存在续费证书才会收到消息提醒）； 2， 托管资源替换失败消息提醒； 3 托管资源替换成功消息提醒
     */
    public Long [] getMessageTypes() {
        return this.MessageTypes;
    }

    /**
     * Set 托管发送消息类型：0，托管开始前消息提醒（没有续费证书也会收到该提示消息）； 1， 托管开始消息提醒（存在续费证书才会收到消息提醒）； 2， 托管资源替换失败消息提醒； 3 托管资源替换成功消息提醒
     * @param MessageTypes 托管发送消息类型：0，托管开始前消息提醒（没有续费证书也会收到该提示消息）； 1， 托管开始消息提醒（存在续费证书才会收到消息提醒）； 2， 托管资源替换失败消息提醒； 3 托管资源替换成功消息提醒
     */
    public void setMessageTypes(Long [] MessageTypes) {
        this.MessageTypes = MessageTypes;
    }

    /**
     * Get 资源替换开始时间 
     * @return ReplaceStartTime 资源替换开始时间
     */
    public String getReplaceStartTime() {
        return this.ReplaceStartTime;
    }

    /**
     * Set 资源替换开始时间
     * @param ReplaceStartTime 资源替换开始时间
     */
    public void setReplaceStartTime(String ReplaceStartTime) {
        this.ReplaceStartTime = ReplaceStartTime;
    }

    /**
     * Get 资源替换结束时间 
     * @return ReplaceEndTime 资源替换结束时间
     */
    public String getReplaceEndTime() {
        return this.ReplaceEndTime;
    }

    /**
     * Set 资源替换结束时间
     * @param ReplaceEndTime 资源替换结束时间
     */
    public void setReplaceEndTime(String ReplaceEndTime) {
        this.ReplaceEndTime = ReplaceEndTime;
    }

    public HostingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostingConfig(HostingConfig source) {
        if (source.ReplaceTime != null) {
            this.ReplaceTime = new Long(source.ReplaceTime);
        }
        if (source.MessageTypes != null) {
            this.MessageTypes = new Long[source.MessageTypes.length];
            for (int i = 0; i < source.MessageTypes.length; i++) {
                this.MessageTypes[i] = new Long(source.MessageTypes[i]);
            }
        }
        if (source.ReplaceStartTime != null) {
            this.ReplaceStartTime = new String(source.ReplaceStartTime);
        }
        if (source.ReplaceEndTime != null) {
            this.ReplaceEndTime = new String(source.ReplaceEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplaceTime", this.ReplaceTime);
        this.setParamArraySimple(map, prefix + "MessageTypes.", this.MessageTypes);
        this.setParamSimple(map, prefix + "ReplaceStartTime", this.ReplaceStartTime);
        this.setParamSimple(map, prefix + "ReplaceEndTime", this.ReplaceEndTime);

    }
}

