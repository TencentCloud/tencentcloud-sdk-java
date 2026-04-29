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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDynamicInstanceRequest extends AbstractModel {

    /**
    * <p>EMR集群id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>支持DynamicInstance的服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>DynamicInstance类型</p><p>枚举值：</p><ul><li>RayCluster： RayCluster类型</li></ul>
    */
    @SerializedName("DynamicInstanceType")
    @Expose
    private String DynamicInstanceType;

    /**
    * <p>DynamicInstance的id</p>
    */
    @SerializedName("DynamicInstanceId")
    @Expose
    private Long DynamicInstanceId;

    /**
    * <p>更新表单配置（每个更新域都传递最新的内容，要完整）</p>
    */
    @SerializedName("DynamicInstanceForm")
    @Expose
    private ModifyDynamicInstanceForm DynamicInstanceForm;

    /**
    * <p>更新YAML配置</p>
    */
    @SerializedName("DynamicInstanceYaml")
    @Expose
    private String DynamicInstanceYaml;

    /**
     * Get <p>EMR集群id</p> 
     * @return InstanceId <p>EMR集群id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>EMR集群id</p>
     * @param InstanceId <p>EMR集群id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>支持DynamicInstance的服务名称</p> 
     * @return ServiceName <p>支持DynamicInstance的服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>支持DynamicInstance的服务名称</p>
     * @param ServiceName <p>支持DynamicInstance的服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>DynamicInstance类型</p><p>枚举值：</p><ul><li>RayCluster： RayCluster类型</li></ul> 
     * @return DynamicInstanceType <p>DynamicInstance类型</p><p>枚举值：</p><ul><li>RayCluster： RayCluster类型</li></ul>
     */
    public String getDynamicInstanceType() {
        return this.DynamicInstanceType;
    }

    /**
     * Set <p>DynamicInstance类型</p><p>枚举值：</p><ul><li>RayCluster： RayCluster类型</li></ul>
     * @param DynamicInstanceType <p>DynamicInstance类型</p><p>枚举值：</p><ul><li>RayCluster： RayCluster类型</li></ul>
     */
    public void setDynamicInstanceType(String DynamicInstanceType) {
        this.DynamicInstanceType = DynamicInstanceType;
    }

    /**
     * Get <p>DynamicInstance的id</p> 
     * @return DynamicInstanceId <p>DynamicInstance的id</p>
     */
    public Long getDynamicInstanceId() {
        return this.DynamicInstanceId;
    }

    /**
     * Set <p>DynamicInstance的id</p>
     * @param DynamicInstanceId <p>DynamicInstance的id</p>
     */
    public void setDynamicInstanceId(Long DynamicInstanceId) {
        this.DynamicInstanceId = DynamicInstanceId;
    }

    /**
     * Get <p>更新表单配置（每个更新域都传递最新的内容，要完整）</p> 
     * @return DynamicInstanceForm <p>更新表单配置（每个更新域都传递最新的内容，要完整）</p>
     */
    public ModifyDynamicInstanceForm getDynamicInstanceForm() {
        return this.DynamicInstanceForm;
    }

    /**
     * Set <p>更新表单配置（每个更新域都传递最新的内容，要完整）</p>
     * @param DynamicInstanceForm <p>更新表单配置（每个更新域都传递最新的内容，要完整）</p>
     */
    public void setDynamicInstanceForm(ModifyDynamicInstanceForm DynamicInstanceForm) {
        this.DynamicInstanceForm = DynamicInstanceForm;
    }

    /**
     * Get <p>更新YAML配置</p> 
     * @return DynamicInstanceYaml <p>更新YAML配置</p>
     */
    public String getDynamicInstanceYaml() {
        return this.DynamicInstanceYaml;
    }

    /**
     * Set <p>更新YAML配置</p>
     * @param DynamicInstanceYaml <p>更新YAML配置</p>
     */
    public void setDynamicInstanceYaml(String DynamicInstanceYaml) {
        this.DynamicInstanceYaml = DynamicInstanceYaml;
    }

    public ModifyDynamicInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDynamicInstanceRequest(ModifyDynamicInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.DynamicInstanceType != null) {
            this.DynamicInstanceType = new String(source.DynamicInstanceType);
        }
        if (source.DynamicInstanceId != null) {
            this.DynamicInstanceId = new Long(source.DynamicInstanceId);
        }
        if (source.DynamicInstanceForm != null) {
            this.DynamicInstanceForm = new ModifyDynamicInstanceForm(source.DynamicInstanceForm);
        }
        if (source.DynamicInstanceYaml != null) {
            this.DynamicInstanceYaml = new String(source.DynamicInstanceYaml);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "DynamicInstanceType", this.DynamicInstanceType);
        this.setParamSimple(map, prefix + "DynamicInstanceId", this.DynamicInstanceId);
        this.setParamObj(map, prefix + "DynamicInstanceForm.", this.DynamicInstanceForm);
        this.setParamSimple(map, prefix + "DynamicInstanceYaml", this.DynamicInstanceYaml);

    }
}

