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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProgramAlertInfos extends AbstractModel {

    /**
    * <p>频道ID。</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>频道名称。</p>
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * <p>ProgramName。</p>
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * <p>ProgramName。</p>
    */
    @SerializedName("ProgramName")
    @Expose
    private String ProgramName;

    /**
    * <p>告警事件码。</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>告警分类。</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>告警消息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>更新时间。</p>
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private Long LastModifiedTime;

    /**
     * Get <p>频道ID。</p> 
     * @return ChannelId <p>频道ID。</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>频道ID。</p>
     * @param ChannelId <p>频道ID。</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>频道名称。</p> 
     * @return ChannelName <p>频道名称。</p>
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set <p>频道名称。</p>
     * @param ChannelName <p>频道名称。</p>
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get <p>ProgramName。</p> 
     * @return ProgramId <p>ProgramName。</p>
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set <p>ProgramName。</p>
     * @param ProgramId <p>ProgramName。</p>
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get <p>ProgramName。</p> 
     * @return ProgramName <p>ProgramName。</p>
     */
    public String getProgramName() {
        return this.ProgramName;
    }

    /**
     * Set <p>ProgramName。</p>
     * @param ProgramName <p>ProgramName。</p>
     */
    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    /**
     * Get <p>告警事件码。</p> 
     * @return Code <p>告警事件码。</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>告警事件码。</p>
     * @param Code <p>告警事件码。</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get <p>告警分类。</p> 
     * @return Category <p>告警分类。</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>告警分类。</p>
     * @param Category <p>告警分类。</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>告警消息。</p> 
     * @return Message <p>告警消息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>告警消息。</p>
     * @param Message <p>告警消息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>更新时间。</p> 
     * @return LastModifiedTime <p>更新时间。</p>
     */
    public Long getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set <p>更新时间。</p>
     * @param LastModifiedTime <p>更新时间。</p>
     */
    public void setLastModifiedTime(Long LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    public ProgramAlertInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProgramAlertInfos(ProgramAlertInfos source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.ProgramName != null) {
            this.ProgramName = new String(source.ProgramName);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.LastModifiedTime != null) {
            this.LastModifiedTime = new Long(source.LastModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "ProgramName", this.ProgramName);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);

    }
}

