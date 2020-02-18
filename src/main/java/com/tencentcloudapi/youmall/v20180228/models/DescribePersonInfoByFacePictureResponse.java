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

public class DescribePersonInfoByFacePictureResponse extends AbstractModel{

    /**
    * 集团id
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 店铺id
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 顾客face id
    */
    @SerializedName("PersonId")
    @Expose
    private Long PersonId;

    /**
    * 顾客底图url
    */
    @SerializedName("PictureUrl")
    @Expose
    private String PictureUrl;

    /**
    * 顾客类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
    */
    @SerializedName("PersonType")
    @Expose
    private Long PersonType;

    /**
    * 顾客首次进店时间
    */
    @SerializedName("FirstVisitTime")
    @Expose
    private String FirstVisitTime;

    /**
    * 顾客历史到访次数
    */
    @SerializedName("VisitTimes")
    @Expose
    private Long VisitTimes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集团id 
     * @return CompanyId 集团id
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 集团id
     * @param CompanyId 集团id
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 店铺id 
     * @return ShopId 店铺id
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 店铺id
     * @param ShopId 店铺id
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 顾客face id 
     * @return PersonId 顾客face id
     */
    public Long getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 顾客face id
     * @param PersonId 顾客face id
     */
    public void setPersonId(Long PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 顾客底图url 
     * @return PictureUrl 顾客底图url
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * Set 顾客底图url
     * @param PictureUrl 顾客底图url
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
    }

    /**
     * Get 顾客类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单） 
     * @return PersonType 顾客类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public Long getPersonType() {
        return this.PersonType;
    }

    /**
     * Set 顾客类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     * @param PersonType 顾客类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public void setPersonType(Long PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * Get 顾客首次进店时间 
     * @return FirstVisitTime 顾客首次进店时间
     */
    public String getFirstVisitTime() {
        return this.FirstVisitTime;
    }

    /**
     * Set 顾客首次进店时间
     * @param FirstVisitTime 顾客首次进店时间
     */
    public void setFirstVisitTime(String FirstVisitTime) {
        this.FirstVisitTime = FirstVisitTime;
    }

    /**
     * Get 顾客历史到访次数 
     * @return VisitTimes 顾客历史到访次数
     */
    public Long getVisitTimes() {
        return this.VisitTimes;
    }

    /**
     * Set 顾客历史到访次数
     * @param VisitTimes 顾客历史到访次数
     */
    public void setVisitTimes(Long VisitTimes) {
        this.VisitTimes = VisitTimes;
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
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "FirstVisitTime", this.FirstVisitTime);
        this.setParamSimple(map, prefix + "VisitTimes", this.VisitTimes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

