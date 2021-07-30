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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SDKLogItem extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 日志等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 日志时间
    */
    @SerializedName("DateTime")
    @Expose
    private String DateTime;

    /**
    * 日志内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 日志等级 
     * @return Level 日志等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 日志等级
     * @param Level 日志等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 日志时间 
     * @return DateTime 日志时间
     */
    public String getDateTime() {
        return this.DateTime;
    }

    /**
     * Set 日志时间
     * @param DateTime 日志时间
     */
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    /**
     * Get 日志内容 
     * @return Content 日志内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 日志内容
     * @param Content 日志内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public SDKLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SDKLogItem(SDKLogItem source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.DateTime != null) {
            this.DateTime = new String(source.DateTime);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "DateTime", this.DateTime);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

