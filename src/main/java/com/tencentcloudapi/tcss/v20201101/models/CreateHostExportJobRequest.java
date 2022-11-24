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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHostExportJobRequest extends AbstractModel{

    /**
    * 过滤条件。
<li>Status - String - 是否必填：否 - agent状态筛选，"ALL":"全部"(或不传该字段),"UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中"</li>
<li>HostName - String - 是否必填：否 - 主机名筛选</li>
<li>Group- String - 是否必填：否 - 主机群组搜索</li>
<li>HostIP- string - 是否必填：否 - 主机ip搜索</li>
<li>HostID- string - 是否必填：否 - 主机id搜索</li>
<li>DockerVersion- string - 是否必填：否 - docker版本搜索</li>
<li>MachineType- string - 是否必填：否 - 主机来源MachineType搜索，"ALL":"全部"(或不传该字段),主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器；</li>
<li>DockerStatus- string - 是否必填：否 - docker安装状态，"ALL":"全部"(或不传该字段),"INSTALL":"已安装","UNINSTALL":"未安装"</li>
<li>ProjectID- string - 是否必填：否 - 所属项目id搜索</li>
<li>Tag:xxx(tag:key)- string- 是否必填：否 - 标签键值搜索 示例Filters":[{"Name":"tag:tke-kind","Values":["service"]}]</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 需要返回的数量，默认为10，最大值为10000
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 升序降序,asc desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 导出字段
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
     * Get 过滤条件。
<li>Status - String - 是否必填：否 - agent状态筛选，"ALL":"全部"(或不传该字段),"UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中"</li>
<li>HostName - String - 是否必填：否 - 主机名筛选</li>
<li>Group- String - 是否必填：否 - 主机群组搜索</li>
<li>HostIP- string - 是否必填：否 - 主机ip搜索</li>
<li>HostID- string - 是否必填：否 - 主机id搜索</li>
<li>DockerVersion- string - 是否必填：否 - docker版本搜索</li>
<li>MachineType- string - 是否必填：否 - 主机来源MachineType搜索，"ALL":"全部"(或不传该字段),主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器；</li>
<li>DockerStatus- string - 是否必填：否 - docker安装状态，"ALL":"全部"(或不传该字段),"INSTALL":"已安装","UNINSTALL":"未安装"</li>
<li>ProjectID- string - 是否必填：否 - 所属项目id搜索</li>
<li>Tag:xxx(tag:key)- string- 是否必填：否 - 标签键值搜索 示例Filters":[{"Name":"tag:tke-kind","Values":["service"]}]</li> 
     * @return Filters 过滤条件。
<li>Status - String - 是否必填：否 - agent状态筛选，"ALL":"全部"(或不传该字段),"UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中"</li>
<li>HostName - String - 是否必填：否 - 主机名筛选</li>
<li>Group- String - 是否必填：否 - 主机群组搜索</li>
<li>HostIP- string - 是否必填：否 - 主机ip搜索</li>
<li>HostID- string - 是否必填：否 - 主机id搜索</li>
<li>DockerVersion- string - 是否必填：否 - docker版本搜索</li>
<li>MachineType- string - 是否必填：否 - 主机来源MachineType搜索，"ALL":"全部"(或不传该字段),主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器；</li>
<li>DockerStatus- string - 是否必填：否 - docker安装状态，"ALL":"全部"(或不传该字段),"INSTALL":"已安装","UNINSTALL":"未安装"</li>
<li>ProjectID- string - 是否必填：否 - 所属项目id搜索</li>
<li>Tag:xxx(tag:key)- string- 是否必填：否 - 标签键值搜索 示例Filters":[{"Name":"tag:tke-kind","Values":["service"]}]</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Status - String - 是否必填：否 - agent状态筛选，"ALL":"全部"(或不传该字段),"UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中"</li>
<li>HostName - String - 是否必填：否 - 主机名筛选</li>
<li>Group- String - 是否必填：否 - 主机群组搜索</li>
<li>HostIP- string - 是否必填：否 - 主机ip搜索</li>
<li>HostID- string - 是否必填：否 - 主机id搜索</li>
<li>DockerVersion- string - 是否必填：否 - docker版本搜索</li>
<li>MachineType- string - 是否必填：否 - 主机来源MachineType搜索，"ALL":"全部"(或不传该字段),主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器；</li>
<li>DockerStatus- string - 是否必填：否 - docker安装状态，"ALL":"全部"(或不传该字段),"INSTALL":"已安装","UNINSTALL":"未安装"</li>
<li>ProjectID- string - 是否必填：否 - 所属项目id搜索</li>
<li>Tag:xxx(tag:key)- string- 是否必填：否 - 标签键值搜索 示例Filters":[{"Name":"tag:tke-kind","Values":["service"]}]</li>
     * @param Filters 过滤条件。
<li>Status - String - 是否必填：否 - agent状态筛选，"ALL":"全部"(或不传该字段),"UNINSTALL"："未安装","OFFLINE"："离线", "ONLINE"："防护中"</li>
<li>HostName - String - 是否必填：否 - 主机名筛选</li>
<li>Group- String - 是否必填：否 - 主机群组搜索</li>
<li>HostIP- string - 是否必填：否 - 主机ip搜索</li>
<li>HostID- string - 是否必填：否 - 主机id搜索</li>
<li>DockerVersion- string - 是否必填：否 - docker版本搜索</li>
<li>MachineType- string - 是否必填：否 - 主机来源MachineType搜索，"ALL":"全部"(或不传该字段),主机来源：["CVM", "ECM", "LH", "BM"]  中的之一为腾讯云服务器；["Other"]之一非腾讯云服务器；</li>
<li>DockerStatus- string - 是否必填：否 - docker安装状态，"ALL":"全部"(或不传该字段),"INSTALL":"已安装","UNINSTALL":"未安装"</li>
<li>ProjectID- string - 是否必填：否 - 所属项目id搜索</li>
<li>Tag:xxx(tag:key)- string- 是否必填：否 - 标签键值搜索 示例Filters":[{"Name":"tag:tke-kind","Values":["service"]}]</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Limit 偏移量，默认为0。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Limit 偏移量，默认为0。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 需要返回的数量，默认为10，最大值为10000 
     * @return Offset 需要返回的数量，默认为10，最大值为10000
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为10000
     * @param Offset 需要返回的数量，默认为10，最大值为10000
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 升序降序,asc desc 
     * @return Order 升序降序,asc desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 升序降序,asc desc
     * @param Order 升序降序,asc desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 导出字段 
     * @return ExportField 导出字段
     */
    public String [] getExportField() {
        return this.ExportField;
    }

    /**
     * Set 导出字段
     * @param ExportField 导出字段
     */
    public void setExportField(String [] ExportField) {
        this.ExportField = ExportField;
    }

    public CreateHostExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHostExportJobRequest(CreateHostExportJobRequest source) {
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);

    }
}

