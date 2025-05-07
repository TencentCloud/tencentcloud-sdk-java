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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskResultRequest extends AbstractModel {

    /**
    * 异步任务ID。从异步任务接口返回结果中查看。例如：[AllocateAddresses](https://cloud.tencent.com/document/product/215/16699)接口。TaskId和DealName必填一个参数。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 计费订单号。在控制台中的[费用中心-订单管理](https://console.cloud.tencent.com/expense/deal)中查看订单号。TaskId和DealName必填一个参数。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
     * Get 异步任务ID。从异步任务接口返回结果中查看。例如：[AllocateAddresses](https://cloud.tencent.com/document/product/215/16699)接口。TaskId和DealName必填一个参数。 
     * @return TaskId 异步任务ID。从异步任务接口返回结果中查看。例如：[AllocateAddresses](https://cloud.tencent.com/document/product/215/16699)接口。TaskId和DealName必填一个参数。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 异步任务ID。从异步任务接口返回结果中查看。例如：[AllocateAddresses](https://cloud.tencent.com/document/product/215/16699)接口。TaskId和DealName必填一个参数。
     * @param TaskId 异步任务ID。从异步任务接口返回结果中查看。例如：[AllocateAddresses](https://cloud.tencent.com/document/product/215/16699)接口。TaskId和DealName必填一个参数。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 计费订单号。在控制台中的[费用中心-订单管理](https://console.cloud.tencent.com/expense/deal)中查看订单号。TaskId和DealName必填一个参数。 
     * @return DealName 计费订单号。在控制台中的[费用中心-订单管理](https://console.cloud.tencent.com/expense/deal)中查看订单号。TaskId和DealName必填一个参数。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 计费订单号。在控制台中的[费用中心-订单管理](https://console.cloud.tencent.com/expense/deal)中查看订单号。TaskId和DealName必填一个参数。
     * @param DealName 计费订单号。在控制台中的[费用中心-订单管理](https://console.cloud.tencent.com/expense/deal)中查看订单号。TaskId和DealName必填一个参数。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    public DescribeTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskResultRequest(DescribeTaskResultRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);

    }
}

