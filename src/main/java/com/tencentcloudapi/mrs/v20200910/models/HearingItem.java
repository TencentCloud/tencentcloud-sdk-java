/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class HearingItem extends AbstractModel {

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
    * 方位
    */
    @SerializedName("Location")
    @Expose
    private PhysicalBaseItem Location;

    /**
    * 描述
    */
    @SerializedName("Result")
    @Expose
    private PhysicalBaseItem Result;

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
     * Get 方位 
     * @return Location 方位
     */
    public PhysicalBaseItem getLocation() {
        return this.Location;
    }

    /**
     * Set 方位
     * @param Location 方位
     */
    public void setLocation(PhysicalBaseItem Location) {
        this.Location = Location;
    }

    /**
     * Get 描述 
     * @return Result 描述
     */
    public PhysicalBaseItem getResult() {
        return this.Result;
    }

    /**
     * Set 描述
     * @param Result 描述
     */
    public void setResult(PhysicalBaseItem Result) {
        this.Result = Result;
    }

    public HearingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HearingItem(HearingItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Item != null) {
            this.Item = new PhysicalBaseItem(source.Item);
        }
        if (source.Location != null) {
            this.Location = new PhysicalBaseItem(source.Location);
        }
        if (source.Result != null) {
            this.Result = new PhysicalBaseItem(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamObj(map, prefix + "Result.", this.Result);

    }
}

