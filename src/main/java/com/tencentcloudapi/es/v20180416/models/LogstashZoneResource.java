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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogstashZoneResource extends AbstractModel {

    /**
    * 可用区名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 是否可售
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 节点规格资源列表
    */
    @SerializedName("NodeTypeList")
    @Expose
    private LogstashNodeTypeResource [] NodeTypeList;

    /**
    * 可用节点机型族列表
    */
    @SerializedName("AvailNodeFamilies")
    @Expose
    private String [] AvailNodeFamilies;

    /**
     * Get 可用区名称 
     * @return ZoneName 可用区名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区名称
     * @param ZoneName 可用区名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 是否可售 
     * @return Available 是否可售
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set 是否可售
     * @param Available 是否可售
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get 节点规格资源列表 
     * @return NodeTypeList 节点规格资源列表
     */
    public LogstashNodeTypeResource [] getNodeTypeList() {
        return this.NodeTypeList;
    }

    /**
     * Set 节点规格资源列表
     * @param NodeTypeList 节点规格资源列表
     */
    public void setNodeTypeList(LogstashNodeTypeResource [] NodeTypeList) {
        this.NodeTypeList = NodeTypeList;
    }

    /**
     * Get 可用节点机型族列表 
     * @return AvailNodeFamilies 可用节点机型族列表
     */
    public String [] getAvailNodeFamilies() {
        return this.AvailNodeFamilies;
    }

    /**
     * Set 可用节点机型族列表
     * @param AvailNodeFamilies 可用节点机型族列表
     */
    public void setAvailNodeFamilies(String [] AvailNodeFamilies) {
        this.AvailNodeFamilies = AvailNodeFamilies;
    }

    public LogstashZoneResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogstashZoneResource(LogstashZoneResource source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.NodeTypeList != null) {
            this.NodeTypeList = new LogstashNodeTypeResource[source.NodeTypeList.length];
            for (int i = 0; i < source.NodeTypeList.length; i++) {
                this.NodeTypeList[i] = new LogstashNodeTypeResource(source.NodeTypeList[i]);
            }
        }
        if (source.AvailNodeFamilies != null) {
            this.AvailNodeFamilies = new String[source.AvailNodeFamilies.length];
            for (int i = 0; i < source.AvailNodeFamilies.length; i++) {
                this.AvailNodeFamilies[i] = new String(source.AvailNodeFamilies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamArrayObj(map, prefix + "NodeTypeList.", this.NodeTypeList);
        this.setParamArraySimple(map, prefix + "AvailNodeFamilies.", this.AvailNodeFamilies);

    }
}

