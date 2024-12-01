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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BloodPressureItem extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目原文
    */
    @SerializedName("Item")
    @Expose
    private PhysicalBaseItem Item;

    /**
    * 数值
    */
    @SerializedName("Result")
    @Expose
    private PhysicalBaseItem Result;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private PhysicalBaseItem Unit;

    /**
    * 第几次
    */
    @SerializedName("Times")
    @Expose
    private PhysicalBaseItem Times;

    /**
    * 左右手臂
    */
    @SerializedName("Location")
    @Expose
    private PhysicalBaseItem Location;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 类型 
     * @return Name 类型
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类型
     * @param Name 类型
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目原文 
     * @return Item 项目原文
     */
    public PhysicalBaseItem getItem() {
        return this.Item;
    }

    /**
     * Set 项目原文
     * @param Item 项目原文
     */
    public void setItem(PhysicalBaseItem Item) {
        this.Item = Item;
    }

    /**
     * Get 数值 
     * @return Result 数值
     */
    public PhysicalBaseItem getResult() {
        return this.Result;
    }

    /**
     * Set 数值
     * @param Result 数值
     */
    public void setResult(PhysicalBaseItem Result) {
        this.Result = Result;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public PhysicalBaseItem getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(PhysicalBaseItem Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 第几次 
     * @return Times 第几次
     */
    public PhysicalBaseItem getTimes() {
        return this.Times;
    }

    /**
     * Set 第几次
     * @param Times 第几次
     */
    public void setTimes(PhysicalBaseItem Times) {
        this.Times = Times;
    }

    /**
     * Get 左右手臂 
     * @return Location 左右手臂
     */
    public PhysicalBaseItem getLocation() {
        return this.Location;
    }

    /**
     * Set 左右手臂
     * @param Location 左右手臂
     */
    public void setLocation(PhysicalBaseItem Location) {
        this.Location = Location;
    }

    /**
     * Get 数据在原PDF文件中的第几页 
     * @return Page 数据在原PDF文件中的第几页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 数据在原PDF文件中的第几页
     * @param Page 数据在原PDF文件中的第几页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public BloodPressureItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BloodPressureItem(BloodPressureItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Item != null) {
            this.Item = new PhysicalBaseItem(source.Item);
        }
        if (source.Result != null) {
            this.Result = new PhysicalBaseItem(source.Result);
        }
        if (source.Unit != null) {
            this.Unit = new PhysicalBaseItem(source.Unit);
        }
        if (source.Times != null) {
            this.Times = new PhysicalBaseItem(source.Times);
        }
        if (source.Location != null) {
            this.Location = new PhysicalBaseItem(source.Location);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamObj(map, prefix + "Unit.", this.Unit);
        this.setParamObj(map, prefix + "Times.", this.Times);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

