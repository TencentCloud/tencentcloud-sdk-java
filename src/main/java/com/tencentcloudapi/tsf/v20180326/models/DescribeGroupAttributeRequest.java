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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupAttributeRequest extends AbstractModel {

    /**
    * 部署组ID，按照【部署组ID】进行过滤，可通过调用DescribeGroups查询已创建的项目列表或登录控制台进行查看；也可以调用CreateGroup创建新的项目。部署组ID例如：group-ab958z6y
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 部署组ID，按照【部署组ID】进行过滤，可通过调用DescribeGroups查询已创建的项目列表或登录控制台进行查看；也可以调用CreateGroup创建新的项目。部署组ID例如：group-ab958z6y 
     * @return GroupId 部署组ID，按照【部署组ID】进行过滤，可通过调用DescribeGroups查询已创建的项目列表或登录控制台进行查看；也可以调用CreateGroup创建新的项目。部署组ID例如：group-ab958z6y
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID，按照【部署组ID】进行过滤，可通过调用DescribeGroups查询已创建的项目列表或登录控制台进行查看；也可以调用CreateGroup创建新的项目。部署组ID例如：group-ab958z6y
     * @param GroupId 部署组ID，按照【部署组ID】进行过滤，可通过调用DescribeGroups查询已创建的项目列表或登录控制台进行查看；也可以调用CreateGroup创建新的项目。部署组ID例如：group-ab958z6y
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public DescribeGroupAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupAttributeRequest(DescribeGroupAttributeRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

