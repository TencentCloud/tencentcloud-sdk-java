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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLSLogItem extends AbstractModel{

    /**
    * 日志内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 请求ID
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 模块
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 日志时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 腾讯云账号
    */
    @SerializedName("Userid")
    @Expose
    private String Userid;

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
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 请求ID 
     * @return RequestId 请求ID
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 请求ID
     * @param RequestId 请求ID
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 结果 
     * @return Result 结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果
     * @param Result 结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 模块 
     * @return Scene 模块
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 模块
     * @param Scene 模块
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 日志时间 
     * @return Time 日志时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 日志时间
     * @param Time 日志时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 腾讯云账号 
     * @return Userid 腾讯云账号
     */
    public String getUserid() {
        return this.Userid;
    }

    /**
     * Set 腾讯云账号
     * @param Userid 腾讯云账号
     */
    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public CLSLogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLSLogItem(CLSLogItem source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Userid != null) {
            this.Userid = new String(source.Userid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Userid", this.Userid);

    }
}

