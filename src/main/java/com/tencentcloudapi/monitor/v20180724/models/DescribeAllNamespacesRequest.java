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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllNamespacesRequest extends AbstractModel {

    /**
    * 根据使用场景过滤 目前仅有"ST_ALARM"=告警类型
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 根据监控类型过滤 不填默认查所有类型 "MT_QCE"=云产品监控
    */
    @SerializedName("MonitorTypes")
    @Expose
    private String [] MonitorTypes;

    /**
    * 根据namespace的Id过滤 不填默认查询所有
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
     * Get 根据使用场景过滤 目前仅有"ST_ALARM"=告警类型 
     * @return SceneType 根据使用场景过滤 目前仅有"ST_ALARM"=告警类型
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 根据使用场景过滤 目前仅有"ST_ALARM"=告警类型
     * @param SceneType 根据使用场景过滤 目前仅有"ST_ALARM"=告警类型
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 根据监控类型过滤 不填默认查所有类型 "MT_QCE"=云产品监控 
     * @return MonitorTypes 根据监控类型过滤 不填默认查所有类型 "MT_QCE"=云产品监控
     */
    public String [] getMonitorTypes() {
        return this.MonitorTypes;
    }

    /**
     * Set 根据监控类型过滤 不填默认查所有类型 "MT_QCE"=云产品监控
     * @param MonitorTypes 根据监控类型过滤 不填默认查所有类型 "MT_QCE"=云产品监控
     */
    public void setMonitorTypes(String [] MonitorTypes) {
        this.MonitorTypes = MonitorTypes;
    }

    /**
     * Get 根据namespace的Id过滤 不填默认查询所有 
     * @return Ids 根据namespace的Id过滤 不填默认查询所有
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set 根据namespace的Id过滤 不填默认查询所有
     * @param Ids 根据namespace的Id过滤 不填默认查询所有
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
    }

    public DescribeAllNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllNamespacesRequest(DescribeAllNamespacesRequest source) {
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.MonitorTypes != null) {
            this.MonitorTypes = new String[source.MonitorTypes.length];
            for (int i = 0; i < source.MonitorTypes.length; i++) {
                this.MonitorTypes[i] = new String(source.MonitorTypes[i]);
            }
        }
        if (source.Ids != null) {
            this.Ids = new String[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new String(source.Ids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "MonitorTypes.", this.MonitorTypes);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}

