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

public class DescribeTrajectoryDataResponse  extends AbstractModel{

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
    private Integer ShopId;

    /**
    * 总人数
    */
    @SerializedName("TotalPerson")
    @Expose
    private Integer TotalPerson;

    /**
    * 总动迹数目
    */
    @SerializedName("TotalTrajectory")
    @Expose
    private Integer TotalTrajectory;

    /**
    * 返回动迹中的总人数
    */
    @SerializedName("Person")
    @Expose
    private Integer Person;

    /**
    * 返回动迹的数目
    */
    @SerializedName("Trajectory")
    @Expose
    private Integer Trajectory;

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
     * 获取店铺ID
     * @return ShopId 店铺ID
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置店铺ID
     * @param ShopId 店铺ID
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取总人数
     * @return TotalPerson 总人数
     */
    public Integer getTotalPerson() {
        return this.TotalPerson;
    }

    /**
     * 设置总人数
     * @param TotalPerson 总人数
     */
    public void setTotalPerson(Integer TotalPerson) {
        this.TotalPerson = TotalPerson;
    }

    /**
     * 获取总动迹数目
     * @return TotalTrajectory 总动迹数目
     */
    public Integer getTotalTrajectory() {
        return this.TotalTrajectory;
    }

    /**
     * 设置总动迹数目
     * @param TotalTrajectory 总动迹数目
     */
    public void setTotalTrajectory(Integer TotalTrajectory) {
        this.TotalTrajectory = TotalTrajectory;
    }

    /**
     * 获取返回动迹中的总人数
     * @return Person 返回动迹中的总人数
     */
    public Integer getPerson() {
        return this.Person;
    }

    /**
     * 设置返回动迹中的总人数
     * @param Person 返回动迹中的总人数
     */
    public void setPerson(Integer Person) {
        this.Person = Person;
    }

    /**
     * 获取返回动迹的数目
     * @return Trajectory 返回动迹的数目
     */
    public Integer getTrajectory() {
        return this.Trajectory;
    }

    /**
     * 设置返回动迹的数目
     * @param Trajectory 返回动迹的数目
     */
    public void setTrajectory(Integer Trajectory) {
        this.Trajectory = Trajectory;
    }

    /**
     * 获取返回动迹的具体信息
     * @return Data 返回动迹的具体信息
     */
    public TrajectorySunData [] getData() {
        return this.Data;
    }

    /**
     * 设置返回动迹的具体信息
     * @param Data 返回动迹的具体信息
     */
    public void setData(TrajectorySunData [] Data) {
        this.Data = Data;
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
        this.setParamSimple(map, prefix + "TotalPerson", this.TotalPerson);
        this.setParamSimple(map, prefix + "TotalTrajectory", this.TotalTrajectory);
        this.setParamSimple(map, prefix + "Person", this.Person);
        this.setParamSimple(map, prefix + "Trajectory", this.Trajectory);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

