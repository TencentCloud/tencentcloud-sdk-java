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

public class DescribeCustomizedConfigListRequest extends AbstractModel {

    /**
    * 配置类型:CLB 负载均衡维度。 SERVER 域名维度。 LOCATION 规则维度。
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * 拉取页偏移，默认值0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 拉取数目，默认值20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 拉取指定配置名字，模糊匹配。
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置ID，可以通过 [DescribeCustomizedConfigList](https://cloud.tencent.com/document/api/214/60009) 接口查询。
    */
    @SerializedName("UconfigIds")
    @Expose
    private String [] UconfigIds;

    /**
    * 过滤条件如下：
- loadbalancer-id
按照【负载均衡 ID】进行过滤。实例计费模式例如：lb-9vxezxza。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- vip
按照【负载均衡VIP】进行过滤。网络计费模式例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 配置类型:CLB 负载均衡维度。 SERVER 域名维度。 LOCATION 规则维度。 
     * @return ConfigType 配置类型:CLB 负载均衡维度。 SERVER 域名维度。 LOCATION 规则维度。
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 配置类型:CLB 负载均衡维度。 SERVER 域名维度。 LOCATION 规则维度。
     * @param ConfigType 配置类型:CLB 负载均衡维度。 SERVER 域名维度。 LOCATION 规则维度。
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get 拉取页偏移，默认值0。 
     * @return Offset 拉取页偏移，默认值0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 拉取页偏移，默认值0。
     * @param Offset 拉取页偏移，默认值0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 拉取数目，默认值20。 
     * @return Limit 拉取数目，默认值20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 拉取数目，默认值20。
     * @param Limit 拉取数目，默认值20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 拉取指定配置名字，模糊匹配。 
     * @return ConfigName 拉取指定配置名字，模糊匹配。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 拉取指定配置名字，模糊匹配。
     * @param ConfigName 拉取指定配置名字，模糊匹配。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置ID，可以通过 [DescribeCustomizedConfigList](https://cloud.tencent.com/document/api/214/60009) 接口查询。 
     * @return UconfigIds 配置ID，可以通过 [DescribeCustomizedConfigList](https://cloud.tencent.com/document/api/214/60009) 接口查询。
     */
    public String [] getUconfigIds() {
        return this.UconfigIds;
    }

    /**
     * Set 配置ID，可以通过 [DescribeCustomizedConfigList](https://cloud.tencent.com/document/api/214/60009) 接口查询。
     * @param UconfigIds 配置ID，可以通过 [DescribeCustomizedConfigList](https://cloud.tencent.com/document/api/214/60009) 接口查询。
     */
    public void setUconfigIds(String [] UconfigIds) {
        this.UconfigIds = UconfigIds;
    }

    /**
     * Get 过滤条件如下：
- loadbalancer-id
按照【负载均衡 ID】进行过滤。实例计费模式例如：lb-9vxezxza。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- vip
按照【负载均衡VIP】进行过滤。网络计费模式例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459) 
     * @return Filters 过滤条件如下：
- loadbalancer-id
按照【负载均衡 ID】进行过滤。实例计费模式例如：lb-9vxezxza。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- vip
按照【负载均衡VIP】进行过滤。网络计费模式例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件如下：
- loadbalancer-id
按照【负载均衡 ID】进行过滤。实例计费模式例如：lb-9vxezxza。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- vip
按照【负载均衡VIP】进行过滤。网络计费模式例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
     * @param Filters 过滤条件如下：
- loadbalancer-id
按照【负载均衡 ID】进行过滤。实例计费模式例如：lb-9vxezxza。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- vip
按照【负载均衡VIP】进行过滤。网络计费模式例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCustomizedConfigListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomizedConfigListRequest(DescribeCustomizedConfigListRequest source) {
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.UconfigIds != null) {
            this.UconfigIds = new String[source.UconfigIds.length];
            for (int i = 0; i < source.UconfigIds.length; i++) {
                this.UconfigIds[i] = new String(source.UconfigIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamArraySimple(map, prefix + "UconfigIds.", this.UconfigIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

