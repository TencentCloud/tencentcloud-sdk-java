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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePersonInfoRequest  extends AbstractModel{

    /**
    * 公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 门店ID
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
    * 起始ID，第一次拉取时StartPersonId传0，后续送入的值为上一页最后一条数据项的PersonId
    */
    @SerializedName("StartPersonId")
    @Expose
    private Integer StartPersonId;

    /**
    * 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * Limit:每页的数据项，最大100，超过100会被强制指定为100
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
    */
    @SerializedName("PictureExpires")
    @Expose
    private Integer PictureExpires;

    /**
    * 身份类型(0表示普通顾客，1 白名单，2 表示黑名单）
    */
    @SerializedName("PersonType")
    @Expose
    private Integer PersonType;

    /**
     * 获取公司ID
     * @return CompanyId 公司ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置公司ID
     * @param CompanyId 公司ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * 获取门店ID
     * @return ShopId 门店ID
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置门店ID
     * @param ShopId 门店ID
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取起始ID，第一次拉取时StartPersonId传0，后续送入的值为上一页最后一条数据项的PersonId
     * @return StartPersonId 起始ID，第一次拉取时StartPersonId传0，后续送入的值为上一页最后一条数据项的PersonId
     */
    public Integer getStartPersonId() {
        return this.StartPersonId;
    }

    /**
     * 设置起始ID，第一次拉取时StartPersonId传0，后续送入的值为上一页最后一条数据项的PersonId
     * @param StartPersonId 起始ID，第一次拉取时StartPersonId传0，后续送入的值为上一页最后一条数据项的PersonId
     */
    public void setStartPersonId(Integer StartPersonId) {
        this.StartPersonId = StartPersonId;
    }

    /**
     * 获取偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     * @return Offset 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     * @param Offset 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取Limit:每页的数据项，最大100，超过100会被强制指定为100
     * @return Limit Limit:每页的数据项，最大100，超过100会被强制指定为100
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置Limit:每页的数据项，最大100，超过100会被强制指定为100
     * @param Limit Limit:每页的数据项，最大100，超过100会被强制指定为100
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     * @return PictureExpires 图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     */
    public Integer getPictureExpires() {
        return this.PictureExpires;
    }

    /**
     * 设置图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     * @param PictureExpires 图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     */
    public void setPictureExpires(Integer PictureExpires) {
        this.PictureExpires = PictureExpires;
    }

    /**
     * 获取身份类型(0表示普通顾客，1 白名单，2 表示黑名单）
     * @return PersonType 身份类型(0表示普通顾客，1 白名单，2 表示黑名单）
     */
    public Integer getPersonType() {
        return this.PersonType;
    }

    /**
     * 设置身份类型(0表示普通顾客，1 白名单，2 表示黑名单）
     * @param PersonType 身份类型(0表示普通顾客，1 白名单，2 表示黑名单）
     */
    public void setPersonType(Integer PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "StartPersonId", this.StartPersonId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PictureExpires", this.PictureExpires);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);

    }
}

