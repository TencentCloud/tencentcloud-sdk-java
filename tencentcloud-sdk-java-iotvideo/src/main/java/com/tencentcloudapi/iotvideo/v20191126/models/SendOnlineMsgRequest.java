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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendOnlineMsgRequest extends AbstractModel{

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 如果设备处于休眠状态，是否唤醒设备
    */
    @SerializedName("Wakeup")
    @Expose
    private Boolean Wakeup;

    /**
    * 等待回应类型
0：不等待设备回应直接响应请求;
1：要求设备确认消息已接收,或等待超时后返回;
2：要求设备进行响应处理,收到设备的响应数据后,将设备响应数据回应给请求方;
    */
    @SerializedName("WaitResp")
    @Expose
    private Long WaitResp;

    /**
    * 消息主题
    */
    @SerializedName("MsgTopic")
    @Expose
    private String MsgTopic;

    /**
    * 消息内容，最大长度不超过8k字节
    */
    @SerializedName("MsgContent")
    @Expose
    private String MsgContent;

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 如果设备处于休眠状态，是否唤醒设备 
     * @return Wakeup 如果设备处于休眠状态，是否唤醒设备
     */
    public Boolean getWakeup() {
        return this.Wakeup;
    }

    /**
     * Set 如果设备处于休眠状态，是否唤醒设备
     * @param Wakeup 如果设备处于休眠状态，是否唤醒设备
     */
    public void setWakeup(Boolean Wakeup) {
        this.Wakeup = Wakeup;
    }

    /**
     * Get 等待回应类型
0：不等待设备回应直接响应请求;
1：要求设备确认消息已接收,或等待超时后返回;
2：要求设备进行响应处理,收到设备的响应数据后,将设备响应数据回应给请求方; 
     * @return WaitResp 等待回应类型
0：不等待设备回应直接响应请求;
1：要求设备确认消息已接收,或等待超时后返回;
2：要求设备进行响应处理,收到设备的响应数据后,将设备响应数据回应给请求方;
     */
    public Long getWaitResp() {
        return this.WaitResp;
    }

    /**
     * Set 等待回应类型
0：不等待设备回应直接响应请求;
1：要求设备确认消息已接收,或等待超时后返回;
2：要求设备进行响应处理,收到设备的响应数据后,将设备响应数据回应给请求方;
     * @param WaitResp 等待回应类型
0：不等待设备回应直接响应请求;
1：要求设备确认消息已接收,或等待超时后返回;
2：要求设备进行响应处理,收到设备的响应数据后,将设备响应数据回应给请求方;
     */
    public void setWaitResp(Long WaitResp) {
        this.WaitResp = WaitResp;
    }

    /**
     * Get 消息主题 
     * @return MsgTopic 消息主题
     */
    public String getMsgTopic() {
        return this.MsgTopic;
    }

    /**
     * Set 消息主题
     * @param MsgTopic 消息主题
     */
    public void setMsgTopic(String MsgTopic) {
        this.MsgTopic = MsgTopic;
    }

    /**
     * Get 消息内容，最大长度不超过8k字节 
     * @return MsgContent 消息内容，最大长度不超过8k字节
     */
    public String getMsgContent() {
        return this.MsgContent;
    }

    /**
     * Set 消息内容，最大长度不超过8k字节
     * @param MsgContent 消息内容，最大长度不超过8k字节
     */
    public void setMsgContent(String MsgContent) {
        this.MsgContent = MsgContent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "Wakeup", this.Wakeup);
        this.setParamSimple(map, prefix + "WaitResp", this.WaitResp);
        this.setParamSimple(map, prefix + "MsgTopic", this.MsgTopic);
        this.setParamSimple(map, prefix + "MsgContent", this.MsgContent);

    }
}

