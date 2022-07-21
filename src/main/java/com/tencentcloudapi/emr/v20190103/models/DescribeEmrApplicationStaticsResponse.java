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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEmrApplicationStaticsResponse extends AbstractModel{

    /**
    * 作业统计信息
    */
    @SerializedName("Statics")
    @Expose
    private ApplicationStatics [] Statics;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 可选择的队列名
    */
    @SerializedName("Queues")
    @Expose
    private String [] Queues;

    /**
    * 可选择的用户名
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * 可选择的作业类型
    */
    @SerializedName("ApplicationTypes")
    @Expose
    private String [] ApplicationTypes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 作业统计信息 
     * @return Statics 作业统计信息
     */
    public ApplicationStatics [] getStatics() {
        return this.Statics;
    }

    /**
     * Set 作业统计信息
     * @param Statics 作业统计信息
     */
    public void setStatics(ApplicationStatics [] Statics) {
        this.Statics = Statics;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 可选择的队列名 
     * @return Queues 可选择的队列名
     */
    public String [] getQueues() {
        return this.Queues;
    }

    /**
     * Set 可选择的队列名
     * @param Queues 可选择的队列名
     */
    public void setQueues(String [] Queues) {
        this.Queues = Queues;
    }

    /**
     * Get 可选择的用户名 
     * @return Users 可选择的用户名
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set 可选择的用户名
     * @param Users 可选择的用户名
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get 可选择的作业类型 
     * @return ApplicationTypes 可选择的作业类型
     */
    public String [] getApplicationTypes() {
        return this.ApplicationTypes;
    }

    /**
     * Set 可选择的作业类型
     * @param ApplicationTypes 可选择的作业类型
     */
    public void setApplicationTypes(String [] ApplicationTypes) {
        this.ApplicationTypes = ApplicationTypes;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEmrApplicationStaticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEmrApplicationStaticsResponse(DescribeEmrApplicationStaticsResponse source) {
        if (source.Statics != null) {
            this.Statics = new ApplicationStatics[source.Statics.length];
            for (int i = 0; i < source.Statics.length; i++) {
                this.Statics[i] = new ApplicationStatics(source.Statics[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Queues != null) {
            this.Queues = new String[source.Queues.length];
            for (int i = 0; i < source.Queues.length; i++) {
                this.Queues[i] = new String(source.Queues[i]);
            }
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.ApplicationTypes != null) {
            this.ApplicationTypes = new String[source.ApplicationTypes.length];
            for (int i = 0; i < source.ApplicationTypes.length; i++) {
                this.ApplicationTypes[i] = new String(source.ApplicationTypes[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Statics.", this.Statics);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "Queues.", this.Queues);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "ApplicationTypes.", this.ApplicationTypes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

