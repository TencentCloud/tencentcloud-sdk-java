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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlertCenterOmitRequest extends AbstractModel {

    /**
    * 处置对象,ID列表，  IdLists和IpList二选一
    */
    @SerializedName("HandleIdList")
    @Expose
    private String [] HandleIdList;

    /**
    * 忽略数据来源：
AlertTable 告警中心  InterceptionTable拦截列表
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 处置对象,事件ID列表
    */
    @SerializedName("HandleEventIdList")
    @Expose
    private String [] HandleEventIdList;

    /**
     * Get 处置对象,ID列表，  IdLists和IpList二选一 
     * @return HandleIdList 处置对象,ID列表，  IdLists和IpList二选一
     */
    public String [] getHandleIdList() {
        return this.HandleIdList;
    }

    /**
     * Set 处置对象,ID列表，  IdLists和IpList二选一
     * @param HandleIdList 处置对象,ID列表，  IdLists和IpList二选一
     */
    public void setHandleIdList(String [] HandleIdList) {
        this.HandleIdList = HandleIdList;
    }

    /**
     * Get 忽略数据来源：
AlertTable 告警中心  InterceptionTable拦截列表 
     * @return TableType 忽略数据来源：
AlertTable 告警中心  InterceptionTable拦截列表
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 忽略数据来源：
AlertTable 告警中心  InterceptionTable拦截列表
     * @param TableType 忽略数据来源：
AlertTable 告警中心  InterceptionTable拦截列表
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 处置对象,事件ID列表 
     * @return HandleEventIdList 处置对象,事件ID列表
     */
    public String [] getHandleEventIdList() {
        return this.HandleEventIdList;
    }

    /**
     * Set 处置对象,事件ID列表
     * @param HandleEventIdList 处置对象,事件ID列表
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
        this.setParamArraySimple(map, prefix + "HandleEventIdList.", this.HandleEventIdList);

    }
}

