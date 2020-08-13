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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Package extends AbstractModel{

    /**
    * 订单id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 曲库包名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 授权地区-global: 全球  CN: 中国
    */
    @SerializedName("AuthorizedArea")
    @Expose
    private String AuthorizedArea;

    /**
    * 授权次数
    */
    @SerializedName("AuthorizedLimit")
    @Expose
    private Long AuthorizedLimit;

    /**
    * 套餐有效期，单位:天
    */
    @SerializedName("TermOfValidity")
    @Expose
    private Long TermOfValidity;

    /**
    * 0:不可商业化；1:可商业化
    */
    @SerializedName("Commercial")
    @Expose
    private Long Commercial;

    /**
    * 套餐价格，单位：元
    */
    @SerializedName("PackagePrice")
    @Expose
    private Float PackagePrice;

    /**
    * 生效开始时间,格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EffectTime")
    @Expose
    private String EffectTime;

    /**
    * 生效结束时间,格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 剩余授权次数
    */
    @SerializedName("UsedCount")
    @Expose
    private Long UsedCount;

    /**
    * 曲库包用途信息
    */
    @SerializedName("UseRanges")
    @Expose
    private UseRange [] UseRanges;

    /**
     * Get 订单id 
     * @return OrderId 订单id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id
     * @param OrderId 订单id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 曲库包名称 
     * @return Name 曲库包名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 曲库包名称
     * @param Name 曲库包名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 授权地区-global: 全球  CN: 中国 
     * @return AuthorizedArea 授权地区-global: 全球  CN: 中国
     */
    public String getAuthorizedArea() {
        return this.AuthorizedArea;
    }

    /**
     * Set 授权地区-global: 全球  CN: 中国
     * @param AuthorizedArea 授权地区-global: 全球  CN: 中国
     */
    public void setAuthorizedArea(String AuthorizedArea) {
        this.AuthorizedArea = AuthorizedArea;
    }

    /**
     * Get 授权次数 
     * @return AuthorizedLimit 授权次数
     */
    public Long getAuthorizedLimit() {
        return this.AuthorizedLimit;
    }

    /**
     * Set 授权次数
     * @param AuthorizedLimit 授权次数
     */
    public void setAuthorizedLimit(Long AuthorizedLimit) {
        this.AuthorizedLimit = AuthorizedLimit;
    }

    /**
     * Get 套餐有效期，单位:天 
     * @return TermOfValidity 套餐有效期，单位:天
     */
    public Long getTermOfValidity() {
        return this.TermOfValidity;
    }

    /**
     * Set 套餐有效期，单位:天
     * @param TermOfValidity 套餐有效期，单位:天
     */
    public void setTermOfValidity(Long TermOfValidity) {
        this.TermOfValidity = TermOfValidity;
    }

    /**
     * Get 0:不可商业化；1:可商业化 
     * @return Commercial 0:不可商业化；1:可商业化
     */
    public Long getCommercial() {
        return this.Commercial;
    }

    /**
     * Set 0:不可商业化；1:可商业化
     * @param Commercial 0:不可商业化；1:可商业化
     */
    public void setCommercial(Long Commercial) {
        this.Commercial = Commercial;
    }

    /**
     * Get 套餐价格，单位：元 
     * @return PackagePrice 套餐价格，单位：元
     */
    public Float getPackagePrice() {
        return this.PackagePrice;
    }

    /**
     * Set 套餐价格，单位：元
     * @param PackagePrice 套餐价格，单位：元
     */
    public void setPackagePrice(Float PackagePrice) {
        this.PackagePrice = PackagePrice;
    }

    /**
     * Get 生效开始时间,格式yyyy-MM-dd HH:mm:ss 
     * @return EffectTime 生效开始时间,格式yyyy-MM-dd HH:mm:ss
     */
    public String getEffectTime() {
        return this.EffectTime;
    }

    /**
     * Set 生效开始时间,格式yyyy-MM-dd HH:mm:ss
     * @param EffectTime 生效开始时间,格式yyyy-MM-dd HH:mm:ss
     */
    public void setEffectTime(String EffectTime) {
        this.EffectTime = EffectTime;
    }

    /**
     * Get 生效结束时间,格式yyyy-MM-dd HH:mm:ss 
     * @return ExpireTime 生效结束时间,格式yyyy-MM-dd HH:mm:ss
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 生效结束时间,格式yyyy-MM-dd HH:mm:ss
     * @param ExpireTime 生效结束时间,格式yyyy-MM-dd HH:mm:ss
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 剩余授权次数 
     * @return UsedCount 剩余授权次数
     */
    public Long getUsedCount() {
        return this.UsedCount;
    }

    /**
     * Set 剩余授权次数
     * @param UsedCount 剩余授权次数
     */
    public void setUsedCount(Long UsedCount) {
        this.UsedCount = UsedCount;
    }

    /**
     * Get 曲库包用途信息 
     * @return UseRanges 曲库包用途信息
     */
    public UseRange [] getUseRanges() {
        return this.UseRanges;
    }

    /**
     * Set 曲库包用途信息
     * @param UseRanges 曲库包用途信息
     */
    public void setUseRanges(UseRange [] UseRanges) {
        this.UseRanges = UseRanges;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AuthorizedArea", this.AuthorizedArea);
        this.setParamSimple(map, prefix + "AuthorizedLimit", this.AuthorizedLimit);
        this.setParamSimple(map, prefix + "TermOfValidity", this.TermOfValidity);
        this.setParamSimple(map, prefix + "Commercial", this.Commercial);
        this.setParamSimple(map, prefix + "PackagePrice", this.PackagePrice);
        this.setParamSimple(map, prefix + "EffectTime", this.EffectTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "UsedCount", this.UsedCount);
        this.setParamArrayObj(map, prefix + "UseRanges.", this.UseRanges);

    }
}

