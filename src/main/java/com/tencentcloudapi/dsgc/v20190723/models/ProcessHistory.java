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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessHistory extends AbstractModel {

    /**
    * 处理时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 处理人
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
     * Get 处理时间 
     * @return Time 处理时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 处理时间
     * @param Time 处理时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 处理人 
     * @return Handler 处理人
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set 处理人
     * @param Handler 处理人
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    public ProcessHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessHistory(ProcessHistory source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Handler != null) {
            this.Handler = new String(source.Handler);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

