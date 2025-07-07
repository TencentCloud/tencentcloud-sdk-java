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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCustomizedConfigForLoadBalancerRequest extends AbstractModel {

    /**
    * 操作类型。
- ADD：创建
- DELETE：删除
- UPDATE：修改
- BIND：绑定
- UNBIND：解绑
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 个性化配置ID。除了创建个性化配置外，必传此字段，如：pz-1234abcd
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
    * 个性化配置内容。创建个性化配置或修改个性化配置的内容时，必传此字段。
具体限制查看 [七层个性化配置](https://cloud.tencent.com/document/product/214/15171)
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * 个性化配置名称。创建个性化配置或修改个性化配置的名字时，必传此字段。
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 负载均衡实例ID。绑定解绑时，必传此字段。
可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
     * Get 操作类型。
- ADD：创建
- DELETE：删除
- UPDATE：修改
- BIND：绑定
- UNBIND：解绑 
     * @return OperationType 操作类型。
- ADD：创建
- DELETE：删除
- UPDATE：修改
- BIND：绑定
- UNBIND：解绑
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型。
- ADD：创建
- DELETE：删除
- UPDATE：修改
- BIND：绑定
- UNBIND：解绑
     * @param OperationType 操作类型。
- ADD：创建
- DELETE：删除
- UPDATE：修改
- BIND：绑定
- UNBIND：解绑
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 个性化配置ID。除了创建个性化配置外，必传此字段，如：pz-1234abcd 
     * @return UconfigId 个性化配置ID。除了创建个性化配置外，必传此字段，如：pz-1234abcd
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set 个性化配置ID。除了创建个性化配置外，必传此字段，如：pz-1234abcd
     * @param UconfigId 个性化配置ID。除了创建个性化配置外，必传此字段，如：pz-1234abcd
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    /**
     * Get 个性化配置内容。创建个性化配置或修改个性化配置的内容时，必传此字段。
具体限制查看 [七层个性化配置](https://cloud.tencent.com/document/product/214/15171) 
     * @return ConfigContent 个性化配置内容。创建个性化配置或修改个性化配置的内容时，必传此字段。
具体限制查看 [七层个性化配置](https://cloud.tencent.com/document/product/214/15171)
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set 个性化配置内容。创建个性化配置或修改个性化配置的内容时，必传此字段。
具体限制查看 [七层个性化配置](https://cloud.tencent.com/document/product/214/15171)
     * @param ConfigContent 个性化配置内容。创建个性化配置或修改个性化配置的内容时，必传此字段。
具体限制查看 [七层个性化配置](https://cloud.tencent.com/document/product/214/15171)
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get 个性化配置名称。创建个性化配置或修改个性化配置的名字时，必传此字段。 
     * @return ConfigName 个性化配置名称。创建个性化配置或修改个性化配置的名字时，必传此字段。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 个性化配置名称。创建个性化配置或修改个性化配置的名字时，必传此字段。
     * @param ConfigName 个性化配置名称。创建个性化配置或修改个性化配置的名字时，必传此字段。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 负载均衡实例ID。绑定解绑时，必传此字段。
可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。 
     * @return LoadBalancerIds 负载均衡实例ID。绑定解绑时，必传此字段。
可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 负载均衡实例ID。绑定解绑时，必传此字段。
可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。
     * @param LoadBalancerIds 负载均衡实例ID。绑定解绑时，必传此字段。
可以通过 [DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 接口查询。
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

