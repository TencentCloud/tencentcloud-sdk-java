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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InsertTaskTemporaryFilesRequest extends AbstractModel {

    /**
    * 直播拉流任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 插播文件列表，支持一次性插播多个文件，文件个数最大支持30个。可在轮播过程中追加新的插播文件。
    */
    @SerializedName("TemporaryFiles")
    @Expose
    private String [] TemporaryFiles;

    /**
    * 操作人名称。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 将文件插在当前轮播序列的指定位置后面。索引序列从1开始。默认为：0，表示播完当前文件立即播放插入文件。注意：索引不要超过当前总文件个数，否则按播完全部文件后再处理插播文件。
    */
    @SerializedName("InsertAfterIndex")
    @Expose
    private Long InsertAfterIndex;

    /**
    * 用于多个文件插播在同一个轮播序号之后时，可指定队列顺序。
0 - 最高优先级队列。默认值。
1 - 中等优先级队列。
2 - 最低优先级队列。
场景示例：
比如当前播放第2个文件，多个新文件插播在第2个文件之后，播完第二个轮播文件之后，优先播放InsertPriorityType为0的插播队列中的文件，再播放InsertPriorityType为1的插播队列中的文件，最后播放InsertPriorityType为2的插播队列文件。
如果插播无队列优先级要求，则无需使用此参数。
    */
    @SerializedName("InsertPriorityType")
    @Expose
    private Long InsertPriorityType;

    /**
    * 插播上下文信息。由用户自定义传入。当播放到使用本此插播请求插入的文件时，在文件播放开始和文件播放结束的回调时，将此上下文信息通过创建任务携带的回调地址回调给用户。
注意：如果有关联每个插播文件的信息需要回调时，可将需要回调的信息自行拼接到插播文件URL上，通过回调信息中的URL进行读取使用。
    */
    @SerializedName("InsertContext")
    @Expose
    private String InsertContext;

    /**
     * Get 直播拉流任务 ID。 
     * @return TaskId 直播拉流任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 直播拉流任务 ID。
     * @param TaskId 直播拉流任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 插播文件列表，支持一次性插播多个文件，文件个数最大支持30个。可在轮播过程中追加新的插播文件。 
     * @return TemporaryFiles 插播文件列表，支持一次性插播多个文件，文件个数最大支持30个。可在轮播过程中追加新的插播文件。
     */
    public String [] getTemporaryFiles() {
        return this.TemporaryFiles;
    }

    /**
     * Set 插播文件列表，支持一次性插播多个文件，文件个数最大支持30个。可在轮播过程中追加新的插播文件。
     * @param TemporaryFiles 插播文件列表，支持一次性插播多个文件，文件个数最大支持30个。可在轮播过程中追加新的插播文件。
     */
    public void setTemporaryFiles(String [] TemporaryFiles) {
        this.TemporaryFiles = TemporaryFiles;
    }

    /**
     * Get 操作人名称。 
     * @return Operator 操作人名称。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人名称。
     * @param Operator 操作人名称。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 将文件插在当前轮播序列的指定位置后面。索引序列从1开始。默认为：0，表示播完当前文件立即播放插入文件。注意：索引不要超过当前总文件个数，否则按播完全部文件后再处理插播文件。 
     * @return InsertAfterIndex 将文件插在当前轮播序列的指定位置后面。索引序列从1开始。默认为：0，表示播完当前文件立即播放插入文件。注意：索引不要超过当前总文件个数，否则按播完全部文件后再处理插播文件。
     */
    public Long getInsertAfterIndex() {
        return this.InsertAfterIndex;
    }

    /**
     * Set 将文件插在当前轮播序列的指定位置后面。索引序列从1开始。默认为：0，表示播完当前文件立即播放插入文件。注意：索引不要超过当前总文件个数，否则按播完全部文件后再处理插播文件。
     * @param InsertAfterIndex 将文件插在当前轮播序列的指定位置后面。索引序列从1开始。默认为：0，表示播完当前文件立即播放插入文件。注意：索引不要超过当前总文件个数，否则按播完全部文件后再处理插播文件。
     */
    public void setInsertAfterIndex(Long InsertAfterIndex) {
        this.InsertAfterIndex = InsertAfterIndex;
    }

    /**
     * Get 用于多个文件插播在同一个轮播序号之后时，可指定队列顺序。
0 - 最高优先级队列。默认值。
1 - 中等优先级队列。
2 - 最低优先级队列。
场景示例：
比如当前播放第2个文件，多个新文件插播在第2个文件之后，播完第二个轮播文件之后，优先播放InsertPriorityType为0的插播队列中的文件，再播放InsertPriorityType为1的插播队列中的文件，最后播放InsertPriorityType为2的插播队列文件。
如果插播无队列优先级要求，则无需使用此参数。 
     * @return InsertPriorityType 用于多个文件插播在同一个轮播序号之后时，可指定队列顺序。
0 - 最高优先级队列。默认值。
1 - 中等优先级队列。
2 - 最低优先级队列。
场景示例：
比如当前播放第2个文件，多个新文件插播在第2个文件之后，播完第二个轮播文件之后，优先播放InsertPriorityType为0的插播队列中的文件，再播放InsertPriorityType为1的插播队列中的文件，最后播放InsertPriorityType为2的插播队列文件。
如果插播无队列优先级要求，则无需使用此参数。
     */
    public Long getInsertPriorityType() {
        return this.InsertPriorityType;
    }

    /**
     * Set 用于多个文件插播在同一个轮播序号之后时，可指定队列顺序。
0 - 最高优先级队列。默认值。
1 - 中等优先级队列。
2 - 最低优先级队列。
场景示例：
比如当前播放第2个文件，多个新文件插播在第2个文件之后，播完第二个轮播文件之后，优先播放InsertPriorityType为0的插播队列中的文件，再播放InsertPriorityType为1的插播队列中的文件，最后播放InsertPriorityType为2的插播队列文件。
如果插播无队列优先级要求，则无需使用此参数。
     * @param InsertPriorityType 用于多个文件插播在同一个轮播序号之后时，可指定队列顺序。
0 - 最高优先级队列。默认值。
1 - 中等优先级队列。
2 - 最低优先级队列。
场景示例：
比如当前播放第2个文件，多个新文件插播在第2个文件之后，播完第二个轮播文件之后，优先播放InsertPriorityType为0的插播队列中的文件，再播放InsertPriorityType为1的插播队列中的文件，最后播放InsertPriorityType为2的插播队列文件。
如果插播无队列优先级要求，则无需使用此参数。
     */
    public void setInsertPriorityType(Long InsertPriorityType) {
        this.InsertPriorityType = InsertPriorityType;
    }

    /**
     * Get 插播上下文信息。由用户自定义传入。当播放到使用本此插播请求插入的文件时，在文件播放开始和文件播放结束的回调时，将此上下文信息通过创建任务携带的回调地址回调给用户。
注意：如果有关联每个插播文件的信息需要回调时，可将需要回调的信息自行拼接到插播文件URL上，通过回调信息中的URL进行读取使用。 
     * @return InsertContext 插播上下文信息。由用户自定义传入。当播放到使用本此插播请求插入的文件时，在文件播放开始和文件播放结束的回调时，将此上下文信息通过创建任务携带的回调地址回调给用户。
注意：如果有关联每个插播文件的信息需要回调时，可将需要回调的信息自行拼接到插播文件URL上，通过回调信息中的URL进行读取使用。
     */
    public String getInsertContext() {
        return this.InsertContext;
    }

    /**
     * Set 插播上下文信息。由用户自定义传入。当播放到使用本此插播请求插入的文件时，在文件播放开始和文件播放结束的回调时，将此上下文信息通过创建任务携带的回调地址回调给用户。
注意：如果有关联每个插播文件的信息需要回调时，可将需要回调的信息自行拼接到插播文件URL上，通过回调信息中的URL进行读取使用。
     * @param InsertContext 插播上下文信息。由用户自定义传入。当播放到使用本此插播请求插入的文件时，在文件播放开始和文件播放结束的回调时，将此上下文信息通过创建任务携带的回调地址回调给用户。
注意：如果有关联每个插播文件的信息需要回调时，可将需要回调的信息自行拼接到插播文件URL上，通过回调信息中的URL进行读取使用。
     */
    public void setInsertContext(String InsertContext) {
        this.InsertContext = InsertContext;
    }

    public InsertTaskTemporaryFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InsertTaskTemporaryFilesRequest(InsertTaskTemporaryFilesRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TemporaryFiles != null) {
            this.TemporaryFiles = new String[source.TemporaryFiles.length];
            for (int i = 0; i < source.TemporaryFiles.length; i++) {
                this.TemporaryFiles[i] = new String(source.TemporaryFiles[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.InsertAfterIndex != null) {
            this.InsertAfterIndex = new Long(source.InsertAfterIndex);
        }
        if (source.InsertPriorityType != null) {
            this.InsertPriorityType = new Long(source.InsertPriorityType);
        }
        if (source.InsertContext != null) {
            this.InsertContext = new String(source.InsertContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "TemporaryFiles.", this.TemporaryFiles);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "InsertAfterIndex", this.InsertAfterIndex);
        this.setParamSimple(map, prefix + "InsertPriorityType", this.InsertPriorityType);
        this.setParamSimple(map, prefix + "InsertContext", this.InsertContext);

    }
}

