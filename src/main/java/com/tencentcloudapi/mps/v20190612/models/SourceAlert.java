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

public class SourceAlert extends AbstractModel {

    /**
    * Source ID。
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * Source名称。
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 告警事件码。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 告警分类。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 告警消息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 更新时间。
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private Long LastModifiedTime;

    /**
     * Get Source ID。 
     * @return SourceId Source ID。
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set Source ID。
     * @param SourceId Source ID。
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get Source名称。 
     * @return SourceName Source名称。
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set Source名称。
     * @param SourceName Source名称。
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 告警事件码。 
     * @return Code 告警事件码。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 告警事件码。
     * @param Code 告警事件码。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 告警分类。 
     * @return Category 告警分类。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 告警分类。
     * @param Category 告警分类。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 告警消息。 
     * @return Message 告警消息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 告警消息。
     * @param Message 告警消息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 更新时间。 
     * @return LastModifiedTime 更新时间。
     */
    public Long getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set 更新时间。
     * @param LastModifiedTime 更新时间。
     */
    public void setLastModifiedTime(Long LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    public SourceAlert() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceAlert(SourceAlert source) {
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
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
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);

    }
}

