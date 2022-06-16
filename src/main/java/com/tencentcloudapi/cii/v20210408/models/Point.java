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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Point extends AbstractModel{

    /**
    * x坐标
    */
    @SerializedName("XCoordinate")
    @Expose
    private Long XCoordinate;

    /**
    * y坐标
    */
    @SerializedName("YCoordinate")
    @Expose
    private Long YCoordinate;

    /**
    * 页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get x坐标 
     * @return XCoordinate x坐标
     */
    public Long getXCoordinate() {
        return this.XCoordinate;
    }

    /**
     * Set x坐标
     * @param XCoordinate x坐标
     */
    public void setXCoordinate(Long XCoordinate) {
        this.XCoordinate = XCoordinate;
    }

    /**
     * Get y坐标 
     * @return YCoordinate y坐标
     */
    public Long getYCoordinate() {
        return this.YCoordinate;
    }

    /**
     * Set y坐标
     * @param YCoordinate y坐标
     */
    public void setYCoordinate(Long YCoordinate) {
        this.YCoordinate = YCoordinate;
    }

    /**
     * Get 页码 
     * @return Page 页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码
     * @param Page 页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public Point() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Point(Point source) {
        if (source.XCoordinate != null) {
            this.XCoordinate = new Long(source.XCoordinate);
        }
        if (source.YCoordinate != null) {
            this.YCoordinate = new Long(source.YCoordinate);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "XCoordinate", this.XCoordinate);
        this.setParamSimple(map, prefix + "YCoordinate", this.YCoordinate);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

