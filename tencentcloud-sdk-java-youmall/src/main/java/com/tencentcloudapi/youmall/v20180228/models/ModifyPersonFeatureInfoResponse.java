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

public class ModifyPersonFeatureInfoResponse extends AbstractModel{

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
    private Long ShopId;

    /**
    * 请求的顾客id
    */
    @SerializedName("PersonId")
    @Expose
    private Long PersonId;

    /**
    * 图片实际绑定person_id，可能与请求的person_id不同，以此id为准
    */
    @SerializedName("PersonIdBind")
    @Expose
    private Long PersonIdBind;

    /**
    * 请求的顾客类型
    */
    @SerializedName("PersonType")
    @Expose
    private Long PersonType;

    /**
    * 与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人
    */
    @SerializedName("SimilarPersonIds")
    @Expose
    private Long [] SimilarPersonIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集团ID 
     * @return CompanyId 集团ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 集团ID
     * @param CompanyId 集团ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 店铺ID，如果不填表示操作集团身份库 
     * @return ShopId 店铺ID，如果不填表示操作集团身份库
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 店铺ID，如果不填表示操作集团身份库
     * @param ShopId 店铺ID，如果不填表示操作集团身份库
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 请求的顾客id 
     * @return PersonId 请求的顾客id
     */
    public Long getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 请求的顾客id
     * @param PersonId 请求的顾客id
     */
    public void setPersonId(Long PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 图片实际绑定person_id，可能与请求的person_id不同，以此id为准 
     * @return PersonIdBind 图片实际绑定person_id，可能与请求的person_id不同，以此id为准
     */
    public Long getPersonIdBind() {
        return this.PersonIdBind;
    }

    /**
     * Set 图片实际绑定person_id，可能与请求的person_id不同，以此id为准
     * @param PersonIdBind 图片实际绑定person_id，可能与请求的person_id不同，以此id为准
     */
    public void setPersonIdBind(Long PersonIdBind) {
        this.PersonIdBind = PersonIdBind;
    }

    /**
     * Get 请求的顾客类型 
     * @return PersonType 请求的顾客类型
     */
    public Long getPersonType() {
        return this.PersonType;
    }

    /**
     * Set 请求的顾客类型
     * @param PersonType 请求的顾客类型
     */
    public void setPersonType(Long PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * Get 与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人 
     * @return SimilarPersonIds 与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人
     */
    public Long [] getSimilarPersonIds() {
        return this.SimilarPersonIds;
    }

    /**
     * Set 与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人
     * @param SimilarPersonIds 与请求的person_id类型相同、与请求图片特征相似的一个或多个person_id，需要额外确认这些id是否是同一个人
     */
    public void setSimilarPersonIds(Long [] SimilarPersonIds) {
        this.SimilarPersonIds = SimilarPersonIds;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
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

