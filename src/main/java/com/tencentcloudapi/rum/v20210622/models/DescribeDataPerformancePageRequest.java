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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataPerformancePageRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * pagepv：pv视图，allcount：性能视图，falls：页面加载瀑布图，samp：首屏时间，day：14天数据，nettype：网络/平台视图，performance：页面性能TOP视图，version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：ISP视图/地区视图/浏览器视图等
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 日志等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 运营商
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 地区
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 网络类型
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 平台
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 机型
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * 版本
    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * 自定义1
    */
    @SerializedName("ExtFirst")
    @Expose
    private String ExtFirst;

    /**
    * 自定义2
    */
    @SerializedName("ExtSecond")
    @Expose
    private String ExtSecond;

    /**
    * 自定义3
    */
    @SerializedName("ExtThird")
    @Expose
    private String ExtThird;

    /**
    * 显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。
    */
    @SerializedName("IsAbroad")
    @Expose
    private String IsAbroad;

    /**
    * 浏览器
    */
    @SerializedName("Browser")
    @Expose
    private String Browser;

    /**
    * 操作系统
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * 浏览器引擎
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 品牌
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * 来源页面
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 耗时计算方式
    */
    @SerializedName("CostType")
    @Expose
    private String CostType;

    /**
    * 环境变量
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
    * 网络状态
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
    * 是否返回webvitals数据
    */
    @SerializedName("WebVitals")
    @Expose
    private Boolean WebVitals;

    /**
     * Get 项目ID 
     * @return ID 项目ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 项目ID
     * @param ID 项目ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get pagepv：pv视图，allcount：性能视图，falls：页面加载瀑布图，samp：首屏时间，day：14天数据，nettype：网络/平台视图，performance：页面性能TOP视图，version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：ISP视图/地区视图/浏览器视图等 
     * @return Type pagepv：pv视图，allcount：性能视图，falls：页面加载瀑布图，samp：首屏时间，day：14天数据，nettype：网络/平台视图，performance：页面性能TOP视图，version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：ISP视图/地区视图/浏览器视图等
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set pagepv：pv视图，allcount：性能视图，falls：页面加载瀑布图，samp：首屏时间，day：14天数据，nettype：网络/平台视图，performance：页面性能TOP视图，version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：ISP视图/地区视图/浏览器视图等
     * @param Type pagepv：pv视图，allcount：性能视图，falls：页面加载瀑布图，samp：首屏时间，day：14天数据，nettype：网络/平台视图，performance：页面性能TOP视图，version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：ISP视图/地区视图/浏览器视图等
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get 运营商 
     * @return Isp 运营商
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商
     * @param Isp 运营商
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 地区 
     * @return Area 地区
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地区
     * @param Area 地区
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 网络类型 
     * @return NetType 网络类型
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型
     * @param NetType 网络类型
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 平台 
     * @return Platform 平台
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台
     * @param Platform 平台
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 机型 
     * @return Device 机型
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set 机型
     * @param Device 机型
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get 版本 
     * @return VersionNum 版本
     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set 版本
     * @param VersionNum 版本
     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get 自定义1 
     * @return ExtFirst 自定义1
     */
    public String getExtFirst() {
        return this.ExtFirst;
    }

    /**
     * Set 自定义1
     * @param ExtFirst 自定义1
     */
    public void setExtFirst(String ExtFirst) {
        this.ExtFirst = ExtFirst;
    }

    /**
     * Get 自定义2 
     * @return ExtSecond 自定义2
     */
    public String getExtSecond() {
        return this.ExtSecond;
    }

    /**
     * Set 自定义2
     * @param ExtSecond 自定义2
     */
    public void setExtSecond(String ExtSecond) {
        this.ExtSecond = ExtSecond;
    }

    /**
     * Get 自定义3 
     * @return ExtThird 自定义3
     */
    public String getExtThird() {
        return this.ExtThird;
    }

    /**
     * Set 自定义3
     * @param ExtThird 自定义3
     */
    public void setExtThird(String ExtThird) {
        this.ExtThird = ExtThird;
    }

    /**
     * Get 显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。 
     * @return IsAbroad 显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。
     */
    public String getIsAbroad() {
        return this.IsAbroad;
    }

    /**
     * Set 显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。
     * @param IsAbroad 显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。
     */
    public void setIsAbroad(String IsAbroad) {
        this.IsAbroad = IsAbroad;
    }

    /**
     * Get 浏览器 
     * @return Browser 浏览器
     */
    public String getBrowser() {
        return this.Browser;
    }

    /**
     * Set 浏览器
     * @param Browser 浏览器
     */
    public void setBrowser(String Browser) {
        this.Browser = Browser;
    }

    /**
     * Get 操作系统 
     * @return Os 操作系统
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set 操作系统
     * @param Os 操作系统
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get 浏览器引擎 
     * @return Engine 浏览器引擎
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 浏览器引擎
     * @param Engine 浏览器引擎
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 品牌 
     * @return Brand 品牌
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set 品牌
     * @param Brand 品牌
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get 来源页面 
     * @return From 来源页面
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 来源页面
     * @param From 来源页面
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 耗时计算方式 
     * @return CostType 耗时计算方式
     */
    public String getCostType() {
        return this.CostType;
    }

    /**
     * Set 耗时计算方式
     * @param CostType 耗时计算方式
     */
    public void setCostType(String CostType) {
        this.CostType = CostType;
    }

    /**
     * Get 环境变量 
     * @return Env 环境变量
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set 环境变量
     * @param Env 环境变量
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    /**
     * Get 网络状态 
     * @return NetStatus 网络状态
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * Set 网络状态
     * @param NetStatus 网络状态
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * Get 是否返回webvitals数据 
     * @return WebVitals 是否返回webvitals数据
     */
    public Boolean getWebVitals() {
        return this.WebVitals;
    }

    /**
     * Set 是否返回webvitals数据
     * @param WebVitals 是否返回webvitals数据
     */
    public void setWebVitals(Boolean WebVitals) {
        this.WebVitals = WebVitals;
    }

    public DescribeDataPerformancePageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataPerformancePageRequest(DescribeDataPerformancePageRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Device != null) {
            this.Device = new String(source.Device);
        }
        if (source.VersionNum != null) {
            this.VersionNum = new String(source.VersionNum);
        }
        if (source.ExtFirst != null) {
            this.ExtFirst = new String(source.ExtFirst);
        }
        if (source.ExtSecond != null) {
            this.ExtSecond = new String(source.ExtSecond);
        }
        if (source.ExtThird != null) {
            this.ExtThird = new String(source.ExtThird);
        }
        if (source.IsAbroad != null) {
            this.IsAbroad = new String(source.IsAbroad);
        }
        if (source.Browser != null) {
            this.Browser = new String(source.Browser);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.CostType != null) {
            this.CostType = new String(source.CostType);
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
        if (source.NetStatus != null) {
            this.NetStatus = new String(source.NetStatus);
        }
        if (source.WebVitals != null) {
            this.WebVitals = new Boolean(source.WebVitals);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "ExtFirst", this.ExtFirst);
        this.setParamSimple(map, prefix + "ExtSecond", this.ExtSecond);
        this.setParamSimple(map, prefix + "ExtThird", this.ExtThird);
        this.setParamSimple(map, prefix + "IsAbroad", this.IsAbroad);
        this.setParamSimple(map, prefix + "Browser", this.Browser);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "CostType", this.CostType);
        this.setParamSimple(map, prefix + "Env", this.Env);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);
        this.setParamSimple(map, prefix + "WebVitals", this.WebVitals);

    }
}

