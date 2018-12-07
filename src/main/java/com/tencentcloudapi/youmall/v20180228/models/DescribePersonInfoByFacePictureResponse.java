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

public class DescribePersonInfoByFacePictureResponse  extends AbstractModel{

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
    private Integer ShopId;

    /**
    * 顾客face id
    */
    @SerializedName("PersonId")
    @Expose
    private Integer PersonId;

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
    private Integer PersonType;

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
    private Integer VisitTimes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取集团id
     * @return CompanyId 集团id
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置集团id
     * @param CompanyId 集团id
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * 获取店铺id
     * @return ShopId 店铺id
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置店铺id
     * @param ShopId 店铺id
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取顾客face id
     * @return PersonId 顾客face id
     */
    public Integer getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置顾客face id
     * @param PersonId 顾客face id
     */
    public void setPersonId(Integer PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取顾客底图url
     * @return PictureUrl 顾客底图url
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * 设置顾客底图url
     * @param PictureUrl 顾客底图url
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
    }

    /**
     * 获取顾客类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     * @return PersonType 顾客类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public Integer getPersonType() {
        return this.PersonType;
    }

    /**
     * 设置顾客类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     * @param PersonType 顾客类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public void setPersonType(Integer PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * 获取顾客首次进店时间
     * @return FirstVisitTime 顾客首次进店时间
     */
    public String getFirstVisitTime() {
        return this.FirstVisitTime;
    }

    /**
     * 设置顾客首次进店时间
     * @param FirstVisitTime 顾客首次进店时间
     */
    public void setFirstVisitTime(String FirstVisitTime) {
        this.FirstVisitTime = FirstVisitTime;
    }

    /**
     * 获取顾客历史到访次数
     * @return VisitTimes 顾客历史到访次数
     */
    public Integer getVisitTimes() {
        return this.VisitTimes;
    }

    /**
     * 设置顾客历史到访次数
     * @param VisitTimes 顾客历史到访次数
     */
    public void setVisitTimes(Integer VisitTimes) {
        this.VisitTimes = VisitTimes;
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
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "FirstVisitTime", this.FirstVisitTime);
        this.setParamSimple(map, prefix + "VisitTimes", this.VisitTimes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

