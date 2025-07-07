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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterInstancesRequest extends AbstractModel {

    /**
    * 集群 ID，请填写 查询集群列表 接口中返回的 clusterId 字段
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。
    */
    @SerializedName("RunInstancePara")
    @Expose
    private String RunInstancePara;

    /**
    * 实例额外需要设置参数信息
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * 校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验）
    */
    @SerializedName("SkipValidateOptions")
    @Expose
    private String [] SkipValidateOptions;

    /**
     * Get 集群 ID，请填写 查询集群列表 接口中返回的 clusterId 字段 
     * @return ClusterId 集群 ID，请填写 查询集群列表 接口中返回的 clusterId 字段
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID，请填写 查询集群列表 接口中返回的 clusterId 字段
     * @param ClusterId 集群 ID，请填写 查询集群列表 接口中返回的 clusterId 字段
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。 
     * @return RunInstancePara CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。
     */
    public String getRunInstancePara() {
        return this.RunInstancePara;
    }

    /**
     * Set CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。
     * @param RunInstancePara CVM创建透传参数，json化字符串格式，如需要保证扩展集群节点请求幂等性需要在此参数添加ClientToken字段，详见[CVM创建实例](https://cloud.tencent.com/document/product/213/15730)接口。
     */
    public void setRunInstancePara(String RunInstancePara) {
        this.RunInstancePara = RunInstancePara;
    }

    /**
     * Get 实例额外需要设置参数信息 
     * @return InstanceAdvancedSettings 实例额外需要设置参数信息
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set 实例额外需要设置参数信息
     * @param InstanceAdvancedSettings 实例额外需要设置参数信息
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get 校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验） 
     * @return SkipValidateOptions 校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验）
     */
    public String [] getSkipValidateOptions() {
        return this.SkipValidateOptions;
    }

    /**
     * Set 校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验）
     * @param SkipValidateOptions 校验规则相关选项，可配置跳过某些校验规则。目前支持GlobalRouteCIDRCheck（跳过GlobalRouter的相关校验），VpcCniCIDRCheck（跳过VpcCni相关校验）
     */
    public void setSkipValidateOptions(String [] SkipValidateOptions) {
        this.SkipValidateOptions = SkipValidateOptions;
    }

    public CreateClusterInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterInstancesRequest(CreateClusterInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.RunInstancePara != null) {
            this.RunInstancePara = new String(source.RunInstancePara);
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.SkipValidateOptions != null) {
            this.SkipValidateOptions = new String[source.SkipValidateOptions.length];
            for (int i = 0; i < source.SkipValidateOptions.length; i++) {
                this.SkipValidateOptions[i] = new String(source.SkipValidateOptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RunInstancePara", this.RunInstancePara);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamArraySimple(map, prefix + "SkipValidateOptions.", this.SkipValidateOptions);

    }
}

