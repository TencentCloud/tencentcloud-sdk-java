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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Event extends AbstractModel{

    /**
    * pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 事件原因内容
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 事件类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件出现次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 事件第一次出现时间
    */
    @SerializedName("FirstTimestamp")
    @Expose
    private String FirstTimestamp;

    /**
    * 事件最后一次出现时间
    */
    @SerializedName("LastTimestamp")
    @Expose
    private String LastTimestamp;

    /**
    * 事件内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get pod名称 
     * @return PodName pod名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod名称
     * @param PodName pod名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 事件原因内容 
     * @return Reason 事件原因内容
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 事件原因内容
     * @param Reason 事件原因内容
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 事件类型 
     * @return Type 事件类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型
     * @param Type 事件类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件出现次数 
     * @return Count 事件出现次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 事件出现次数
     * @param Count 事件出现次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 事件第一次出现时间 
     * @return FirstTimestamp 事件第一次出现时间
     */
    public String getFirstTimestamp() {
        return this.FirstTimestamp;
    }

    /**
     * Set 事件第一次出现时间
     * @param FirstTimestamp 事件第一次出现时间
     */
    public void setFirstTimestamp(String FirstTimestamp) {
        this.FirstTimestamp = FirstTimestamp;
    }

    /**
     * Get 事件最后一次出现时间 
     * @return LastTimestamp 事件最后一次出现时间
     */
    public String getLastTimestamp() {
        return this.LastTimestamp;
    }

    /**
     * Set 事件最后一次出现时间
     * @param LastTimestamp 事件最后一次出现时间
     */
    public void setLastTimestamp(String LastTimestamp) {
        this.LastTimestamp = LastTimestamp;
    }

    /**
     * Get 事件内容 
     * @return Message 事件内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 事件内容
     * @param Message 事件内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Event() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Event(Event source) {
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.FirstTimestamp != null) {
            this.FirstTimestamp = new String(source.FirstTimestamp);
        }
        if (source.LastTimestamp != null) {
            this.LastTimestamp = new String(source.LastTimestamp);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "FirstTimestamp", this.FirstTimestamp);
        this.setParamSimple(map, prefix + "LastTimestamp", this.LastTimestamp);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

