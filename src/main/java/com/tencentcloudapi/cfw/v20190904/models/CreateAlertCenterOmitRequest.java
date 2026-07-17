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
    * <p>处置对象,ID列表，  IdLists和IpList二选一</p>
    */
    @SerializedName("HandleIdList")
    @Expose
    private String [] HandleIdList;

    /**
    * <p>忽略数据来源：<br>AlertTable 告警中心  InterceptionTable拦截列表</p>
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * <p>处置对象,事件ID列表</p>
    */
    @SerializedName("HandleEventIdList")
    @Expose
    private String [] HandleEventIdList;

    /**
     * Get <p>处置对象,ID列表，  IdLists和IpList二选一</p> 
     * @return HandleIdList <p>处置对象,ID列表，  IdLists和IpList二选一</p>
     */
    public String [] getHandleIdList() {
        return this.HandleIdList;
    }

    /**
     * Set <p>处置对象,ID列表，  IdLists和IpList二选一</p>
     * @param HandleIdList <p>处置对象,ID列表，  IdLists和IpList二选一</p>
     */
    public void setHandleIdList(String [] HandleIdList) {
        this.HandleIdList = HandleIdList;
    }

    /**
     * Get <p>忽略数据来源：<br>AlertTable 告警中心  InterceptionTable拦截列表</p> 
     * @return TableType <p>忽略数据来源：<br>AlertTable 告警中心  InterceptionTable拦截列表</p>
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set <p>忽略数据来源：<br>AlertTable 告警中心  InterceptionTable拦截列表</p>
     * @param TableType <p>忽略数据来源：<br>AlertTable 告警中心  InterceptionTable拦截列表</p>
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul> 
     * @return CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     * @param CfwAiAgentOperationSource <p>AI操作来源</p><p>枚举值：</p><ul><li>console： 控制台来源值</li><li>wechat： 微信</li></ul>
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get <p>处置对象,事件ID列表</p> 
     * @return HandleEventIdList <p>处置对象,事件ID列表</p>
     */
    public String [] getHandleEventIdList() {
        return this.HandleEventIdList;
    }

    /**
     * Set <p>处置对象,事件ID列表</p>
     * @param HandleEventIdList <p>处置对象,事件ID列表</p>
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

