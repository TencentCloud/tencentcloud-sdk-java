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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScheduledSqlInfoRequest extends AbstractModel {

    /**
    * 分页的偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页单页限制数目，默认值为20，最大值100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 任务名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <li>srcTopicName按照【源日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>dstTopicName按照【目标日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>srcTopicId按照【源日志主题ID】进行过滤。类型：String。必选：否</li>
<li>dstTopicId按照【目标日志主题ID】进行过滤。类型：String。必选：否</li>
<li>bizType按照【主题类型】进行过滤，0：日志主题；1：指标主题。类型：String。必选：否</li>
<li>status按照【任务状态】进行过滤，1：运行；2：停止。类型：String。必选：否</li>
<li>taskName按照【任务名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>taskId按照【任务ID】进行过滤，模糊匹配。类型：String。必选：否</li>

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 分页的偏移量，默认值为0。 
     * @return Offset 分页的偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，默认值为0。
     * @param Offset 分页的偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页单页限制数目，默认值为20，最大值100。 
     * @return Limit 分页单页限制数目，默认值为20，最大值100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页单页限制数目，默认值为20，最大值100。
     * @param Limit 分页单页限制数目，默认值为20，最大值100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 任务名称。 
     * @return Name 任务名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称。
     * @param Name 任务名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务id。 
     * @return TaskId 任务id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id。
     * @param TaskId 任务id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <li>srcTopicName按照【源日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>dstTopicName按照【目标日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>srcTopicId按照【源日志主题ID】进行过滤。类型：String。必选：否</li>
<li>dstTopicId按照【目标日志主题ID】进行过滤。类型：String。必选：否</li>
<li>bizType按照【主题类型】进行过滤，0：日志主题；1：指标主题。类型：String。必选：否</li>
<li>status按照【任务状态】进行过滤，1：运行；2：停止。类型：String。必选：否</li>
<li>taskName按照【任务名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>taskId按照【任务ID】进行过滤，模糊匹配。类型：String。必选：否</li>
 
     * @return Filters <li>srcTopicName按照【源日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>dstTopicName按照【目标日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>srcTopicId按照【源日志主题ID】进行过滤。类型：String。必选：否</li>
<li>dstTopicId按照【目标日志主题ID】进行过滤。类型：String。必选：否</li>
<li>bizType按照【主题类型】进行过滤，0：日志主题；1：指标主题。类型：String。必选：否</li>
<li>status按照【任务状态】进行过滤，1：运行；2：停止。类型：String。必选：否</li>
<li>taskName按照【任务名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>taskId按照【任务ID】进行过滤，模糊匹配。类型：String。必选：否</li>

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>srcTopicName按照【源日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>dstTopicName按照【目标日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>srcTopicId按照【源日志主题ID】进行过滤。类型：String。必选：否</li>
<li>dstTopicId按照【目标日志主题ID】进行过滤。类型：String。必选：否</li>
<li>bizType按照【主题类型】进行过滤，0：日志主题；1：指标主题。类型：String。必选：否</li>
<li>status按照【任务状态】进行过滤，1：运行；2：停止。类型：String。必选：否</li>
<li>taskName按照【任务名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>taskId按照【任务ID】进行过滤，模糊匹配。类型：String。必选：否</li>

     * @param Filters <li>srcTopicName按照【源日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>dstTopicName按照【目标日志主题名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>srcTopicId按照【源日志主题ID】进行过滤。类型：String。必选：否</li>
<li>dstTopicId按照【目标日志主题ID】进行过滤。类型：String。必选：否</li>
<li>bizType按照【主题类型】进行过滤，0：日志主题；1：指标主题。类型：String。必选：否</li>
<li>status按照【任务状态】进行过滤，1：运行；2：停止。类型：String。必选：否</li>
<li>taskName按照【任务名称】进行过滤，模糊匹配。类型：String。必选：否</li>
<li>taskId按照【任务ID】进行过滤，模糊匹配。类型：String。必选：否</li>

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeScheduledSqlInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScheduledSqlInfoRequest(DescribeScheduledSqlInfoRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

