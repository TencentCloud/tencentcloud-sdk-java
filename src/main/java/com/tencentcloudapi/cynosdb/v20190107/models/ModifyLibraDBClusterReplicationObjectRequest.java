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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLibraDBClusterReplicationObjectRequest extends AbstractModel {

    /**
    * 分析集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 只读分析引擎实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 映射模式
    */
    @SerializedName("ForceDefaultMapRule")
    @Expose
    private String ForceDefaultMapRule;

    /**
    * 同步对象
    */
    @SerializedName("Objects")
    @Expose
    private ReplicationObject [] Objects;

    /**
    * 自动映射规则
    */
    @SerializedName("AutoMapRules")
    @Expose
    private AutoMapRule [] AutoMapRules;

    /**
    * 是否按照最新映射规则刷新存量映射关系
    */
    @SerializedName("RefreshMapping")
    @Expose
    private Boolean RefreshMapping;

    /**
     * Get 分析集群ID 
     * @return ClusterId 分析集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 分析集群ID
     * @param ClusterId 分析集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 只读分析引擎实例 ID 
     * @return InstanceId 只读分析引擎实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 只读分析引擎实例 ID
     * @param InstanceId 只读分析引擎实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 映射模式 
     * @return ForceDefaultMapRule 映射模式
     */
    public String getForceDefaultMapRule() {
        return this.ForceDefaultMapRule;
    }

    /**
     * Set 映射模式
     * @param ForceDefaultMapRule 映射模式
     */
    public void setForceDefaultMapRule(String ForceDefaultMapRule) {
        this.ForceDefaultMapRule = ForceDefaultMapRule;
    }

    /**
     * Get 同步对象 
     * @return Objects 同步对象
     */
    public ReplicationObject [] getObjects() {
        return this.Objects;
    }

    /**
     * Set 同步对象
     * @param Objects 同步对象
     */
    public void setObjects(ReplicationObject [] Objects) {
        this.Objects = Objects;
    }

    /**
     * Get 自动映射规则 
     * @return AutoMapRules 自动映射规则
     */
    public AutoMapRule [] getAutoMapRules() {
        return this.AutoMapRules;
    }

    /**
     * Set 自动映射规则
     * @param AutoMapRules 自动映射规则
     */
    public void setAutoMapRules(AutoMapRule [] AutoMapRules) {
        this.AutoMapRules = AutoMapRules;
    }

    /**
     * Get 是否按照最新映射规则刷新存量映射关系 
     * @return RefreshMapping 是否按照最新映射规则刷新存量映射关系
     */
    public Boolean getRefreshMapping() {
        return this.RefreshMapping;
    }

    /**
     * Set 是否按照最新映射规则刷新存量映射关系
     * @param RefreshMapping 是否按照最新映射规则刷新存量映射关系
     */
    public void setRefreshMapping(Boolean RefreshMapping) {
        this.RefreshMapping = RefreshMapping;
    }

    public ModifyLibraDBClusterReplicationObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraDBClusterReplicationObjectRequest(ModifyLibraDBClusterReplicationObjectRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ForceDefaultMapRule != null) {
            this.ForceDefaultMapRule = new String(source.ForceDefaultMapRule);
        }
        if (source.Objects != null) {
            this.Objects = new ReplicationObject[source.Objects.length];
            for (int i = 0; i < source.Objects.length; i++) {
                this.Objects[i] = new ReplicationObject(source.Objects[i]);
            }
        }
        if (source.AutoMapRules != null) {
            this.AutoMapRules = new AutoMapRule[source.AutoMapRules.length];
            for (int i = 0; i < source.AutoMapRules.length; i++) {
                this.AutoMapRules[i] = new AutoMapRule(source.AutoMapRules[i]);
            }
        }
        if (source.RefreshMapping != null) {
            this.RefreshMapping = new Boolean(source.RefreshMapping);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ForceDefaultMapRule", this.ForceDefaultMapRule);
        this.setParamArrayObj(map, prefix + "Objects.", this.Objects);
        this.setParamArrayObj(map, prefix + "AutoMapRules.", this.AutoMapRules);
        this.setParamSimple(map, prefix + "RefreshMapping", this.RefreshMapping);

    }
}

