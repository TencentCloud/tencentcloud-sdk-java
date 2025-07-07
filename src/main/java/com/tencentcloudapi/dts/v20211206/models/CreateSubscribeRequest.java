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

public class CreateSubscribeRequest extends AbstractModel {

    /**
    * 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 付费方式，枚举值：0-包年包月，1-按量计费
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 购买数量,默认为1，最大为10
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 实例资源标签
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * 任务名，自定义
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版) 
     * @return Product 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)
     * @param Product 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 付费方式，枚举值：0-包年包月，1-按量计费 
     * @return PayType 付费方式，枚举值：0-包年包月，1-按量计费
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 付费方式，枚举值：0-包年包月，1-按量计费
     * @param PayType 付费方式，枚举值：0-包年包月，1-按量计费
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1 
     * @return Duration 购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1
     * @param Duration 购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。 
     * @return AutoRenew 是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。
     * @param AutoRenew 是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 购买数量,默认为1，最大为10 
     * @return Count 购买数量,默认为1，最大为10
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 购买数量,默认为1，最大为10
     * @param Count 购买数量,默认为1，最大为10
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 实例资源标签 
     * @return Tags 实例资源标签
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例资源标签
     * @param Tags 实例资源标签
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 任务名，自定义 
     * @return Name 任务名，自定义
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名，自定义
     * @param Name 任务名，自定义
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CreateSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubscribeRequest(CreateSubscribeRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

