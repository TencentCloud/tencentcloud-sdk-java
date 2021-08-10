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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCustomizedConfigForLoadBalancerRequest extends AbstractModel{

    /**
    * 操作类型：'ADD', 'DELETE', 'UPDATE', 'BIND', 'UNBIND'
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 除了创建个性化配置外，必传此字段，如：pz-1234abcd
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
    * 创建个性化配置或修改个性化配置的内容时，必传此字段
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * 创建个性化配置或修改个性化配置的名字时，必传此字段
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 绑定解绑时，必传此字段
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
     * Get 操作类型：'ADD', 'DELETE', 'UPDATE', 'BIND', 'UNBIND' 
     * @return OperationType 操作类型：'ADD', 'DELETE', 'UPDATE', 'BIND', 'UNBIND'
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型：'ADD', 'DELETE', 'UPDATE', 'BIND', 'UNBIND'
     * @param OperationType 操作类型：'ADD', 'DELETE', 'UPDATE', 'BIND', 'UNBIND'
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 除了创建个性化配置外，必传此字段，如：pz-1234abcd 
     * @return UconfigId 除了创建个性化配置外，必传此字段，如：pz-1234abcd
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set 除了创建个性化配置外，必传此字段，如：pz-1234abcd
     * @param UconfigId 除了创建个性化配置外，必传此字段，如：pz-1234abcd
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    /**
     * Get 创建个性化配置或修改个性化配置的内容时，必传此字段 
     * @return ConfigContent 创建个性化配置或修改个性化配置的内容时，必传此字段
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set 创建个性化配置或修改个性化配置的内容时，必传此字段
     * @param ConfigContent 创建个性化配置或修改个性化配置的内容时，必传此字段
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get 创建个性化配置或修改个性化配置的名字时，必传此字段 
     * @return ConfigName 创建个性化配置或修改个性化配置的名字时，必传此字段
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 创建个性化配置或修改个性化配置的名字时，必传此字段
     * @param ConfigName 创建个性化配置或修改个性化配置的名字时，必传此字段
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 绑定解绑时，必传此字段 
     * @return LoadBalancerIds 绑定解绑时，必传此字段
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 绑定解绑时，必传此字段
     * @param LoadBalancerIds 绑定解绑时，必传此字段
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    public SetCustomizedConfigForLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetCustomizedConfigForLoadBalancerRequest(SetCustomizedConfigForLoadBalancerRequest source) {
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.UconfigId != null) {
            this.UconfigId = new String(source.UconfigId);
        }
        if (source.ConfigContent != null) {
            this.ConfigContent = new String(source.ConfigContent);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "UconfigId", this.UconfigId);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);

    }
}

