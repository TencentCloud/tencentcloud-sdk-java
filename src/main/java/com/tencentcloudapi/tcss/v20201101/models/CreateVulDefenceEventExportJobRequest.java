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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulDefenceEventExportJobRequest extends AbstractModel {

    /**
    * 过滤条件。
<li>Status- String - 是否必填：否 - 插件状态，待处理：EVENT_UNDEAL，EVENT_DEALED：已处理，已忽略：EVENT_IGNORE， EVENT_DEFENDED：已防御</li>
<li>ContainerStatus- String - 是否必填：否 - 容器运行状态筛选，已创建：CREATED,正常运行：RUNNING, 暂定运行：PAUSED, 停止运行：	STOPPED，重启中：RESTARTING, 迁移中：REMOVING, 销毁：DESTROYED </li>
<li>ContainerNetStatus- String -是否必填: 否 -  容器网络状态筛选 未隔离：NORMAL，已隔离：ISOLATED，隔离失败：ISOLATE_FAILED，解除隔离失败：RESTORE_FAILED，解除隔离中：RESTORING，隔离中：ISOLATING</li>
<li>EventType - String -是否必填: 否 -  入侵状态，防御成功：EVENT_DEFENDED，尝试攻击：EVENT_ATTACK </li>
<li>TimeRange- String -是否必填: 否 -  时间范围，第一个值表示开始时间，第二个值表示结束时间 </li>
<li>VulName- string - 是否必填：否 - 漏洞名称。</li>
<li>CVEID- string - 是否必填：否 - CVE编号。</li>
<li>SourceIP- string - 是否必填：否 - 攻击源IP。</li>
<li>ContainerName- string - 是否必填：否 - 容器名称。</li>
<li>ContainerID- string - 是否必填：否 - 容器ID。</li>
<li>ImageName- string - 是否必填：否 - 镜像名称。</li>
<li>ImageID- string - 是否必填：否 - 镜像ID。</li>
<li>HostName- string - 是否必填：否 - 主机名称。</li>
<li>HostIP- string - 是否必填：否 - 内网IP。</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * 需要返回的数量，最大值为100000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序方式：asc/desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段：事件数量：EventCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 过滤条件。
<li>Status- String - 是否必填：否 - 插件状态，待处理：EVENT_UNDEAL，EVENT_DEALED：已处理，已忽略：EVENT_IGNORE， EVENT_DEFENDED：已防御</li>
<li>ContainerStatus- String - 是否必填：否 - 容器运行状态筛选，已创建：CREATED,正常运行：RUNNING, 暂定运行：PAUSED, 停止运行：	STOPPED，重启中：RESTARTING, 迁移中：REMOVING, 销毁：DESTROYED </li>
<li>ContainerNetStatus- String -是否必填: 否 -  容器网络状态筛选 未隔离：NORMAL，已隔离：ISOLATED，隔离失败：ISOLATE_FAILED，解除隔离失败：RESTORE_FAILED，解除隔离中：RESTORING，隔离中：ISOLATING</li>
<li>EventType - String -是否必填: 否 -  入侵状态，防御成功：EVENT_DEFENDED，尝试攻击：EVENT_ATTACK </li>
<li>TimeRange- String -是否必填: 否 -  时间范围，第一个值表示开始时间，第二个值表示结束时间 </li>
<li>VulName- string - 是否必填：否 - 漏洞名称。</li>
<li>CVEID- string - 是否必填：否 - CVE编号。</li>
<li>SourceIP- string - 是否必填：否 - 攻击源IP。</li>
<li>ContainerName- string - 是否必填：否 - 容器名称。</li>
<li>ContainerID- string - 是否必填：否 - 容器ID。</li>
<li>ImageName- string - 是否必填：否 - 镜像名称。</li>
<li>ImageID- string - 是否必填：否 - 镜像ID。</li>
<li>HostName- string - 是否必填：否 - 主机名称。</li>
<li>HostIP- string - 是否必填：否 - 内网IP。</li> 
     * @return Filters 过滤条件。
<li>Status- String - 是否必填：否 - 插件状态，待处理：EVENT_UNDEAL，EVENT_DEALED：已处理，已忽略：EVENT_IGNORE， EVENT_DEFENDED：已防御</li>
<li>ContainerStatus- String - 是否必填：否 - 容器运行状态筛选，已创建：CREATED,正常运行：RUNNING, 暂定运行：PAUSED, 停止运行：	STOPPED，重启中：RESTARTING, 迁移中：REMOVING, 销毁：DESTROYED </li>
<li>ContainerNetStatus- String -是否必填: 否 -  容器网络状态筛选 未隔离：NORMAL，已隔离：ISOLATED，隔离失败：ISOLATE_FAILED，解除隔离失败：RESTORE_FAILED，解除隔离中：RESTORING，隔离中：ISOLATING</li>
<li>EventType - String -是否必填: 否 -  入侵状态，防御成功：EVENT_DEFENDED，尝试攻击：EVENT_ATTACK </li>
<li>TimeRange- String -是否必填: 否 -  时间范围，第一个值表示开始时间，第二个值表示结束时间 </li>
<li>VulName- string - 是否必填：否 - 漏洞名称。</li>
<li>CVEID- string - 是否必填：否 - CVE编号。</li>
<li>SourceIP- string - 是否必填：否 - 攻击源IP。</li>
<li>ContainerName- string - 是否必填：否 - 容器名称。</li>
<li>ContainerID- string - 是否必填：否 - 容器ID。</li>
<li>ImageName- string - 是否必填：否 - 镜像名称。</li>
<li>ImageID- string - 是否必填：否 - 镜像ID。</li>
<li>HostName- string - 是否必填：否 - 主机名称。</li>
<li>HostIP- string - 是否必填：否 - 内网IP。</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Status- String - 是否必填：否 - 插件状态，待处理：EVENT_UNDEAL，EVENT_DEALED：已处理，已忽略：EVENT_IGNORE， EVENT_DEFENDED：已防御</li>
<li>ContainerStatus- String - 是否必填：否 - 容器运行状态筛选，已创建：CREATED,正常运行：RUNNING, 暂定运行：PAUSED, 停止运行：	STOPPED，重启中：RESTARTING, 迁移中：REMOVING, 销毁：DESTROYED </li>
<li>ContainerNetStatus- String -是否必填: 否 -  容器网络状态筛选 未隔离：NORMAL，已隔离：ISOLATED，隔离失败：ISOLATE_FAILED，解除隔离失败：RESTORE_FAILED，解除隔离中：RESTORING，隔离中：ISOLATING</li>
<li>EventType - String -是否必填: 否 -  入侵状态，防御成功：EVENT_DEFENDED，尝试攻击：EVENT_ATTACK </li>
<li>TimeRange- String -是否必填: 否 -  时间范围，第一个值表示开始时间，第二个值表示结束时间 </li>
<li>VulName- string - 是否必填：否 - 漏洞名称。</li>
<li>CVEID- string - 是否必填：否 - CVE编号。</li>
<li>SourceIP- string - 是否必填：否 - 攻击源IP。</li>
<li>ContainerName- string - 是否必填：否 - 容器名称。</li>
<li>ContainerID- string - 是否必填：否 - 容器ID。</li>
<li>ImageName- string - 是否必填：否 - 镜像名称。</li>
<li>ImageID- string - 是否必填：否 - 镜像ID。</li>
<li>HostName- string - 是否必填：否 - 主机名称。</li>
<li>HostIP- string - 是否必填：否 - 内网IP。</li>
     * @param Filters 过滤条件。
<li>Status- String - 是否必填：否 - 插件状态，待处理：EVENT_UNDEAL，EVENT_DEALED：已处理，已忽略：EVENT_IGNORE， EVENT_DEFENDED：已防御</li>
<li>ContainerStatus- String - 是否必填：否 - 容器运行状态筛选，已创建：CREATED,正常运行：RUNNING, 暂定运行：PAUSED, 停止运行：	STOPPED，重启中：RESTARTING, 迁移中：REMOVING, 销毁：DESTROYED </li>
<li>ContainerNetStatus- String -是否必填: 否 -  容器网络状态筛选 未隔离：NORMAL，已隔离：ISOLATED，隔离失败：ISOLATE_FAILED，解除隔离失败：RESTORE_FAILED，解除隔离中：RESTORING，隔离中：ISOLATING</li>
<li>EventType - String -是否必填: 否 -  入侵状态，防御成功：EVENT_DEFENDED，尝试攻击：EVENT_ATTACK </li>
<li>TimeRange- String -是否必填: 否 -  时间范围，第一个值表示开始时间，第二个值表示结束时间 </li>
<li>VulName- string - 是否必填：否 - 漏洞名称。</li>
<li>CVEID- string - 是否必填：否 - CVE编号。</li>
<li>SourceIP- string - 是否必填：否 - 攻击源IP。</li>
<li>ContainerName- string - 是否必填：否 - 容器名称。</li>
<li>ContainerID- string - 是否必填：否 - 容器ID。</li>
<li>ImageName- string - 是否必填：否 - 镜像名称。</li>
<li>ImageID- string - 是否必填：否 - 镜像ID。</li>
<li>HostName- string - 是否必填：否 - 主机名称。</li>
<li>HostIP- string - 是否必填：否 - 内网IP。</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 需要返回的数量，最大值为100000 
     * @return Limit 需要返回的数量，最大值为100000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，最大值为100000
     * @param Limit 需要返回的数量，最大值为100000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序方式：asc/desc 
     * @return Order 排序方式：asc/desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式：asc/desc
     * @param Order 排序方式：asc/desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段：事件数量：EventCount 
     * @return By 排序字段：事件数量：EventCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段：事件数量：EventCount
     * @param By 排序字段：事件数量：EventCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    public CreateVulDefenceEventExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulDefenceEventExportJobRequest(CreateVulDefenceEventExportJobRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

