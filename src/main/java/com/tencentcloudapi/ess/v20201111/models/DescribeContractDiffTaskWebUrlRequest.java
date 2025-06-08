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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContractDiffTaskWebUrlRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。

注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。 
     * @return TaskId 合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。
     * @param TaskId 合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeContractDiffTaskWebUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContractDiffTaskWebUrlRequest(DescribeContractDiffTaskWebUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

