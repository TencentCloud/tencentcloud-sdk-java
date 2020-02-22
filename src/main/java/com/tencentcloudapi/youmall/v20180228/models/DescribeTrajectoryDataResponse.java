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

public class DescribeTrajectoryDataResponse extends AbstractModel{

    /**
    * 集团ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 店铺ID
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 总人数
    */
    @SerializedName("TotalPerson")
    @Expose
    private Long TotalPerson;

    /**
    * 总动迹数目
    */
    @SerializedName("TotalTrajectory")
    @Expose
    private Long TotalTrajectory;

    /**
    * 返回动迹中的总人数
    */
    @SerializedName("Person")
    @Expose
    private Long Person;

    /**
    * 返回动迹的数目
    */
    @SerializedName("Trajectory")
    @Expose
    private Long Trajectory;

    /**
    * 返回动迹的具体信息
    */
    @SerializedName("Data")
    @Expose
    private TrajectorySunData [] Data;

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
     * Get 店铺ID 
     * @return ShopId 店铺ID
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 店铺ID
     * @param ShopId 店铺ID
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 总人数 
     * @return TotalPerson 总人数
     */
    public Long getTotalPerson() {
        return this.TotalPerson;
    }

    /**
     * Set 总人数
     * @param TotalPerson 总人数
     */
    public void setTotalPerson(Long TotalPerson) {
        this.TotalPerson = TotalPerson;
    }

    /**
     * Get 总动迹数目 
     * @return TotalTrajectory 总动迹数目
     */
    public Long getTotalTrajectory() {
        return this.TotalTrajectory;
    }

    /**
     * Set 总动迹数目
     * @param TotalTrajectory 总动迹数目
     */
    public void setTotalTrajectory(Long TotalTrajectory) {
        this.TotalTrajectory = TotalTrajectory;
    }

    /**
     * Get 返回动迹中的总人数 
     * @return Person 返回动迹中的总人数
     */
    public Long getPerson() {
        return this.Person;
    }

    /**
     * Set 返回动迹中的总人数
     * @param Person 返回动迹中的总人数
     */
    public void setPerson(Long Person) {
        this.Person = Person;
    }

    /**
     * Get 返回动迹的数目 
     * @return Trajectory 返回动迹的数目
     */
    public Long getTrajectory() {
        return this.Trajectory;
    }

    /**
     * Set 返回动迹的数目
     * @param Trajectory 返回动迹的数目
     */
    public void setTrajectory(Long Trajectory) {
        this.Trajectory = Trajectory;
    }

    /**
     * Get 返回动迹的具体信息 
     * @return Data 返回动迹的具体信息
     */
    public TrajectorySunData [] getData() {
        return this.Data;
    }

    /**
     * Set 返回动迹的具体信息
     * @param Data 返回动迹的具体信息
     */
    public void setData(TrajectorySunData [] Data) {
        this.Data = Data;
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
        this.setParamSimple(map, prefix + "TotalPerson", this.TotalPerson);
        this.setParamSimple(map, prefix + "TotalTrajectory", this.TotalTrajectory);
        this.setParamSimple(map, prefix + "Person", this.Person);
        this.setParamSimple(map, prefix + "Trajectory", this.Trajectory);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

