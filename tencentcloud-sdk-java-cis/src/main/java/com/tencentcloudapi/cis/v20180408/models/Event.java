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
package com.tencentcloudapi.cis.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Event extends AbstractModel{

    /**
    * 事件首次出现时间
    */
    @SerializedName("FirstSeen")
    @Expose
    private String FirstSeen;

    /**
    * 事件上次出现时间
    */
    @SerializedName("LastSeen")
    @Expose
    private String LastSeen;

    /**
    * 事件等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 事件出现次数
    */
    @SerializedName("Count")
    @Expose
    private String Count;

    /**
    * 事件出现原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 事件消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 事件首次出现时间 
     * @return FirstSeen 事件首次出现时间
     */
    public String getFirstSeen() {
        return this.FirstSeen;
    }

    /**
     * Set 事件首次出现时间
     * @param FirstSeen 事件首次出现时间
     */
    public void setFirstSeen(String FirstSeen) {
        this.FirstSeen = FirstSeen;
    }

    /**
     * Get 事件上次出现时间 
     * @return LastSeen 事件上次出现时间
     */
    public String getLastSeen() {
        return this.LastSeen;
    }

    /**
     * Set 事件上次出现时间
     * @param LastSeen 事件上次出现时间
     */
    public void setLastSeen(String LastSeen) {
        this.LastSeen = LastSeen;
    }

    /**
     * Get 事件等级 
     * @return Level 事件等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 事件等级
     * @param Level 事件等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 事件出现次数 
     * @return Count 事件出现次数
     */
    public String getCount() {
        return this.Count;
    }

    /**
     * Set 事件出现次数
     * @param Count 事件出现次数
     */
    public void setCount(String Count) {
        this.Count = Count;
    }

    /**
     * Get 事件出现原因 
     * @return Reason 事件出现原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 事件出现原因
     * @param Reason 事件出现原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 事件消息 
     * @return Message 事件消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 事件消息
     * @param Message 事件消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstSeen", this.FirstSeen);
        this.setParamSimple(map, prefix + "LastSeen", this.LastSeen);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

