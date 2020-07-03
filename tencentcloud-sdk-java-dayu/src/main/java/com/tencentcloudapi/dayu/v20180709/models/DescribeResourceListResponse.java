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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceListResponse extends AbstractModel{

    /**
    * 总记录数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 资源记录列表，返回Key值说明：
"Key": "CreateTime" 表示资源实例购买时间
"Key": "Region" 表示资源实例的地域
"Key": "BoundIP" 表示独享包实例绑定的IP
"Key": "Id" 表示资源实例的ID
"Key": "CCEnabled" 表示资源实例的CC防护开关状态
"Key": "DDoSThreshold" 表示资源实例的DDoS的清洗阈值	
"Key": "BoundStatus" 表示独享包或共享包实例的绑定IP操作状态(绑定中或绑定完成)
"Key": "Type" 此字段弃用
"Key": "ElasticLimit" 表示资源实例的弹性防护值
"Key": "DDoSAI" 表示资源实例的DDoS AI防护开关
"Key": "Bandwidth" 表示资源实例的保底防护值
"Key": "OverloadCount" 表示资源实例受到超过弹性防护值的次数
"Key": "Status" 表示资源实例的状态(idle:运行中, attacking:攻击中, blocking:封堵中, isolate:隔离中)
"Key": "Lbid" 此字段弃用
"Key": "ShowFlag" 此字段弃用
"Key": "Expire" 表示资源实例的过期时间
"Key": "CCThreshold" 表示资源实例的CC防护触发阈值
"Key": "AutoRenewFlag" 表示资源实例的自动续费是否开启
"Key": "IspCode" 表示独享包或共享包的线路(0-电信, 1-联通, 2-移动, 5-BGP)
"Key": "PackType" 表示套餐包类型
"Key": "PackId" 表示套餐包ID
"Key": "Name" 表示资源实例的名称
"Key": "Locked" 此字段弃用
"Key": "IpDDoSLevel" 表示资源实例的防护等级(low-宽松, middle-正常, high-严格)
"Key": "DefendStatus" 表示资源实例的DDoS防护状态(防护开启或临时关闭)
"Key": "UndefendExpire" 表示资源实例的DDoS防护临时关闭结束时间
"Key": "Tgw" 表示资源实例是否是新资源
    */
    @SerializedName("ServicePacks")
    @Expose
    private KeyValueRecord [] ServicePacks;

    /**
    * 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总记录数 
     * @return Total 总记录数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总记录数
     * @param Total 总记录数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 资源记录列表，返回Key值说明：
"Key": "CreateTime" 表示资源实例购买时间
"Key": "Region" 表示资源实例的地域
"Key": "BoundIP" 表示独享包实例绑定的IP
"Key": "Id" 表示资源实例的ID
"Key": "CCEnabled" 表示资源实例的CC防护开关状态
"Key": "DDoSThreshold" 表示资源实例的DDoS的清洗阈值	
"Key": "BoundStatus" 表示独享包或共享包实例的绑定IP操作状态(绑定中或绑定完成)
"Key": "Type" 此字段弃用
"Key": "ElasticLimit" 表示资源实例的弹性防护值
"Key": "DDoSAI" 表示资源实例的DDoS AI防护开关
"Key": "Bandwidth" 表示资源实例的保底防护值
"Key": "OverloadCount" 表示资源实例受到超过弹性防护值的次数
"Key": "Status" 表示资源实例的状态(idle:运行中, attacking:攻击中, blocking:封堵中, isolate:隔离中)
"Key": "Lbid" 此字段弃用
"Key": "ShowFlag" 此字段弃用
"Key": "Expire" 表示资源实例的过期时间
"Key": "CCThreshold" 表示资源实例的CC防护触发阈值
"Key": "AutoRenewFlag" 表示资源实例的自动续费是否开启
"Key": "IspCode" 表示独享包或共享包的线路(0-电信, 1-联通, 2-移动, 5-BGP)
"Key": "PackType" 表示套餐包类型
"Key": "PackId" 表示套餐包ID
"Key": "Name" 表示资源实例的名称
"Key": "Locked" 此字段弃用
"Key": "IpDDoSLevel" 表示资源实例的防护等级(low-宽松, middle-正常, high-严格)
"Key": "DefendStatus" 表示资源实例的DDoS防护状态(防护开启或临时关闭)
"Key": "UndefendExpire" 表示资源实例的DDoS防护临时关闭结束时间
"Key": "Tgw" 表示资源实例是否是新资源 
     * @return ServicePacks 资源记录列表，返回Key值说明：
"Key": "CreateTime" 表示资源实例购买时间
"Key": "Region" 表示资源实例的地域
"Key": "BoundIP" 表示独享包实例绑定的IP
"Key": "Id" 表示资源实例的ID
"Key": "CCEnabled" 表示资源实例的CC防护开关状态
"Key": "DDoSThreshold" 表示资源实例的DDoS的清洗阈值	
"Key": "BoundStatus" 表示独享包或共享包实例的绑定IP操作状态(绑定中或绑定完成)
"Key": "Type" 此字段弃用
"Key": "ElasticLimit" 表示资源实例的弹性防护值
"Key": "DDoSAI" 表示资源实例的DDoS AI防护开关
"Key": "Bandwidth" 表示资源实例的保底防护值
"Key": "OverloadCount" 表示资源实例受到超过弹性防护值的次数
"Key": "Status" 表示资源实例的状态(idle:运行中, attacking:攻击中, blocking:封堵中, isolate:隔离中)
"Key": "Lbid" 此字段弃用
"Key": "ShowFlag" 此字段弃用
"Key": "Expire" 表示资源实例的过期时间
"Key": "CCThreshold" 表示资源实例的CC防护触发阈值
"Key": "AutoRenewFlag" 表示资源实例的自动续费是否开启
"Key": "IspCode" 表示独享包或共享包的线路(0-电信, 1-联通, 2-移动, 5-BGP)
"Key": "PackType" 表示套餐包类型
"Key": "PackId" 表示套餐包ID
"Key": "Name" 表示资源实例的名称
"Key": "Locked" 此字段弃用
"Key": "IpDDoSLevel" 表示资源实例的防护等级(low-宽松, middle-正常, high-严格)
"Key": "DefendStatus" 表示资源实例的DDoS防护状态(防护开启或临时关闭)
"Key": "UndefendExpire" 表示资源实例的DDoS防护临时关闭结束时间
"Key": "Tgw" 表示资源实例是否是新资源
     */
    public KeyValueRecord [] getServicePacks() {
        return this.ServicePacks;
    }

    /**
     * Set 资源记录列表，返回Key值说明：
"Key": "CreateTime" 表示资源实例购买时间
"Key": "Region" 表示资源实例的地域
"Key": "BoundIP" 表示独享包实例绑定的IP
"Key": "Id" 表示资源实例的ID
"Key": "CCEnabled" 表示资源实例的CC防护开关状态
"Key": "DDoSThreshold" 表示资源实例的DDoS的清洗阈值	
"Key": "BoundStatus" 表示独享包或共享包实例的绑定IP操作状态(绑定中或绑定完成)
"Key": "Type" 此字段弃用
"Key": "ElasticLimit" 表示资源实例的弹性防护值
"Key": "DDoSAI" 表示资源实例的DDoS AI防护开关
"Key": "Bandwidth" 表示资源实例的保底防护值
"Key": "OverloadCount" 表示资源实例受到超过弹性防护值的次数
"Key": "Status" 表示资源实例的状态(idle:运行中, attacking:攻击中, blocking:封堵中, isolate:隔离中)
"Key": "Lbid" 此字段弃用
"Key": "ShowFlag" 此字段弃用
"Key": "Expire" 表示资源实例的过期时间
"Key": "CCThreshold" 表示资源实例的CC防护触发阈值
"Key": "AutoRenewFlag" 表示资源实例的自动续费是否开启
"Key": "IspCode" 表示独享包或共享包的线路(0-电信, 1-联通, 2-移动, 5-BGP)
"Key": "PackType" 表示套餐包类型
"Key": "PackId" 表示套餐包ID
"Key": "Name" 表示资源实例的名称
"Key": "Locked" 此字段弃用
"Key": "IpDDoSLevel" 表示资源实例的防护等级(low-宽松, middle-正常, high-严格)
"Key": "DefendStatus" 表示资源实例的DDoS防护状态(防护开启或临时关闭)
"Key": "UndefendExpire" 表示资源实例的DDoS防护临时关闭结束时间
"Key": "Tgw" 表示资源实例是否是新资源
     * @param ServicePacks 资源记录列表，返回Key值说明：
"Key": "CreateTime" 表示资源实例购买时间
"Key": "Region" 表示资源实例的地域
"Key": "BoundIP" 表示独享包实例绑定的IP
"Key": "Id" 表示资源实例的ID
"Key": "CCEnabled" 表示资源实例的CC防护开关状态
"Key": "DDoSThreshold" 表示资源实例的DDoS的清洗阈值	
"Key": "BoundStatus" 表示独享包或共享包实例的绑定IP操作状态(绑定中或绑定完成)
"Key": "Type" 此字段弃用
"Key": "ElasticLimit" 表示资源实例的弹性防护值
"Key": "DDoSAI" 表示资源实例的DDoS AI防护开关
"Key": "Bandwidth" 表示资源实例的保底防护值
"Key": "OverloadCount" 表示资源实例受到超过弹性防护值的次数
"Key": "Status" 表示资源实例的状态(idle:运行中, attacking:攻击中, blocking:封堵中, isolate:隔离中)
"Key": "Lbid" 此字段弃用
"Key": "ShowFlag" 此字段弃用
"Key": "Expire" 表示资源实例的过期时间
"Key": "CCThreshold" 表示资源实例的CC防护触发阈值
"Key": "AutoRenewFlag" 表示资源实例的自动续费是否开启
"Key": "IspCode" 表示独享包或共享包的线路(0-电信, 1-联通, 2-移动, 5-BGP)
"Key": "PackType" 表示套餐包类型
"Key": "PackId" 表示套餐包ID
"Key": "Name" 表示资源实例的名称
"Key": "Locked" 此字段弃用
"Key": "IpDDoSLevel" 表示资源实例的防护等级(low-宽松, middle-正常, high-严格)
"Key": "DefendStatus" 表示资源实例的DDoS防护状态(防护开启或临时关闭)
"Key": "UndefendExpire" 表示资源实例的DDoS防护临时关闭结束时间
"Key": "Tgw" 表示资源实例是否是新资源
     */
    public void setServicePacks(KeyValueRecord [] ServicePacks) {
        this.ServicePacks = ServicePacks;
    }

    /**
     * Get 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgp表示独享包；bgp-multip表示共享包；bgpip表示高防IP；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "ServicePacks.", this.ServicePacks);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

