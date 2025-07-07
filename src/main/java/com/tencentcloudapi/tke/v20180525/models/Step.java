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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Step extends AbstractModel {

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 开始时间
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 结束时间
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * 当前状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 执行信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 开始时间 
     * @return StartAt 开始时间
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 开始时间
     * @param StartAt 开始时间
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 结束时间 
     * @return EndAt 结束时间
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set 结束时间
     * @param EndAt 结束时间
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get 当前状态 
     * @return Status 当前状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前状态
     * @param Status 当前状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 执行信息 
     * @return Message 执行信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 执行信息
     * @param Message 执行信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Step() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Step(Step source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

