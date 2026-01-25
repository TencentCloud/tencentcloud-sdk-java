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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGatewayLoadBalancerAttributeRequest extends AbstractModel {

    /**
    * <p>网关负载均衡的唯一ID。可通过<a href="https://cloud.tencent.com/document/api/1782/111683">DescribeGatewayLoadBalancers</a> 接口获取。</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * <p>是否开启删除保护。</p>
    */
    @SerializedName("DeleteProtect")
    @Expose
    private Boolean DeleteProtect;

    /**
     * Get <p>网关负载均衡的唯一ID。可通过<a href="https://cloud.tencent.com/document/api/1782/111683">DescribeGatewayLoadBalancers</a> 接口获取。</p> 
     * @return LoadBalancerId <p>网关负载均衡的唯一ID。可通过<a href="https://cloud.tencent.com/document/api/1782/111683">DescribeGatewayLoadBalancers</a> 接口获取。</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>网关负载均衡的唯一ID。可通过<a href="https://cloud.tencent.com/document/api/1782/111683">DescribeGatewayLoadBalancers</a> 接口获取。</p>
     * @param LoadBalancerId <p>网关负载均衡的唯一ID。可通过<a href="https://cloud.tencent.com/document/api/1782/111683">DescribeGatewayLoadBalancers</a> 接口获取。</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p> 
     * @return LoadBalancerName <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     * @param LoadBalancerName <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。</p>
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get <p>是否开启删除保护。</p> 
     * @return DeleteProtect <p>是否开启删除保护。</p>
     */
    public Boolean getDeleteProtect() {
        return this.DeleteProtect;
    }

    /**
     * Set <p>是否开启删除保护。</p>
     * @param DeleteProtect <p>是否开启删除保护。</p>
     */
    public void setDeleteProtect(Boolean DeleteProtect) {
        this.DeleteProtect = DeleteProtect;
    }

    public ModifyGatewayLoadBalancerAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGatewayLoadBalancerAttributeRequest(ModifyGatewayLoadBalancerAttributeRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.DeleteProtect != null) {
            this.DeleteProtect = new Boolean(source.DeleteProtect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "DeleteProtect", this.DeleteProtect);

    }
}

