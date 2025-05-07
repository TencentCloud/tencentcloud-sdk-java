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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersDetailRequest extends AbstractModel {

    /**
    * 返回负载均衡列表数目，默认20，最大值100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回负载均衡列表起始偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 选择返回的Fields列表，系统仅会返回Fileds中填写的字段，可填写的字段详情请参见<a href="https://cloud.tencent.com/document/api/214/30694#LoadBalancerDetail">LoadBalancerDetail</a>。若未在Fileds填写相关字段，则此字段返回null。Fileds中默认添加LoadBalancerId和LoadBalancerName字段。
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * 当Fields包含TargetId、TargetAddress、TargetPort、TargetWeight、ListenerId、Protocol、Port、LocationId、Domain、Url等Fields时，必选选择导出目标组的Target或者非目标组Target，取值范围NODE、GROUP。
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 查询负载均衡详细信息列表条件，详细的过滤条件如下：
- loadbalancer-id
按照【负载均衡ID】进行过滤。例如：lb-rbw5skde。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- project-id
按照【项目ID】进行过滤。例如： "0"、"123"。
类型：String
必选：否
获取方式：[DescribeProject](https://cloud.tencent.com/document/api/651/78725)
- network
按照【负载均衡网络类型】进行过滤。例如：Public。
类型：String
必选：否
可选值：Private（内网）、Public（公网）
- vip
按照【负载均衡 VIP】进行过滤。例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
- vpcid
按照【负载均衡所属 VPCID】进行过滤。例如："vpc-12345678"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- target-ip
按照【后端目标内网 IP】进行过滤。例如："1.1.1.1","2203::214:4"。
类型：String
必选：否
- zone
按照【负载均衡所属的可用区】进行过滤。例如："ap-guangzhou-1"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- tag-key
按照【负载均衡标签的标签键】进行过滤，例如："name"。
类型：String
必选：否
获取方式：[DescribeTags](https://cloud.tencent.com/document/api/651/35316)
- tag:*
按照【负载均衡的标签】进行过滤，':' 后面跟的是标签键。如过滤标签键name，标签值zhangsan,lisi，{"Name": "tag:name","Values": ["zhangsan", "lisi"]}。
类型：String
必选：否
获取方式：[DescribeTagKeys](https://cloud.tencent.com/document/api/651/35318)
- fuzzy-search
按照【负载均衡VIP，负载均衡名称】模糊搜索，例如："1.1"。
类型：String
必选：否
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 返回负载均衡列表数目，默认20，最大值100。 
     * @return Limit 返回负载均衡列表数目，默认20，最大值100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回负载均衡列表数目，默认20，最大值100。
     * @param Limit 返回负载均衡列表数目，默认20，最大值100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回负载均衡列表起始偏移量，默认0。 
     * @return Offset 返回负载均衡列表起始偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回负载均衡列表起始偏移量，默认0。
     * @param Offset 返回负载均衡列表起始偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 选择返回的Fields列表，系统仅会返回Fileds中填写的字段，可填写的字段详情请参见<a href="https://cloud.tencent.com/document/api/214/30694#LoadBalancerDetail">LoadBalancerDetail</a>。若未在Fileds填写相关字段，则此字段返回null。Fileds中默认添加LoadBalancerId和LoadBalancerName字段。 
     * @return Fields 选择返回的Fields列表，系统仅会返回Fileds中填写的字段，可填写的字段详情请参见<a href="https://cloud.tencent.com/document/api/214/30694#LoadBalancerDetail">LoadBalancerDetail</a>。若未在Fileds填写相关字段，则此字段返回null。Fileds中默认添加LoadBalancerId和LoadBalancerName字段。
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set 选择返回的Fields列表，系统仅会返回Fileds中填写的字段，可填写的字段详情请参见<a href="https://cloud.tencent.com/document/api/214/30694#LoadBalancerDetail">LoadBalancerDetail</a>。若未在Fileds填写相关字段，则此字段返回null。Fileds中默认添加LoadBalancerId和LoadBalancerName字段。
     * @param Fields 选择返回的Fields列表，系统仅会返回Fileds中填写的字段，可填写的字段详情请参见<a href="https://cloud.tencent.com/document/api/214/30694#LoadBalancerDetail">LoadBalancerDetail</a>。若未在Fileds填写相关字段，则此字段返回null。Fileds中默认添加LoadBalancerId和LoadBalancerName字段。
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get 当Fields包含TargetId、TargetAddress、TargetPort、TargetWeight、ListenerId、Protocol、Port、LocationId、Domain、Url等Fields时，必选选择导出目标组的Target或者非目标组Target，取值范围NODE、GROUP。 
     * @return TargetType 当Fields包含TargetId、TargetAddress、TargetPort、TargetWeight、ListenerId、Protocol、Port、LocationId、Domain、Url等Fields时，必选选择导出目标组的Target或者非目标组Target，取值范围NODE、GROUP。
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 当Fields包含TargetId、TargetAddress、TargetPort、TargetWeight、ListenerId、Protocol、Port、LocationId、Domain、Url等Fields时，必选选择导出目标组的Target或者非目标组Target，取值范围NODE、GROUP。
     * @param TargetType 当Fields包含TargetId、TargetAddress、TargetPort、TargetWeight、ListenerId、Protocol、Port、LocationId、Domain、Url等Fields时，必选选择导出目标组的Target或者非目标组Target，取值范围NODE、GROUP。
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 查询负载均衡详细信息列表条件，详细的过滤条件如下：
- loadbalancer-id
按照【负载均衡ID】进行过滤。例如：lb-rbw5skde。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- project-id
按照【项目ID】进行过滤。例如： "0"、"123"。
类型：String
必选：否
获取方式：[DescribeProject](https://cloud.tencent.com/document/api/651/78725)
- network
按照【负载均衡网络类型】进行过滤。例如：Public。
类型：String
必选：否
可选值：Private（内网）、Public（公网）
- vip
按照【负载均衡 VIP】进行过滤。例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
- vpcid
按照【负载均衡所属 VPCID】进行过滤。例如："vpc-12345678"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- target-ip
按照【后端目标内网 IP】进行过滤。例如："1.1.1.1","2203::214:4"。
类型：String
必选：否
- zone
按照【负载均衡所属的可用区】进行过滤。例如："ap-guangzhou-1"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- tag-key
按照【负载均衡标签的标签键】进行过滤，例如："name"。
类型：String
必选：否
获取方式：[DescribeTags](https://cloud.tencent.com/document/api/651/35316)
- tag:*
按照【负载均衡的标签】进行过滤，':' 后面跟的是标签键。如过滤标签键name，标签值zhangsan,lisi，{"Name": "tag:name","Values": ["zhangsan", "lisi"]}。
类型：String
必选：否
获取方式：[DescribeTagKeys](https://cloud.tencent.com/document/api/651/35318)
- fuzzy-search
按照【负载均衡VIP，负载均衡名称】模糊搜索，例如："1.1"。
类型：String
必选：否 
     * @return Filters 查询负载均衡详细信息列表条件，详细的过滤条件如下：
- loadbalancer-id
按照【负载均衡ID】进行过滤。例如：lb-rbw5skde。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- project-id
按照【项目ID】进行过滤。例如： "0"、"123"。
类型：String
必选：否
获取方式：[DescribeProject](https://cloud.tencent.com/document/api/651/78725)
- network
按照【负载均衡网络类型】进行过滤。例如：Public。
类型：String
必选：否
可选值：Private（内网）、Public（公网）
- vip
按照【负载均衡 VIP】进行过滤。例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
- vpcid
按照【负载均衡所属 VPCID】进行过滤。例如："vpc-12345678"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- target-ip
按照【后端目标内网 IP】进行过滤。例如："1.1.1.1","2203::214:4"。
类型：String
必选：否
- zone
按照【负载均衡所属的可用区】进行过滤。例如："ap-guangzhou-1"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- tag-key
按照【负载均衡标签的标签键】进行过滤，例如："name"。
类型：String
必选：否
获取方式：[DescribeTags](https://cloud.tencent.com/document/api/651/35316)
- tag:*
按照【负载均衡的标签】进行过滤，':' 后面跟的是标签键。如过滤标签键name，标签值zhangsan,lisi，{"Name": "tag:name","Values": ["zhangsan", "lisi"]}。
类型：String
必选：否
获取方式：[DescribeTagKeys](https://cloud.tencent.com/document/api/651/35318)
- fuzzy-search
按照【负载均衡VIP，负载均衡名称】模糊搜索，例如："1.1"。
类型：String
必选：否
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询负载均衡详细信息列表条件，详细的过滤条件如下：
- loadbalancer-id
按照【负载均衡ID】进行过滤。例如：lb-rbw5skde。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- project-id
按照【项目ID】进行过滤。例如： "0"、"123"。
类型：String
必选：否
获取方式：[DescribeProject](https://cloud.tencent.com/document/api/651/78725)
- network
按照【负载均衡网络类型】进行过滤。例如：Public。
类型：String
必选：否
可选值：Private（内网）、Public（公网）
- vip
按照【负载均衡 VIP】进行过滤。例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
- vpcid
按照【负载均衡所属 VPCID】进行过滤。例如："vpc-12345678"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- target-ip
按照【后端目标内网 IP】进行过滤。例如："1.1.1.1","2203::214:4"。
类型：String
必选：否
- zone
按照【负载均衡所属的可用区】进行过滤。例如："ap-guangzhou-1"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- tag-key
按照【负载均衡标签的标签键】进行过滤，例如："name"。
类型：String
必选：否
获取方式：[DescribeTags](https://cloud.tencent.com/document/api/651/35316)
- tag:*
按照【负载均衡的标签】进行过滤，':' 后面跟的是标签键。如过滤标签键name，标签值zhangsan,lisi，{"Name": "tag:name","Values": ["zhangsan", "lisi"]}。
类型：String
必选：否
获取方式：[DescribeTagKeys](https://cloud.tencent.com/document/api/651/35318)
- fuzzy-search
按照【负载均衡VIP，负载均衡名称】模糊搜索，例如："1.1"。
类型：String
必选：否
     * @param Filters 查询负载均衡详细信息列表条件，详细的过滤条件如下：
- loadbalancer-id
按照【负载均衡ID】进行过滤。例如：lb-rbw5skde。
类型：String
必选：否
获取方式：[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)
- project-id
按照【项目ID】进行过滤。例如： "0"、"123"。
类型：String
必选：否
获取方式：[DescribeProject](https://cloud.tencent.com/document/api/651/78725)
- network
按照【负载均衡网络类型】进行过滤。例如：Public。
类型：String
必选：否
可选值：Private（内网）、Public（公网）
- vip
按照【负载均衡 VIP】进行过滤。例如："1.1.1.1","2204::22:3"。
类型：String
必选：否
- vpcid
按照【负载均衡所属 VPCID】进行过滤。例如："vpc-12345678"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- target-ip
按照【后端目标内网 IP】进行过滤。例如："1.1.1.1","2203::214:4"。
类型：String
必选：否
- zone
按照【负载均衡所属的可用区】进行过滤。例如："ap-guangzhou-1"。
类型：String
必选：否
获取方式：[DescribeZones](https://cloud.tencent.com/document/product/213/15707)
- tag-key
按照【负载均衡标签的标签键】进行过滤，例如："name"。
类型：String
必选：否
获取方式：[DescribeTags](https://cloud.tencent.com/document/api/651/35316)
- tag:*
按照【负载均衡的标签】进行过滤，':' 后面跟的是标签键。如过滤标签键name，标签值zhangsan,lisi，{"Name": "tag:name","Values": ["zhangsan", "lisi"]}。
类型：String
必选：否
获取方式：[DescribeTagKeys](https://cloud.tencent.com/document/api/651/35318)
- fuzzy-search
按照【负载均衡VIP，负载均衡名称】模糊搜索，例如："1.1"。
类型：String
必选：否
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLoadBalancersDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancersDetailRequest(DescribeLoadBalancersDetailRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

