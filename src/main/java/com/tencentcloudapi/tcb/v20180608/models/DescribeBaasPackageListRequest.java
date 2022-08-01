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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaasPackageListRequest extends AbstractModel{

    /**
    * tcb产品套餐ID，不填拉取全量package信息。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 套餐归属方，填写后只返回对应的套餐 包含miniapp与qcloud两种 默认为miniapp
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 套餐归属环境渠道
    */
    @SerializedName("EnvChannel")
    @Expose
    private String EnvChannel;

    /**
    * 拉取套餐用途：
1）new 新购
2）modify变配
3）renew续费
    */
    @SerializedName("TargetAction")
    @Expose
    private String TargetAction;

    /**
    * 预留字段，同一商品会对应多个类型套餐，对指标有不同侧重。
计算型calculation
流量型flux
容量型capactiy
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 类型分组过滤。默认为["default"]
    */
    @SerializedName("PackageTypeList")
    @Expose
    private String [] PackageTypeList;

    /**
    * 付费渠道，与回包billTags中的计费参数相关，不填返回默认值。
    */
    @SerializedName("PaymentChannel")
    @Expose
    private String PaymentChannel;

    /**
     * Get tcb产品套餐ID，不填拉取全量package信息。 
     * @return PackageName tcb产品套餐ID，不填拉取全量package信息。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set tcb产品套餐ID，不填拉取全量package信息。
     * @param PackageName tcb产品套餐ID，不填拉取全量package信息。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 套餐归属方，填写后只返回对应的套餐 包含miniapp与qcloud两种 默认为miniapp 
     * @return Source 套餐归属方，填写后只返回对应的套餐 包含miniapp与qcloud两种 默认为miniapp
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 套餐归属方，填写后只返回对应的套餐 包含miniapp与qcloud两种 默认为miniapp
     * @param Source 套餐归属方，填写后只返回对应的套餐 包含miniapp与qcloud两种 默认为miniapp
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 套餐归属环境渠道 
     * @return EnvChannel 套餐归属环境渠道
     */
    public String getEnvChannel() {
        return this.EnvChannel;
    }

    /**
     * Set 套餐归属环境渠道
     * @param EnvChannel 套餐归属环境渠道
     */
    public void setEnvChannel(String EnvChannel) {
        this.EnvChannel = EnvChannel;
    }

    /**
     * Get 拉取套餐用途：
1）new 新购
2）modify变配
3）renew续费 
     * @return TargetAction 拉取套餐用途：
1）new 新购
2）modify变配
3）renew续费
     */
    public String getTargetAction() {
        return this.TargetAction;
    }

    /**
     * Set 拉取套餐用途：
1）new 新购
2）modify变配
3）renew续费
     * @param TargetAction 拉取套餐用途：
1）new 新购
2）modify变配
3）renew续费
     */
    public void setTargetAction(String TargetAction) {
        this.TargetAction = TargetAction;
    }

    /**
     * Get 预留字段，同一商品会对应多个类型套餐，对指标有不同侧重。
计算型calculation
流量型flux
容量型capactiy 
     * @return GroupName 预留字段，同一商品会对应多个类型套餐，对指标有不同侧重。
计算型calculation
流量型flux
容量型capactiy
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 预留字段，同一商品会对应多个类型套餐，对指标有不同侧重。
计算型calculation
流量型flux
容量型capactiy
     * @param GroupName 预留字段，同一商品会对应多个类型套餐，对指标有不同侧重。
计算型calculation
流量型flux
容量型capactiy
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 类型分组过滤。默认为["default"] 
     * @return PackageTypeList 类型分组过滤。默认为["default"]
     */
    public String [] getPackageTypeList() {
        return this.PackageTypeList;
    }

    /**
     * Set 类型分组过滤。默认为["default"]
     * @param PackageTypeList 类型分组过滤。默认为["default"]
     */
    public void setPackageTypeList(String [] PackageTypeList) {
        this.PackageTypeList = PackageTypeList;
    }

    /**
     * Get 付费渠道，与回包billTags中的计费参数相关，不填返回默认值。 
     * @return PaymentChannel 付费渠道，与回包billTags中的计费参数相关，不填返回默认值。
     */
    public String getPaymentChannel() {
        return this.PaymentChannel;
    }

    /**
     * Set 付费渠道，与回包billTags中的计费参数相关，不填返回默认值。
     * @param PaymentChannel 付费渠道，与回包billTags中的计费参数相关，不填返回默认值。
     */
    public void setPaymentChannel(String PaymentChannel) {
        this.PaymentChannel = PaymentChannel;
    }

    public DescribeBaasPackageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaasPackageListRequest(DescribeBaasPackageListRequest source) {
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.EnvChannel != null) {
            this.EnvChannel = new String(source.EnvChannel);
        }
        if (source.TargetAction != null) {
            this.TargetAction = new String(source.TargetAction);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.PackageTypeList != null) {
            this.PackageTypeList = new String[source.PackageTypeList.length];
            for (int i = 0; i < source.PackageTypeList.length; i++) {
                this.PackageTypeList[i] = new String(source.PackageTypeList[i]);
            }
        }
        if (source.PaymentChannel != null) {
            this.PaymentChannel = new String(source.PaymentChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "EnvChannel", this.EnvChannel);
        this.setParamSimple(map, prefix + "TargetAction", this.TargetAction);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArraySimple(map, prefix + "PackageTypeList.", this.PackageTypeList);
        this.setParamSimple(map, prefix + "PaymentChannel", this.PaymentChannel);

    }
}

