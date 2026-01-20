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
package com.tencentcloudapi.evt.v20250217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutEventRequest extends AbstractModel {

    /**
    * <p>插件ID</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>需要推送的事件数据内容，格式为json，字段定义需要与事件中的定义一致</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * <p>数据推送来源，会在生成的单据中展示数据来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>可以接受当前消息的Uin</p>
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
     * Get <p>插件ID</p> 
     * @return PluginId <p>插件ID</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>插件ID</p>
     * @param PluginId <p>插件ID</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>需要推送的事件数据内容，格式为json，字段定义需要与事件中的定义一致</p> 
     * @return Data <p>需要推送的事件数据内容，格式为json，字段定义需要与事件中的定义一致</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>需要推送的事件数据内容，格式为json，字段定义需要与事件中的定义一致</p>
     * @param Data <p>需要推送的事件数据内容，格式为json，字段定义需要与事件中的定义一致</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get <p>数据推送来源，会在生成的单据中展示数据来源</p> 
     * @return Source <p>数据推送来源，会在生成的单据中展示数据来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>数据推送来源，会在生成的单据中展示数据来源</p>
     * @param Source <p>数据推送来源，会在生成的单据中展示数据来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>可以接受当前消息的Uin</p> 
     * @return TargetUin <p>可以接受当前消息的Uin</p>
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set <p>可以接受当前消息的Uin</p>
     * @param TargetUin <p>可以接受当前消息的Uin</p>
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    public PutEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutEventRequest(PutEventRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);

    }
}

