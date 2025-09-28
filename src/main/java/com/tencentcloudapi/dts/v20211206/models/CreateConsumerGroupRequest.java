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

public class CreateConsumerGroupRequest extends AbstractModel {

    /**
    * 订阅实例id，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。

    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 消费组名称，以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}
    */
    @SerializedName("ConsumerGroupName")
    @Expose
    private String ConsumerGroupName;

    /**
    * 账号名称。以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的账户全称形如：account-#{SubscribeId}-#{AccountName}
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 消费组密码，长度必须大于3
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 消费组备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 订阅实例id，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。
 
     * @return SubscribeId 订阅实例id，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。

     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 订阅实例id，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。

     * @param SubscribeId 订阅实例id，可通过[DescribeSubscribeJobs](https://cloud.tencent.com/document/product/571/102943)接口获取。

     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 消费组名称，以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName} 
     * @return ConsumerGroupName 消费组名称，以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}
     */
    public String getConsumerGroupName() {
        return this.ConsumerGroupName;
    }

    /**
     * Set 消费组名称，以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}
     * @param ConsumerGroupName 消费组名称，以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的消费组全称形如：consumer-grp-#{SubscribeId}-#{ConsumerGroupName}
     */
    public void setConsumerGroupName(String ConsumerGroupName) {
        this.ConsumerGroupName = ConsumerGroupName;
    }

    /**
     * Get 账号名称。以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的账户全称形如：account-#{SubscribeId}-#{AccountName} 
     * @return AccountName 账号名称。以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的账户全称形如：account-#{SubscribeId}-#{AccountName}
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号名称。以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的账户全称形如：account-#{SubscribeId}-#{AccountName}
     * @param AccountName 账号名称。以数字、字母(大小写)或者_ - .开头，以数字、字母(大小写)结尾。实际生成的账户全称形如：account-#{SubscribeId}-#{AccountName}
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 消费组密码，长度必须大于3 
     * @return Password 消费组密码，长度必须大于3
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 消费组密码，长度必须大于3
     * @param Password 消费组密码，长度必须大于3
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 消费组备注 
     * @return Description 消费组备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 消费组备注
     * @param Description 消费组备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsumerGroupRequest(CreateConsumerGroupRequest source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.ConsumerGroupName != null) {
            this.ConsumerGroupName = new String(source.ConsumerGroupName);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
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
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

