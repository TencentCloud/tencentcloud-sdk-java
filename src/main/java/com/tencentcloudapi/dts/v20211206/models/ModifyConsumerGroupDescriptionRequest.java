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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyConsumerGroupDescriptionRequest extends AbstractModel {

    /**
    * 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。
请务必保证消费组名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * 账户名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName}。
请务必保证账户名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 修改之后的消费组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。 
     * @return SubscribeId 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。
     * @param SubscribeId 数据订阅实例的 ID，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。
请务必保证消费组名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。 
     * @return ConsumerGroupName 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。
请务必保证消费组名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。
请务必保证消费组名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。
     * @param ConsumerGroupName 消费组名称。实际的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}。
请务必保证消费组名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get 账户名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName}。
请务必保证账户名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。 
     * @return AccountName 账户名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName}。
请务必保证账户名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账户名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName}。
请务必保证账户名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。
     * @param AccountName 账户名称。实际的账户全称形如：account-#{SubscribeId}-#{AccountName}。
请务必保证账户名称正确。可通过[DescribeConsumerGroups](https://cloud.tencent.com/document/product/571/102947)接口获取。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 修改之后的消费组描述 
     * @return Description 修改之后的消费组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 修改之后的消费组描述
     * @param Description 修改之后的消费组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyConsumerGroupDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsumerGroupDescriptionRequest(ModifyConsumerGroupDescriptionRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "ConsumerGroupName", this.ConsumerGroupName);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

