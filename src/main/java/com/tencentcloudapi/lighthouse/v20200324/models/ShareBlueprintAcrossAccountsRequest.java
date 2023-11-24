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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareBlueprintAcrossAccountsRequest extends AbstractModel {

    /**
    * 镜像ID, 可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * 接收共享镜像的账号Id列表。账号ID不同于QQ号，查询用户账号ID请查看账号信息中的账号ID栏。账号个数取值最大为10。
    */
    @SerializedName("AccountIds")
    @Expose
    private String [] AccountIds;

    /**
     * Get 镜像ID, 可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。 
     * @return BlueprintId 镜像ID, 可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set 镜像ID, 可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。
     * @param BlueprintId 镜像ID, 可以通过[DescribeBlueprints](https://cloud.tencent.com/document/product/1207/47689)接口返回的BlueprintId获取。
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get 接收共享镜像的账号Id列表。账号ID不同于QQ号，查询用户账号ID请查看账号信息中的账号ID栏。账号个数取值最大为10。 
     * @return AccountIds 接收共享镜像的账号Id列表。账号ID不同于QQ号，查询用户账号ID请查看账号信息中的账号ID栏。账号个数取值最大为10。
     */
    public String [] getAccountIds() {
        return this.AccountIds;
    }

    /**
     * Set 接收共享镜像的账号Id列表。账号ID不同于QQ号，查询用户账号ID请查看账号信息中的账号ID栏。账号个数取值最大为10。
     * @param AccountIds 接收共享镜像的账号Id列表。账号ID不同于QQ号，查询用户账号ID请查看账号信息中的账号ID栏。账号个数取值最大为10。
     */
    public void setAccountIds(String [] AccountIds) {
        this.AccountIds = AccountIds;
    }

    public ShareBlueprintAcrossAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareBlueprintAcrossAccountsRequest(ShareBlueprintAcrossAccountsRequest source) {
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.AccountIds != null) {
            this.AccountIds = new String[source.AccountIds.length];
            for (int i = 0; i < source.AccountIds.length; i++) {
                this.AccountIds[i] = new String(source.AccountIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamArraySimple(map, prefix + "AccountIds.", this.AccountIds);

    }
}

