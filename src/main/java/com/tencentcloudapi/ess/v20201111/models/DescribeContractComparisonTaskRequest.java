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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContractComparisonTaskRequest extends AbstractModel {

    /**
    * 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 是否返回详细的对比结果。为 true时，响应中将包含详细的对比信息，如相似度、文本差异具体内容等；为 false时，仅返回任务基本状态信息。
注：`详细结果数据量可能较大，请按需开启。`
    */
    @SerializedName("ShowDetail")
    @Expose
    private Boolean ShowDetail;

    /**
    * 搜索条件，具体参考Filter结构体。本接口取值：

1. **format-type：**
按照【 合同文本格式类型 】进行过滤；
类型：String；
是否必填项：否；
类型如下：
<ul><li> **0**：段落（正文）</li>
<li> **1**：标点符号</li>
<li> **2**：页眉页脚</li>
<li> **3**：目录</li>
<li> **4**：印章</li>
<li> **5**：序号</li>
<li> **7**：下划线内容（填写区）</li>
</ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行合同审查任务的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。 
     * @return TaskId 合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。
     * @param TaskId 合同对比任务ID，该参数通过调用接口CreateContractComparisonTask获取。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 是否返回详细的对比结果。为 true时，响应中将包含详细的对比信息，如相似度、文本差异具体内容等；为 false时，仅返回任务基本状态信息。
注：`详细结果数据量可能较大，请按需开启。` 
     * @return ShowDetail 是否返回详细的对比结果。为 true时，响应中将包含详细的对比信息，如相似度、文本差异具体内容等；为 false时，仅返回任务基本状态信息。
注：`详细结果数据量可能较大，请按需开启。`
     */
    public Boolean getShowDetail() {
        return this.ShowDetail;
    }

    /**
     * Set 是否返回详细的对比结果。为 true时，响应中将包含详细的对比信息，如相似度、文本差异具体内容等；为 false时，仅返回任务基本状态信息。
注：`详细结果数据量可能较大，请按需开启。`
     * @param ShowDetail 是否返回详细的对比结果。为 true时，响应中将包含详细的对比信息，如相似度、文本差异具体内容等；为 false时，仅返回任务基本状态信息。
注：`详细结果数据量可能较大，请按需开启。`
     */
    public void setShowDetail(Boolean ShowDetail) {
        this.ShowDetail = ShowDetail;
    }

    /**
     * Get 搜索条件，具体参考Filter结构体。本接口取值：

1. **format-type：**
按照【 合同文本格式类型 】进行过滤；
类型：String；
是否必填项：否；
类型如下：
<ul><li> **0**：段落（正文）</li>
<li> **1**：标点符号</li>
<li> **2**：页眉页脚</li>
<li> **3**：目录</li>
<li> **4**：印章</li>
<li> **5**：序号</li>
<li> **7**：下划线内容（填写区）</li>
</ul> 
     * @return Filters 搜索条件，具体参考Filter结构体。本接口取值：

1. **format-type：**
按照【 合同文本格式类型 】进行过滤；
类型：String；
是否必填项：否；
类型如下：
<ul><li> **0**：段落（正文）</li>
<li> **1**：标点符号</li>
<li> **2**：页眉页脚</li>
<li> **3**：目录</li>
<li> **4**：印章</li>
<li> **5**：序号</li>
<li> **7**：下划线内容（填写区）</li>
</ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 搜索条件，具体参考Filter结构体。本接口取值：

1. **format-type：**
按照【 合同文本格式类型 】进行过滤；
类型：String；
是否必填项：否；
类型如下：
<ul><li> **0**：段落（正文）</li>
<li> **1**：标点符号</li>
<li> **2**：页眉页脚</li>
<li> **3**：目录</li>
<li> **4**：印章</li>
<li> **5**：序号</li>
<li> **7**：下划线内容（填写区）</li>
</ul>
     * @param Filters 搜索条件，具体参考Filter结构体。本接口取值：

1. **format-type：**
按照【 合同文本格式类型 】进行过滤；
类型：String；
是否必填项：否；
类型如下：
<ul><li> **0**：段落（正文）</li>
<li> **1**：标点符号</li>
<li> **2**：页眉页脚</li>
<li> **3**：目录</li>
<li> **4**：印章</li>
<li> **5**：序号</li>
<li> **7**：下划线内容（填写区）</li>
</ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeContractComparisonTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContractComparisonTaskRequest(DescribeContractComparisonTaskRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ShowDetail != null) {
            this.ShowDetail = new Boolean(source.ShowDetail);
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
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ShowDetail", this.ShowDetail);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

