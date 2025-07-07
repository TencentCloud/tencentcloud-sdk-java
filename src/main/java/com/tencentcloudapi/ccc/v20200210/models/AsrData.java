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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrData extends AbstractModel {

    /**
    * 用户方
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 消息内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 句子开始时间，Unix 毫秒时间戳
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * 句子结束时间，Unix 毫秒时间戳
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
     * Get 用户方 
     * @return User 用户方
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户方
     * @param User 用户方
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 消息内容 
     * @return Message 消息内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 消息内容
     * @param Message 消息内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 时间戳 
     * @return Timestamp 时间戳
     * @deprecated
     */
    @Deprecated
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳
     * @param Timestamp 时间戳
     * @deprecated
     */
    @Deprecated
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 句子开始时间，Unix 毫秒时间戳 
     * @return Start 句子开始时间，Unix 毫秒时间戳
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set 句子开始时间，Unix 毫秒时间戳
     * @param Start 句子开始时间，Unix 毫秒时间戳
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get 句子结束时间，Unix 毫秒时间戳 
     * @return End 句子结束时间，Unix 毫秒时间戳
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set 句子结束时间，Unix 毫秒时间戳
     * @param End 句子结束时间，Unix 毫秒时间戳
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    public AsrData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrData(AsrData source) {
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);

    }
}

