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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserPortraitResponse extends AbstractModel{

    /**
    * 年龄画像
    */
    @SerializedName("Age")
    @Expose
    private AgePortraitInfo Age;

    /**
    * 性别画像
    */
    @SerializedName("Gender")
    @Expose
    private GenderPortraitInfo Gender;

    /**
    * 省份画像
    */
    @SerializedName("Province")
    @Expose
    private ProvincePortraitInfo Province;

    /**
    * 电影喜好画像
    */
    @SerializedName("Movie")
    @Expose
    private MoviePortraitInfo Movie;

    /**
    * 明星喜好画像
    */
    @SerializedName("Star")
    @Expose
    private StarPortraitInfo Star;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 年龄画像 
     * @return Age 年龄画像
     */
    public AgePortraitInfo getAge() {
        return this.Age;
    }

    /**
     * Set 年龄画像
     * @param Age 年龄画像
     */
    public void setAge(AgePortraitInfo Age) {
        this.Age = Age;
    }

    /**
     * Get 性别画像 
     * @return Gender 性别画像
     */
    public GenderPortraitInfo getGender() {
        return this.Gender;
    }

    /**
     * Set 性别画像
     * @param Gender 性别画像
     */
    public void setGender(GenderPortraitInfo Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 省份画像 
     * @return Province 省份画像
     */
    public ProvincePortraitInfo getProvince() {
        return this.Province;
    }

    /**
     * Set 省份画像
     * @param Province 省份画像
     */
    public void setProvince(ProvincePortraitInfo Province) {
        this.Province = Province;
    }

    /**
     * Get 电影喜好画像 
     * @return Movie 电影喜好画像
     */
    public MoviePortraitInfo getMovie() {
        return this.Movie;
    }

    /**
     * Set 电影喜好画像
     * @param Movie 电影喜好画像
     */
    public void setMovie(MoviePortraitInfo Movie) {
        this.Movie = Movie;
    }

    /**
     * Get 明星喜好画像 
     * @return Star 明星喜好画像
     */
    public StarPortraitInfo getStar() {
        return this.Star;
    }

    /**
     * Set 明星喜好画像
     * @param Star 明星喜好画像
     */
    public void setStar(StarPortraitInfo Star) {
        this.Star = Star;
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
        this.setParamObj(map, prefix + "Age.", this.Age);
        this.setParamObj(map, prefix + "Gender.", this.Gender);
        this.setParamObj(map, prefix + "Province.", this.Province);
        this.setParamObj(map, prefix + "Movie.", this.Movie);
        this.setParamObj(map, prefix + "Star.", this.Star);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

