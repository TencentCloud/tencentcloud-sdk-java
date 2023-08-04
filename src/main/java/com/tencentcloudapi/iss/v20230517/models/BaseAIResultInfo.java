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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseAIResultInfo extends AbstractModel{

    /**
    * 名称。返回值有人体识别结果名称(person)、宠物识别结果名称(cat和dog) 、车辆车牌识别结果名称(vehicle)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 置信度
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 截图中坐标信息
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
     * Get 名称。返回值有人体识别结果名称(person)、宠物识别结果名称(cat和dog) 、车辆车牌识别结果名称(vehicle) 
     * @return Name 名称。返回值有人体识别结果名称(person)、宠物识别结果名称(cat和dog) 、车辆车牌识别结果名称(vehicle)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称。返回值有人体识别结果名称(person)、宠物识别结果名称(cat和dog) 、车辆车牌识别结果名称(vehicle)
     * @param Name 名称。返回值有人体识别结果名称(person)、宠物识别结果名称(cat和dog) 、车辆车牌识别结果名称(vehicle)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 置信度 
     * @return Score 置信度
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 置信度
     * @param Score 置信度
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 截图中坐标信息 
     * @return Location 截图中坐标信息
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 截图中坐标信息
     * @param Location 截图中坐标信息
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public BaseAIResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseAIResultInfo(BaseAIResultInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

