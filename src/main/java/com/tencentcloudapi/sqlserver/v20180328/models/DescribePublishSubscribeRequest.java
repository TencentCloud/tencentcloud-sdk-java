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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePublishSubscribeRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 订阅/发布实例ID，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例ID做筛选；当InstanceId为订阅实例时，本字段按照发布实例ID做筛选；
    */
    @SerializedName("PubOrSubInstanceId")
    @Expose
    private String PubOrSubInstanceId;

    /**
    * 订阅/发布实例内网IP，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例内网IP做筛选；当InstanceId为订阅实例时，本字段按照发布实例内网IP做筛选；
    */
    @SerializedName("PubOrSubInstanceIp")
    @Expose
    private String PubOrSubInstanceIp;

    /**
    * 订阅发布ID，用于筛选
    */
    @SerializedName("PublishSubscribeId")
    @Expose
    private Long PublishSubscribeId;

    /**
    * 订阅发布名字，用于筛选
    */
    @SerializedName("PublishSubscribeName")
    @Expose
    private String PublishSubscribeName;

    /**
    * 发布库名字，用于筛选
    */
    @SerializedName("PublishDBName")
    @Expose
    private String PublishDBName;

    /**
    * 订阅库名字，用于筛选
    */
    @SerializedName("SubscribeDBName")
    @Expose
    private String SubscribeDBName;

    /**
    * 分页，页数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页，页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例ID，形如mssql-j8kv137v 
     * @return InstanceId 实例ID，形如mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-j8kv137v
     * @param InstanceId 实例ID，形如mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 订阅/发布实例ID，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例ID做筛选；当InstanceId为订阅实例时，本字段按照发布实例ID做筛选； 
     * @return PubOrSubInstanceId 订阅/发布实例ID，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例ID做筛选；当InstanceId为订阅实例时，本字段按照发布实例ID做筛选；
     */
    public String getPubOrSubInstanceId() {
        return this.PubOrSubInstanceId;
    }

    /**
     * Set 订阅/发布实例ID，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例ID做筛选；当InstanceId为订阅实例时，本字段按照发布实例ID做筛选；
     * @param PubOrSubInstanceId 订阅/发布实例ID，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例ID做筛选；当InstanceId为订阅实例时，本字段按照发布实例ID做筛选；
     */
    public void setPubOrSubInstanceId(String PubOrSubInstanceId) {
        this.PubOrSubInstanceId = PubOrSubInstanceId;
    }

    /**
     * Get 订阅/发布实例内网IP，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例内网IP做筛选；当InstanceId为订阅实例时，本字段按照发布实例内网IP做筛选； 
     * @return PubOrSubInstanceIp 订阅/发布实例内网IP，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例内网IP做筛选；当InstanceId为订阅实例时，本字段按照发布实例内网IP做筛选；
     */
    public String getPubOrSubInstanceIp() {
        return this.PubOrSubInstanceIp;
    }

    /**
     * Set 订阅/发布实例内网IP，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例内网IP做筛选；当InstanceId为订阅实例时，本字段按照发布实例内网IP做筛选；
     * @param PubOrSubInstanceIp 订阅/发布实例内网IP，与InstanceId是发布实例还是订阅实例有关；当InstanceId为发布实例时，本字段按照订阅实例内网IP做筛选；当InstanceId为订阅实例时，本字段按照发布实例内网IP做筛选；
     */
    public void setPubOrSubInstanceIp(String PubOrSubInstanceIp) {
        this.PubOrSubInstanceIp = PubOrSubInstanceIp;
    }

    /**
     * Get 订阅发布ID，用于筛选 
     * @return PublishSubscribeId 订阅发布ID，用于筛选
     */
    public Long getPublishSubscribeId() {
        return this.PublishSubscribeId;
    }

    /**
     * Set 订阅发布ID，用于筛选
     * @param PublishSubscribeId 订阅发布ID，用于筛选
     */
    public void setPublishSubscribeId(Long PublishSubscribeId) {
        this.PublishSubscribeId = PublishSubscribeId;
    }

    /**
     * Get 订阅发布名字，用于筛选 
     * @return PublishSubscribeName 订阅发布名字，用于筛选
     */
    public String getPublishSubscribeName() {
        return this.PublishSubscribeName;
    }

    /**
     * Set 订阅发布名字，用于筛选
     * @param PublishSubscribeName 订阅发布名字，用于筛选
     */
    public void setPublishSubscribeName(String PublishSubscribeName) {
        this.PublishSubscribeName = PublishSubscribeName;
    }

    /**
     * Get 发布库名字，用于筛选 
     * @return PublishDBName 发布库名字，用于筛选
     */
    public String getPublishDBName() {
        return this.PublishDBName;
    }

    /**
     * Set 发布库名字，用于筛选
     * @param PublishDBName 发布库名字，用于筛选
     */
    public void setPublishDBName(String PublishDBName) {
        this.PublishDBName = PublishDBName;
    }

    /**
     * Get 订阅库名字，用于筛选 
     * @return SubscribeDBName 订阅库名字，用于筛选
     */
    public String getSubscribeDBName() {
        return this.SubscribeDBName;
    }

    /**
     * Set 订阅库名字，用于筛选
     * @param SubscribeDBName 订阅库名字，用于筛选
     */
    public void setSubscribeDBName(String SubscribeDBName) {
        this.SubscribeDBName = SubscribeDBName;
    }

    /**
     * Get 分页，页数 
     * @return Offset 分页，页数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页，页数
     * @param Offset 分页，页数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页，页大小 
     * @return Limit 分页，页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页，页大小
     * @param Limit 分页，页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PubOrSubInstanceId", this.PubOrSubInstanceId);
        this.setParamSimple(map, prefix + "PubOrSubInstanceIp", this.PubOrSubInstanceIp);
        this.setParamSimple(map, prefix + "PublishSubscribeId", this.PublishSubscribeId);
        this.setParamSimple(map, prefix + "PublishSubscribeName", this.PublishSubscribeName);
        this.setParamSimple(map, prefix + "PublishDBName", this.PublishDBName);
        this.setParamSimple(map, prefix + "SubscribeDBName", this.SubscribeDBName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

