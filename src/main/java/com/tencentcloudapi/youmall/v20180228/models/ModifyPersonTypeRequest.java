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

public class ModifyPersonTypeRequest  extends AbstractModel{

    /**
    * 集团ID
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
    * 顾客ID
    */
    @SerializedName("PersonId")
    @Expose
    private Integer PersonId;

    /**
    * 身份类型(0表示普通顾客，1 白名单，2 表示黑名单）
    */
    @SerializedName("PersonType")
    @Expose
    private Integer PersonType;

    /**
    * 身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册会员，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
    */
    @SerializedName("PersonSubType")
    @Expose
    private Integer PersonSubType;

    /**
     * 获取集团ID
     * @return CompanyId 集团ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置集团ID
     * @param CompanyId 集团ID
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
     * 获取顾客ID
     * @return PersonId 顾客ID
     */
    public Integer getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置顾客ID
     * @param PersonId 顾客ID
     */
    public void setPersonId(Integer PersonId) {
        this.PersonId = PersonId;
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
     * 获取身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册会员，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
     * @return PersonSubType 身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册会员，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
     */
    public Integer getPersonSubType() {
        return this.PersonSubType;
    }

    /**
     * 设置身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册会员，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
     * @param PersonSubType 身份子类型:
PersonType=0时(普通顾客)，0普通顾客
PersonType=1时(白名单)，0店员，1商场人员，2其他类型人员，3区域经理，4注册会员，5VIP用户
PersonType=2时(黑名单)，0普通黑名单，1小偷)
     */
    public void setPersonSubType(Integer PersonSubType) {
        this.PersonSubType = PersonSubType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "PersonSubType", this.PersonSubType);

    }
}

