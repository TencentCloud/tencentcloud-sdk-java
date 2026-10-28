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

public class DescribeContractDiffTaskWebUrlRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>过滤项列表，获取合同对比结果根据此过滤项列表进行过滤展示。<br>注：</p><ul><li>参数不传，默认根据该用户的过滤项配置进行展示。</li><li>参数传空数组，不过滤合同对比结果。</li><li>参数传过滤项列表，根据过滤项列表对合同对比结果进行过滤展示。</li></ul>
    */
    @SerializedName("FormatConfigs")
    @Expose
    private FormatConfigs FormatConfigs;

    /**
     * Get <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。</p> 
     * @return TaskId <p>合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。</p>
     * @param TaskId <p>合同对比任务ID，该参数通过调用接口<a href="https://qian.tencent.com/developers/companyApis/embedPages/CreateContractDiffTaskWebUrl" target="_blank">创建合同对比web页面</a>获取。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>过滤项列表，获取合同对比结果根据此过滤项列表进行过滤展示。<br>注：</p><ul><li>参数不传，默认根据该用户的过滤项配置进行展示。</li><li>参数传空数组，不过滤合同对比结果。</li><li>参数传过滤项列表，根据过滤项列表对合同对比结果进行过滤展示。</li></ul> 
     * @return FormatConfigs <p>过滤项列表，获取合同对比结果根据此过滤项列表进行过滤展示。<br>注：</p><ul><li>参数不传，默认根据该用户的过滤项配置进行展示。</li><li>参数传空数组，不过滤合同对比结果。</li><li>参数传过滤项列表，根据过滤项列表对合同对比结果进行过滤展示。</li></ul>
     */
    public FormatConfigs getFormatConfigs() {
        return this.FormatConfigs;
    }

    /**
     * Set <p>过滤项列表，获取合同对比结果根据此过滤项列表进行过滤展示。<br>注：</p><ul><li>参数不传，默认根据该用户的过滤项配置进行展示。</li><li>参数传空数组，不过滤合同对比结果。</li><li>参数传过滤项列表，根据过滤项列表对合同对比结果进行过滤展示。</li></ul>
     * @param FormatConfigs <p>过滤项列表，获取合同对比结果根据此过滤项列表进行过滤展示。<br>注：</p><ul><li>参数不传，默认根据该用户的过滤项配置进行展示。</li><li>参数传空数组，不过滤合同对比结果。</li><li>参数传过滤项列表，根据过滤项列表对合同对比结果进行过滤展示。</li></ul>
     */
    public void setFormatConfigs(FormatConfigs FormatConfigs) {
        this.FormatConfigs = FormatConfigs;
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
        if (source.FormatConfigs != null) {
            this.FormatConfigs = new FormatConfigs(source.FormatConfigs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "FormatConfigs.", this.FormatConfigs);

    }
}

