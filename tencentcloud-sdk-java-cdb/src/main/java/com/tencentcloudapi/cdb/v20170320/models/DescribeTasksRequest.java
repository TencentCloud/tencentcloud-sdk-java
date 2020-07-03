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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 异步任务请求 ID，执行云数据库相关操作返回的 AsyncRequestId。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;

    /**
    * 任务类型，不传值则查询所有任务类型，支持的值包括：
1 - 数据库回档；
2 - SQL操作；
3 - 数据导入；
5 - 参数设置；
6 - 初始化云数据库实例；
7 - 重启云数据库实例；
8 - 开启云数据库实例GTID；
9 - 只读实例升级；
10 - 数据库批量回档；
11 - 主实例升级；
12 - 删除云数据库库表；
13 - 灾备实例提升为主。
    */
    @SerializedName("TaskTypes")
    @Expose
    private Long [] TaskTypes;

    /**
    * 任务状态，不传值则查询所有任务状态，支持的值包括：
-1 - 未定义；
0 - 初始化；
1 - 运行中；
2 - 执行成功；
3 - 执行失败；
4 - 已终止；
5 - 已删除；
6 - 已暂停。
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * 第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。
    */
    @SerializedName("StartTimeBegin")
    @Expose
    private String StartTimeBegin;

    /**
    * 最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。
    */
    @SerializedName("StartTimeEnd")
    @Expose
    private String StartTimeEnd;

    /**
    * 记录偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次请求返回的数量，默认值为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 异步任务请求 ID，执行云数据库相关操作返回的 AsyncRequestId。 
     * @return AsyncRequestId 异步任务请求 ID，执行云数据库相关操作返回的 AsyncRequestId。
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务请求 ID，执行云数据库相关操作返回的 AsyncRequestId。
     * @param AsyncRequestId 异步任务请求 ID，执行云数据库相关操作返回的 AsyncRequestId。
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get 任务类型，不传值则查询所有任务类型，支持的值包括：
1 - 数据库回档；
2 - SQL操作；
3 - 数据导入；
5 - 参数设置；
6 - 初始化云数据库实例；
7 - 重启云数据库实例；
8 - 开启云数据库实例GTID；
9 - 只读实例升级；
10 - 数据库批量回档；
11 - 主实例升级；
12 - 删除云数据库库表；
13 - 灾备实例提升为主。 
     * @return TaskTypes 任务类型，不传值则查询所有任务类型，支持的值包括：
1 - 数据库回档；
2 - SQL操作；
3 - 数据导入；
5 - 参数设置；
6 - 初始化云数据库实例；
7 - 重启云数据库实例；
8 - 开启云数据库实例GTID；
9 - 只读实例升级；
10 - 数据库批量回档；
11 - 主实例升级；
12 - 删除云数据库库表；
13 - 灾备实例提升为主。
     */
    public Long [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 任务类型，不传值则查询所有任务类型，支持的值包括：
1 - 数据库回档；
2 - SQL操作；
3 - 数据导入；
5 - 参数设置；
6 - 初始化云数据库实例；
7 - 重启云数据库实例；
8 - 开启云数据库实例GTID；
9 - 只读实例升级；
10 - 数据库批量回档；
11 - 主实例升级；
12 - 删除云数据库库表；
13 - 灾备实例提升为主。
     * @param TaskTypes 任务类型，不传值则查询所有任务类型，支持的值包括：
1 - 数据库回档；
2 - SQL操作；
3 - 数据导入；
5 - 参数设置；
6 - 初始化云数据库实例；
7 - 重启云数据库实例；
8 - 开启云数据库实例GTID；
9 - 只读实例升级；
10 - 数据库批量回档；
11 - 主实例升级；
12 - 删除云数据库库表；
13 - 灾备实例提升为主。
     */
    public void setTaskTypes(Long [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get 任务状态，不传值则查询所有任务状态，支持的值包括：
-1 - 未定义；
0 - 初始化；
1 - 运行中；
2 - 执行成功；
3 - 执行失败；
4 - 已终止；
5 - 已删除；
6 - 已暂停。 
     * @return TaskStatus 任务状态，不传值则查询所有任务状态，支持的值包括：
-1 - 未定义；
0 - 初始化；
1 - 运行中；
2 - 执行成功；
3 - 执行失败；
4 - 已终止；
5 - 已删除；
6 - 已暂停。
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态，不传值则查询所有任务状态，支持的值包括：
-1 - 未定义；
0 - 初始化；
1 - 运行中；
2 - 执行成功；
3 - 执行失败；
4 - 已终止；
5 - 已删除；
6 - 已暂停。
     * @param TaskStatus 任务状态，不传值则查询所有任务状态，支持的值包括：
-1 - 未定义；
0 - 初始化；
1 - 运行中；
2 - 执行成功；
3 - 执行失败；
4 - 已终止；
5 - 已删除；
6 - 已暂停。
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。 
     * @return StartTimeBegin 第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。
     */
    public String getStartTimeBegin() {
        return this.StartTimeBegin;
    }

    /**
     * Set 第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。
     * @param StartTimeBegin 第一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。
     */
    public void setStartTimeBegin(String StartTimeBegin) {
        this.StartTimeBegin = StartTimeBegin;
    }

    /**
     * Get 最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。 
     * @return StartTimeEnd 最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。
     */
    public String getStartTimeEnd() {
        return this.StartTimeEnd;
    }

    /**
     * Set 最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。
     * @param StartTimeEnd 最后一个任务的开始时间，用于范围查询，时间格式如：2017-12-31 10:40:01。
     */
    public void setStartTimeEnd(String StartTimeEnd) {
        this.StartTimeEnd = StartTimeEnd;
    }

    /**
     * Get 记录偏移量，默认值为0。 
     * @return Offset 记录偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录偏移量，默认值为0。
     * @param Offset 记录偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次请求返回的数量，默认值为20，最大值为100。 
     * @return Limit 单次请求返回的数量，默认值为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量，默认值为20，最大值为100。
     * @param Limit 单次请求返回的数量，默认值为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamSimple(map, prefix + "StartTimeBegin", this.StartTimeBegin);
        this.setParamSimple(map, prefix + "StartTimeEnd", this.StartTimeEnd);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

