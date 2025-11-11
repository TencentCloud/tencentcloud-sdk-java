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

public class DescribeDataTransformInfoRequest extends AbstractModel {

    /**
    * - taskName
按照【加工任务名称】进行过滤。
类型：String
必选：否
示例：test-task

- taskId
按照【加工任务id】进行过滤。
类型：String
必选：否
示例：a3622556-6402-4942-b4ff-5ae32ec29810
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。

- topicId
按照【源topicId】进行过滤。
类型：String
必选：否
示例：756cec3e-a0a5-44c3-85a8-090870582000
日志主题ID
通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

- status
按照【 任务运行状态】进行过滤。 1：准备中，2：运行中，3：停止中，4：已停止
类型：String
必选：否
示例：1

- hasServiceLog
按照【是否开启服务日志】进行过滤。 1：未开启，2：已开启
类型：String
必选：否
示例：1

- dstTopicType
按照【目标topic类型】进行过滤。  1：固定，2：动态
类型：String
必选：否
示例：1

每次请求的Filters的上限为10，Filter.Values的上限为100。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
    * 默认值为2.   1: 获取单个任务的详细信息 2：获取任务列表
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Type为1， 此参数必填
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get - taskName
按照【加工任务名称】进行过滤。
类型：String
必选：否
示例：test-task

- taskId
按照【加工任务id】进行过滤。
类型：String
必选：否
示例：a3622556-6402-4942-b4ff-5ae32ec29810
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。

- topicId
按照【源topicId】进行过滤。
类型：String
必选：否
示例：756cec3e-a0a5-44c3-85a8-090870582000
日志主题ID
通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

- status
按照【 任务运行状态】进行过滤。 1：准备中，2：运行中，3：停止中，4：已停止
类型：String
必选：否
示例：1

- hasServiceLog
按照【是否开启服务日志】进行过滤。 1：未开启，2：已开启
类型：String
必选：否
示例：1

- dstTopicType
按照【目标topic类型】进行过滤。  1：固定，2：动态
类型：String
必选：否
示例：1

每次请求的Filters的上限为10，Filter.Values的上限为100。 
     * @return Filters - taskName
按照【加工任务名称】进行过滤。
类型：String
必选：否
示例：test-task

- taskId
按照【加工任务id】进行过滤。
类型：String
必选：否
示例：a3622556-6402-4942-b4ff-5ae32ec29810
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。

- topicId
按照【源topicId】进行过滤。
类型：String
必选：否
示例：756cec3e-a0a5-44c3-85a8-090870582000
日志主题ID
通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

- status
按照【 任务运行状态】进行过滤。 1：准备中，2：运行中，3：停止中，4：已停止
类型：String
必选：否
示例：1

- hasServiceLog
按照【是否开启服务日志】进行过滤。 1：未开启，2：已开启
类型：String
必选：否
示例：1

- dstTopicType
按照【目标topic类型】进行过滤。  1：固定，2：动态
类型：String
必选：否
示例：1

每次请求的Filters的上限为10，Filter.Values的上限为100。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set - taskName
按照【加工任务名称】进行过滤。
类型：String
必选：否
示例：test-task

- taskId
按照【加工任务id】进行过滤。
类型：String
必选：否
示例：a3622556-6402-4942-b4ff-5ae32ec29810
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。

- topicId
按照【源topicId】进行过滤。
类型：String
必选：否
示例：756cec3e-a0a5-44c3-85a8-090870582000
日志主题ID
通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

- status
按照【 任务运行状态】进行过滤。 1：准备中，2：运行中，3：停止中，4：已停止
类型：String
必选：否
示例：1

- hasServiceLog
按照【是否开启服务日志】进行过滤。 1：未开启，2：已开启
类型：String
必选：否
示例：1

- dstTopicType
按照【目标topic类型】进行过滤。  1：固定，2：动态
类型：String
必选：否
示例：1

每次请求的Filters的上限为10，Filter.Values的上限为100。
     * @param Filters - taskName
按照【加工任务名称】进行过滤。
类型：String
必选：否
示例：test-task

- taskId
按照【加工任务id】进行过滤。
类型：String
必选：否
示例：a3622556-6402-4942-b4ff-5ae32ec29810
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。

- topicId
按照【源topicId】进行过滤。
类型：String
必选：否
示例：756cec3e-a0a5-44c3-85a8-090870582000
日志主题ID
通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

- status
按照【 任务运行状态】进行过滤。 1：准备中，2：运行中，3：停止中，4：已停止
类型：String
必选：否
示例：1

- hasServiceLog
按照【是否开启服务日志】进行过滤。 1：未开启，2：已开启
类型：String
必选：否
示例：1

- dstTopicType
按照【目标topic类型】进行过滤。  1：固定，2：动态
类型：String
必选：否
示例：1

每次请求的Filters的上限为10，Filter.Values的上限为100。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

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
     * Get 默认值为2.   1: 获取单个任务的详细信息 2：获取任务列表 
     * @return Type 默认值为2.   1: 获取单个任务的详细信息 2：获取任务列表
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 默认值为2.   1: 获取单个任务的详细信息 2：获取任务列表
     * @param Type 默认值为2.   1: 获取单个任务的详细信息 2：获取任务列表
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Type为1， 此参数必填
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。 
     * @return TaskId Type为1， 此参数必填
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Type为1， 此参数必填
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
     * @param TaskId Type为1， 此参数必填
数据加工任务ID- 通过[获取数据加工任务列表基本信息](https://cloud.tencent.com/document/product/614/72182)获取数据加工任务Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeDataTransformInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataTransformInfoRequest(DescribeDataTransformInfoRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

