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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlertCenterOmitRequest extends AbstractModel {

    /**
    * <p>直接处置的记录 ID 列表，公共请求结构要求提供。TableType=AlertTable 时元素为告警日志 logid；TableType=InterceptionTable 时元素为拦截记录 unique_id。处理时会与 HandleEventIdList 解析出的日志 ID 合并，再删除空字符串并去重；因此仅按聚合事件处置时可传 [""] 作为空占位。HandleIdList 与 HandleEventIdList 不能同时为空。</p>
    */
    @SerializedName("HandleIdList")
    @Expose
    private String [] HandleIdList;

    /**
    * <p>必填的忽略数据来源，只接受 AlertTable 或 InterceptionTable。AlertTable 更新租户告警表中 logid 命中的记录；InterceptionTable 更新租户拦截表中 unique_id 命中的记录。字段没有默认值，缺失、空字符串或其它值均返回参数错误。</p>
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>可选的告警聚合事件 ID 列表。处理时逐个事件 ID 查询其对应的告警日志 logid，并将查询结果并入 HandleIdList；无法解析的事件 ID 不会产生目标 ID。该解析不会改写 TableType：若 TableType=InterceptionTable，解析出的 logid 仍会作为 unique_id 查询拦截表。字段可省略或传空数组，但 HandleIdList 与本字段不能同时为空；若最终合并、去空和去重后没有目标 ID，业务状态为失败。</p>
    */
    @SerializedName("HandleEventIdList")
    @Expose
    private String [] HandleEventIdList;

    /**
     * Get <p>直接处置的记录 ID 列表，公共请求结构要求提供。TableType=AlertTable 时元素为告警日志 logid；TableType=InterceptionTable 时元素为拦截记录 unique_id。处理时会与 HandleEventIdList 解析出的日志 ID 合并，再删除空字符串并去重；因此仅按聚合事件处置时可传 [""] 作为空占位。HandleIdList 与 HandleEventIdList 不能同时为空。</p> 
     * @return HandleIdList <p>直接处置的记录 ID 列表，公共请求结构要求提供。TableType=AlertTable 时元素为告警日志 logid；TableType=InterceptionTable 时元素为拦截记录 unique_id。处理时会与 HandleEventIdList 解析出的日志 ID 合并，再删除空字符串并去重；因此仅按聚合事件处置时可传 [""] 作为空占位。HandleIdList 与 HandleEventIdList 不能同时为空。</p>
     */
    public String [] getHandleIdList() {
        return this.HandleIdList;
    }

    /**
     * Set <p>直接处置的记录 ID 列表，公共请求结构要求提供。TableType=AlertTable 时元素为告警日志 logid；TableType=InterceptionTable 时元素为拦截记录 unique_id。处理时会与 HandleEventIdList 解析出的日志 ID 合并，再删除空字符串并去重；因此仅按聚合事件处置时可传 [""] 作为空占位。HandleIdList 与 HandleEventIdList 不能同时为空。</p>
     * @param HandleIdList <p>直接处置的记录 ID 列表，公共请求结构要求提供。TableType=AlertTable 时元素为告警日志 logid；TableType=InterceptionTable 时元素为拦截记录 unique_id。处理时会与 HandleEventIdList 解析出的日志 ID 合并，再删除空字符串并去重；因此仅按聚合事件处置时可传 [""] 作为空占位。HandleIdList 与 HandleEventIdList 不能同时为空。</p>
     */
    public void setHandleIdList(String [] HandleIdList) {
        this.HandleIdList = HandleIdList;
    }

    /**
     * Get <p>必填的忽略数据来源，只接受 AlertTable 或 InterceptionTable。AlertTable 更新租户告警表中 logid 命中的记录；InterceptionTable 更新租户拦截表中 unique_id 命中的记录。字段没有默认值，缺失、空字符串或其它值均返回参数错误。</p> 
     * @return TableType <p>必填的忽略数据来源，只接受 AlertTable 或 InterceptionTable。AlertTable 更新租户告警表中 logid 命中的记录；InterceptionTable 更新租户拦截表中 unique_id 命中的记录。字段没有默认值，缺失、空字符串或其它值均返回参数错误。</p>
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set <p>必填的忽略数据来源，只接受 AlertTable 或 InterceptionTable。AlertTable 更新租户告警表中 logid 命中的记录；InterceptionTable 更新租户拦截表中 unique_id 命中的记录。字段没有默认值，缺失、空字符串或其它值均返回参数错误。</p>
     * @param TableType <p>必填的忽略数据来源，只接受 AlertTable 或 InterceptionTable。AlertTable 更新租户告警表中 logid 命中的记录；InterceptionTable 更新租户拦截表中 unique_id 命中的记录。字段没有默认值，缺失、空字符串或其它值均返回参数错误。</p>
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>。
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get <p>可选的告警聚合事件 ID 列表。处理时逐个事件 ID 查询其对应的告警日志 logid，并将查询结果并入 HandleIdList；无法解析的事件 ID 不会产生目标 ID。该解析不会改写 TableType：若 TableType=InterceptionTable，解析出的 logid 仍会作为 unique_id 查询拦截表。字段可省略或传空数组，但 HandleIdList 与本字段不能同时为空；若最终合并、去空和去重后没有目标 ID，业务状态为失败。</p> 
     * @return HandleEventIdList <p>可选的告警聚合事件 ID 列表。处理时逐个事件 ID 查询其对应的告警日志 logid，并将查询结果并入 HandleIdList；无法解析的事件 ID 不会产生目标 ID。该解析不会改写 TableType：若 TableType=InterceptionTable，解析出的 logid 仍会作为 unique_id 查询拦截表。字段可省略或传空数组，但 HandleIdList 与本字段不能同时为空；若最终合并、去空和去重后没有目标 ID，业务状态为失败。</p>
     */
    public String [] getHandleEventIdList() {
        return this.HandleEventIdList;
    }

    /**
     * Set <p>可选的告警聚合事件 ID 列表。处理时逐个事件 ID 查询其对应的告警日志 logid，并将查询结果并入 HandleIdList；无法解析的事件 ID 不会产生目标 ID。该解析不会改写 TableType：若 TableType=InterceptionTable，解析出的 logid 仍会作为 unique_id 查询拦截表。字段可省略或传空数组，但 HandleIdList 与本字段不能同时为空；若最终合并、去空和去重后没有目标 ID，业务状态为失败。</p>
     * @param HandleEventIdList <p>可选的告警聚合事件 ID 列表。处理时逐个事件 ID 查询其对应的告警日志 logid，并将查询结果并入 HandleIdList；无法解析的事件 ID 不会产生目标 ID。该解析不会改写 TableType：若 TableType=InterceptionTable，解析出的 logid 仍会作为 unique_id 查询拦截表。字段可省略或传空数组，但 HandleIdList 与本字段不能同时为空；若最终合并、去空和去重后没有目标 ID，业务状态为失败。</p>
     */
    public void setHandleEventIdList(String [] HandleEventIdList) {
        this.HandleEventIdList = HandleEventIdList;
    }

    public CreateAlertCenterOmitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertCenterOmitRequest(CreateAlertCenterOmitRequest source) {
        if (source.HandleIdList != null) {
            this.HandleIdList = new String[source.HandleIdList.length];
            for (int i = 0; i < source.HandleIdList.length; i++) {
                this.HandleIdList[i] = new String(source.HandleIdList[i]);
            }
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.HandleEventIdList != null) {
            this.HandleEventIdList = new String[source.HandleEventIdList.length];
            for (int i = 0; i < source.HandleEventIdList.length; i++) {
                this.HandleEventIdList[i] = new String(source.HandleEventIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HandleIdList.", this.HandleIdList);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamArraySimple(map, prefix + "HandleEventIdList.", this.HandleEventIdList);

    }
}

