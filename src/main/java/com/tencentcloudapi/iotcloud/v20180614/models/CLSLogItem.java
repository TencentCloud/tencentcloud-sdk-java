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
package com.tencentcloudapi.iotcloud.v20180614.models;

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
    @SerializedName("Devicename")
    @Expose
    private String Devicename;

    /**
    * 产品ID
    */
    @SerializedName("Productid")
    @Expose
    private String Productid;

    /**
    * 请求ID
    */
    @SerializedName("Requestid")
    @Expose
    private String Requestid;

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
     * @return Devicename 设备名称
     */
    public String getDevicename() {
        return this.Devicename;
    }

    /**
     * Set 设备名称
     * @param Devicename 设备名称
     */
    public void setDevicename(String Devicename) {
        this.Devicename = Devicename;
    }

    /**
     * Get 产品ID 
     * @return Productid 产品ID
     */
    public String getProductid() {
        return this.Productid;
    }

    /**
     * Set 产品ID
     * @param Productid 产品ID
     */
    public void setProductid(String Productid) {
        this.Productid = Productid;
    }

    /**
     * Get 请求ID 
     * @return Requestid 请求ID
     */
    public String getRequestid() {
        return this.Requestid;
    }

    /**
     * Set 请求ID
     * @param Requestid 请求ID
     */
    public void setRequestid(String Requestid) {
        this.Requestid = Requestid;
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
        if (source.Devicename != null) {
            this.Devicename = new String(source.Devicename);
        }
        if (source.Productid != null) {
            this.Productid = new String(source.Productid);
        }
        if (source.Requestid != null) {
            this.Requestid = new String(source.Requestid);
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
        this.setParamSimple(map, prefix + "Devicename", this.Devicename);
        this.setParamSimple(map, prefix + "Productid", this.Productid);
        this.setParamSimple(map, prefix + "Requestid", this.Requestid);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Userid", this.Userid);

    }
}

