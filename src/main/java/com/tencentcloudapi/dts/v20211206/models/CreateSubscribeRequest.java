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
    * <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>付费方式，枚举值：0-包年包月，1-按量计费</p>
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * <p>购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>购买数量,默认为1，最大为10</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>实例资源标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * <p>任务名，自定义</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>数据订阅版本，目前支持kafka和kafkaPro（专业版），如果不填，默认kafkaPro</p>
    */
    @SerializedName("SubscribeVersion")
    @Expose
    private String SubscribeVersion;

    /**
    * <p>订阅实例规格，当前仅支持small、medium、large</p>
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
     * Get <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p> 
     * @return Product <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p>
     * @param Product <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>付费方式，枚举值：0-包年包月，1-按量计费</p> 
     * @return PayType <p>付费方式，枚举值：0-包年包月，1-按量计费</p>
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>付费方式，枚举值：0-包年包月，1-按量计费</p>
     * @param PayType <p>付费方式，枚举值：0-包年包月，1-按量计费</p>
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1</p> 
     * @return Duration <p>购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1</p>
     * @param Duration <p>购买时长。当 payType 为包年包月时，该项需要填，单位为月，最小值为 1，最大值为 120。不填默认1</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。</p> 
     * @return AutoRenew <p>是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。</p>
     * @param AutoRenew <p>是否自动续费。当 payType 为包年包月时，该项需要填。枚举值：0-不自动续费，1-自动续费。默认不自动续费。按量计费设置该标识无效。</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>购买数量,默认为1，最大为10</p> 
     * @return Count <p>购买数量,默认为1，最大为10</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>购买数量,默认为1，最大为10</p>
     * @param Count <p>购买数量,默认为1，最大为10</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>实例资源标签</p> 
     * @return Tags <p>实例资源标签</p>
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例资源标签</p>
     * @param Tags <p>实例资源标签</p>
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>任务名，自定义</p> 
     * @return Name <p>任务名，自定义</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名，自定义</p>
     * @param Name <p>任务名，自定义</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>数据订阅版本，目前支持kafka和kafkaPro（专业版），如果不填，默认kafkaPro</p> 
     * @return SubscribeVersion <p>数据订阅版本，目前支持kafka和kafkaPro（专业版），如果不填，默认kafkaPro</p>
     */
    public String getSubscribeVersion() {
        return this.SubscribeVersion;
    }

    /**
     * Set <p>数据订阅版本，目前支持kafka和kafkaPro（专业版），如果不填，默认kafkaPro</p>
     * @param SubscribeVersion <p>数据订阅版本，目前支持kafka和kafkaPro（专业版），如果不填，默认kafkaPro</p>
     */
    public void setSubscribeVersion(String SubscribeVersion) {
        this.SubscribeVersion = SubscribeVersion;
    }

    /**
     * Get <p>订阅实例规格，当前仅支持small、medium、large</p> 
     * @return InstanceClass <p>订阅实例规格，当前仅支持small、medium、large</p>
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set <p>订阅实例规格，当前仅支持small、medium、large</p>
     * @param InstanceClass <p>订阅实例规格，当前仅支持small、medium、large</p>
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
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
        if (source.SubscribeVersion != null) {
            this.SubscribeVersion = new String(source.SubscribeVersion);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
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
        this.setParamSimple(map, prefix + "SubscribeVersion", this.SubscribeVersion);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);

    }
}

