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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GAAPInstanceDetail extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 监听器列表
    */
    @SerializedName("ListenerList")
    @Expose
    private GAAPListenerDetail [] ListenerList;

    /**
    * 加速实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 监听器列表 
     * @return ListenerList 监听器列表
     */
    public GAAPListenerDetail [] getListenerList() {
        return this.ListenerList;
    }

    /**
     * Set 监听器列表
     * @param ListenerList 监听器列表
     */
    public void setListenerList(GAAPListenerDetail [] ListenerList) {
        this.ListenerList = ListenerList;
    }

    /**
     * Get 加速实例名称 
     * @return InstanceName 加速实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 加速实例名称
     * @param InstanceName 加速实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public GAAPInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GAAPInstanceDetail(GAAPInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ListenerList != null) {
            this.ListenerList = new GAAPListenerDetail[source.ListenerList.length];
            for (int i = 0; i < source.ListenerList.length; i++) {
                this.ListenerList[i] = new GAAPListenerDetail(source.ListenerList[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ListenerList.", this.ListenerList);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

