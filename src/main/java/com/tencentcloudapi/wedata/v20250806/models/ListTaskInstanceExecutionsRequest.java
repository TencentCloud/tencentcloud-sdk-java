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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTaskInstanceExecutionsRequest extends AbstractModel {

    /**
    * 所属项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 实例唯一标识，可以通过ListInstances获取
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * 每页大小，默认10, 最大200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页页码，默认1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get 所属项目id 
     * @return ProjectId 所属项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目id
     * @param ProjectId 所属项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例唯一标识，可以通过ListInstances获取 
     * @return InstanceKey 实例唯一标识，可以通过ListInstances获取
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 实例唯一标识，可以通过ListInstances获取
     * @param InstanceKey 实例唯一标识，可以通过ListInstances获取
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8 
     * @return TimeZone **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8
     * @param TimeZone **时区**timeZone, 传入的时间字符串的所在时区，默认UTC+8
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 每页大小，默认10, 最大200 
     * @return PageSize 每页大小，默认10, 最大200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小，默认10, 最大200
     * @param PageSize 每页大小，默认10, 最大200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页页码，默认1 
     * @return PageNumber 分页页码，默认1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码，默认1
     * @param PageNumber 分页页码，默认1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public ListTaskInstanceExecutionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTaskInstanceExecutionsRequest(ListTaskInstanceExecutionsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

