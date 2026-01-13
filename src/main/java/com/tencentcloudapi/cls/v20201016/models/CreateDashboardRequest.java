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

public class CreateDashboardRequest extends AbstractModel {

    /**
    * 仪表盘名称
    */
    @SerializedName("DashboardName")
    @Expose
    private String DashboardName;

    /**
    * 仪表盘配置数据
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 仪表盘名称 
     * @return DashboardName 仪表盘名称
     */
    public String getDashboardName() {
        return this.DashboardName;
    }

    /**
     * Set 仪表盘名称
     * @param DashboardName 仪表盘名称
     */
    public void setDashboardName(String DashboardName) {
        this.DashboardName = DashboardName;
    }

    /**
     * Get 仪表盘配置数据 
     * @return Data 仪表盘配置数据
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 仪表盘配置数据
     * @param Data 仪表盘配置数据
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。 
     * @return Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     * @param Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的日志主题。最大支持10个标签键值对，同一个资源只能绑定到同一个标签键下。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDashboardRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDashboardRequest(CreateDashboardRequest source) {
        if (source.DashboardName != null) {
            this.DashboardName = new String(source.DashboardName);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DashboardName", this.DashboardName);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

