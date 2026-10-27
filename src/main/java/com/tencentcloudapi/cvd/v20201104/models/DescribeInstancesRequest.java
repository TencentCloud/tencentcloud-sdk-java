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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * 拉取页号
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页拉取个数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Name取值范围："InstanceId"      按照云桌面ID搜索，云桌面ID示例：cdi-l0dfy594htvbn37"Name"     按照云桌面名称搜索 "Region"     按照云桌面所在地域搜索，目前云桌面所支持的地域：        ap-beijing：北京        ap-shanghai：上海        ap-guangzhou：广州        ap-shanghai-adc：上海自动驾驶云"Type"    按照云桌面类型搜索，类型取值：        S3L.MEDIUM4：云桌面-标准S3_2核4G        S3L.LARGE8：云桌面-标准S3_4核8G        S3L.LARGE16：云桌面-标准S3_4核16G        S3L.2XLARGE16：云桌面-标准S3_8核16G        S1L.LARGE8：云桌面-标准S1_4核8G        S1L.LARGE16：云桌面-标准S1_4核16G        S2L.2XLARGE16：云桌面-标准S2_8核16G        G1L.LARGE16：云桌面-图形G1_4核16G        G1L.2XLARGE32：云桌面-图形G1_8核32G        G1L.4XLARGE64：云桌面-图形G1_16核64G        G2L.LARGE24：云桌面-图形G2_6核24G        G2L.3XLARGE58：云桌面-图形G2_14核58G	        G2L.3XLARGE44：云桌面-图形G2_12核44G         G3L.LARGE16：云桌面-图形G3_4核16G	        G3L.5XMEDIUM40：云桌面-图形G3_10核40G	        G3L.5XLARGE80：云桌面-图形G3_20核80G        G4L.5XMEDIUM40：云桌面-图形G4_10核40G        G4L.11XMEDIUM80：云桌面-图形G4_22核80G        G4L.11XLARGE160：云桌面-图形G4_44核160G        G5L.5XMEDIUM40：云桌面-图形G5_10核40G	        G5L.5XLARGE80：云桌面-图形G5_22核80G        G5L.21XMEDIUM160：云桌面-图形G5_42核160G        G5L.21XLARGE320：云桌面-图形G5_84核320G	"ImageId"    按照镜像ID搜索，镜像ID示例：img-ed892xcd2"ChargeType"    按着计费模式搜索，目前支持的计费模式为：         PREPAID：包年包月        POSTPAID_BY_HOUR：按量计费 "HostName"    按照云桌面机器名称搜索，云桌面机器名示例：l0dfy594htvbn37"Status"    按照桌面状态搜索，云桌面状态：        PENDING：创建中        STARTING：开机中        REBOOTING：重启中        ROLLBACKING：回滚中        RESETTING：重置中        STOPPING：关机中        TERMINATING：销毁中        RUNNING：运行中        USING：使用中        STOPPED：关机        ISOLATING ：隔离中，只返回最近24小时数据        SHUTDOWN：销毁，只返回最近24小时数据        DELETED：销毁和SHUTDOWN意义一致，只返回最近24小时数据        LAUNCH_FAILED：创建失败，只返回最近24小时数据"UserId"    按照绑定的用户ID搜索，用户ID示例: us-6b36f283c302481bb83bsdswdefqdqwerqw"UserVpcId"    按照云桌面所属vpc搜索，VPCID示例: vpc-0ji679xf"UserSubnetId"    按照云桌面所属子网搜索，SubnetID示例: subnet-0ji679xf"UserPrivateIp"    按照云桌面IP搜索"Keyword"    按照云桌面绑定的用户名搜索，Values每次只取第一个值"SecurityGroupId"    按照云桌面关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"AssociateSG"    按照可以关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"DomainControlPolicyId"    按照云桌面关联域名管控策略搜索，Values每次只取第一个值,安全组ID实例：domain-0ji679xf "AssociateDomainControlPolicy"    按照可以关联域名策略搜索        ①若已有域名策略关联桌面情况：Values每次只取第一个值,安全组ID实例：domain-0ji679xf         ②若新建域名策略关联桌面情况，Values传空"Uin"    外部租户请勿使用"AppId"    外部租户请勿使用"ImageName"    废弃
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 拉取页号 
     * @return PageNumber 拉取页号
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 拉取页号
     * @param PageNumber 拉取页号
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页拉取个数 
     * @return PageSize 每页拉取个数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页拉取个数
     * @param PageSize 每页拉取个数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Name取值范围："InstanceId"      按照云桌面ID搜索，云桌面ID示例：cdi-l0dfy594htvbn37"Name"     按照云桌面名称搜索 "Region"     按照云桌面所在地域搜索，目前云桌面所支持的地域：        ap-beijing：北京        ap-shanghai：上海        ap-guangzhou：广州        ap-shanghai-adc：上海自动驾驶云"Type"    按照云桌面类型搜索，类型取值：        S3L.MEDIUM4：云桌面-标准S3_2核4G        S3L.LARGE8：云桌面-标准S3_4核8G        S3L.LARGE16：云桌面-标准S3_4核16G        S3L.2XLARGE16：云桌面-标准S3_8核16G        S1L.LARGE8：云桌面-标准S1_4核8G        S1L.LARGE16：云桌面-标准S1_4核16G        S2L.2XLARGE16：云桌面-标准S2_8核16G        G1L.LARGE16：云桌面-图形G1_4核16G        G1L.2XLARGE32：云桌面-图形G1_8核32G        G1L.4XLARGE64：云桌面-图形G1_16核64G        G2L.LARGE24：云桌面-图形G2_6核24G        G2L.3XLARGE58：云桌面-图形G2_14核58G	        G2L.3XLARGE44：云桌面-图形G2_12核44G         G3L.LARGE16：云桌面-图形G3_4核16G	        G3L.5XMEDIUM40：云桌面-图形G3_10核40G	        G3L.5XLARGE80：云桌面-图形G3_20核80G        G4L.5XMEDIUM40：云桌面-图形G4_10核40G        G4L.11XMEDIUM80：云桌面-图形G4_22核80G        G4L.11XLARGE160：云桌面-图形G4_44核160G        G5L.5XMEDIUM40：云桌面-图形G5_10核40G	        G5L.5XLARGE80：云桌面-图形G5_22核80G        G5L.21XMEDIUM160：云桌面-图形G5_42核160G        G5L.21XLARGE320：云桌面-图形G5_84核320G	"ImageId"    按照镜像ID搜索，镜像ID示例：img-ed892xcd2"ChargeType"    按着计费模式搜索，目前支持的计费模式为：         PREPAID：包年包月        POSTPAID_BY_HOUR：按量计费 "HostName"    按照云桌面机器名称搜索，云桌面机器名示例：l0dfy594htvbn37"Status"    按照桌面状态搜索，云桌面状态：        PENDING：创建中        STARTING：开机中        REBOOTING：重启中        ROLLBACKING：回滚中        RESETTING：重置中        STOPPING：关机中        TERMINATING：销毁中        RUNNING：运行中        USING：使用中        STOPPED：关机        ISOLATING ：隔离中，只返回最近24小时数据        SHUTDOWN：销毁，只返回最近24小时数据        DELETED：销毁和SHUTDOWN意义一致，只返回最近24小时数据        LAUNCH_FAILED：创建失败，只返回最近24小时数据"UserId"    按照绑定的用户ID搜索，用户ID示例: us-6b36f283c302481bb83bsdswdefqdqwerqw"UserVpcId"    按照云桌面所属vpc搜索，VPCID示例: vpc-0ji679xf"UserSubnetId"    按照云桌面所属子网搜索，SubnetID示例: subnet-0ji679xf"UserPrivateIp"    按照云桌面IP搜索"Keyword"    按照云桌面绑定的用户名搜索，Values每次只取第一个值"SecurityGroupId"    按照云桌面关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"AssociateSG"    按照可以关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"DomainControlPolicyId"    按照云桌面关联域名管控策略搜索，Values每次只取第一个值,安全组ID实例：domain-0ji679xf "AssociateDomainControlPolicy"    按照可以关联域名策略搜索        ①若已有域名策略关联桌面情况：Values每次只取第一个值,安全组ID实例：domain-0ji679xf         ②若新建域名策略关联桌面情况，Values传空"Uin"    外部租户请勿使用"AppId"    外部租户请勿使用"ImageName"    废弃 
     * @return Filters Name取值范围："InstanceId"      按照云桌面ID搜索，云桌面ID示例：cdi-l0dfy594htvbn37"Name"     按照云桌面名称搜索 "Region"     按照云桌面所在地域搜索，目前云桌面所支持的地域：        ap-beijing：北京        ap-shanghai：上海        ap-guangzhou：广州        ap-shanghai-adc：上海自动驾驶云"Type"    按照云桌面类型搜索，类型取值：        S3L.MEDIUM4：云桌面-标准S3_2核4G        S3L.LARGE8：云桌面-标准S3_4核8G        S3L.LARGE16：云桌面-标准S3_4核16G        S3L.2XLARGE16：云桌面-标准S3_8核16G        S1L.LARGE8：云桌面-标准S1_4核8G        S1L.LARGE16：云桌面-标准S1_4核16G        S2L.2XLARGE16：云桌面-标准S2_8核16G        G1L.LARGE16：云桌面-图形G1_4核16G        G1L.2XLARGE32：云桌面-图形G1_8核32G        G1L.4XLARGE64：云桌面-图形G1_16核64G        G2L.LARGE24：云桌面-图形G2_6核24G        G2L.3XLARGE58：云桌面-图形G2_14核58G	        G2L.3XLARGE44：云桌面-图形G2_12核44G         G3L.LARGE16：云桌面-图形G3_4核16G	        G3L.5XMEDIUM40：云桌面-图形G3_10核40G	        G3L.5XLARGE80：云桌面-图形G3_20核80G        G4L.5XMEDIUM40：云桌面-图形G4_10核40G        G4L.11XMEDIUM80：云桌面-图形G4_22核80G        G4L.11XLARGE160：云桌面-图形G4_44核160G        G5L.5XMEDIUM40：云桌面-图形G5_10核40G	        G5L.5XLARGE80：云桌面-图形G5_22核80G        G5L.21XMEDIUM160：云桌面-图形G5_42核160G        G5L.21XLARGE320：云桌面-图形G5_84核320G	"ImageId"    按照镜像ID搜索，镜像ID示例：img-ed892xcd2"ChargeType"    按着计费模式搜索，目前支持的计费模式为：         PREPAID：包年包月        POSTPAID_BY_HOUR：按量计费 "HostName"    按照云桌面机器名称搜索，云桌面机器名示例：l0dfy594htvbn37"Status"    按照桌面状态搜索，云桌面状态：        PENDING：创建中        STARTING：开机中        REBOOTING：重启中        ROLLBACKING：回滚中        RESETTING：重置中        STOPPING：关机中        TERMINATING：销毁中        RUNNING：运行中        USING：使用中        STOPPED：关机        ISOLATING ：隔离中，只返回最近24小时数据        SHUTDOWN：销毁，只返回最近24小时数据        DELETED：销毁和SHUTDOWN意义一致，只返回最近24小时数据        LAUNCH_FAILED：创建失败，只返回最近24小时数据"UserId"    按照绑定的用户ID搜索，用户ID示例: us-6b36f283c302481bb83bsdswdefqdqwerqw"UserVpcId"    按照云桌面所属vpc搜索，VPCID示例: vpc-0ji679xf"UserSubnetId"    按照云桌面所属子网搜索，SubnetID示例: subnet-0ji679xf"UserPrivateIp"    按照云桌面IP搜索"Keyword"    按照云桌面绑定的用户名搜索，Values每次只取第一个值"SecurityGroupId"    按照云桌面关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"AssociateSG"    按照可以关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"DomainControlPolicyId"    按照云桌面关联域名管控策略搜索，Values每次只取第一个值,安全组ID实例：domain-0ji679xf "AssociateDomainControlPolicy"    按照可以关联域名策略搜索        ①若已有域名策略关联桌面情况：Values每次只取第一个值,安全组ID实例：domain-0ji679xf         ②若新建域名策略关联桌面情况，Values传空"Uin"    外部租户请勿使用"AppId"    外部租户请勿使用"ImageName"    废弃
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Name取值范围："InstanceId"      按照云桌面ID搜索，云桌面ID示例：cdi-l0dfy594htvbn37"Name"     按照云桌面名称搜索 "Region"     按照云桌面所在地域搜索，目前云桌面所支持的地域：        ap-beijing：北京        ap-shanghai：上海        ap-guangzhou：广州        ap-shanghai-adc：上海自动驾驶云"Type"    按照云桌面类型搜索，类型取值：        S3L.MEDIUM4：云桌面-标准S3_2核4G        S3L.LARGE8：云桌面-标准S3_4核8G        S3L.LARGE16：云桌面-标准S3_4核16G        S3L.2XLARGE16：云桌面-标准S3_8核16G        S1L.LARGE8：云桌面-标准S1_4核8G        S1L.LARGE16：云桌面-标准S1_4核16G        S2L.2XLARGE16：云桌面-标准S2_8核16G        G1L.LARGE16：云桌面-图形G1_4核16G        G1L.2XLARGE32：云桌面-图形G1_8核32G        G1L.4XLARGE64：云桌面-图形G1_16核64G        G2L.LARGE24：云桌面-图形G2_6核24G        G2L.3XLARGE58：云桌面-图形G2_14核58G	        G2L.3XLARGE44：云桌面-图形G2_12核44G         G3L.LARGE16：云桌面-图形G3_4核16G	        G3L.5XMEDIUM40：云桌面-图形G3_10核40G	        G3L.5XLARGE80：云桌面-图形G3_20核80G        G4L.5XMEDIUM40：云桌面-图形G4_10核40G        G4L.11XMEDIUM80：云桌面-图形G4_22核80G        G4L.11XLARGE160：云桌面-图形G4_44核160G        G5L.5XMEDIUM40：云桌面-图形G5_10核40G	        G5L.5XLARGE80：云桌面-图形G5_22核80G        G5L.21XMEDIUM160：云桌面-图形G5_42核160G        G5L.21XLARGE320：云桌面-图形G5_84核320G	"ImageId"    按照镜像ID搜索，镜像ID示例：img-ed892xcd2"ChargeType"    按着计费模式搜索，目前支持的计费模式为：         PREPAID：包年包月        POSTPAID_BY_HOUR：按量计费 "HostName"    按照云桌面机器名称搜索，云桌面机器名示例：l0dfy594htvbn37"Status"    按照桌面状态搜索，云桌面状态：        PENDING：创建中        STARTING：开机中        REBOOTING：重启中        ROLLBACKING：回滚中        RESETTING：重置中        STOPPING：关机中        TERMINATING：销毁中        RUNNING：运行中        USING：使用中        STOPPED：关机        ISOLATING ：隔离中，只返回最近24小时数据        SHUTDOWN：销毁，只返回最近24小时数据        DELETED：销毁和SHUTDOWN意义一致，只返回最近24小时数据        LAUNCH_FAILED：创建失败，只返回最近24小时数据"UserId"    按照绑定的用户ID搜索，用户ID示例: us-6b36f283c302481bb83bsdswdefqdqwerqw"UserVpcId"    按照云桌面所属vpc搜索，VPCID示例: vpc-0ji679xf"UserSubnetId"    按照云桌面所属子网搜索，SubnetID示例: subnet-0ji679xf"UserPrivateIp"    按照云桌面IP搜索"Keyword"    按照云桌面绑定的用户名搜索，Values每次只取第一个值"SecurityGroupId"    按照云桌面关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"AssociateSG"    按照可以关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"DomainControlPolicyId"    按照云桌面关联域名管控策略搜索，Values每次只取第一个值,安全组ID实例：domain-0ji679xf "AssociateDomainControlPolicy"    按照可以关联域名策略搜索        ①若已有域名策略关联桌面情况：Values每次只取第一个值,安全组ID实例：domain-0ji679xf         ②若新建域名策略关联桌面情况，Values传空"Uin"    外部租户请勿使用"AppId"    外部租户请勿使用"ImageName"    废弃
     * @param Filters Name取值范围："InstanceId"      按照云桌面ID搜索，云桌面ID示例：cdi-l0dfy594htvbn37"Name"     按照云桌面名称搜索 "Region"     按照云桌面所在地域搜索，目前云桌面所支持的地域：        ap-beijing：北京        ap-shanghai：上海        ap-guangzhou：广州        ap-shanghai-adc：上海自动驾驶云"Type"    按照云桌面类型搜索，类型取值：        S3L.MEDIUM4：云桌面-标准S3_2核4G        S3L.LARGE8：云桌面-标准S3_4核8G        S3L.LARGE16：云桌面-标准S3_4核16G        S3L.2XLARGE16：云桌面-标准S3_8核16G        S1L.LARGE8：云桌面-标准S1_4核8G        S1L.LARGE16：云桌面-标准S1_4核16G        S2L.2XLARGE16：云桌面-标准S2_8核16G        G1L.LARGE16：云桌面-图形G1_4核16G        G1L.2XLARGE32：云桌面-图形G1_8核32G        G1L.4XLARGE64：云桌面-图形G1_16核64G        G2L.LARGE24：云桌面-图形G2_6核24G        G2L.3XLARGE58：云桌面-图形G2_14核58G	        G2L.3XLARGE44：云桌面-图形G2_12核44G         G3L.LARGE16：云桌面-图形G3_4核16G	        G3L.5XMEDIUM40：云桌面-图形G3_10核40G	        G3L.5XLARGE80：云桌面-图形G3_20核80G        G4L.5XMEDIUM40：云桌面-图形G4_10核40G        G4L.11XMEDIUM80：云桌面-图形G4_22核80G        G4L.11XLARGE160：云桌面-图形G4_44核160G        G5L.5XMEDIUM40：云桌面-图形G5_10核40G	        G5L.5XLARGE80：云桌面-图形G5_22核80G        G5L.21XMEDIUM160：云桌面-图形G5_42核160G        G5L.21XLARGE320：云桌面-图形G5_84核320G	"ImageId"    按照镜像ID搜索，镜像ID示例：img-ed892xcd2"ChargeType"    按着计费模式搜索，目前支持的计费模式为：         PREPAID：包年包月        POSTPAID_BY_HOUR：按量计费 "HostName"    按照云桌面机器名称搜索，云桌面机器名示例：l0dfy594htvbn37"Status"    按照桌面状态搜索，云桌面状态：        PENDING：创建中        STARTING：开机中        REBOOTING：重启中        ROLLBACKING：回滚中        RESETTING：重置中        STOPPING：关机中        TERMINATING：销毁中        RUNNING：运行中        USING：使用中        STOPPED：关机        ISOLATING ：隔离中，只返回最近24小时数据        SHUTDOWN：销毁，只返回最近24小时数据        DELETED：销毁和SHUTDOWN意义一致，只返回最近24小时数据        LAUNCH_FAILED：创建失败，只返回最近24小时数据"UserId"    按照绑定的用户ID搜索，用户ID示例: us-6b36f283c302481bb83bsdswdefqdqwerqw"UserVpcId"    按照云桌面所属vpc搜索，VPCID示例: vpc-0ji679xf"UserSubnetId"    按照云桌面所属子网搜索，SubnetID示例: subnet-0ji679xf"UserPrivateIp"    按照云桌面IP搜索"Keyword"    按照云桌面绑定的用户名搜索，Values每次只取第一个值"SecurityGroupId"    按照云桌面关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"AssociateSG"    按照可以关联安全组搜索，Values每次只取第一个值,安全组ID实例：sg-0ji679xf"DomainControlPolicyId"    按照云桌面关联域名管控策略搜索，Values每次只取第一个值,安全组ID实例：domain-0ji679xf "AssociateDomainControlPolicy"    按照可以关联域名策略搜索        ①若已有域名策略关联桌面情况：Values每次只取第一个值,安全组ID实例：domain-0ji679xf         ②若新建域名策略关联桌面情况，Values传空"Uin"    外部租户请勿使用"AppId"    外部租户请勿使用"ImageName"    废弃
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

