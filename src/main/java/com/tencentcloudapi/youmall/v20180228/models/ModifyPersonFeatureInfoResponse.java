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

public class ModifyPersonFeatureInfoResponse  extends AbstractModel{

    /**
    * 集团ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 店铺ID，如果不填表示操作集团身份库
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
    * 请求的顾客id
    */
    @SerializedName("PersonId")
    @Expose
    private Integer PersonId;

    /**
    * 图片实际绑定person_id，可能与请求的person_id不同，以此id为准
    */
    @SerializedName("PersonIdBind")
    @Expose
    private Integer PersonIdBind;

    /**
    * 请求的顾客类型
    */
    @SerializedName("PersonType")
    @Expose
    private Integer PersonType;

    /**
    * 与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人
    */
    @SerializedName("SimilarPersonIds")
    @Expose
    private Integer [] SimilarPersonIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * 获取店铺ID，如果不填表示操作集团身份库
     * @return ShopId 店铺ID，如果不填表示操作集团身份库
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置店铺ID，如果不填表示操作集团身份库
     * @param ShopId 店铺ID，如果不填表示操作集团身份库
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取请求的顾客id
     * @return PersonId 请求的顾客id
     */
    public Integer getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置请求的顾客id
     * @param PersonId 请求的顾客id
     */
    public void setPersonId(Integer PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取图片实际绑定person_id，可能与请求的person_id不同，以此id为准
     * @return PersonIdBind 图片实际绑定person_id，可能与请求的person_id不同，以此id为准
     */
    public Integer getPersonIdBind() {
        return this.PersonIdBind;
    }

    /**
     * 设置图片实际绑定person_id，可能与请求的person_id不同，以此id为准
     * @param PersonIdBind 图片实际绑定person_id，可能与请求的person_id不同，以此id为准
     */
    public void setPersonIdBind(Integer PersonIdBind) {
        this.PersonIdBind = PersonIdBind;
    }

    /**
     * 获取请求的顾客类型
     * @return PersonType 请求的顾客类型
     */
    public Integer getPersonType() {
        return this.PersonType;
    }

    /**
     * 设置请求的顾客类型
     * @param PersonType 请求的顾客类型
     */
    public void setPersonType(Integer PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * 获取与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人
     * @return SimilarPersonIds 与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人
     */
    public Integer [] getSimilarPersonIds() {
        return this.SimilarPersonIds;
    }

    /**
     * 设置与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人
     * @param SimilarPersonIds 与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人
     */
    public void setSimilarPersonIds(Integer [] SimilarPersonIds) {
        this.SimilarPersonIds = SimilarPersonIds;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "PersonIdBind", this.PersonIdBind);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamArraySimple(map, prefix + "SimilarPersonIds.", this.SimilarPersonIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

