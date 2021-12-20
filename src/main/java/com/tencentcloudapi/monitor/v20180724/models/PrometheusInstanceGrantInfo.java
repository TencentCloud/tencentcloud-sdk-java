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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstanceGrantInfo extends AbstractModel{

    /**
    * 是否有计费操作权限(1=有，2=无)
    */
    @SerializedName("HasChargeOperation")
    @Expose
    private Long HasChargeOperation;

    /**
    * 是否显示VPC信息的权限(1=有，2=无)
    */
    @SerializedName("HasVpcDisplay")
    @Expose
    private Long HasVpcDisplay;

    /**
    * 是否可修改Grafana的状态(1=有，2=无)
    */
    @SerializedName("HasGrafanaStatusChange")
    @Expose
    private Long HasGrafanaStatusChange;

    /**
    * 是否有管理agent的权限(1=有，2=无)
    */
    @SerializedName("HasAgentManage")
    @Expose
    private Long HasAgentManage;

    /**
    * 是否有管理TKE集成的权限(1=有，2=无)
    */
    @SerializedName("HasTkeManage")
    @Expose
    private Long HasTkeManage;

    /**
    * 是否显示API等信息(1=有, 2=无)
    */
    @SerializedName("HasApiOperation")
    @Expose
    private Long HasApiOperation;

    /**
     * Get 是否有计费操作权限(1=有，2=无) 
     * @return HasChargeOperation 是否有计费操作权限(1=有，2=无)
     */
    public Long getHasChargeOperation() {
        return this.HasChargeOperation;
    }

    /**
     * Set 是否有计费操作权限(1=有，2=无)
     * @param HasChargeOperation 是否有计费操作权限(1=有，2=无)
     */
    public void setHasChargeOperation(Long HasChargeOperation) {
        this.HasChargeOperation = HasChargeOperation;
    }

    /**
     * Get 是否显示VPC信息的权限(1=有，2=无) 
     * @return HasVpcDisplay 是否显示VPC信息的权限(1=有，2=无)
     */
    public Long getHasVpcDisplay() {
        return this.HasVpcDisplay;
    }

    /**
     * Set 是否显示VPC信息的权限(1=有，2=无)
     * @param HasVpcDisplay 是否显示VPC信息的权限(1=有，2=无)
     */
    public void setHasVpcDisplay(Long HasVpcDisplay) {
        this.HasVpcDisplay = HasVpcDisplay;
    }

    /**
     * Get 是否可修改Grafana的状态(1=有，2=无) 
     * @return HasGrafanaStatusChange 是否可修改Grafana的状态(1=有，2=无)
     */
    public Long getHasGrafanaStatusChange() {
        return this.HasGrafanaStatusChange;
    }

    /**
     * Set 是否可修改Grafana的状态(1=有，2=无)
     * @param HasGrafanaStatusChange 是否可修改Grafana的状态(1=有，2=无)
     */
    public void setHasGrafanaStatusChange(Long HasGrafanaStatusChange) {
        this.HasGrafanaStatusChange = HasGrafanaStatusChange;
    }

    /**
     * Get 是否有管理agent的权限(1=有，2=无) 
     * @return HasAgentManage 是否有管理agent的权限(1=有，2=无)
     */
    public Long getHasAgentManage() {
        return this.HasAgentManage;
    }

    /**
     * Set 是否有管理agent的权限(1=有，2=无)
     * @param HasAgentManage 是否有管理agent的权限(1=有，2=无)
     */
    public void setHasAgentManage(Long HasAgentManage) {
        this.HasAgentManage = HasAgentManage;
    }

    /**
     * Get 是否有管理TKE集成的权限(1=有，2=无) 
     * @return HasTkeManage 是否有管理TKE集成的权限(1=有，2=无)
     */
    public Long getHasTkeManage() {
        return this.HasTkeManage;
    }

    /**
     * Set 是否有管理TKE集成的权限(1=有，2=无)
     * @param HasTkeManage 是否有管理TKE集成的权限(1=有，2=无)
     */
    public void setHasTkeManage(Long HasTkeManage) {
        this.HasTkeManage = HasTkeManage;
    }

    /**
     * Get 是否显示API等信息(1=有, 2=无) 
     * @return HasApiOperation 是否显示API等信息(1=有, 2=无)
     */
    public Long getHasApiOperation() {
        return this.HasApiOperation;
    }

    /**
     * Set 是否显示API等信息(1=有, 2=无)
     * @param HasApiOperation 是否显示API等信息(1=有, 2=无)
     */
    public void setHasApiOperation(Long HasApiOperation) {
        this.HasApiOperation = HasApiOperation;
    }

    public PrometheusInstanceGrantInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstanceGrantInfo(PrometheusInstanceGrantInfo source) {
        if (source.HasChargeOperation != null) {
            this.HasChargeOperation = new Long(source.HasChargeOperation);
        }
        if (source.HasVpcDisplay != null) {
            this.HasVpcDisplay = new Long(source.HasVpcDisplay);
        }
        if (source.HasGrafanaStatusChange != null) {
            this.HasGrafanaStatusChange = new Long(source.HasGrafanaStatusChange);
        }
        if (source.HasAgentManage != null) {
            this.HasAgentManage = new Long(source.HasAgentManage);
        }
        if (source.HasTkeManage != null) {
            this.HasTkeManage = new Long(source.HasTkeManage);
        }
        if (source.HasApiOperation != null) {
            this.HasApiOperation = new Long(source.HasApiOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HasChargeOperation", this.HasChargeOperation);
        this.setParamSimple(map, prefix + "HasVpcDisplay", this.HasVpcDisplay);
        this.setParamSimple(map, prefix + "HasGrafanaStatusChange", this.HasGrafanaStatusChange);
        this.setParamSimple(map, prefix + "HasAgentManage", this.HasAgentManage);
        this.setParamSimple(map, prefix + "HasTkeManage", this.HasTkeManage);
        this.setParamSimple(map, prefix + "HasApiOperation", this.HasApiOperation);

    }
}

