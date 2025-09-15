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

public class DeleteRouteRequest extends AbstractModel {

    /**
    * ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 路由id,可通过[DescribeRoute](https://cloud.tencent.com/document/product/597/45484)接口获取
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * 调用方appId
    */
    @SerializedName("CallerAppid")
    @Expose
    private Long CallerAppid;

    /**
    * 设置定时删除路由时间,仅类型为公网路由支持定时删除,可选择未来的24小时的任意时间
    */
    @SerializedName("DeleteRouteTime")
    @Expose
    private String DeleteRouteTime;

    /**
     * Get ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取 
     * @return InstanceId ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     * @param InstanceId ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 路由id,可通过[DescribeRoute](https://cloud.tencent.com/document/product/597/45484)接口获取 
     * @return RouteId 路由id,可通过[DescribeRoute](https://cloud.tencent.com/document/product/597/45484)接口获取
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 路由id,可通过[DescribeRoute](https://cloud.tencent.com/document/product/597/45484)接口获取
     * @param RouteId 路由id,可通过[DescribeRoute](https://cloud.tencent.com/document/product/597/45484)接口获取
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get 调用方appId 
     * @return CallerAppid 调用方appId
     */
    public Long getCallerAppid() {
        return this.CallerAppid;
    }

    /**
     * Set 调用方appId
     * @param CallerAppid 调用方appId
     */
    public void setCallerAppid(Long CallerAppid) {
        this.CallerAppid = CallerAppid;
    }

    /**
     * Get 设置定时删除路由时间,仅类型为公网路由支持定时删除,可选择未来的24小时的任意时间 
     * @return DeleteRouteTime 设置定时删除路由时间,仅类型为公网路由支持定时删除,可选择未来的24小时的任意时间
     */
    public String getDeleteRouteTime() {
        return this.DeleteRouteTime;
    }

    /**
     * Set 设置定时删除路由时间,仅类型为公网路由支持定时删除,可选择未来的24小时的任意时间
     * @param DeleteRouteTime 设置定时删除路由时间,仅类型为公网路由支持定时删除,可选择未来的24小时的任意时间
     */
    public void setDeleteRouteTime(String DeleteRouteTime) {
        this.DeleteRouteTime = DeleteRouteTime;
    }

    public DeleteRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRouteRequest(DeleteRouteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
        if (source.CallerAppid != null) {
            this.CallerAppid = new Long(source.CallerAppid);
        }
        if (source.DeleteRouteTime != null) {
            this.DeleteRouteTime = new String(source.DeleteRouteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "CallerAppid", this.CallerAppid);
        this.setParamSimple(map, prefix + "DeleteRouteTime", this.DeleteRouteTime);

    }
}

