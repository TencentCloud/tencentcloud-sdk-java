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

public class DescribeDataStaticProjectRequest extends AbstractModel {

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>allcount：性能视图，day：14天数据，condition：条件列表，area：请求速度分布，nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：网络平台视图/Version视图/设备视图/ISP视图/地区视图/浏览器视图/ext1视图等等</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>自定义2</p>
    */
    @SerializedName("ExtSecond")
    @Expose
    private String ExtSecond;

    /**
    * <p>浏览器引擎</p>
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>运营商</p>
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * <p>来源页面</p>
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * <p>日志等级（1表示白名单日志，2表示一般日志，4表示错误日志，8表示Promise 错误，16表示Ajax 请求异常，32表示JS 加载异常，64表示图片加载异常，128表示css 加载异常，256表示console.error，512表示音视频资源异常，1024表示retcode 异常，2048表示aegis report，4096表示PV日志，8192表示自定义事件，16384表示小程序 页面不存在，32768表示websocket错误，65536表示js bridge错误）</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>品牌</p>
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * <p>地区</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>版本</p>
    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * <p>平台</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>自定义3</p>
    */
    @SerializedName("ExtThird")
    @Expose
    private String ExtThird;

    /**
    * <p>自定义1</p>
    */
    @SerializedName("ExtFirst")
    @Expose
    private String ExtFirst;

    /**
    * <p>网络类型（1,2,3,4,5,100），1表示WIFI, 2表示2G, 3表示3G, 4表示4G, 5表示5G, 6表示6G, 100表示未知。</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>机型</p>
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * <p>显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。</p>
    */
    @SerializedName("IsAbroad")
    @Expose
    private String IsAbroad;

    /**
    * <p>操作系统</p>
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * <p>浏览器</p>
    */
    @SerializedName("Browser")
    @Expose
    private String Browser;

    /**
    * <p>耗时口径：&quot;50&quot;/&quot;75&quot;/&quot;90&quot;/&quot;95&quot;/&quot;99&quot;/&quot;99.5&quot; 分别表示 TP50/TP75/TP90/TP95/TP99/TP99.5（percentile2）；&quot;avg&quot; 表示均值（avg）。</p>
    */
    @SerializedName("CostType")
    @Expose
    private String CostType;

    /**
    * <p>来源</p>
    */
    @SerializedName("Url")
    @Expose
    private String [] Url;

    /**
    * <p>环境</p>
    */
    @SerializedName("Env")
    @Expose
    private String Env;

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>allcount：性能视图，day：14天数据，condition：条件列表，area：请求速度分布，nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：网络平台视图/Version视图/设备视图/ISP视图/地区视图/浏览器视图/ext1视图等等</p> 
     * @return Type <p>allcount：性能视图，day：14天数据，condition：条件列表，area：请求速度分布，nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：网络平台视图/Version视图/设备视图/ISP视图/地区视图/浏览器视图/ext1视图等等</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>allcount：性能视图，day：14天数据，condition：条件列表，area：请求速度分布，nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：网络平台视图/Version视图/设备视图/ISP视图/地区视图/浏览器视图/ext1视图等等</p>
     * @param Type <p>allcount：性能视图，day：14天数据，condition：条件列表，area：请求速度分布，nettype/version/platform/isp/region/device/browser/ext1/ext2/ext3/ret/status/from/url/env/：网络平台视图/Version视图/设备视图/ISP视图/地区视图/浏览器视图/ext1视图等等</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ID <p>项目ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>项目ID</p>
     * @param ID <p>项目ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>自定义2</p> 
     * @return ExtSecond <p>自定义2</p>
     */
    public String getExtSecond() {
        return this.ExtSecond;
    }

    /**
     * Set <p>自定义2</p>
     * @param ExtSecond <p>自定义2</p>
     */
    public void setExtSecond(String ExtSecond) {
        this.ExtSecond = ExtSecond;
    }

    /**
     * Get <p>浏览器引擎</p> 
     * @return Engine <p>浏览器引擎</p>
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>浏览器引擎</p>
     * @param Engine <p>浏览器引擎</p>
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>运营商</p> 
     * @return Isp <p>运营商</p>
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set <p>运营商</p>
     * @param Isp <p>运营商</p>
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get <p>来源页面</p> 
     * @return From <p>来源页面</p>
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set <p>来源页面</p>
     * @param From <p>来源页面</p>
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get <p>日志等级（1表示白名单日志，2表示一般日志，4表示错误日志，8表示Promise 错误，16表示Ajax 请求异常，32表示JS 加载异常，64表示图片加载异常，128表示css 加载异常，256表示console.error，512表示音视频资源异常，1024表示retcode 异常，2048表示aegis report，4096表示PV日志，8192表示自定义事件，16384表示小程序 页面不存在，32768表示websocket错误，65536表示js bridge错误）</p> 
     * @return Level <p>日志等级（1表示白名单日志，2表示一般日志，4表示错误日志，8表示Promise 错误，16表示Ajax 请求异常，32表示JS 加载异常，64表示图片加载异常，128表示css 加载异常，256表示console.error，512表示音视频资源异常，1024表示retcode 异常，2048表示aegis report，4096表示PV日志，8192表示自定义事件，16384表示小程序 页面不存在，32768表示websocket错误，65536表示js bridge错误）</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>日志等级（1表示白名单日志，2表示一般日志，4表示错误日志，8表示Promise 错误，16表示Ajax 请求异常，32表示JS 加载异常，64表示图片加载异常，128表示css 加载异常，256表示console.error，512表示音视频资源异常，1024表示retcode 异常，2048表示aegis report，4096表示PV日志，8192表示自定义事件，16384表示小程序 页面不存在，32768表示websocket错误，65536表示js bridge错误）</p>
     * @param Level <p>日志等级（1表示白名单日志，2表示一般日志，4表示错误日志，8表示Promise 错误，16表示Ajax 请求异常，32表示JS 加载异常，64表示图片加载异常，128表示css 加载异常，256表示console.error，512表示音视频资源异常，1024表示retcode 异常，2048表示aegis report，4096表示PV日志，8192表示自定义事件，16384表示小程序 页面不存在，32768表示websocket错误，65536表示js bridge错误）</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>品牌</p> 
     * @return Brand <p>品牌</p>
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set <p>品牌</p>
     * @param Brand <p>品牌</p>
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get <p>地区</p> 
     * @return Area <p>地区</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>地区</p>
     * @param Area <p>地区</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>版本</p> 
     * @return VersionNum <p>版本</p>
     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set <p>版本</p>
     * @param VersionNum <p>版本</p>
     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get <p>平台</p> 
     * @return Platform <p>平台</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>平台</p>
     * @param Platform <p>平台</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>自定义3</p> 
     * @return ExtThird <p>自定义3</p>
     */
    public String getExtThird() {
        return this.ExtThird;
    }

    /**
     * Set <p>自定义3</p>
     * @param ExtThird <p>自定义3</p>
     */
    public void setExtThird(String ExtThird) {
        this.ExtThird = ExtThird;
    }

    /**
     * Get <p>自定义1</p> 
     * @return ExtFirst <p>自定义1</p>
     */
    public String getExtFirst() {
        return this.ExtFirst;
    }

    /**
     * Set <p>自定义1</p>
     * @param ExtFirst <p>自定义1</p>
     */
    public void setExtFirst(String ExtFirst) {
        this.ExtFirst = ExtFirst;
    }

    /**
     * Get <p>网络类型（1,2,3,4,5,100），1表示WIFI, 2表示2G, 3表示3G, 4表示4G, 5表示5G, 6表示6G, 100表示未知。</p> 
     * @return NetType <p>网络类型（1,2,3,4,5,100），1表示WIFI, 2表示2G, 3表示3G, 4表示4G, 5表示5G, 6表示6G, 100表示未知。</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型（1,2,3,4,5,100），1表示WIFI, 2表示2G, 3表示3G, 4表示4G, 5表示5G, 6表示6G, 100表示未知。</p>
     * @param NetType <p>网络类型（1,2,3,4,5,100），1表示WIFI, 2表示2G, 3表示3G, 4表示4G, 5表示5G, 6表示6G, 100表示未知。</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>机型</p> 
     * @return Device <p>机型</p>
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set <p>机型</p>
     * @param Device <p>机型</p>
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get <p>显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。</p> 
     * @return IsAbroad <p>显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。</p>
     */
    public String getIsAbroad() {
        return this.IsAbroad;
    }

    /**
     * Set <p>显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。</p>
     * @param IsAbroad <p>显示是否海外,1表示海外，0表示非海外；默认值为空，查询所有。</p>
     */
    public void setIsAbroad(String IsAbroad) {
        this.IsAbroad = IsAbroad;
    }

    /**
     * Get <p>操作系统</p> 
     * @return Os <p>操作系统</p>
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set <p>操作系统</p>
     * @param Os <p>操作系统</p>
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get <p>浏览器</p> 
     * @return Browser <p>浏览器</p>
     */
    public String getBrowser() {
        return this.Browser;
    }

    /**
     * Set <p>浏览器</p>
     * @param Browser <p>浏览器</p>
     */
    public void setBrowser(String Browser) {
        this.Browser = Browser;
    }

    /**
     * Get <p>耗时口径：&quot;50&quot;/&quot;75&quot;/&quot;90&quot;/&quot;95&quot;/&quot;99&quot;/&quot;99.5&quot; 分别表示 TP50/TP75/TP90/TP95/TP99/TP99.5（percentile2）；&quot;avg&quot; 表示均值（avg）。</p> 
     * @return CostType <p>耗时口径：&quot;50&quot;/&quot;75&quot;/&quot;90&quot;/&quot;95&quot;/&quot;99&quot;/&quot;99.5&quot; 分别表示 TP50/TP75/TP90/TP95/TP99/TP99.5（percentile2）；&quot;avg&quot; 表示均值（avg）。</p>
     */
    public String getCostType() {
        return this.CostType;
    }

    /**
     * Set <p>耗时口径：&quot;50&quot;/&quot;75&quot;/&quot;90&quot;/&quot;95&quot;/&quot;99&quot;/&quot;99.5&quot; 分别表示 TP50/TP75/TP90/TP95/TP99/TP99.5（percentile2）；&quot;avg&quot; 表示均值（avg）。</p>
     * @param CostType <p>耗时口径：&quot;50&quot;/&quot;75&quot;/&quot;90&quot;/&quot;95&quot;/&quot;99&quot;/&quot;99.5&quot; 分别表示 TP50/TP75/TP90/TP95/TP99/TP99.5（percentile2）；&quot;avg&quot; 表示均值（avg）。</p>
     */
    public void setCostType(String CostType) {
        this.CostType = CostType;
    }

    /**
     * Get <p>来源</p> 
     * @return Url <p>来源</p>
     */
    public String [] getUrl() {
        return this.Url;
    }

    /**
     * Set <p>来源</p>
     * @param Url <p>来源</p>
     */
    public void setUrl(String [] Url) {
        this.Url = Url;
    }

    /**
     * Get <p>环境</p> 
     * @return Env <p>环境</p>
     */
    public String getEnv() {
        return this.Env;
    }

    /**
     * Set <p>环境</p>
     * @param Env <p>环境</p>
     */
    public void setEnv(String Env) {
        this.Env = Env;
    }

    public DescribeDataStaticProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataStaticProjectRequest(DescribeDataStaticProjectRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.ExtSecond != null) {
            this.ExtSecond = new String(source.ExtSecond);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.VersionNum != null) {
            this.VersionNum = new String(source.VersionNum);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ExtThird != null) {
            this.ExtThird = new String(source.ExtThird);
        }
        if (source.ExtFirst != null) {
            this.ExtFirst = new String(source.ExtFirst);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.Device != null) {
            this.Device = new String(source.Device);
        }
        if (source.IsAbroad != null) {
            this.IsAbroad = new String(source.IsAbroad);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.Browser != null) {
            this.Browser = new String(source.Browser);
        }
        if (source.CostType != null) {
            this.CostType = new String(source.CostType);
        }
        if (source.Url != null) {
            this.Url = new String[source.Url.length];
            for (int i = 0; i < source.Url.length; i++) {
                this.Url[i] = new String(source.Url[i]);
            }
        }
        if (source.Env != null) {
            this.Env = new String(source.Env);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ExtSecond", this.ExtSecond);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ExtThird", this.ExtThird);
        this.setParamSimple(map, prefix + "ExtFirst", this.ExtFirst);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "IsAbroad", this.IsAbroad);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "Browser", this.Browser);
        this.setParamSimple(map, prefix + "CostType", this.CostType);
        this.setParamArraySimple(map, prefix + "Url.", this.Url);
        this.setParamSimple(map, prefix + "Env", this.Env);

    }
}

