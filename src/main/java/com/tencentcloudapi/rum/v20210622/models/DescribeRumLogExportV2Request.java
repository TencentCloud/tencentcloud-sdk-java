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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRumLogExportV2Request extends AbstractModel {

    /**
    * Export name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query statement
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Project ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * c字段
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
     * Get Export name 
     * @return Name Export name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Export name
     * @param Name Export name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query statement 
     * @return Filter Query statement
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set Query statement
     * @param Filter Query statement
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Project ID 
     * @return ID Project ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Project ID
     * @param ID Project ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get c字段 
     * @return Fields c字段
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set c字段
     * @param Fields c字段
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    public DescribeRumLogExportV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumLogExportV2Request(DescribeRumLogExportV2Request source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);

    }
}

