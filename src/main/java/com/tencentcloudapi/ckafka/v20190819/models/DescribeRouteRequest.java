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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRouteRequest extends AbstractModel {

    /**
    * <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>路由Id</p>
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * <p>是否显示主路由，true时会在返回原路由列表的基础上,再额外展示实例创建时的主路由信息(且不被InternalFlag/UsedFor等参数过滤影响)</p>
    */
    @SerializedName("MainRouteFlag")
    @Expose
    private Boolean MainRouteFlag;

    /**
     * Get <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p> 
     * @return InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     * @param InstanceId <p>ckafka集群实例Id</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/40835">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>路由Id</p> 
     * @return RouteId <p>路由Id</p>
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>路由Id</p>
     * @param RouteId <p>路由Id</p>
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>是否显示主路由，true时会在返回原路由列表的基础上,再额外展示实例创建时的主路由信息(且不被InternalFlag/UsedFor等参数过滤影响)</p> 
     * @return MainRouteFlag <p>是否显示主路由，true时会在返回原路由列表的基础上,再额外展示实例创建时的主路由信息(且不被InternalFlag/UsedFor等参数过滤影响)</p>
     */
    public Boolean getMainRouteFlag() {
        return this.MainRouteFlag;
    }

    /**
     * Set <p>是否显示主路由，true时会在返回原路由列表的基础上,再额外展示实例创建时的主路由信息(且不被InternalFlag/UsedFor等参数过滤影响)</p>
     * @param MainRouteFlag <p>是否显示主路由，true时会在返回原路由列表的基础上,再额外展示实例创建时的主路由信息(且不被InternalFlag/UsedFor等参数过滤影响)</p>
     */
    public void setMainRouteFlag(Boolean MainRouteFlag) {
        this.MainRouteFlag = MainRouteFlag;
    }

    public DescribeRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteRequest(DescribeRouteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.MainRouteFlag != null) {
            this.MainRouteFlag = new Boolean(source.MainRouteFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "MainRouteFlag", this.MainRouteFlag);

    }
}

