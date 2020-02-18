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

public class ModifyBlockIPListRequest extends AbstractModel{

    /**
    * 负载均衡实例ID
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 操作类型，可取：
<li> add_customized_field（首次设置header，开启黑名单功能）</li>
<li> set_customized_field（修改header）</li>
<li> del_customized_field（删除header）</li>
<li> add_blocked（添加黑名单）</li>
<li> del_blocked（删除黑名单）</li>
<li> flush_blocked（清空黑名单）</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 客户端真实IP存放的header字段名
    */
    @SerializedName("ClientIPField")
    @Expose
    private String ClientIPField;

    /**
    * 封禁IP列表，单次操作数组最大长度支持200000
    */
    @SerializedName("BlockIPList")
    @Expose
    private String [] BlockIPList;

    /**
    * 过期时间，单位秒，默认值3600
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 添加IP的策略，可取：fifo（如果黑名单容量已满，新加入黑名单的IP采用先进先出策略）
    */
    @SerializedName("AddStrategy")
    @Expose
    private String AddStrategy;

    /**
     * Get 负载均衡实例ID 
     * @return LoadBalancerIds 负载均衡实例ID
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 负载均衡实例ID
     * @param LoadBalancerIds 负载均衡实例ID
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get 操作类型，可取：
<li> add_customized_field（首次设置header，开启黑名单功能）</li>
<li> set_customized_field（修改header）</li>
<li> del_customized_field（删除header）</li>
<li> add_blocked（添加黑名单）</li>
<li> del_blocked（删除黑名单）</li>
<li> flush_blocked（清空黑名单）</li> 
     * @return Type 操作类型，可取：
<li> add_customized_field（首次设置header，开启黑名单功能）</li>
<li> set_customized_field（修改header）</li>
<li> del_customized_field（删除header）</li>
<li> add_blocked（添加黑名单）</li>
<li> del_blocked（删除黑名单）</li>
<li> flush_blocked（清空黑名单）</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 操作类型，可取：
<li> add_customized_field（首次设置header，开启黑名单功能）</li>
<li> set_customized_field（修改header）</li>
<li> del_customized_field（删除header）</li>
<li> add_blocked（添加黑名单）</li>
<li> del_blocked（删除黑名单）</li>
<li> flush_blocked（清空黑名单）</li>
     * @param Type 操作类型，可取：
<li> add_customized_field（首次设置header，开启黑名单功能）</li>
<li> set_customized_field（修改header）</li>
<li> del_customized_field（删除header）</li>
<li> add_blocked（添加黑名单）</li>
<li> del_blocked（删除黑名单）</li>
<li> flush_blocked（清空黑名单）</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 客户端真实IP存放的header字段名 
     * @return ClientIPField 客户端真实IP存放的header字段名
     */
    public String getClientIPField() {
        return this.ClientIPField;
    }

    /**
     * Set 客户端真实IP存放的header字段名
     * @param ClientIPField 客户端真实IP存放的header字段名
     */
    public void setClientIPField(String ClientIPField) {
        this.ClientIPField = ClientIPField;
    }

    /**
     * Get 封禁IP列表，单次操作数组最大长度支持200000 
     * @return BlockIPList 封禁IP列表，单次操作数组最大长度支持200000
     */
    public String [] getBlockIPList() {
        return this.BlockIPList;
    }

    /**
     * Set 封禁IP列表，单次操作数组最大长度支持200000
     * @param BlockIPList 封禁IP列表，单次操作数组最大长度支持200000
     */
    public void setBlockIPList(String [] BlockIPList) {
        this.BlockIPList = BlockIPList;
    }

    /**
     * Get 过期时间，单位秒，默认值3600 
     * @return ExpireTime 过期时间，单位秒，默认值3600
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，单位秒，默认值3600
     * @param ExpireTime 过期时间，单位秒，默认值3600
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 添加IP的策略，可取：fifo（如果黑名单容量已满，新加入黑名单的IP采用先进先出策略） 
     * @return AddStrategy 添加IP的策略，可取：fifo（如果黑名单容量已满，新加入黑名单的IP采用先进先出策略）
     */
    public String getAddStrategy() {
        return this.AddStrategy;
    }

    /**
     * Set 添加IP的策略，可取：fifo（如果黑名单容量已满，新加入黑名单的IP采用先进先出策略）
     * @param AddStrategy 添加IP的策略，可取：fifo（如果黑名单容量已满，新加入黑名单的IP采用先进先出策略）
     */
    public void setAddStrategy(String AddStrategy) {
        this.AddStrategy = AddStrategy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClientIPField", this.ClientIPField);
        this.setParamArraySimple(map, prefix + "BlockIPList.", this.BlockIPList);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AddStrategy", this.AddStrategy);

    }
}

